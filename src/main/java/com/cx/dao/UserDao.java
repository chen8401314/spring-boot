package com.cx.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cx.domain.User;
import com.cx.domain.UserExample;
import com.cx.mapper.ExtUserMapper;
import com.cx.mapper.UserMapper;

@Repository
public class UserDao {
	
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private ExtUserMapper extUserMapper;
	
    
    public User getUserById(long id){
    	UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        List<User> list = userMapper.selectByExample(example);
        if(null != list && list.size() > 0){
        	return list.get(0);
        }
        return null;
    }
    public int saveUser(User user){
        return userMapper.insertSelective(user);
    }

    public User getExtUser(){
    	return extUserMapper.getExtUser(0);
    }
    
}
