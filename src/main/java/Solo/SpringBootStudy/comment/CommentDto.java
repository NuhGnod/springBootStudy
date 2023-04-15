package Solo.SpringBootStudy.comment;

import lombok.Getter;

@Getter
public class CommentDto {

    private String userId;
    private String content;
    private String postOriginId;
    private String commentOriginId;
}
