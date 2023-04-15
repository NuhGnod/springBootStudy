package Solo.SpringBootStudy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UserDto {

    private String password;
    private String userId;
    private String name;
}
