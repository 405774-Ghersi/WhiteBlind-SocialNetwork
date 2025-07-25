package WhiteBlind.project.WhiteBlind.domain.entities;


import WhiteBlind.project.WhiteBlind.domain.enums.MessageType;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table (name = "messages")
public class MessageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (name = "content",nullable = false)
    private String content;

    @Enumerated(EnumType.STRING)
    @Column (name = "message_type")
    private MessageType messageType;

    @Column (name = "is_read")
    private Boolean isRead;

    @Column (name = "is_deleted")
    private Boolean isDeleted;

    @Column (name = "created_at")
    private LocalDateTime createdAt;

    @Column (name = "read_at")
    private LocalDateTime readAt;

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private UserEntity userSender;

    @ManyToOne
    @JoinColumn(name = "receiver_id")
    private UserEntity userReceiver;


}
