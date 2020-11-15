package controller;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class UserController extends BaseController {

    private static final String API_NAME = "user";
    private static final String URI = UserController.API_V1 + "/" +
            UserController.API_NAME;

    @Autowired
    public UserController(){

    }

    @GetMapping("/hello")
    ResponseEntity<String> greetUser() {
        return ResponseEntity.ok("Hello World!");
    }

    @PostMapping(UserController.API_NAME)
    public ResponseEntity<String> createNewUser(@RequestBody User user) {
        createNewUser(user);
        return ResponseEntity.ok("New User created!");
    }
}

