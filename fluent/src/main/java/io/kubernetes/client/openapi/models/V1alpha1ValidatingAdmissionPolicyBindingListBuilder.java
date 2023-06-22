package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha1ValidatingAdmissionPolicyBindingListBuilder extends V1alpha1ValidatingAdmissionPolicyBindingListFluentImpl<V1alpha1ValidatingAdmissionPolicyBindingListBuilder> implements VisitableBuilder<V1alpha1ValidatingAdmissionPolicyBindingList,V1alpha1ValidatingAdmissionPolicyBindingListBuilder>{
  public V1alpha1ValidatingAdmissionPolicyBindingListBuilder() {
    this(false);
  }
  public V1alpha1ValidatingAdmissionPolicyBindingListBuilder(Boolean validationEnabled) {
    this(new V1alpha1ValidatingAdmissionPolicyBindingList(), validationEnabled);
  }
  public V1alpha1ValidatingAdmissionPolicyBindingListBuilder(V1alpha1ValidatingAdmissionPolicyBindingListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha1ValidatingAdmissionPolicyBindingListBuilder(V1alpha1ValidatingAdmissionPolicyBindingListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha1ValidatingAdmissionPolicyBindingList(), validationEnabled);
  }
  public V1alpha1ValidatingAdmissionPolicyBindingListBuilder(V1alpha1ValidatingAdmissionPolicyBindingListFluent<?> fluent,V1alpha1ValidatingAdmissionPolicyBindingList instance) {
    this(fluent, instance, false);
  }
  public V1alpha1ValidatingAdmissionPolicyBindingListBuilder(V1alpha1ValidatingAdmissionPolicyBindingListFluent<?> fluent,V1alpha1ValidatingAdmissionPolicyBindingList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withApiVersion(instance.getApiVersion());
      fluent.withItems(instance.getItems());
      fluent.withKind(instance.getKind());
      fluent.withMetadata(instance.getMetadata());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha1ValidatingAdmissionPolicyBindingListBuilder(V1alpha1ValidatingAdmissionPolicyBindingList instance) {
    this(instance,false);
  }
  public V1alpha1ValidatingAdmissionPolicyBindingListBuilder(V1alpha1ValidatingAdmissionPolicyBindingList instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withApiVersion(instance.getApiVersion());
      this.withItems(instance.getItems());
      this.withKind(instance.getKind());
      this.withMetadata(instance.getMetadata());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha1ValidatingAdmissionPolicyBindingListFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha1ValidatingAdmissionPolicyBindingList build() {
    V1alpha1ValidatingAdmissionPolicyBindingList buildable = new V1alpha1ValidatingAdmissionPolicyBindingList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}