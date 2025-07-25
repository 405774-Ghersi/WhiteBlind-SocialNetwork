package WhiteBlind.project.WhiteBlind.domain.entities;

import WhiteBlind.project.WhiteBlind.domain.enums.ContentType;
import WhiteBlind.project.WhiteBlind.domain.enums.Privacy;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table (name = "Posts")
public class PostEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "content")
    private String content;
    @Column(name = "content_type")
    private ContentType contentType;
    @Column(name = "privacy")
    private Privacy privacy;
    @Column(name = "location")
    private String location;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
    @Column(name = "is_active")
    private Boolean isActive;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

}
