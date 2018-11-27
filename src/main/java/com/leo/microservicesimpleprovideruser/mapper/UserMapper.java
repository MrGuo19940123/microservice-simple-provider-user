package com.leo.microservicesimpleprovideruser.mapper;

import com.leo.microservicesimpleprovideruser.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    User findById();//Long id
}
