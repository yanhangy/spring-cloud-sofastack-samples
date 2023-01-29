/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.io.sofastack.cloud.auth.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import io.sofastack.cloud.auth.controller.LoginController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;
import org.springframework.ui.ModelMap;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class LoginController_SSTest extends LoginController_SSTest_scaffolding {
// allCoveredLines:[17, 23, 24, 25, 27, 28, 29, 31, 33, 34, 39, 40, 41, 42, 44, 45]

  @Test(timeout = 4000)
  public void test_error_0()  throws Throwable  {
      //caseID:35009fdd278e3f37d4c6e34e61af9bf2
      //CoveredLines: [17, 39, 40, 41, 42, 44, 45]
      //Input_0_HttpServletRequest: {getSession=httpSession0}
      //Input_1_ModelMap: modelMap0
      //Assert: assertEquals("fail", method_result);
      
      LoginController loginController0 = new LoginController();
      //mock httpSession0
      HttpSession httpSession0 = mock(HttpSession.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("").when(httpSession0).getAttribute(anyString());
      //mock httpServletRequest0
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(httpSession0).when(httpServletRequest0).getSession();
      ModelMap modelMap0 = new ModelMap();
      
      //Call method: error
      String string0 = loginController0.error(httpServletRequest0, modelMap0);
      
      //Test Result Assert
      assertEquals("fail", string0);
  }

  @Test(timeout = 4000)
  public void test_login_1()  throws Throwable  {
      //caseID:e99e197ce18dcb656bd425dd7d1ecc43
      //CoveredLines: [17, 23, 24, 25]
      //Input_0_HttpServletRequest: {}
      //Input_1_ModelMap: {}
      //Assert: assertEquals("fail", method_result);
      
      LoginController loginController0 = new LoginController();
      //mock httpServletRequest0
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock modelMap0
      ModelMap modelMap0 = mock(ModelMap.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: login
      String string0 = loginController0.login(httpServletRequest0, modelMap0);
      
      //Test Result Assert
      assertEquals("fail", string0);
  }

  @Test(timeout = 4000)
  public void test_login_2()  throws Throwable  {
      //caseID:0a4410108190fbc4d48e957d8083fbb0
      //CoveredLines: [17, 23, 24, 27, 28, 29, 33, 34]
      //Input_0_HttpServletRequest: {getParameter=\"H)`\\\"zE 5?[;g`)PZ\"}
      //Input_1_ModelMap: {}
      //Assert: assertEquals("login", method_result);
      
      LoginController loginController0 = new LoginController();
      //mock httpServletRequest0
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("H)`\"zE 5?[;g`)PZ").when(httpServletRequest0).getParameter(anyString());
      //mock modelMap0
      ModelMap modelMap0 = mock(ModelMap.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: login
      String string0 = loginController0.login(httpServletRequest0, modelMap0);
      
      //Test Result Assert
      assertEquals("login", string0);
  }

  @Test(timeout = 4000)
  public void test_login_3()  throws Throwable  {
      //caseID:7e6e4296af0e0a29c14b562ce942d3c2
      //CoveredLines: [17, 23, 24, 27, 28, 31, 33, 34]
      //Input_0_HttpServletRequest: {getParameter=\"1\"}
      //Input_1_ModelMap: {}
      //Assert: assertEquals("login", method_result);
      
      LoginController loginController0 = new LoginController();
      //mock httpServletRequest0
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("1").when(httpServletRequest0).getParameter(anyString());
      //mock modelMap0
      ModelMap modelMap0 = mock(ModelMap.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: login
      String string0 = loginController0.login(httpServletRequest0, modelMap0);
      
      //Test Result Assert
      assertEquals("login", string0);
  }
}