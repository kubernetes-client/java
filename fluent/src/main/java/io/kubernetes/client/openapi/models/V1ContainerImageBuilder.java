package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1ContainerImageBuilder extends io.kubernetes.client.openapi.models.V1ContainerImageFluentImpl<io.kubernetes.client.openapi.models.V1ContainerImageBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1ContainerImage,io.kubernetes.client.openapi.models.V1ContainerImageBuilder> {

    io.kubernetes.client.openapi.models.V1ContainerImageFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1ContainerImageBuilder() {
        this(true);
    }

    public V1ContainerImageBuilder(java.lang.Boolean validationEnabled) {
        this(new V1ContainerImage(), validationEnabled);
    }

    public V1ContainerImageBuilder(io.kubernetes.client.openapi.models.V1ContainerImageFluent<?> fluent) {
        this(fluent, true);
    }

    public V1ContainerImageBuilder(io.kubernetes.client.openapi.models.V1ContainerImageFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1ContainerImage(), validationEnabled);
    }

    public V1ContainerImageBuilder(io.kubernetes.client.openapi.models.V1ContainerImageFluent<?> fluent,io.kubernetes.client.openapi.models.V1ContainerImage instance) {
        this(fluent, instance, true);
    }

    public V1ContainerImageBuilder(io.kubernetes.client.openapi.models.V1ContainerImageFluent<?> fluent,io.kubernetes.client.openapi.models.V1ContainerImage instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withNames(instance.getNames());
        
        fluent.withSizeBytes(instance.getSizeBytes());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1ContainerImageBuilder(io.kubernetes.client.openapi.models.V1ContainerImage instance) {
        this(instance,true);
    }

    public V1ContainerImageBuilder(io.kubernetes.client.openapi.models.V1ContainerImage instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withNames(instance.getNames());
        
        this.withSizeBytes(instance.getSizeBytes());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1ContainerImage build() {
        V1ContainerImage buildable = new V1ContainerImage();
        buildable.setNames(fluent.getNames());
        buildable.setSizeBytes(fluent.getSizeBytes());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1ContainerImageBuilder that = (V1ContainerImageBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
