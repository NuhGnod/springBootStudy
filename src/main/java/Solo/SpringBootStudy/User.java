package Solo.SpringBootStudy;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Table(indexes = @Index(name = "idx_userId", columnList = "userId", unique = true))
public class User extends BaseEntity {


    private String password;
    @Column(length = 20, unique = true)
    private String userId;
    @Column(length = 20)
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "password='" + password + '\'' +
                ", userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
