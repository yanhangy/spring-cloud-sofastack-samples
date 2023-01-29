/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.io.sofastack.cloud.gateway.filter;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import io.sofastack.cloud.gateway.filter.AuthGatewayFilter;
import java.net.URI;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;
import org.smartunit.runtime.mock.java.net.MockURI;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.util.MultiValueMap;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@RunWith(SmartRunner.class)
@SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true)
public class AuthGatewayFilter_SSTest extends AuthGatewayFilter_SSTest_scaffolding {
    // allCoveredLines:[26, 38, 39, 40, 42, 43, 45, 46, 47, 48, 50, 54, 55, 56, 58, 63]

    @Test(timeout = 4000)
    public void test_filter_0() throws Throwable {
        //caseID:19e9b062433018829dcbdc3d32f62b4f
        //CoveredLines: [26, 38, 39, 40, 42, 43, 45, 46, 58]
        //Input_0_ServerWebExchange: {getRequest=serverHttpRequest0 serverHttpRequest2 serverHttpRequest1}
        //Input_1_GatewayFilterChain: {filter=mono0}
        //Assert: assertSame(method_result, mono0);

        AuthGatewayFilter authGatewayFilter0 = new AuthGatewayFilter();
        //mock multiValueMap0
        MultiValueMap<String, String> multiValueMap0 = (MultiValueMap<String, String>) mock(
            MultiValueMap.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer())
                .stubOnly());
        doReturn("1.0").when(multiValueMap0).getFirst(anyString());
        URI uRI0 = MockURI.aHttpURI;
        //mock serverHttpRequest0
        ServerHttpRequest serverHttpRequest0 = mock(ServerHttpRequest.class, withSettings()
            .defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn(multiValueMap0).when(serverHttpRequest0).getQueryParams();
        //mock serverHttpRequest1
        ServerHttpRequest serverHttpRequest1 = mock(ServerHttpRequest.class, withSettings()
            .defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn(uRI0).when(serverHttpRequest1).getURI();
        //mock serverHttpRequest2
        ServerHttpRequest serverHttpRequest2 = mock(ServerHttpRequest.class, withSettings()
            .defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn(uRI0).when(serverHttpRequest2).getURI();
        //mock serverWebExchange0
        ServerWebExchange serverWebExchange0 = mock(ServerWebExchange.class, withSettings()
            .defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn(serverHttpRequest0, serverHttpRequest2, serverHttpRequest1).when(
            serverWebExchange0).getRequest();
        //mock mono0
        Mono<Void> mono0 = (Mono<Void>) mock(Mono.class,
            withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn("1.0").when(mono0).toString();
        //mock gatewayFilterChain0
        GatewayFilterChain gatewayFilterChain0 = mock(GatewayFilterChain.class, withSettings()
            .defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn(mono0).when(gatewayFilterChain0).filter(
            any(org.springframework.web.server.ServerWebExchange.class));

        //Call method: filter
        Mono<Void> mono1 = authGatewayFilter0.filter(serverWebExchange0, gatewayFilterChain0);

        //Test Result Assert
        assertSame(mono1, mono0);
    }

    @Test(timeout = 4000)
    public void test_filter_1() throws Throwable {
        //caseID:d16ca151ae6af57e365d841dd39235fc
        //CoveredLines: [26, 38, 39, 40, 42, 43, 45, 46, 47, 48, 50, 54, 55, 56]
        //Input_0_ServerWebExchange: {getRequest=serverHttpRequest0 serverHttpRequest2 serverHttpRequest1, getResponse=serverHttpResponse0}
        //Input_1_GatewayFilterChain: {}
        //Assert: assertNull(method_result);

        AuthGatewayFilter authGatewayFilter0 = new AuthGatewayFilter();
        //mock multiValueMap0
        MultiValueMap<String, String> multiValueMap0 = (MultiValueMap<String, String>) mock(
            MultiValueMap.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer())
                .stubOnly());
        doReturn("").when(multiValueMap0).getFirst(anyString());
        URI uRI0 = MockURI.aHttpURI;
        //mock serverHttpRequest0
        ServerHttpRequest serverHttpRequest0 = mock(ServerHttpRequest.class, withSettings()
            .defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn(multiValueMap0).when(serverHttpRequest0).getQueryParams();
        //mock serverHttpRequest1
        ServerHttpRequest serverHttpRequest1 = mock(ServerHttpRequest.class, withSettings()
            .defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn(uRI0).when(serverHttpRequest1).getURI();
        //mock serverHttpRequest2
        ServerHttpRequest serverHttpRequest2 = mock(ServerHttpRequest.class, withSettings()
            .defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn(uRI0).when(serverHttpRequest2).getURI();
        //mock httpHeaders0
        HttpHeaders httpHeaders0 = mock(HttpHeaders.class,
            withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        //mock serverHttpResponse0
        ServerHttpResponse serverHttpResponse0 = mock(ServerHttpResponse.class, withSettings()
            .defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn(httpHeaders0).when(serverHttpResponse0).getHeaders();
        doReturn(true).when(serverHttpResponse0).setStatusCode(
            any(org.springframework.http.HttpStatus.class));
        //mock serverWebExchange0
        ServerWebExchange serverWebExchange0 = mock(ServerWebExchange.class, withSettings()
            .defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
        doReturn(serverHttpRequest0, serverHttpRequest2, serverHttpRequest1).when(
            serverWebExchange0).getRequest();
        doReturn(serverHttpResponse0).when(serverWebExchange0).getResponse();
        //mock gatewayFilterChain0
        GatewayFilterChain gatewayFilterChain0 = mock(GatewayFilterChain.class, withSettings()
            .defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

        //Call method: filter
        Mono<Void> mono0 = authGatewayFilter0.filter(serverWebExchange0, gatewayFilterChain0);

        //Test Result Assert
        assertNull(mono0);
    }

    @Test(timeout = 4000)
    public void test_getOrder_2() throws Throwable {
        //caseID:c67257167c2a20c20efd99d55eae6a68
        //CoveredLines: [26, 63]
        //Assert: assertEquals(0, method_result);

        AuthGatewayFilter authGatewayFilter0 = new AuthGatewayFilter();

        //Call method: getOrder
        int int0 = authGatewayFilter0.getOrder();

        //Test Result Assert
        assertEquals(0, int0);
    }
}
