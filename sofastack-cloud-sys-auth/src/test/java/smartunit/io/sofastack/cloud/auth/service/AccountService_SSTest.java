/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.io.sofastack.cloud.auth.service;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import io.sofastack.cloud.auth.service.AccountService;
import io.sofastack.cloud.common.response.Result;
import io.sofastack.cloud.rest.facade.AccountingService;
import java.util.Map;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class)
@SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true)
public class AccountService_SSTest extends AccountService_SSTest_scaffolding {
    // allCoveredLines:[18, 30]

    @Test(timeout = 4000)
    public void test_createAccount_0() throws Throwable {
        //caseID:f6a133382def753e3913154c6a4a6e60
        //CoveredLines: [18, 30]
        //Input_0_Map<String, Object>: {}
        //Assert: assertNull(method_result);

        AccountService accountService0 = new AccountService();
        //mock accountingService0
        AccountingService accountingService0 = mock(AccountingService.class, withSettings()
            .defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

        PrivateAccess.setVariable((Class<?>) AccountService.class, accountService0,
            "accountingService", (Object) accountingService0);
        //mock map0
        Map<String, Object> map0 = (Map<String, Object>) mock(Map.class, withSettings()
            .defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

        //Call method: createAccount
        Result<Boolean> result0 = accountService0.createAccount(map0);

        //Test Result Assert
        assertNull(result0);
    }
}
