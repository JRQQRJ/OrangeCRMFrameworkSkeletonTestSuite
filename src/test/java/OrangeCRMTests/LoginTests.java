package OrangeCRMTests;

import com.automation.pages.LoginPage;
import com.automation.pages.WelcomePage;
import com.automationbytarun.components.DataProviderArgs;
import com.automationbytarun.components.DataProviderUtils;
import com.automationbytarun.components.TestActions;
import com.automationbytarun.helpers.DataGenerator;
import com.automationbytarun.helpers.TestAsserts;
import jdk.nashorn.internal.parser.JSONParser;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestActions {

//    @Test(invocationCount = 5) -->  to run the test 5 times

    @DataProviderArgs("validateLoginFunctionality=username,password,welcomeUser")
    @Test(dataProviderClass = DataProviderUtils.class,dataProvider = "jsonDataProvider",description =  "This is a test to validate the login functionality")
    public void validateLoginFunctionality(String username, String password,String welcomeMsg) throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver.get());
        WelcomePage welcomePage = loginPage.enterUserName(username)
                .enterPassword(password)
                .clickLogin();
        Thread.sleep(3000);
        String welcomMsg = welcomePage.getWelcomeMessage();
        System.out.println(welcomMsg);
        Thread.sleep(3000);
        TestAsserts.checkIfValuesAreEqual(welcomMsg,welcomeMsg);
//,description =  "This is a test to validate the login functionality"
    }


//    @Test
//    public void validateLoginFunctionalityUsingRandomData() throws InterruptedException {
//        String username = DataGenerator.getUsername();
//        String password = DataGenerator.getPassword();
//        LoginPage loginPage = new LoginPage(driver.get());
//        WelcomePage welcomePage = loginPage.enterUserName(username)
//                .enterPassword(password)
//                .clickLogin();
//        Thread.sleep(3000);
//        System.out.println("Username is: " + username);
//        System.out.println("Password is: " + password);
//        String welcomMsg = welcomePage.getWelcomeMessage();
//        System.out.println(welcomMsg);
//        Thread.sleep(3000);
//        TestAsserts.checkIfValuesAreEqual(welcomMsg,"Tarun");
//
//    }


//    @Test
//    public void validateLoginFunctionality1() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver.get());
//        WelcomePage welcomePage = loginPage.enterUserName("Admin")
//                .enterPassword("admin123")
//                .clickLogin();
//
//        String welcomMsg = welcomePage.getWelcomeMessage();
//        System.out.println(welcomMsg);
//        Thread.sleep(3000);
//
//    }
//
//    @Test
//    public void validateLoginFunctionality2() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver.get());
//        WelcomePage welcomePage = loginPage.enterUserName("Admin")
//                .enterPassword("admin123")
//                .clickLogin();
//
//        String welcomMsg = welcomePage.getWelcomeMessage();
//        System.out.println(welcomMsg);
//        Thread.sleep(3000);
//
//
//    }

//    @Test(dependsOnMethods = {"validateLoginFunctionality"})--> add dependency between 2 test cases
//    @Test(alwaysRun = true)
//    public void validateDashboardPage() throws Exception{
//        System.out.println(" I am on the dashboard page");
//    }
}
