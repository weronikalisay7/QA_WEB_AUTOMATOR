import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
    private WebDriver driver;
    private By signInBtn=By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/a[1]");
    private By emailInput=By.xpath("//*[@id='login_field']");
    private By passwordInput=By.xpath("//*[@id='password']");
    private By signBtn=By.xpath("//*[@id='login']/form/div[3]/input[8]");
    private By forgotPassword=By.xpath("//*[@id='login']/form/div[3]/label[2]/a");
    private By createAccount=By.xpath("//*[@id='login']/p/a");

    public SignInPage(WebDriver driver){this.driver=driver;}

    public SignInPage signIn(){
        driver.findElement(signInBtn).click();
        return this;
    }

    public SignInPage email(String email){
        driver.findElement(emailInput).sendKeys(email);
        return this;
    }

    public SignInPage password(String password){
        driver.findElement(passwordInput).sendKeys(password);
        return this;
    }

    public SignInPage sign(){
        driver.findElement(signBtn).click();
        return this;
    }

    public SignInPage forgotPasswordBtn(){
        driver.findElement(forgotPassword).click();
        return this;
    }

    public SignInPage createAccBtn(){
        driver.findElement(createAccount).click();
        return this;
    }
}
