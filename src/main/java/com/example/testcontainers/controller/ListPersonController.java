package com.example.testcontainers.controller;

import com.example.testcontainers.controller.response.ListPersonResponse;
import com.example.testcontainers.service.RegisterPersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ListPersonController {

    private final RegisterPersonService registerPersonService;

    @GetMapping("/listall")
    public List<ListPersonResponse> register(){
        return registerPersonService.list();
    }

}
