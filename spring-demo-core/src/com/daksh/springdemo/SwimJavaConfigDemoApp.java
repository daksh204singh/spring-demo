package com.daksh.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {
        // read config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);

        System.out.println(swimCoach.getDailyWorkout());
        System.out.println(swimCoach.getFortuneService());
        System.out.println(swimCoach.getEmail());
        System.out.println(swimCoach.getTeam());

        context.close();
    }
}
