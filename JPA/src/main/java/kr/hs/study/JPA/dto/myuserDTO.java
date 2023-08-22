package kr.hs.study.JPA.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class myuserDTO {
    private Long id;
    private String userid;
    private String username;
}
