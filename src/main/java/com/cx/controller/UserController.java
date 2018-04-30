package com.cx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cx.request.GetUserRequest;
import com.cx.response.UserResponse;
import com.cx.service.UserService;
import com.cx.web.Response;

@RestController
@Transactional
@RequestMapping("/user")
public class UserController extends BaseController {

	@Autowired
	private UserService userService;
	
	/**
	 * 情绪列表接口
	 * @param request
	 * @return
	 */
	@ResponseBody
    @RequestMapping(value = "getUser")
	public Response<UserResponse> getUser(GetUserRequest request){
		return userService.getUser(request.getId());
	}
	
}
