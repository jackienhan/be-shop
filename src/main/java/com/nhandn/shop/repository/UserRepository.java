package com.nhandn.shop.repository;

import com.nhandn.shop.model.User;

import java.util.List;

public interface UserRepository extends AbstractRepository<User, Long>{
    @Override
    List<User> findAll();
}
