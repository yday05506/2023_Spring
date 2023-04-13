package kr.hs.study;

import kr.hs.study.config.BeanConfig;
import kr.hs.study.dao.testDAO;
import kr.hs.study.dto.testDTO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
        // testDAO 가지고 와
        testDAO dao = ctx.getBean(testDAO.class);

        // 데이터 저장할 bean 생성
        testDTO t = new testDTO();
        t.setData1(1);
        t.setData2("spring1");
//        dao.insert(t);

//        System.out.println("Inserted!");

        testDTO t1 = new testDTO();
//        t1.setData1(2);
//        t1.setData2("spring222222");
//        dao.update(t1);



        testDTO t2 = new testDTO();
//        t2.setData1(3);
//        t2.setData2("spring3");
//        dao.insert(t2);

        dao.delete(t);



        ctx.close();
    }
}