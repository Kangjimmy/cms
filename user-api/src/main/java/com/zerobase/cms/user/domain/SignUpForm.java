package com.zerobase.cms.user.domain;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class SignUpForm {
    private String email;
    private String name;
    private String password;
    private LocalDate brith;
    private String phone;
}
