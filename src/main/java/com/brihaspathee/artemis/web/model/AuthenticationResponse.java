package com.brihaspathee.artemis.web.model;

import com.fasterxml.jackson.annotation.JsonInclude;
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
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthenticationResponse {

    private boolean isAuthenticated;

    private String authMessage;

    private String authToken;

    private Object subject;

    @Override
    public String toString() {
        return "AuthenticationResponse{" +
                "isAuthenticated=" + isAuthenticated +
                ", authMessage='" + authMessage + '\'' +
                ", authToken='" + authToken + '\'' +
                ", subject=" + subject +
                '}';
    }
}
