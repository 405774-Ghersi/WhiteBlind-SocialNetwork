package WhiteBlind.project.WhiteBlind.domain.models;

import WhiteBlind.project.WhiteBlind.domain.enums.MessageType;

import java.time.LocalDateTime;

public class Message {

    private Long id;
    private Long senderId;
    private Long receiverId;
    private String content;
    private MessageType messageType = MessageType.TEXT;
    private Boolean isRead = false;
    private Boolean isDeleted = false;

    private LocalDateTime createdAt;
    private LocalDateTime readAt;
    private User sender;
    private User receiver;


}
