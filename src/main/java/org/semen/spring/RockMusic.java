package org.semen.spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class RockMusic implements Music {
    @PostConstruct
    public void doMyInit() {
        System.out.println("Do my initialization");
    }
    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Do my destruction");
    }
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
