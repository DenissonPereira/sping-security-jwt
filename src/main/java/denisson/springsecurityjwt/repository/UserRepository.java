package denisson.springsecurityjwt.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import denisson.springsecurityjwt.model.User;


public interface UserRepository extends CrudRepository<User, String> {
  Optional<User> findByUsername(String username);
}
