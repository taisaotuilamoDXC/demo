package com.demo.repository;

import com.demo.entity.user.UserEntity;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<UserEntity, Long>
{
}
