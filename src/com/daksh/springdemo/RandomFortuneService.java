package com.daksh.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    @Value("${foo.fortunes}")
    private String[] data;

    private Random random = new Random();

    @Override
    public String getDailyFortune() {
        return data[random.nextInt(data.length)];
    }
}
