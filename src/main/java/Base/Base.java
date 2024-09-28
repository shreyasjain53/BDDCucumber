package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Base {

    public WebDriver launchBrowser(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public Properties loadProperties(String packageName) {
        Properties prop = new Properties();
        try {
            String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
                    + File.separator + "java" + File.separator + packageName.replace('.', File.separatorChar)
                    + File.separator + "data.properties";
            System.out.println("data.properites file path :- " + filePath);
            FileInputStream fis = new FileInputStream(filePath);
            prop.load(fis);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.gc();
        }
        return prop;
    }
}
