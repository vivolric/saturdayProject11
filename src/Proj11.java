import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class Proj11 extends BaseDriver{
    public static void main(String[] args) throws InterruptedException {

        //Navigate to website http://a.testaddressbook.com/sign_in
        driver.navigate().to("http://a.testaddressbook.com/sign_in");

        //Create your own account in the website in manual part
        // username: group2@gmail.com  pswd: group2

        //Enter the username and password
        WebElement email = driver.findElement(By.id("session_email"));
        email.sendKeys("group2@gmail.com");

        WebElement password = driver.findElement(By.id("session_password"));
        password.sendKeys("group2");

        //Click on sign in button
        WebElement signInButton= driver.findElement(By.cssSelector("input[type='submit']"));
        signInButton.click();

        Thread.sleep(2000);
        //Click on Addresses
        WebElement addressesLink= driver.findElement(By.xpath("//a[@data-test='addresses']"));
        addressesLink.click();

        Thread.sleep(2000);
        //Click on new address button  for cssSelector a[data-test='addresses']
        WebElement newAddress= driver.findElement(By.xpath("//a[@data-test='create']"));
        newAddress.click();

        Thread.sleep(2000);
        //Enter the first name "Fernando"
        WebElement firstName= driver.findElement(By.id("address_first_name"));
        firstName.sendKeys("Fernando");

        //Enter the last name "Torres"
        WebElement lastName= driver.findElement(By.id("address_last_name"));
        lastName.sendKeys("Torres");

        //Enter the address 1 "Anfield Rd"
        WebElement address1= driver.findElement(By.id("address_street_address"));
        address1.sendKeys("Anfield Rd");

        //Enter the address 2 "Anfield"
        WebElement address2= driver.findElement(By.id("address_secondary_address"));
        address2.sendKeys("Anfield");

        //Enter the city "Liverpool"
        WebElement city= driver.findElement(By.id("address_city"));
        city.sendKeys("Liverpool");

        Thread.sleep(2000);
        //Choose the random option from the state dropdown
        WebElement randomState= driver.findElement(By.id("address_state"));
        Select s1 = new Select(randomState);
        List<WebElement> listOfStates = s1.getOptions();
        Random randomizeStates = new Random();
        int allStates = randomizeStates.nextInt(listOfStates.size());
        s1.selectByIndex(allStates);

        //Enter the Zipcode "L4 0TH"
        WebElement zipCode= driver.findElement(By.id("address_zip_code"));
        zipCode.sendKeys("L4 0TH");

       //Click on United States
        WebElement country= driver.findElement(By.id("address_country_us"));
        country.click();

        //Enter the birthday "03/20/1984"
        WebElement birthday= driver.findElement(By.id("address_birthday"));
        birthday.sendKeys("03201984");

        //Enter the age "36"
        WebElement age= driver.findElement(By.id("address_age"));
        age.sendKeys("36");

        //Enter the WebSite "https://www.google.com/"
        WebElement google= driver.findElement(By.id("address_website"));
        google.sendKeys("https://www.google.com/");

        //Enter the phone "8625747878"
        WebElement phone= driver.findElement(By.id("address_phone"));
        phone.sendKeys("8625747878");

        //Click on Climbing and Dancing
        WebElement climbing= driver.findElement(By.id("address_interest_climb"));
        climbing.click();
        WebElement dancing= driver.findElement(By.id("address_interest_dance"));
        dancing.click();

        //Enter the Note "Never Back Down"
        WebElement note= driver.findElement(By.id("address_note"));
        note.sendKeys("Never Back Down");

        //Click on Create Address button
        WebElement addressButton= driver.findElement(By.xpath("//input[@value='Create Address']"));
        addressButton.click();

        //Verify the first name as "Fernando"
        WebElement checkFirstName=driver.findElement(By.xpath("//span[@data-test='first_name']"));
        String actualFirstName=checkFirstName.getText();
        System.out.println(actualFirstName);

        if("Fernando".equals(actualFirstName)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("EXPECTED: Fernando");
            System.out.println("actual first name = " + actualFirstName);
        }

        //Verify the last name as "Torres"
        WebElement checkLastName=driver.findElement(By.xpath("//span[@data-test='last_name']"));
        String actualLastName=checkLastName.getText();
        System.out.println(actualLastName);

        if("Torres".equals(actualLastName)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("EXPECTED: Torres");
            System.out.println("actual last name = " + actualLastName);
        }

        Thread.sleep(2000);
        //Click on Addresses
        driver.navigate().back();
        driver.navigate().back();

        Thread.sleep(2000);
        //Click on Edit button
        WebElement editButton = driver.findElement(By.linkText("Edit"));
        editButton.click();

        Thread.sleep(2000);
        //Change the first name as "Peter"
        WebElement changeToPeter = driver.findElement(By.id("address_first_name"));
        changeToPeter.clear();
        changeToPeter.sendKeys("Peter");

        //Change the last name as "Crouch"
        WebElement changeToCrouch = driver.findElement(By.id("address_last_name"));
        changeToCrouch.clear();
        changeToCrouch.sendKeys("Crouch");

        //Click on Update address   //input[@value='Update Address']
        WebElement updateAddress = driver.findElement(By.xpath("//input[@value='Update Address']"));
        updateAddress.click();

        //Verify the first name as "Peter"
        WebElement checkEditedFirstName=driver.findElement(By.xpath("//span[@data-test='first_name']"));
        String actualEditedFirstName=checkEditedFirstName.getText();
        System.out.println(actualEditedFirstName);

        if("Peter".equals(actualEditedFirstName)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("EXPECTED: Peter");
            System.out.println("actual first name = " + actualEditedFirstName);
        }

        //Verify the last name as "Crouch"
        WebElement checkEditedLastName=driver.findElement(By.xpath("//span[@data-test='last_name']"));
        String actualEditedLastName=checkEditedLastName.getText();
        System.out.println(actualEditedLastName);

        if("Crouch".equals(actualEditedLastName)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("EXPECTED: Crouch");
            System.out.println("actual last name = " + actualEditedLastName);
        }

        Thread.sleep(2000);
        //Click on Addresses
        driver.navigate().back();
        driver.navigate().back();

        Thread.sleep(2000);

        //Click on Destroy
        WebElement destroy = driver.findElement(By.linkText("Destroy"));
        destroy.click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

        //Address should be removed
    }
}
