package com.example.jwt_my_exsample.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserProfile {
    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
}
