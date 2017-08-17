package com.mywork.task1.service.impl;

import com.mywork.task1.validation.UTF8Control;
import com.mywork.task1.service.GreetingService;
import java.time.LocalTime;
import java.util.Locale;
import java.util.ResourceBundle;
import org.apache.log4j.Logger;

public class GreetingServiceImpl implements GreetingService {

  private static final Logger logger = Logger.getLogger(GreetingServiceImpl.class);

  /**
   * Gets greeting text depending on the user's time and location. Depending on the location
   * greeting will be shown either on english or russian language.
   *
   * @param localTime is current user's time
   * @return greeting text
   */
  public String getGreetingByTime(LocalTime localTime) {
    logger.info("Called getGreetingByTime method");
    String greeting = "";
    ResourceBundle resourceBundle = ResourceBundle
        .getBundle("messages", Locale.getDefault(), new UTF8Control());

      if (localTime.getHour() >= 6 && localTime.getHour() < 9) {
        greeting = resourceBundle.getString("greeting.morning");
        logger.info("Added morning greeting text to the variable 'greeting'");
      } else if (localTime.getHour() >= 9 && localTime.getHour() < 19) {
        greeting = resourceBundle.getString("greeting.day");
        logger.info("Added day greeting text to the variable 'greeting'");
      } else if (localTime.getHour() >= 19 && localTime.getHour() < 23) {
        greeting = resourceBundle.getString("greeting.evening");
        logger.info("Added evening greeting text to the variable 'greeting'");
      } else if (localTime.getHour() >= 23 || localTime.getHour() < 6) {
        greeting = resourceBundle.getString("greeting.night");
        logger.info("Added night greeting text to the variable 'greeting'");
      }
      logger.info("Returned 'greeting' variable by method 'getGreetingByTime'");
    return greeting;
  }
}
