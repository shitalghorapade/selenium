package seleniumproject11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class project1 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		

	}

}
