package Solo.SpringBootStudy.post;

import Solo.SpringBootStudy.User;
import Solo.SpringBootStudy.UserDto;
import Solo.SpringBootStudy.comment.Comment;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class PostOutDto {

    private String postTitle;
    private UserDto userDto;
    private String postContent;
    private String postOriginId;
//    private List<Comment> comments;
}
