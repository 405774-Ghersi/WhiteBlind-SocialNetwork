package WhiteBlind.project.WhiteBlind.domain.models;

import WhiteBlind.project.WhiteBlind.domain.enums.GroupPrivacy;

import java.time.LocalDateTime;
import java.util.List;

public class Group {

    private Long id;
    private String groupName;
    private String description;
    private Long creatorId;
    private GroupPrivacy groupPrivacy = GroupPrivacy.PUBLIC;
    private String groupPicture;
    private LocalDateTime createdAt;
    private Boolean isActive = true;
    private User creator;
    private List<GroupMember> members;


}
