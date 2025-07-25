package WhiteBlind.project.WhiteBlind.domain.models;

import WhiteBlind.project.WhiteBlind.domain.enums.MemberRole;

import java.time.LocalDateTime;

public class GroupMember {

    private Long id;
    private Long groupId;
    private Long userId;
    private MemberRole memberRole = MemberRole.MEMBER;
    private LocalDateTime joinedAt;
    private Boolean isActive = true;
    private Group group;
    private User user;


}
