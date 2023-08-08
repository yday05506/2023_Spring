package kr.hs.study.MyBatis.service;

import kr.hs.study.MyBatis.dto.myUserDTO;

import java.util.List;

public interface myUserService {
   // insert
   public void insert(myUserDTO dto);

   // select
   public List<myUserDTO> listAll();

   // delete
   public void delete1(String id);

   // update

}
