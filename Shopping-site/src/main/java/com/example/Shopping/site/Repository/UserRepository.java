package com.example.Shopping.site.Repository;

import com.example.Shopping.site.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

    //User findByName(String name);

   // void deleteByName(String name);
}
