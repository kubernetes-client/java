package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1CSINodeDriverBuilder extends io.kubernetes.client.openapi.models.V1beta1CSINodeDriverFluentImpl<io.kubernetes.client.openapi.models.V1beta1CSINodeDriverBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1CSINodeDriver,io.kubernetes.client.openapi.models.V1beta1CSINodeDriverBuilder> {

    io.kubernetes.client.openapi.models.V1beta1CSINodeDriverFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1CSINodeDriverBuilder() {
        this(true);
    }

    public V1beta1CSINodeDriverBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1CSINodeDriver(), validationEnabled);
    }

    public V1beta1CSINodeDriverBuilder(io.kubernetes.client.openapi.models.V1beta1CSINodeDriverFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1CSINodeDriverBuilder(io.kubernetes.client.openapi.models.V1beta1CSINodeDriverFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1CSINodeDriver(), validationEnabled);
    }

    public V1beta1CSINodeDriverBuilder(io.kubernetes.client.openapi.models.V1beta1CSINodeDriverFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1CSINodeDriver instance) {
        this(fluent, instance, true);
    }

    public V1beta1CSINodeDriverBuilder(io.kubernetes.client.openapi.models.V1beta1CSINodeDriverFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1CSINodeDriver instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withAllocatable(instance.getAllocatable());
        
        fluent.withName(instance.getName());
        
        fluent.withNodeID(instance.getNodeID());
        
        fluent.withTopologyKeys(instance.getTopologyKeys());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1CSINodeDriverBuilder(io.kubernetes.client.openapi.models.V1beta1CSINodeDriver instance) {
        this(instance,true);
    }

    public V1beta1CSINodeDriverBuilder(io.kubernetes.client.openapi.models.V1beta1CSINodeDriver instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withAllocatable(instance.getAllocatable());
        
        this.withName(instance.getName());
        
        this.withNodeID(instance.getNodeID());
        
        this.withTopologyKeys(instance.getTopologyKeys());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1CSINodeDriver build() {
        V1beta1CSINodeDriver buildable = new V1beta1CSINodeDriver();
        buildable.setAllocatable(fluent.getAllocatable());
        buildable.setName(fluent.getName());
        buildable.setNodeID(fluent.getNodeID());
        buildable.setTopologyKeys(fluent.getTopologyKeys());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1CSINodeDriverBuilder that = (V1beta1CSINodeDriverBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
