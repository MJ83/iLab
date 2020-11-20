package com.iLab.assessment.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Apply_Page {

    @FindBy(xpath = "//*[@id='wpjb-scroll']/div[1]/a")
    public static WebElement btnApplyOnline;

    //After clicking Apply Online Button
    @FindBy(id = "applicant_name")
    public static WebElement txtName;

    @FindBy(id = "email")
    public static WebElement txtEmail;

    @FindBy(id = "phone")
    public static WebElement txtPhoneNumber;

    @FindBy(id = "message")
    public static WebElement txtMessage;

    @FindBy(id = "wpjb_submit")
    public static WebElement btnSubmit;

    @FindBy(xpath = "//*[@id='wpjb-form-job-apply']/div")
    public static WebElement errorMessage;

}
