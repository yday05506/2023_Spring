package kr.hs.study.product.dao;

import kr.hs.study.product.dto.productDTO;

import java.util.List;

public interface productDAO {
    // insert, delete, update
    public void add(productDTO dto);
    public void delete1(String id);
    public productDTO read(String id);

    // select
    public List<productDTO> listAll();
}
