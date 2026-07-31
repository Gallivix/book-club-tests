package models.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
/*@AllArgsConstructor
@NoArgsConstructor*/
public class RegistrationBodyLombokModel {
    String username;
    String password;


}
