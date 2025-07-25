package WhiteBlind.project.WhiteBlind.domain.entities;


import WhiteBlind.project.WhiteBlind.domain.enums.MemberRole;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "group_members")
public class GroupMemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id", nullable = false)
    private GroupEntity group;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    @Enumerated(EnumType.STRING)
    @Column(name = "member_role", length = 20)
    private MemberRole memberRole;

    @Column(name = "joined_at")
    private LocalDateTime joinedAt;

    @Column(name = "is_active")
    private Boolean isActive;

    // Constructor para crear nuevo miembro
    public GroupMemberEntity(GroupEntity group, UserEntity user, MemberRole memberRole) {
        this.group = group;
        this.user = user;
        this.memberRole = memberRole != null ? memberRole : MemberRole.MEMBER;
        this.joinedAt = LocalDateTime.now();
        this.isActive = true;
    }

    // Constructor para crear administrador/creador
    public static GroupMemberEntity createAdmin(GroupEntity group, UserEntity user) {
        return new GroupMemberEntity(group, user, MemberRole.ADMINISTRATOR);
    }

    // Método para promover a moderador
    public void promoteToModerator() {
        if (this.memberRole == MemberRole.MEMBER) {
            this.memberRole = MemberRole.MODERATOR;
        }
    }

    // Método para promover a administrador
    public void promoteToAdmin() {
        this.memberRole = MemberRole.ADMINISTRATOR;
    }

    // Método para degradar a miembro
    public void demoteToMember() {
        if (this.memberRole != MemberRole.ADMINISTRATOR) {
            this.memberRole = MemberRole.MEMBER;
        }
    }

    // Método para activar/desactivar miembro
    public void toggleActive() {
        this.isActive = !this.isActive;
    }

    // Verificar si tiene permisos de administrador
    public boolean isAdmin() {
        return this.memberRole == MemberRole.ADMINISTRATOR;
    }

    // Verificar si tiene permisos de moderador o superior
    public boolean isModerator() {
        return this.memberRole == MemberRole.MODERATOR || this.memberRole == MemberRole.ADMINISTRATOR;
    }
}
