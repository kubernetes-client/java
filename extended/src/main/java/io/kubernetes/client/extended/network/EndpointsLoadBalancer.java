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

import io.kubernetes.client.extended.network.exception.NoAvailableAddressException;
import io.kubernetes.client.openapi.models.V1Endpoints;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * EndpointsLoadBalancer does client-side load-balancing by reading available IP addresses from
 * endpoint instance.
 *
 * <p>For example:
 *
 * <p>> new EndpointsLoadBalancer( > () -> endpoints, new YourLoadBalanceStrategy()) > );
 */
public class EndpointsLoadBalancer implements LoadBalancer {

  protected final Supplier<V1Endpoints> endpointsSupplier;
  protected final LoadBalanceStrategy strategy;

  public EndpointsLoadBalancer(
      Supplier<V1Endpoints> endpointsSupplier, LoadBalanceStrategy strategy) {
    this.endpointsSupplier = endpointsSupplier;
    this.strategy = strategy;
  }

  @Override
  public List<String> getAllAvailableIPs() throws NoAvailableAddressException {
    V1Endpoints ep = endpointsSupplier.get();
    if (ep == null || ep.getSubsets() == null) {
      throw new NoAvailableAddressException();
    }
    return ep.getSubsets().stream()
        .flatMap(subset -> subset.getAddresses().stream().map(addr -> addr.getIp()))
        .collect(Collectors.toList());
  }

  @Override
  public List<String> getAllAvailableIPs(int port) throws NoAvailableAddressException {
    V1Endpoints ep = endpointsSupplier.get();
    if (ep == null || ep.getSubsets() == null) {
      throw new NoAvailableAddressException();
    }
    return ep.getSubsets().stream()
        .filter(
            subset ->
                subset.getPorts().stream()
                    .anyMatch(epPort -> Integer.valueOf(port).equals(epPort.getPort())))
        .flatMap(subset -> subset.getAddresses().stream().map(addr -> addr.getIp()))
        .collect(Collectors.toList());
  }

  @Override
  public String getTargetIP() throws NoAvailableAddressException {
    List<String> availableIPs = getAllAvailableIPs();
    if (availableIPs.size() == 0) {
      throw new NoAvailableAddressException();
    }
    return this.strategy.chooseIP(availableIPs);
  }

  @Override
  public String getTargetIP(int port) throws NoAvailableAddressException {
    V1Endpoints ep = endpointsSupplier.get();
    if (ep == null || ep.getSubsets() == null) {
      throw new NoAvailableAddressException();
    }
    List<String> availableIPs = getAllAvailableIPs(port);
    if (availableIPs.size() == 0) {
      throw new NoAvailableAddressException();
    }
    return this.strategy.chooseIP(availableIPs);
  }
}
