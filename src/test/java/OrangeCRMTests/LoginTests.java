package OrangeCRMTests;

import com.automation.pages.LoginPage;
import com.automation.pages.WelcomePage;
import com.automationbytarun.components.DataProviderArgs;
import com.automationbytarun.components.DataProviderUtils;
import com.automationbytarun.components.TestActions;
import jdk.nashorn.internal.parser.JSONParser;
import org.testng.annotations.Test;

public class LoginTests extends TestActions {

//    @Test(invocationCount = 5) -->  to run the test 5 times

    @DataProviderArgs("validateLoginFunctionality=username,password")
    @Test(dataProviderClass = DataProviderUtils.class,dataProvider = "jsonDataProvider")
    public void validateLoginFunctionality(String username, String password) throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver.get());
        WelcomePage welcomePage = loginPage.enterUserName(username)
                .enterPassword(password)
                .clickLogin();

        String welcomMsg = welcomePage.getWelcomeMessage();
        System.out.println(welcomMsg);
        Thread.sleep(3000);

    }

    @Test
    public void validateLoginFunctionality1() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver.get());
        WelcomePage welcomePage = loginPage.enterUserName("Admin")
                .enterPassword("admin123")
                .clickLogin();

        String welcomMsg = welcomePage.getWelcomeMessage();
        System.out.println(welcomMsg);
        Thread.sleep(3000);

    }

    @Test
    public void validateLoginFunctionality2() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver.get());
        WelcomePage welcomePage = loginPage.enterUserName("Admin")
                .enterPassword("admin123")
                .clickLogin();

        String welcomMsg = welcomePage.getWelcomeMessage();
        System.out.println(welcomMsg);
        Thread.sleep(3000);


    }

//    @Test(dependsOnMethods = {"validateLoginFunctionality"})--> add dependency between 2 test cases
//    @Test(alwaysRun = true)
//    public void validateDashboardPage() throws Exception{
//        System.out.println(" I am on the dashboard page");
//    }
}
