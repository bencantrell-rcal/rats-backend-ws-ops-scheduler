package com.rcal.ops_scheduler.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;

@Configuration
public class SecurityConfiguration{

  // ---------------------------------------------------------------------------
  // Purpose: This Spring Bean defines endpoints that should be let through
  // spring security. This specifies to permit the appropriate swagger calls.
  // ---------------------------------------------------------------------------
  @Bean
  public WebSecurityCustomizer webSecurityCustomizer(){
    return (web) -> web.ignoring().requestMatchers("/api/opsscheduler/swagger-ui/**",
        "/api/opsscheduler/v3/api-docs/**","/api/opsscheduler/swagger-ui.html");
  }
}
