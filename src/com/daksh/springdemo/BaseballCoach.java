package com.daksh.springdemo;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    // add an init method
    public void doMyStartupStuff() {
        System.out.println("BaseballCoach: inside method doMyStartupStuff");
    }

    // add a destroy method
    public void doMyCleanupStuff() {
        System.out.println("BaseballCoach: inside method doMyCleanupStuff");
    }
}
