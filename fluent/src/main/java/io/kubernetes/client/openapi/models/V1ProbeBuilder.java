package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1ProbeBuilder extends io.kubernetes.client.openapi.models.V1ProbeFluentImpl<io.kubernetes.client.openapi.models.V1ProbeBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1Probe,io.kubernetes.client.openapi.models.V1ProbeBuilder> {

    io.kubernetes.client.openapi.models.V1ProbeFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1ProbeBuilder() {
        this(true);
    }

    public V1ProbeBuilder(java.lang.Boolean validationEnabled) {
        this(new V1Probe(), validationEnabled);
    }

    public V1ProbeBuilder(io.kubernetes.client.openapi.models.V1ProbeFluent<?> fluent) {
        this(fluent, true);
    }

    public V1ProbeBuilder(io.kubernetes.client.openapi.models.V1ProbeFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1Probe(), validationEnabled);
    }

    public V1ProbeBuilder(io.kubernetes.client.openapi.models.V1ProbeFluent<?> fluent,io.kubernetes.client.openapi.models.V1Probe instance) {
        this(fluent, instance, true);
    }

    public V1ProbeBuilder(io.kubernetes.client.openapi.models.V1ProbeFluent<?> fluent,io.kubernetes.client.openapi.models.V1Probe instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withExec(instance.getExec());
        
        fluent.withFailureThreshold(instance.getFailureThreshold());
        
        fluent.withHttpGet(instance.getHttpGet());
        
        fluent.withInitialDelaySeconds(instance.getInitialDelaySeconds());
        
        fluent.withPeriodSeconds(instance.getPeriodSeconds());
        
        fluent.withSuccessThreshold(instance.getSuccessThreshold());
        
        fluent.withTcpSocket(instance.getTcpSocket());
        
        fluent.withTimeoutSeconds(instance.getTimeoutSeconds());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1ProbeBuilder(io.kubernetes.client.openapi.models.V1Probe instance) {
        this(instance,true);
    }

    public V1ProbeBuilder(io.kubernetes.client.openapi.models.V1Probe instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withExec(instance.getExec());
        
        this.withFailureThreshold(instance.getFailureThreshold());
        
        this.withHttpGet(instance.getHttpGet());
        
        this.withInitialDelaySeconds(instance.getInitialDelaySeconds());
        
        this.withPeriodSeconds(instance.getPeriodSeconds());
        
        this.withSuccessThreshold(instance.getSuccessThreshold());
        
        this.withTcpSocket(instance.getTcpSocket());
        
        this.withTimeoutSeconds(instance.getTimeoutSeconds());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1Probe build() {
        V1Probe buildable = new V1Probe();
        buildable.setExec(fluent.getExec());
        buildable.setFailureThreshold(fluent.getFailureThreshold());
        buildable.setHttpGet(fluent.getHttpGet());
        buildable.setInitialDelaySeconds(fluent.getInitialDelaySeconds());
        buildable.setPeriodSeconds(fluent.getPeriodSeconds());
        buildable.setSuccessThreshold(fluent.getSuccessThreshold());
        buildable.setTcpSocket(fluent.getTcpSocket());
        buildable.setTimeoutSeconds(fluent.getTimeoutSeconds());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1ProbeBuilder that = (V1ProbeBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
