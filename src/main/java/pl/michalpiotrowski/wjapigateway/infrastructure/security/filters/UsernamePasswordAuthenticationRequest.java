package pl.michalpiotrowski.wjapigateway.infrastructure.security.filters;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class UsernamePasswordAuthenticationRequest {
    private String username;
    private String password;
}
