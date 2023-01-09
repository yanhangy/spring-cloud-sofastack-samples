/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.io.sofastack.cloud.common.response;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import io.sofastack.cloud.common.response.Result;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class)
@SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true)
public class Result_SSTest extends Result_SSTest_scaffolding {
    // allCoveredLines:[7, 10, 14, 18, 19, 22, 26, 27, 30, 34, 35]

    @Test(timeout = 4000)
    public void test_getData_0() throws Throwable {
        //caseID:7a0afc7fe489ccb6fdeb42fde4b5552d
        //CoveredLines: [7, 10, 14]
        //Assert: assertFalse(result0.isSuccess());

        Result<Object> result0 = new Result<Object>();

        //Call method: getData
        result0.getData();

        //Test Result Assert
        assertFalse(result0.isSuccess());
    }

    @Test(timeout = 4000)
    public void test_getErrorMsg_1() throws Throwable {
        //caseID:844f0853313a00cf716b29db6fb77af7
        //CoveredLines: [7, 10, 30]
        //Assert: assertFalse(result0.isSuccess());

        Result<Object> result0 = new Result<Object>();

        //Call method: getErrorMsg
        result0.getErrorMsg();

        //Test Result Assert
        assertFalse(result0.isSuccess());
    }

    @Test(timeout = 4000)
    public void test_isSuccess_2() throws Throwable {
        //caseID:fa68cde05fb86c02035af73c02759302
        //CoveredLines: [7, 10, 22]
        //Assert: assertFalse(method_result);

        Result<Object> result0 = new Result<Object>();

        //Call method: isSuccess
        boolean boolean0 = result0.isSuccess();

        //Test Result Assert
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test_setData_3() throws Throwable {
        //caseID:a280c1119d6640de65891257a851c7e8
        //CoveredLines: [7, 10, 18, 19]
        //Input_0_String: Z+ys%a

        Result<String> result0 = new Result<String>();

        //Call method: setData
        result0.setData("Z+ys%a");

        //Test Result Assert
        assertFalse(result0.isSuccess());
    }

    @Test(timeout = 4000)
    public void test_setErrorMsg_4() throws Throwable {
        //caseID:68a691277445411a3a6e226aaba3d942
        //CoveredLines: [7, 10, 34, 35]
        //Input_0_String: 

        Result<String> result0 = new Result<String>();

        //Call method: setErrorMsg
        result0.setErrorMsg("");

        //Test Result Assert
        assertFalse(result0.isSuccess());
    }

    @Test(timeout = 4000)
    public void test_setSuccess_5() throws Throwable {
        //caseID:6ad31b29bedfb8befa1c0c0336cc7eba
        //CoveredLines: [7, 10, 26, 27]
        //Input_0_boolean: false

        Result<String> result0 = new Result<String>();

        //Call method: setSuccess
        result0.setSuccess(false);

        //Test Result Assert
        assertFalse(result0.isSuccess());
    }
}
