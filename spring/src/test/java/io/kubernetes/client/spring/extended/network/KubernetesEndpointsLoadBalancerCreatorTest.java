/*
Copyright 2020 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.spring.extended.network;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

import io.kubernetes.client.extended.network.EndpointsLoadBalancer;
import io.kubernetes.client.extended.network.LoadBalanceStrategy;
import io.kubernetes.client.extended.network.LoadBalancer;
import io.kubernetes.client.extended.network.RoundRobinLoadBalanceStrategy;
import io.kubernetes.client.extended.network.exception.NoAvailableAddressException;
import io.kubernetes.client.informer.cache.Cache;
import io.kubernetes.client.informer.cache.Lister;
import io.kubernetes.client.openapi.models.CoreV1EndpointPort;
import io.kubernetes.client.openapi.models.V1EndpointAddress;
import io.kubernetes.client.openapi.models.V1EndpointSubset;
import io.kubernetes.client.openapi.models.V1Endpoints;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.spring.extended.network.endpoints.EndpointsGetter;
import io.kubernetes.client.spring.extended.network.endpoints.InformerEndpointsGetter;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KubernetesEndpointsLoadBalancerCreatorTest {

  @SpringBootApplication
  static class TestConfig {
    @Bean
    public Cache<V1Endpoints> endpointsCache() {
      return new Cache<>();
    }

    @Bean
    public Lister<V1Endpoints> endpointsLister(Cache<V1Endpoints> endpointsCache) {
      return new Lister<>(endpointsCache);
    }

    @Bean
    public MyBean myBean(Lister<V1Endpoints> lister) {
      return new MyBean(new MyEndpointGetter(), new MyStrategy(), lister);
    }
  }

  static class MyBean {

    public MyBean(
        MyEndpointGetter myEndpointGetter, MyStrategy myStrategy, Lister<V1Endpoints> lister) {
      InformerEndpointsGetter getter = new InformerEndpointsGetter(lister);
      RoundRobinLoadBalanceStrategy strategy = new RoundRobinLoadBalanceStrategy();
      noSuchLoadBalancer =
          new EndpointsLoadBalancer(() -> getter.get("default", "no-such"), strategy);
      fooLoadBalancer = new EndpointsLoadBalancer(() -> getter.get("default", "foo"), strategy);
      customStrategyLoadBalancer =
          new EndpointsLoadBalancer(() -> getter.get("default", "foo"), myStrategy);
      customEndpointGetterLoadBalancer =
          new EndpointsLoadBalancer(() -> myEndpointGetter.get("default", "foo"), strategy);
    }

    private LoadBalancer noSuchLoadBalancer;

    private LoadBalancer fooLoadBalancer;

    private LoadBalancer customStrategyLoadBalancer;

    private LoadBalancer customEndpointGetterLoadBalancer;
  }

  static class MyStrategy implements LoadBalanceStrategy {
    static String alwaysReturn = "my-strategy";

    @Override
    public String chooseIP(List<String> ipCandidates) {
      return alwaysReturn;
    }
  }

  static class MyEndpointGetter implements EndpointsGetter {
    static V1Endpoints alwaysReturn =
        new V1Endpoints()
            .metadata(new V1ObjectMeta().namespace("default").name("foo"))
            .addSubsetsItem(
                new V1EndpointSubset()
                    .addAddressesItem(new V1EndpointAddress().ip("127.0.0.2"))
                    .addPortsItem(new CoreV1EndpointPort().port(8080)));

    @Override
    public V1Endpoints get(String namespace, String name) {
      return alwaysReturn;
    }
  }

  private final V1Endpoints twoPortTwoHostEp =
      new V1Endpoints()
          .metadata(new V1ObjectMeta().namespace("default").name("foo"))
          .addSubsetsItem(
              new V1EndpointSubset()
                  .addAddressesItem(new V1EndpointAddress().ip("127.0.0.1"))
                  .addPortsItem(new CoreV1EndpointPort().port(8080)));

  @Autowired private MyBean myBean;

  @Autowired private Cache<V1Endpoints> endpointsCache;

  @Test
  public void testLoadBalancer() throws NoAvailableAddressException {

    assertNotNull(myBean.fooLoadBalancer);
    endpointsCache.add(twoPortTwoHostEp);

    assertEquals("127.0.0.1", myBean.fooLoadBalancer.getTargetIP());
    assertEquals("127.0.0.1", myBean.fooLoadBalancer.getTargetIP(8080));
  }

  @Test
  public void testCustomStrategyLoadBalancer() throws NoAvailableAddressException {
    assertNotNull(myBean.customStrategyLoadBalancer);
    endpointsCache.add(twoPortTwoHostEp);
    assertEquals(MyStrategy.alwaysReturn, myBean.customStrategyLoadBalancer.getTargetIP());
    assertEquals(MyStrategy.alwaysReturn, myBean.customStrategyLoadBalancer.getTargetIP(8080));
  }

  @Test
  public void testCustomEndpointsGetterLoadBalancer() throws NoAvailableAddressException {
    assertNotNull(myBean.customEndpointGetterLoadBalancer);
    assertEquals("127.0.0.2", myBean.customEndpointGetterLoadBalancer.getTargetIP());
    assertEquals("127.0.0.2", myBean.customEndpointGetterLoadBalancer.getTargetIP(8080));
  }

  @Test
  public void testDeletedEndpointLoadBalancer() {
    assertNotNull(myBean.noSuchLoadBalancer);
    assertThrows(NoAvailableAddressException.class, () -> myBean.noSuchLoadBalancer.getTargetIP());
    assertThrows(
        NoAvailableAddressException.class, () -> myBean.noSuchLoadBalancer.getTargetIP(8080));
  }
}
