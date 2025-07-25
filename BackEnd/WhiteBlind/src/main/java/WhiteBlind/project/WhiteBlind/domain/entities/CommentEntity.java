package WhiteBlind.project.WhiteBlind.domain.entities;

import WhiteBlind.project.WhiteBlind.domain.models.Comment;
import WhiteBlind.project.WhiteBlind.domain.models.Like;
import WhiteBlind.project.WhiteBlind.domain.models.Post;
import WhiteBlind.project.WhiteBlind.domain.models.User;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "comments")
public class CommentEntity {

  /*Nunca pongas Model dentro de una Entity (Post, User, etc), siempre las entidades (PostEntity, UserEntity, etc).

    @JoinColumn define el nombre de la columna en la tabla.

    mappedBy hace referencia al atributo que tiene la relación en el otro lado.

🧱 Tu arquitectura ideal sería:
    Model: lo que viaja en la API.

    Entity: lo que va a la base de datos.

    Mapper: para pasar de uno al otro.

    DTOs (opcional): si querés separar aún más los datos que envías/recibís por la API.
    */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false)
    private PostEntity post;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    @Column(name = "content", nullable = false, length = 1000)
    private String content;

    @ManyToOne
    @JoinColumn(name = "parent_comment_id")
    private CommentEntity parentComment;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt = LocalDateTime.now();

    @Column(name = "is_active", nullable = false)
    private Boolean isActive = true;
}
