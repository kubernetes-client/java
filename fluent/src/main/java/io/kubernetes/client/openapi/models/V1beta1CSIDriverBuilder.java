package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1CSIDriverBuilder extends io.kubernetes.client.openapi.models.V1beta1CSIDriverFluentImpl<io.kubernetes.client.openapi.models.V1beta1CSIDriverBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1CSIDriver,io.kubernetes.client.openapi.models.V1beta1CSIDriverBuilder> {

    io.kubernetes.client.openapi.models.V1beta1CSIDriverFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1CSIDriverBuilder() {
        this(true);
    }

    public V1beta1CSIDriverBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1CSIDriver(), validationEnabled);
    }

    public V1beta1CSIDriverBuilder(io.kubernetes.client.openapi.models.V1beta1CSIDriverFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1CSIDriverBuilder(io.kubernetes.client.openapi.models.V1beta1CSIDriverFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1CSIDriver(), validationEnabled);
    }

    public V1beta1CSIDriverBuilder(io.kubernetes.client.openapi.models.V1beta1CSIDriverFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1CSIDriver instance) {
        this(fluent, instance, true);
    }

    public V1beta1CSIDriverBuilder(io.kubernetes.client.openapi.models.V1beta1CSIDriverFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1CSIDriver instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withApiVersion(instance.getApiVersion());
        
        fluent.withKind(instance.getKind());
        
        fluent.withMetadata(instance.getMetadata());
        
        fluent.withSpec(instance.getSpec());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1CSIDriverBuilder(io.kubernetes.client.openapi.models.V1beta1CSIDriver instance) {
        this(instance,true);
    }

    public V1beta1CSIDriverBuilder(io.kubernetes.client.openapi.models.V1beta1CSIDriver instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withApiVersion(instance.getApiVersion());
        
        this.withKind(instance.getKind());
        
        this.withMetadata(instance.getMetadata());
        
        this.withSpec(instance.getSpec());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1CSIDriver build() {
        V1beta1CSIDriver buildable = new V1beta1CSIDriver();
        buildable.setApiVersion(fluent.getApiVersion());
        buildable.setKind(fluent.getKind());
        buildable.setMetadata(fluent.getMetadata());
        buildable.setSpec(fluent.getSpec());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1CSIDriverBuilder that = (V1beta1CSIDriverBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
