package com.cx.service;

import com.cx.copier.UserCopier;
import com.cx.dao.UserDao;
import com.cx.domain.User;
import com.cx.request.SaveUserRequest;
import com.cx.response.UserDTO;
import com.cx.web.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	private static final Logger log = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private UserDao userDao;
	
	
	/**
	 * @param uid
	 * @return
	 */
	public Response getUser(long uid){
	    User  user =	userDao.getUserById(uid);
	    UserDTO response = UserCopier.INSTANCE.map(user);
		return Response.success(response);
	}

	public Response saveUser(SaveUserRequest saveUserRequest){
		User user = UserCopier.INSTANCE.map(saveUserRequest);
     	 userDao.saveUser(user);
		return Response.success();
	}
}
