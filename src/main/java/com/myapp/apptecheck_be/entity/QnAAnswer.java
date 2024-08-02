package com.myapp.apptecheck_be.entity;

import lombok.*;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "qna_answer")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class QnAAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long answerId;

    @ManyToOne
    @JoinColumn(name = "qna_id", nullable = false)
    private QnA qna;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User admin;

    @Column(nullable = false)
    private String content;

    private LocalDateTime createdAt;
}
