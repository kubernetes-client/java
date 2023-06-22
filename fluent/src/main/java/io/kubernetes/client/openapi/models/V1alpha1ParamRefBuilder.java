package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha1ParamRefBuilder extends V1alpha1ParamRefFluentImpl<V1alpha1ParamRefBuilder> implements VisitableBuilder<V1alpha1ParamRef,V1alpha1ParamRefBuilder>{
  public V1alpha1ParamRefBuilder() {
    this(false);
  }
  public V1alpha1ParamRefBuilder(Boolean validationEnabled) {
    this(new V1alpha1ParamRef(), validationEnabled);
  }
  public V1alpha1ParamRefBuilder(V1alpha1ParamRefFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha1ParamRefBuilder(V1alpha1ParamRefFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha1ParamRef(), validationEnabled);
  }
  public V1alpha1ParamRefBuilder(V1alpha1ParamRefFluent<?> fluent,V1alpha1ParamRef instance) {
    this(fluent, instance, false);
  }
  public V1alpha1ParamRefBuilder(V1alpha1ParamRefFluent<?> fluent,V1alpha1ParamRef instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withName(instance.getName());
      fluent.withNamespace(instance.getNamespace());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha1ParamRefBuilder(V1alpha1ParamRef instance) {
    this(instance,false);
  }
  public V1alpha1ParamRefBuilder(V1alpha1ParamRef instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withName(instance.getName());
      this.withNamespace(instance.getNamespace());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha1ParamRefFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha1ParamRef build() {
    V1alpha1ParamRef buildable = new V1alpha1ParamRef();
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    return buildable;
  }
  
}