package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.Reporting;

public class GenericWrappers extends Reporting implements Wrappers{
	
	public static RemoteWebDriver driver;
	public static Properties prop;

	int i= 1;
	
	@Override
	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
		
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else if(browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
					
			driver.manage().window().maximize();
			
			driver.get(url);
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//System.out.println("The browser is "+browser+" launched with the url "+url+" sucessfully ");
			reportStep("The browser is "+browser+" launched with the url "+url+" sucessfully ", "pass");
		} catch (SessionNotCreatedException e) {
			//System.err.println("The browser is "+browser+" is not launched with the url "+url+" due to session not created");
			reportStep("The browser is "+browser+" is not launched with the url "+url+" due to session not created", "fail");
		}catch (InvalidArgumentException e) {
			
			//System.err.println("The browser "+browser+" is not launched with the url "+url+" does not contains http/https");
			reportStep("The brower "+browser+" is not launched with the url "+url+" does not contains http/https", "fail");
			// TODO: handle exception
		}catch (WebDriverException e) {
			//System.err.println("The browser "+browser+" is not launched due to unknown error");
			reportStep("The brower "+browser+" is not launched due to unknown error", "fail");
		}
		
	}

	@Override
	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementById(idValue).sendKeys(data, Keys.TAB);
			
			//System.out.println("The element with id "+idValue+" is enetered with "+data);
			reportStep("The element with id "+idValue+" is enetered with "+data, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+idValue+" is not found in the DOM");
			reportStep("The element with id "+idValue+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not visible in the application");
			reportStep("The element with id "+idValue+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id " +idValue+" is not interactable in the application");
			reportStep("The element with id " +idValue+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not stable in the application");
			reportStep("The element with id "+idValue+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not enetered with the data "+data+" due to unknown error");
			reportStep("The element with id "+idValue+" is not enetered with the data "+data+" due to unknown error", "fail");
		}	
	}
		
	
	@Override
	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(nameValue).sendKeys(data, Keys.TAB);
			
			//System.out.println("The element with name "+nameValue+" is enetered with "+data);
			reportStep("The element with name "+nameValue+" is enetered with "+data, "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name " +nameValue+" is not found in DOM");
			reportStep("The element with name " +nameValue+" is not found in DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not found in application");
			reportStep("The element with name "+nameValue+" is not found in application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not interactbale in application");
			reportStep("The element with name "+nameValue+" is not interactbale in application", "fail");
		}catch (StaleElementReferenceException e) {
			//System.err.println("The element with name "+nameValue+" is not stable in the application");
			reportStep("The element with name "+nameValue+" is not stable in the application", "fail");
			// TODO: handle exception
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with name " +nameValue+ " is not entered with the " +data+ " due to unknow error");
			reportStep("The element with name " +nameValue+ " is not entered with the " +data+ " due to unknow error", "fail");
		}
		
	}

	@Override
	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			
			//System.out.println("The element with xpath "+xpathValue+ "is entered " +data);
			reportStep("The element with xpath "+xpathValue+ "is entered " +data, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block	
			//System.err.println("The element with xpath "+xpathValue+" is not found in DOM");
			reportStep("The element with xpath "+xpathValue+" is not found in DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath " +xpathValue+ " is not visisble in application");
			reportStep("The element with xpath " +xpathValue+ " is not visisble in application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath " +xpathValue+ " is not interactable in application");
			reportStep("The element with xpath " +xpathValue+ " is not interactable in application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+ " is not stable in application");
			reportStep("The element with xpath "+xpathValue+ " is not stable in application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath " +xpathValue+ " is not entered with the " +data+ " due to unknow error");
			reportStep("The element with xpath " +xpathValue+ " is not entered with the " +data+ " due to unknow error", "fail");
		}
	}

	@Override
	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		
		try {
			String actualTitle = driver.getTitle();
			
			if(actualTitle.equals(title)) {
				//System.out.println("The title of the page " +actualTitle+ " is matched with expected title " +title);
				reportStep("The title of the page " +actualTitle+ " is matched with expected title " +title, "pass");
			}else { 
				//System.err.println("The title of the page " +actualTitle+ " is not matched with expected title " +title);
				reportStep("The title of the page " +actualTitle+ " is not matched with expected title " +title, "fail");
			}
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The title of the page "+title+ " is not verified due to unknow error");
			reportStep("The title of the page "+title+ " is not verified due to unknow error", "fail");
		}
		
	}

	@Override
	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		
		try {
			String actualText = driver.findElementById(id).getText();
			if(actualText.equals(text)) {
				System.out.println("The element with id " +id+ " is holding the text " +actualText+ " is matched with expected text " +text);
			}else {
				System.err.println("The element with id" +id+ " is holding the text " +actualText+ " is not matched with expected text " +text);
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with id " +id+ " is not found in DOM");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with id " +id+ " is not visible in application");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with id " +id+ " is not interactable in application");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with id " +id+ " is not stable in application");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with id " +id+ " is not verified with expected text "+text+" due to unknown errror");
		}
		
	}

	@Override
	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		
		try {
			
			String actualText = driver.findElementByXPath(xpath).getText();
			if(actualText.equals(text)) {
				//System.out.println("The element with xpath " +xpath+ " is holding the text " +actualText+ " is matched with expected text " +text);
				reportStep("The element with xpath " +xpath+ " is holding the text " +actualText+ " is matched with expected text " +text, "pass");
			}else {
				//System.err.println("The element with xpath " +xpath+ " is  holding the text " +actualText+ " is not matched with expected text " +text);
				reportStep("The element with xpath " +xpath+ " is  holding the text " +actualText+ " is not matched with expected text " +text, "fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			  //System.err.println("The element with xpath " +xpath+ " is not found in DOM");
			  reportStep("The element with xpath " +xpath+ " is not found in DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath " +xpath+ " is not visisble in application");
				reportStep("The element with xpath " +xpath+ " is not visisble in application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
				//System.err.println("The element with xpath " +xpath+ " is not interactable in application");
				reportStep("The element with xpath " +xpath+ " is not interactable in application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			  	//System.err.println("The element with xpath " +xpath+ " is not stable in application");
			  	reportStep("The element with xpath " +xpath+ " is not stable in application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
				//System.err.println("The element with xpath " +xpath+ " is not verified due to unknown error");
				reportStep("The element with xpath " +xpath+ " is not verified due to unknown error", "fail");
		}
		
	}

	@Override
	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		
		try {
			String actualText = driver.findElementByXPath(xpath).getText();
			if(actualText.contains(text)) {
			//System.out.println("The element with xpath "+xpath+" is holding the text "+actualText+" contains expected text "+text);
			reportStep("The element with xpath "+xpath+" is holding the text "+actualText+" contains expected text "+text, "pass");
			}else {
				//System.err.println("The element with the xpath " +xpath+ " is not holding the text " +actualText+ " within expected text " +text);
				reportStep("The element with the xpath " +xpath+ " is not holding the text " +actualText+ " within expected text " +text, "fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block	
				//System.err.println("The element with xpath " +xpath+ " is not found in DOM");
				reportStep("The element with xpath " +xpath+ " is not found in DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath " +xpath+ " is not visisble in application");
			reportStep("The element with xpath " +xpath+ " is not visisble in application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath " +xpath+ " is not interactable in application");
			reportStep("The element with xpath " +xpath+ " is not interactable in application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath " +xpath+ " is not stable in application");
			reportStep("The element with xpath " +xpath+ " is not stable in application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath " +xpath+ " is not verified due to unknown error");
			reportStep("The element with xpath " +xpath+ " is not verified due to unknown error", "fail");
		}
	}

	@Override
	public void clickById(String id) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementById(id).click();
			
			System.out.println("The Element with id "+id+" is clicked");
			reportStep("The Element with id "+id+" is clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with id " +id+ " is not found in DOM");
			reportStep("The Element with id " +id+ " is not found in DOM", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The Element with id "+id + " is not clickable in the application");
			reportStep("The Element with id "+id + " is not clickable in the application", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with id " +id+ " is not visisble in Application");
			reportStep("The Element with id " +id+ " is not visisble in Application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with id "+id+ " is not interactable in application");
			reportStep("The Element with id "+id+ " is not interactable in application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with id " +id+ " is not stable in application");
			reportStep("The Element with id " +id+ " is not stable in application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with id " +id+ " is not clicked due to unknown error");
			reportStep("The Element with id " +id+ " is not clicked due to unknown error", "fail");
		}
		
		
	}

	@Override
	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByClassName(classVal).click();
			
			//System.out.println("The element with class " +classVal+ " is clicked");
			reportStep("The element with class " +classVal+ " is clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with class "+classVal+ " is not found in DOM");
			reportStep("The element with class "+classVal+ " is not found in DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with class " +classVal+ " is not visible in application");
			reportStep("The Element with class " +classVal+ " is not visible in application", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The Element with class " +classVal+ " is not clickable in the application");
			reportStep("The Element with class " +classVal+ " is not clickable in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println(" The Element with class "+classVal+ " is not interactable in application");
			reportStep("The Element with class "+classVal+ " is not interactable in application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with class " +classVal+ " is not stable in application");
			reportStep("The Element with class " +classVal+ " is not stable in application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with class " +classVal+ " is not clicked due to unknown error");
			reportStep("The Element with class " +classVal+ " is not clicked due to unknown error", "fail");
		}
		
	}

	@Override
	public void clickByName(String name) {
		// TODO Auto-generated method stub
	try {
		driver.findElementByName(name).click();
		
		//System.out.println("The element with name " +name+ " is clicked");
		reportStep("The element with name " +name+ " is clicked", "pass");
	} catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		//System.err.println("The Element with name "+name+ " is not found in DOM" );
		reportStep("The Element with name "+name+ " is not found in DOM", "fail");
	}catch (ElementNotVisibleException e) {
		// TODO: handle exception
		//System.err.println("The Element with name " +name+ " is not visible in application");
		reportStep("The Element with name " +name+ " is not visible in application", "fail");
	}catch (ElementClickInterceptedException e) {
		// TODO: handle exception
		//System.err.println("The Element with name " +name+ " is not clickable in the application");
		reportStep("The Element with name " +name+ " is not clickable in the application", "fail");
	}catch (ElementNotInteractableException e) {
		// TODO: handle exception
		//System.err.println("The Element with name "+name+ " is not interactable in application");
		reportStep("The Element with name "+name+ " is not interactable in application", "fail");
	}catch (StaleElementReferenceException e) {
		// TODO: handle exception
		//System.err.println("The Element with name " +name+ " is not stable in application");
		reportStep("The Element with name " +name+ " is not stable in application", "fail");
	}catch (WebDriverException e) {
		// TODO: handle exception
		//System.err.println("The Element with name " +name+ " is not clicked due to unknown error");
		reportStep("The Element with name " +name+ " is not clicked due to unknown error", "fail");
	}
	
}

	@Override
	public void clickByLink(String name) {
		// TODO Auto-generated method stub
	try {
		driver.findElementByLinkText(name).click();
	
		//System.out.println("The element with link text " +name+ " is clicked");
		reportStep("The element with link text " +name+ " is clicked", "pass");
	} catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		//System.err.println("The Element with link text "+name+ " is not found in DOM" );
		reportStep("The Element with link text "+name+ " is not found in DOM", "fail");
	}catch (ElementNotVisibleException e) {
		// TODO: handle exception
		//System.err.println("The Element with link text " +name+ " is not visible in application");
		reportStep("The Element with link text " +name+ " is not visible in application", "fail");
	}catch (ElementClickInterceptedException e) {
		// TODO: handle exception
		//System.err.println("The Element with link text " +name+ " is not clickable in the application");
		reportStep("The Element with link text " +name+ " is not clickable in the application", "fail");
	}catch (ElementNotInteractableException e) {
		// TODO: handle exception
		//System.err.println("The Element with link text "+name+ " is not interactable in application");
		reportStep("The Element with link text "+name+ " is not interactable in application", "fail");
	}catch (StaleElementReferenceException e) {
		// TODO: handle exception
		//System.err.println("The Element with link text " +name+ " is not stable in application");
		reportStep("The Element with link text " +name+ " is not stable in application", "fail");
	}catch (WebDriverException e) {
		// TODO: handle exception
		//System.err.println("The Element with link text " +name+ " is not clicked due to unknown error");
		reportStep("The Element with link text " +name+ " is not clicked due to unknown error", "fail");
	}
	
}

	@Override
	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByLinkText(name).click();
		
			//System.out.println("The element with name " +name+ " is clicked");
			reportStep("The element with name " +name+ " is clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with name "+name+ " is not found in DOM" );
			reportStep("The Element with name "+name+ " is not found in DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with name " +name+ " is not visible in application");
			reportStep("The Element with name " +name+ " is not visible in application", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The Element with name " +name+ " is not clickable in the application");
			reportStep("The Element with name " +name+ " is not clickable in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with name  "+name+ " is not interactable in application");
			reportStep("The Element with name  "+name+ " is not interactable in application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with name " +name+ " is not stable in application");
			reportStep("The Element with name " +name+ " is not stable in application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with name " +name+ " is not clicked due to unknown error");
			reportStep("The Element with name " +name+ " is not clicked due to unknown error", "fail");
	    }
		
}

	@Override
	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
	
		try {
			driver.findElementByXPath(xpathVal).click();		
			//System.out.println("The element with xpath " +xpathVal+ "is clicked");
			reportStep("The element with xpath " +xpathVal+ "is clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with xpath "+xpathVal+ "is not found in DOM" );
			reportStep("The Element with xpath "+xpathVal+ "is not found in DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath " +xpathVal+ "is not visible in application");
			reportStep("The Element with xpath " +xpathVal+ "is not visible in application", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath " +xpathVal+ "is not clickable in the application");
			reportStep("The Element with xpath " +xpathVal+ "is not clickable in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath "+xpathVal+ " is not interactable in application");
			reportStep("The Element with xpath "+xpathVal+ " is not interactable in application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath " +xpathVal+ " is not stable in application");
			reportStep("The Element with xpath " +xpathVal+ " is not stable in application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath " +xpathVal+ " is not clicked due to unknown error");
			reportStep("The Element with xpath " +xpathVal+ " is not clicked due to unknown error", "fail");
		}
}

	@Override
	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByXPath(xpathVal).click();			
			//System.out.println("The element with xpath " +xpathVal+ " is clicked");
			reportStep("The element with xpath " +xpathVal+ " is clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with xpath"+xpathVal+ " is not found in DOM" );
			reportStep("The Element with xpath"+xpathVal+ " is not found in DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath " +xpathVal+ " is not visible in application");
			reportStep("The Element with xpath " +xpathVal+ " is not visible in application", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath " +xpathVal+ " is not clickable in the application");
			reportStep("The Element with xpath " +xpathVal+ " is not clickable in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath "+xpathVal+ " is not interactable in application");
			reportStep("The Element with xpath "+xpathVal+ " is not interactable in application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath " +xpathVal+ " is not stable in application");
			reportStep("The Element with xpath " +xpathVal+ " is not stable in application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath " +xpathVal+ " is not clicked due to unknown error");
			reportStep("The Element with xpath " +xpathVal+ " is not clicked due to unknown error", "fail");
		}

}

	@Override
	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		String Text = null;
		try {
			 Text = driver.findElementById(idVal).getText();
			//System.out.println("The Element with " +idVal+ " is holding the Text"+Text);
			reportStep("The Element with " +idVal+ " is holding the Text"+Text, "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with id "+idVal+ " is not found in DOM");
			reportStep("The Element with id "+idVal+ " is not found in DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Elemnet with id " +idVal+ " is not visible in application ");
			reportStep("The Elemnet with id " +idVal+ " is not visible in application ", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with id " +idVal+ " is not interactable in application");
			reportStep("The Element with id " +idVal+ " is not interactable in application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with id " +idVal+ " is not stable in application");
			reportStep("The Element with id " +idVal+ " is not stable in application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with id " +idVal+ " is not verifeied due to unknown error");
			reportStep("The Element with id " +idVal+ " is not verifeied due to unknown error", "fail");
		}
		
		return Text;
	
	}

	@Override
	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String Text = null;
		try {
			Text = driver.findElementByXPath(xpathVal).getText();
			//System.out.println("The Element with xpath " +xpathVal+ " is holding the Text "+Text);
			reportStep("The Element with xpath " +xpathVal+ " is holding the Text "+Text, "pass");
		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with xpath "+xpathVal+ " is not found in DOM");
			reportStep("The Element with xpath "+xpathVal+ " is not found in DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Elemnet with xpath " +xpathVal+ " is not visible in application ");
			reportStep("The Elemnet with xpath " +xpathVal+ " is not visible in application ", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath " +xpathVal+ " is not interactable in application ");
			reportStep("The Element with xpath " +xpathVal+ " is not interactable in application ", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath " +xpathVal+ " is not stable in application");
			reportStep("The Element with xpath " +xpathVal+ " is not stable in application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath " +xpathVal+ " is not verifeied due to unknown error");
			reportStep("The Element with xpath " +xpathVal+ " is not verifeied due to unknown error", "fail");
		}
		
		return Text;
	}

	@Override
	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		
		try {
			WebElement data= driver.findElementById(id);
			Select sel = new Select(data);
			sel.selectByVisibleText(value);
			//System.out.println("The Element with id " +id+ " is selected with visible text "+value);
			reportStep("The Element with id " +id+ " is selected with visible text "+value, "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with id "+id+ " is not found in DOM");
			reportStep( "The Element with id "+id+ " is not found in DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with id " +id+ " is visible in application");
			reportStep("The Element with id " +id+ " is visible in application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with id " +id+ " is not interactable in application");
			reportStep("The Element with id " +id+ " is not interactable in application", "fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The Element with id " +id+ " is not selectable with" +value);
			reportStep("The Element with id " +id+ " is not selectable with" +value, "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with id " +id+ " is not stable in application");
			reportStep("The Element with id " +id+ " is not stable in application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle 
            //System.err.println("The Element with id " +id+ " is not selected with " +value+ " due to unknown error");
            reportStep("The Element with id " +id+ " is not selected with " +value+ " due to unknown error", "fail");
		}
		
	}

	@Override
	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		
		try {
			WebElement data= driver.findElementById(id);
			Select sel = new Select(data);
			sel.selectByIndex(value);
			//System.out.println("The Element with id " +id+ " is selected with index"+value);
			reportStep("The Element with id " +id+ " is selected with index"+value, "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with id "+id+ " is not found in DOM");
			reportStep("The Element with id "+id+ " is not found in DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with id " +id+ " is not visible in application");
			reportStep("The Element with id " +id+ " is not visible in application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with id " +id+ " is not interactable in application");
			reportStep("The Element with id " +id+ " is not interactable in application", "fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The Element with id " +id+ " is not selectable with" +value);
			reportStep("The Element with id " +id+ " is not selectable with" +value, "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with id " +id+ " is not stable in application");
			reportStep("The Element with id " +id+ " is not stable in application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle 
           // System.err.println("The Element with id " +id+ " is not selected with " +value+ " due to unknown error");
            reportStep("The Element with id " +id+ " is not selected with " +value+ " due to unknown error", "fail");
		}
	}

	@Override
	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		
		try {
			Set<String> allwinids = driver.getWindowHandles();
			for(String eachid : allwinids) {
				
				driver.switchTo().window(eachid);
				break;
			}
			//System.out.println("Switched to an parent window");
			reportStep("Switched to an parent window", "pass");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("Unable to switch to an parent window due to no such window present");
			reportStep("Unable to switch to an parent window due to no such window present", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Unable to switch to an parent window due to unknown error");
			reportStep("Unable to switch to an parent window due to unknown error", "fail");
		}
		
	}

	@Override
	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> allwinids = driver.getWindowHandles();
			for(String eachid : allwinids) {
				driver.switchTo().window(eachid);
			}
			//System.out.println("Switched to an last window");
			reportStep("Switched to an last window","pass");
		}catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("Unable to switch to an parent window due to no such window present");
			reportStep("Unable to switch to an parent window due to no such window present", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Unable to switch to an parent window due to unknown error");
			reportStep("Unable to switch to an parent window due to unknown error", "fail");
		}
	}

	@Override
	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
			//System.out.println("Alert is acceppted succesfully");
			reportStep("Alert is acceppted succesfully", "pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("Alert is not opened in application");
			reportStep("Alert is not opened in application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Alert is not opened in application due to unknown error");
			reportStep("Alert is not opened in application due to unknown error", "fail");
		}
		
	}

	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
			//System.out.println("Alert is dismissed succesfully");
			reportStep("Alert is dismissed succesfully", "pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("Alert is not opened in application");
			reportStep("Alert is not opened in application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Alert is not opened in application due to unknown error");
			reportStep("Alert is not opened in application due to unknown error", "fail");
		}
	}

	@Override
	public String getAlertText() {
		// TODO Auto-generated method stub
		String text = null;
		try {
		    text = driver.switchTo().alert().getText();
			//System.out.println("The alert is holding the text" +text);
			reportStep("The alert is holding the text" +text, "pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("No such alert is opened in application");
			reportStep("No such alert is opened in application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("No such alert is opened in application due to unknown error");
			reportStep("No such alert is opened in application due to unknown error", "fail");
		}
		return text;
	}

	@Override
	public long  takeSnap()  {
		// TODO Auto-generated method stub
		long number=0;
		try {
			 number =(long) (Math.floor(Math.random()*100000000)+100000);
			File tmp =  driver.getScreenshotAs(OutputType.FILE);
			File dest = new File("./Results_Updated/screenshot/"+number+".png");
			FileUtils.copyFile(tmp, dest);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("Screenshot has not been captured due to unknown error");
			reportStep("Screenshot has not been captured due to unknown error", "fail", false);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
		}
		return number;
		
	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			//System.out.println("Active brower has been closed");
			reportStep("Active brower has been closed", "pass",false);
			
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Unale to close the active browser due to unknown error");
			reportStep("Unable to close the active browser due to unknown error", "fail", false);
		}
	}

	@Override
	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			//System.out.println("All active browsers has been closed");
			reportStep("All active browsers has been closed", "pass", false);
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Unable to close the browsers due to unknown error");
			reportStep("Unable to close the browsers due to unknown error", "fail", false);
		}
	}

	@Override
	public void waitproperty(long time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Override
	public void SelectVisibileTextByXpath(String XpathValue, String value) {
		// TODO Auto-generated method stub

			try {
				WebElement data= driver.findElementByXPath(XpathValue);
				Select sel = new Select(data);
				sel.selectByVisibleText(value);
				//System.out.println("The element with Xpath "+XpathValue+" is selected with VisibleText " +value);
				reportStep("The element with Xpath "+XpathValue+" is selected with VisibleText " +value, "pass");
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				//System.err.println("The element with Xpath "+XpathValue+ " is not found in DOM");
				reportStep("The element with Xpath "+XpathValue+ " is not found in DOM", "fail");
			}catch (ElementNotVisibleException e) {
				// TODO: handle exception
				//System.err.println("The element with Xpath " +XpathValue+ " is not visible in application");
				reportStep("The element with Xpath " +XpathValue+ " is not visible in application", "fail");
			}catch (ElementNotInteractableException e) {
				// TODO: handle exception
				//System.err.println("The element with Xpath " +XpathValue+ " is not interactable in application");
				reportStep("The element with Xpath " +XpathValue+ " is not interactable in application", "fail");
			}catch (ElementNotSelectableException e) {
				// TODO: handle exception
				//System.err.println("The element with Xpath " +XpathValue+ " is not selectable with" +value);
				reportStep("The element with Xpath " +XpathValue+ " is not selectable with" +value, "fail");
			}catch (StaleElementReferenceException e) {
				// TODO: handle exception
				//System.err.println("The element with Xpath " +XpathValue+ " is not stable in application");
				reportStep("The element with Xpath " +XpathValue+ " is not stable in application", "fail");
			}catch (WebDriverException e) {
				// TODO: handle 
	            //System.err.println("The element with Xpath " +XpathValue+ " is not selected with " +value+ " due to unknown error");
	            reportStep("The element with Xpath " +XpathValue+ " is not selected with " +value+ " due to unknown error", "fail");
			}
		}

	@Override
	public void selectVisibileTextByName(String name, String value) {
		// TODO Auto-generated method stub

		try {
			WebElement data= driver.findElementByName(name);
			Select sel = new Select(data);
			sel.selectByVisibleText(value);
			//System.out.println("The element with name " +name+ " is selected with VisibleText " +value);		
			reportStep("The element with name " +name+ " is selected with VisibleText " +value, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name "+name+ " is not found in DOM");
			reportStep("The element with name "+name+ " is not found in DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with name " +name+ " is not visible in application");
			reportStep("The element with name " +name+ " is not visible in application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with name " +name+ " is not interactable in application");
			reportStep("The element with name " +name+ " is not interactable in application", "fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with name " +name+ " is not selectable with" +value);
			reportStep("The element with name " +name+ " is not selectable with" +value, "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with name " +name+ " is not stable in application");
			reportStep("The element with name " +name+ " is not stable in application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle 
           // System.err.println("The element with name " +name+ " is not selected with " +value+ " due to unknown error");
            reportStep("The element with name " +name+ " is not selected with " +value+ " due to unknown error", "fail");
		}
	}

	@Override
	public void switchToFrame(String Value) {
		// TODO Auto-generated method stub
		
		try {
			WebElement MyFrame = driver.findElementByXPath(Value);
			driver.switchTo().frame(MyFrame);
			//System.out.println("Driver switched to frame");
			reportStep("Driver switched to frame", "pass");
		} catch (NoSuchFrameException e) {
			// TODO Auto-generated catch block
			//System.err.println("Driver was not switched to frame");
			reportStep("Driver was not switched to frame", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Driver was not switched to frame due to unknown error");
			reportStep("Driver was not switched to frame due to unknown error", "fail");
		}

		
	}

	@Override
	public void defaultContent() {
		// TODO Auto-generated method stub
	
		try {
			driver.switchTo().defaultContent();
			//System.out.println("Driver switched to previous frame");
			reportStep("Driver switched to previous frame", "pass");
		} catch (NoSuchFrameException e) {
			// TODO Auto-generated catch block
			//System.err.println("Driver was not switched to previous frame");
			reportStep("Driver was not switched to previous frame", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Driver was not switched to previous frame due to unknown error");
			reportStep("Driver was not switched to previous frame due to unknown error", "fail");
		}
	}

	@Override
	public void refresh() {
		// TODO Auto-generated method stub
		
		try {
			driver.navigate().refresh();
			//System.out.println("Browser got refreshed");
			reportStep("Browser got refreshed","pass");
		} catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The browser is not launched due to session not created");
			reportStep("The browser is not launched due to session not created", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The brower is not launched does not contains http/https");
			reportStep("The brower is not launched does not contains http/https", "fail");
		}
	}

	@Override
	public void sendMsg(String Value) {
		// TODO Auto-generated method stub
		
		try {
			driver.switchTo().alert().sendKeys(Value);
			//System.out.println("Alert is stored wth value" +Value);
			reportStep("Alert is stored wth value" +Value, "pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
		//	System.err.println("Alert is not stored wth value" +Value);
			reportStep("Alert is not stored wth value" +Value, "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Alert is stored wth value" +Value+ "due to unknown error");
			reportStep("Alert is stored wth value" +Value+ "due to unknown error", "fail");
	}
}

	@Override
	public void mouseHover(String xpath) {
		// TODO Auto-generated method stub
		
		try {
			Actions builder = new Actions(driver);
			WebElement name = driver.findElementByXPath(xpath);
			builder.moveToElement(name).perform();
			//System.out.println("pointing a cursor towards xpath" +xpath);
			reportStep("pointing a cursor towards xpath" +xpath, "pass");
			
		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Xpath "+xpath+ " is not found in DOM");
			reportStep("The element with Xpath "+xpath+ " is not found in DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath " +xpath+ " is not visible in application");
			reportStep("The element with Xpath " +xpath+ " is not visible in application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath " +xpath+ " is not interactable in application");
			reportStep("The element with Xpath " +xpath+ " is not interactable in application", "fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath " +xpath+ " is not selectable with");
			reportStep("The element with Xpath " +xpath+ " is not selectable with", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath " +xpath+ " is not stable in application");
			reportStep("The element with Xpath " +xpath+ " is not stable in application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle 
            //System.err.println("The element with Xpath " +xpath+ " is not selected due to unknown error");
            reportStep("The element with Xpath " +xpath+ " is not selected due to unknown error", "fail");
		}
	}

	@Override
	public void selectValueByXpath(String Xpath, String value) {
		// TODO Auto-generated method stub

		try {
			WebElement data= driver.findElementByXPath(Xpath);
			Select sel = new Select(data);
			sel.selectByValue(value);
			//System.out.println("The element with name " +name+ " is selected with VisibleText " +value);		
			reportStep("The element with xpath " +Xpath+ " is selected with VisibleText " +value, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name "+name+ " is not found in DOM");
			reportStep("The element with xpath "+Xpath+ " is not found in DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with name " +name+ " is not visible in application");
			reportStep("The element with xpath " +Xpath+ " is not visible in application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with name " +name+ " is not interactable in application");
			reportStep("The element with xpath " +Xpath+ " is not interactable in application", "fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with name " +name+ " is not selectable with" +value);
			reportStep("The element with xpath " +Xpath+ " is not selectable with" +value, "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with name " +name+ " is not stable in application");
			reportStep("The element with xpath " +Xpath+ " is not stable in application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle 
           // System.err.println("The element with name " +name+ " is not selected with " +value+ " due to unknown error");
            reportStep("The element with xpath " +Xpath+ " is not selected with " +value+ " due to unknown error", "fail");
		}
	}
	
	public void loadObject() {
		 
		try {
			 prop = new Properties();
			prop.load(new FileInputStream("./src/test/java/object.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void unloadObject() {
		prop=null;
	}

	
}

