package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ScopeSelectorBuilder extends V1ScopeSelectorFluent<V1ScopeSelectorBuilder> implements VisitableBuilder<V1ScopeSelector,V1ScopeSelectorBuilder>{
  public V1ScopeSelectorBuilder() {
    this(new V1ScopeSelector());
  }
  
  public V1ScopeSelectorBuilder(V1ScopeSelectorFluent<?> fluent) {
    this(fluent, new V1ScopeSelector());
  }
  
  public V1ScopeSelectorBuilder(V1ScopeSelectorFluent<?> fluent,V1ScopeSelector instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ScopeSelectorBuilder(V1ScopeSelector instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ScopeSelectorFluent<?> fluent;
  
  public V1ScopeSelector build() {
    V1ScopeSelector buildable = new V1ScopeSelector();
    buildable.setMatchExpressions(fluent.buildMatchExpressions());
    return buildable;
  }
  

}