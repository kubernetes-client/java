package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

public interface V1EndpointAddressFluent<A extends io.kubernetes.client.openapi.models.V1EndpointAddressFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getHostname();
    public A withHostname(java.lang.String hostname);
    public java.lang.Boolean hasHostname();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withHostname instead.
     */
        public A withNewHostname(java.lang.String original);
    public java.lang.String getIp();
    public A withIp(java.lang.String ip);
    public java.lang.Boolean hasIp();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withIp instead.
     */
        public A withNewIp(java.lang.String original);
    public java.lang.String getNodeName();
    public A withNodeName(java.lang.String nodeName);
    public java.lang.Boolean hasNodeName();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withNodeName instead.
     */
        public A withNewNodeName(java.lang.String original);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildTargetRef instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1ObjectReference getTargetRef();
    public io.kubernetes.client.openapi.models.V1ObjectReference buildTargetRef();
    public A withTargetRef(io.kubernetes.client.openapi.models.V1ObjectReference targetRef);
    public java.lang.Boolean hasTargetRef();
    public io.kubernetes.client.openapi.models.V1EndpointAddressFluent.TargetRefNested<A> withNewTargetRef();
    public io.kubernetes.client.openapi.models.V1EndpointAddressFluent.TargetRefNested<A> withNewTargetRefLike(io.kubernetes.client.openapi.models.V1ObjectReference item);
    public io.kubernetes.client.openapi.models.V1EndpointAddressFluent.TargetRefNested<A> editTargetRef();
    public io.kubernetes.client.openapi.models.V1EndpointAddressFluent.TargetRefNested<A> editOrNewTargetRef();
    public io.kubernetes.client.openapi.models.V1EndpointAddressFluent.TargetRefNested<A> editOrNewTargetRefLike(io.kubernetes.client.openapi.models.V1ObjectReference item);
    public interface TargetRefNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ObjectReferenceFluent<io.kubernetes.client.openapi.models.V1EndpointAddressFluent.TargetRefNested<N>> {

            public N and();
            public N endTargetRef();    }


}
