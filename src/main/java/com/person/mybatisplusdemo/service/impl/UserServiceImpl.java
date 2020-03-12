package com.person.mybatisplusdemo.service.impl;

import com.person.mybatisplusdemo.entity.User;
import com.person.mybatisplusdemo.dao.UserMapper;
import com.person.mybatisplusdemo.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhoujiehao
 * @since 2020-03-12
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
