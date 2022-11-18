package com.example.testcontainers.service;

import com.example.testcontainers.controller.request.RegisterPersonRequest;
import com.example.testcontainers.controller.response.ListPersonResponse;
import com.example.testcontainers.controller.response.RegisterPersonResponse;
import com.example.testcontainers.mapper.ListPersonMapper;
import com.example.testcontainers.mapper.RegisterPersonMapper;
import com.example.testcontainers.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RegisterPersonService {

    private final RegisterPersonMapper registerPersonMapper;
    private final ListPersonMapper listPersonMapper;
    private final PersonRepository personRepository;

    public RegisterPersonResponse register(RegisterPersonRequest request) {
        return registerPersonMapper.toRepresentation(personRepository.save(registerPersonMapper.toDomain(request)));
    }

    public List<ListPersonResponse> list() {
        return personRepository.findAll().stream().map(
                listPersonMapper::toRepresentation
        ).collect(Collectors.toList());
    }
}
