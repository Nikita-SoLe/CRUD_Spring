package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;

import web.model.User;

import java.util.List;

@Service
public class ServiceUserImpl implements ServiceUser {

    private final UserDAO userDao;

    @Autowired
    public ServiceUserImpl(UserDAO userDao) {
        this.userDao = userDao;
    }
    @Transactional
    @Override
    public void create(User user) {
        userDao.create(user);
    }

    @Transactional(readOnly = true)
    @Override
    public User read(Long id) {
        return userDao.read(id);
    }

    @Transactional
    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Transactional
    @Override
    public void delete(User user) {
        userDao.delete(user);
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> getList() {
        return userDao.getList();
    }
}
