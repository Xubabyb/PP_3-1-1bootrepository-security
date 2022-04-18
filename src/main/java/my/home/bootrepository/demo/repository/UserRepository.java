package my.home.bootrepository.demo.repository;

import my.home.bootrepository.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
