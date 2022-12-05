package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1CustomResourceDefinitionNamesBuilder extends V1CustomResourceDefinitionNamesFluentImpl<V1CustomResourceDefinitionNamesBuilder> implements VisitableBuilder<V1CustomResourceDefinitionNames,V1CustomResourceDefinitionNamesBuilder>{
  public V1CustomResourceDefinitionNamesBuilder() {
    this(false);
  }
  public V1CustomResourceDefinitionNamesBuilder(Boolean validationEnabled) {
    this(new V1CustomResourceDefinitionNames(), validationEnabled);
  }
  public V1CustomResourceDefinitionNamesBuilder(V1CustomResourceDefinitionNamesFluent<?> fluent) {
    this(fluent, false);
  }
  public V1CustomResourceDefinitionNamesBuilder(V1CustomResourceDefinitionNamesFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1CustomResourceDefinitionNames(), validationEnabled);
  }
  public V1CustomResourceDefinitionNamesBuilder(V1CustomResourceDefinitionNamesFluent<?> fluent,V1CustomResourceDefinitionNames instance) {
    this(fluent, instance, false);
  }
  public V1CustomResourceDefinitionNamesBuilder(V1CustomResourceDefinitionNamesFluent<?> fluent,V1CustomResourceDefinitionNames instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withCategories(instance.getCategories());

    fluent.withKind(instance.getKind());

    fluent.withListKind(instance.getListKind());

    fluent.withPlural(instance.getPlural());

    fluent.withShortNames(instance.getShortNames());

    fluent.withSingular(instance.getSingular());

    this.validationEnabled = validationEnabled; 
  }
  public V1CustomResourceDefinitionNamesBuilder(V1CustomResourceDefinitionNames instance) {
    this(instance,false);
  }
  public V1CustomResourceDefinitionNamesBuilder(V1CustomResourceDefinitionNames instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withCategories(instance.getCategories());

    this.withKind(instance.getKind());

    this.withListKind(instance.getListKind());

    this.withPlural(instance.getPlural());

    this.withShortNames(instance.getShortNames());

    this.withSingular(instance.getSingular());

    this.validationEnabled = validationEnabled; 
  }
  V1CustomResourceDefinitionNamesFluent<?> fluent;
  Boolean validationEnabled;
  public V1CustomResourceDefinitionNames build() {
    V1CustomResourceDefinitionNames buildable = new V1CustomResourceDefinitionNames();
    buildable.setCategories(fluent.getCategories());
    buildable.setKind(fluent.getKind());
    buildable.setListKind(fluent.getListKind());
    buildable.setPlural(fluent.getPlural());
    buildable.setShortNames(fluent.getShortNames());
    buildable.setSingular(fluent.getSingular());
    return buildable;
  }
  
}