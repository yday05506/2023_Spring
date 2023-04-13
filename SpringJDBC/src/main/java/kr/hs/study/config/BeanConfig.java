package kr.hs.study.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan(basePackages = {"kr.hs.study.beans","kr.hs.study.dao"})
public class BeanConfig {


    //Datasource : Database 접속 정보를 가짐
    @Bean
    public BasicDataSource source() {
        BasicDataSource source = new BasicDataSource();
        source.setDriverClassName("oracle.jdbc.OracleDriver");
        source.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
        source.setUsername("scott");
        source.setPassword("tiger");

        return source;
    }

    // 데이터베이스에 접속해서 쿼리를 전달하는 빈을 등록한다.
    // 실제 데이터베이스에 접속해 쿼리를 날려줌 : JdbcTemplate
    @Bean
    public JdbcTemplate db(BasicDataSource source) {
        JdbcTemplate db = new JdbcTemplate(source);
        return db;
    }
}
