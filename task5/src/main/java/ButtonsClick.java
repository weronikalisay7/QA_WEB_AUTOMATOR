import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ButtonsClick {
    private WebDriver driver;
    private By enterprise=By.xpath("/html/body/div[1]/header/div/div[2]/nav/ul/li[2]/a");
    private By marketplace=By.xpath("/html/body/div[1]/header/div/div[2]/nav/ul/li[4]/a");
    private By search=By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/div/div/div/form/label/input[1]");

    public ButtonsClick(WebDriver driver){this.driver=driver;}

    public ButtonsClick enterpriseBtn(){
        driver.findElement(enterprise).click();
        return this;
    }

    public ButtonsClick marketplaceBtn(){
        driver.findElement(marketplace).click();
        return this;
    }

    public ButtonsClick searchString(String srch){
        driver.findElement(search).sendKeys(srch);
        return this;
    }

    public ButtonsClick backToMainPage(){
        driver.navigate().back();
        return this;
    }
}
