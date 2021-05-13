package com.qa.bm.fe.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	

	public static final String URL = "http://localhost:8080/index.php";

	@FindBy(linkText = "Enter")
	private WebElement EnterBtn;

	public WebElement getEnterBtn(){
		return EnterBtn;
	}

}
