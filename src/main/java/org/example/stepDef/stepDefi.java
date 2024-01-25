package org.example.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;


import static org.example.Login.*;
import static org.example.productSelect.*;
import static org.example.stepDef.MethodFactory.*;
import static org.example.userCheckoutInfo.*;

public class stepDefi {

    @Given("Open the Chrome and launch the application")
    public void open_the_Chrome_and_launch_the_application() throws Throwable
    {
        initiateBrowser();
        navigateurl();
    }
    @When("Enter the Username and Password")
    public void enterTheUsernameAndPassword() {
        enterText(uId,userName);
        enterText(uPass,password);
    }

    @And("User Enters into the application")
    public void userEntersIntoTheApplication() {
        clickElementById(loginBtn);
    }

    @And("User Select a product randomly")
    public void userSelectAProductRandomly() {
        clickElementByXpath(CartXpath);
    }

    @And("User Click on cart icon and move to Checkout")
    public void userClickOnCartIconAndMoveToCheckout() {
        clickElementByXpath(trolleyXpath);
        clickElementById(checkout);
    }

    @And("Enter the firstname, lastname and postalcode")
    public void enterTheFirstnameLastnameAndPostalcode() {
        enterText(fName,firstName);
        enterText(lName, lastName);
        enterText(pCode, postalCode);
    }

    @And("User Click continue")
    public void userClickContinue() {
        clickElementById(continueBtn);
    }

    @Then("User Click on finish")
    public void userClickOnFinish() {
        clickElementById(finishBtn);
    }
}
