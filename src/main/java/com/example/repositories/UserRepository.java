package com.example.repositories;
import com.example.models.UserL;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<UserL, Long> {

}
