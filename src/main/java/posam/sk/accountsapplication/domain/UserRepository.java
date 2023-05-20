package posam.sk.accountsapplication.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    // public List<User> findByEmail(String email);
    public User findByEmail(String email);

    public User findById(int id);
}