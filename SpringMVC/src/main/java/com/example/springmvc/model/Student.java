package com.example.springmvc.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ToString
@Getter
@Setter
public class Student {

    private Long id;
    @NotEmpty(message = "Name mast be write")
    @Size(min=2, max=35)
    private String firstName;
    @NotEmpty(message = "Surname mast be write")
    @Size(min=2, max=35)
    private String lastName;
    private String dateOfBirth;
    @Email
    private String email;
    private String phone;
    @NotNull
    private Long groupID;
}
