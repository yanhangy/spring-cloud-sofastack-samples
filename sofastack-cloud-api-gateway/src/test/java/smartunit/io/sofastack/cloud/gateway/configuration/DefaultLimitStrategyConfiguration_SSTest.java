/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.io.sofastack.cloud.gateway.configuration;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import io.sofastack.cloud.gateway.configuration.DefaultLimitStrategyConfiguration;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DefaultLimitStrategyConfiguration_SSTest extends DefaultLimitStrategyConfiguration_SSTest_scaffolding {
// allCoveredLines:[15, 23, 33]

  @Test(timeout = 4000)
  public void test_apiKeyResolver_0()  throws Throwable  {
      //caseID:4d8d08c040bf1fcdd4517aee34e1cb23
      //CoveredLines: [15, 33, 33]
      //Assert: assertNotNull(method_result);
      
      DefaultLimitStrategyConfiguration defaultLimitStrategyConfiguration0 = new DefaultLimitStrategyConfiguration();
      
      //Call method: apiKeyResolver
      KeyResolver keyResolver0 = defaultLimitStrategyConfiguration0.apiKeyResolver();
      
      //Test Result Assert
      assertNotNull(keyResolver0);
  }

  @Test(timeout = 4000)
  public void test_ipKeyResolver_1()  throws Throwable  {
      //caseID:d09e94b2d35f83c44b8440d16a8dad1e
      //CoveredLines: [15, 23, 23]
      //Assert: assertNotNull(method_result);
      
      DefaultLimitStrategyConfiguration defaultLimitStrategyConfiguration0 = new DefaultLimitStrategyConfiguration();
      
      //Call method: ipKeyResolver
      KeyResolver keyResolver0 = defaultLimitStrategyConfiguration0.ipKeyResolver();
      
      //Test Result Assert
      assertNotNull(keyResolver0);
  }
}