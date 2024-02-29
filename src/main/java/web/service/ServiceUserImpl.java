package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.DAO;
import web.dao.UserDaoImpl;
import web.model.User;

import java.util.List;

@Service
public class ServiceUserImpl implements ServiceUser {

    private final DAO dao;

    @Autowired
    public ServiceUserImpl(DAO dao) {
        this.dao = dao;
    }
    @Transactional
    @Override
    public void create(User user) {
        dao.create(user);
    }

    @Transactional(readOnly = true)
    @Override
    public User read(Long id) {
        return dao.read(id);
    }

    @Transactional
    @Override
    public void update(User user) {
        dao.update(user);
    }

    @Transactional
    @Override
    public void delete(User user) {
        dao.delete(user);
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> getList() {
        return dao.getList();
    }
}
