/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.io.sofastack.cloud.common.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import io.sofastack.cloud.common.model.TransferRequest;
import io.sofastack.cloud.common.utils.OrderUtils;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class OrderUtils_SSTest extends OrderUtils_SSTest_scaffolding {
// allCoveredLines:[14, 17, 21, 25, 26, 30, 31, 32, 34, 35]

  @Test(timeout = 4000)
  public void test_getSerialNo_0()  throws Throwable  {
      //caseID:0e82e268649704fc2e312a48f2a8de8d
      //CoveredLines: [17, 25, 26, 30, 34, 35]
      //Input_0_TransferRequest: {}
      //Assert: assertEquals("20140214082121320001", method_result);
      
      //mock transferRequest0
      TransferRequest transferRequest0 = mock(TransferRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: getSerialNo
      String string0 = OrderUtils.getSerialNo(transferRequest0);
      
      //Test Result Assert
      assertEquals("20140214082121320001", string0);
  }

  @Test(timeout = 4000)
  public void test_getTradingNo_1()  throws Throwable  {
      //caseID:79629663965104ddefb75e547900c86c
      //CoveredLines: [21, 25, 26, 30, 31, 32]
      //Input_0_TransferRequest: null
      //Assert: assertEquals("20140214082121320000", method_result);
      
      
      //Call method: getTradingNo
      String string0 = OrderUtils.getTradingNo((TransferRequest) null);
      
      //Test Result Assert
      assertEquals("20140214082121320000", string0);
  }

  @Test(timeout = 4000)
  public void test_getTradingNo_2()  throws Throwable  {
      //caseID:63b202f05228e7ea1b75838523b13753
      //CoveredLines: [14, 21, 25, 26, 30, 34, 35]
      //Input_0_TransferRequest: {getUserId=981}
      //Assert: assertEquals("20140214082121320083", method_result);
      
      OrderUtils orderUtils0 = new OrderUtils();
      //mock transferRequest0
      TransferRequest transferRequest0 = mock(TransferRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(981).when(transferRequest0).getUserId();
      
      //Call method: getTradingNo
      String string0 = OrderUtils.getTradingNo(transferRequest0);
      
      //Test Result Assert
      assertEquals("20140214082121320083", string0);
  }

  @Test(timeout = 4000)
  public void test_getTradingNo_3()  throws Throwable  {
      //caseID:a75ef76dabea2795eb8d45484ae9738c
      //CoveredLines: [14, 21, 25, 26, 30, 34, 35]
      //Input_0_TransferRequest: {}
      //Assert: assertEquals("20140214082121320002", method_result);
      
      OrderUtils orderUtils0 = new OrderUtils();
      //mock transferRequest0
      TransferRequest transferRequest0 = mock(TransferRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: getTradingNo
      String string0 = OrderUtils.getTradingNo(transferRequest0);
      
      //Test Result Assert
      assertEquals("20140214082121320002", string0);
  }
}
