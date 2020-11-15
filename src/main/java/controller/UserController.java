package controller;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController extends BaseController {

    private static final String API_NAME = "user";

    @GetMapping(UserController.API_NAME + "/{id}")
    public ResponseEntity<String> getUser(@PathVariable long id) {
        return ResponseEntity.ok("user1");
    }

    @GetMapping(UserController.API_NAME)
    public ResponseEntity<String> getAllUsers() {
        return ResponseEntity.ok("All users!");
    }

    @GetMapping("/hello")
    ResponseEntity<String> greetUser() {
        return ResponseEntity.ok("Hello World!");
    }

    @PostMapping(UserController.API_NAME)
    public ResponseEntity<String> createNewUser() {
        return ResponseEntity.ok("New User created!");
    }

    @PutMapping(UserController.API_NAME + "/{id}")
    public ResponseEntity<String> updateUser(@PathVariable long id){
        return new ResponseEntity("User " + id + " has been updated!", HttpStatus.ACCEPTED);
    }

    @DeleteMapping(UserController.API_NAME + "/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable long id) {
        return new ResponseEntity<>("User " + id + " has been deleted!", HttpStatus.NOT_FOUND);

    }
}

