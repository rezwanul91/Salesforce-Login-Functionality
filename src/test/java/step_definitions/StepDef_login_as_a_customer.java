package step_definitions;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import pages.Page_Landing_Page;
import pages.Pages_Customer_Home_Page;

import static org.junit.Assert.assertEquals;

public class StepDef_login_as_a_customer extends Base{
    @Given("I want to go to salesforce landing page")
    public void i_want_to_go_to_salesforce_landing_page() {
        navigateURL(host);
    }

    @When("I mouse hover in login menu")
    public void i_mouse_hover_in_login_menu() {
        mouseHover();
    }

    @Then("I click in salesforce menu")
    public void i_click_in_salesforce_menu() {
        clickSalesfore();
    }

    @Then("I logged in as a customer")
    public void i_logged_in_as_a_customer(DataTable dataTable) {
       Page_Landing_Page.pageLoginField((dataTable.cell(1,0)), dataTable.cell(1,1));


    }

   @Then("I verify I am in salesforce landing page")
    public void i_verify_I_am_in_salesforce_landing_page() {
        String welcomeMsg = getElementText(Pages_Customer_Home_Page.labelTextMessage);
        assertEquals("Quick Look",welcomeMsg);
        System.out.println("Verification done");

    }

}
