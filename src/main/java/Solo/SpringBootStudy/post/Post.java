package Solo.SpringBootStudy.post;

import Solo.SpringBootStudy.BaseEntity;
import Solo.SpringBootStudy.User;
import Solo.SpringBootStudy.comment.Comment;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Post extends BaseEntity {
    private String postTitle;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @Column(columnDefinition = "TEXT")
    private String postContent;

    @Column(unique = true)
    private String postOriginId;

    @OneToMany(mappedBy = "post")
    List<Comment> comments= new ArrayList(); //양방향 매핑 순환참조 문제 발생.

    @Override
    public String toString() {
        return "Post{" +
                "postTitle='" + postTitle + '\'' +
                ", user=" + user +
                ", postContent='" + postContent + '\'' +
                ", postOriginId='" + postOriginId + '\'' +
                ", comments=" + comments +
                '}';
    }
}
