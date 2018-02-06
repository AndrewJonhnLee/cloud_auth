package com.cloud.oauth.handler;

import com.cloud.oauth.dao.XkMerchantLogDao;
import com.cloud.oauth.model.XkMerchantlog;
import com.cloud.oauth.security.model.CustomUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Timestamp;

@Component
public class LoginSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {
    private static Logger log = LoggerFactory.getLogger(LoginSuccessHandler.class);

    @Autowired
    private XkMerchantLogDao xkMerchantLogDao;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {

        log.info("客户端ip=========>"+request.getRemoteAddr());
//        Instant.now().
//        AuthenticationSuccessEvent;
//        WebAuthenticationDetails

        CustomUser user=(CustomUser)(authentication.getPrincipal());
        Long userId=Long.parseLong(user.getUserId());
        XkMerchantlog xkMerchantlog=new XkMerchantlog();
        xkMerchantlog.setLoginName(user.getUsername());
        xkMerchantlog.setMerchantId(userId);
        xkMerchantlog.setLogType(1L);
        xkMerchantlog.setLogDetail("会员登录");
        xkMerchantlog.setLogDates(new Timestamp(System.currentTimeMillis()));
        xkMerchantlog.setResult(1L);
        xkMerchantlog.setLogIpAddress(request.getRemoteAddr());
        xkMerchantLogDao.save(xkMerchantlog);


    }
}
