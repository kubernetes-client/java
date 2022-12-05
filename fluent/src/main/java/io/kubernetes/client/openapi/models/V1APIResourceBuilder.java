package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1APIResourceBuilder extends V1APIResourceFluentImpl<V1APIResourceBuilder> implements VisitableBuilder<V1APIResource,V1APIResourceBuilder>{
  public V1APIResourceBuilder() {
    this(false);
  }
  public V1APIResourceBuilder(Boolean validationEnabled) {
    this(new V1APIResource(), validationEnabled);
  }
  public V1APIResourceBuilder(V1APIResourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1APIResourceBuilder(V1APIResourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1APIResource(), validationEnabled);
  }
  public V1APIResourceBuilder(V1APIResourceFluent<?> fluent,V1APIResource instance) {
    this(fluent, instance, false);
  }
  public V1APIResourceBuilder(V1APIResourceFluent<?> fluent,V1APIResource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withCategories(instance.getCategories());

    fluent.withGroup(instance.getGroup());

    fluent.withKind(instance.getKind());

    fluent.withName(instance.getName());

    fluent.withNamespaced(instance.getNamespaced());

    fluent.withShortNames(instance.getShortNames());

    fluent.withSingularName(instance.getSingularName());

    fluent.withStorageVersionHash(instance.getStorageVersionHash());

    fluent.withVerbs(instance.getVerbs());

    fluent.withVersion(instance.getVersion());

    this.validationEnabled = validationEnabled; 
  }
  public V1APIResourceBuilder(V1APIResource instance) {
    this(instance,false);
  }
  public V1APIResourceBuilder(V1APIResource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withCategories(instance.getCategories());

    this.withGroup(instance.getGroup());

    this.withKind(instance.getKind());

    this.withName(instance.getName());

    this.withNamespaced(instance.getNamespaced());

    this.withShortNames(instance.getShortNames());

    this.withSingularName(instance.getSingularName());

    this.withStorageVersionHash(instance.getStorageVersionHash());

    this.withVerbs(instance.getVerbs());

    this.withVersion(instance.getVersion());

    this.validationEnabled = validationEnabled; 
  }
  V1APIResourceFluent<?> fluent;
  Boolean validationEnabled;
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