package com.neonq.web.forms;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class RegisterBean {

    @NotEmpty(message = "Name is Required")
    String name;
    @NotEmpty(message = "Email is Required")
    String email;

    @NotEmpty(message = "Password is Required")
    String password;

    @NotEmpty(message = "Please Re-enter Password")
    String repassword;

    @NotEmpty(message = "Acceptance is Required")
    String termscheck;

    private List<String> errorMessages = new ArrayList<>();
}
