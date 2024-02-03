package me.mic050r.springsecurity.user.dto;

import lombok.*;

// 유저 회원가입용 DTO
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class UserRegisterDTO {
    private String username;
    private String password;
}
