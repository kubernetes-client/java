package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ScopeSelectorBuilder extends V1ScopeSelectorFluentImpl<V1ScopeSelectorBuilder> implements VisitableBuilder<V1ScopeSelector,V1ScopeSelectorBuilder>{
  public V1ScopeSelectorBuilder() {
    this(false);
  }
  public V1ScopeSelectorBuilder(Boolean validationEnabled) {
    this(new V1ScopeSelector(), validationEnabled);
  }
  public V1ScopeSelectorBuilder(V1ScopeSelectorFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ScopeSelectorBuilder(V1ScopeSelectorFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ScopeSelector(), validationEnabled);
  }
  public V1ScopeSelectorBuilder(V1ScopeSelectorFluent<?> fluent,V1ScopeSelector instance) {
    this(fluent, instance, false);
  }
  public V1ScopeSelectorBuilder(V1ScopeSelectorFluent<?> fluent,V1ScopeSelector instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withMatchExpressions(instance.getMatchExpressions());

    this.validationEnabled = validationEnabled; 
  }
  public V1ScopeSelectorBuilder(V1ScopeSelector instance) {
    this(instance,false);
  }
  public V1ScopeSelectorBuilder(V1ScopeSelector instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withMatchExpressions(instance.getMatchExpressions());

    this.validationEnabled = validationEnabled; 
  }
  V1ScopeSelectorFluent<?> fluent;
  Boolean validationEnabled;
  public V1ScopeSelector build() {
    V1ScopeSelector buildable = new V1ScopeSelector();
    buildable.setMatchExpressions(fluent.getMatchExpressions());
    return buildable;
  }
  
}