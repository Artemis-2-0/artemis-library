package com.brihaspathee.artemis.exception;

import com.networknt.schema.ValidationMessage;
import lombok.*;

import java.util.Set;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 19, May 2022
 * Time: 6:44 AM
 * Project: artemis-library
 * Package Name: com.brihaspathee.artemis.exception
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArtemisApiValidationException extends RuntimeException{

    private String apiName;

    private Set<ValidationMessage> validationMessages;

    public ArtemisApiValidationException(String message){
        super(message);
    }

    public ArtemisApiValidationException(String message, Throwable cause){
        super(message, cause);
    }

    public ArtemisApiValidationException(Set<ValidationMessage> validationMessages, String apiName){
        this.validationMessages = validationMessages;
        this.apiName = apiName;
    }
}
