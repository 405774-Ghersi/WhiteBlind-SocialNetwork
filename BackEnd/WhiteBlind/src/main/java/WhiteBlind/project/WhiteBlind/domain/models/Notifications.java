package WhiteBlind.project.WhiteBlind.domain.models;

import WhiteBlind.project.WhiteBlind.domain.enums.NotificationType;

import java.time.LocalDateTime;

public class Notifications {

    private Long id;
    private Long userId;
    private NotificationType notificationType;
    private String content;
    private String relatedUrl;
    private Boolean isRead = false;
    private LocalDateTime createdAt;
    private User user;


}
