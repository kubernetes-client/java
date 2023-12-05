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
package io.kubernetes.client.custom;

import java.util.Map;

public class ContainerMetrics {
  private String name;
  private Map<String, Quantity> usage;

  public String getName() {
    return name;
  }

  public Map<String, Quantity> getUsage() {
    return usage;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setUsage(Map<String, Quantity> usage) {
    this.usage = usage;
  }
}
