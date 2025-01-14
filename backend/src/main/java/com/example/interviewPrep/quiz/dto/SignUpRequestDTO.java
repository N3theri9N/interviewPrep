package com.example.interviewPrep.quiz.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
public class SignUpRequestDTO {

    String name;
    String email;
    String password;
    String passwordConfirm;

    public static boolean hasNullDataBeforeSignup(SignUpRequestDTO member) {
        return member.getName() == null || member.getEmail() == null
                || member.getPassword() == null || member.getPasswordConfirm() == null;
    }

}
