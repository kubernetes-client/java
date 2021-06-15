package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1ObjectFieldSelectorBuilder extends io.kubernetes.client.openapi.models.V1ObjectFieldSelectorFluentImpl<io.kubernetes.client.openapi.models.V1ObjectFieldSelectorBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1ObjectFieldSelector,io.kubernetes.client.openapi.models.V1ObjectFieldSelectorBuilder> {

    io.kubernetes.client.openapi.models.V1ObjectFieldSelectorFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1ObjectFieldSelectorBuilder() {
        this(true);
    }

    public V1ObjectFieldSelectorBuilder(java.lang.Boolean validationEnabled) {
        this(new V1ObjectFieldSelector(), validationEnabled);
    }

    public V1ObjectFieldSelectorBuilder(io.kubernetes.client.openapi.models.V1ObjectFieldSelectorFluent<?> fluent) {
        this(fluent, true);
    }

    public V1ObjectFieldSelectorBuilder(io.kubernetes.client.openapi.models.V1ObjectFieldSelectorFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1ObjectFieldSelector(), validationEnabled);
    }

    public V1ObjectFieldSelectorBuilder(io.kubernetes.client.openapi.models.V1ObjectFieldSelectorFluent<?> fluent,io.kubernetes.client.openapi.models.V1ObjectFieldSelector instance) {
        this(fluent, instance, true);
    }

    public V1ObjectFieldSelectorBuilder(io.kubernetes.client.openapi.models.V1ObjectFieldSelectorFluent<?> fluent,io.kubernetes.client.openapi.models.V1ObjectFieldSelector instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withApiVersion(instance.getApiVersion());
        
        fluent.withFieldPath(instance.getFieldPath());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1ObjectFieldSelectorBuilder(io.kubernetes.client.openapi.models.V1ObjectFieldSelector instance) {
        this(instance,true);
    }

    public V1ObjectFieldSelectorBuilder(io.kubernetes.client.openapi.models.V1ObjectFieldSelector instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withApiVersion(instance.getApiVersion());
        
        this.withFieldPath(instance.getFieldPath());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1ObjectFieldSelector build() {
        V1ObjectFieldSelector buildable = new V1ObjectFieldSelector();
        buildable.setApiVersion(fluent.getApiVersion());
        buildable.setFieldPath(fluent.getFieldPath());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1ObjectFieldSelectorBuilder that = (V1ObjectFieldSelectorBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
