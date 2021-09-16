package project.facade;

import org.springframework.stereotype.Component;
import project.dto.PostDTO;
import project.entity.Post;

@Component
public class PostFacade {

    public PostDTO postToPostDTO(Post post) {

        PostDTO postDTO = new PostDTO();
        postDTO.setUsername(post.getUser().getUsername());
        postDTO.setId(post.getId());
        postDTO.setCaption(post.getCaption());
        postDTO.setLikes(post.getLikes());
        postDTO.setUsersLiked(post.getLikedUsers());
        postDTO.setLocation(post.getLocation());
        postDTO.setTitle(postDTO.getTitle());

        return postDTO;

    }

}
