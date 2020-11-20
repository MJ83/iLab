package com.iLab.assessment.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_Page {

    @FindBy(xpath = "//*[@id='menu-item-1373']/a")
    public static WebElement careerLink;

}
