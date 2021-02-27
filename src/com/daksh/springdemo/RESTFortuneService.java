package com.daksh.springdemo;

import org.springframework.stereotype.Component;

/**
 * RESTFortuneService id will not be rESTFORTUNESERVICE as the both the first and
 * second letter is of the class name are upper case.
 * RESTFortuneService(class name) --> RESTFortuneService(generated bean id)
 * It happens because of Java Beans Introspector's implementation
 * Read more about it at:
 * https://docs.oracle.com/javase/8/docs/api/java/beans/Introspector.html#decapitalize(java.lang.String)
 */
@Component
public class RESTFortuneService implements FortuneService {
    @Override
    public String getDailyFortune() {
        return null;
    }
}
