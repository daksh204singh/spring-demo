package com.daksh.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {

//    @Autowired
//    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    /**
     * @Qualifier in constructor has to be put with the constructor arguments.
     * Only in case of constructors.
     * Read more about it at:
     * https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-autowired-annotation-qualifiers
     * @param fortuneService
     */

    @Autowired
    public TennisCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }


    public TennisCoach() {
        System.out.println("TennisCoach: inside default constructor");
    }

//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        System.out.println("TennisCoach: inside method setFortuneService");
//        this.fortuneService = fortuneService;
//    }

//    @Autowired
//    public void doSomeCrazyStuff(FortuneService fortuneService) {
//        System.out.println("TennisCoach: inside method doSomeCrazyStuff");
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }


    // define init method
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("TennisCoach: inside doMyStartupStuff");
    }

    // define destroy method
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println("TennisCoach: inside doMyCleanupStuff");
    }

}
