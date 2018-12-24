package com.leo.microservicesimpleprovideruser.mapper;

import com.leo.microservicesimpleprovideruser.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import javax.validation.Valid;

/**
  * @Company     一生温暖纯良 不舍爱与自由
  * @Author      郭志学
  * @Date        2018/11/28
  * @Version     1.0
  * @Description TODO 用户类数据传输层
  */
@Mapper
@Repository
public interface UserMapper {
    /**
     * 描述:根据用户Id获取用户信息<功能详细描述>
     * @Params [id]
     * @return User
     */
    User findById(Long id);

    /**
     * 添加一个用户
     * @param user
     * @return
     */
    int addUser(@Valid User user);
}
