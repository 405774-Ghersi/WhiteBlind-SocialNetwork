package WhiteBlind.project.WhiteBlind.domain.models;

import java.time.LocalDateTime;
import java.util.List;

public class Comment {
    private Long id;
    private Long postId;
    private Long userId;
    private String content;
    private Long parentCommentId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive = true;
    private Post post;
    private User user;
    private Comment parentComment;
    private List<Comment> replies;
    private List<Like> likes;




}
