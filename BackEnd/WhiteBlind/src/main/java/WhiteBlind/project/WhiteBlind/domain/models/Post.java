package WhiteBlind.project.WhiteBlind.domain.models;

import WhiteBlind.project.WhiteBlind.domain.enums.ContentType;
import WhiteBlind.project.WhiteBlind.domain.enums.Privacy;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Post {

private Long id;
private Long userId;
private String content;
private ContentType contentType;
private Privacy privacy;
private String location;
private LocalDateTime createdAt;
private LocalDateTime updatedAt;
private Boolean isActive;
private User user;
private List<Comment> comments;
private List<Multimedia> multimedia;
private List<Like> likes;



}
