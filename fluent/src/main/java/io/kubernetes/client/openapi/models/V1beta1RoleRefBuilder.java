package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1RoleRefBuilder extends io.kubernetes.client.openapi.models.V1beta1RoleRefFluentImpl<io.kubernetes.client.openapi.models.V1beta1RoleRefBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1RoleRef,io.kubernetes.client.openapi.models.V1beta1RoleRefBuilder> {

    io.kubernetes.client.openapi.models.V1beta1RoleRefFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1RoleRefBuilder() {
        this(true);
    }

    public V1beta1RoleRefBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1RoleRef(), validationEnabled);
    }

    public V1beta1RoleRefBuilder(io.kubernetes.client.openapi.models.V1beta1RoleRefFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1RoleRefBuilder(io.kubernetes.client.openapi.models.V1beta1RoleRefFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1RoleRef(), validationEnabled);
    }

    public V1beta1RoleRefBuilder(io.kubernetes.client.openapi.models.V1beta1RoleRefFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1RoleRef instance) {
        this(fluent, instance, true);
    }

    public V1beta1RoleRefBuilder(io.kubernetes.client.openapi.models.V1beta1RoleRefFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1RoleRef instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withApiGroup(instance.getApiGroup());
        
        fluent.withKind(instance.getKind());
        
        fluent.withName(instance.getName());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1RoleRefBuilder(io.kubernetes.client.openapi.models.V1beta1RoleRef instance) {
        this(instance,true);
    }

    public V1beta1RoleRefBuilder(io.kubernetes.client.openapi.models.V1beta1RoleRef instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withApiGroup(instance.getApiGroup());
        
        this.withKind(instance.getKind());
        
        this.withName(instance.getName());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1RoleRef build() {
        V1beta1RoleRef buildable = new V1beta1RoleRef();
        buildable.setApiGroup(fluent.getApiGroup());
        buildable.setKind(fluent.getKind());
        buildable.setName(fluent.getName());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1RoleRefBuilder that = (V1beta1RoleRefBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
