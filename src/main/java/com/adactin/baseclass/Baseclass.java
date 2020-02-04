package com.adactin.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass {
	public static WebDriver driver;
	private static String name;
	// browseropen

	public static WebDriver browseropen(String browsername) {

		if (browsername.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +"\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browsername.equalsIgnoreCase("ie")) {

			System.setProperty("webdriver.ie.driver", "E:\\chromedriver_win32\\IEDriverserver.exe");
			driver = new InternetExplorerDriver();
		} else {
			System.out.println("Invalid browsername");
		}
		return driver;

	}
	// applaunch

	public static void applaunch(String url) {
		System.out.println("entered into url");
		driver.get(url);
		driver.manage().window().maximize();
	}
	// browserquit

	public static void browserquit() {
		driver.quit();
	}
	// alert_accept

	public static void alert_accept() {
		Alert clickaccept = driver.switchTo().alert();
		clickaccept.accept();
	}
	// alert_dismiss

	public static void alert_dismiss() {
		Alert clickdismiss = driver.switchTo().alert();
		clickdismiss.dismiss();
	}
	// alert_Writeaccept

	public static void alert_writeaccept(String dialouge) {
		Alert write = driver.switchTo().alert();
		write.sendKeys(dialouge);
		write.accept();
	}
	// singleframe

	public static void single_frame(String namevalue) {
		driver.switchTo().frame(namevalue);

	}
	// scrollingup

	public static void scrollingup(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	// dropdown

	public static void dropDown(WebElement element, String option, String value) {
		Select s = new Select(element);
		try {
			if (option.equals("index")) {
				s.selectByIndex(Integer.parseInt(value));
			} else if (option.equals("value")) {
				s.selectByValue(value);
			} else if (option.equals("text")) {
				s.selectByVisibleText(value);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	// inputonelement

	public static void inputOnElement(WebElement element, String value) {
		element.sendKeys(value);
	}

	// clickonElement

	public static void clickOnElement(WebElement element) {
		try {
			waitforvisibilityofelement(element);
			element.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// clearElement

	public static void clearElement(WebElement element) {
		element.clear();
	}
	// getcurrenturl

	public static void getcurrenturl(String url) {
		driver.getCurrentUrl();

	}
	// getTitle

	public static String getTitle() {
		String title = null;
		try {
			title = driver.getTitle();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return title;
	}
	// getText

	public static void getText(WebElement element) {
		System.out.println(element.getText());
	}
	// radiobutton

	public static void radiobutton(WebElement element) {
		element.click();
	}
	// getoptions

	public static void getoptions(WebElement element) {
		Select y = new Select(element);
		List<WebElement> options = y.getOptions();
		for (WebElement y1 : options) {
			System.out.println(y1.getText());
		}
	}
	// firstSelectedOp

	public static void firstSelectedOp(WebElement element) {
		Select y = new Select(element);
		WebElement firstSelectedOption = y.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());

	}
	// enabledElement

	public static void enabledElement(WebElement check) {
		try {
			boolean enabled = check.isEnabled();
			System.out.println(check + "isEnabled:" + enabled);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	// isSelected

	public static void isSelected(WebElement check) {
		try {
			boolean selected = check.isSelected();
			System.out.println(check + "isSelected:" + selected);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// isDisplayed

	public static void isDisplayed(WebElement Check) {
		boolean displayed = Check.isDisplayed();
		System.out.println(Check + "isDisplayed:" + displayed);
	}
	// navigateto

	public static void navigateto(String url) {
		driver.navigate().to(url);

	}
	// navigateback

	public static void navigateback(String url) {
		driver.navigate().back();
	}
	// navigateforward

	public static void navigateforward() {
		driver.navigate().forward();
	}
	// refreshpage

	public static void refreshpage() {
		driver.navigate().refresh();
	}
	// rightclick

	public static void rightclick() {
		Actions ac1 = new Actions(driver);
		ac1.contextClick().build().perform();
	}
	// doubleclick

	public static void doubleclick(WebElement element) {
		Actions ac2 = new Actions(driver);
		ac2.doubleClick(element).build().perform();
	}
	// clickk

	public static void clickk() {
		Actions ac3 = new Actions(driver);
		ac3.click().build().perform();
	}
	// sendkeysAction

	public static void sendkeysAction(WebElement element, String value) {
		Actions ac4 = new Actions(driver);
		ac4.sendKeys(element, value).build().perform();
	}
	// keypressDown

	public static void keypressDown() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	// keyreleaseUp

	public static void keyreleaseUp() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
	}
	// dragdrop

	public static void dragdrop(WebElement element1, WebElement element2) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(element1, element2).build().perform();

	}
	// waitforvisibilityofelement

	public static void waitforvisibilityofelement(WebElement element) {
		try {
			WebDriverWait wb = new WebDriverWait(driver, 30);
			wb.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// getAttribute

	public static void getAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
	}
	// Screenshot

	public static void Screenshot(String name) throws Exception {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\Users\\User\\workspace_project\\AdactinCucumber\\screenshot\\" + name + ".png");
		FileUtils.copyFile(srcfile, destFile);
	}

	// closee
	public static void closee() {
		driver.close();
	}

}