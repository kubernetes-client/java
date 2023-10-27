package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1MatchResourcesBuilder extends V1alpha1MatchResourcesFluent<V1alpha1MatchResourcesBuilder> implements VisitableBuilder<V1alpha1MatchResources,V1alpha1MatchResourcesBuilder>{
  public V1alpha1MatchResourcesBuilder() {
    this(new V1alpha1MatchResources());
  }
  
  public V1alpha1MatchResourcesBuilder(V1alpha1MatchResourcesFluent<?> fluent) {
    this(fluent, new V1alpha1MatchResources());
  }
  
  public V1alpha1MatchResourcesBuilder(V1alpha1MatchResourcesFluent<?> fluent,V1alpha1MatchResources instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1MatchResourcesBuilder(V1alpha1MatchResources instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1MatchResourcesFluent<?> fluent;
  
  public V1alpha1MatchResources build() {
    V1alpha1MatchResources buildable = new V1alpha1MatchResources();
    buildable.setExcludeResourceRules(fluent.buildExcludeResourceRules());
    buildable.setMatchPolicy(fluent.getMatchPolicy());
    buildable.setNamespaceSelector(fluent.buildNamespaceSelector());
    buildable.setObjectSelector(fluent.buildObjectSelector());
    buildable.setResourceRules(fluent.buildResourceRules());
    return buildable;
  }
  

}