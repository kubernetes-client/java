package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V2beta2MetricSpecBuilder extends io.kubernetes.client.openapi.models.V2beta2MetricSpecFluentImpl<io.kubernetes.client.openapi.models.V2beta2MetricSpecBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2beta2MetricSpec,io.kubernetes.client.openapi.models.V2beta2MetricSpecBuilder> {

    io.kubernetes.client.openapi.models.V2beta2MetricSpecFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V2beta2MetricSpecBuilder() {
        this(true);
    }

    public V2beta2MetricSpecBuilder(java.lang.Boolean validationEnabled) {
        this(new V2beta2MetricSpec(), validationEnabled);
    }

    public V2beta2MetricSpecBuilder(io.kubernetes.client.openapi.models.V2beta2MetricSpecFluent<?> fluent) {
        this(fluent, true);
    }

    public V2beta2MetricSpecBuilder(io.kubernetes.client.openapi.models.V2beta2MetricSpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V2beta2MetricSpec(), validationEnabled);
    }

    public V2beta2MetricSpecBuilder(io.kubernetes.client.openapi.models.V2beta2MetricSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta2MetricSpec instance) {
        this(fluent, instance, true);
    }

    public V2beta2MetricSpecBuilder(io.kubernetes.client.openapi.models.V2beta2MetricSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta2MetricSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withContainerResource(instance.getContainerResource());
        
        fluent.withExternal(instance.getExternal());
        
        fluent.withObject(instance.getObject());
        
        fluent.withPods(instance.getPods());
        
        fluent.withResource(instance.getResource());
        
        fluent.withType(instance.getType());
        
        this.validationEnabled = validationEnabled; 
    }

    public V2beta2MetricSpecBuilder(io.kubernetes.client.openapi.models.V2beta2MetricSpec instance) {
        this(instance,true);
    }

    public V2beta2MetricSpecBuilder(io.kubernetes.client.openapi.models.V2beta2MetricSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withContainerResource(instance.getContainerResource());
        
        this.withExternal(instance.getExternal());
        
        this.withObject(instance.getObject());
        
        this.withPods(instance.getPods());
        
        this.withResource(instance.getResource());
        
        this.withType(instance.getType());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V2beta2MetricSpec build() {
        V2beta2MetricSpec buildable = new V2beta2MetricSpec();
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
        V2beta2MetricSpecBuilder that = (V2beta2MetricSpecBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
