package bmTestingPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdatePage {
	
	@FindBy(id = "update")
	private WebElement ID;
	
	@FindBy(id = "uName")
	private WebElement Name;

	@FindBy(id = "uFirstItem")
	private WebElement Item1;
	
	@FindBy(id = "uSecondItem")
	private WebElement Item2;
	
	@FindBy(id = "uEdible")
	private WebElement Edible;
	
	@FindBy(xpath = "/html/body/div[3]/div[1]/div[2]/button[1]")
	private WebElement UpdateBtn;
	
	@FindBy(xpath = "/html/body/div[3]/div[1]/div[2]/button[2]")
	private WebElement ClearBtn;

	public void updateBM(Long id, String name, String item1, String item2, String edible) {
		String Id = id.toString();
		ID.sendKeys(Id);
		Name.sendKeys(name);
		Item1.sendKeys(item1);
		Item2.sendKeys(item2);
		Edible.sendKeys(edible);
	}
	
	public WebElement getID() {
		return ID;
	}

	public void setID(WebElement iD) {
		ID = iD;
	}
	
	public WebElement getName() {
		return Name;
	}

	public void setName(WebElement name) {
		Name = name;
	}

	public WebElement getItem1() {
		return Item1;
	}

	public void setItem1(WebElement item1) {
		Item1 = item1;
	}

	public WebElement getItem2() {
		return Item2;
	}

	public void setItem2(WebElement item2) {
		Item2 = item2;
	}

	public WebElement getEdible() {
		return Edible;
	}

	public void setEdible(WebElement edible) {
		Edible = edible;
	}
	
	public WebElement getUpdate() {
		return UpdateBtn;
	}

	public WebElement getClearBtn() {
		return ClearBtn;
	}
}