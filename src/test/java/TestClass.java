import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static com.codeborne.selenide.files.DownloadActions.click;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestClass {
   static AndroidDriver driver;
   @BeforeAll
    public static void Init() throws MalformedURLException {
      UiAutomator2Options options=new UiAutomator2Options()
              .setUdid("66a279bc")
              .setApp("C:\\Users\\Иван\\Downloads\\wapp.apk");

      driver=new AndroidDriver(
              new  URL("http://127.0.0.1:4723/wd/hub"),options
      );
   }

   @Test
   @Order(1)
   public void Auth() throws InterruptedException {
       UtilsClass.findingElement("ru.wsoft.push.sample:id/close_image_view").click();
       UtilsClass.waitingElement("ru.wsoft.push.sample:id/server_settings_image_view").click();

   }
}
