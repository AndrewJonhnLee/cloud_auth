/**
 * Copyright &copy; 2017-2020 feima</a> All rights reserved.
 */
package com.cloud.oauth.encode;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * 系统管理，安全相关实体的管理类,包括用户、角色、菜单.
 * @author ThinkGem
 * @version 2013-12-05
 */
public class CustomPasswordEncoder implements PasswordEncoder{
	public final String HASH_ALGORITHM = "SHA-1";
	public final int HASH_INTERATIONS = 1024;
	public final int SALT_SIZE = 8;
	/**
	 * 生成安全的密码，生成随机的16位salt并经过1024次 sha-1 hash
	 */
	private String entryptPassword(String plainPassword) {
		String plain = Encodes.unescapeHtml(plainPassword);
		byte[] salt = Digests.generateSalt(SALT_SIZE);
		byte[] hashPassword = Digests.sha1(plain.getBytes(), salt, HASH_INTERATIONS);
		return Encodes.encodeHex(salt)+Encodes.encodeHex(hashPassword);
	}
	
	/**
	 * 验证密码
	 * @param plainPassword 明文密码
	 * @param password 密文密码
	 * @return 验证成功返回true
	 */
	private boolean validatePassword(String plainPassword, String password) {
		String plain = Encodes.unescapeHtml(plainPassword);
		byte[] salt = Encodes.decodeHex(password.substring(0,16));
		byte[] hashPassword = Digests.sha1(plain.getBytes(), salt, HASH_INTERATIONS);	//202cb962ac59075b964b07152d234b70
		return password.equals(Encodes.encodeHex(salt)+Encodes.encodeHex(hashPassword));//202cb962ac59075bcfe460503e1b1504ff17bda950ff83015568dc8d
	}

	@Override
	public String encode(CharSequence rawPassword) {
		return entryptPassword(rawPassword.toString());
	}

	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		return validatePassword(rawPassword.toString(), encodedPassword);
	}


//	public static void main(String args[]){
//
//		CustomPasswordEncoder encoder=new CustomPasswordEncoder();
//
//		boolean match=encoder.validatePassword("668866","114cdfbe6fb411090b0488899b37236f35cfedaac5256cc9cc9a3f7b");
//
//		System.out.println(match);
//	}
}
