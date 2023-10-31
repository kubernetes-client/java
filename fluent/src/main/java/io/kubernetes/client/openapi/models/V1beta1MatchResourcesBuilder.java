package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1MatchResourcesBuilder extends V1beta1MatchResourcesFluent<V1beta1MatchResourcesBuilder> implements VisitableBuilder<V1beta1MatchResources,V1beta1MatchResourcesBuilder>{
  public V1beta1MatchResourcesBuilder() {
    this(new V1beta1MatchResources());
  }
  
  public V1beta1MatchResourcesBuilder(V1beta1MatchResourcesFluent<?> fluent) {
    this(fluent, new V1beta1MatchResources());
  }
  
  public V1beta1MatchResourcesBuilder(V1beta1MatchResourcesFluent<?> fluent,V1beta1MatchResources instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1MatchResourcesBuilder(V1beta1MatchResources instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1MatchResourcesFluent<?> fluent;
  
  public V1beta1MatchResources build() {
    V1beta1MatchResources buildable = new V1beta1MatchResources();
    buildable.setExcludeResourceRules(fluent.buildExcludeResourceRules());
    buildable.setMatchPolicy(fluent.getMatchPolicy());
    buildable.setNamespaceSelector(fluent.buildNamespaceSelector());
    buildable.setObjectSelector(fluent.buildObjectSelector());
    buildable.setResourceRules(fluent.buildResourceRules());
    return buildable;
  }
  

}