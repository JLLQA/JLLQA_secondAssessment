package bmTestingPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatePage {
	
	@FindBy(id = "Name")
	private WebElement Name;

	@FindBy(id = "firstItem")
	private WebElement Item1;
	
	@FindBy(id = "secondItem")
	private WebElement Item2;
	
	@FindBy(id = "edible")
	private WebElement Edible;
	
	@FindBy(xpath = "//*[@id=\"create\"]")
	private WebElement CreateBtn;
	
	@FindBy(xpath = "/html/body/div[3]/div[1]/div[2]/button[2]")
	private WebElement ClearBtn;

	public void createBM(String name, String item1, String item2, String edible) {
		Name.sendKeys(name);
		Item1.sendKeys(item1);
		Item2.sendKeys(item2);
		Edible.sendKeys(edible);
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
	
	public WebElement getCreate() {
		return CreateBtn;
	}
	
	public WebElement getClear() {
		return ClearBtn;
	}
}
