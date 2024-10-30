package architecture.layer.infrastructure;


import architecture.layer.domain.UserEntity;

public class UserRepositoryImpl implements UserRepository {
    public UserEntity findUserInfo(String userId) {
        return new UserEntity();

    }
}
