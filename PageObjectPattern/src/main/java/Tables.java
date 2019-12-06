import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Tables {
    public static WebDriver driver = new ChromeDriver();
    public static void headersOfTheColumns(){
        WebElement table=driver.findElement(By.id("customers"));
        List<WebElement> rows=table.findElements(By.tagName("tr"));
        for(WebElement col : rows) {
            List<WebElement> columns = col.findElements(By.tagName("th"));
            for (WebElement name : columns) {
                String n = name.getText();
                System.out.println(n);
            }
        }
    }
    public static void sizeOfTheRows(){
        WebElement table=driver.findElement(By.id("customers"));
        List<WebElement> rows=table.findElements(By.tagName("tr"));
        System.out.println("Number of rows:"+rows.size());
    }
    public static void valuesWithoutAttribute(){
        WebElement s=driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[2]/td[3]"));
        WebElement s1=driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[4]/td[1]"));
        String n = s.getText();
        String n1=s1.getText();
        System.out.println(n);
        System.out.println(n1);
    }
    public static void valuesWithAttribute(){
        WebElement table=driver.findElement(By.id("customers"));
        List<WebElement> rows=table.findElements(By.tagName("tr"));
        List<WebElement> column=table.findElements(By.tagName("th"));
        List<WebElement> roww=table.findElements(By.tagName("td"));
        for(WebElement row : column) {
            if (row.getText().equals("Company")) {
                WebElement elem=roww.get(6);
                String ss=elem.getText();
                System.out.println(ss);
            }
            else if (row.getText().equals("Country")) {
                WebElement elem=roww.get(2);
                String ss=elem.getText();
                System.out.println(ss);
            }
            else if (row.getText().equals("Contact")) {
                WebElement elem=roww.get(4);
                String ss=elem.getText();
                System.out.println(ss);
            }

        }
    }
}
