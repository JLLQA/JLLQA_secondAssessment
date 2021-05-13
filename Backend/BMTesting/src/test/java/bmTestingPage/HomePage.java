package bmTestingPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	

	@FindBy(linkText = "Enter")
	private WebElement EnterNav;
	
	@FindBy(linkText = "Update")
	private WebElement UpdateNav;

	@FindBy(linkText = "Delete")
	private WebElement DeleteNav;
	
	@FindBy(linkText = "Create")
	private WebElement CreateNav;
	
	public WebElement getEnterNav() {
		return EnterNav;
	}
	
	public WebElement getUpdateNav() {
		return UpdateNav;
	}

	public WebElement getDeleteNav() {
		return DeleteNav;
	}

	public WebElement getCreateNav() {
		return CreateNav;
	}
}
