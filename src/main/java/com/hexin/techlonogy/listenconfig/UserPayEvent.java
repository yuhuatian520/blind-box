package com.hexin.techlonogy.listenconfig;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class UserPayEvent extends ApplicationEvent {

    private String message;

    public UserPayEvent(Object source,String message) {
        super(source);
        this.message=message;
    }
}
