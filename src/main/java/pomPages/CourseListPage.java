package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.WebDriverUtility;

public class CourseListPage {
	//Declaration
	@FindBy(xpath = "//h1[normalize-space(text()='Course list')]")
	private WebElement pageHeader;
	
	@FindBy(xpath="//a[text()=' New']")
	private WebElement newButton;
	//%s replace string  data and %d for replace in numeric value
	private String deletePath="//td[text()='+coursename+']/ancestor::tr/descendant::button[text()='Delete']";
	@FindBy(name ="delete")
	private WebElement deleteButton;
	
	@FindBy(xpath = "//h4[text()=' Success!]")
	private WebElement successMessage;
	
	//Intialization
	public CourseListPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//utilization
	public String getPageHeader() {
		return pageHeader.getText();
	}
	public void clickNewButton() {
		newButton.click();
		
		
		
	}
	public void deleteCourse(WebDriverUtility web,String courseName) {
		web.convertPathToWebElement(deletePath, courseName).click();
		deleteButton.click();
	
}
	public String getSuccessMessage() {
		return successMessage.getText();
	}
}
