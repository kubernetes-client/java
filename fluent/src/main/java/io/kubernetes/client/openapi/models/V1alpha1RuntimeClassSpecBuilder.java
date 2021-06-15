package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1alpha1RuntimeClassSpecBuilder extends io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluentImpl<io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpec,io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecBuilder> {

    io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1alpha1RuntimeClassSpecBuilder() {
        this(true);
    }

    public V1alpha1RuntimeClassSpecBuilder(java.lang.Boolean validationEnabled) {
        this(new V1alpha1RuntimeClassSpec(), validationEnabled);
    }

    public V1alpha1RuntimeClassSpecBuilder(io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent<?> fluent) {
        this(fluent, true);
    }

    public V1alpha1RuntimeClassSpecBuilder(io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1alpha1RuntimeClassSpec(), validationEnabled);
    }

    public V1alpha1RuntimeClassSpecBuilder(io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpec instance) {
        this(fluent, instance, true);
    }

    public V1alpha1RuntimeClassSpecBuilder(io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withOverhead(instance.getOverhead());
        
        fluent.withRuntimeHandler(instance.getRuntimeHandler());
        
        fluent.withScheduling(instance.getScheduling());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1alpha1RuntimeClassSpecBuilder(io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpec instance) {
        this(instance,true);
    }

    public V1alpha1RuntimeClassSpecBuilder(io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withOverhead(instance.getOverhead());
        
        this.withRuntimeHandler(instance.getRuntimeHandler());
        
        this.withScheduling(instance.getScheduling());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpec build() {
        V1alpha1RuntimeClassSpec buildable = new V1alpha1RuntimeClassSpec();
        buildable.setOverhead(fluent.getOverhead());
        buildable.setRuntimeHandler(fluent.getRuntimeHandler());
        buildable.setScheduling(fluent.getScheduling());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1alpha1RuntimeClassSpecBuilder that = (V1alpha1RuntimeClassSpecBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
