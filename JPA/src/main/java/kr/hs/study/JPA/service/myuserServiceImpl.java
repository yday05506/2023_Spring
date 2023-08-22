package kr.hs.study.JPA.service;

import kr.hs.study.JPA.dto.myuserDTO;
import kr.hs.study.JPA.repository.myuserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class myuserServiceImpl {
    @Autowired
    private myuserRepository jpa;

    public void insert(myuserDTO dto) {

    }
}
