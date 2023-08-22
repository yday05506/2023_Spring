package kr.hs.study.JPA.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@Data
@NoArgsConstructor  // 기본 생성자
@AllArgsConstructor // person p = new person('kim', 'kim2');
public class myuserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String userid;

    @Column
    private String username;
}
