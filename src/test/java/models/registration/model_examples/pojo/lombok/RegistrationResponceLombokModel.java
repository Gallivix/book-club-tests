package models.registration.model_examples.pojo.lombok;

import lombok.Data;

@Data
public class RegistrationResponceLombokModel {

    Integer id;
    String username;
    String firstName;
    String lastName;
    String email;
    String remoteAddr;

    }

