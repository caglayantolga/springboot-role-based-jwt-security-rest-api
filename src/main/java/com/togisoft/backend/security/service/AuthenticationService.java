package com.togisoft.backend.security.service;

import com.togisoft.backend.security.dao.request.RefreshRequest;
import com.togisoft.backend.security.dao.request.SigningRequest;
import com.togisoft.backend.security.dao.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signing(SigningRequest request);

    JwtAuthenticationResponse refreshToken(RefreshRequest request);
}
