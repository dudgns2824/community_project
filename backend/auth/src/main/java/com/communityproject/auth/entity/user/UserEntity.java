package com.communityproject.auth.entity.user;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import javax.persistence.*;


@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column(name = "user_email", unique = true, nullable = false, length = 64)
    @NotEmpty(message = "이메일 주소가 올바르지 않습니다.")
    private String userEmail;

    @Column(name = "user_id", length = 256)
    @NotEmpty(message = "아이디가 입력되지 않았습니다.")
    private String userId;

    @Column(name = "user_password", length = 512)
    @NotEmpty(message = "비밀번호가 입력되지 않았습니다.")
    private String password;

}
