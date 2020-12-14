package com.nhandn.shop.service.impl;

import com.nhandn.shop.dto.UserDTO;
import com.nhandn.shop.mapper.UserMapper;
import com.nhandn.shop.model.User;
import com.nhandn.shop.repository.UserRepository;
import com.nhandn.shop.service.UserService;

public class UserServiceImpl extends AbstractServiceImpl<UserRepository, UserMapper, UserDTO, User>
        implements UserService {

}
