package com.example.springmvc.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
public class StudentGroup {
    private Long id;
    @NotEmpty(message = "Name group must be write")
    @Size(min=2, max=30)
    private String name;
}
