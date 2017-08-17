package com.ardas.task1.application;

import com.ardas.task1.service.GreetingService;
import com.ardas.task1.service.impl.GreetingServiceImpl;
import java.io.IOException;
import java.time.LocalTime;

public class Runner {

  public static void main(String[] args) throws IOException {
    GreetingService greetingService = new GreetingServiceImpl();
    String greeting = greetingService.getGreetingByTime(LocalTime.now());
    System.out.println(greeting);
  }
}
