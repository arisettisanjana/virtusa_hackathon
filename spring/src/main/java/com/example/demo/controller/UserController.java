package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Courses;
import com.example.demo.model.User;
import com.example.demo.model.UserLogin;
import com.example.demo.repository.CourseRepository;
import com.example.demo.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserController {


  @Autowired
  private UserRepository userRepository;

  @Autowired
  private CourseRepository courseRepository;
  //@CrossOrigin(origins = "http://localhost:4200")
  @GetMapping("users")
  public List<User> getUsers(){
	  return this.userRepository.findAll();  
  }
  
  //@CrossOrigin(origins = "http://localhost:4200")
  @PostMapping("register")
  public boolean getUser(@RequestBody User user)
  {
	  String email=user.getUserEmail();
	 // String number=user.getMobileNumber();
//	  System.out.println(email);
//	  System.out.println(number+" "+user.getId()+" "+user.getPassword()+" "+user.getUsername());
	  int size=(userRepository.findByUserEmail(email)).size();
	  if(size==0)
	  {
	    this.userRepository.save(user);
	    return true;
	  }
	  return false;
	  
  }
  //@CrossOrigin(origins = "http://localhost:4200")
  @PostMapping("login")
  public boolean getCrendentials(@RequestBody UserLogin Userlogin) 
  {
	  String email=Userlogin.getLoginEmail();
	  String pwd=Userlogin.getLoginPassword();
	  System.out.println(email+pwd);
	  List<User> l=this.userRepository.findByUserEmail(email);
	  if(l.size()==0)
		  return false;
	  return l.get(0).getPassword().equals(pwd);
  }
@GetMapping("allUsers")
  public ResponseEntity<List<User>> getUsers1() {
      List<User> users = userRepository.findAll();
      return new ResponseEntity<>(users, HttpStatus.OK);
  }

  @PostMapping("addUser")
  public ResponseEntity<User> createStudent(@RequestBody User us) {
      User u= userRepository.save(us);
      return new ResponseEntity<>(u, HttpStatus.OK);
  }

  @PutMapping("updateUser")
  public ResponseEntity<User> updateStudent(@RequestBody User student) {
      Optional<User> std = userRepository.findById(student.getId());
      User stdUpdated = std.get();
      stdUpdated.setUserEmail(student.getUserEmail());
      stdUpdated.setUserName(student.getUserName());
      User studentUpdated = userRepository.save(stdUpdated);
      return new ResponseEntity<>(studentUpdated, HttpStatus.OK);
  }


  @DeleteMapping("/delUser/{id}")
  public ResponseEntity<String> createStudent(@PathVariable(name = "id") Long id) {
      userRepository.deleteById(id);
      return new ResponseEntity<>("student id: "+ id + " deleted successfully", HttpStatus.OK);
  }
  
  @GetMapping("courses")
  public ResponseEntity<List<Courses>> courseDetails()
  {
	 List<Courses> c=courseRepository.findAll();
	 return new ResponseEntity<>(c, HttpStatus.OK);
	  
  }

  
      
  }
  

