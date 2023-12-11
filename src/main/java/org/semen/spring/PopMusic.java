package org.semen.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
public class PopMusic implements Music{
    @Override
    public String getSong() {
        return "Bye bay";
    }
}
