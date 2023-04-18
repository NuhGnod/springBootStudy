package Solo.SpringBootStudy.post;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("/post")
    public ResponseEntity<List<PostOutDto>> getPosts() {
        List<PostOutDto> posts = postService.getPosts();
        System.out.println("컨트롤러단. 프록시 조회 =======================");
//        posts.get(0).getUser().getUserId();
//        posts.get(1).getUser().getUserId();
//        posts.get(2).getUser().getUserId();
//        posts.get(3).getUser().getUserId();

        System.out.println("컨트롤러단. responseEntity 내려줄 때  ==========================");
        return new ResponseEntity( posts, HttpStatus.OK);

    }
}
