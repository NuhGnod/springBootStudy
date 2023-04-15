package Solo.SpringBootStudy.comment;
import Solo.SpringBootStudy.BaseEntity;
import Solo.SpringBootStudy.User;
import Solo.SpringBootStudy.post.Post;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Comment extends BaseEntity {
    @Column(columnDefinition = "TEXT")
    private String commentContent;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    private Post post;

    @Column(unique = true)
    private String commentOriginId;

}