package Solo.SpringBootStudy.comment;

import Solo.SpringBootStudy.User;
import Solo.SpringBootStudy.UserRepository;
import Solo.SpringBootStudy.post.Post;
import Solo.SpringBootStudy.post.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final UserRepository userRepository;
    private final PostRepository postRepository;
    private final CommentRepository commentRepository;
    public Comment createComment(CommentDto commentDto) {
        Optional<User> byUserId = userRepository.findByUserId(commentDto.getUserId());
        Optional<Post> byPostOriginId = postRepository.findByPostOriginId(commentDto.getPostOriginId());
        Comment build = Comment.builder()
                .user(byUserId.get())
                .commentContent(commentDto.getContent())
                .post(byPostOriginId.get())
                .commentOriginId(commentDto.getCommentOriginId())
                .build();
        Comment save = commentRepository.save(build);
        return save;
    }
}
