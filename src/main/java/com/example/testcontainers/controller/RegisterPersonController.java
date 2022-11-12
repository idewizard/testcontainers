package com.example.testcontainers.controller;

import com.example.testcontainers.controller.request.RegisterPersonRequest;
import com.example.testcontainers.controller.response.RegisterPersonResponse;
import com.example.testcontainers.service.RegisterPersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RegisterPersonController {

    private final RegisterPersonService registerPersonService;

    @PostMapping("/register")
    public RegisterPersonResponse register(@RequestBody RegisterPersonRequest request){
        return registerPersonService.register(request);
    }

}
