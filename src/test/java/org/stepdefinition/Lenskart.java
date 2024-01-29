package org.stepdefinition;

import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.baseclass.base.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Lenskart extends BaseClass{
	
	LenskartPojo l = new LenskartPojo();
	
	@Given("To launch the url of lenskart website")
	public void to_launch_the_url_of_lenskart_website() throws InterruptedException {
	   launchUrl("https://www.lenskart.com/");
	     Thread.sleep(3000);
	}

	@When("Mouseover to the eyeglasses again move to men")
	public void mouseover_to_the_eyeglasses_again_move_to_men() {
	   moveCursor(l.getEyeGlasses());
	   moveCursor(l.getMen());
	     
	}

	@When("Mouseover to premium eyeglasses and click John Jacob in the Brand listed")
	public void mouseover_to_premium_eyeglasses_and_click_John_Jacob_in_the_Brand_listed() throws InterruptedException {
	   moveCursor(l.getPremiumEyeglasses());
	   moveCursor(l.getJohnJacob());
	   clickOnMouse(l.getJohnJacob());
	     Thread.sleep(4000);
	}

	@When("Mouseover to frame type and select Full Rim")
	public void mouseover_to_frame_type_and_select_Full_Rim() {
	   moveCursor(l.getFullRim());
	   clickOnMouse(l.getFullRim());
	}

	@When("Mouseover to frameshape and selct Aviator")
	public void mouseover_to_frameshape_and_selct_Aviator() {
	   d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		moveCursor(l.getType());
	   clickOnMouse(l.getType());
	}

	@When("Select one eyeglass from the grid")
	public void select_one_eyeglass_from_the_grid() throws InterruptedException {
		Thread.sleep(5000);
		clickOnMouse(l.getSpecs());
	}

	@When("A new tab will be open")
	public void a_new_tab_will_be_open() throws InterruptedException {
	   String main = d.getWindowHandle();
	   Set<String> sec = d.getWindowHandles();
	   for(String sub : sec) {
		   if(!sub.equals(main)) {
			   d.switchTo().window(sub);
			   System.out.println("You have successfully select your eyeglass"+"\n"+"Select the lens type and package and proceed to checkout");
			   Thread.sleep(4000);
			   
		   }
	   }
	     
	}

	@When("Mouseover to select lenses button and click on it")
	public void mouseover_to_select_lenses_button_and_click_on_it() {
	   moveCursor(l.getSelectBtn());
	   clickOnMouse(l.getSelectBtn());
	   try {
		   moveCursor(l.getSelectBtn());
	   }
	   catch(NoSuchElementException n) {
		   moveCursor(l.getSelectBtn());
		   clickOnMouse(l.getSelectBtn());
	   }
	    
	}

	@When("A screen will appears and select single vision as lens type")
	public void a_screen_will_appears_and_select_single_vision_as_lens_type() {
		 System.out.println("A Sliding screen slides from the right successfully");
		 clickOnMouse(l.getLensType());
	}

	@When("Now the screen appears as select lens package")
	public void now_the_screen_appears_as_select_lens_package() {
		System.out.println("Select the package");
	}

	@When("Scroll down and select Blue Thin as lens package")
	public void scroll_down_and_select_Blue_Thin_as_lens_package() {
		scrollDown(l.getLensPackage());
		clickOnMouse(l.getLensPackage());
	}

	@When("In the next screen click the continue button")
	public void in_the_next_screen_click_the_continue_button() {
	   clickOnMouse(l.getCtnBtn());
	   System.out.println("You have entered into the cart page");
	}

	@Then("Billing Detais will be shown on the right side and get the total payable amount")
	public void billing_Detais_will_be_shown_on_the_right_side_and_get_the_total_payable_amount() throws InterruptedException {
		Thread.sleep(4000);
		String txt = l.getTotalPayable().getText();
	   String totalAmt = l.getCartAmount().getText();
	   System.out.println(txt+" = "+totalAmt);
	     
	}
}
