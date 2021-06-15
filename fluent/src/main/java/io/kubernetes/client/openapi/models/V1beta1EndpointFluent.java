package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface V1beta1EndpointFluent<A extends io.kubernetes.client.openapi.models.V1beta1EndpointFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public A addToAddresses(int index,java.lang.String item);
    public A setToAddresses(int index,java.lang.String item);
    public A addToAddresses(java.lang.String... items);
    public A addAllToAddresses(java.util.Collection<java.lang.String> items);
    public A removeFromAddresses(java.lang.String... items);
    public A removeAllFromAddresses(java.util.Collection<java.lang.String> items);
    public java.util.List<java.lang.String> getAddresses();
    public java.lang.String getAddress(int index);
    public java.lang.String getFirstAddress();
    public java.lang.String getLastAddress();
    public java.lang.String getMatchingAddress(java.util.function.Predicate<java.lang.String> predicate);
    public java.lang.Boolean hasMatchingAddress(java.util.function.Predicate<java.lang.String> predicate);
    public A withAddresses(java.util.List<java.lang.String> addresses);
    public A withAddresses(java.lang.String... addresses);
    public java.lang.Boolean hasAddresses();
    public A addNewAddress(java.lang.String original);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildConditions instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1beta1EndpointConditions getConditions();
    public io.kubernetes.client.openapi.models.V1beta1EndpointConditions buildConditions();
    public A withConditions(io.kubernetes.client.openapi.models.V1beta1EndpointConditions conditions);
    public java.lang.Boolean hasConditions();
    public io.kubernetes.client.openapi.models.V1beta1EndpointFluent.ConditionsNested<A> withNewConditions();
    public io.kubernetes.client.openapi.models.V1beta1EndpointFluent.ConditionsNested<A> withNewConditionsLike(io.kubernetes.client.openapi.models.V1beta1EndpointConditions item);
    public io.kubernetes.client.openapi.models.V1beta1EndpointFluent.ConditionsNested<A> editConditions();
    public io.kubernetes.client.openapi.models.V1beta1EndpointFluent.ConditionsNested<A> editOrNewConditions();
    public io.kubernetes.client.openapi.models.V1beta1EndpointFluent.ConditionsNested<A> editOrNewConditionsLike(io.kubernetes.client.openapi.models.V1beta1EndpointConditions item);
    public java.lang.String getHostname();
    public A withHostname(java.lang.String hostname);
    public java.lang.Boolean hasHostname();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withHostname instead.
     */
        public A withNewHostname(java.lang.String original);
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
    public io.kubernetes.client.openapi.models.V1beta1EndpointFluent.TargetRefNested<A> withNewTargetRef();
    public io.kubernetes.client.openapi.models.V1beta1EndpointFluent.TargetRefNested<A> withNewTargetRefLike(io.kubernetes.client.openapi.models.V1ObjectReference item);
    public io.kubernetes.client.openapi.models.V1beta1EndpointFluent.TargetRefNested<A> editTargetRef();
    public io.kubernetes.client.openapi.models.V1beta1EndpointFluent.TargetRefNested<A> editOrNewTargetRef();
    public io.kubernetes.client.openapi.models.V1beta1EndpointFluent.TargetRefNested<A> editOrNewTargetRefLike(io.kubernetes.client.openapi.models.V1ObjectReference item);
    public A addToTopology(java.lang.String key,java.lang.String value);
    public A addToTopology(java.util.Map<java.lang.String,java.lang.String> map);
    public A removeFromTopology(java.lang.String key);
    public A removeFromTopology(java.util.Map<java.lang.String,java.lang.String> map);
    public java.util.Map<java.lang.String,java.lang.String> getTopology();
    public <K,V>A withTopology(java.util.Map<java.lang.String,java.lang.String> topology);
    public java.lang.Boolean hasTopology();
    public interface ConditionsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1EndpointConditionsFluent<io.kubernetes.client.openapi.models.V1beta1EndpointFluent.ConditionsNested<N>> {

            public N and();
            public N endConditions();    }


    public interface TargetRefNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ObjectReferenceFluent<io.kubernetes.client.openapi.models.V1beta1EndpointFluent.TargetRefNested<N>> {

            public N and();
            public N endTargetRef();    }


}
