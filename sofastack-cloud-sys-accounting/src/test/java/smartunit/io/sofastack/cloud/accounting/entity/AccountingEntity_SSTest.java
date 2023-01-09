/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.io.sofastack.cloud.accounting.entity;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import io.sofastack.cloud.accounting.entity.AccountingEntity;
import java.math.BigDecimal;
import java.util.Date;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AccountingEntity_SSTest extends AccountingEntity_SSTest_scaffolding {
// allCoveredLines:[10, 25, 29, 30, 33, 37, 38, 41, 45, 46, 49, 53, 54, 57, 61, 62, 65, 69, 70, 73, 77, 78, 81, 85, 86, 89, 93, 94, 97, 101, 102, 105, 109, 110, 113, 117, 118]

  @Test(timeout = 4000)
  public void test_getAvailableAssets_00()  throws Throwable  {
      //caseID:701fa8269f80a29d31d5eef3c57d7e0a
      //CoveredLines: [10, 57]
      //Assert: assertSame(method_result, bigDecimal0);
      
      AccountingEntity accountingEntity0 = new AccountingEntity();
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      
      PrivateAccess.setVariable((Class<?>) AccountingEntity.class, accountingEntity0, "availableAssets", (Object) bigDecimal0);
      
      //Call method: getAvailableAssets
      BigDecimal bigDecimal1 = accountingEntity0.getAvailableAssets();
      
      //Test Result Assert
      assertSame(bigDecimal1, bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test_getCreateTime_01()  throws Throwable  {
      //caseID:b3272867655745e9adbef33c14b84fd6
      //CoveredLines: [10, 73]
      //Assert: assertNull(method_result);
      
      AccountingEntity accountingEntity0 = new AccountingEntity();
      
      //Call method: getCreateTime
      Date date0 = accountingEntity0.getCreateTime();
      
      //Test Result Assert
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test_getFrozenAssets_02()  throws Throwable  {
      //caseID:f2dd086d4eaea24d6990b0fea2f7b0ee
      //CoveredLines: [10, 49]
      //Assert: assertEquals((byte)0, method_result.byteValue());
      
      AccountingEntity accountingEntity0 = new AccountingEntity();
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      
      PrivateAccess.setVariable((Class<?>) AccountingEntity.class, accountingEntity0, "frozenAssets", (Object) bigDecimal0);
      
      //Call method: getFrozenAssets
      BigDecimal bigDecimal1 = accountingEntity0.getFrozenAssets();
      
      //Test Result Assert
      assertEquals((byte)0, bigDecimal1.byteValue());
  }

  @Test(timeout = 4000)
  public void test_getId_03()  throws Throwable  {
      //caseID:469c30caf78886eec616f5e288d74039
      //CoveredLines: [10, 25]
      //Assert: assertEquals(0, method_result);
      
      AccountingEntity accountingEntity0 = new AccountingEntity();
      
      //Call method: getId
      int int0 = accountingEntity0.getId();
      
      //Test Result Assert
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_getLevel_04()  throws Throwable  {
      //caseID:ff7460d9278e9e191da012d07d527302
      //CoveredLines: [10, 89]
      //Assert: assertEquals(0, method_result);
      
      AccountingEntity accountingEntity0 = new AccountingEntity();
      
      //Call method: getLevel
      int int0 = accountingEntity0.getLevel();
      
      //Test Result Assert
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_getPayPassword_05()  throws Throwable  {
      //caseID:7758d2a312141ca499d03e06209bb022
      //CoveredLines: [10, 105]
      //Assert: assertNull(method_result);
      
      AccountingEntity accountingEntity0 = new AccountingEntity();
      
      //Call method: getPayPassword
      String string0 = accountingEntity0.getPayPassword();
      
      //Test Result Assert
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_getPoints_06()  throws Throwable  {
      //caseID:e13e009a2dc95ea6fb3829be4786107e
      //CoveredLines: [10, 97]
      //Assert: assertEquals(0, method_result);
      
      AccountingEntity accountingEntity0 = new AccountingEntity();
      
      //Call method: getPoints
      int int0 = accountingEntity0.getPoints();
      
      //Test Result Assert
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_getReservedField_07()  throws Throwable  {
      //caseID:073be17b2fc3d2f9e6a38347dfb6b933
      //CoveredLines: [10, 113]
      //Assert: assertNull(method_result);
      
      AccountingEntity accountingEntity0 = new AccountingEntity();
      
      //Call method: getReservedField
      String string0 = accountingEntity0.getReservedField();
      
      //Test Result Assert
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_getState_08()  throws Throwable  {
      //caseID:1b015ee7a6111b727acbb02ec0ae6d00
      //CoveredLines: [10, 65]
      //Assert: assertNull(method_result);
      
      AccountingEntity accountingEntity0 = new AccountingEntity();
      
      //Call method: getState
      String string0 = accountingEntity0.getState();
      
      //Test Result Assert
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_getTotalAssets_09()  throws Throwable  {
      //caseID:9f96f38bdef83683cc233c29ac6ff330
      //CoveredLines: [10, 41]
      //Assert: assertEquals((short)2164, method_result.shortValue());
      
      AccountingEntity accountingEntity0 = new AccountingEntity();
      BigDecimal bigDecimal0 = new BigDecimal(2164);
      
      PrivateAccess.setVariable((Class<?>) AccountingEntity.class, accountingEntity0, "totalAssets", (Object) bigDecimal0);
      
      //Call method: getTotalAssets
      BigDecimal bigDecimal1 = accountingEntity0.getTotalAssets();
      
      //Test Result Assert
      assertEquals((short)2164, bigDecimal1.shortValue());
  }

  @Test(timeout = 4000)
  public void test_getType_10()  throws Throwable  {
      //caseID:e80d9953cdde289910e072f8d6b6723e
      //CoveredLines: [10, 81]
      //Assert: assertNull(method_result);
      
      AccountingEntity accountingEntity0 = new AccountingEntity();
      
      //Call method: getType
      String string0 = accountingEntity0.getType();
      
      //Test Result Assert
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_getUserId_11()  throws Throwable  {
      //caseID:062385215cab71d76737a24299627c4c
      //CoveredLines: [10, 33]
      //Assert: assertEquals(0, method_result);
      
      AccountingEntity accountingEntity0 = new AccountingEntity();
      
      //Call method: getUserId
      int int0 = accountingEntity0.getUserId();
      
      //Test Result Assert
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_setAvailableAssets_12()  throws Throwable  {
      //caseID:fefb613b49a449af3e6599f8ce036145
      //CoveredLines: [10, 61, 62]
      //Input_0_BigDecimal: BigDecimal.ZERO
      
      AccountingEntity accountingEntity0 = new AccountingEntity();
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      
      //Call method: setAvailableAssets
      accountingEntity0.setAvailableAssets(bigDecimal0);
      
      //Test Result Assert
      assertNull(accountingEntity0.getReservedField());
  }

  @Test(timeout = 4000)
  public void test_setCreateTime_13()  throws Throwable  {
      //caseID:785cd06b9b3ba033bb8d5c7a786d0bd4
      //CoveredLines: [10, 77, 78]
      //Input_0_Date: {}
      
      AccountingEntity accountingEntity0 = new AccountingEntity();
      //mock date0
      Date date0 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: setCreateTime
      accountingEntity0.setCreateTime(date0);
      
      //Test Result Assert
      assertEquals(0, accountingEntity0.getUserId());
  }

  @Test(timeout = 4000)
  public void test_setFrozenAssets_14()  throws Throwable  {
      //caseID:4f6362a6d0b49df271a24d28beb5ecf6
      //CoveredLines: [10, 53, 54]
      //Input_0_BigDecimal: 188
      
      AccountingEntity accountingEntity0 = new AccountingEntity();
      BigDecimal bigDecimal0 = new BigDecimal(188);
      
      //Call method: setFrozenAssets
      accountingEntity0.setFrozenAssets(bigDecimal0);
      
      //Test Result Assert
      assertEquals((short)188, bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test_setId_15()  throws Throwable  {
      //caseID:b891aaab5e6d86296481b352911bba0b
      //CoveredLines: [10, 29, 30]
      //Input_0_int: 1556
      
      AccountingEntity accountingEntity0 = new AccountingEntity();
      
      //Call method: setId
      accountingEntity0.setId(1556);
      
      //Test Result Assert
      assertEquals(1556, accountingEntity0.getId());
  }

  @Test(timeout = 4000)
  public void test_setLevel_16()  throws Throwable  {
      //caseID:bba50b94828e253c34a9aa30ebb2956f
      //CoveredLines: [10, 93, 94]
      //Input_0_int: 41
      
      AccountingEntity accountingEntity0 = new AccountingEntity();
      
      //Call method: setLevel
      accountingEntity0.setLevel(41);
      
      //Test Result Assert
      assertEquals(41, accountingEntity0.getLevel());
  }

  @Test(timeout = 4000)
  public void test_setPayPassword_17()  throws Throwable  {
      //caseID:2a8e4c135313d08595c5334fe855519b
      //CoveredLines: [10, 109, 110]
      //Input_0_String: 1.0
      
      AccountingEntity accountingEntity0 = new AccountingEntity();
      
      //Call method: setPayPassword
      accountingEntity0.setPayPassword("1.0");
      
      //Test Result Assert
      assertEquals(0, accountingEntity0.getId());
  }

  @Test(timeout = 4000)
  public void test_setPoints_18()  throws Throwable  {
      //caseID:77d767549a4a9b8fc629147477c0c0fc
      //CoveredLines: [10, 101, 102]
      //Input_0_int: 0
      
      AccountingEntity accountingEntity0 = new AccountingEntity();
      
      //Call method: setPoints
      accountingEntity0.setPoints(0);
      
      //Test Result Assert
      assertEquals(0, accountingEntity0.getPoints());
  }

  @Test(timeout = 4000)
  public void test_setReservedField_19()  throws Throwable  {
      //caseID:1aa38c2aaa49f1d5685579973bc37502
      //CoveredLines: [10, 117, 118]
      //Input_0_String: )M@$\"J
      
      AccountingEntity accountingEntity0 = new AccountingEntity();
      
      //Call method: setReservedField
      accountingEntity0.setReservedField(")M@$\"J");
      
      //Test Result Assert
      assertNull(accountingEntity0.getType());
  }

  @Test(timeout = 4000)
  public void test_setState_20()  throws Throwable  {
      //caseID:ef3561005eb090ede30c0edf5f175538
      //CoveredLines: [10, 69, 70]
      //Input_0_String: 
      
      AccountingEntity accountingEntity0 = new AccountingEntity();
      
      //Call method: setState
      accountingEntity0.setState("");
      
      //Test Result Assert
      assertEquals(0, accountingEntity0.getLevel());
  }

  @Test(timeout = 4000)
  public void test_setTotalAssets_21()  throws Throwable  {
      //caseID:20039e410ee56a3a5e8a1434f5a08cef
      //CoveredLines: [10, 45, 46]
      //Input_0_BigDecimal: BigDecimal.ZERO
      
      AccountingEntity accountingEntity0 = new AccountingEntity();
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      
      //Call method: setTotalAssets
      accountingEntity0.setTotalAssets(bigDecimal0);
      
      //Test Result Assert
      assertNull(accountingEntity0.getType());
  }

  @Test(timeout = 4000)
  public void test_setType_22()  throws Throwable  {
      //caseID:37bab35bc57310408c3f05b43ec462a8
      //CoveredLines: [10, 85, 86]
      //Input_0_String: 1
      
      AccountingEntity accountingEntity0 = new AccountingEntity();
      
      //Call method: setType
      accountingEntity0.setType("1");
      
      //Test Result Assert
      assertEquals(0, accountingEntity0.getLevel());
  }

  @Test(timeout = 4000)
  public void test_setUserId_23()  throws Throwable  {
      //caseID:8caf40a85e4ad5c8c253dff1f08479b5
      //CoveredLines: [10, 37, 38]
      //Input_0_int: 0
      
      AccountingEntity accountingEntity0 = new AccountingEntity();
      
      //Call method: setUserId
      accountingEntity0.setUserId(0);
      
      //Test Result Assert
      assertEquals(0, accountingEntity0.getUserId());
  }
}