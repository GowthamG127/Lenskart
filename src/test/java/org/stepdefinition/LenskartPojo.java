package org.stepdefinition;

import org.baseclass.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LenskartPojo extends BaseClass{
	
	public LenskartPojo() {
		PageFactory.initElements(d, this);
	}
	@FindBy(xpath="(//a[@class='LastRowLink--2q7v0c eqjcih getGaData'])[1]")
	private WebElement eyeGlasses;

	@FindBy(xpath="(//span[contains(text(),'Men')])[1]")
	private WebElement men;
	
	@FindBy(xpath="(//span[contains(text(),'PREMIUM')])[1]")
	private WebElement premiumEyeglasses;
	
	@FindBy(xpath="(//a[contains(text(),'Jacobs')])[2]")
	private WebElement johnJacob;
	
	@FindBy(xpath="//span[contains(text(),'Full')]")
	private WebElement fullRim;
	
	@FindBy(xpath="//span[contains(text(),'Aviator')]")
	private WebElement type;
	
	@FindBy(xpath="(//p[@class='ProductTitle--xakon1 dZrMkC'])[4]")
	private WebElement specs;
	
	@FindBy(xpath="//button[@class='PrimaryButtonWrapper--162aiaf cgAlpl']")
	private WebElement selectBtn;
	
	@FindBy(xpath="(//div[@class='Title--1x1rnvd fJUrRA'])[1]")
	private WebElement lensType;
	
	@FindBy(xpath="//div[contains(text(),'BLU Thin')]")
	private WebElement lensPackage;
	
	@FindBy(xpath="//button[@class='PackageButton--ksf3db iDbAVC']")
	private WebElement ctnBtn;
	
	@FindBy(xpath="(//div[@class='Text--173l7i4 zkxId'])[1]")
	private WebElement totalPayable;
	
	@FindBy(xpath="(//div[@class='Text--173l7i4 zkxId'])[2]")
	private WebElement cartAmount;

	public WebElement getEyeGlasses() {
		return eyeGlasses;
	}

	public WebElement getMen() {
		return men;
	}

	public WebElement getPremiumEyeglasses() {
		return premiumEyeglasses;
	}

	public WebElement getJohnJacob() {
		return johnJacob;
	}

	public WebElement getFullRim() {
		return fullRim;
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getSpecs() {
		return specs;
	}

	public WebElement getSelectBtn() {
		return selectBtn;
	}

	public WebElement getLensType() {
		return lensType;
	}

	public WebElement getLensPackage() {
		return lensPackage;
	}

	public WebElement getCtnBtn() {
		return ctnBtn;
	}

	public WebElement getTotalPayable() {
		return totalPayable;
	}

	public WebElement getCartAmount() {
		return cartAmount;
	}
}
