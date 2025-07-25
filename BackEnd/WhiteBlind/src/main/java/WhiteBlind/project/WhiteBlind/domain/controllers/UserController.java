package WhiteBlind.project.WhiteBlind.domain.controllers;

import WhiteBlind.project.WhiteBlind.domain.models.User;
import WhiteBlind.project.WhiteBlind.domain.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("")
    public ResponseEntity<List<User>> getUser() {
        return ResponseEntity.ok(userService.getAllUsers());
    }


}
