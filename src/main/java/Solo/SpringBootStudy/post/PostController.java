package Solo.SpringBootStudy.post;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;
    @PostMapping("/post")
    public ResponseEntity<Post> createPost(@RequestBody PostDto postDto) {
       return new ResponseEntity( postService.createPost(postDto), HttpStatus.OK);
    }

    @GetMapping("/post/{postOriginId}")
    public ResponseEntity<Post> getPost(@PathVariable String postOriginId) {
        return new ResponseEntity( postService.getPost(postOriginId), HttpStatus.OK);

    }
}
