package example.Pages;


import example.StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_HomePage {


    public WebElement tempUnitOnHomePage (){
        WebElement tempUnitOnHomePage = Hooks.driver.findElement(By.id("com.info.weather.forecast:id/tv_current_temper_unit"));
        return tempUnitOnHomePage;
    }

    public WebElement timeFormatAM (){
        WebElement timeFormateAM = Hooks.driver.findElement(By.id("com.info.weather.forecast:id/tv_sunrise_top"));
        return timeFormateAM;
    }

    public WebElement timeFormatePM (){
        WebElement timeFormatePM = Hooks.driver.findElement(By.id("com.info.weather.forecast:id/tv_sunset_top"));
        return timeFormatePM;
    }




}
