package Solo.SpringBootStudy.post;

import Solo.SpringBootStudy.post.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {
    @Query("select p from Post p join fetch p.user where p.postOriginId = :postOriginId")
    Optional<Post> findByPostOriginId(@Param("postOriginId") String postOriginId);

    //    Optional<Post> findByPostOriginId(String postOriginId);

//    @Query("select p from Post p join fetch p.user left outer join fetch p.comments")
    @Query("select p from Post p join fetch p.user")
    @Override
    List<Post> findAll();

}
