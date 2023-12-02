package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1APIResourceBuilder extends V1APIResourceFluent<V1APIResourceBuilder> implements VisitableBuilder<V1APIResource,V1APIResourceBuilder>{
  public V1APIResourceBuilder() {
    this(new V1APIResource());
  }
  
  public V1APIResourceBuilder(V1APIResourceFluent<?> fluent) {
    this(fluent, new V1APIResource());
  }
  
  public V1APIResourceBuilder(V1APIResourceFluent<?> fluent,V1APIResource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1APIResourceBuilder(V1APIResource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1APIResourceFluent<?> fluent;
  
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