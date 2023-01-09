/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.io.sofastack.cloud.mq.kafka.consumer;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import io.sofastack.cloud.common.model.UserDetails;
import io.sofastack.cloud.mq.kafka.consumer.KafkaReceiver;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class KafkaReceiver_SSTest extends KafkaReceiver_SSTest_scaffolding {
// allCoveredLines:[22, 35, 37, 38, 39, 40, 41, 42, 49, 52, 53, 54, 55]

  @Test(timeout = 4000)
  public void test_listen_0()  throws Throwable  {
      //caseID:dcd10784297191838094a7134854df37
      //CoveredLines: [22, 35, 37, 38, 54, 55]
      //Input_0_ConsumerRecord<?, ?>: {}
      
      KafkaReceiver kafkaReceiver0 = new KafkaReceiver();
      //mock consumerRecord0
      ConsumerRecord<Integer, UserDetails> consumerRecord0 = (ConsumerRecord<Integer, UserDetails>) mock(ConsumerRecord.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: listen
      kafkaReceiver0.listen(consumerRecord0);
  }

  @Test(timeout = 4000)
  public void test_listen_1()  throws Throwable  {
      //caseID:a6ef03befbfcb3ea8679835205de8da5
      //CoveredLines: [22, 35, 37, 38, 39, 40, 49, 54, 55]
      //Input_0_ConsumerRecord<?, ?>: {topic=\"0\", value=kafkaReceiver0 kafkaReceiver0}
      
      KafkaReceiver kafkaReceiver0 = new KafkaReceiver();
      //mock consumerRecord0
      ConsumerRecord<Object, KafkaReceiver> consumerRecord0 = (ConsumerRecord<Object, KafkaReceiver>) mock(ConsumerRecord.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("0").when(consumerRecord0).topic();
      doReturn(kafkaReceiver0, kafkaReceiver0).when(consumerRecord0).value();
      
      //Call method: listen
      kafkaReceiver0.listen(consumerRecord0);
  }

  @Test(timeout = 4000)
  public void test_listen_2()  throws Throwable  {
      //caseID:38166eda0b5b04befce9a1194f9a47e0
      //CoveredLines: [22, 35, 37, 38, 39, 40, 41, 42, 52, 53, 55]
      //Input_0_ConsumerRecord<?, ?>: {topic=\"Success to consumer kafka message. cmd = {}\", value=\"\" \"true\"}
      
      KafkaReceiver kafkaReceiver0 = new KafkaReceiver();
      //mock consumerRecord0
      ConsumerRecord<Object, String> consumerRecord0 = (ConsumerRecord<Object, String>) mock(ConsumerRecord.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("Success to consumer kafka message. cmd = {}").when(consumerRecord0).topic();
      doReturn("", "true").when(consumerRecord0).value();
      
      //Call method: listen
      kafkaReceiver0.listen(consumerRecord0);
  }
}
