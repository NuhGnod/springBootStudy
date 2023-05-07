package Solo.SpringBootStudy.post;

import Solo.SpringBootStudy.User;
import Solo.SpringBootStudy.comment.Comment;
import Solo.SpringBootStudy.comment.CommentDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class PostDetailDto {
    private String postTitle;
    private User user;
    private String postContent;
    private String postOriginId;
    private List<CommentDto> comments;

}
