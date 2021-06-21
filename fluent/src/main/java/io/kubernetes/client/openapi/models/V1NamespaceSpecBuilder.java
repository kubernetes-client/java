package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1NamespaceSpecBuilder extends io.kubernetes.client.openapi.models.V1NamespaceSpecFluentImpl<io.kubernetes.client.openapi.models.V1NamespaceSpecBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1NamespaceSpec,io.kubernetes.client.openapi.models.V1NamespaceSpecBuilder> {

    io.kubernetes.client.openapi.models.V1NamespaceSpecFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1NamespaceSpecBuilder() {
        this(true);
    }

    public V1NamespaceSpecBuilder(java.lang.Boolean validationEnabled) {
        this(new V1NamespaceSpec(), validationEnabled);
    }

    public V1NamespaceSpecBuilder(io.kubernetes.client.openapi.models.V1NamespaceSpecFluent<?> fluent) {
        this(fluent, true);
    }

    public V1NamespaceSpecBuilder(io.kubernetes.client.openapi.models.V1NamespaceSpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1NamespaceSpec(), validationEnabled);
    }

    public V1NamespaceSpecBuilder(io.kubernetes.client.openapi.models.V1NamespaceSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1NamespaceSpec instance) {
        this(fluent, instance, true);
    }

    public V1NamespaceSpecBuilder(io.kubernetes.client.openapi.models.V1NamespaceSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1NamespaceSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withFinalizers(instance.getFinalizers());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1NamespaceSpecBuilder(io.kubernetes.client.openapi.models.V1NamespaceSpec instance) {
        this(instance,true);
    }

    public V1NamespaceSpecBuilder(io.kubernetes.client.openapi.models.V1NamespaceSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withFinalizers(instance.getFinalizers());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1NamespaceSpec build() {
        V1NamespaceSpec buildable = new V1NamespaceSpec();
        buildable.setFinalizers(fluent.getFinalizers());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1NamespaceSpecBuilder that = (V1NamespaceSpecBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
