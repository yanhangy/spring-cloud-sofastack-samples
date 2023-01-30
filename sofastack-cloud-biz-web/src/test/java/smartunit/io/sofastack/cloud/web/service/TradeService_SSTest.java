/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.io.sofastack.cloud.web.service;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import io.sofastack.cloud.common.model.TradingContext;
import io.sofastack.cloud.common.model.TradingOrder;
import io.sofastack.cloud.common.response.Result;
import io.sofastack.cloud.facade.trading.TradingService;
import io.sofastack.cloud.web.service.TradeService;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class)
@SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true)
public class TradeService_SSTest extends TradeService_SSTest_scaffolding {
    // allCoveredLines:[18, 30, 31, 32, 34, 44]

    @Test(timeout = 4000)
    public void test_createTradingOrder_0() throws Throwable {
        //caseID:d6cad02245803978f09a252805893b5b
        //CoveredLines: [18, 30, 31, 34, 44]
        //Input_0_TradingContext: {getSerialNo=\"uVlR6yy)q#~$bUs_h\"}
        //Assert: assertNull(method_result);

        TradeService tradeService0 = new TradeService();
        //mock tradingOrder0
        TradingOrder tradingOrder0 = mock(TradingOrder.class,
            withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        //mock result0
        Result<TradingOrder> result0 = (Result<TradingOrder>) mock(Result.class, withSettings()
            .defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn(tradingOrder0).when(result0).getData();
        doReturn(true).when(result0).isSuccess();
        doReturn("uVlR6yy)q#~$bUs_h").when(result0).toString();
        //mock tradingService0
        TradingService tradingService0 = mock(TradingService.class,
            withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn(result0).when(tradingService0).queryTradingOrder(anyString());

        PrivateAccess.setVariable((Class<?>) TradeService.class, tradeService0, "tradingService",
            (Object) tradingService0);
        //mock tradingContext0
        TradingContext tradingContext0 = mock(TradingContext.class,
            withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn("uVlR6yy)q#~$bUs_h").when(tradingContext0).getSerialNo();

        //Call method: createTradingOrder
        Result<TradingOrder> result1 = tradeService0.createTradingOrder(tradingContext0);

        //Test Result Assert
        assertNull(result1);
    }

    @Test(timeout = 4000)
    public void test_createTradingOrder_1() throws Throwable {
        //caseID:9b8fcfbdd56acfb556977ba2ef6d45e0
        //CoveredLines: [18, 30, 31, 32, 44]
        //Input_0_TradingContext: {getSerialNo=\"uVlR6yy)q#~$bUs_h\"}
        //Assert: assertNotNull(method_result);
        //Assert: assertNull(method_result.getErrorMsg());

        TradeService tradeService0 = new TradeService();
        //mock tradingOrder0
        TradingOrder tradingOrder0 = mock(TradingOrder.class,
            withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn("uVlR6yy)q#~$bUs_h").when(tradingOrder0).getId();
        //mock result0
        Result<TradingOrder> result0 = (Result<TradingOrder>) mock(Result.class, withSettings()
            .defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn(tradingOrder0).when(result0).getData();
        doReturn(true).when(result0).isSuccess();
        doReturn("uVlR6yy)q#~$bUs_h").when(result0).toString();
        //mock tradingService0
        TradingService tradingService0 = mock(TradingService.class,
            withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn(result0).when(tradingService0).queryTradingOrder(anyString());

        PrivateAccess.setVariable((Class<?>) TradeService.class, tradeService0, "tradingService",
            (Object) tradingService0);
        //mock tradingContext0
        TradingContext tradingContext0 = mock(TradingContext.class,
            withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn("uVlR6yy)q#~$bUs_h").when(tradingContext0).getSerialNo();

        //Call method: createTradingOrder
        Result<TradingOrder> result1 = tradeService0.createTradingOrder(tradingContext0);

        //Test Result Assert
        assertNotNull(result1);

        //Test Result Assert
        assertNull(result1.getErrorMsg());
    }

    @Test(timeout = 4000)
    public void test_createTradingOrder_2() throws Throwable {
        //caseID:f40ebe008e99930471d3b0d560389ed8
        //CoveredLines: [18, 30, 31, 34, 44]
        //Input_0_TradingContext: {getSerialNo=\"1.0\"}
        //Assert: assertNull(method_result);

        TradeService tradeService0 = new TradeService();
        //mock result0
        Result<TradingOrder> result0 = (Result<TradingOrder>) mock(Result.class, withSettings()
            .defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        //mock tradingService0
        TradingService tradingService0 = mock(TradingService.class,
            withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn(result0).when(tradingService0).queryTradingOrder(nullable(java.lang.String.class));

        PrivateAccess.setVariable((Class<?>) TradeService.class, tradeService0, "tradingService",
            (Object) tradingService0);
        //mock tradingContext0
        TradingContext tradingContext0 = mock(TradingContext.class,
            withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn("1.0").when(tradingContext0).getSerialNo();

        //Call method: createTradingOrder
        Result<TradingOrder> result1 = tradeService0.createTradingOrder(tradingContext0);

        //Test Result Assert
        assertNull(result1);
    }
}
