package WhiteBlind.project.WhiteBlind.domain.models;

import java.time.LocalDateTime;

public class Like {
    private Long id;
    private Long userId;
    private Long postId;
    private Long commentId;
    private LocalDateTime createdAt;
    private User user;
    private Post post;
    private Comment comment;

}
