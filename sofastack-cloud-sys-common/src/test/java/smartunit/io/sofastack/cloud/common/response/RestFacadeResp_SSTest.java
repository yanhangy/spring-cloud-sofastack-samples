/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.io.sofastack.cloud.common.response;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import io.sofastack.cloud.common.response.RestFacadeResp;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class RestFacadeResp_SSTest extends RestFacadeResp_SSTest_scaffolding {
// allCoveredLines:[7, 11, 14, 18, 19, 22, 26, 27]

  @Test(timeout = 4000)
  public void test_getData_0()  throws Throwable  {
      //caseID:99cf9bd5dcd39768499aaf20fa7fd9dd
      //CoveredLines: [7, 11, 14]
      //Assert: assertFalse(restFacadeResp0.isSuccess());
      
      RestFacadeResp<Object> restFacadeResp0 = new RestFacadeResp<Object>();
      
      //Call method: getData
      restFacadeResp0.getData();
      
      //Test Result Assert
      assertFalse(restFacadeResp0.isSuccess());
  }

  @Test(timeout = 4000)
  public void test_isSuccess_1()  throws Throwable  {
      //caseID:f9c89577767a70065a85185ddea7e3ba
      //CoveredLines: [7, 11, 22]
      //Assert: assertFalse(method_result);
      
      RestFacadeResp<Object> restFacadeResp0 = new RestFacadeResp<Object>();
      
      //Call method: isSuccess
      boolean boolean0 = restFacadeResp0.isSuccess();
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_setData_2()  throws Throwable  {
      //caseID:a1f830cf8173c3115199900bbb205475
      //CoveredLines: [7, 11, 18, 19]
      //Input_0_Object: 1
      
      RestFacadeResp<Object> restFacadeResp0 = new RestFacadeResp<Object>();
      
      //Call method: setData
      restFacadeResp0.setData("1");
      
      //Test Result Assert
      assertFalse(restFacadeResp0.isSuccess());
  }

  @Test(timeout = 4000)
  public void test_setSuccess_3()  throws Throwable  {
      //caseID:57d7244e385df572044497e1337ab7df
      //CoveredLines: [7, 11, 26, 27]
      //Input_0_boolean: true
      
      RestFacadeResp<Object> restFacadeResp0 = new RestFacadeResp<Object>();
      
      //Test Result Assert
      assertFalse(restFacadeResp0.isSuccess());
      
      
      //Call method: setSuccess
      restFacadeResp0.setSuccess(true);
      
      //Test Result Assert
      assertTrue(restFacadeResp0.isSuccess());
  }
}