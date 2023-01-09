/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.io.sofastack.cloud.web.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import io.sofastack.cloud.common.model.BalanceDetails;
import io.sofastack.cloud.common.model.TradingOrder;
import io.sofastack.cloud.common.model.UserDetails;
import io.sofastack.cloud.common.response.Result;
import io.sofastack.cloud.web.controller.WebRouterController;
import io.sofastack.cloud.web.service.AccountService;
import io.sofastack.cloud.web.service.TradeService;
import io.sofastack.cloud.web.service.UserService;
import javax.servlet.http.HttpServletRequest;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

@RunWith(SmartRunner.class)
@SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true)
public class WebRouterController_SSTest extends WebRouterController_SSTest_scaffolding {
    // allCoveredLines:[30, 51, 52, 53, 54, 55, 56, 57, 58, 59, 61, 62, 64, 65, 66, 67, 68, 69, 79, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 93, 94, 96, 97, 98, 101, 102, 104, 105, 117, 118, 119, 121, 126, 127, 128]

    @Test(timeout = 4000)
    public void test_fail_0() throws Throwable {
        //caseID:c58472f83a11ac8c05ff76b7811c5ceb
        //CoveredLines: [30, 126, 127, 128]
        //Input_0_HttpServletRequest: {}
        //Input_1_ModelMap: {}
        //Assert: assertEquals("fail", method_result);

        WebRouterController webRouterController0 = new WebRouterController();
        //mock httpServletRequest0
        HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings()
            .defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        //mock modelMap0
        ModelMap modelMap0 = mock(ModelMap.class,
            withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

        //Call method: fail
        String string0 = webRouterController0.fail(httpServletRequest0, modelMap0);

        //Test Result Assert
        assertEquals("fail", string0);
    }

    @Test(timeout = 4000)
    public void test_index_1() throws Throwable {
        //caseID:0959f7b570ee1000f39b74ce82f34c4c
        //CoveredLines: [30, 51, 52, 53, 54, 55, 61, 62, 68, 69]
        //Input_0_ModelAndView: {addObject=modelAndView0, toString=\"0\"}
        //Input_1_HttpServletRequest: {getParameter=\"0\"}
        //Assert: assertFalse(method_result.hasView());

        WebRouterController webRouterController0 = new WebRouterController();
        //mock result0
        Result<BalanceDetails> result0 = (Result<BalanceDetails>) mock(Result.class, withSettings()
            .defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        //mock accountService0
        AccountService accountService0 = mock(AccountService.class,
            withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn(result0).when(accountService0).balanceDetails(
            ArgumentMatchers.<java.lang.String, java.lang.Object> anyMap());

        PrivateAccess.setVariable((Class<?>) WebRouterController.class, webRouterController0,
            "accountService", (Object) accountService0);
        //mock modelAndView0
        ModelAndView modelAndView0 = mock(ModelAndView.class,
            withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        //mock modelAndView1
        ModelAndView modelAndView1 = mock(ModelAndView.class,
            withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn(modelAndView0).when(modelAndView1).addObject(anyString(), any());
        doReturn("0").when(modelAndView1).toString();
        //mock httpServletRequest0
        HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings()
            .defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn("0").when(httpServletRequest0).getParameter(anyString());

        //Call method: index
        ModelAndView modelAndView2 = webRouterController0.index(modelAndView1, httpServletRequest0);

        //Test Result Assert
        assertFalse(modelAndView2.hasView());
    }

    @Test(timeout = 4000)
    public void test_index_2() throws Throwable {
        //caseID:290276da00889df18f2ee5486535e006
        //CoveredLines: [30, 51, 52, 53, 54, 55, 56, 57, 58, 59, 68, 69]
        //Input_0_ModelAndView: {addObject=modelAndView0, toString=\"0\"}
        //Input_1_HttpServletRequest: {getParameter=\"0\"}
        //Assert: assertSame(method_result, modelAndView1);

        WebRouterController webRouterController0 = new WebRouterController();
        //mock balanceDetails0
        BalanceDetails balanceDetails0 = mock(BalanceDetails.class,
            withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        //mock result0
        Result<BalanceDetails> result0 = (Result<BalanceDetails>) mock(Result.class, withSettings()
            .defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn(balanceDetails0).when(result0).getData();
        doReturn(true).when(result0).isSuccess();
        //mock accountService0
        AccountService accountService0 = mock(AccountService.class,
            withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn(result0).when(accountService0).balanceDetails(
            ArgumentMatchers.<java.lang.String, java.lang.Object> anyMap());

        PrivateAccess.setVariable((Class<?>) WebRouterController.class, webRouterController0,
            "accountService", (Object) accountService0);
        //mock modelAndView0
        ModelAndView modelAndView0 = mock(ModelAndView.class,
            withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        //mock modelAndView1
        ModelAndView modelAndView1 = mock(ModelAndView.class,
            withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn(modelAndView0).when(modelAndView1).addObject(anyString(), any());
        doReturn("0").when(modelAndView1).toString();
        //mock httpServletRequest0
        HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings()
            .defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn("0").when(httpServletRequest0).getParameter(anyString());

        //Call method: index
        ModelAndView modelAndView2 = webRouterController0.index(modelAndView1, httpServletRequest0);

        //Test Result Assert
        assertSame(modelAndView2, modelAndView1);
    }

    @Test(timeout = 4000)
    public void test_index_3() throws Throwable {
        //caseID:f8bd7c0704afd615e364442083841487
        //CoveredLines: [30, 51, 52, 53, 54, 55, 56, 64, 65, 66, 67, 69]
        //Input_0_ModelAndView: {addObject=modelAndView0, toString=\"86\"}
        //Input_1_HttpServletRequest: {getParameter=\"86\"}
        //Assert: assertNotSame(method_result, modelAndView0);

        WebRouterController webRouterController0 = new WebRouterController();
        //mock result0
        Result<BalanceDetails> result0 = (Result<BalanceDetails>) mock(Result.class, withSettings()
            .defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn("86").when(result0).getErrorMsg();
        doReturn(true).when(result0).isSuccess();
        //mock accountService0
        AccountService accountService0 = mock(AccountService.class,
            withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn(result0).when(accountService0).balanceDetails(
            ArgumentMatchers.<java.lang.String, java.lang.Object> anyMap());

        PrivateAccess.setVariable((Class<?>) WebRouterController.class, webRouterController0,
            "accountService", (Object) accountService0);
        //mock modelAndView0
        ModelAndView modelAndView0 = mock(ModelAndView.class,
            withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        //mock modelAndView1
        ModelAndView modelAndView1 = mock(ModelAndView.class,
            withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn(modelAndView0).when(modelAndView1).addObject(anyString(), any());
        doReturn("86").when(modelAndView1).toString();
        //mock httpServletRequest0
        HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings()
            .defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn("86").when(httpServletRequest0).getParameter(anyString());

        //Call method: index
        ModelAndView modelAndView2 = webRouterController0.index(modelAndView1, httpServletRequest0);

        //Test Result Assert
        assertNotSame(modelAndView2, modelAndView0);
    }

    @Test(timeout = 4000)
    public void test_success_4() throws Throwable {
        //caseID:e5d58a6db0bb0a23bd36ce7bb34b383d
        //CoveredLines: [30, 79, 81, 82, 83, 97, 98, 101, 104, 105]
        //Input_0_HttpServletRequest: {getParameter=\"catalina\"}
        //Input_1_ModelMap: {}
        //Assert: assertEquals("fail", method_result);

        WebRouterController webRouterController0 = new WebRouterController();
        //mock result0
        Result<TradingOrder> result0 = (Result<TradingOrder>) mock(Result.class, withSettings()
            .defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        //mock tradeService0
        TradeService tradeService0 = mock(TradeService.class,
            withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn(result0).when(tradeService0).queryTradingOrder(nullable(java.lang.String.class));

        PrivateAccess.setVariable((Class<?>) WebRouterController.class, webRouterController0,
            "tradingService", (Object) tradeService0);
        //mock httpServletRequest0
        HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings()
            .defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn("catalina").when(httpServletRequest0).getParameter(anyString());
        //mock modelMap0
        ModelMap modelMap0 = mock(ModelMap.class,
            withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

        //Call method: success
        String string0 = webRouterController0.success(httpServletRequest0, modelMap0);

        //Test Result Assert
        assertEquals("fail", string0);
    }

    @Test(timeout = 4000)
    public void test_success_5() throws Throwable {
        //caseID:ad3b41fc27b72cc7b40050553119a072
        //CoveredLines: [30, 79, 81, 82, 83, 84, 85, 86, 93, 94, 96, 101, 104, 105, 117, 118, 119, 121]
        //Input_0_HttpServletRequest: {getParameter=\"org.springframework.beans.CachedIntrospectionResults\"}
        //Input_1_ModelMap: {}
        //Assert: assertEquals("fail", method_result);

        WebRouterController webRouterController0 = new WebRouterController();
        //mock tradingOrder0
        TradingOrder tradingOrder0 = mock(TradingOrder.class,
            withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn(5256).when(tradingOrder0).getTargetAccount();
        //mock result0
        Result<TradingOrder> result0 = (Result<TradingOrder>) mock(Result.class, withSettings()
            .defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn(tradingOrder0).when(result0).getData();
        doReturn(true).when(result0).isSuccess();
        //mock tradeService0
        TradeService tradeService0 = mock(TradeService.class,
            withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn(result0).when(tradeService0).queryTradingOrder(nullable(java.lang.String.class));
        //mock result1
        Result<UserDetails> result1 = (Result<UserDetails>) mock(Result.class, withSettings()
            .defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        //mock userService0
        UserService userService0 = mock(UserService.class,
            withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn(result1).when(userService0).queryUserDetail(anyInt());

        PrivateAccess.setVariable((Class<?>) WebRouterController.class, webRouterController0,
            "userService", (Object) userService0);

        PrivateAccess.setVariable((Class<?>) WebRouterController.class, webRouterController0,
            "tradingService", (Object) tradeService0);
        //mock httpServletRequest0
        HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings()
            .defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn("org.springframework.beans.CachedIntrospectionResults").when(httpServletRequest0)
            .getParameter(anyString());
        //mock modelMap0
        ModelMap modelMap0 = mock(ModelMap.class,
            withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

        //Call method: success
        String string0 = webRouterController0.success(httpServletRequest0, modelMap0);

        //Test Result Assert
        assertEquals("fail", string0);
    }

    @Test(timeout = 4000)
    public void test_success_6() throws Throwable {
        //caseID:e2ff706d4a711de15a1f33ed1175deea
        //CoveredLines: [30, 79, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 96, 101, 102, 117, 118, 121]
        //Input_0_HttpServletRequest: {getParameter=\"I%&JiO`D,k\"}
        //Input_1_ModelMap: {addAttribute=modelMap0}
        //Assert: assertEquals("success", method_result);

        WebRouterController webRouterController0 = new WebRouterController();
        //mock tradingOrder0
        TradingOrder tradingOrder0 = mock(TradingOrder.class,
            withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn(86400).when(tradingOrder0).getTargetAccount();
        //mock result0
        Result<TradingOrder> result0 = (Result<TradingOrder>) mock(Result.class, withSettings()
            .defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn(tradingOrder0).when(result0).getData();
        doReturn(true).when(result0).isSuccess();
        //mock tradeService0
        TradeService tradeService0 = mock(TradeService.class,
            withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn(result0).when(tradeService0).queryTradingOrder(nullable(java.lang.String.class));
        //mock userDetails0
        UserDetails userDetails0 = mock(UserDetails.class,
            withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        //mock result1
        Result<UserDetails> result1 = (Result<UserDetails>) mock(Result.class, withSettings()
            .defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn(userDetails0).when(result1).getData();
        doReturn(true, true).when(result1).isSuccess();
        doReturn("I%&JiO`D,k").when(result1).toString();
        //mock userService0
        UserService userService0 = mock(UserService.class,
            withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn(result1).when(userService0).queryUserDetail(anyInt());

        PrivateAccess.setVariable((Class<?>) WebRouterController.class, webRouterController0,
            "userService", (Object) userService0);

        PrivateAccess.setVariable((Class<?>) WebRouterController.class, webRouterController0,
            "tradingService", (Object) tradeService0);
        //mock httpServletRequest0
        HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings()
            .defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn("I%&JiO`D,k").when(httpServletRequest0).getParameter(anyString());
        //mock modelMap0
        ModelMap modelMap0 = mock(ModelMap.class,
            withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        //mock modelMap1
        ModelMap modelMap1 = mock(ModelMap.class,
            withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn(modelMap0).when(modelMap1).addAttribute(nullable(java.lang.String.class), any());

        //Call method: success
        String string0 = webRouterController0.success(httpServletRequest0, modelMap1);

        //Test Result Assert
        assertEquals("success", string0);
    }
}
