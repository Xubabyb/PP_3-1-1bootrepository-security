package my.home.bootrepository.demo.service;

import my.home.bootrepository.demo.model.User;

import java.util.List;

public interface UserService {

    User getUserById(Long id);

    List<User> getAllUsers();

    /*User updateUser(User user);*/

    void removeUserById(Long id);

    void saveUser(User user);


}
