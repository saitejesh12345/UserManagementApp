package com.example.UserManagementApp.service;

import com.example.UserManagementApp.model.User;
import com.example.UserManagementApp.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> getAllUsers() {

        return userRepository.findAll();
    }

    @Override
    public User getSingleUser(int  id) {
        return userRepository.findById(id).get();
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void  deleteUser(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<User> getAllusersByLastName(String lastName) {
        return userRepository.findByLastName(lastName);
    }

    @Override
    public List<User> getUsersByGender(String gender) {
        return userRepository.findByGender(gender);
    }

    @Override
    public User updateUser(int id, String address) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        user.setAddress(address);
        return userRepository.save(user);

    }

    @Override
    public List<User> addAllUser(List<User> user) {
        return userRepository.saveAll(user);
    }

    @Override
    public List<User> findSortedUser(String paramForString) {
        return userRepository.findAll(Sort.by(paramForString));
    }

    @Override
    public List<User> getUsersByGenderAndSort(String gender, String sortingParam) {
        Sort sort = Sort.by(sortingParam);
        return userRepository.findByGender(gender, sort);
    }

    @Override
    public Page<User> getAllUsersByPages(int pageNumber, int numberOfElementsPerPage) {
        return userRepository.findAll(PageRequest.of(pageNumber,numberOfElementsPerPage));
    }

    @Override
    public Slice<User> getAllUsersBySlices(int pageNumber, int numberOfElementsPerPage) {
        Slice<User> users = userRepository.findAll(PageRequest.of(pageNumber,numberOfElementsPerPage));
        return users;
    }


}
