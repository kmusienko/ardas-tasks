package com.ardas.task1.service;

import com.ardas.task1.validation.UTF8Control;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Locale;
import java.util.ResourceBundle;
import org.junit.Assert;
import org.junit.Test;
import com.ardas.task1.service.impl.GreetingServiceImpl;

public class GreetingServiceTest {

  @Test
  public void getGreetingByTime_morningTime_GreetingText() throws IOException {
    //Arrange
    GreetingService greetingService = new GreetingServiceImpl();
    LocalTime localTimeMorning = LocalTime.of(7, 5);
    ResourceBundle resourceBundle = ResourceBundle
        .getBundle("messages", Locale.getDefault(), new UTF8Control());
    String expectedGreeting = resourceBundle.getString("greeting.morning");

    //Act
    String actualGreeting = greetingService.getGreetingByTime(localTimeMorning);

    //Assert
    Assert.assertEquals(actualGreeting, expectedGreeting);
  }

  @Test
  public void getGreetingByTime_dayTime_GreetingText() throws IOException {
    //Arrange
    GreetingService greetingService = new GreetingServiceImpl();
    LocalTime localTimeDay = LocalTime.of(12, 30, 15);
    ResourceBundle resourceBundle = ResourceBundle
        .getBundle("messages", Locale.getDefault(), new UTF8Control());
    String expectedGreeting = resourceBundle.getString("greeting.day");

    //Act
    String actualGreeting = greetingService.getGreetingByTime(localTimeDay);

    //Assert
    Assert.assertEquals(actualGreeting, expectedGreeting);
  }

  @Test
  public void getGreetingByTime_eveningTime_GreetingText() throws IOException {
    //Arrange
    GreetingService greetingService = new GreetingServiceImpl();
    LocalTime localTimeEvening = LocalTime.of(20, 45, 2);
    ResourceBundle resourceBundle = ResourceBundle
        .getBundle("messages", Locale.getDefault(), new UTF8Control());
    String expectedGreeting = resourceBundle.getString("greeting.evening");

    //Act
    String actualGreeting = greetingService.getGreetingByTime(localTimeEvening);

    //Assert
    Assert.assertEquals(actualGreeting, expectedGreeting);
  }

  @Test
  public void getGreetingByTime_nightTime_GreetingText() throws IOException {
    //Arrange
    GreetingService greetingService = new GreetingServiceImpl();
    LocalTime localTimeNight = LocalTime.of(2, 0);
    ResourceBundle resourceBundle = ResourceBundle
        .getBundle("messages", Locale.getDefault(), new UTF8Control());
    String expectedGreeting = resourceBundle.getString("greeting.night");

    //Act
    String actualGreeting = greetingService.getGreetingByTime(localTimeNight);

    //Assert
    Assert.assertEquals(actualGreeting, expectedGreeting);
  }

}
