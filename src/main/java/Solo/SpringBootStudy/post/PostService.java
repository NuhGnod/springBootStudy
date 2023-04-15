package Solo.SpringBootStudy.post;

import Solo.SpringBootStudy.User;
import Solo.SpringBootStudy.UserDto;
import Solo.SpringBootStudy.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostService {
    private final UserRepository userRepository;
    private final PostRepository postRepository;

    @Transactional
    public Post createPost(PostDto postDto) {
        String userId = postDto.getUserId();
        System.out.println("유저 정보 확인 =======================================");

        User user = userRepository.findByUserId(userId).orElseThrow(IllegalArgumentException::new);
        Post postEntity = Post.builder()
                .postContent(postDto.getContent())
                .postTitle(postDto.getTitle())
                .postOriginId(postDto.getPostOriginId())
                .user(user)
                .build();
        System.out.println("게시글 저장 =======================================");
        Post post = postRepository.save(postEntity);

        return post;
    }

    @Transactional
    public Post getPost(String postOriginId) {
        System.out.println("게시글 조회 =======================================");

        Optional<Post> byPostOriginId = postRepository.findByPostOriginId(postOriginId);
        System.out.println("byPostOriginId = " + byPostOriginId.get().toString());
        return
                byPostOriginId.get();
    }

    @Transactional
    public List<PostOutDto> getPosts() {
        System.out.println("전체 게시글 조회 ============");
        List<Post> all = postRepository.findAll();
        List<PostOutDto> dtos = new ArrayList<>();
        for (Post p : all) {


            PostOutDto build = PostOutDto.builder()
//                    .comments(p.getComments())
                    .postContent(p.getPostContent())
                    .postTitle(p.getPostTitle())
                    .postOriginId(p.getPostOriginId())
                    .user(p.getUser()).build();


            dtos.add(build);
        }

        return dtos;
    }
}
