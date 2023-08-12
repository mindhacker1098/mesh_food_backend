package com.messfood.foodiee.Repository;

import com.messfood.foodiee.models.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

  @Query(value = "SELECT email from `foodiee`.`users` where email= :email", nativeQuery = true)
  List<String> checkUserEmail(@Param("email") String email);

  @Query(value = "SELECT password from `foodiee`.`users` where email = :email", nativeQuery = true)
  String checkUserPasswordByEmail(@Param("email") String email);

  @Query(value = "SELECT * from `foodiee`.`users` where email = :email", nativeQuery = true)
  User getUserByDetail(@Param("email") String email);


  @Transactional
  @Modifying
  @Query(value = "INSERT INTO `foodiee`.`users`(UNIQUEID, email, password) VALUES(:UNIQUEID, :email, :password)", nativeQuery = true)
  int registerNewUser(@Param("UNIQUEID") String UNIQUEID,
                      @Param("email") String email,
                      @Param("password") String password);

}
