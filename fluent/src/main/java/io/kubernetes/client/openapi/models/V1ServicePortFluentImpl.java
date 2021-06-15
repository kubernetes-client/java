package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.custom.IntOrString;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1ServicePortFluentImpl<A extends io.kubernetes.client.openapi.models.V1ServicePortFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1ServicePortFluent<A> {

    private java.lang.String appProtocol;
    private java.lang.String name;
    private java.lang.Integer nodePort;
    private java.lang.Integer port;
    private java.lang.String protocol;
    private io.kubernetes.client.custom.IntOrString targetPort;

    public V1ServicePortFluentImpl() {
    }

    public V1ServicePortFluentImpl(io.kubernetes.client.openapi.models.V1ServicePort instance) {
        this.withAppProtocol(instance.getAppProtocol());
        
        this.withName(instance.getName());
        
        this.withNodePort(instance.getNodePort());
        
        this.withPort(instance.getPort());
        
        this.withProtocol(instance.getProtocol());
        
        this.withTargetPort(instance.getTargetPort());
    }

    public java.lang.String getAppProtocol() {
        return this.appProtocol;
    }

    public A withAppProtocol(java.lang.String appProtocol) {
        this.appProtocol=appProtocol; return (A) this;
    }

    public java.lang.Boolean hasAppProtocol() {
        return this.appProtocol != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withAppProtocol instead.
     */
        public A withNewAppProtocol(java.lang.String original) {
        return (A)withAppProtocol(new String(original));
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

    public java.lang.Integer getNodePort() {
        return this.nodePort;
    }

    public A withNodePort(java.lang.Integer nodePort) {
        this.nodePort=nodePort; return (A) this;
    }

    public java.lang.Boolean hasNodePort() {
        return this.nodePort != null;
    }

    public java.lang.Integer getPort() {
        return this.port;
    }

    public A withPort(java.lang.Integer port) {
        this.port=port; return (A) this;
    }

    public java.lang.Boolean hasPort() {
        return this.port != null;
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

    public io.kubernetes.client.custom.IntOrString getTargetPort() {
        return this.targetPort;
    }

    public A withTargetPort(io.kubernetes.client.custom.IntOrString targetPort) {
        this.targetPort=targetPort; return (A) this;
    }

    public java.lang.Boolean hasTargetPort() {
        return this.targetPort != null;
    }

    public A withNewTargetPort(int value) {
        return (A)withTargetPort(new IntOrString(value));
    }

    public A withNewTargetPort(java.lang.String value) {
        return (A)withTargetPort(new IntOrString(value));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1ServicePortFluentImpl that = (V1ServicePortFluentImpl) o;
        if (appProtocol != null ? !appProtocol.equals(that.appProtocol) :that.appProtocol != null) return false;
        if (name != null ? !name.equals(that.name) :that.name != null) return false;
        if (nodePort != null ? !nodePort.equals(that.nodePort) :that.nodePort != null) return false;
        if (port != null ? !port.equals(that.port) :that.port != null) return false;
        if (protocol != null ? !protocol.equals(that.protocol) :that.protocol != null) return false;
        if (targetPort != null ? !targetPort.equals(that.targetPort) :that.targetPort != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(appProtocol,  name,  nodePort,  port,  protocol,  targetPort,  super.hashCode());
    }

}
