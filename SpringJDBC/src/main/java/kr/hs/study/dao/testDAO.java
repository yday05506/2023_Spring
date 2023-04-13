package kr.hs.study.dao;

import kr.hs.study.dto.testDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class testDAO {
    // 실제 DB에 접속해서 쿼리를 날림
    // 쿼리 날리는 애 : JdbcTemplate
//    JdbcTemplate jdbc = new JdbcTemplate();
    @Autowired
    JdbcTemplate jdbc;

    // 저장(insert)
    public void insert(testDTO dto) {
        String sql = "insert into test values(?,?)";
        jdbc.update(sql, dto.getData1(), dto.getData2());
    }

    // 수정(update)
    public void update(testDTO dto) {
        // data1 = 2인 애의 data2를 spring222222로 변경
        String sql = "update test set data2=? where data1=2";
        jdbc.update(sql, dto.getData2());
    }

    // 삭제(delete)
    public void delete(testDTO dto) {
        String sql = "delete from test where data1=?";
        jdbc.update(sql, dto.getData1());
    }
}
