package com.acceptancetests.petclinic.pages;

import com.acceptancetests.petclinic.util.Context;
import com.acceptancetests.petclinic.util.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private final WebDriver driver;
    private static final String BASE_URI = "baseUri";
    @FindBy(how = How.LINK_TEXT, using = "FIND OWNERS")
    private WebElement findOwnerslink;
    @FindBy(how = How.LINK_TEXT, using = "VETERINARIANS")
    private WebElement findVeterinarianslink;
    @FindBy(how = How.LINK_TEXT, using = "HOME")
    private WebElement goHome;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openURL() {
        String baseUri = PropertiesReader.get_property(Context.getEnv_properties_file(), BASE_URI);
        driver.navigate().to(baseUri);
    }

    public void clickOnLink(String link) {
        switch (link) {
            case "find owners":
                findOwnerslink.click();
                break;
            case "veterinarians":
                findVeterinarianslink.click();
                break;
            default:
                goHome.click();

        }
    }
}
