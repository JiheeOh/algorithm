package architecture.layer.domain;

import architecture.layer.domain.UserDto;
import architecture.layer.infrastructure.UserEntity;
import architecture.layer.infrastructure.UserRepositoryImpl;

public class UserService {
    private final UserRepositoryImpl userRepository;

    public UserService(UserRepositoryImpl userRepository){
        this.userRepository = userRepository;
    }
    public UserDto findUserInfo(String userId) {
        UserEntity result = userRepository.findUserInfo(userId);
//        UserDto result = new UserDto(result);
      return new UserDto();
    }
}
