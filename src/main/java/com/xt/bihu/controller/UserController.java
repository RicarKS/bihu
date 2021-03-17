package com.xt.bihu.controller;

import com.xt.bihu.DTO.ResultDTO;
import com.xt.bihu.entity.User;
import com.xt.bihu.enums.ErrorMessageEnum;
import com.xt.bihu.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public ResultDTO login(@RequestParam("account") String account, @RequestParam("password") String password) {
        if (StringUtils.isBlank(account)) {
            return ResultDTO.error(ErrorMessageEnum.USER_BLANK_ERROR);
        }
        if (StringUtils.isBlank(password)) {
            return ResultDTO.error(ErrorMessageEnum.PASSWORD_BLANK_ERROR);
        }
        User user = userService.login(account, password);
        return user == null ? ResultDTO.error(ErrorMessageEnum.USER_NAME_OR_PASSWORD_ERROR) : ResultDTO.successOf(user);
    }

    @PostMapping("/register")
    public ResultDTO registerUser(@RequestParam("user") User user){
        if (StringUtils.isBlank(user.getUserName())) {
            return ResultDTO.error(ErrorMessageEnum.USER_BLANK_ERROR);
        }
        if (StringUtils.isBlank(user.getUserPassword())) {
            return ResultDTO.error(ErrorMessageEnum.PASSWORD_BLANK_ERROR);
        }
        if (StringUtils.contains(user.getUserName(), "@")) {
            return ResultDTO.error(ErrorMessageEnum.USER_NAME_CONTAINS_ILLEGAL_CHARACTERS_ERROR);
        }
        User newUser = userService.registerUser(user);
        return newUser == null ? ResultDTO.error(ErrorMessageEnum.REGISTER_ERROR) : ResultDTO.successOf(newUser);
    }
}
