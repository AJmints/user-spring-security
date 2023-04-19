package org.user.security.models.dto;

import lombok.Data;

@Data
public class AuthResponseDTO {

    /** JWT Auth Filter Homework **/

    private String accessToken;
    private String tokenType = "Bearer ";

    public AuthResponseDTO(String accessToken) {
        this.accessToken = accessToken;
    }
}
