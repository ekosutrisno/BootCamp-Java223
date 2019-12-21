package com.restfull.RestFullAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestFullApiApplication {

   public static void main(String[] args) {

      System.setProperty("spring.config.name", "web-server");
      SpringApplication.run(RestFullApiApplication.class, args);
   }

}
