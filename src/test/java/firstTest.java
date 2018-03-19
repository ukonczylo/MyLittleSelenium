import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTest {
    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver", "C://Users/RENT/Desktop/chromedriver.exe");//ustawia wlasnosc w systemie
        WebDriver driver = new ChromeDriver();

        String actualTitle = "";

        driver.get("http://www.pracuj.pl");


        actualTitle = driver.getTitle();
        System.out.println("NIŻEJ BĘDZIE TYTUL");
        System.out.println("Tytuł strony: " + actualTitle);

        if (actualTitle.contentEquals("Oferty pracy - Pracuj.pl")) {
            System.out.println("Test Passed!");
        }else{
            System.out.println("Test failed!");
        }

        driver.quit();
    }
}
