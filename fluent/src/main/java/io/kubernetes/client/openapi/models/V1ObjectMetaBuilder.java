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
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1ObjectMetaBuilder extends V1ObjectMetaFluent<V1ObjectMetaBuilder> implements VisitableBuilder<V1ObjectMeta,V1ObjectMetaBuilder>{

  V1ObjectMetaFluent<?> fluent;

  public V1ObjectMetaBuilder() {
    this(new V1ObjectMeta());
  }
  
  public V1ObjectMetaBuilder(V1ObjectMetaFluent<?> fluent) {
    this(fluent, new V1ObjectMeta());
  }
  
  public V1ObjectMetaBuilder(V1ObjectMeta instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ObjectMetaBuilder(V1ObjectMetaFluent<?> fluent,V1ObjectMeta instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ObjectMeta build() {
    V1ObjectMeta buildable = new V1ObjectMeta();
    buildable.setAnnotations(fluent.getAnnotations());
    buildable.setCreationTimestamp(fluent.getCreationTimestamp());
    buildable.setDeletionGracePeriodSeconds(fluent.getDeletionGracePeriodSeconds());
    buildable.setDeletionTimestamp(fluent.getDeletionTimestamp());
    buildable.setFinalizers(fluent.getFinalizers());
    buildable.setGenerateName(fluent.getGenerateName());
    buildable.setGeneration(fluent.getGeneration());
    buildable.setLabels(fluent.getLabels());
    buildable.setManagedFields(fluent.buildManagedFields());
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    buildable.setOwnerReferences(fluent.buildOwnerReferences());
    buildable.setResourceVersion(fluent.getResourceVersion());
    buildable.setSelfLink(fluent.getSelfLink());
    buildable.setUid(fluent.getUid());
    return buildable;
  }
  
}