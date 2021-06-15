package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1CSINodeDriverBuilder extends io.kubernetes.client.openapi.models.V1CSINodeDriverFluentImpl<io.kubernetes.client.openapi.models.V1CSINodeDriverBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1CSINodeDriver,io.kubernetes.client.openapi.models.V1CSINodeDriverBuilder> {

    io.kubernetes.client.openapi.models.V1CSINodeDriverFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1CSINodeDriverBuilder() {
        this(true);
    }

    public V1CSINodeDriverBuilder(java.lang.Boolean validationEnabled) {
        this(new V1CSINodeDriver(), validationEnabled);
    }

    public V1CSINodeDriverBuilder(io.kubernetes.client.openapi.models.V1CSINodeDriverFluent<?> fluent) {
        this(fluent, true);
    }

    public V1CSINodeDriverBuilder(io.kubernetes.client.openapi.models.V1CSINodeDriverFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1CSINodeDriver(), validationEnabled);
    }

    public V1CSINodeDriverBuilder(io.kubernetes.client.openapi.models.V1CSINodeDriverFluent<?> fluent,io.kubernetes.client.openapi.models.V1CSINodeDriver instance) {
        this(fluent, instance, true);
    }

    public V1CSINodeDriverBuilder(io.kubernetes.client.openapi.models.V1CSINodeDriverFluent<?> fluent,io.kubernetes.client.openapi.models.V1CSINodeDriver instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withAllocatable(instance.getAllocatable());
        
        fluent.withName(instance.getName());
        
        fluent.withNodeID(instance.getNodeID());
        
        fluent.withTopologyKeys(instance.getTopologyKeys());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1CSINodeDriverBuilder(io.kubernetes.client.openapi.models.V1CSINodeDriver instance) {
        this(instance,true);
    }

    public V1CSINodeDriverBuilder(io.kubernetes.client.openapi.models.V1CSINodeDriver instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withAllocatable(instance.getAllocatable());
        
        this.withName(instance.getName());
        
        this.withNodeID(instance.getNodeID());
        
        this.withTopologyKeys(instance.getTopologyKeys());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1CSINodeDriver build() {
        V1CSINodeDriver buildable = new V1CSINodeDriver();
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
        V1CSINodeDriverBuilder that = (V1CSINodeDriverBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
