package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1SeccompProfileBuilder extends io.kubernetes.client.openapi.models.V1SeccompProfileFluentImpl<io.kubernetes.client.openapi.models.V1SeccompProfileBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1SeccompProfile,io.kubernetes.client.openapi.models.V1SeccompProfileBuilder> {

    io.kubernetes.client.openapi.models.V1SeccompProfileFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1SeccompProfileBuilder() {
        this(true);
    }

    public V1SeccompProfileBuilder(java.lang.Boolean validationEnabled) {
        this(new V1SeccompProfile(), validationEnabled);
    }

    public V1SeccompProfileBuilder(io.kubernetes.client.openapi.models.V1SeccompProfileFluent<?> fluent) {
        this(fluent, true);
    }

    public V1SeccompProfileBuilder(io.kubernetes.client.openapi.models.V1SeccompProfileFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1SeccompProfile(), validationEnabled);
    }

    public V1SeccompProfileBuilder(io.kubernetes.client.openapi.models.V1SeccompProfileFluent<?> fluent,io.kubernetes.client.openapi.models.V1SeccompProfile instance) {
        this(fluent, instance, true);
    }

    public V1SeccompProfileBuilder(io.kubernetes.client.openapi.models.V1SeccompProfileFluent<?> fluent,io.kubernetes.client.openapi.models.V1SeccompProfile instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withLocalhostProfile(instance.getLocalhostProfile());
        
        fluent.withType(instance.getType());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1SeccompProfileBuilder(io.kubernetes.client.openapi.models.V1SeccompProfile instance) {
        this(instance,true);
    }

    public V1SeccompProfileBuilder(io.kubernetes.client.openapi.models.V1SeccompProfile instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withLocalhostProfile(instance.getLocalhostProfile());
        
        this.withType(instance.getType());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1SeccompProfile build() {
        V1SeccompProfile buildable = new V1SeccompProfile();
        buildable.setLocalhostProfile(fluent.getLocalhostProfile());
        buildable.setType(fluent.getType());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1SeccompProfileBuilder that = (V1SeccompProfileBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
