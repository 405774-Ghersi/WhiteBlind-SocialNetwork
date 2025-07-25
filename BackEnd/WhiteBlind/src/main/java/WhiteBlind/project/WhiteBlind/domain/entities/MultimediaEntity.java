package WhiteBlind.project.WhiteBlind.domain.entities;


import WhiteBlind.project.WhiteBlind.domain.enums.FileType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "multimedia")
public class MultimediaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "file_name", nullable = false)
    private String filename;

    @Column(name = "file_url",nullable = false)
    private String fileUrl;

    @Column(name = "file_type")
    private FileType fileType;

    @Column(name = "file_size")
    private Long fileSize;

    @Column(name = "description")
    private String description;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private PostEntity post;


}
