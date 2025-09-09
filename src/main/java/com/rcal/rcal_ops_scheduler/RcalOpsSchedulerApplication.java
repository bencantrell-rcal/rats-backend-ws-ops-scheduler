package com.rcal.rcal_ops_scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class RcalOpsSchedulerApplication{

  public static void main(String[] args){
    SpringApplication.run(RcalOpsSchedulerApplication.class,args);
  }

}
