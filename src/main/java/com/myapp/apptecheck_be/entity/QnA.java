package com.myapp.apptecheck_be.entity;

import lombok.*;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "qna")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class QnA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long qnaId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private Boolean isPrivate;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
