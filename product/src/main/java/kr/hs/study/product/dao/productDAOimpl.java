package kr.hs.study.product.dao;

import kr.hs.study.product.dto.productDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class productDAOimpl implements productDAO{
    @Autowired
    private JdbcTemplate jdbc;

    @Override
    public void add(productDTO dto) {
        String sql = "insert into product values(?,?)";
        jdbc.update(sql, dto.getProduct_id(), dto.getProduct_name());
    }

    @Override
    public void delete1(String id) {
        String sql = "delete from product where product_id=" + id + "";
        jdbc.update(sql);
    }

    @Override
    public productDTO read(String id) {
        String sql = "select * from product where product_id=" + id + "";
        productDTO dto = jdbc.queryForObject(sql, new BeanPropertyRowMapper<>(productDTO.class));

        return dto;
    }

    @Override
    public List<productDTO> listAll() {
        String sql = "select * from product order by product_id asc";
        List<productDTO> dto = jdbc.query(sql, new BeanPropertyRowMapper<>(productDTO.class));

        return dto;
    }
}
