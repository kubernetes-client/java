/*
Copyright 2026 The Kubernetes Authors.
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
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta1ClusterTrustBundleBuilder extends V1beta1ClusterTrustBundleFluent<V1beta1ClusterTrustBundleBuilder> implements VisitableBuilder<V1beta1ClusterTrustBundle,V1beta1ClusterTrustBundleBuilder>{

  V1beta1ClusterTrustBundleFluent<?> fluent;

  public V1beta1ClusterTrustBundleBuilder() {
    this(new V1beta1ClusterTrustBundle());
  }
  
  public V1beta1ClusterTrustBundleBuilder(V1beta1ClusterTrustBundleFluent<?> fluent) {
    this(fluent, new V1beta1ClusterTrustBundle());
  }
  
  public V1beta1ClusterTrustBundleBuilder(V1beta1ClusterTrustBundle instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1ClusterTrustBundleBuilder(V1beta1ClusterTrustBundleFluent<?> fluent,V1beta1ClusterTrustBundle instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1ClusterTrustBundle build() {
    V1beta1ClusterTrustBundle buildable = new V1beta1ClusterTrustBundle();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  
}