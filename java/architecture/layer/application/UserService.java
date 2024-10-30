package architecture.layer.application;

import architecture.layer.infrastructure.UserRepositoryImpl;

public class UserService {
    private final UserRepositoryImpl userRepository;

    public UserService(UserRepositoryImpl userRepository){
        this.userRepository = userRepository;
    }
    public void findUserInfo(String userId) {
      return userRepository.findUserInfo(userId);
    }
}
