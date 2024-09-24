package example.StepDefs;

import example.Pages.P01_Sittings_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;


public class D01_Temperature_change {

    P01_Sittings_Page sittingsPage  =new P01_Sittings_Page();
    SoftAssert soft = new SoftAssert();

    /*
    @Given("click on temperature arrow")
    public void click_on_temperature_arrow(){

        sittingsPage.temperatureDropDown().click();
    }

*/
    /*
    @When("choosing F unit")
    public void choosingFUnit() {

        sittingsPage.temperatureF().click();
    }
*/
    /*
    @And("click on done button")
    public void clickOnDoneButton() {

        sittingsPage.doneButton().click();
    }
*/
    /*
    @And("confirm privacy policy")
    public void confirmPrivacyPolicy() {

        try {
            // Check if the forecast page is displayed
            WebElement forecastPageTitle = Hooks.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout"));
            if (forecastPageTitle.isDisplayed()) {
                System.out.println("Weather forecast page is displayed. Executing something...");
                Hooks.driver.findElement(By.xpath("//android.widget.TextView[@text=\"GOT IT\"]")).click();

            }
        } catch (NoSuchElementException e) {
            // Handle the case where the forecast page is not displayed
            System.out.println("Weather forecast page is not displayed.");
        }

    }
    */
    /*
    @Then("validate unit is F")
    public void validateUnitIsF() throws InterruptedException {

        Thread.sleep(5000);
        WebElement temper_unit = Hooks.driver.findElement(By.id("com.info.weather.forecast:id/tv_current_temper_unit"));
        soft.assertTrue(temper_unit.isDisplayed());
        soft.assertAll();

    }
*/





    @Given("click on temperature arrow")
    public void click_on_temperature_arrow() {
        sittingsPage.temperatureDropDown().click();

    }

    @When("choosing F unit")
    public void choosing_f_unit() {
        sittingsPage.temperatureF().click();

    }

    @When("click on done button")
    public void click_on_done_button() {
        sittingsPage.doneButton().click();

    }

    @When("confirm privacy policy")
    public void confirm_privacy_policy() {

        try {
            // Check if the forecast page is displayed
            WebElement forecastPageTitle = Hooks.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout"));
            if (forecastPageTitle.isDisplayed()) {
                System.out.println("Weather forecast page is displayed. Executing something...");
                Hooks.driver.findElement(By.xpath("//android.widget.TextView[@text=\"GOT IT\"]")).click();

            }
        } catch (NoSuchElementException e) {
            // Handle the case where the forecast page is not displayed
            System.out.println("Weather forecast page is not displayed.");
        }


    }
    @Then("validate unit is F")
    public void validate_unit_is_f() throws InterruptedException {

        Thread.sleep(5000);
        WebElement temper_unit = Hooks.driver.findElement(By.id("com.info.weather.forecast:id/tv_current_temper_unit"));
        soft.assertTrue(temper_unit.isDisplayed());
        soft.assertAll();
    }

}
