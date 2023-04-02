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
package io.kubernetes.client.extended.network;

import static org.junit.Assert.*;

import io.kubernetes.client.extended.network.exception.NoAvailableAddressException;
import io.kubernetes.client.openapi.models.CoreV1EndpointPort;
import io.kubernetes.client.openapi.models.V1EndpointAddress;
import io.kubernetes.client.openapi.models.V1EndpointSubset;
import io.kubernetes.client.openapi.models.V1Endpoints;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class RoundRobinEndpointsLoadBalancerTests {

  private final V1Endpoints twoPortTwoHostEp =
      new V1Endpoints()
          .addSubsetsItem(
              new V1EndpointSubset()
                  .addAddressesItem(new V1EndpointAddress().ip("127.0.0.1"))
                  .addAddressesItem(new V1EndpointAddress().ip("127.0.0.2"))
                  .addPortsItem(new CoreV1EndpointPort().port(8080))
                  .addPortsItem(new CoreV1EndpointPort().port(8081)));

  @Test
  public void testChooseIPFromNullListShouldThrowException() {
    RoundRobinLoadBalanceStrategy strategy = new RoundRobinLoadBalanceStrategy();
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          strategy.chooseIP(null);
        });
  }

  @Test
  public void testChooseIPFromEmptyListShouldThrowException() {
    RoundRobinLoadBalanceStrategy strategy = new RoundRobinLoadBalanceStrategy();
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          strategy.chooseIP(new ArrayList<>());
        });
  }

  @Test
  public void testChooseFixedMultipleIPShouldWork() {
    RoundRobinLoadBalanceStrategy strategy = new RoundRobinLoadBalanceStrategy();
    List<String> availables = Arrays.asList("127.0.0.1", "127.0.0.2", "127.0.0.3");
    assertEquals("127.0.0.1", strategy.chooseIP(availables));
    assertEquals("127.0.0.2", strategy.chooseIP(availables));
    assertEquals("127.0.0.3", strategy.chooseIP(availables));
    assertEquals("127.0.0.1", strategy.chooseIP(availables));
    assertEquals("127.0.0.2", strategy.chooseIP(availables));
    assertEquals("127.0.0.3", strategy.chooseIP(availables));
  }

  @Test
  public void testChooseChangingMultipleIPShouldWork() {
    RoundRobinLoadBalanceStrategy strategy = new RoundRobinLoadBalanceStrategy();
    List<String> availables = Arrays.asList("127.0.0.1", "127.0.0.2", "127.0.0.3");
    List<String> availablesChanged =
        Arrays.asList("127.0.0.1", "127.0.0.2", "127.0.0.3", "127.0.0.4", "127.0.0.5");
    assertEquals("127.0.0.1", strategy.chooseIP(availables));
    assertEquals("127.0.0.2", strategy.chooseIP(availables));
    assertEquals("127.0.0.3", strategy.chooseIP(availables));

    assertEquals("127.0.0.4", strategy.chooseIP(availablesChanged));
    assertEquals("127.0.0.5", strategy.chooseIP(availablesChanged));
  }

  @Test
  public void testEndpointLoadBalancing() throws NoAvailableAddressException {
    EndpointsLoadBalancer loadBalancer =
        new EndpointsLoadBalancer(() -> twoPortTwoHostEp, new RoundRobinLoadBalanceStrategy());
    assertEquals("127.0.0.1", loadBalancer.getTargetIP());
    assertEquals("127.0.0.2", loadBalancer.getTargetIP());
    assertEquals("127.0.0.1", loadBalancer.getTargetIP(8081));
    assertThrows(
        NoAvailableAddressException.class,
        () -> {
          loadBalancer.getTargetIP(9999);
        });
  }
}
