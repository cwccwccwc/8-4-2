package com.yc.spring.test3;

import com.yc.spring.test3.system.Container;
import com.yc.spring.test3.user.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ac=new AnnotationConfigApplicationContext(Config.class);
        Container c = (Container) ac.getBean("container");

        c.add(      new Student("张三",1.7,90));
        c.add(      new Student("李四",1.8,80));
        c.add(      new Student("王五",1.6,100));

        c.add(      new Student("异常",0.3,1));

        System.out.println(c.getMax());
        System.out.println(c.getMin());
        System.out.println(c.getAvg());
        System.out.println(c.size());

    }
}
