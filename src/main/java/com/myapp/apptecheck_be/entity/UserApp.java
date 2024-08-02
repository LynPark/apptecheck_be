package com.myapp.apptecheck_be.entity;

import lombok.*;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_app")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserApp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userAppId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private String appName;

    @Enumerated(EnumType.STRING)
    private Platform platform;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public enum Platform {
        iOS, Android;
    }
}
