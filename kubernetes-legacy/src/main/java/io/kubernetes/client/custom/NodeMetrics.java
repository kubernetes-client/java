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

import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import java.util.HashMap;
import java.util.Map;

public class NodeMetrics implements KubernetesObject {
  private V1ObjectMeta metadata;
  private String kind;
  private String apiVersion;
  private String timestamp;
  private String window;
  private Map<String, Quantity> usage;

  public NodeMetrics() {
    this.metadata = new V1ObjectMeta();
    this.usage = new HashMap<>();
  }

  public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public String getTimestamp() {
    return timestamp;
  }

  public String getWindow() {
    return window;
  }

  public String getKind() {
    return kind;
  }

  public String getApiVersion() {
    return apiVersion;
  }

  public Map<String, Quantity> getUsage() {
    return usage;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public void setWindow(String window) {
    this.window = window;
  }

  public void setUsage(Map<String, Quantity> usage) {
    this.usage = usage;
  }
}
