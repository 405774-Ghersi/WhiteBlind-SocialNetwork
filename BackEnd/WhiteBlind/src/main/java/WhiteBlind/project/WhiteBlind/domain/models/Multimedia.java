package WhiteBlind.project.WhiteBlind.domain.models;

import WhiteBlind.project.WhiteBlind.domain.enums.FileType;

import java.time.LocalDateTime;

public class Multimedia {

    private Long id;
    private Long postId;
    private String fileName;
    private String fileUrl;
    private FileType fileType;
    private Long fileSize;
    private String description;
    private LocalDateTime createdAt;
    private Post post;

}
