package com.josevdev.credentials_vault.repository;


import com.josevdev.credentials_vault.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{
    User findByEmail(String email);

}
