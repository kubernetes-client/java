package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1ContainerPortFluentImpl<A extends io.kubernetes.client.openapi.models.V1ContainerPortFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1ContainerPortFluent<A> {

    private java.lang.Integer containerPort;
    private java.lang.String hostIP;
    private java.lang.Integer hostPort;
    private java.lang.String name;
    private java.lang.String protocol;

    public V1ContainerPortFluentImpl() {
    }

    public V1ContainerPortFluentImpl(io.kubernetes.client.openapi.models.V1ContainerPort instance) {
        this.withContainerPort(instance.getContainerPort());
        
        this.withHostIP(instance.getHostIP());
        
        this.withHostPort(instance.getHostPort());
        
        this.withName(instance.getName());
        
        this.withProtocol(instance.getProtocol());
    }

    public java.lang.Integer getContainerPort() {
        return this.containerPort;
    }

    public A withContainerPort(java.lang.Integer containerPort) {
        this.containerPort=containerPort; return (A) this;
    }

    public java.lang.Boolean hasContainerPort() {
        return this.containerPort != null;
    }

    public java.lang.String getHostIP() {
        return this.hostIP;
    }

    public A withHostIP(java.lang.String hostIP) {
        this.hostIP=hostIP; return (A) this;
    }

    public java.lang.Boolean hasHostIP() {
        return this.hostIP != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withHostIP instead.
     */
        public A withNewHostIP(java.lang.String original) {
        return (A)withHostIP(new String(original));
    }

    public java.lang.Integer getHostPort() {
        return this.hostPort;
    }

    public A withHostPort(java.lang.Integer hostPort) {
        this.hostPort=hostPort; return (A) this;
    }

    public java.lang.Boolean hasHostPort() {
        return this.hostPort != null;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public A withName(java.lang.String name) {
        this.name=name; return (A) this;
    }

    public java.lang.Boolean hasName() {
        return this.name != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withName instead.
     */
        public A withNewName(java.lang.String original) {
        return (A)withName(new String(original));
    }

    public java.lang.String getProtocol() {
        return this.protocol;
    }

    public A withProtocol(java.lang.String protocol) {
        this.protocol=protocol; return (A) this;
    }

    public java.lang.Boolean hasProtocol() {
        return this.protocol != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withProtocol instead.
     */
        public A withNewProtocol(java.lang.String original) {
        return (A)withProtocol(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1ContainerPortFluentImpl that = (V1ContainerPortFluentImpl) o;
        if (containerPort != null ? !containerPort.equals(that.containerPort) :that.containerPort != null) return false;
        if (hostIP != null ? !hostIP.equals(that.hostIP) :that.hostIP != null) return false;
        if (hostPort != null ? !hostPort.equals(that.hostPort) :that.hostPort != null) return false;
        if (name != null ? !name.equals(that.name) :that.name != null) return false;
        if (protocol != null ? !protocol.equals(that.protocol) :that.protocol != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(containerPort,  hostIP,  hostPort,  name,  protocol,  super.hashCode());
    }

}
