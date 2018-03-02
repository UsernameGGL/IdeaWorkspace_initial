package example;

import com.WeatherQueryServiceLocator;
import com.WeatherQuery_PortType;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import entity.WeatherEntity;

import java.lang.reflect.Type;
import java.sql.Date;
import java.util.ArrayList;

public class HelloWorldClient {
    private static String CITY_NAME="青岛";
    private static Jiequ JIEQU = new Jiequ();
  public static void main(String[] argv) {
      try {
          WeatherQueryServiceLocator locator = new WeatherQueryServiceLocator();
          WeatherQuery_PortType service=locator.getWeatherQuery();
          Gson gson=new Gson();
          String data=service.getCityWeather(CITY_NAME);
          Type type = new TypeToken<ArrayList<WeatherEntity>>() {}.getType();
          ArrayList<WeatherEntity> sList=gson.fromJson(data, type);
          for(WeatherEntity a:sList){
              System.out.println(CITY_NAME+" "+a.getTime()+" "+a.getWeather()+" "+a.getHumidity()+"\n   低温");
              JIEQU.printfStr(a.getMintemp());
              System.out.println("    高温");
              JIEQU.printfStr(a.getMaxtemp());
          }
          Date date=Date.valueOf("2017-11-13");
          for(WeatherEntity a:sList){
              if(date.equals(a.getTime())){
                  System.out.println("查到的日期："+a.getTime()+" "+a.getWeather()+" "+a.getHumidity()+"\n   低温");
                  JIEQU.printfStr(a.getMintemp());
                  System.out.println("    高温");
                  JIEQU.printfStr(a.getMaxtemp());
              }
          }

      } catch (javax.xml.rpc.ServiceException ex) {
          ex.printStackTrace();
      } catch (java.rmi.RemoteException ex) {
          ex.printStackTrace();
      }
  }
}
