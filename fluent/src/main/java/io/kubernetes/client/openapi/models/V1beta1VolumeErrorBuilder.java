package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1VolumeErrorBuilder extends io.kubernetes.client.openapi.models.V1beta1VolumeErrorFluentImpl<io.kubernetes.client.openapi.models.V1beta1VolumeErrorBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1VolumeError,io.kubernetes.client.openapi.models.V1beta1VolumeErrorBuilder> {

    io.kubernetes.client.openapi.models.V1beta1VolumeErrorFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1VolumeErrorBuilder() {
        this(true);
    }

    public V1beta1VolumeErrorBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1VolumeError(), validationEnabled);
    }

    public V1beta1VolumeErrorBuilder(io.kubernetes.client.openapi.models.V1beta1VolumeErrorFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1VolumeErrorBuilder(io.kubernetes.client.openapi.models.V1beta1VolumeErrorFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1VolumeError(), validationEnabled);
    }

    public V1beta1VolumeErrorBuilder(io.kubernetes.client.openapi.models.V1beta1VolumeErrorFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1VolumeError instance) {
        this(fluent, instance, true);
    }

    public V1beta1VolumeErrorBuilder(io.kubernetes.client.openapi.models.V1beta1VolumeErrorFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1VolumeError instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withMessage(instance.getMessage());
        
        fluent.withTime(instance.getTime());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1VolumeErrorBuilder(io.kubernetes.client.openapi.models.V1beta1VolumeError instance) {
        this(instance,true);
    }

    public V1beta1VolumeErrorBuilder(io.kubernetes.client.openapi.models.V1beta1VolumeError instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withMessage(instance.getMessage());
        
        this.withTime(instance.getTime());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1VolumeError build() {
        V1beta1VolumeError buildable = new V1beta1VolumeError();
        buildable.setMessage(fluent.getMessage());
        buildable.setTime(fluent.getTime());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1VolumeErrorBuilder that = (V1beta1VolumeErrorBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
