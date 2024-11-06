package architecture.layer.presentation.controller;

import architecture.layer.domain.UserService;
import architecture.layer.domain.UserDto;
import architecture.layer.presentation.dto.RequestDto;
import architecture.layer.presentation.dto.ResponseDto;

public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    public ResponseDto findUserInfo(RequestDto requestDto){
       UserDto result =  userService.findUserInfo(requestDto.getUserId());
//       ResponseDto respons = new ReponseDto(result);
       return new ResponseDto();
    }

// 계층간 데이터를 이동시킬때 어떻게 해야하는가? dto는 어디에 있어야하는건지...
}
