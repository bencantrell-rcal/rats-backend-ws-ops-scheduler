package com.rcal.rcal_ops_scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class RcalOpsSchedulerApplication{
  // ---------------------------------------------------------------------------
  // Purpose: This is the main method of the application. When run, the app
  // runs indefinitely with the endpoints exposed.
  // ---------------------------------------------------------------------------
  public static void main(String[] args){
    SpringApplication.run(RcalOpsSchedulerApplication.class,args);
  }

}
