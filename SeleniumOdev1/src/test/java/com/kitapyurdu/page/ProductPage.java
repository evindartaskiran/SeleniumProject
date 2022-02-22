package com.kitapyurdu.page;
import com.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;


public class ProductPage {
    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public ProductPage(){
        methods = new Methods();
    }

    public void selectProduct() {
        methods.sendKeys(By.id("search-input"), "Oyuncak");
        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySeconds(3);
        //methods.scrollWithAction(By.id("product-394421"));
        methods.scrollWithAction(By.cssSelector("div[class='scrollbox language-filters']>div[class='row']>input[value='TÜRKÇE']"));
        methods.waitBySeconds(3);
    }

        public void favori() {
            methods.scrollWithAction(By.xpath("//div[@class='product-list']//div[@class='product-cr'][7]//i[@class='fa fa-heart']"));
            methods.waitBySeconds(4);
            methods.click(By.xpath("//div[@class='product-list']//div[@class='product-cr'][5]//i[@class='fa fa-heart']"));
            methods.waitBySeconds(2);
            methods.click(By.xpath("//div[@class='product-list']//div[@class='product-cr'][6]//i[@class='fa fa-heart']"));
            methods.waitBySeconds(2);
            methods.click(By.xpath("//div[@class='product-list']//div[@class='product-cr'][7]//i[@class='fa fa-heart']"));
            methods.waitBySeconds(2);
            methods.click(By.xpath("//div[@class='product-list']//div[@class='product-cr'][8]//i[@class='fa fa-heart']"));
            methods.waitBySeconds(2);
            Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@class='product-list']//div[@class='product-cr'][5]//i[@class='fa fa-heart red']")));
            methods.waitBySeconds(2);
            Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@class='product-list']//div[@class='product-cr'][6]//i[@class='fa fa-heart red']")));
            methods.waitBySeconds(2);
            Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@class='product-list']//div[@class='product-cr'][7]//i[@class='fa fa-heart red']")));
            methods.waitBySeconds(2);
            Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@class='product-list']//div[@class='product-cr'][8]//i[@class='fa fa-heart red']")));
            methods.waitBySeconds(2);
            methods.click(By.xpath("//img[@title='kitapla buluşmanın en kolay yolu!']"));
            methods.waitBySeconds(2);
        }
            public void selectPointBook() {
                methods.click(By.cssSelector("div[class='lvl1catalog']"));
                methods.waitBySeconds(3);
                methods.click(By.cssSelector("img[title='Puan Kataloğundaki Türk Klasikleri']"));
                methods.waitBySeconds(3);
                methods.selectByText(By.cssSelector("div[class='sort']>select[onchange='location = this.value;']"), "Yüksek Oylama");
                methods.waitBySeconds(5);
                methods.click(By.cssSelector("#mainNav > div.nav-content > ul > li.book.has-menu.active > div.lvl2.js-bookCr > ul > li:nth-child(3) > span"));
                methods.waitBySeconds(3);
                methods.click(By.cssSelector("li>a[href='kategori/kitap-hobi/1_212.html']"));
                methods.waitBySeconds(3);
                methods.click(By.cssSelector(".product-cr"));
                methods.waitBySeconds(3);
                methods.click(By.xpath("//span[text()='Sepete Ekle']"));
                methods.waitBySeconds(1);
                methods.click(By.xpath("//a[text()='Listelerim']"));
                methods.waitBySeconds(1);
                methods.click(By.cssSelector("a[href=\"https://www.kitapyurdu.com/index.php?route=account/favorite&selected_tags=0\"]"));
                methods.waitBySeconds(1);
                methods.click(By.xpath("//div[@class='product-list']/div[@class='product-cr'][3]"));
                methods.click(By.xpath("//div[@class='product-list']//div[@class='product-cr'][3]//i[@class='fa fa-heart-o']"));
                methods.waitBySeconds(3);
                methods.click(By.xpath("//h4[text()='Sepetim']"));
                methods.waitBySeconds(3);
                methods.click(By.xpath("//a[@id='js-cart']"));
                methods.waitBySeconds(3);
                methods.findElement(By.xpath("//input[@name='quantity']")).clear();
                methods.waitBySeconds(1);
                methods.sendKeys(By.xpath("//input[@name='quantity']"), "2");
                methods.waitBySeconds(1);
                methods.click(By.xpath("//i[@title='Güncelle']"));
                methods.waitBySeconds(5);
                methods.click(By.cssSelector("div[class='right']>a[class='button red']"));
                methods.waitBySeconds(2);
                methods.click(By.cssSelector("#shipping-tabs > a:nth-child(2)"));
                methods.waitBySeconds(2);
                methods.sendKeys(By.cssSelector("input[id='address-firstname-companyname']"), "Evindar");
                methods.sendKeys(By.cssSelector("input[id='address-lastname-title']"), "Taşkıran");
                methods.selectByText(By.cssSelector("select[id='address-zone-id']"), "Mersin");
                methods.waitBySeconds(3);
                methods.selectByText(By.cssSelector("select[id='address-county-id']"), "AKDENİZ");
                methods.waitBySeconds(3);
                methods.sendKeys(By.cssSelector("input[id='district']"), "Özgürlük");
                methods.sendKeys(By.cssSelector("textarea[id='address-address-text']"), "Ev Adresim");
                methods.waitBySeconds(3);
                methods.sendKeys(By.cssSelector("input[id='address-postcode']"), "33010");
                methods.waitBySeconds(3);
                methods.sendKeys(By.cssSelector("input[id='address-telephone']"), "5457394205");
                methods.waitBySeconds(3);
                methods.sendKeys(By.cssSelector("input[id='address-mobile-telephone']"), "5457394205");
                methods.waitBySeconds(3);
                methods.sendKeys(By.cssSelector("input[id='address-tax-id']"), "15857680640");
                methods.click(By.cssSelector("button[id='button-checkout-continue']"));
                methods.waitBySeconds(10);
                methods.click(By.cssSelector("button[id='button-checkout-continue']"));
                methods.waitBySeconds(3);
                methods.sendKeys(By.cssSelector("input[id='credit-card-owner']"), "Evindar Taşkıran");
                methods.waitBySeconds(3);
                methods.sendKeys(By.cssSelector("input[id='credit_card_number_1']"), "1234567891231234");
                methods.waitBySeconds(3);
                methods.selectByText(By.cssSelector("select[id='credit-card-expire-date-month']"),"04");
                methods.waitBySeconds(3);
                methods.selectByText(By.cssSelector("select[id='credit-card-expire-date-year']"),"2023");
                methods.waitBySeconds(3);
                methods.sendKeys(By.cssSelector("input[id='credit-card-security-code']"), "1234");
                methods.waitBySeconds(3);
                methods.click(By.cssSelector("label[id='credit-card-is-3ds-label']"));
                methods.waitBySeconds(3);
                methods.click(By.cssSelector("label[id='register-credit-card-label']"));
                methods.waitBySeconds(3);
                methods.click(By.cssSelector("button[id='button-checkout-continue']"));
                methods.waitBySeconds(3);
                String text = methods.getText(By.cssSelector("span[class='error']"));
                methods.waitBySeconds(3);
                System.out.println("Alınan text:" + text);
                logger.info("Alınan text:"+ text);
                methods.waitBySeconds(3);
                methods.click(By.cssSelector("#logo > a > img"));
                methods.waitBySeconds(3);
                methods.scrollWithAction(By.cssSelector("#header-top > div > div.welcome.fl > div.menu.top.login > ul > li > a"));
                methods.click(By.cssSelector("#header-top > div > div.welcome.fl > div.menu.top.login > ul > li > div > ul > li:nth-child(4) > a"));
            }}






