package WhiteBlind.project.WhiteBlind.domain.models;

import WhiteBlind.project.WhiteBlind.domain.enums.FriendshipStatus;

import java.time.LocalDateTime;

public class FriendShip {
    private Long id;
    private Long requesterUserId;
    private Long addresseeUserId;
    private FriendshipStatus friendshipStatus = FriendshipStatus.PENDING;
    private LocalDateTime requestedAt;
    private LocalDateTime acceptedAt;
    private User requester;
    private User addressee;



}
