package bmTestingPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeletePage {

	@FindBy(id = "delete")
	private WebElement ID;
	
	@FindBy(xpath = "/html/body/div[3]/div[1]/div[2]/button[1]")
	private WebElement DeleteBtn;
	
		@FindBy(xpath = "/html/body/div[3]/div[1]/div[2]/button[2]")
	private WebElement ClearBtn;
	
	public void deleteBM(Long id) {
		String Id = id.toString();
		ID.sendKeys(Id);
	}
	
	public WebElement getID() {
		return ID;
	}

	public void setID(WebElement iD) {
		ID = iD;
	}
	
	public WebElement getDeleteBtn() {
		return DeleteBtn;
	}

	public WebElement getClearBtn() {
		return ClearBtn;
	}

	
}
