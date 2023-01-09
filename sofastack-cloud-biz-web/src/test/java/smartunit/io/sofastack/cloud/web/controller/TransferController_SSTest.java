/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.io.sofastack.cloud.web.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import io.sofastack.cloud.common.model.SerialOrder;
import io.sofastack.cloud.common.model.TradingContext;
import io.sofastack.cloud.common.model.TradingOrder;
import io.sofastack.cloud.common.response.RestFacadeResp;
import io.sofastack.cloud.common.response.Result;
import io.sofastack.cloud.core.kafka.KafkaSender;
import io.sofastack.cloud.web.controller.TransferController;
import io.sofastack.cloud.web.model.RequestInfo;
import io.sofastack.cloud.web.service.AccountService;
import io.sofastack.cloud.web.service.TradeService;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class TransferController_SSTest extends TransferController_SSTest_scaffolding {
// allCoveredLines:[27, 41, 42, 45, 46, 48, 49, 50, 51, 52, 54, 55, 57, 58, 59, 61, 62, 63, 64, 66, 67, 68, 69, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91]

  @Test(timeout = 4000)
  public void test_parseRequest_0()  throws Throwable  {
      //caseID:678c38f9764751ba6a4832c97bda7062
      //CoveredLines: [27, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91]
      //Input_0_io.sofastack.cloud.web.model.RequestInfo: {getTargetId=1, getRemark=\"E\", getMoney=(double)1, getUserId=1}
      //Input_1_io.sofastack.cloud.common.model.SerialOrder: {getDataFlag=1, getId=\"E\"}
      //Assert: assertEquals("\u4EA4\u6613\u6210\u529F", method_result.getOrderState());
      //Assert: assertEquals("\u652F\u4ED8\u5B9D", method_result.getPayChannel());
      //Assert: assertEquals("\u8F6C\u8D26", method_result.getOrderType());
      //Assert: assertEquals("\u8F6C\u8D26", method_result.getOrderGroup());
      
      TransferController transferController0 = new TransferController();
      //mock requestInfo0
      RequestInfo requestInfo0 = mock(RequestInfo.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((double)1).when(requestInfo0).getMoney();
      doReturn("E").when(requestInfo0).getRemark();
      doReturn(1).when(requestInfo0).getTargetId();
      doReturn(1).when(requestInfo0).getUserId();
      //mock serialOrder0
      SerialOrder serialOrder0 = mock(SerialOrder.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(1).when(serialOrder0).getDataFlag();
      doReturn("E").when(serialOrder0).getId();
      
      //Call method: parseRequest
      TradingContext tradingContext0 = (TradingContext)PrivateAccess.callMethod((Class<TransferController>) TransferController.class, transferController0, "parseRequest", (Object) requestInfo0, (Class<?>) RequestInfo.class, (Object) serialOrder0, (Class<?>) SerialOrder.class);
      
      //Test Result Assert
      assertEquals("\u4EA4\u6613\u6210\u529F", tradingContext0.getOrderState());
      
      //Test Result Assert
      assertEquals("\u652F\u4ED8\u5B9D", tradingContext0.getPayChannel());
      
      //Test Result Assert
      assertEquals("\u8F6C\u8D26", tradingContext0.getOrderType());
      
      //Test Result Assert
      assertEquals("\u8F6C\u8D26", tradingContext0.getOrderGroup());
  }

  @Test(timeout = 4000)
  public void test_transfer_1()  throws Throwable  {
      //caseID:fd88d41c82ff9dd2ce8dbbe6bc2568e5
      //CoveredLines: [27, 41, 42, 45, 46, 58, 59, 66, 67, 68, 69]
      //Input_0_RequestInfo: {toString=\"org.bouncycastle.jce.provider.X509StoreCertCollection\", getUserId=0}
      //Assert: assertFalse(method_result.isSuccess());
      
      TransferController transferController0 = new TransferController();
      //mock kafkaSender0
      KafkaSender kafkaSender0 = mock(KafkaSender.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock result0
      Result<SerialOrder> result0 = (Result<SerialOrder>) mock(Result.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock accountService0
      AccountService accountService0 = mock(AccountService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(result0).when(accountService0).transfer(any(io.sofastack.cloud.web.model.RequestInfo.class));
      
      PrivateAccess.setVariable((Class<?>) TransferController.class, transferController0, "accountService", (Object) accountService0);
      
      PrivateAccess.setVariable((Class<?>) TransferController.class, transferController0, "kafkaSender", (Object) kafkaSender0);
      //mock requestInfo0
      RequestInfo requestInfo0 = mock(RequestInfo.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(0).when(requestInfo0).getUserId();
      doReturn("org.bouncycastle.jce.provider.X509StoreCertCollection").when(requestInfo0).toString();
      
      //Call method: transfer
      RestFacadeResp<String> restFacadeResp0 = transferController0.transfer(requestInfo0);
      
      //Test Result Assert
      assertFalse(restFacadeResp0.isSuccess());
  }

  @Test(timeout = 4000)
  public void test_transfer_2()  throws Throwable  {
      //caseID:c260b59ef5e63bd48c4d098a0056f249
      //CoveredLines: [27, 41, 42, 45, 46, 48, 49, 50, 51, 52, 57, 66, 67, 68, 69, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91]
      //Input_0_RequestInfo: {getTargetId=965, getRemark=\"Receive transfer requestInfo:[{}]\", toString=\"1379\", getMoney=0.0, getUserId=1 1}
      //Assert: assertTrue(method_result.isSuccess());
      
      TransferController transferController0 = new TransferController();
      //mock kafkaSender0
      KafkaSender kafkaSender0 = mock(KafkaSender.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock serialOrder0
      SerialOrder serialOrder0 = mock(SerialOrder.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(252).when(serialOrder0).getDataFlag();
      doReturn("io.sofastack.cloud.web.controller.TransferController").when(serialOrder0).getId();
      //mock result0
      Result<SerialOrder> result0 = (Result<SerialOrder>) mock(Result.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(serialOrder0).when(result0).getData();
      doReturn(true).when(result0).isSuccess();
      //mock accountService0
      AccountService accountService0 = mock(AccountService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(result0).when(accountService0).transfer(any(io.sofastack.cloud.web.model.RequestInfo.class));
      //mock tradingOrder0
      TradingOrder tradingOrder0 = mock(TradingOrder.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("402").when(tradingOrder0).getId();
      //mock result1
      Result<TradingOrder> result1 = (Result<TradingOrder>) mock(Result.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(tradingOrder0).when(result1).getData();
      doReturn(true).when(result1).isSuccess();
      //mock tradeService0
      TradeService tradeService0 = mock(TradeService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(result1).when(tradeService0).createTradingOrder(any(io.sofastack.cloud.common.model.TradingContext.class));
      
      PrivateAccess.setVariable((Class<?>) TransferController.class, transferController0, "tradingService", (Object) tradeService0);
      
      PrivateAccess.setVariable((Class<?>) TransferController.class, transferController0, "accountService", (Object) accountService0);
      
      PrivateAccess.setVariable((Class<?>) TransferController.class, transferController0, "kafkaSender", (Object) kafkaSender0);
      //mock requestInfo0
      RequestInfo requestInfo0 = mock(RequestInfo.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(0.0).when(requestInfo0).getMoney();
      doReturn("Receive transfer requestInfo:[{}]").when(requestInfo0).getRemark();
      doReturn(965).when(requestInfo0).getTargetId();
      doReturn(1, 1).when(requestInfo0).getUserId();
      doReturn("1379").when(requestInfo0).toString();
      
      //Call method: transfer
      RestFacadeResp<String> restFacadeResp0 = transferController0.transfer(requestInfo0);
      
      //Test Result Assert
      assertTrue(restFacadeResp0.isSuccess());
  }

  @Test(timeout = 4000)
  public void test_transfer_3()  throws Throwable  {
      //caseID:8c6fc3edf8ec66b9ea8e5ade25c99d49
      //CoveredLines: [27, 41, 42, 45, 46, 48, 49, 50, 54, 55, 57, 66, 67, 68, 69, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91]
      //Input_0_RequestInfo: {getTargetId=0, getRemark=\"] - trying package scan. \", toString=\"] - trying package scan. \", getMoney=(double)0, getUserId=0 0}
      //Assert: assertFalse(method_result.isSuccess());
      
      TransferController transferController0 = new TransferController();
      //mock kafkaSender0
      KafkaSender kafkaSender0 = mock(KafkaSender.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock serialOrder0
      SerialOrder serialOrder0 = mock(SerialOrder.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(0).when(serialOrder0).getDataFlag();
      doReturn("] - trying package scan. ").when(serialOrder0).getId();
      //mock result0
      Result<SerialOrder> result0 = (Result<SerialOrder>) mock(Result.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(serialOrder0).when(result0).getData();
      doReturn(true).when(result0).isSuccess();
      //mock accountService0
      AccountService accountService0 = mock(AccountService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(result0).when(accountService0).transfer(any(io.sofastack.cloud.web.model.RequestInfo.class));
      //mock result1
      Result<TradingOrder> result1 = (Result<TradingOrder>) mock(Result.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("] - trying package scan. ").when(result1).getErrorMsg();
      doReturn(false).when(result1).isSuccess();
      //mock tradeService0
      TradeService tradeService0 = mock(TradeService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(result1).when(tradeService0).createTradingOrder(any(io.sofastack.cloud.common.model.TradingContext.class));
      
      PrivateAccess.setVariable((Class<?>) TransferController.class, transferController0, "tradingService", (Object) tradeService0);
      
      PrivateAccess.setVariable((Class<?>) TransferController.class, transferController0, "accountService", (Object) accountService0);
      
      PrivateAccess.setVariable((Class<?>) TransferController.class, transferController0, "kafkaSender", (Object) kafkaSender0);
      //mock requestInfo0
      RequestInfo requestInfo0 = mock(RequestInfo.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((double)0).when(requestInfo0).getMoney();
      doReturn("] - trying package scan. ").when(requestInfo0).getRemark();
      doReturn(0).when(requestInfo0).getTargetId();
      doReturn(0, 0).when(requestInfo0).getUserId();
      doReturn("] - trying package scan. ").when(requestInfo0).toString();
      
      //Call method: transfer
      RestFacadeResp<String> restFacadeResp0 = transferController0.transfer(requestInfo0);
      
      //Test Result Assert
      assertFalse(restFacadeResp0.isSuccess());
  }

  @Test(timeout = 4000)
  public void test_transfer_4()  throws Throwable  {
      //caseID:31939b800e67fcc758a71cf12aa52da8
      //CoveredLines: [27, 41, 42, 45, 46, 48, 49, 50, 51, 61, 62, 63, 64, 66, 67, 68, 69, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91]
      //Input_0_RequestInfo: {getTargetId=0, getRemark=\"\\u8F6C\\u8D26\", toString=\"\\u8F6C\\u8D26\", getMoney=(double)0, getUserId=0 0}
      //Assert: assertFalse(method_result.isSuccess());
      
      TransferController transferController0 = new TransferController();
      //mock kafkaSender0
      KafkaSender kafkaSender0 = mock(KafkaSender.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock serialOrder0
      SerialOrder serialOrder0 = mock(SerialOrder.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(0).when(serialOrder0).getDataFlag();
      doReturn("\u8F6C\u8D26").when(serialOrder0).getId();
      //mock result0
      Result<SerialOrder> result0 = (Result<SerialOrder>) mock(Result.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(serialOrder0).when(result0).getData();
      doReturn(true).when(result0).isSuccess();
      //mock accountService0
      AccountService accountService0 = mock(AccountService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(result0).when(accountService0).transfer(any(io.sofastack.cloud.web.model.RequestInfo.class));
      //mock result1
      Result<TradingOrder> result1 = (Result<TradingOrder>) mock(Result.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("\u8F6C\u8D26").when(result1).getErrorMsg();
      doReturn(true).when(result1).isSuccess();
      //mock tradeService0
      TradeService tradeService0 = mock(TradeService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(result1).when(tradeService0).createTradingOrder(any(io.sofastack.cloud.common.model.TradingContext.class));
      
      PrivateAccess.setVariable((Class<?>) TransferController.class, transferController0, "tradingService", (Object) tradeService0);
      
      PrivateAccess.setVariable((Class<?>) TransferController.class, transferController0, "accountService", (Object) accountService0);
      
      PrivateAccess.setVariable((Class<?>) TransferController.class, transferController0, "kafkaSender", (Object) kafkaSender0);
      //mock requestInfo0
      RequestInfo requestInfo0 = mock(RequestInfo.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((double)0).when(requestInfo0).getMoney();
      doReturn("\u8F6C\u8D26").when(requestInfo0).getRemark();
      doReturn(0).when(requestInfo0).getTargetId();
      doReturn(0, 0).when(requestInfo0).getUserId();
      doReturn("\u8F6C\u8D26").when(requestInfo0).toString();
      
      //Call method: transfer
      RestFacadeResp<String> restFacadeResp0 = transferController0.transfer(requestInfo0);
      
      //Test Result Assert
      assertFalse(restFacadeResp0.isSuccess());
  }
}
