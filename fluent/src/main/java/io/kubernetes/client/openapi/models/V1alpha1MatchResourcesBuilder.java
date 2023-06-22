package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha1MatchResourcesBuilder extends V1alpha1MatchResourcesFluentImpl<V1alpha1MatchResourcesBuilder> implements VisitableBuilder<V1alpha1MatchResources,V1alpha1MatchResourcesBuilder>{
  public V1alpha1MatchResourcesBuilder() {
    this(false);
  }
  public V1alpha1MatchResourcesBuilder(Boolean validationEnabled) {
    this(new V1alpha1MatchResources(), validationEnabled);
  }
  public V1alpha1MatchResourcesBuilder(V1alpha1MatchResourcesFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha1MatchResourcesBuilder(V1alpha1MatchResourcesFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha1MatchResources(), validationEnabled);
  }
  public V1alpha1MatchResourcesBuilder(V1alpha1MatchResourcesFluent<?> fluent,V1alpha1MatchResources instance) {
    this(fluent, instance, false);
  }
  public V1alpha1MatchResourcesBuilder(V1alpha1MatchResourcesFluent<?> fluent,V1alpha1MatchResources instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withExcludeResourceRules(instance.getExcludeResourceRules());
      fluent.withMatchPolicy(instance.getMatchPolicy());
      fluent.withNamespaceSelector(instance.getNamespaceSelector());
      fluent.withObjectSelector(instance.getObjectSelector());
      fluent.withResourceRules(instance.getResourceRules());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha1MatchResourcesBuilder(V1alpha1MatchResources instance) {
    this(instance,false);
  }
  public V1alpha1MatchResourcesBuilder(V1alpha1MatchResources instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withExcludeResourceRules(instance.getExcludeResourceRules());
      this.withMatchPolicy(instance.getMatchPolicy());
      this.withNamespaceSelector(instance.getNamespaceSelector());
      this.withObjectSelector(instance.getObjectSelector());
      this.withResourceRules(instance.getResourceRules());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha1MatchResourcesFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha1MatchResources build() {
    V1alpha1MatchResources buildable = new V1alpha1MatchResources();
    buildable.setExcludeResourceRules(fluent.getExcludeResourceRules());
    buildable.setMatchPolicy(fluent.getMatchPolicy());
    buildable.setNamespaceSelector(fluent.getNamespaceSelector());
    buildable.setObjectSelector(fluent.getObjectSelector());
    buildable.setResourceRules(fluent.getResourceRules());
    return buildable;
  }
  
}