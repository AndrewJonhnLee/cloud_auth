package com.cloud.oauth.handler;

import com.cloud.oauth.dao.XkMerchantLogDao;
import com.cloud.oauth.model.XkMerchant;
import com.cloud.oauth.model.XkMerchantlog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Timestamp;

@Component
public class CustomEventListener implements ApplicationListener<CustomAuthEvent> {
    private static Logger log = LoggerFactory.getLogger(CustomEventListener.class);

    @Autowired
    private XkMerchantLogDao xkMerchantLogDao;


    @Override
    public void onApplicationEvent(CustomAuthEvent event) {
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
        HttpServletResponse response = servletRequestAttributes.getResponse();

        log.info("客户端ip=========>"+request.getRemoteAddr());
//        Instant.now().
//        AuthenticationSuccessEvent;
//        WebAuthenticationDetails

        XkMerchant user=event.getUser();
        Long userId=user.getId();
        XkMerchantlog xkMerchantlog=new XkMerchantlog();
        xkMerchantlog.setLoginName(user.getLoginName());
        xkMerchantlog.setMerchantId(userId);
        xkMerchantlog.setLogType(1L);
        xkMerchantlog.setLogDetail("会员登录");
        xkMerchantlog.setLogDates(new Timestamp(System.currentTimeMillis()));
        xkMerchantlog.setResult(1L);
        xkMerchantlog.setLogIpAddress(request.getRemoteAddr());
        xkMerchantLogDao.save(xkMerchantlog);

    }

    private String getClientIP(HttpServletRequest request) {
        String xfHeader = request.getHeader("X-Forwarded-For");
        if (xfHeader == null){
            return request.getRemoteAddr();
        }
        return xfHeader.split(",")[0];
    }
}
