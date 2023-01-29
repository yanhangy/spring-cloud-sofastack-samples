/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.io.sofastack.cloud.web.service;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import io.sofastack.cloud.common.model.BalanceDetails;
import io.sofastack.cloud.common.model.SerialOrder;
import io.sofastack.cloud.common.response.Result;
import io.sofastack.cloud.rest.facade.AccountingService;
import io.sofastack.cloud.web.model.RequestInfo;
import io.sofastack.cloud.web.service.AccountService;
import java.math.BigDecimal;
import java.util.Map;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AccountService_SSTest extends AccountService_SSTest_scaffolding {
// allCoveredLines:[27, 41, 51, 52, 54, 55, 57, 59, 60, 61, 62, 63, 64, 65, 67, 68, 70, 71, 72, 73, 74, 75, 79, 80, 81, 83, 84, 85, 86, 87, 88, 89, 92, 96, 97, 98, 99, 100, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113]

  @Test(timeout = 4000)
  public void test_balanceDetails_0()  throws Throwable  {
      //caseID:00f8867ba7030c7802ce05b1b34b3e92
      //CoveredLines: [27, 41]
      //Input_0_Map<String, Object>: {}
      //Assert: assertNull(method_result);
      
      AccountService accountService0 = new AccountService();
      //mock accountingService0
      AccountingService accountingService0 = mock(AccountingService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) AccountService.class, accountService0, "accountingService", (Object) accountingService0);
      //mock map0
      Map<String, Object> map0 = (Map<String, Object>) mock(Map.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: balanceDetails
      Result<BalanceDetails> result0 = accountService0.balanceDetails(map0);
      
      //Test Result Assert
      assertNull(result0);
  }

  @Test(timeout = 4000)
  public void test_checkBalance_1()  throws Throwable  {
      //caseID:a0ff602a37cf019653f7828c96e1e9bb
      //CoveredLines: [27, 79, 80, 83, 84, 85, 86, 92]
      //Input_0_io.sofastack.cloud.web.model.RequestInfo: {getMoney=0.0, getUserId=0}
      //Assert: assertFalse(method_result);
      
      AccountService accountService0 = new AccountService();
      //mock result0
      Result<BalanceDetails> result0 = (Result<BalanceDetails>) mock(Result.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock accountingService0
      AccountingService accountingService0 = mock(AccountingService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(result0).when(accountingService0).balanceDetail(ArgumentMatchers.<java.lang.String,java.lang.Object>anyMap());
      
      PrivateAccess.setVariable((Class<?>) AccountService.class, accountService0, "accountingService", (Object) accountingService0);
      //mock requestInfo0
      RequestInfo requestInfo0 = mock(RequestInfo.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(0.0).when(requestInfo0).getMoney();
      doReturn(0).when(requestInfo0).getUserId();
      
      //Call method: checkBalance
      boolean boolean0 = (boolean)PrivateAccess.callMethod((Class<AccountService>) AccountService.class, accountService0, "checkBalance", (Object) requestInfo0, (Class<?>) RequestInfo.class);
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_checkBalance_2()  throws Throwable  {
      //caseID:c344887ac534550f2c0ceb0b51ec42b6
      //CoveredLines: [27, 79, 80, 83, 84, 85, 86, 87, 88, 92]
      //Input_0_io.sofastack.cloud.web.model.RequestInfo: {getMoney=(double)1252, getUserId=1252}
      //Assert: assertFalse(method_result);
      
      AccountService accountService0 = new AccountService();
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      //mock balanceDetails0
      BalanceDetails balanceDetails0 = mock(BalanceDetails.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(bigDecimal0).when(balanceDetails0).getAvailableAssets();
      //mock result0
      Result<BalanceDetails> result0 = (Result<BalanceDetails>) mock(Result.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(balanceDetails0).when(result0).getData();
      doReturn(true).when(result0).isSuccess();
      //mock accountingService0
      AccountingService accountingService0 = mock(AccountingService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(result0).when(accountingService0).balanceDetail(ArgumentMatchers.<java.lang.String,java.lang.Object>anyMap());
      
      PrivateAccess.setVariable((Class<?>) AccountService.class, accountService0, "accountingService", (Object) accountingService0);
      //mock requestInfo0
      RequestInfo requestInfo0 = mock(RequestInfo.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((double)1252).when(requestInfo0).getMoney();
      doReturn(1252).when(requestInfo0).getUserId();
      
      //Call method: checkBalance
      boolean boolean0 = (boolean)PrivateAccess.callMethod((Class<AccountService>) AccountService.class, accountService0, "checkBalance", (Object) requestInfo0, (Class<?>) RequestInfo.class);
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_checkPayPassword_3()  throws Throwable  {
      //caseID:f9d1eb468cf388bdc4a1fbe44ac1333e
      //CoveredLines: [27, 96, 97, 98, 99, 100]
      //Input_0_int: -1
      //Input_1_String: userId
      //Assert: assertFalse(method_result);
      
      AccountService accountService0 = new AccountService();
      Boolean boolean0 = Boolean.FALSE;
      //mock result0
      Result<Boolean> result0 = (Result<Boolean>) mock(Result.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(boolean0).when(result0).getData();
      doReturn(true).when(result0).isSuccess();
      //mock accountingService0
      AccountingService accountingService0 = mock(AccountingService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(result0).when(accountingService0).checkPayPassword(ArgumentMatchers.<java.lang.String,java.lang.Object>anyMap());
      
      PrivateAccess.setVariable((Class<?>) AccountService.class, accountService0, "accountingService", (Object) accountingService0);
      
      //Call method: checkPayPassword
      boolean boolean1 = (boolean)PrivateAccess.callMethod((Class<AccountService>) AccountService.class, accountService0, "checkPayPassword", (Object) (-1), (Class<?>) int.class, (Object) "userId", (Class<?>) String.class);
      
      //Test Result Assert
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_transfer_4()  throws Throwable  {
      //caseID:82345358ff6a9b0b116429b3e06c3a4c
      //CoveredLines: [27, 51, 52, 54, 55, 57, 59, 60, 61, 74, 75, 96, 97, 98, 99, 100]
      //Input_0_RequestInfo: {getPassword=\"Handling completed with success\", getUserId=(-1)}
      //Assert: assertEquals("password check failures", method_result.getErrorMsg());
      //Assert: assertFalse(method_result.isSuccess());
      
      AccountService accountService0 = new AccountService();
      //mock result0
      Result<Boolean> result0 = (Result<Boolean>) mock(Result.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock accountingService0
      AccountingService accountingService0 = mock(AccountingService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(result0).when(accountingService0).checkPayPassword(ArgumentMatchers.<java.lang.String,java.lang.Object>anyMap());
      
      PrivateAccess.setVariable((Class<?>) AccountService.class, accountService0, "accountingService", (Object) accountingService0);
      //mock requestInfo0
      RequestInfo requestInfo0 = mock(RequestInfo.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("Handling completed with success").when(requestInfo0).getPassword();
      doReturn((-1)).when(requestInfo0).getUserId();
      
      //Call method: transfer
      Result<SerialOrder> result1 = accountService0.transfer(requestInfo0);
      
      //Test Result Assert
      assertEquals("password check failures", result1.getErrorMsg());
      
      //Test Result Assert
      assertFalse(result1.isSuccess());
  }

  @Test(timeout = 4000)
  public void test_transfer_5()  throws Throwable  {
      //caseID:67ee5aadbdd55f5a6086d6d26e29b582
      //CoveredLines: [27, 51, 52, 54, 55, 57, 62, 63, 64, 65, 74, 75, 79, 80, 81, 96, 97, 98, 99, 100]
      //Input_0_RequestInfo: {getPassword=\"Handling completed with success\", getMoney=(double)(-1), getUserId=(-1)}
      //Assert: assertFalse(method_result.isSuccess());
      //Assert: assertNotNull(method_result);
      //Assert: assertEquals("\u975E\u6CD5\u91D1\u989D\u6216\u8D26\u6237\u4F59\u989D\u4E0D\u8DB3", method_result.getErrorMsg());
      
      AccountService accountService0 = new AccountService();
      Boolean boolean0 = Boolean.TRUE;
      //mock result0
      Result<Boolean> result0 = (Result<Boolean>) mock(Result.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(boolean0).when(result0).getData();
      doReturn(true).when(result0).isSuccess();
      //mock accountingService0
      AccountingService accountingService0 = mock(AccountingService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(result0).when(accountingService0).checkPayPassword(ArgumentMatchers.<java.lang.String,java.lang.Object>anyMap());
      
      PrivateAccess.setVariable((Class<?>) AccountService.class, accountService0, "accountingService", (Object) accountingService0);
      //mock requestInfo0
      RequestInfo requestInfo0 = mock(RequestInfo.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((double)(-1)).when(requestInfo0).getMoney();
      doReturn("Handling completed with success").when(requestInfo0).getPassword();
      doReturn((-1)).when(requestInfo0).getUserId();
      
      //Call method: transfer
      Result<SerialOrder> result1 = accountService0.transfer(requestInfo0);
      
      //Test Result Assert
      assertFalse(result1.isSuccess());
      
      //Test Result Assert
      assertNotNull(result1);
      
      //Test Result Assert
      assertEquals("\u975E\u6CD5\u91D1\u989D\u6216\u8D26\u6237\u4F59\u989D\u4E0D\u8DB3", result1.getErrorMsg());
  }

  @Test(timeout = 4000)
  public void test_transfer_6()  throws Throwable  {
      //caseID:9b00631010639a0e1cb3df9b19b5b030
      //CoveredLines: [27, 51, 52, 54, 55, 57, 62, 70, 71, 72, 73, 75, 79, 80, 83, 84, 85, 86, 96, 97, 98, 99, 100]
      //Input_0_RequestInfo: {getPassword=\"Handling completed with success\", getUserId=(-1)}
      //Assert: assertFalse(method_result.isSuccess());
      
      AccountService accountService0 = new AccountService();
      Boolean boolean0 = Boolean.TRUE;
      //mock result0
      Result<Boolean> result0 = (Result<Boolean>) mock(Result.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(boolean0).when(result0).getData();
      doReturn(true).when(result0).isSuccess();
      //mock accountingService0
      AccountingService accountingService0 = mock(AccountingService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(result0).when(accountingService0).checkPayPassword(ArgumentMatchers.<java.lang.String,java.lang.Object>anyMap());
      
      PrivateAccess.setVariable((Class<?>) AccountService.class, accountService0, "accountingService", (Object) accountingService0);
      //mock requestInfo0
      RequestInfo requestInfo0 = mock(RequestInfo.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("Handling completed with success").when(requestInfo0).getPassword();
      doReturn((-1)).when(requestInfo0).getUserId();
      
      //Call method: transfer
      Result<SerialOrder> result1 = accountService0.transfer(requestInfo0);
      
      //Test Result Assert
      assertFalse(result1.isSuccess());
  }

  @Test(timeout = 4000)
  public void test_transfer_7()  throws Throwable  {
      //caseID:7e33ba1569cd038758d6eed10ee6d4f5
      //CoveredLines: [27, 51, 52, 54, 55, 57, 62, 67, 68, 74, 75, 79, 80, 83, 84, 85, 86, 87, 88, 89, 96, 97, 98, 99, 100, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113]
      //Input_0_RequestInfo: {getPassword=\"io.sofastack.cloud.web.service.AccountService\", getMoney=1.0, getUserId=0 3599}
      //Assert: assertNull(method_result);
      
      AccountService accountService0 = new AccountService();
      Boolean boolean0 = Boolean.TRUE;
      //mock result0
      Result<Boolean> result0 = (Result<Boolean>) mock(Result.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(boolean0).when(result0).getData();
      doReturn(true).when(result0).isSuccess();
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      //mock balanceDetails0
      BalanceDetails balanceDetails0 = mock(BalanceDetails.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(bigDecimal0).when(balanceDetails0).getAvailableAssets();
      //mock result1
      Result<BalanceDetails> result1 = (Result<BalanceDetails>) mock(Result.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(balanceDetails0).when(result1).getData();
      doReturn(true).when(result1).isSuccess();
      //mock accountingService0
      AccountingService accountingService0 = mock(AccountingService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(result1).when(accountingService0).balanceDetail(ArgumentMatchers.<java.lang.String,java.lang.Object>anyMap());
      doReturn(result0).when(accountingService0).checkPayPassword(ArgumentMatchers.<java.lang.String,java.lang.Object>anyMap());
      
      PrivateAccess.setVariable((Class<?>) AccountService.class, accountService0, "accountingService", (Object) accountingService0);
      //mock requestInfo0
      RequestInfo requestInfo0 = mock(RequestInfo.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(1.0).when(requestInfo0).getMoney();
      doReturn("io.sofastack.cloud.web.service.AccountService").when(requestInfo0).getPassword();
      doReturn(0, 3599).when(requestInfo0).getUserId();
      
      //Call method: transfer
      Result<SerialOrder> result2 = accountService0.transfer(requestInfo0);
      
      //Test Result Assert
      assertNull(result2);
  }
}