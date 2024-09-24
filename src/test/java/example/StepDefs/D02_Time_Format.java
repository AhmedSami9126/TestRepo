package example.StepDefs;

import example.Pages.P01_Sittings_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class D02_Time_Format {

    P01_Sittings_Page sittingsPage  =new P01_Sittings_Page();
    SoftAssert soft = new SoftAssert();

    @Given("click on time format arrow")
    public void on_time_format_arrow(){

        sittingsPage.timeFormatDropDown().click();
    }


    @When("choosing twelve format")
    public void choosingTwelveFormat() {
        sittingsPage.timeChoose12().click();
    }

    @Then("validate format is AM and PM")
    public void validateFormatIsAMAndPM() throws InterruptedException {

        Thread.sleep(10000);
    // Asserting AM format
        WebElement time_AM = Hooks.driver.findElement(By.id("com.info.weather.forecast:id/tv_sunrise_top"));
        Boolean timeFormatDisplayAM = time_AM.getText().toLowerCase().contains("am");
        soft.assertTrue(timeFormatDisplayAM);

    // Asserting PM format
        WebElement time_PM = Hooks.driver.findElement(By.id("com.info.weather.forecast:id/tv_sunset_top"));
        Boolean timeFormatDisplayPM = time_PM.getText().toLowerCase().contains("pm");
        soft.assertTrue(timeFormatDisplayPM);

        soft.assertAll();

    }
}
