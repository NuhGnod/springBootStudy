package Solo.SpringBootStudy.comment;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommentDto {

    private String userId;
    private String content;
    private String postOriginId;
    private String commentOriginId;
}
