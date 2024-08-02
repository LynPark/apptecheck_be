package com.myapp.apptecheck_be.entity;

import lombok.*;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "mission")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Mission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long missionId;

    @ManyToOne
    @JoinColumn(name = "user_app_id", nullable = false)
    private UserApp userApp;

    @Column(nullable = false)
    private String description;

    private Integer reward;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
