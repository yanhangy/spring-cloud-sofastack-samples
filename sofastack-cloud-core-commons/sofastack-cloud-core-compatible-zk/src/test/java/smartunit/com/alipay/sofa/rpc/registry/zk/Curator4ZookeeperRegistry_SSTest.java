/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.alipay.sofa.rpc.registry.zk;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import static org.smartunit.runtime.SmartAssertions.*;
import com.alipay.sofa.rpc.base.Destroyable;
import com.alipay.sofa.rpc.client.ProviderGroup;
import com.alipay.sofa.rpc.config.AbstractInterfaceConfig;
import com.alipay.sofa.rpc.config.ConsumerConfig;
import com.alipay.sofa.rpc.config.ProviderConfig;
import com.alipay.sofa.rpc.config.RegistryConfig;
import com.alipay.sofa.rpc.listener.ConfigListener;
import com.alipay.sofa.rpc.registry.zk.Curator4ZookeeperRegistry;
import com.alipay.sofa.rpc.registry.zk.ZookeeperOverrideObserver;
import com.alipay.sofa.rpc.registry.zk.ZookeeperRegistry;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.api.ACLBackgroundPathAndBytesable;
import org.apache.curator.framework.api.CreateBuilder;
import org.apache.curator.framework.api.ProtectACLCreateModeStatPathAndBytesable;
import org.apache.curator.framework.imps.CreateBuilderImpl;
import org.apache.curator.framework.imps.CuratorFrameworkState;
import org.apache.curator.framework.recipes.cache.PathChildrenCache;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Curator4ZookeeperRegistry_SSTest extends Curator4ZookeeperRegistry_SSTest_scaffolding {
// allCoveredLines:[181, 182, 184, 185, 186, 188, 190, 197, 198, 200, 201, 202, 203, 204, 205, 207, 209, 210, 211, 212, 213, 215, 224, 230, 231, 232, 234, 235, 242, 243, 244, 246, 250, 253, 254, 259, 260, 261, 264, 265, 266, 270, 271, 272, 273, 295, 296, 297, 298, 300, 324, 330, 331, 333, 334, 336, 338, 339, 340, 341, 343, 344, 345, 348, 349, 350, 351, 353, 354, 355, 356, 357, 364, 365, 367, 368, 369, 376, 377, 387, 388, 390, 391, 393, 415, 416, 429, 430, 432, 433, 434, 461, 462, 469, 470, 472, 473, 475, 478, 500, 515, 520, 521, 522, 523, 527, 528, 530, 531, 533, 611, 612, 614, 615, 616, 621, 622, 629, 630, 634, 639, 655, 684, 689, 690, 691, 692, 695, 699, 700, 702, 712, 713, 714, 723, 730]

  @Test(timeout = 4000)
  public void test_batchUnRegister_00()  throws Throwable  {
      //caseID:b2e16d12e57280283cfe9a56fda2d21c
      //CoveredLines: [469, 470, 478, 500, 515, 520, 521, 522, 523]
      //Input_0_List<ProviderConfig>: linkedList0
      
      //mock curator4ZookeeperRegistry0
      Curator4ZookeeperRegistry curator4ZookeeperRegistry0 = mock(Curator4ZookeeperRegistry.class, CALLS_REAL_METHODS);
      //mock registryConfig0
      RegistryConfig registryConfig0 = mock(RegistryConfig.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(true).when(registryConfig0).isRegister();
      
      PrivateAccess.setVariable((Class<?>) Curator4ZookeeperRegistry.class, curator4ZookeeperRegistry0, "registryConfig", (Object) registryConfig0);
      LinkedList<ProviderConfig> linkedList0 = new LinkedList<ProviderConfig>();
      //mock providerConfig0
      ProviderConfig providerConfig0 = mock(ProviderConfig.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("658").when(providerConfig0).getAppName();
      
      linkedList0.add(providerConfig0);
      
      //Call method: batchUnRegister
      curator4ZookeeperRegistry0.batchUnRegister(linkedList0);
      
      //Test Result Assert
      assertTrue(linkedList0.contains(providerConfig0));
  }

  @Test(timeout = 4000)
  public void test_batchUnRegister_01()  throws Throwable  {
      //caseID:2ae2ce8df33033c5fae65ac21a205e1d
      //CoveredLines: [469, 470, 472, 473, 475, 520, 521, 522, 523]
      //Input_0_List<ProviderConfig>: vector0
      
      //mock curator4ZookeeperRegistry0
      Curator4ZookeeperRegistry curator4ZookeeperRegistry0 = mock(Curator4ZookeeperRegistry.class, CALLS_REAL_METHODS);
      //mock registryConfig0
      RegistryConfig registryConfig0 = mock(RegistryConfig.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) Curator4ZookeeperRegistry.class, curator4ZookeeperRegistry0, "registryConfig", (Object) registryConfig0);
      Vector<ProviderConfig> vector0 = new Vector<ProviderConfig>();
      //mock providerConfig0
      ProviderConfig providerConfig0 = mock(ProviderConfig.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      vector0.add(providerConfig0);
      
      //Call method: batchUnRegister
      // Undeclared exception!
      try { 
        curator4ZookeeperRegistry0.batchUnRegister(vector0);
      } catch(Throwable e) {
         verifyException("com.alipay.sofa.rpc.registry.zk.Curator4ZookeeperRegistry", e);
         assertEquals("java.lang.NullPointerException", e.getClass().getName());
      }
  }

  @Test(timeout = 4000)
  public void test_batchUnSubscribe_02()  throws Throwable  {
      //caseID:75389d77e974938b7ddbce17f944b4ce
      //CoveredLines: [639, 655, 684, 689, 690, 691, 692]
      //Input_0_List<ConsumerConfig>: vector0
      
      //mock curator4ZookeeperRegistry0
      Curator4ZookeeperRegistry curator4ZookeeperRegistry0 = mock(Curator4ZookeeperRegistry.class, CALLS_REAL_METHODS);
      Vector<ConsumerConfig> vector0 = new Vector<ConsumerConfig>();
      //mock consumerConfig0
      ConsumerConfig consumerConfig0 = mock(ConsumerConfig.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      vector0.add(consumerConfig0);
      
      //Call method: batchUnSubscribe
      curator4ZookeeperRegistry0.batchUnSubscribe(vector0);
      
      //Test Result Assert
      assertEquals(1, vector0.size());
  }

  @Test(timeout = 4000)
  public void test_destroy_03()  throws Throwable  {
      //caseID:e87b086e407543a5db0512d353ffad49
      //CoveredLines: [259, 260, 261, 264, 265, 266, 723, 730]
      
      //mock curator4ZookeeperRegistry0
      Curator4ZookeeperRegistry curator4ZookeeperRegistry0 = mock(Curator4ZookeeperRegistry.class, CALLS_REAL_METHODS);
      //mock map0
      Map<ConsumerConfig, String> map0 = (Map<ConsumerConfig, String>) mock(Map.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock map1
      Map<ProviderConfig, List<String>> map1 = (Map<ProviderConfig, List<String>>) mock(Map.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) Curator4ZookeeperRegistry.class, curator4ZookeeperRegistry0, "providerUrls", (Object) map1);
      
      PrivateAccess.setVariable((Class<?>) Curator4ZookeeperRegistry.class, curator4ZookeeperRegistry0, "consumerUrls", (Object) map0);
      
      //Call method: destroy
      // Undeclared exception!
      try { 
        curator4ZookeeperRegistry0.destroy();
      } catch(Throwable e) {
         verifyException("com.alipay.sofa.rpc.registry.zk.Curator4ZookeeperRegistry", e);
         assertEquals("java.lang.NullPointerException", e.getClass().getName());
      }
  }

  @Test(timeout = 4000)
  public void test_destroy_04()  throws Throwable  {
      //caseID:f7491ea78edf08b940cc886247218c5a
      //CoveredLines: [259, 260, 261, 264, 265, 266, 270, 271, 272, 273, 723, 730]
      //Input_0_Destroyable.DestroyHook: {}
      
      //mock curator4ZookeeperRegistry0
      Curator4ZookeeperRegistry curator4ZookeeperRegistry0 = mock(Curator4ZookeeperRegistry.class, CALLS_REAL_METHODS);
      //mock map0
      Map<ConsumerConfig, String> map0 = (Map<ConsumerConfig, String>) mock(Map.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock map1
      Map<ProviderConfig, List<String>> map1 = (Map<ProviderConfig, List<String>>) mock(Map.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock curatorFramework0
      CuratorFramework curatorFramework0 = mock(CuratorFramework.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) Curator4ZookeeperRegistry.class, curator4ZookeeperRegistry0, "zkClient", (Object) curatorFramework0);
      
      PrivateAccess.setVariable((Class<?>) Curator4ZookeeperRegistry.class, curator4ZookeeperRegistry0, "providerUrls", (Object) map1);
      
      PrivateAccess.setVariable((Class<?>) Curator4ZookeeperRegistry.class, curator4ZookeeperRegistry0, "consumerUrls", (Object) map0);
      //mock destroyable_DestroyHook0
      Destroyable.DestroyHook destroyable_DestroyHook0 = mock(Destroyable.DestroyHook.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: destroy
      // Undeclared exception!
      try { 
        curator4ZookeeperRegistry0.destroy(destroyable_DestroyHook0);
      } catch(Throwable e) {
         verifyException("com.alipay.sofa.rpc.registry.zk.Curator4ZookeeperRegistry", e);
         assertEquals("java.lang.NullPointerException", e.getClass().getName());
      }
  }

  @Test(timeout = 4000)
  public void test_getAndCheckZkClient_05()  throws Throwable  {
      //caseID:9006f29dd04c40947ec84f1c3868948d
      //CoveredLines: [699, 700]
      
      //mock curator4ZookeeperRegistry0
      Curator4ZookeeperRegistry curator4ZookeeperRegistry0 = mock(Curator4ZookeeperRegistry.class, CALLS_REAL_METHODS);
      
      //Call method: getAndCheckZkClient
      try { 
        PrivateAccess.callMethod((Class<Curator4ZookeeperRegistry>) Curator4ZookeeperRegistry.class, curator4ZookeeperRegistry0, "getAndCheckZkClient");
      } catch(Throwable e) {
         verifyException("com.alipay.sofa.rpc.registry.zk.Curator4ZookeeperRegistry", e);
         assertEquals("com.alipay.sofa.rpc.core.exception.SofaRpcRuntimeException", e.getClass().getName());
         assertEquals("Zookeeper client is not available", e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test_getZkClient_06()  throws Throwable  {
      //caseID:1700be227b0351b74df32259c1aac637
      //CoveredLines: [695]
      //Assert: assertNull(method_result);
      
      //mock curator4ZookeeperRegistry0
      Curator4ZookeeperRegistry curator4ZookeeperRegistry0 = mock(Curator4ZookeeperRegistry.class, CALLS_REAL_METHODS);
      
      //Call method: getZkClient
      Object object0 = PrivateAccess.callMethod((Class<Curator4ZookeeperRegistry>) Curator4ZookeeperRegistry.class, curator4ZookeeperRegistry0, "getZkClient");
      
      //Test Result Assert
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test_init_07()  throws Throwable  {
      //caseID:eeab21ec6cce069e175d72b65b0fa184
      //CoveredLines: [181, 182]
      
      //mock curator4ZookeeperRegistry0
      Curator4ZookeeperRegistry curator4ZookeeperRegistry0 = mock(Curator4ZookeeperRegistry.class, CALLS_REAL_METHODS);
      //mock curatorFramework0
      CuratorFramework curatorFramework0 = mock(CuratorFramework.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) Curator4ZookeeperRegistry.class, curator4ZookeeperRegistry0, "zkClient", (Object) curatorFramework0);
      
      //Call method: init
      curator4ZookeeperRegistry0.init();
  }

  @Test(timeout = 4000)
  public void test_init_08()  throws Throwable  {
      //caseID:8b6329a4c7f37bfe4826108e273afd32
      //CoveredLines: [181, 184, 185, 186]
      
      //mock curator4ZookeeperRegistry0
      Curator4ZookeeperRegistry curator4ZookeeperRegistry0 = mock(Curator4ZookeeperRegistry.class, CALLS_REAL_METHODS);
      //mock registryConfig0
      RegistryConfig registryConfig0 = mock(RegistryConfig.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) Curator4ZookeeperRegistry.class, curator4ZookeeperRegistry0, "registryConfig", (Object) registryConfig0);
      
      //Call method: init
      // Undeclared exception!
      try { 
        curator4ZookeeperRegistry0.init();
      } catch(Throwable e) {
         verifyException("com.alipay.sofa.rpc.registry.zk.Curator4ZookeeperRegistry", e);
         assertEquals("com.alipay.sofa.rpc.core.exception.SofaRpcRuntimeException", e.getClass().getName());
         assertEquals("Address of zookeeper registry is empty.", e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test_init_09()  throws Throwable  {
      //caseID:714eb47a23dac59204ddf6d096be0962
      //CoveredLines: [181, 184, 185, 188, 190, 197, 198, 200, 201, 202, 203, 204, 205, 207, 209, 210, 211, 212, 213, 215, 224]
      
      //mock curator4ZookeeperRegistry0
      Curator4ZookeeperRegistry curator4ZookeeperRegistry0 = mock(Curator4ZookeeperRegistry.class, CALLS_REAL_METHODS);
      //mock registryConfig0
      RegistryConfig registryConfig0 = mock(RegistryConfig.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("RECONNECTED").when(registryConfig0).getAddress();
      
      PrivateAccess.setVariable((Class<?>) Curator4ZookeeperRegistry.class, curator4ZookeeperRegistry0, "registryConfig", (Object) registryConfig0);
      
      //Call method: init
      // Undeclared exception!
      try { 
        curator4ZookeeperRegistry0.init();
      } catch(Throwable e) {
         verifyException("com.alipay.sofa.rpc.registry.zk.Curator4ZookeeperRegistry", e);
         assertEquals("java.lang.NullPointerException", e.getClass().getName());
      }
  }

  @Test(timeout = 4000)
  public void test_recoverRegistryData_10()  throws Throwable  {
      //caseID:8e7063960de69145c9662b1cccb553ec
      //CoveredLines: [230, 231, 232, 234, 235, 324, 330, 331, 336, 338, 339, 340, 341, 343, 344, 345, 348, 349, 350, 351, 353, 354, 355, 356, 357, 364, 365, 367, 368, 369, 376, 377, 611, 612, 614, 615, 616, 621, 622, 629, 630, 699, 700, 702]
      
      //mock curator4ZookeeperRegistry0
      Curator4ZookeeperRegistry curator4ZookeeperRegistry0 = mock(Curator4ZookeeperRegistry.class, CALLS_REAL_METHODS);
      HashSet<ConsumerConfig> hashSet0 = new HashSet<ConsumerConfig>();
      //mock consumerConfig0
      ConsumerConfig consumerConfig0 = mock(ConsumerConfig.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("5qE0JZ").when(consumerConfig0).getInterfaceId();
      doReturn(true).when(consumerConfig0).isRegister();
      
      hashSet0.add(consumerConfig0);
      //mock map0
      Map<ConsumerConfig, String> map0 = (Map<ConsumerConfig, String>) mock(Map.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(true).when(map0).containsKey(any());
      doReturn("reconnect to zookeeper,recover provider and consumer data").when(map0).get(any());
      doReturn(hashSet0).when(map0).keySet();
      LinkedHashSet<ProviderConfig> linkedHashSet0 = new LinkedHashSet<ProviderConfig>();
      //mock providerConfig0
      ProviderConfig providerConfig0 = mock(ProviderConfig.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("Close PathChildrenCache error!").when(providerConfig0).getAppName();
      doReturn("consumer has exists in zookeeper, consumer=").when(providerConfig0).getInterfaceId();
      doReturn(true).when(providerConfig0).isDynamic();
      
      linkedHashSet0.add(providerConfig0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      
      linkedList0.add("0");
      //mock map1
      Map<ProviderConfig, List<String>> map1 = (Map<ProviderConfig, List<String>>) mock(Map.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(true).when(map1).containsKey(any());
      doReturn(linkedList0).when(map1).get(any());
      doReturn(linkedHashSet0).when(map1).keySet();
      CuratorFrameworkState curatorFrameworkState0 = CuratorFrameworkState.STARTED;
      //mock aCLBackgroundPathAndBytesable0
      ACLBackgroundPathAndBytesable<String> aCLBackgroundPathAndBytesable0 = (ACLBackgroundPathAndBytesable<String>) mock(ACLBackgroundPathAndBytesable.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("Failed to unsubscribe consumer config from zookeeperRegistry!").when(aCLBackgroundPathAndBytesable0).forPath(anyString() , any(byte[].class));
      //mock protectACLCreateModeStatPathAndBytesable0
      ProtectACLCreateModeStatPathAndBytesable<String> protectACLCreateModeStatPathAndBytesable0 = (ProtectACLCreateModeStatPathAndBytesable<String>) mock(ProtectACLCreateModeStatPathAndBytesable.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(aCLBackgroundPathAndBytesable0).when(protectACLCreateModeStatPathAndBytesable0).withMode(any(org.apache.zookeeper.CreateMode.class));
      //mock createBuilder0
      CreateBuilder createBuilder0 = mock(CreateBuilder.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(protectACLCreateModeStatPathAndBytesable0).when(createBuilder0).creatingParentContainersIfNeeded();
      CuratorFrameworkState curatorFrameworkState1 = CuratorFrameworkState.STOPPED;
      //mock curatorFramework0
      CuratorFramework curatorFramework0 = mock(CuratorFramework.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("(Qg<i").when(curatorFramework0).toString();
      doReturn(createBuilder0).when(curatorFramework0).create();
      doReturn(curatorFrameworkState0, curatorFrameworkState1).when(curatorFramework0).getState();
      
      PrivateAccess.setVariable((Class<?>) Curator4ZookeeperRegistry.class, curator4ZookeeperRegistry0, "zkClient", (Object) curatorFramework0);
      
      PrivateAccess.setVariable((Class<?>) Curator4ZookeeperRegistry.class, curator4ZookeeperRegistry0, "providerUrls", (Object) map1);
      
      PrivateAccess.setVariable((Class<?>) Curator4ZookeeperRegistry.class, curator4ZookeeperRegistry0, "consumerUrls", (Object) map0);
      
      //Call method: recoverRegistryData
      try { 
        PrivateAccess.callMethod((Class<Curator4ZookeeperRegistry>) Curator4ZookeeperRegistry.class, curator4ZookeeperRegistry0, "recoverRegistryData");
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test_register_11()  throws Throwable  {
      //caseID:eadfbcaa3d0d0f922f491ad922f12862
      //CoveredLines: [295, 296, 297, 298, 300]
      //Input_0_ProviderConfig: {}
      
      //mock curator4ZookeeperRegistry0
      Curator4ZookeeperRegistry curator4ZookeeperRegistry0 = mock(Curator4ZookeeperRegistry.class, CALLS_REAL_METHODS);
      //mock registryConfig0
      RegistryConfig registryConfig0 = mock(RegistryConfig.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) Curator4ZookeeperRegistry.class, curator4ZookeeperRegistry0, "registryConfig", (Object) registryConfig0);
      //mock providerConfig0
      ProviderConfig<Object> providerConfig0 = (ProviderConfig<Object>) mock(ProviderConfig.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: register
      // Undeclared exception!
      try { 
        curator4ZookeeperRegistry0.register(providerConfig0);
      } catch(Throwable e) {
         verifyException("com.alipay.sofa.rpc.registry.zk.Curator4ZookeeperRegistry", e);
         assertEquals("java.lang.NullPointerException", e.getClass().getName());
      }
  }

  @Test(timeout = 4000)
  public void test_registerProviderUrls_12()  throws Throwable  {
      //caseID:4a393bb2376b170fcef26f8ee21aaf31
      //CoveredLines: [324, 330, 333, 334, 336, 376, 377]
      //Input_0_com.alipay.sofa.rpc.config.ProviderConfig: {}
      
      //mock curator4ZookeeperRegistry0
      Curator4ZookeeperRegistry curator4ZookeeperRegistry0 = mock(Curator4ZookeeperRegistry.class, CALLS_REAL_METHODS);
      //mock map0
      Map<ProviderConfig, List<String>> map0 = (Map<ProviderConfig, List<String>>) mock(Map.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) Curator4ZookeeperRegistry.class, curator4ZookeeperRegistry0, "providerUrls", (Object) map0);
      //mock providerConfig0
      ProviderConfig<ZookeeperRegistry> providerConfig0 = (ProviderConfig<ZookeeperRegistry>) mock(ProviderConfig.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: registerProviderUrls
      PrivateAccess.callMethod((Class<Curator4ZookeeperRegistry>) Curator4ZookeeperRegistry.class, curator4ZookeeperRegistry0, "registerProviderUrls", (Object) providerConfig0, (Class<?>) ProviderConfig.class);
  }

  @Test(timeout = 4000)
  public void test_start_13()  throws Throwable  {
      //caseID:50b15ac2daed0f334b1b67ea4de92700
      //CoveredLines: [242, 243, 244]
      
      //mock curator4ZookeeperRegistry0
      Curator4ZookeeperRegistry curator4ZookeeperRegistry0 = mock(Curator4ZookeeperRegistry.class, CALLS_REAL_METHODS);
      
      //Call method: start
      // Undeclared exception!
      try { 
        curator4ZookeeperRegistry0.start();
      } catch(Throwable e) {
         verifyException("com.alipay.sofa.rpc.registry.zk.Curator4ZookeeperRegistry", e);
         assertEquals("java.lang.NullPointerException", e.getClass().getName());
      }
  }

  @Test(timeout = 4000)
  public void test_start_14()  throws Throwable  {
      //caseID:d151984706b09a8f6630718c84e68779
      //CoveredLines: [242, 246, 250, 253, 254]
      //Assert: assertFalse(method_result);
      
      //mock curator4ZookeeperRegistry0
      Curator4ZookeeperRegistry curator4ZookeeperRegistry0 = mock(Curator4ZookeeperRegistry.class, CALLS_REAL_METHODS);
      //mock curatorFramework0
      CuratorFramework curatorFramework0 = mock(CuratorFramework.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) Curator4ZookeeperRegistry.class, curator4ZookeeperRegistry0, "zkClient", (Object) curatorFramework0);
      
      //Call method: start
      boolean boolean0 = curator4ZookeeperRegistry0.start();
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_subscribe_15()  throws Throwable  {
      //caseID:1c325f9c19366903399684e46e46fa31
      //CoveredLines: [527, 528, 530, 531, 533]
      //Input_0_ConsumerConfig: {}
      
      //mock curator4ZookeeperRegistry0
      Curator4ZookeeperRegistry curator4ZookeeperRegistry0 = mock(Curator4ZookeeperRegistry.class, CALLS_REAL_METHODS);
      //mock registryConfig0
      RegistryConfig registryConfig0 = mock(RegistryConfig.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) Curator4ZookeeperRegistry.class, curator4ZookeeperRegistry0, "registryConfig", (Object) registryConfig0);
      //mock consumerConfig0
      ConsumerConfig<ConsumerConfig<ZookeeperRegistry>> consumerConfig0 = (ConsumerConfig<ConsumerConfig<ZookeeperRegistry>>) mock(ConsumerConfig.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: subscribe
      // Undeclared exception!
      try { 
        curator4ZookeeperRegistry0.subscribe(consumerConfig0);
      } catch(Throwable e) {
         verifyException("com.alipay.sofa.rpc.registry.zk.Curator4ZookeeperRegistry", e);
         assertEquals("java.lang.NullPointerException", e.getClass().getName());
      }
  }

  @Test(timeout = 4000)
  public void test_subscribeConfig_16()  throws Throwable  {
      //caseID:187d505b76b4f0064c25746660b7cbcc
      //CoveredLines: [387, 388, 390, 391, 393, 415, 416]
      //Input_0_com.alipay.sofa.rpc.config.AbstractInterfaceConfig: {}
      //Input_1_com.alipay.sofa.rpc.listener.ConfigListener: {}
      
      //mock curator4ZookeeperRegistry0
      Curator4ZookeeperRegistry curator4ZookeeperRegistry0 = mock(Curator4ZookeeperRegistry.class, CALLS_REAL_METHODS);
      //mock abstractInterfaceConfig0
      AbstractInterfaceConfig<Integer, ConsumerConfig<ConsumerConfig<ProviderGroup>>> abstractInterfaceConfig0 = (AbstractInterfaceConfig<Integer, ConsumerConfig<ConsumerConfig<ProviderGroup>>>) mock(AbstractInterfaceConfig.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock configListener0
      ConfigListener configListener0 = mock(ConfigListener.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: subscribeConfig
      try { 
        PrivateAccess.callMethod((Class<Curator4ZookeeperRegistry>) Curator4ZookeeperRegistry.class, curator4ZookeeperRegistry0, "subscribeConfig", (Object) abstractInterfaceConfig0, (Class<?>) AbstractInterfaceConfig.class, (Object) configListener0, (Class<?>) ConfigListener.class);
      } catch(Throwable e) {
         verifyException("com.alipay.sofa.rpc.registry.zk.Curator4ZookeeperRegistry", e);
         assertEquals("com.alipay.sofa.rpc.core.exception.SofaRpcRuntimeException", e.getClass().getName());
         assertEquals("Failed to subscribe provider config from zookeeperRegistry!", e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test_subscribeConsumerUrls_17()  throws Throwable  {
      //caseID:6eba5219fa38a1d143afc3aa4b5f5e90
      //CoveredLines: [611, 612, 634]
      //Input_0_com.alipay.sofa.rpc.config.ConsumerConfig: {}
      
      //mock curator4ZookeeperRegistry0
      Curator4ZookeeperRegistry curator4ZookeeperRegistry0 = mock(Curator4ZookeeperRegistry.class, CALLS_REAL_METHODS);
      //mock consumerConfig0
      ConsumerConfig<Object> consumerConfig0 = (ConsumerConfig<Object>) mock(ConsumerConfig.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: subscribeConsumerUrls
      PrivateAccess.callMethod((Class<Curator4ZookeeperRegistry>) Curator4ZookeeperRegistry.class, curator4ZookeeperRegistry0, "subscribeConsumerUrls", (Object) consumerConfig0, (Class<?>) ConsumerConfig.class);
  }

  @Test(timeout = 4000)
  public void test_subscribeOverride_18()  throws Throwable  {
      //caseID:42487ac0d6c5afd5fb6367818575fc0e
      //CoveredLines: [429, 432, 433, 434, 461, 462, 712, 713, 714]
      //Input_0_com.alipay.sofa.rpc.config.ConsumerConfig: {}
      //Input_1_com.alipay.sofa.rpc.listener.ConfigListener: {}
      
      //mock curator4ZookeeperRegistry0
      Curator4ZookeeperRegistry curator4ZookeeperRegistry0 = mock(Curator4ZookeeperRegistry.class, CALLS_REAL_METHODS);
      //mock zookeeperOverrideObserver0
      ZookeeperOverrideObserver zookeeperOverrideObserver0 = mock(ZookeeperOverrideObserver.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) Curator4ZookeeperRegistry.class, curator4ZookeeperRegistry0, "overrideObserver", (Object) zookeeperOverrideObserver0);
      //mock consumerConfig0
      ConsumerConfig<CreateBuilderImpl> consumerConfig0 = (ConsumerConfig<CreateBuilderImpl>) mock(ConsumerConfig.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock configListener0
      ConfigListener configListener0 = mock(ConfigListener.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: subscribeOverride
      try { 
        PrivateAccess.callMethod((Class<Curator4ZookeeperRegistry>) Curator4ZookeeperRegistry.class, curator4ZookeeperRegistry0, "subscribeOverride", (Object) consumerConfig0, (Class<?>) ConsumerConfig.class, (Object) configListener0, (Class<?>) ConfigListener.class);
      } catch(Throwable e) {
         verifyException("com.alipay.sofa.rpc.registry.zk.Curator4ZookeeperRegistry", e);
         assertEquals("com.alipay.sofa.rpc.core.exception.SofaRpcRuntimeException", e.getClass().getName());
         assertEquals("Failed to subscribe provider config from zookeeperRegistry!", e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test_subscribeOverride_19()  throws Throwable  {
      //caseID:821ea748cf649c07fe060982c54084ce
      //CoveredLines: [429, 430, 432, 433, 434, 461, 462, 712, 713, 714]
      //Input_0_com.alipay.sofa.rpc.config.ConsumerConfig: {}
      //Input_1_com.alipay.sofa.rpc.listener.ConfigListener: {}
      
      //mock curator4ZookeeperRegistry0
      Curator4ZookeeperRegistry curator4ZookeeperRegistry0 = mock(Curator4ZookeeperRegistry.class, CALLS_REAL_METHODS);
      //mock consumerConfig0
      ConsumerConfig<PathChildrenCache> consumerConfig0 = (ConsumerConfig<PathChildrenCache>) mock(ConsumerConfig.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock configListener0
      ConfigListener configListener0 = mock(ConfigListener.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: subscribeOverride
      try { 
        PrivateAccess.callMethod((Class<Curator4ZookeeperRegistry>) Curator4ZookeeperRegistry.class, curator4ZookeeperRegistry0, "subscribeOverride", (Object) consumerConfig0, (Class<?>) ConsumerConfig.class, (Object) configListener0, (Class<?>) ConfigListener.class);
      } catch(Throwable e) {
         verifyException("com.alipay.sofa.rpc.registry.zk.Curator4ZookeeperRegistry", e);
         assertEquals("com.alipay.sofa.rpc.core.exception.SofaRpcRuntimeException", e.getClass().getName());
         assertEquals("Failed to subscribe provider config from zookeeperRegistry!", e.getMessage());
      }
  }
}