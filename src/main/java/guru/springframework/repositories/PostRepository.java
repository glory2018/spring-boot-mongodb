package guru.springframework.repositories;

import guru.springframework.domain.Post;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 1/10/17.
 */
public interface PostRepository extends CrudRepository<Post, String> {
}
