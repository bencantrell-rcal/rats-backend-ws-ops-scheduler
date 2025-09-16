package com.rcal.rcal_ops_scheduler.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

@RestController
public class OpsSchedulerController{

  private static final DateTimeFormatter FORMATTER = DateTimeFormatter
      .ofPattern("yyyy-MM-dd'T'HH:mm:ss");

  // ---------------------------------------------------------------------------
  // Purpose: This method serves as a check to verify if the app is exposing
  // its endpoints correctly. When this endpoint is hit, it responds "healthy"
  // with a timestamp attached
  // ---------------------------------------------------------------------------
  @GetMapping("/health")
  public String health(){
    String timestamp = LocalDateTime.now(ZoneOffset.UTC).format(FORMATTER);
    String message = "Healthy " + timestamp;
    System.out.println(message);
    return message;
  }
}
