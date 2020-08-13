import org.apache.logging.log4j.LogManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SomeTest {
    private final Logger log = LogManager.getLogger("Web Driver Test");

    private final By message= new By.ByXPath("/html/body/div[4]/div[2]/div/div/div[2]/div/div/div[1]/p");


    @Before
    public void setUp()
    {

    }


    @Test
    public void someTest()
    {
        System.setProperty("webdriver.chrome.driver", "C://Users//oleg.vysotskiy//IdeaProjects//hw1_g44//src//main//resources//drivers//chrome//v84//chromedriver.exe");
        // Пока такое обьявление т.к. что то пошло не так и получаю NullPointException
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://qalight.com.ua/o-nas/qalight-eto/");
        driver.findElement(message);

        try{
            Thread.sleep(4000);
        }
        catch(InterruptedException e){
            log.error(e);
    }
        driver.quit();
    }
    @After
    public void tearDown()
    {

    }
}
