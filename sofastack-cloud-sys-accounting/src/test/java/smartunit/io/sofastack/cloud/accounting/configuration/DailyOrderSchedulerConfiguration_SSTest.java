/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.io.sofastack.cloud.accounting.configuration;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import io.sofastack.cloud.accounting.configuration.DailyOrderSchedulerConfiguration;
import org.junit.runner.RunWith;
import org.quartz.impl.triggers.CronTriggerImpl;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DailyOrderSchedulerConfiguration_SSTest extends DailyOrderSchedulerConfiguration_SSTest_scaffolding {
// allCoveredLines:[19, 23, 24, 30, 31, 32]

  @Test(timeout = 4000)
  public void test_sampleJobTrigger_0()  throws Throwable  {
      //caseID:51939248122dfda4fd35e720b1e5027f
      //CoveredLines: [19, 23, 24, 30, 31, 32]
      //Assert: assertFalse(method_result.hasAdditionalProperties());
      
      DailyOrderSchedulerConfiguration dailyOrderSchedulerConfiguration0 = new DailyOrderSchedulerConfiguration();
      
      //Call method: sampleJobTrigger
      CronTriggerImpl cronTriggerImpl0 = (CronTriggerImpl)dailyOrderSchedulerConfiguration0.sampleJobTrigger();
      
      //Test Result Assert
      assertFalse(cronTriggerImpl0.hasAdditionalProperties());
  }
}
