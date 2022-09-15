package com.example.interviewPrep.quiz.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import javax.validation.constraints.NotNull;

@Getter
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class MemberDTO {

    private final Long id;

    @NotNull
    private final String email;
    @NotNull
    private final String password;
    @NotNull
    private final String type;

}
