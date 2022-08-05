
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.time.Duration;

public class PricelineSearchTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  JavascriptExecutor js;
  @Before
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void testPricelineSearch() throws Exception {
    driver.get("https://www.priceline.com/?vrid=bacf0bd74b548287f74b36b429559c9e");
    driver.get("https://www.priceline.com/?vrid=332f2de9a83b5570bc25271ba324dfd6");
    driver.findElement(By.xpath("//div[@id='hotel-date-range-box']/div/div[2]/div")).click();
    driver.findElement(By.xpath("//div[@id='hotel-date-range-box']/div/div[2]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div[2]/div[3]/div[6]/div/div")).click();
    driver.findElement(By.xpath("//div[@id='hotel-date-range-box']/div/div[2]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div[2]/div[3]/div[32]/div/div")).click();
    driver.findElement(By.xpath("//div[@id='panel-hotels']/form/div/div/div/div[5]/button")).click();
    driver.findElement(By.xpath("//div[@id='panel-hotels']/form/div/div/div/div/div/div[2]/div/div/div/div/div[2]/div")).click();
    driver.findElement(By.id("endLocation-typeahead-downshift-container-item-0")).click();
    driver.findElement(By.id("endLocation-typeahead-downshift-container-input")).clear();
    driver.findElement(By.id("endLocation-typeahead-downshift-container-input")).sendKeys("Chicago, IL");
    driver.findElement(By.xpath("//div[@id='hotel-date-range-box']/div/div[2]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div[3]/div[3]/div[5]/div/div")).click();
    driver.findElement(By.xpath("//div[@id='hotel-date-range-box']/div/div[2]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div[3]/div[3]/div[19]/div/div")).click();
    driver.findElement(By.xpath("//div[@id='panel-hotels']/form/div/div/div/div[5]/button")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
    driver.get("https://www.priceline.com/relax/in/3000005381/from/20220901/to/20220915/rooms/1/adults/2");
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
