package com.example.UserManagementApp.service;

import com.example.UserManagementApp.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;


import java.util.List;



public interface UserService {


     List<User> getAllUsers();


     User getSingleUser(int id);


     User addUser(User user);

     User updateUser(User user);

     void deleteUser(int id);

     List<User> getAllusersByLastName(String lastName);

     List<User> getUsersByGender(String gender);

     User updateUser(int id, String address);

    // List<User> addAllUser(User user);

     List<User> addAllUser(List<User> user);

     List<User> findSortedUser(String paramForString);

     List<User> getUsersByGenderAndSort(String gender, String sortingParam);

     Page<User> getAllUsersByPages(int pageNumber, int numberOfElementsPerPage);

     Slice<User> getAllUsersBySlices(int parseInt, int parseInt1);
}
