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

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import io.kubernetes.client.extended.network.exception.NoAvailableAddressException;
import io.kubernetes.client.openapi.models.CoreV1EndpointPort;
import io.kubernetes.client.openapi.models.V1EndpointAddress;
import io.kubernetes.client.openapi.models.V1EndpointSubset;
import io.kubernetes.client.openapi.models.V1Endpoints;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class RoundRobinEndpointsLoadBalancerTests {

  private final V1Endpoints twoPortTwoHostEp =
      new V1Endpoints()
          .addSubsetsItem(
              new V1EndpointSubset()
                  .addAddressesItem(new V1EndpointAddress().ip("127.0.0.1"))
                  .addAddressesItem(new V1EndpointAddress().ip("127.0.0.2"))
                  .addPortsItem(new CoreV1EndpointPort().port(8080))
                  .addPortsItem(new CoreV1EndpointPort().port(8081)));

  @Test
  void chooseIPFromNullListShouldThrowException() {
    RoundRobinLoadBalanceStrategy strategy = new RoundRobinLoadBalanceStrategy();
    assertThatThrownBy(() -> strategy.chooseIP(null))
        .isInstanceOf(IllegalArgumentException.class);
  }

  @Test
  void chooseIPFromEmptyListShouldThrowException() {
    RoundRobinLoadBalanceStrategy strategy = new RoundRobinLoadBalanceStrategy();
    assertThatThrownBy(() -> strategy.chooseIP(new ArrayList<>()))
        .isInstanceOf(IllegalArgumentException.class);
  }

  @Test
  void chooseFixedMultipleIPShouldWork() {
    RoundRobinLoadBalanceStrategy strategy = new RoundRobinLoadBalanceStrategy();
    List<String> availables = Arrays.asList("127.0.0.1", "127.0.0.2", "127.0.0.3");
    assertThat(strategy.chooseIP(availables)).isEqualTo("127.0.0.1");
    assertThat(strategy.chooseIP(availables)).isEqualTo("127.0.0.2");
    assertThat(strategy.chooseIP(availables)).isEqualTo("127.0.0.3");
    assertThat(strategy.chooseIP(availables)).isEqualTo("127.0.0.1");
    assertThat(strategy.chooseIP(availables)).isEqualTo("127.0.0.2");
    assertThat(strategy.chooseIP(availables)).isEqualTo("127.0.0.3");
  }

  @Test
  void chooseChangingMultipleIPShouldWork() {
    RoundRobinLoadBalanceStrategy strategy = new RoundRobinLoadBalanceStrategy();
    List<String> availables = Arrays.asList("127.0.0.1", "127.0.0.2", "127.0.0.3");
    List<String> availablesChanged =
        Arrays.asList("127.0.0.1", "127.0.0.2", "127.0.0.3", "127.0.0.4", "127.0.0.5");
    assertThat(strategy.chooseIP(availables)).isEqualTo("127.0.0.1");
    assertThat(strategy.chooseIP(availables)).isEqualTo("127.0.0.2");
    assertThat(strategy.chooseIP(availables)).isEqualTo("127.0.0.3");

    assertThat(strategy.chooseIP(availablesChanged)).isEqualTo("127.0.0.4");
    assertThat(strategy.chooseIP(availablesChanged)).isEqualTo("127.0.0.5");
  }

  @Test
  void endpointLoadBalancing() throws NoAvailableAddressException {
    EndpointsLoadBalancer loadBalancer =
        new EndpointsLoadBalancer(() -> twoPortTwoHostEp, new RoundRobinLoadBalanceStrategy());
    assertThat(loadBalancer.getTargetIP()).isEqualTo("127.0.0.1");
    assertThat(loadBalancer.getTargetIP()).isEqualTo("127.0.0.2");
    assertThat(loadBalancer.getTargetIP(8081)).isEqualTo("127.0.0.1");
    assertThatThrownBy(() ->loadBalancer.getTargetIP(9999))
        .isInstanceOf(NoAvailableAddressException.class);
  }
}
