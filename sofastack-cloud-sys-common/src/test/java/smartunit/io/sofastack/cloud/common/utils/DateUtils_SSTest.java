/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.io.sofastack.cloud.common.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import io.sofastack.cloud.common.utils.DateUtils;
import java.util.Date;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class)
@SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true)
public class DateUtils_SSTest extends DateUtils_SSTest_scaffolding {
    // allCoveredLines:[10, 17, 18, 19, 20, 21, 22, 31, 32, 33, 34, 35, 36, 37]

    @Test(timeout = 4000)
    public void test_getLastDay_0() throws Throwable {
        //caseID:52569bfa97a94627c0c336fe1fe1a8dd
        //CoveredLines: [10, 17, 18, 19, 20, 21, 22]
        //Assert: assertEquals("Fri Feb 14 20:21:21 GMT 2014", method_result.toString());

        DateUtils dateUtils0 = new DateUtils();

        //Call method: getLastDay
        Date date0 = DateUtils.getLastDay();

        //Test Result Assert
        assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
    }

    @Test(timeout = 4000)
    public void test_getPreDate_1() throws Throwable {
        //caseID:0595151350a61fd7c65ea9eb0838bdd3
        //CoveredLines: [31, 32, 33, 34, 35, 36, 37]
        //Assert: assertEquals("Thu Feb 13 00:00:00 GMT 2014", method_result.toString());

        //Call method: getPreDate
        Date date0 = DateUtils.getPreDate();

        //Test Result Assert
        assertEquals("Thu Feb 13 00:00:00 GMT 2014", date0.toString());
    }
}
