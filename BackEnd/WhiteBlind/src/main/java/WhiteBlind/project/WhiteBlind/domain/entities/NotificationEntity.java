package WhiteBlind.project.WhiteBlind.domain.entities;

import WhiteBlind.project.WhiteBlind.domain.enums.NotificationType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "notifications")
public class NotificationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(name = "notification_type")
    private NotificationType notificationType;

    @Column(name = "content", nullable = false, length = 500)
    private String content;

    @Column(name = "related_url", length = 500)
    private String relatedUrl;

    @Column(name = "is_read")
    private Boolean isRead;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @JoinColumn(name = "user_id",nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private UserEntity user;


}
