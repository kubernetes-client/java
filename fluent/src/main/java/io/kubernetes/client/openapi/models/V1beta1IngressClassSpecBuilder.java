package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1IngressClassSpecBuilder extends io.kubernetes.client.openapi.models.V1beta1IngressClassSpecFluentImpl<io.kubernetes.client.openapi.models.V1beta1IngressClassSpecBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1IngressClassSpec,io.kubernetes.client.openapi.models.V1beta1IngressClassSpecBuilder> {

    io.kubernetes.client.openapi.models.V1beta1IngressClassSpecFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1IngressClassSpecBuilder() {
        this(true);
    }

    public V1beta1IngressClassSpecBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1IngressClassSpec(), validationEnabled);
    }

    public V1beta1IngressClassSpecBuilder(io.kubernetes.client.openapi.models.V1beta1IngressClassSpecFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1IngressClassSpecBuilder(io.kubernetes.client.openapi.models.V1beta1IngressClassSpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1IngressClassSpec(), validationEnabled);
    }

    public V1beta1IngressClassSpecBuilder(io.kubernetes.client.openapi.models.V1beta1IngressClassSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1IngressClassSpec instance) {
        this(fluent, instance, true);
    }

    public V1beta1IngressClassSpecBuilder(io.kubernetes.client.openapi.models.V1beta1IngressClassSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1IngressClassSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withController(instance.getController());
        
        fluent.withParameters(instance.getParameters());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1IngressClassSpecBuilder(io.kubernetes.client.openapi.models.V1beta1IngressClassSpec instance) {
        this(instance,true);
    }

    public V1beta1IngressClassSpecBuilder(io.kubernetes.client.openapi.models.V1beta1IngressClassSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withController(instance.getController());
        
        this.withParameters(instance.getParameters());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1IngressClassSpec build() {
        V1beta1IngressClassSpec buildable = new V1beta1IngressClassSpec();
        buildable.setController(fluent.getController());
        buildable.setParameters(fluent.getParameters());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1IngressClassSpecBuilder that = (V1beta1IngressClassSpecBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
