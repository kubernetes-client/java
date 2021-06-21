package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1HTTPIngressPathBuilder extends io.kubernetes.client.openapi.models.V1HTTPIngressPathFluentImpl<io.kubernetes.client.openapi.models.V1HTTPIngressPathBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1HTTPIngressPath,io.kubernetes.client.openapi.models.V1HTTPIngressPathBuilder> {

    io.kubernetes.client.openapi.models.V1HTTPIngressPathFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1HTTPIngressPathBuilder() {
        this(true);
    }

    public V1HTTPIngressPathBuilder(java.lang.Boolean validationEnabled) {
        this(new V1HTTPIngressPath(), validationEnabled);
    }

    public V1HTTPIngressPathBuilder(io.kubernetes.client.openapi.models.V1HTTPIngressPathFluent<?> fluent) {
        this(fluent, true);
    }

    public V1HTTPIngressPathBuilder(io.kubernetes.client.openapi.models.V1HTTPIngressPathFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1HTTPIngressPath(), validationEnabled);
    }

    public V1HTTPIngressPathBuilder(io.kubernetes.client.openapi.models.V1HTTPIngressPathFluent<?> fluent,io.kubernetes.client.openapi.models.V1HTTPIngressPath instance) {
        this(fluent, instance, true);
    }

    public V1HTTPIngressPathBuilder(io.kubernetes.client.openapi.models.V1HTTPIngressPathFluent<?> fluent,io.kubernetes.client.openapi.models.V1HTTPIngressPath instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withBackend(instance.getBackend());
        
        fluent.withPath(instance.getPath());
        
        fluent.withPathType(instance.getPathType());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1HTTPIngressPathBuilder(io.kubernetes.client.openapi.models.V1HTTPIngressPath instance) {
        this(instance,true);
    }

    public V1HTTPIngressPathBuilder(io.kubernetes.client.openapi.models.V1HTTPIngressPath instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withBackend(instance.getBackend());
        
        this.withPath(instance.getPath());
        
        this.withPathType(instance.getPathType());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1HTTPIngressPath build() {
        V1HTTPIngressPath buildable = new V1HTTPIngressPath();
        buildable.setBackend(fluent.getBackend());
        buildable.setPath(fluent.getPath());
        buildable.setPathType(fluent.getPathType());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1HTTPIngressPathBuilder that = (V1HTTPIngressPathBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
