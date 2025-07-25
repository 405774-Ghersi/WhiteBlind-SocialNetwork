package WhiteBlind.project.WhiteBlind.domain.entities;

import WhiteBlind.project.WhiteBlind.domain.enums.FriendshipStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "friendships")
public class FriendShipEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(name = "friendship_status")
    private FriendshipStatus friendshipStatus;

    @Column(name = "requested_at")
    private LocalDateTime requestedAt;

    @Column(name = "accepted_at")
    private LocalDateTime acceptedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "requester_user_id")
    private UserEntity userRequest;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "addressee_user_id")
    private UserEntity userAdressed;

}

