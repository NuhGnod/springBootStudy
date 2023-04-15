package Solo.SpringBootStudy.comment;

import Solo.SpringBootStudy.post.Post;
import Solo.SpringBootStudy.post.PostDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;
    @PostMapping("/comment")
    public ResponseEntity<Comment> createComment(@RequestBody CommentDto commentDto) {
        return new ResponseEntity<Comment>( commentService.createComment(commentDto), HttpStatus.OK);
    }
}
