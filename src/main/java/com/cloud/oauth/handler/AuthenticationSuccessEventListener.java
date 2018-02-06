package com.cloud.oauth.handler;

import com.cloud.oauth.dao.XkMerchantLogDao;
import com.cloud.oauth.model.XkMerchantlog;
import com.cloud.oauth.security.model.CustomUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.security.web.authentication.WebAuthenticationDetails;

import java.sql.Timestamp;

//@Component
public class AuthenticationSuccessEventListener implements ApplicationListener<AuthenticationSuccessEvent> {

    private static Logger log = LoggerFactory.getLogger(AuthenticationSuccessEventListener.class);

    @Autowired
    private XkMerchantLogDao xkMerchantLogDao;
    @Override
    public void onApplicationEvent(AuthenticationSuccessEvent event) {
        WebAuthenticationDetails auth = (WebAuthenticationDetails) event.getAuthentication().getDetails();

        log.info("客户端ip=========>"+auth.getRemoteAddress());
//        Instant.now().
//        AuthenticationSuccessEvent;
//        WebAuthenticationDetails

        CustomUser user=(CustomUser)(event.getAuthentication().getPrincipal());
        Long userId=Long.parseLong(user.getUserId());
        XkMerchantlog xkMerchantlog=new XkMerchantlog();
        xkMerchantlog.setLoginName(user.getUsername());
        xkMerchantlog.setMerchantId(userId);
        xkMerchantlog.setLogType(1L);
        xkMerchantlog.setLogDetail("会员登录");
        xkMerchantlog.setLogDates(new Timestamp(System.currentTimeMillis()));
        xkMerchantlog.setResult(1L);
        xkMerchantlog.setLogIpAddress(auth.getRemoteAddress());
        xkMerchantLogDao.save(xkMerchantlog);
    }
}
