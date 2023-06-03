package com.example.UserManagementApp.repository;

import com.example.UserManagementApp.model.User;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User,Integer> {


    List<User> findByLastName(String lastName);
    List<User> findByGender(String gender);

    List<User> findByGender(String gender, Sort sort);



    //   List<User> findAll(String gender, Sort by);

    //  List<User> findAll(String gender, Sort by);
    // User updateUser(int id, String address);
//     List<User> getAllUsers();
//
//     User getSingleUser();
//
//     User addUser(User user);
//
//    User updateUser(User user);
//
 //  User deleteUser();
}
