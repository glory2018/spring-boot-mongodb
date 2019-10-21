package guru.springframework.services;

import guru.springframework.domain.Post;
import guru.springframework.repositories.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {
    private PostRepository postRepository;

    @Override
    public Post save(Post post) {
        postRepository.save(post);
        return post;
    }
}
