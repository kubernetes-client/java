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

import io.kubernetes.client.extended.network.exception.NoAvailableAddressException;
import io.kubernetes.client.openapi.models.CoreV1EndpointPort;
import io.kubernetes.client.openapi.models.V1EndpointAddress;
import io.kubernetes.client.openapi.models.V1EndpointSubset;
import io.kubernetes.client.openapi.models.V1Endpoints;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.junit.jupiter.api.Test;

class EndpointsLoadBalancerTests {

  private final V1Endpoints onePortTwoHostEp =
      new V1Endpoints()
          .addSubsetsItem(
              new V1EndpointSubset()
                  .addAddressesItem(new V1EndpointAddress().ip("127.0.0.1"))
                  .addAddressesItem(new V1EndpointAddress().ip("127.0.0.2"))
                  .addPortsItem(new CoreV1EndpointPort().port(8080)));

  private final V1Endpoints twoPortTwoHostEp =
      new V1Endpoints()
          .addSubsetsItem(
              new V1EndpointSubset()
                  .addAddressesItem(new V1EndpointAddress().ip("127.0.0.1"))
                  .addAddressesItem(new V1EndpointAddress().ip("127.0.0.2"))
                  .addPortsItem(new CoreV1EndpointPort().port(8080))
                  .addPortsItem(new CoreV1EndpointPort().port(8081)));

  private final V1Endpoints twoSubsetTwoPortTwoHostEp =
      new V1Endpoints()
          .addSubsetsItem(
              new V1EndpointSubset()
                  .addAddressesItem(new V1EndpointAddress().ip("127.0.0.1"))
                  .addAddressesItem(new V1EndpointAddress().ip("127.0.0.2"))
                  .addPortsItem(new CoreV1EndpointPort().port(8080))
                  .addPortsItem(new CoreV1EndpointPort().port(8081)))
          .addSubsetsItem(
              new V1EndpointSubset()
                  .addAddressesItem(new V1EndpointAddress().ip("127.0.0.3"))
                  .addPortsItem(new CoreV1EndpointPort().port(8082)));

  @Test
  void getTargetIP1() throws NoAvailableAddressException {
    AtomicReference<List<String>> receivingAvailableIPs = new AtomicReference<>();
    EndpointsLoadBalancer endpointsLoadBalancer =
        new EndpointsLoadBalancer(
            () -> onePortTwoHostEp,
            (ips) -> {
              receivingAvailableIPs.set(ips);
              return null;
            });
    endpointsLoadBalancer.getTargetIP();
    assertThat(receivingAvailableIPs.get()).containsExactly("127.0.0.1", "127.0.0.2");
  }

  @Test
  void getTargetIP2() throws NoAvailableAddressException {
    AtomicReference<List<String>> receivingAvailableIPs = new AtomicReference<>();
    EndpointsLoadBalancer endpointsLoadBalancer =
        new EndpointsLoadBalancer(
            () -> twoPortTwoHostEp,
            (ips) -> {
              receivingAvailableIPs.set(ips);
              return null;
            });
    endpointsLoadBalancer.getTargetIP();
    assertThat(receivingAvailableIPs.get()).containsExactly("127.0.0.1", "127.0.0.2");
  }

  @Test
  void getTargetIP3() throws NoAvailableAddressException {
    AtomicReference<List<String>> receivingAvailableIPs = new AtomicReference<>();
    EndpointsLoadBalancer endpointsLoadBalancer =
        new EndpointsLoadBalancer(
            () -> twoSubsetTwoPortTwoHostEp,
            (ips) -> {
              receivingAvailableIPs.set(ips);
              return null;
            });
    endpointsLoadBalancer.getTargetIP(8082);
    assertThat(receivingAvailableIPs.get()).containsExactly("127.0.0.3");
  }
}
