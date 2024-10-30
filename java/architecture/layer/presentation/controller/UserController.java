package architecture.layer.presentation.controller;

import architecture.layer.application.UserService;
import architecture.layer.presentation.dto.RequestDto;
import architecture.layer.presentation.dto.ResponseDto;

public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    public ResponseDto findUserInfo(RequestDto requestDto){
       return userService.findUserInfo(requestDto.getUserId());
    }

// 계층간 데이터를 이동시킬때 어떻게 해야하는가? dto는 어디에 있어야하는건지...
}
