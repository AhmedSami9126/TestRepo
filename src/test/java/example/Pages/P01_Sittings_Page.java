package example.Pages;

import example.StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_Sittings_Page {



    public WebElement temperatureDropDown(){

        WebElement tempDropDown = Hooks.driver.findElement(By.id("com.info.weather.forecast:id/iv_temp_dropdown"));
        return tempDropDown;
    }


    public WebElement temperatureF(){
        WebElement tempChooseF = Hooks.driver.findElement(By.xpath("(//android.widget.TextView[@text=\"F\"])[2]"));
        return tempChooseF;
    }


    public WebElement timeFormatDropDown(){
        WebElement timeDropDown = Hooks.driver.findElement(By.id("com.info.weather.forecast:id/iv_timeformat_dropdown"));
        return timeDropDown;
    }


    public WebElement timeChoose12 (){
        WebElement timeChoose12 = Hooks.driver.findElement(By.xpath("(//android.widget.TextView[@text=\"12 Hour\"])[2]"));
        return timeChoose12;
    }

    public WebElement doneButton (){
        WebElement doneBtu = Hooks.driver.findElement(By.id("com.info.weather.forecast:id/tv_button_done"));
        return doneBtu;
    }

    public WebElement gotItPage (){
        WebElement gotItPage = Hooks.driver.findElement(By.id("com.info.weather.forecast:id/ll_got_it"));
        return gotItPage;
    }

    public WebElement gotItButton (){
        WebElement gotItBtu = Hooks.driver.findElement(By.xpath("//android.widget.TextView[@text=\"GOT IT\"]"));
        return gotItBtu;
    }


}
