package com.cz.demo.service.imp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cz.demo.IDao.UserMapper;
import com.cz.demo.domain.User;
import com.cz.demo.service.IUserService;
@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private UserMapper userMapper;
	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userMapper.selectByPrimaryKey(userId);
	}

}
