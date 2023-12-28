package com.togisoft.backend.security.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Token {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String token;
    String refreshToken;
    Date expiresAt;
    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;
    Boolean isActive;

    public Token(String jwt, String refreshToken, Date expiresAt, User user,Boolean isActive) {
        this.token = jwt;
        this.refreshToken = refreshToken;
        this.expiresAt = expiresAt;
        this.user = user;
        this.isActive = isActive;
    }
}
