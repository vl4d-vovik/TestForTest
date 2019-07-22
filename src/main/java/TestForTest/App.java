package TestForTest;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

/**
 * Hello world!
 *
 */
public class App 
{

    private WebDriver driver;

    @BeforeEach
    public void beforeTest() throws Exception{
//        driver = new FirefoxDriver();
//        driver = new ChromeDriЛver();

//        driver = new RemoteWebDriver(new URL("http://localhost:4545"), new ChromeOptions());

    }
    @AfterEach
    public void afterTest() {
        driver.quit();
    }

    @Test
    public void test() {
        System.out.println("test for test");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vvoitehovici\\IdeaProjects\\testdisportal\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://www.google.com/");
//        driver.get("http://demo.guru99.com/test/guru99home/");
        String title = driver.getTitle();

        Assertions.assertTrue(title.contains("Demo Guru99 Page"));


    }

}
