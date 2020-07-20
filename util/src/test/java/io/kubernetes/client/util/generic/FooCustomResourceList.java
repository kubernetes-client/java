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
package io.kubernetes.client.util.generic;

import io.kubernetes.client.common.KubernetesListObject;
import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;

public class FooCustomResourceList implements KubernetesListObject {
  private V1ListMeta metadata;
  private List<FooCustomResource> items;

  public V1ListMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ListMeta metadata) {
    this.metadata = metadata;
  }

  public List<FooCustomResource> getItems() {
    return items;
  }

  public void setItems(List<FooCustomResource> items) {
    this.items = items;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    FooCustomResourceList that = (FooCustomResourceList) o;

    if (metadata != null ? !metadata.equals(that.metadata) : that.metadata != null) return false;
    return items != null ? items.equals(that.items) : that.items == null;
  }

  @Override
  public int hashCode() {
    int result = metadata != null ? metadata.hashCode() : 0;
    result = 31 * result + (items != null ? items.hashCode() : 0);
    return result;
  }

  @Override
  public String getApiVersion() {
    return "";
  }

  @Override
  public String getKind() {
    return "";
  }
}
