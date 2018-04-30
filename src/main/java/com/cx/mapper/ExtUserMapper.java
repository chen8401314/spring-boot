package com.cx.mapper;

import org.apache.ibatis.annotations.Param;

import com.cx.domain.User;

public interface ExtUserMapper {

	public User getExtUser(@Param("uid")long uid);
	

}
