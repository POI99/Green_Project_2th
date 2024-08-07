package com.green.glampick.security;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MyUser {

    private long userId; //로그인한 사용자의 pk값
    private String role; //사용자 권한, ROLE_권한이름

}