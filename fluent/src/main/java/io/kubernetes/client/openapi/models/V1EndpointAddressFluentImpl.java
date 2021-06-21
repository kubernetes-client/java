package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class V1EndpointAddressFluentImpl<A extends io.kubernetes.client.openapi.models.V1EndpointAddressFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1EndpointAddressFluent<A> {

    private java.lang.String hostname;
    private java.lang.String ip;
    private java.lang.String nodeName;
    private io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder targetRef;

    public V1EndpointAddressFluentImpl() {
    }

    public V1EndpointAddressFluentImpl(io.kubernetes.client.openapi.models.V1EndpointAddress instance) {
        this.withHostname(instance.getHostname());
        
        this.withIp(instance.getIp());
        
        this.withNodeName(instance.getNodeName());
        
        this.withTargetRef(instance.getTargetRef());
    }

    public java.lang.String getHostname() {
        return this.hostname;
    }

    public A withHostname(java.lang.String hostname) {
        this.hostname=hostname; return (A) this;
    }

    public java.lang.Boolean hasHostname() {
        return this.hostname != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withHostname instead.
     */
        public A withNewHostname(java.lang.String original) {
        return (A)withHostname(new String(original));
    }

    public java.lang.String getIp() {
        return this.ip;
    }

    public A withIp(java.lang.String ip) {
        this.ip=ip; return (A) this;
    }

    public java.lang.Boolean hasIp() {
        return this.ip != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withIp instead.
     */
        public A withNewIp(java.lang.String original) {
        return (A)withIp(new String(original));
    }

    public java.lang.String getNodeName() {
        return this.nodeName;
    }

    public A withNodeName(java.lang.String nodeName) {
        this.nodeName=nodeName; return (A) this;
    }

    public java.lang.Boolean hasNodeName() {
        return this.nodeName != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withNodeName instead.
     */
        public A withNewNodeName(java.lang.String original) {
        return (A)withNodeName(new String(original));
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildTargetRef instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1ObjectReference getTargetRef() {
        return this.targetRef!=null?this.targetRef.build():null;
    }

    public io.kubernetes.client.openapi.models.V1ObjectReference buildTargetRef() {
        return this.targetRef!=null?this.targetRef.build():null;
    }

    public A withTargetRef(io.kubernetes.client.openapi.models.V1ObjectReference targetRef) {
        _visitables.get("targetRef").remove(this.targetRef);
        if (targetRef!=null){ this.targetRef= new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(targetRef); _visitables.get("targetRef").add(this.targetRef);} return (A) this;
    }

    public java.lang.Boolean hasTargetRef() {
        return this.targetRef != null;
    }

    public io.kubernetes.client.openapi.models.V1EndpointAddressFluent.TargetRefNested<A> withNewTargetRef() {
        return new io.kubernetes.client.openapi.models.V1EndpointAddressFluentImpl.TargetRefNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1EndpointAddressFluent.TargetRefNested<A> withNewTargetRefLike(io.kubernetes.client.openapi.models.V1ObjectReference item) {
        return new io.kubernetes.client.openapi.models.V1EndpointAddressFluentImpl.TargetRefNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1EndpointAddressFluent.TargetRefNested<A> editTargetRef() {
        return withNewTargetRefLike(getTargetRef());
    }

    public io.kubernetes.client.openapi.models.V1EndpointAddressFluent.TargetRefNested<A> editOrNewTargetRef() {
        return withNewTargetRefLike(getTargetRef() != null ? getTargetRef(): new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1EndpointAddressFluent.TargetRefNested<A> editOrNewTargetRefLike(io.kubernetes.client.openapi.models.V1ObjectReference item) {
        return withNewTargetRefLike(getTargetRef() != null ? getTargetRef(): item);
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1EndpointAddressFluentImpl that = (V1EndpointAddressFluentImpl) o;
        if (hostname != null ? !hostname.equals(that.hostname) :that.hostname != null) return false;
        if (ip != null ? !ip.equals(that.ip) :that.ip != null) return false;
        if (nodeName != null ? !nodeName.equals(that.nodeName) :that.nodeName != null) return false;
        if (targetRef != null ? !targetRef.equals(that.targetRef) :that.targetRef != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(hostname,  ip,  nodeName,  targetRef,  super.hashCode());
    }

    public class TargetRefNestedImpl<N> extends io.kubernetes.client.openapi.models.V1ObjectReferenceFluentImpl<io.kubernetes.client.openapi.models.V1EndpointAddressFluent.TargetRefNested<N>> implements io.kubernetes.client.openapi.models.V1EndpointAddressFluent.TargetRefNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder builder;

            TargetRefNestedImpl(io.kubernetes.client.openapi.models.V1ObjectReference item) {
                this.builder = new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(this, item);
                        
            }

            TargetRefNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(this);
                        
            }

            public N and() {
                return (N) V1EndpointAddressFluentImpl.this.withTargetRef(builder.build());
            }

            public N endTargetRef() {
                return and();
            }
    }


}
