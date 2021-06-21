package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1TCPSocketActionBuilder extends io.kubernetes.client.openapi.models.V1TCPSocketActionFluentImpl<io.kubernetes.client.openapi.models.V1TCPSocketActionBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1TCPSocketAction,io.kubernetes.client.openapi.models.V1TCPSocketActionBuilder> {

    io.kubernetes.client.openapi.models.V1TCPSocketActionFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1TCPSocketActionBuilder() {
        this(true);
    }

    public V1TCPSocketActionBuilder(java.lang.Boolean validationEnabled) {
        this(new V1TCPSocketAction(), validationEnabled);
    }

    public V1TCPSocketActionBuilder(io.kubernetes.client.openapi.models.V1TCPSocketActionFluent<?> fluent) {
        this(fluent, true);
    }

    public V1TCPSocketActionBuilder(io.kubernetes.client.openapi.models.V1TCPSocketActionFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1TCPSocketAction(), validationEnabled);
    }

    public V1TCPSocketActionBuilder(io.kubernetes.client.openapi.models.V1TCPSocketActionFluent<?> fluent,io.kubernetes.client.openapi.models.V1TCPSocketAction instance) {
        this(fluent, instance, true);
    }

    public V1TCPSocketActionBuilder(io.kubernetes.client.openapi.models.V1TCPSocketActionFluent<?> fluent,io.kubernetes.client.openapi.models.V1TCPSocketAction instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withHost(instance.getHost());
        
        fluent.withPort(instance.getPort());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1TCPSocketActionBuilder(io.kubernetes.client.openapi.models.V1TCPSocketAction instance) {
        this(instance,true);
    }

    public V1TCPSocketActionBuilder(io.kubernetes.client.openapi.models.V1TCPSocketAction instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withHost(instance.getHost());
        
        this.withPort(instance.getPort());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1TCPSocketAction build() {
        V1TCPSocketAction buildable = new V1TCPSocketAction();
        buildable.setHost(fluent.getHost());
        buildable.setPort(fluent.getPort());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1TCPSocketActionBuilder that = (V1TCPSocketActionBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
