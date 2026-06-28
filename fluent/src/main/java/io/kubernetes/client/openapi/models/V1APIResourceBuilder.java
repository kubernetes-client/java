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
public class V1APIResourceBuilder extends V1APIResourceFluent<V1APIResourceBuilder> implements VisitableBuilder<V1APIResource,V1APIResourceBuilder>{

  V1APIResourceFluent<?> fluent;

  public V1APIResourceBuilder() {
    this(new V1APIResource());
  }
  
  public V1APIResourceBuilder(V1APIResourceFluent<?> fluent) {
    this(fluent, new V1APIResource());
  }
  
  public V1APIResourceBuilder(V1APIResource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1APIResourceBuilder(V1APIResourceFluent<?> fluent,V1APIResource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1APIResource build() {
    V1APIResource buildable = new V1APIResource();
    buildable.setCategories(fluent.getCategories());
    buildable.setGroup(fluent.getGroup());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    buildable.setNamespaced(fluent.getNamespaced());
    buildable.setShortNames(fluent.getShortNames());
    buildable.setSingularName(fluent.getSingularName());
    buildable.setStorageVersionHash(fluent.getStorageVersionHash());
    buildable.setVerbs(fluent.getVerbs());
    buildable.setVersion(fluent.getVersion());
    return buildable;
  }
  
}