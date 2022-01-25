
package com.adactin.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.adactin.baseclass.Base_Class;
import com.adactin.manager.Page_ObjectManager;
import com.adactin.pom.Book_Hotel;
import com.adactin.pom.Log_Out;
import com.adactin.pom.Login_Page;
import com.adactin.pom.Search_Hotelpage;
import com.adactin.pom.Select_Hotel;
import com.adactin.runner.Test_Runner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Step_Definition extends Base_Class{
	
	public static WebDriver driver = Test_Runner.driver;
	Page_ObjectManager pom = new Page_ObjectManager(driver);
	
	Login_Page lp = new Login_Page(driver);
	Search_Hotelpage sp = new Search_Hotelpage(driver);
	Select_Hotel sh = new Select_Hotel(driver);
	Book_Hotel bh = new Book_Hotel(driver);
    Log_Out lo = new Log_Out(driver);
	

@Given("^user launch the application$")
public void user_launch_the_application()  {
   geturl("https://adactinhotelapp.com/index.php");
    
}

@When("^user enters the valid username in the username field$")
public void user_enters_the_valid_username_in_the_username_field()  {
      input(lp.getUsername(), "Kumaravel12");
  //  input(pom.getLp().getUsername(), "Kumaravel12");
}

@When("^user enters the valid password in the password field$")
public void user_enters_the_valid_password_in_the_password_field()  {
   input(lp.getPassword(), "Vkumara12345!");
    
}

@When("^user is able to click the login button$")
public void user_is_able_to_click_the_login_button()  {
lp.getLogin().click();
	
}

@Then("^user verify the homepage lands on to search hotel$")
public void user_verify_the_homepage_lands_on_to_search_hotel()  {
   
    
}

@When("^user select the valid location values in the location field$")
public void user_select_the_valid_location_values_in_the_location_field()  {
   select(By.xpath("//select[@name='location']"), "New York");
   
}

@When("^user select the valid hotels values in the hotels field$")
public void user_select_the_valid_hotels_values_in_the_hotels_field()  {
   select(By.xpath("//select[@name='hotels']"), "Hotel Sunshine");
   
}

@When("^user select the valid room type values in the room type field$")
public void user_select_the_valid_room_type_values_in_the_room_type_field()  {
   select(By.xpath("//select[@name='room_type']"), "Double");
   
}

@When("^user select the valid number of rooms vlaues in the No\\.Of Rooms field$")
public void user_select_the_valid_number_of_rooms_vlaues_in_the_No_Of_Rooms_field()  {
   select(By.xpath("//select[@name='room_nos']"), "2");
   
}

@When("^user enter the valid check in date vlaues in the check in date field$")
public void user_enter_the_valid_check_in_date_vlaues_in_the_check_in_date_field()  {
   
   
}

@When("^user enter the valid check out data values in the check out data field$")
public void user_enter_the_valid_check_out_data_values_in_the_check_out_data_field()  {
   
   
}

@When("^user select the valid adults room values in the adults per room field$")
public void user_select_the_valid_adults_room_values_in_the_adults_per_room_field()  {
   select(By.xpath("//input[@name='adult_room']"), "2");
   
}

@When("^user select the valid children room values in the children per room field$")
public void user_select_the_valid_children_room_values_in_the_children_per_room_field()  {
   select(By.xpath("//select[@name='child_room']"), "0");
   
}

@When("^user is able to click the search button$")
public void user_is_able_to_click_the_search_button()  {
   sp.getSearch().click();
   
}

@Then("^user verify the search hotel lands on to search page$")
public void user_verify_the_search_hotel_lands_on_to_search_page()  {
   
   
}


@When("^user is able to click  the select button in the select option$")
public void user_is_able_to_click_the_select_button_in_the_select_option()  {
    sh.getButton().click();
    
}

@When("^user is able to click the  continue button$")
public void user_is_able_to_click_the_continue_button()  {
    sh.getConitue().click();
    
}

@Then("^user verify the search hotel lands on to book a hotel$")
public void user_verify_the_search_hotel_lands_on_to_book_a_hotel()  {
    
    
}

@When("^user enter the valid first name in the first name  field$")
public void user_enter_the_valid_first_name_in_the_first_name_field()  {
    input(bh.getFirstname(), "kumara");
    
}

@When("^user enter the valid last name in the last name field$")
public void user_enter_the_valid_last_name_in_the_last_name_field()  {
    input(bh.getLastname(), "vel");
    
}

@When("^user enter the valid billing address in the billing address field$")
public void user_enter_the_valid_billing_address_in_the_billing_address_field()  {
    input(bh.getAddress(), "NO 7 4th cross road");
    
}

@When("^user enter the valid credit card no values in the credit card no field$")
public void user_enter_the_valid_credit_card_no_values_in_the_credit_card_no_field()  {
    input(bh.getCardnumber(), "6080238321001000");
    
}

@When("^user select the valid credit card type in the credit card field$")
public void user_select_the_valid_credit_card_type_in_the_credit_card_field()  {
    select(By.xpath("//select[@name='cc_type']"), "VISA");
    
}

@When("^user select the valid expriy date values in the expriy data field$")
public void user_select_the_valid_expriy_date_values_in_the_expriy_data_field()  {
    select(By.xpath("//select[@name='cc_exp_month']"), "6");
    select(By.xpath("//select[@name='cc_exp_year']"), "2022");
    
}

@When("^user enter the valid cvv number in the cvv number field$")
public void user_enter_the_valid_cvv_number_in_the_cvv_number_field()  {
input(bh.getCvv(), "949");
    
}

@When("^user is able to click the book now button$")
public void user_is_able_to_click_the_book_now_button()  {
bh.getBooknow().click();
    
}

@Then("^user verify the book a hotel land on to booking confirmation page$")
public void user_verify_the_book_a_hotel_land_on_to_booking_confirmation_page()  {
    
    
}

@When("^user is able to click the logout button$")
public void user_is_able_to_click_the_logout_button() {
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
click(lo.getLogout());


	
}

@Then("^user is verify that booking confirmation page lands on to homepage$")
public void user_is_verify_that_booking_confirmation_page_lands_on_to_homepage()  {
    
    
}

}
