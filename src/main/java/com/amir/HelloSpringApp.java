package com.amir;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");

        Coach toCoach = context.getBean("myCoach" , Coach.class);


        System.out.println(toCoach.getDailyWorkout());

        context.close();


    }
}
