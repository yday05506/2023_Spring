package kr.hs.study.product.service;

import kr.hs.study.product.dao.productDAO;
import kr.hs.study.product.dto.productDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class productServiceimpl implements productService{
    @Autowired
    private productDAO dao;

    @Override
    public void add(productDTO dto) {
        dao.add(dto);
    }

    @Override
    public void delete1(String id) {
        dao.delete1(id);
    }

    @Override
    public productDTO read(String id) {
        return dao.read(id);
    }

    @Override
    public List<productDTO> listAll() {
        return dao.listAll();
    }
}
