package com.example.oauth.service.impl;

import com.example.oauth.dao.XkMerchantDao;
import com.example.oauth.model.XkMerchant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;


@Service(value = "userService")
public class UserServiceImpl implements UserDetailsService {

	private static Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private XkMerchantDao sysUserDao;

	public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
		//判断用户名类型
		XkMerchant user = sysUserDao.findByLoginName(userId);


//		String userName="";
//		if(user!=null){
//			userName=user.getLoginName();
//			log.info("loginName========"+userName);
//		}
//		if(user == null){
//			user = sysUserDao.findByName(userId);
//			if(user!=null){
//				userName=user.getName();
//				log.info("name========"+userName);
//			}
//		}
//		if(user == null){
//			user = sysUserDao.findByEmail(userId);
//			if(user!=null){
//				userName=user.getEmail();
//				log.info("email========"+userName);
//			}
//		}
//		if(user == null){
//			user = sysUserDao.findByMobile(userId);
//			if(user!=null){
//				userName=user.getMobile();
//				log.info("mobile========"+userName);
//			}
//		}

		if(user == null){
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		log.info("loginName========"+user.getLoginName());
		return new org.springframework.security.core.userdetails.User(user.getLoginName(), user.getLoginPassword(), getAuthority());
	}

	private List<SimpleGrantedAuthority> getAuthority() {
		return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
	}



}
