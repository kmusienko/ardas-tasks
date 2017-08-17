package com.mywork.task1.application;

import com.mywork.task1.service.GreetingService;
import com.mywork.task1.service.impl.GreetingServiceImpl;
import java.time.LocalTime;

public class Runner {

  public static void main(String[] args) {
    GreetingService greetingService = new GreetingServiceImpl();
    String greeting = greetingService.getGreetingByTime(LocalTime.now());
    System.out.println(greeting);
  }
}
