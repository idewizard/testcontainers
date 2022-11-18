package com.example.testcontainers.mapper;

import com.example.testcontainers.controller.response.ListPersonResponse;
import com.example.testcontainers.model.Person;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ListPersonMapper {
    ListPersonResponse toRepresentation(Person person);
}
