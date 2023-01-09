/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.io.sofastack.cloud.gateway.configuration;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import static org.smartunit.runtime.SmartAssertions.*;
import com.alibaba.csp.sentinel.adapter.gateway.sc.SentinelGatewayFilter;
import com.alibaba.csp.sentinel.adapter.gateway.sc.exception.SentinelGatewayBlockExceptionHandler;
import io.sofastack.cloud.gateway.configuration.GatewayConfiguration;
import java.util.List;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.http.codec.ServerCodecConfigurer;
import org.springframework.web.reactive.result.view.ViewResolver;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class GatewayConfiguration_SSTest extends GatewayConfiguration_SSTest_scaffolding {
// allCoveredLines:[32, 33, 34, 35, 44, 54, 59, 60, 66, 67, 69, 71, 72, 73]

  @Test(timeout = 4000)
  public void test_doInit_0()  throws Throwable  {
      //caseID:f0cf0e715b0ae2932cada19f2fcf2f54
      //CoveredLines: [32, 33, 34, 35, 59, 60, 66, 67, 69, 71, 72, 73]
      
      //mock objectProvider0
      ObjectProvider<List<ViewResolver>> objectProvider0 = (ObjectProvider<List<ViewResolver>>) mock(ObjectProvider.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock serverCodecConfigurer0
      ServerCodecConfigurer serverCodecConfigurer0 = mock(ServerCodecConfigurer.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      GatewayConfiguration gatewayConfiguration0 = new GatewayConfiguration(objectProvider0, serverCodecConfigurer0);
      
      //Call method: doInit
      // Undeclared exception!
      try { 
        gatewayConfiguration0.doInit();
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test_sentinelGatewayBlockExceptionHandler_1()  throws Throwable  {
      //caseID:23cd367d9c5df8952bb714b8ffd764fc
      //CoveredLines: [32, 33, 34, 35, 44]
      //Assert: assertNotNull(method_result);
      
      //mock objectProvider0
      ObjectProvider<List<ViewResolver>> objectProvider0 = (ObjectProvider<List<ViewResolver>>) mock(ObjectProvider.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock serverCodecConfigurer0
      ServerCodecConfigurer serverCodecConfigurer0 = mock(ServerCodecConfigurer.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      GatewayConfiguration gatewayConfiguration0 = new GatewayConfiguration(objectProvider0, serverCodecConfigurer0);
      
      //Call method: sentinelGatewayBlockExceptionHandler
      SentinelGatewayBlockExceptionHandler sentinelGatewayBlockExceptionHandler0 = gatewayConfiguration0.sentinelGatewayBlockExceptionHandler();
      
      //Test Result Assert
      assertNotNull(sentinelGatewayBlockExceptionHandler0);
  }

  @Test(timeout = 4000)
  public void test_sentinelGatewayFilter_2()  throws Throwable  {
      //caseID:b90aae9d43c65f70fc505b17c3e330bb
      //CoveredLines: [32, 33, 34, 35, 54]
      //Assert: assertEquals("", method_result.shortcutFieldPrefix());
      
      //mock objectProvider0
      ObjectProvider<List<ViewResolver>> objectProvider0 = (ObjectProvider<List<ViewResolver>>) mock(ObjectProvider.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock serverCodecConfigurer0
      ServerCodecConfigurer serverCodecConfigurer0 = mock(ServerCodecConfigurer.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      GatewayConfiguration gatewayConfiguration0 = new GatewayConfiguration(objectProvider0, serverCodecConfigurer0);
      
      //Call method: sentinelGatewayFilter
      SentinelGatewayFilter sentinelGatewayFilter0 = (SentinelGatewayFilter)gatewayConfiguration0.sentinelGatewayFilter();
      
      //Test Result Assert
      assertEquals("", sentinelGatewayFilter0.shortcutFieldPrefix());
  }
}