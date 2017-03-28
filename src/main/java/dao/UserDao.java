package dao;

import java.util.List;

public class UserDao implements IBasicDao<UserDao> {


    @Override
    public List<UserDao> selectAll() {
        return null;
    }

    @Override
    public UserDao selectById(long id) {
        return null;
    }

    @Override
    public boolean update(UserDao object) {
        return false;
    }

    @Override
    public boolean insert(UserDao object) {
        return false;
    }

    @Override
    public boolean deleteById(UserDao object) {
        return false;
    }

}
