package com.lion.tain.controller;

import com.lion.tain.dto.UserQueryParam;
import com.lion.tain.entity.User;
import com.lion.tain.mapper.UserMapper;
import com.lion.tain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author lion
 * @since 2020-04-08
 */
@RestController
// @Api(tags = "OmsOrderController", description = "订单管理")
@RequestMapping("/prod")
public class ProdController extends BaseController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private UserService userService;

    @Resource
    private UserMapper userMapper;


    @RequestMapping("/index")
    public String index() {
        return "prod";
    }

    @GetMapping("/greeting")
    public List<User> greeting(@RequestParam(value = "name", defaultValue = "World") String name) {

        // List<User> userList = userMapper.selectList(null);
        List<User> userList = userService.list(new UserQueryParam());
        // Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
        return userList;
        //return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}

