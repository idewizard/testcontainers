package com.example.testcontainers.mapper;

import com.example.testcontainers.controller.request.RegisterPersonRequest;
import com.example.testcontainers.controller.response.RegisterPersonResponse;
import com.example.testcontainers.model.Person;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RegisterPersonMapper {

    RegisterPersonResponse toRepresentation(Person person);
    Person toDomain(RegisterPersonRequest request);

}
