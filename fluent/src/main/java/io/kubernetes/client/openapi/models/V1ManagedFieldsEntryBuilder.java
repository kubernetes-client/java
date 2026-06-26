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
public class V1ManagedFieldsEntryBuilder extends V1ManagedFieldsEntryFluent<V1ManagedFieldsEntryBuilder> implements VisitableBuilder<V1ManagedFieldsEntry,V1ManagedFieldsEntryBuilder>{

  V1ManagedFieldsEntryFluent<?> fluent;

  public V1ManagedFieldsEntryBuilder() {
    this(new V1ManagedFieldsEntry());
  }
  
  public V1ManagedFieldsEntryBuilder(V1ManagedFieldsEntryFluent<?> fluent) {
    this(fluent, new V1ManagedFieldsEntry());
  }
  
  public V1ManagedFieldsEntryBuilder(V1ManagedFieldsEntry instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ManagedFieldsEntryBuilder(V1ManagedFieldsEntryFluent<?> fluent,V1ManagedFieldsEntry instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ManagedFieldsEntry build() {
    V1ManagedFieldsEntry buildable = new V1ManagedFieldsEntry();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setFieldsType(fluent.getFieldsType());
    buildable.setFieldsV1(fluent.getFieldsV1());
    buildable.setManager(fluent.getManager());
    buildable.setOperation(fluent.getOperation());
    buildable.setSubresource(fluent.getSubresource());
    buildable.setTime(fluent.getTime());
    return buildable;
  }
  
}