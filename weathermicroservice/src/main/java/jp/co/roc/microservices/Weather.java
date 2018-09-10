package jp.co.roc.microservices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Weather {
  private String info;


  private int temperature;

  /**
   * 天気と温度をファイルから読み込む
   */
  public Weather() throws IOException {
    Resource resource = new ClassPathResource("static/temperature.txt");
    BufferedReader reader = new BufferedReader(new InputStreamReader(resource.getInputStream()));

    String line = reader.readLine();
    reader.close();

    String[] weatherdata = line.split("\\,", 0);

    this.setInfo(weatherdata[0]);
    this.setTemperature(Integer.parseInt(weatherdata[1]));

  }

  public Weather(String info) {
    this.setInfo(info);
  }

  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

  public int getTemperature() {
    return temperature;
  }

  public void setTemperature(int temperature) {
    this.temperature = temperature;
  }

}
