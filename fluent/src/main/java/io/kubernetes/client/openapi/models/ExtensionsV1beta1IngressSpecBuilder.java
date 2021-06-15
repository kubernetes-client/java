package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class ExtensionsV1beta1IngressSpecBuilder extends io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressSpecFluentImpl<io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressSpecBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressSpec,io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressSpecBuilder> {

    io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressSpecFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public ExtensionsV1beta1IngressSpecBuilder() {
        this(true);
    }

    public ExtensionsV1beta1IngressSpecBuilder(java.lang.Boolean validationEnabled) {
        this(new ExtensionsV1beta1IngressSpec(), validationEnabled);
    }

    public ExtensionsV1beta1IngressSpecBuilder(io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressSpecFluent<?> fluent) {
        this(fluent, true);
    }

    public ExtensionsV1beta1IngressSpecBuilder(io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressSpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new ExtensionsV1beta1IngressSpec(), validationEnabled);
    }

    public ExtensionsV1beta1IngressSpecBuilder(io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressSpecFluent<?> fluent,io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressSpec instance) {
        this(fluent, instance, true);
    }

    public ExtensionsV1beta1IngressSpecBuilder(io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressSpecFluent<?> fluent,io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withBackend(instance.getBackend());
        
        fluent.withIngressClassName(instance.getIngressClassName());
        
        fluent.withRules(instance.getRules());
        
        fluent.withTls(instance.getTls());
        
        this.validationEnabled = validationEnabled; 
    }

    public ExtensionsV1beta1IngressSpecBuilder(io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressSpec instance) {
        this(instance,true);
    }

    public ExtensionsV1beta1IngressSpecBuilder(io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withBackend(instance.getBackend());
        
        this.withIngressClassName(instance.getIngressClassName());
        
        this.withRules(instance.getRules());
        
        this.withTls(instance.getTls());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressSpec build() {
        ExtensionsV1beta1IngressSpec buildable = new ExtensionsV1beta1IngressSpec();
        buildable.setBackend(fluent.getBackend());
        buildable.setIngressClassName(fluent.getIngressClassName());
        buildable.setRules(fluent.getRules());
        buildable.setTls(fluent.getTls());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ExtensionsV1beta1IngressSpecBuilder that = (ExtensionsV1beta1IngressSpecBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
