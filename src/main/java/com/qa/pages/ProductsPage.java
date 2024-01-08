package com.qa.pages;

import com.qa.BaseTest;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage{

    BaseTest base;
    public ProductsPage(){
        base = new BaseTest();
        PageFactory.initElements(new AppiumFieldDecorator(base.getDriver()),this);
    }
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView")
    private WebElement products_info;


public String getTitle(){

    return base.getAttribute(products_info,"text");
}

}
