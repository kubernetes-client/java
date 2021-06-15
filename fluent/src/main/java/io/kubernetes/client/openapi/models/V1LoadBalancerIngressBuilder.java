package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1LoadBalancerIngressBuilder extends io.kubernetes.client.openapi.models.V1LoadBalancerIngressFluentImpl<io.kubernetes.client.openapi.models.V1LoadBalancerIngressBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1LoadBalancerIngress,io.kubernetes.client.openapi.models.V1LoadBalancerIngressBuilder> {

    io.kubernetes.client.openapi.models.V1LoadBalancerIngressFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1LoadBalancerIngressBuilder() {
        this(true);
    }

    public V1LoadBalancerIngressBuilder(java.lang.Boolean validationEnabled) {
        this(new V1LoadBalancerIngress(), validationEnabled);
    }

    public V1LoadBalancerIngressBuilder(io.kubernetes.client.openapi.models.V1LoadBalancerIngressFluent<?> fluent) {
        this(fluent, true);
    }

    public V1LoadBalancerIngressBuilder(io.kubernetes.client.openapi.models.V1LoadBalancerIngressFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1LoadBalancerIngress(), validationEnabled);
    }

    public V1LoadBalancerIngressBuilder(io.kubernetes.client.openapi.models.V1LoadBalancerIngressFluent<?> fluent,io.kubernetes.client.openapi.models.V1LoadBalancerIngress instance) {
        this(fluent, instance, true);
    }

    public V1LoadBalancerIngressBuilder(io.kubernetes.client.openapi.models.V1LoadBalancerIngressFluent<?> fluent,io.kubernetes.client.openapi.models.V1LoadBalancerIngress instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withHostname(instance.getHostname());
        
        fluent.withIp(instance.getIp());
        
        fluent.withPorts(instance.getPorts());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1LoadBalancerIngressBuilder(io.kubernetes.client.openapi.models.V1LoadBalancerIngress instance) {
        this(instance,true);
    }

    public V1LoadBalancerIngressBuilder(io.kubernetes.client.openapi.models.V1LoadBalancerIngress instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withHostname(instance.getHostname());
        
        this.withIp(instance.getIp());
        
        this.withPorts(instance.getPorts());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1LoadBalancerIngress build() {
        V1LoadBalancerIngress buildable = new V1LoadBalancerIngress();
        buildable.setHostname(fluent.getHostname());
        buildable.setIp(fluent.getIp());
        buildable.setPorts(fluent.getPorts());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1LoadBalancerIngressBuilder that = (V1LoadBalancerIngressBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
