package com.lion.tain.service.impl;

import com.lion.tain.dto.UserQueryParam;
import com.lion.tain.entity.User;
import com.lion.tain.mapper.UserMapper;
import com.lion.tain.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
  @Resource
  private UserMapper userMapper;

  @Override
  public List<User> list(UserQueryParam queryParam) {
    List<User> userList = userMapper.selectList(null);
    // userList.forEach(System.out::println);
    return userList;
  }
}
