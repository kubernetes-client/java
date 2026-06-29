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
public class V1ServiceAccountTokenProjectionBuilder extends V1ServiceAccountTokenProjectionFluent<V1ServiceAccountTokenProjectionBuilder> implements VisitableBuilder<V1ServiceAccountTokenProjection,V1ServiceAccountTokenProjectionBuilder>{

  V1ServiceAccountTokenProjectionFluent<?> fluent;

  public V1ServiceAccountTokenProjectionBuilder() {
    this(new V1ServiceAccountTokenProjection());
  }
  
  public V1ServiceAccountTokenProjectionBuilder(V1ServiceAccountTokenProjectionFluent<?> fluent) {
    this(fluent, new V1ServiceAccountTokenProjection());
  }
  
  public V1ServiceAccountTokenProjectionBuilder(V1ServiceAccountTokenProjection instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ServiceAccountTokenProjectionBuilder(V1ServiceAccountTokenProjectionFluent<?> fluent,V1ServiceAccountTokenProjection instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ServiceAccountTokenProjection build() {
    V1ServiceAccountTokenProjection buildable = new V1ServiceAccountTokenProjection();
    buildable.setAudience(fluent.getAudience());
    buildable.setExpirationSeconds(fluent.getExpirationSeconds());
    buildable.setPath(fluent.getPath());
    return buildable;
  }
  
}