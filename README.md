# Spring-Data 

### Spring-Data example with SpringBoot 

### Steps:

1: It was created an unique controller annotated as @RestController

2: In this controller has 6 method annotated as @RequestMapping with REST pattern

3: Every method access one repository called GuestRepository

4: In this repository that magic happens, note that theres no implementation, just the contract

5: Every contract follows a pattern provided by Spring-Data - "findBy" + name of property 

6: This examples uses H2 Database, it's a Database in memory - To access -> http://localhost:8080/h2

7: When the application starts the entity is created at H2 Database

Enjoy!







