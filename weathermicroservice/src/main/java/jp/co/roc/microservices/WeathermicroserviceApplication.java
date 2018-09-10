package jp.co.roc.microservices;

import java.io.IOException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class WeathermicroserviceApplication {

  public static void main(String[] args) {
    SpringApplication.run(WeathermicroserviceApplication.class, args);
  }

  @RestController
  class WeatherController {
    @RequestMapping("/weather/")
    public Weather getTodaysWeather() throws IOException {
      return new Weather();
    }
  }
}
