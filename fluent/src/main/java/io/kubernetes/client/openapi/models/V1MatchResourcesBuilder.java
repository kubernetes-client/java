package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1MatchResourcesBuilder extends V1MatchResourcesFluent<V1MatchResourcesBuilder> implements VisitableBuilder<V1MatchResources,V1MatchResourcesBuilder>{
  public V1MatchResourcesBuilder() {
    this(new V1MatchResources());
  }
  
  public V1MatchResourcesBuilder(V1MatchResourcesFluent<?> fluent) {
    this(fluent, new V1MatchResources());
  }
  
  public V1MatchResourcesBuilder(V1MatchResourcesFluent<?> fluent,V1MatchResources instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1MatchResourcesBuilder(V1MatchResources instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1MatchResourcesFluent<?> fluent;
  
  public V1MatchResources build() {
    V1MatchResources buildable = new V1MatchResources();
    buildable.setExcludeResourceRules(fluent.buildExcludeResourceRules());
    buildable.setMatchPolicy(fluent.getMatchPolicy());
    buildable.setNamespaceSelector(fluent.buildNamespaceSelector());
    buildable.setObjectSelector(fluent.buildObjectSelector());
    buildable.setResourceRules(fluent.buildResourceRules());
    return buildable;
  }
  

}