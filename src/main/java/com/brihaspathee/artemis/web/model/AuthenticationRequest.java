package com.brihaspathee.artemis.web.model;

import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 16, June 2022
 * Time: 5:46 AM
 * Project: artemis
 * Package Name: com.brihaspathee.artemis.web.model
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticationRequest {

    private String username;

    private String password;

    @Override
    public String toString() {
        return "AuthenticateRequest{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
