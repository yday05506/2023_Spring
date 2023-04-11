package kr.hs.study.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Scope("prototype")
@Data
public class TestBean1 {
    @Autowired
    @Qualifier("java1")
    private Car data1;
    @Autowired
    @Qualifier("java2")
    private Train data2;
}
