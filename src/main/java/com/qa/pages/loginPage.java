package com.qa.pages;

import com.qa.BaseTest;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class loginPage  {

    BaseTest base;
    public loginPage(){
        base = new BaseTest();
        PageFactory.initElements(new AppiumFieldDecorator(base.getDriver()),this);
    }

    @AndroidFindBy(accessibility = "test-Username")
    private WebElement userName_txt;
    @AndroidFindBy(accessibility = "test-Password")
    private WebElement Password_txt;
    @AndroidFindBy(accessibility = "test-LOGIN")
    private WebElement login_btn;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView")
    private WebElement error_info;



    public loginPage enterUserName(String userName) {
        base.Sendkeys(userName_txt, userName);
        return this;
    }

    public loginPage enterPassword(String password) {
        base.Sendkeys(Password_txt, password);
        return this;
    }
    public ProductsPage ClickLogin () {
        login_btn.click();
        return new ProductsPage();
    }
    public String getErrorMessage () {
        return base.getAttribute(error_info,"text");
    }

}
