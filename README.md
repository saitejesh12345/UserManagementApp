
 # UserManagementApp
We are creating a simple application Using **GRADLE**,Flow is explained clearly  PPT also attached to respective github repo Agenda of application and what we are going to create its A gradle application.

# Explanation
**Architecture of Application**

![image](https://github.com/saitejesh12345/UserManagementApp/assets/108732167/b5622a3d-e333-4143-9a67-60e19f0d2559)


**1.Client** which makes a request to application,Our application is divided into different layers **First is Controller**,**second is Service**,**third is Repository**.

**2. So Role of Controller** is to redirect the request to particular **Service** which has actual **Business Logic**,and if the **Service** needs the data from **Database**
it contacts the **Repository layer** ,and Repository contacts the Database and Fetches the result and it returns the data to **Repository and from Repository it returns to Service ,Service manipulates the data and prepares the response as it returns to Controller,Controller response the data to Client in **JSON FOrmat**.

**3.** This is Joureny of Request and Creating the Response and sending back to Client

**Rest End Points**

![image](https://github.com/saitejesh12345/UserManagementApp/assets/108732167/fc16c18c-ae08-43c0-ad51-a4453f98f794)

**Application has been explained and Succesfully Completed, we have integrated Swagger Open ApI and H2 database in memory database in order to store data and test Rest API's.**


# SpringBoot Annotations:

**1.** In this application we have use **@SpringBootApplication** annotation so it is a combination of three annotations,we use in Main class of our application

->**@SpringBootConfiguration[It defines the beans] + @EnableAutoConfiguration + ComponentScan[It scans the components of springboot app]**

![image](https://github.com/saitejesh12345/UserManagementApp/assets/108732167/813fb67d-4e3f-4314-864e-830cf7581a77)

**2.**

![image](https://github.com/saitejesh12345/UserManagementApp/assets/108732167/55e4badb-c7b9-4ba4-bdfd-cd66e3ab3e41)

**3.**

![image](https://github.com/saitejesh12345/UserManagementApp/assets/108732167/f899fcc5-e1fc-4dd8-9129-a84093096de0)


**4.**

![image](https://github.com/saitejesh12345/UserManagementApp/assets/108732167/8b99607f-d5eb-4792-a390-86a958bbb1eb)

**5.**

![image](https://github.com/saitejesh12345/UserManagementApp/assets/108732167/bcc61f61-1b9b-4e96-945c-439a837b985a)

**6.**
![image](https://github.com/saitejesh12345/UserManagementApp/assets/108732167/c035c5f1-83c5-4e33-80c2-e8b71f8ebd8f)

# HOT CODE SWAP IN SPRINGBOOT[Spring-Boot-devtools dependency]

**1.**.Consider a scenario you need to make small changes in application and your application is running,if you do chnages chnages will not reflect automatically ,until
unless you restart the application.

**2.**. **Spring-Boot-devtools dependency** helps us to rescue in these situation.


# Actuators

**1.** How to check the **Health of application ,how to monitor the application,how to get the information about the memory**.

**2.**. Spring tool gives us the tool which is **Actuators,it is dependency in which we can monitor our application**.

**3.** Using Actuators we can check the status of our endpoints.

![image](https://github.com/saitejesh12345/UserManagementApp/assets/108732167/37551ee3-45b2-4b04-a62b-90483b80be07)

![image](https://github.com/saitejesh12345/UserManagementApp/assets/108732167/c22d7582-3b99-47d0-aa28-32a0636f68a9)

![image](https://github.com/saitejesh12345/UserManagementApp/assets/108732167/d4f173c3-ceb2-4d2c-9ffe-31bc64914fc7)

# Logging in SpringBoot

 ![image](https://github.com/saitejesh12345/UserManagementApp/assets/108732167/7d97134a-f907-4eb8-b1a3-7e289ee8c411)



**1.**. If we enable **Trace** remaining **Debug,info,warn,error** will be enabled.

**2.** If we enable **Debug** remaining **,info,warn,error** will be enabled.

**Refer  for logging in springboot** :- https://www.baeldung.com/spring-boot-logging

# Used Sorting techniques in this application & pagination & Slicing 
methods like   
  
  publicList<User>getUsersByGender****(@RequestParam String gender)
  
  public List<User> getAllSortedUser(@RequestParam String paramForString)
  
  public List<User> getUsersByGenderAndSort(@RequestParam String gender,@RequestParam String sortingParam)**
  
 **Pagination**
  
  **1.** In table if you have 1000's of record,you want the data into multiple pieces,you do not want to call all at a time.
  
  **2.**. for example 100 record in one page and another 100 records in another page.. like so on..
 
  
 **having 13 records of data arranging in page starts from 0 at 0-page 5 records i am placing
  
 
  ![image](https://github.com/saitejesh12345/UserManagementApp/assets/108732167/dae0ee32-9043-4807-9227-b10df3579af8)

  **OUTPUT1**
**Response body**
  
{
  "content": [
    {
      "id": 1,
      "firstName": "sai",
      "lastName": "Tejeshwar",
      "gender": "Male",
      "name": "sai Tejeshwar",
      "address": "MBNR"
    },
    {
      "id": 2,
      "firstName": "Rajesh",
      "lastName": "Naidu",
      "gender": "Male",
      "name": "Rajesh Naidu",
      "address": "USA"
    },
    {
      "id": 3,
      "firstName": "Aakash",
      "lastName": "bilakanti",
      "gender": "Male",
      "name": "Aakash bilakanti",
      "address": "USA"
    },
    {
      "id": 4,
      "firstName": "Ragav",
      "lastName": "Naidu",
      "gender": "Male",
      "name": "Ragav Naidu",
      "address": "MBNR"
    },
    {
      "id": 5,
      "firstName": "Shalini",
      "lastName": "Naidu",
      "gender": "Female",
      "name": "Shalini Naidu",
      "address": "MBNR"
    }
  ],
  "pageable": {
    "sort": {
      "empty": true,
      "sorted": false,
      "unsorted": true
    },
    "offset": 0,
    "pageNumber": 0,
    "pageSize": 5,
    "unpaged": false,
    "paged": true
  },
  "last": false,
  "totalPages": 3,
  "totalElements": 13,
  "number": 0,
  "size": 5,
  "sort": {
    "empty": true,
    "sorted": false,
    "unsorted": true
  },
  "first": true,
  "numberOfElements": 5,
  "empty": false
}
  
  
  ![image](https://github.com/saitejesh12345/UserManagementApp/assets/108732167/ba2e5a0c-fc7f-48de-bdf6-04d6eb6267cb)

  
  **OUTPUT2**
  
**Response body**
  
{
  "content": [
    {
      "id": 6,
      "firstName": "Deepthi",
      "lastName": "Naidu",
      "gender": "Female",
      "name": "Deepthi Naidu",
      "address": "USA"
    },
    {
      "id": 7,
      "firstName": "rachana",
      "lastName": "Naidu",
      "gender": "Female",
      "name": "rachana Naidu",
      "address": "HYD"
    },
    {
      "id": 8,
      "firstName": "Rashmi",
      "lastName": "rajput",
      "gender": "Female",
      "name": "Rashmi rajput ",
      "address": "USA"
    },
    {
      "id": 9,
      "firstName": "Nandini",
      "lastName": "Reddy",
      "gender": "Female",
      "name": "Nandini Reddy",
      "address": "MBNR"
    },
    {
      "id": 10,
      "firstName": "Bhanu",
      "lastName": "Reddy",
      "gender": "Male",
      "name": "Bhanu Reddy",
      "address": "HYD"
    }
  ],
  "pageable": {
    "sort": {
      "empty": true,
      "sorted": false,
      "unsorted": true
    },
    "offset": 5,
    "pageNumber": 1,
    "pageSize": 5,
    "unpaged": false,
    "paged": true
  },
  "last": false,
  "totalPages": 3,
  "totalElements": 13,
  "number": 1,
  "size": 5,
  "sort": {
    "empty": true,
    "sorted": false,
    "unsorted": true
  },
  "first": false,
  "numberOfElements": 5,
  "empty": false
}
 
   
  **OUTPUT3**
  
**Response body**
  
{
  "content": [
    {
      "id": 11,
      "firstName": "Umesh",
      "lastName": "yadav",
      "gender": "Male",
      "name": "Umesh yadav",
      "address": "MBNR"
    },
    {
      "id": 12,
      "firstName": "Akhilesh ",
      "lastName": "yadav",
      "gender": "Male",
      "name": "Akhilesh yadav",
      "address": "USA"
    },
    {
      "id": 13,
      "firstName": "Virat",
      "lastName": "bilakanti",
      "gender": "Male",
      "name": "Virat bilakanti",
      "address": "MBNR"
    }
  ],
  "pageable": {
    "sort": {
      "empty": true,
      "sorted": false,
      "unsorted": true
    },
    "offset": 10,
    "pageNumber": 2,
    "pageSize": 5,
    "unpaged": false,
    "paged": true
  },
  "last": true,
  "totalPages": 3,
  "totalElements": 13,
  "number": 2,
  "size": 5,
  "sort": {
    "empty": true,
    "sorted": false,
    "unsorted": true
  },
  "first": false,
  "numberOfElements": 3,
  "empty": false
} 
  
**Slicing**
  
  slice only knows if other pages are availble or not,same as pagination
  
  **By the End of this Project we have created various Rest api's**
  
  ![image](https://github.com/saitejesh12345/UserManagementApp/assets/108732167/64777ef8-3b60-46a1-8440-887ed9daa7a6)

 
