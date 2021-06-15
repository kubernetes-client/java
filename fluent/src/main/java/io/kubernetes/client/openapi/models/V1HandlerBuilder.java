package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1HandlerBuilder extends io.kubernetes.client.openapi.models.V1HandlerFluentImpl<io.kubernetes.client.openapi.models.V1HandlerBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1Handler,io.kubernetes.client.openapi.models.V1HandlerBuilder> {

    io.kubernetes.client.openapi.models.V1HandlerFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1HandlerBuilder() {
        this(true);
    }

    public V1HandlerBuilder(java.lang.Boolean validationEnabled) {
        this(new V1Handler(), validationEnabled);
    }

    public V1HandlerBuilder(io.kubernetes.client.openapi.models.V1HandlerFluent<?> fluent) {
        this(fluent, true);
    }

    public V1HandlerBuilder(io.kubernetes.client.openapi.models.V1HandlerFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1Handler(), validationEnabled);
    }

    public V1HandlerBuilder(io.kubernetes.client.openapi.models.V1HandlerFluent<?> fluent,io.kubernetes.client.openapi.models.V1Handler instance) {
        this(fluent, instance, true);
    }

    public V1HandlerBuilder(io.kubernetes.client.openapi.models.V1HandlerFluent<?> fluent,io.kubernetes.client.openapi.models.V1Handler instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withExec(instance.getExec());
        
        fluent.withHttpGet(instance.getHttpGet());
        
        fluent.withTcpSocket(instance.getTcpSocket());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1HandlerBuilder(io.kubernetes.client.openapi.models.V1Handler instance) {
        this(instance,true);
    }

    public V1HandlerBuilder(io.kubernetes.client.openapi.models.V1Handler instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withExec(instance.getExec());
        
        this.withHttpGet(instance.getHttpGet());
        
        this.withTcpSocket(instance.getTcpSocket());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1Handler build() {
        V1Handler buildable = new V1Handler();
        buildable.setExec(fluent.getExec());
        buildable.setHttpGet(fluent.getHttpGet());
        buildable.setTcpSocket(fluent.getTcpSocket());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1HandlerBuilder that = (V1HandlerBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
