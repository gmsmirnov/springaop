package ru.gsmirnov.springapp.models;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( {"spring-config.xml"})
public class InstrumentalistTest {
    @Autowired
    Instrumentalist eddie;

    @Autowired
    Instrument guitar;

//    ApplicationContext context = new ClassPathXmlApplicationContext("ru.gsmirnov.springapp.models/spring-config.xml");

    @Before
    public void init() {

    }

    @Test
    public void test() {
//        Instrumentalist eddie = this.context.getBean(Instrumentalist.class);
        eddie.perform();
    }
}