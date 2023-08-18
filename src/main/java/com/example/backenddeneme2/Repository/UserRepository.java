package com.example.backenddeneme2.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.backenddeneme2.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
