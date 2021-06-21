package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1ScopeSelectorBuilder extends io.kubernetes.client.openapi.models.V1ScopeSelectorFluentImpl<io.kubernetes.client.openapi.models.V1ScopeSelectorBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1ScopeSelector,io.kubernetes.client.openapi.models.V1ScopeSelectorBuilder> {

    io.kubernetes.client.openapi.models.V1ScopeSelectorFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1ScopeSelectorBuilder() {
        this(true);
    }

    public V1ScopeSelectorBuilder(java.lang.Boolean validationEnabled) {
        this(new V1ScopeSelector(), validationEnabled);
    }

    public V1ScopeSelectorBuilder(io.kubernetes.client.openapi.models.V1ScopeSelectorFluent<?> fluent) {
        this(fluent, true);
    }

    public V1ScopeSelectorBuilder(io.kubernetes.client.openapi.models.V1ScopeSelectorFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1ScopeSelector(), validationEnabled);
    }

    public V1ScopeSelectorBuilder(io.kubernetes.client.openapi.models.V1ScopeSelectorFluent<?> fluent,io.kubernetes.client.openapi.models.V1ScopeSelector instance) {
        this(fluent, instance, true);
    }

    public V1ScopeSelectorBuilder(io.kubernetes.client.openapi.models.V1ScopeSelectorFluent<?> fluent,io.kubernetes.client.openapi.models.V1ScopeSelector instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withMatchExpressions(instance.getMatchExpressions());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1ScopeSelectorBuilder(io.kubernetes.client.openapi.models.V1ScopeSelector instance) {
        this(instance,true);
    }

    public V1ScopeSelectorBuilder(io.kubernetes.client.openapi.models.V1ScopeSelector instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withMatchExpressions(instance.getMatchExpressions());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1ScopeSelector build() {
        V1ScopeSelector buildable = new V1ScopeSelector();
        buildable.setMatchExpressions(fluent.getMatchExpressions());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1ScopeSelectorBuilder that = (V1ScopeSelectorBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
