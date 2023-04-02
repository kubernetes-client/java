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

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class RoundRobinLoadBalanceStrategy implements LoadBalanceStrategy {

  private final AtomicInteger robinIndex = new AtomicInteger(0);

  @Override
  public String chooseIP(List<String> availableIPs) {
    if (availableIPs == null || availableIPs.size() == 0) {
      throw new IllegalArgumentException("failed choosing IP target: empty candidates");
    }
    int len = availableIPs.size();
    int idx = robinIndex.getAndIncrement() % len;
    return availableIPs.get(idx);
  }
}
