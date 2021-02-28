package com.daksh.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    @Value("${foo.email}")
    private String emailAddress;

    @Value("{foo.team}")
    private String team;

//    public void setEmailAddress(String emailAddress) {
//        System.out.println("Cricket coah: inside setter method - setEmailAddress");
//        this.emailAddress = emailAddress;
//    }

//    public void setTeam(String team) {
//        System.out.println("Cricket coah: inside setter method - setTeam");
//        this.team = team;
//    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    @Autowired
    @Qualifier("happyFortuneService")
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Cricket coach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    public CricketCoach() {
        System.out.println("Cricket Coach: inside no-arg constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }
}
