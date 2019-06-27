package ru.gsmirnov.springapp.models;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class InstrumentalistTest {
    ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

    @Before
    public void init() {

    }

    @Test
    public void test() {
        Instrumentalist eddie = this.context.getBean(Instrumentalist.class);
        eddie.perform();
    }
}