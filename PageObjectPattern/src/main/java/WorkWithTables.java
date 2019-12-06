import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class WorkWithTables {

    public static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/37529/Desktop/учеба/chromedriver.exe");

        driver.get("https://www.w3schools.com/html/html_tables.asp");
        Tables t=new Tables();
        t.headersOfTheColumns();
        t.sizeOfTheRows();
        t.valuesWithoutAttribute();
        t.valuesWithAttribute();
    }


}
