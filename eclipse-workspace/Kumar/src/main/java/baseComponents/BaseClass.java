package baseComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
public WebDriver driver;

public void openBrowser()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Siva Kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https:/web-develop.dev.pergola.magnolia.com/watch/project/project-1/?dev-token=DvAJpdCkrn2WF5oNKhPU");
}
public void checkpageTitle()
{
String actualtitle =driver.getTitle();
System.out.println(actualtitle);
if(actualtitle.equals("https://web-develop.dev.pergola.magnolia.com/watch"))
System.out.println("Navigated to watch home page");
}
}
