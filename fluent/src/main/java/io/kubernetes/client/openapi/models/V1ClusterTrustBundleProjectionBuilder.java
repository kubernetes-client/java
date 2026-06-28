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
public class V1ClusterTrustBundleProjectionBuilder extends V1ClusterTrustBundleProjectionFluent<V1ClusterTrustBundleProjectionBuilder> implements VisitableBuilder<V1ClusterTrustBundleProjection,V1ClusterTrustBundleProjectionBuilder>{

  V1ClusterTrustBundleProjectionFluent<?> fluent;

  public V1ClusterTrustBundleProjectionBuilder() {
    this(new V1ClusterTrustBundleProjection());
  }
  
  public V1ClusterTrustBundleProjectionBuilder(V1ClusterTrustBundleProjectionFluent<?> fluent) {
    this(fluent, new V1ClusterTrustBundleProjection());
  }
  
  public V1ClusterTrustBundleProjectionBuilder(V1ClusterTrustBundleProjection instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ClusterTrustBundleProjectionBuilder(V1ClusterTrustBundleProjectionFluent<?> fluent,V1ClusterTrustBundleProjection instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ClusterTrustBundleProjection build() {
    V1ClusterTrustBundleProjection buildable = new V1ClusterTrustBundleProjection();
    buildable.setLabelSelector(fluent.buildLabelSelector());
    buildable.setName(fluent.getName());
    buildable.setOptional(fluent.getOptional());
    buildable.setPath(fluent.getPath());
    buildable.setSignerName(fluent.getSignerName());
    return buildable;
  }
  
}