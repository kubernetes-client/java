package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1NodeConfigSourceBuilder extends io.kubernetes.client.openapi.models.V1NodeConfigSourceFluentImpl<io.kubernetes.client.openapi.models.V1NodeConfigSourceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1NodeConfigSource,io.kubernetes.client.openapi.models.V1NodeConfigSourceBuilder> {

    io.kubernetes.client.openapi.models.V1NodeConfigSourceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1NodeConfigSourceBuilder() {
        this(true);
    }

    public V1NodeConfigSourceBuilder(java.lang.Boolean validationEnabled) {
        this(new V1NodeConfigSource(), validationEnabled);
    }

    public V1NodeConfigSourceBuilder(io.kubernetes.client.openapi.models.V1NodeConfigSourceFluent<?> fluent) {
        this(fluent, true);
    }

    public V1NodeConfigSourceBuilder(io.kubernetes.client.openapi.models.V1NodeConfigSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1NodeConfigSource(), validationEnabled);
    }

    public V1NodeConfigSourceBuilder(io.kubernetes.client.openapi.models.V1NodeConfigSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1NodeConfigSource instance) {
        this(fluent, instance, true);
    }

    public V1NodeConfigSourceBuilder(io.kubernetes.client.openapi.models.V1NodeConfigSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1NodeConfigSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withConfigMap(instance.getConfigMap());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1NodeConfigSourceBuilder(io.kubernetes.client.openapi.models.V1NodeConfigSource instance) {
        this(instance,true);
    }

    public V1NodeConfigSourceBuilder(io.kubernetes.client.openapi.models.V1NodeConfigSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withConfigMap(instance.getConfigMap());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1NodeConfigSource build() {
        V1NodeConfigSource buildable = new V1NodeConfigSource();
        buildable.setConfigMap(fluent.getConfigMap());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1NodeConfigSourceBuilder that = (V1NodeConfigSourceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
