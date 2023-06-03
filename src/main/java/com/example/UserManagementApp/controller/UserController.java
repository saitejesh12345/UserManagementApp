package com.example.UserManagementApp.controller;

import com.example.UserManagementApp.model.User;
import com.example.UserManagementApp.service.UserService;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Slice;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {


  //  Logger logger = LoggerFactory.getLogger("UserManagementApp");
    @Autowired
    private UserService userService;


    @GetMapping("/getusers")
    public List<User> getAllUsers(){
    //    logger.info("getting users...");
        return userService.getAllUsers();
    }


    @GetMapping("/getuser/{id}")
    public User getSingleUser(@PathVariable int id){
        return userService.getSingleUser(id);
    }


    @PostMapping("/newUser")
    public User addUser(@RequestBody User user) {
       return  userService.addUser(user);
    }

    @PostMapping("/newUsers")
    public List<User> addAllUser(@RequestBody List<User> user) {
        return  userService.addAllUser(user);
    }

    @PutMapping("/updateUser")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }


    @PutMapping("/user/{id}")
    public User updateUser(@PathVariable int id, @RequestParam String address){
        return userService.updateUser(id,address);
    }

    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable("id") int id){
        userService.deleteUser(id);

    }

    @GetMapping("/getAllUsersByLastName/{lastName}")
public List<User> getAllUsersByLastName(@RequestParam String lastName){
       return  userService.getAllusersByLastName(lastName);
}


@GetMapping("/getUsersByGender/{gender}")
    public List<User> getUsersByGender(@RequestParam String gender){
        return  userService.getUsersByGender(gender);
    }


//Sort by all properties like firstName,lastName,gender,name,address give input as this properties
    @GetMapping("/getAllSortedUser/{paramForString}")
    public List<User> getAllSortedUser(@RequestParam String paramForString){
        return userService.findSortedUser(paramForString);
    }

    //sortBygender
    @GetMapping("/getUsersByGenderAndSort/{sortingParam}")
    public List<User> getUsersByGenderAndSort(@RequestParam String gender,@RequestParam String sortingParam){
        return userService.getUsersByGenderAndSort(gender,sortingParam);
    }

    //pagination implementation
    @GetMapping("/getUsersByPages/{pageNumber}/{numberOfElementsPerPage}")
    public Page<User> getAllUsersByPages(@RequestParam  String pageNumber,@RequestParam String numberOfElementsPerPage){
        return userService.getAllUsersByPages(Integer.parseInt(pageNumber),Integer.parseInt(numberOfElementsPerPage));
    }

    //for example if i want to slice a pages of users same as pagination
    @GetMapping("/ getAllUsersBySlices/{pageNumber}/{numberOfElementsPerPage}")
    public Slice<User> getAllUsersBySlices(@RequestParam  String pageNumber, @RequestParam String numberOfElementsPerPage){
        return userService.getAllUsersBySlices(Integer.parseInt(pageNumber),Integer.parseInt(numberOfElementsPerPage));
    }
//    @GetMapping("/logs"){

//    public String logs(){
//        logger.trace("A TRACE Message");
//        logger.debug("A DEBUG Message");
//        logger.info("A INFO Message");
//        logger.warn("A WARN Message");
//        logger.error("A ERROR Message");
//        return "See the Console for various levels of logs";
//    }
}
