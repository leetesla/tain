package com.lion.tain.service;

import com.lion.tain.dto.UserQueryParam;
import com.lion.tain.entity.User;

import java.util.List;

public interface UserService {
  List<User> list(UserQueryParam queryParam);
}
