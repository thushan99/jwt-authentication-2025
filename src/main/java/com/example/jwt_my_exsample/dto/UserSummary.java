package com.example.jwt_my_exsample.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserSummary {
    private Long id;
    private String username;
    private String name;
}
