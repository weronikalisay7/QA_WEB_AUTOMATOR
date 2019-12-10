import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAnAccount {
    private WebDriver driver;
    private By username=By.xpath("//*[@id='user_login']");
    private By email=By.xpath("//*[@id='user_email']");
    private By password =By.xpath("//*[@id='user_password']");

    public CreateAnAccount(WebDriver driver){this.driver=driver;}

    public CreateAnAccount inputUsername(String user){
        driver.findElement(username).sendKeys(user);
        return this;
    }

    public CreateAnAccount inputEmail(String em){
        driver.findElement(email).sendKeys(em);
        return this;
    }

    public CreateAnAccount inputPassword(String pass){
        driver.findElement(password).sendKeys(pass);
        return this;
    }


}
