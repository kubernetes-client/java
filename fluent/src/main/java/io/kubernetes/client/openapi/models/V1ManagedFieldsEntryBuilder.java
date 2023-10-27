package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ManagedFieldsEntryBuilder extends V1ManagedFieldsEntryFluent<V1ManagedFieldsEntryBuilder> implements VisitableBuilder<V1ManagedFieldsEntry,V1ManagedFieldsEntryBuilder>{
  public V1ManagedFieldsEntryBuilder() {
    this(new V1ManagedFieldsEntry());
  }
  
  public V1ManagedFieldsEntryBuilder(V1ManagedFieldsEntryFluent<?> fluent) {
    this(fluent, new V1ManagedFieldsEntry());
  }
  
  public V1ManagedFieldsEntryBuilder(V1ManagedFieldsEntryFluent<?> fluent,V1ManagedFieldsEntry instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ManagedFieldsEntryBuilder(V1ManagedFieldsEntry instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ManagedFieldsEntryFluent<?> fluent;
  
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