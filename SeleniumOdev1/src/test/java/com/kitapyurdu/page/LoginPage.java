package com.kitapyurdu.page;
import com.kitapyurdu.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage {
    Methods methods;
    public  LoginPage(){
        methods=new Methods();
    }
    public void  login(){
        methods.click(By.cssSelector(".menu-top-button.login>a"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("login-email"),"evindar.taskiran@testinium.com");
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("login-password"),"12345678");
        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.waitBySeconds(3);
        Assert.assertTrue(methods.isElementVisible(By.cssSelector(".section")));


    }
}