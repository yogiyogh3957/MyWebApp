package com.mycompany.user;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {

    @Query(value = "SELECT * FROM users WHERE " + "MATCH(email, username) " + "AGAINST (?1)", nativeQuery = true)

    public List<User> search(String keyword);

}

