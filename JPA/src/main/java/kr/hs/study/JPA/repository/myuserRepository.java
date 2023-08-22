package kr.hs.study.JPA.repository;

import kr.hs.study.JPA.entity.myuserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface myuserRepository extends JpaRepository<myuserEntity, Long> {
}
