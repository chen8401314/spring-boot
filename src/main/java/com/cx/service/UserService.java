package com.cx.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cx.copier.UserCopier;
import com.cx.dao.UserDao;
import com.cx.domain.User;
import com.cx.mapper.ExtUserMapper;
import com.cx.response.UserResponse;
import com.cx.web.Response;

@Service
public class UserService {

	private static final Logger log = LoggerFactory.getLogger(UserService.class);
	@Autowired
	private ExtUserMapper extUserMapper;
	@Autowired
	private UserDao userDao;
	
	
	/**
	 * @param uid
	 * @return
	 */
	public Response getUser(long uid){
	    User  user =	userDao.getUserById(uid);
	    UserResponse response = UserCopier.INSTANCE.asUserDto(user);
		return Response.success(response);
	}
	
}
