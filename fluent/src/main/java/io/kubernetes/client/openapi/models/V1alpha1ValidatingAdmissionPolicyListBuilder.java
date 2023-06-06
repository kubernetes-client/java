package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha1ValidatingAdmissionPolicyListBuilder extends V1alpha1ValidatingAdmissionPolicyListFluentImpl<V1alpha1ValidatingAdmissionPolicyListBuilder> implements VisitableBuilder<V1alpha1ValidatingAdmissionPolicyList,V1alpha1ValidatingAdmissionPolicyListBuilder>{
  public V1alpha1ValidatingAdmissionPolicyListBuilder() {
    this(false);
  }
  public V1alpha1ValidatingAdmissionPolicyListBuilder(Boolean validationEnabled) {
    this(new V1alpha1ValidatingAdmissionPolicyList(), validationEnabled);
  }
  public V1alpha1ValidatingAdmissionPolicyListBuilder(V1alpha1ValidatingAdmissionPolicyListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha1ValidatingAdmissionPolicyListBuilder(V1alpha1ValidatingAdmissionPolicyListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha1ValidatingAdmissionPolicyList(), validationEnabled);
  }
  public V1alpha1ValidatingAdmissionPolicyListBuilder(V1alpha1ValidatingAdmissionPolicyListFluent<?> fluent,V1alpha1ValidatingAdmissionPolicyList instance) {
    this(fluent, instance, false);
  }
  public V1alpha1ValidatingAdmissionPolicyListBuilder(V1alpha1ValidatingAdmissionPolicyListFluent<?> fluent,V1alpha1ValidatingAdmissionPolicyList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withApiVersion(instance.getApiVersion());
      fluent.withItems(instance.getItems());
      fluent.withKind(instance.getKind());
      fluent.withMetadata(instance.getMetadata());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha1ValidatingAdmissionPolicyListBuilder(V1alpha1ValidatingAdmissionPolicyList instance) {
    this(instance,false);
  }
  public V1alpha1ValidatingAdmissionPolicyListBuilder(V1alpha1ValidatingAdmissionPolicyList instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withApiVersion(instance.getApiVersion());
      this.withItems(instance.getItems());
      this.withKind(instance.getKind());
      this.withMetadata(instance.getMetadata());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha1ValidatingAdmissionPolicyListFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha1ValidatingAdmissionPolicyList build() {
    V1alpha1ValidatingAdmissionPolicyList buildable = new V1alpha1ValidatingAdmissionPolicyList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}