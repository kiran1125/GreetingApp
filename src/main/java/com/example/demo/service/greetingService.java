package com.example.demo.service;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Component;

import com.example.demo.model.Greeting;

@Component
public class greetingService implements IGreetingService{
	private static final String template = "Hello world";
    private final AtomicLong counter = new AtomicLong();


    @Override
    public Greeting greetingMessage() {
        return new Greeting(counter.incrementAndGet(), String.format(template));
    }
}
