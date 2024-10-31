import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UtilsClass {
    public static WebElement waitingElement(String findString){
        WebDriverWait wait=new WebDriverWait(TestClass.driver, Duration.ofMillis(10000));
        WebElement element=wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.id(findString)));
        return element;
    }

    public static WebElement findingElement(String findString){
        WebElement element=TestClass.driver
                .findElement(By.id(findString));
        return element;
    }
}
