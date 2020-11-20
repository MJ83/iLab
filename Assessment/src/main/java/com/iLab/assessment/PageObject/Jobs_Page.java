package com.iLab.assessment.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Jobs_Page {

    @FindBy(xpath = "/html/body/section/div[2]/div/div/div/div[3]/div[2]/div/div/div/div/div/div[1]/div[1]/div[2]/div[1]/a")
    public static WebElement jobOpening;
}
