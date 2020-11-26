package service.impl;

import dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.IUserService;
import vo.User;

@Service
public class IUserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;
    public User getuser(String id) {
        return userDao.getUser(id);
    }
}
