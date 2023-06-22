package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha1ParamKindBuilder extends V1alpha1ParamKindFluentImpl<V1alpha1ParamKindBuilder> implements VisitableBuilder<V1alpha1ParamKind,V1alpha1ParamKindBuilder>{
  public V1alpha1ParamKindBuilder() {
    this(false);
  }
  public V1alpha1ParamKindBuilder(Boolean validationEnabled) {
    this(new V1alpha1ParamKind(), validationEnabled);
  }
  public V1alpha1ParamKindBuilder(V1alpha1ParamKindFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha1ParamKindBuilder(V1alpha1ParamKindFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha1ParamKind(), validationEnabled);
  }
  public V1alpha1ParamKindBuilder(V1alpha1ParamKindFluent<?> fluent,V1alpha1ParamKind instance) {
    this(fluent, instance, false);
  }
  public V1alpha1ParamKindBuilder(V1alpha1ParamKindFluent<?> fluent,V1alpha1ParamKind instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withApiVersion(instance.getApiVersion());
      fluent.withKind(instance.getKind());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha1ParamKindBuilder(V1alpha1ParamKind instance) {
    this(instance,false);
  }
  public V1alpha1ParamKindBuilder(V1alpha1ParamKind instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withApiVersion(instance.getApiVersion());
      this.withKind(instance.getKind());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha1ParamKindFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha1ParamKind build() {
    V1alpha1ParamKind buildable = new V1alpha1ParamKind();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    return buildable;
  }
  
}