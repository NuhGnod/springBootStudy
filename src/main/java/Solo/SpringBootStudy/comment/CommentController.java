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
    public ResponseEntity<Void> createComment(@RequestBody CommentDto commentDto) { //comment 엔티티에서 post엔티티와 양방향 매핑으로 인해 entity를 반환하므로 순환참조발생.
        commentService.createComment(commentDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
