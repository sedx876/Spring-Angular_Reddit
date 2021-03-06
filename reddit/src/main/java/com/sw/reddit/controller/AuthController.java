package com.sw.reddit.controller;

import com.sw.reddit.dto.RegisterRequest;
import com.sw.reddit.service.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/auth")
@AllArgsConstructor
public class AuthController {
  private final AuthService authService;

  @PostMapping("/signup")
  public ResponseEntity<String> signup(@RequestBody RegisterRequest registerRequest) {
    authService.signup(registerRequest);
    return new ResponseEntity<>("User Registration Successful",
            OK);
  }
}
