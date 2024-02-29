package web.service;

import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.List;

@Repository
public interface ServiceUser {
    void create(User user);
    User read(Long id);
    void update(User user);
    void delete(User user);
    List<User> getList();
}
