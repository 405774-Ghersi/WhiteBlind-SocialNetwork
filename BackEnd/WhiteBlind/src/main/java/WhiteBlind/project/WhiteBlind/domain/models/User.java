package WhiteBlind.project.WhiteBlind.domain.models;

import WhiteBlind.project.WhiteBlind.domain.enums.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;
    private String profilePicture;
    private String biography;
    private String phone;
    //city en la bd
    private String address;
    private Date dateOfBirth;
    private UserStatus userStatus;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;
    private Boolean isAdmin;

}
