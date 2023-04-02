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

import io.kubernetes.client.common.KubernetesListObject;
import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.ArrayList;
import java.util.List;

public class NodeMetricsList implements KubernetesListObject {
  private String apiVersion;
  private String kind;
  private V1ListMeta metadata;
  private List<NodeMetrics> items;

  public NodeMetricsList() {
    this.metadata = new V1ListMeta();
    this.items = new ArrayList<>();
  }

  public String getApiVersion() {
    return apiVersion;
  }

  public String getKind() {
    return kind;
  }

  public V1ListMeta getMetadata() {
    return metadata;
  }

  public List<NodeMetrics> getItems() {
    return items;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public void setMetadata(V1ListMeta metadata) {
    this.metadata = metadata;
  }

  public void setItems(List<NodeMetrics> items) {
    this.items = items;
  }
}
