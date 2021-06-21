package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V2beta1MetricSpecBuilder extends io.kubernetes.client.openapi.models.V2beta1MetricSpecFluentImpl<io.kubernetes.client.openapi.models.V2beta1MetricSpecBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2beta1MetricSpec,io.kubernetes.client.openapi.models.V2beta1MetricSpecBuilder> {

    io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V2beta1MetricSpecBuilder() {
        this(true);
    }

    public V2beta1MetricSpecBuilder(java.lang.Boolean validationEnabled) {
        this(new V2beta1MetricSpec(), validationEnabled);
    }

    public V2beta1MetricSpecBuilder(io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent<?> fluent) {
        this(fluent, true);
    }

    public V2beta1MetricSpecBuilder(io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V2beta1MetricSpec(), validationEnabled);
    }

    public V2beta1MetricSpecBuilder(io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta1MetricSpec instance) {
        this(fluent, instance, true);
    }

    public V2beta1MetricSpecBuilder(io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta1MetricSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withContainerResource(instance.getContainerResource());
        
        fluent.withExternal(instance.getExternal());
        
        fluent.withObject(instance.getObject());
        
        fluent.withPods(instance.getPods());
        
        fluent.withResource(instance.getResource());
        
        fluent.withType(instance.getType());
        
        this.validationEnabled = validationEnabled; 
    }

    public V2beta1MetricSpecBuilder(io.kubernetes.client.openapi.models.V2beta1MetricSpec instance) {
        this(instance,true);
    }

    public V2beta1MetricSpecBuilder(io.kubernetes.client.openapi.models.V2beta1MetricSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withContainerResource(instance.getContainerResource());
        
        this.withExternal(instance.getExternal());
        
        this.withObject(instance.getObject());
        
        this.withPods(instance.getPods());
        
        this.withResource(instance.getResource());
        
        this.withType(instance.getType());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V2beta1MetricSpec build() {
        V2beta1MetricSpec buildable = new V2beta1MetricSpec();
        buildable.setContainerResource(fluent.getContainerResource());
        buildable.setExternal(fluent.getExternal());
        buildable.setObject(fluent.getObject());
        buildable.setPods(fluent.getPods());
        buildable.setResource(fluent.getResource());
        buildable.setType(fluent.getType());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V2beta1MetricSpecBuilder that = (V2beta1MetricSpecBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
