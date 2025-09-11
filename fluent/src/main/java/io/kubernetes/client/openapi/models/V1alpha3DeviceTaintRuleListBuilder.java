package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1alpha3DeviceTaintRuleListBuilder extends V1alpha3DeviceTaintRuleListFluent<V1alpha3DeviceTaintRuleListBuilder> implements VisitableBuilder<V1alpha3DeviceTaintRuleList,V1alpha3DeviceTaintRuleListBuilder>{
  public V1alpha3DeviceTaintRuleListBuilder() {
    this(new V1alpha3DeviceTaintRuleList());
  }
  
  public V1alpha3DeviceTaintRuleListBuilder(V1alpha3DeviceTaintRuleListFluent<?> fluent) {
    this(fluent, new V1alpha3DeviceTaintRuleList());
  }
  
  public V1alpha3DeviceTaintRuleListBuilder(V1alpha3DeviceTaintRuleListFluent<?> fluent,V1alpha3DeviceTaintRuleList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3DeviceTaintRuleListBuilder(V1alpha3DeviceTaintRuleList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3DeviceTaintRuleListFluent<?> fluent;
  
  public V1alpha3DeviceTaintRuleList build() {
    V1alpha3DeviceTaintRuleList buildable = new V1alpha3DeviceTaintRuleList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}