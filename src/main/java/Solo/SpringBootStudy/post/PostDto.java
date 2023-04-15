package Solo.SpringBootStudy.post;


import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {
    private String userId;
    private String content;
    private String title;
    private String postOriginId;
}
