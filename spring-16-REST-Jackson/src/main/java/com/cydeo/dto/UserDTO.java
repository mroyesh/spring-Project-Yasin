package com.cydeo.dto;

import com.cydeo.enums.UserRole;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@JsonIgnoreProperties(value = {"address", "country", "state"}, ignoreUnknown = true) //if we ignore many fields
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDTO {
    private String email;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    private String username;
    private UserRole role;

    // what if we just hide this field? JsonIgnore ignores for request and response
    @JsonManagedReference// this field is going to be serialized, it just hides for response
    private AccountDTO account;

}
