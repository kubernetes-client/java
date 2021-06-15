package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1ServiceSpecBuilder extends io.kubernetes.client.openapi.models.V1ServiceSpecFluentImpl<io.kubernetes.client.openapi.models.V1ServiceSpecBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1ServiceSpec,io.kubernetes.client.openapi.models.V1ServiceSpecBuilder> {

    io.kubernetes.client.openapi.models.V1ServiceSpecFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1ServiceSpecBuilder() {
        this(true);
    }

    public V1ServiceSpecBuilder(java.lang.Boolean validationEnabled) {
        this(new V1ServiceSpec(), validationEnabled);
    }

    public V1ServiceSpecBuilder(io.kubernetes.client.openapi.models.V1ServiceSpecFluent<?> fluent) {
        this(fluent, true);
    }

    public V1ServiceSpecBuilder(io.kubernetes.client.openapi.models.V1ServiceSpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1ServiceSpec(), validationEnabled);
    }

    public V1ServiceSpecBuilder(io.kubernetes.client.openapi.models.V1ServiceSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1ServiceSpec instance) {
        this(fluent, instance, true);
    }

    public V1ServiceSpecBuilder(io.kubernetes.client.openapi.models.V1ServiceSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1ServiceSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withAllocateLoadBalancerNodePorts(instance.getAllocateLoadBalancerNodePorts());
        
        fluent.withClusterIP(instance.getClusterIP());
        
        fluent.withClusterIPs(instance.getClusterIPs());
        
        fluent.withExternalIPs(instance.getExternalIPs());
        
        fluent.withExternalName(instance.getExternalName());
        
        fluent.withExternalTrafficPolicy(instance.getExternalTrafficPolicy());
        
        fluent.withHealthCheckNodePort(instance.getHealthCheckNodePort());
        
        fluent.withIpFamilies(instance.getIpFamilies());
        
        fluent.withIpFamilyPolicy(instance.getIpFamilyPolicy());
        
        fluent.withLoadBalancerIP(instance.getLoadBalancerIP());
        
        fluent.withLoadBalancerSourceRanges(instance.getLoadBalancerSourceRanges());
        
        fluent.withPorts(instance.getPorts());
        
        fluent.withPublishNotReadyAddresses(instance.getPublishNotReadyAddresses());
        
        fluent.withSelector(instance.getSelector());
        
        fluent.withSessionAffinity(instance.getSessionAffinity());
        
        fluent.withSessionAffinityConfig(instance.getSessionAffinityConfig());
        
        fluent.withTopologyKeys(instance.getTopologyKeys());
        
        fluent.withType(instance.getType());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1ServiceSpecBuilder(io.kubernetes.client.openapi.models.V1ServiceSpec instance) {
        this(instance,true);
    }

    public V1ServiceSpecBuilder(io.kubernetes.client.openapi.models.V1ServiceSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withAllocateLoadBalancerNodePorts(instance.getAllocateLoadBalancerNodePorts());
        
        this.withClusterIP(instance.getClusterIP());
        
        this.withClusterIPs(instance.getClusterIPs());
        
        this.withExternalIPs(instance.getExternalIPs());
        
        this.withExternalName(instance.getExternalName());
        
        this.withExternalTrafficPolicy(instance.getExternalTrafficPolicy());
        
        this.withHealthCheckNodePort(instance.getHealthCheckNodePort());
        
        this.withIpFamilies(instance.getIpFamilies());
        
        this.withIpFamilyPolicy(instance.getIpFamilyPolicy());
        
        this.withLoadBalancerIP(instance.getLoadBalancerIP());
        
        this.withLoadBalancerSourceRanges(instance.getLoadBalancerSourceRanges());
        
        this.withPorts(instance.getPorts());
        
        this.withPublishNotReadyAddresses(instance.getPublishNotReadyAddresses());
        
        this.withSelector(instance.getSelector());
        
        this.withSessionAffinity(instance.getSessionAffinity());
        
        this.withSessionAffinityConfig(instance.getSessionAffinityConfig());
        
        this.withTopologyKeys(instance.getTopologyKeys());
        
        this.withType(instance.getType());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1ServiceSpec build() {
        V1ServiceSpec buildable = new V1ServiceSpec();
        buildable.setAllocateLoadBalancerNodePorts(fluent.getAllocateLoadBalancerNodePorts());
        buildable.setClusterIP(fluent.getClusterIP());
        buildable.setClusterIPs(fluent.getClusterIPs());
        buildable.setExternalIPs(fluent.getExternalIPs());
        buildable.setExternalName(fluent.getExternalName());
        buildable.setExternalTrafficPolicy(fluent.getExternalTrafficPolicy());
        buildable.setHealthCheckNodePort(fluent.getHealthCheckNodePort());
        buildable.setIpFamilies(fluent.getIpFamilies());
        buildable.setIpFamilyPolicy(fluent.getIpFamilyPolicy());
        buildable.setLoadBalancerIP(fluent.getLoadBalancerIP());
        buildable.setLoadBalancerSourceRanges(fluent.getLoadBalancerSourceRanges());
        buildable.setPorts(fluent.getPorts());
        buildable.setPublishNotReadyAddresses(fluent.getPublishNotReadyAddresses());
        buildable.setSelector(fluent.getSelector());
        buildable.setSessionAffinity(fluent.getSessionAffinity());
        buildable.setSessionAffinityConfig(fluent.getSessionAffinityConfig());
        buildable.setTopologyKeys(fluent.getTopologyKeys());
        buildable.setType(fluent.getType());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1ServiceSpecBuilder that = (V1ServiceSpecBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
