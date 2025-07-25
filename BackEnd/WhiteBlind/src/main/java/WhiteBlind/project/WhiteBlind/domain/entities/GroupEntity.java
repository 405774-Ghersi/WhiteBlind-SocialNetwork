package WhiteBlind.project.WhiteBlind.domain.entities;

import WhiteBlind.project.WhiteBlind.domain.enums.GroupPrivacy;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "groups")
public class GroupEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "group_name", nullable = false, length = 200)
    private String groupName;

    @Column(name = "description", length = 1000)
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "creator_id", nullable = false)
    private UserEntity creator;

    @Enumerated(EnumType.STRING)
    @Column(name = "group_privacy", length = 20)
    private GroupPrivacy groupPrivacy;

    @Column(name = "group_picture", length = 500)
    private String groupPicture;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "is_active")
    private Boolean isActive;

    // Relación bidireccional con GroupMembers
    @OneToMany(mappedBy = "group", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<GroupMemberEntity> members;



    // Método para activar/desactivar grupo
    public void toggleActive() {
        this.isActive = !this.isActive;
    }

    // Método para verificar si el usuario es el creador
    public boolean isCreator(UserEntity user) {
        return this.creator.getId().equals(user.getId());
    }


}
