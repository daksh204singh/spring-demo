package com.daksh.springdemo;

import org.springframework.beans.factory.DisposableBean;

public class TrackCoach implements Coach, DisposableBean {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it: " + fortuneService.getFortune();
    }

    // add an init method
    public void doMyStartupStuff() {
        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }

    // add a destroy method
    public void doMyCleanupStuff() {
        System.out.println("TrackCoach: inside method doMyCleanupStuff");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("TrackCoach: inside method destroy");
        doMyCleanupStuff();
    }
}
