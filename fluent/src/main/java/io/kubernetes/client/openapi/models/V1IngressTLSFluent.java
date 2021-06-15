package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.lang.String;
import java.lang.Boolean;
import java.util.function.Predicate;

public interface V1IngressTLSFluent<A extends io.kubernetes.client.openapi.models.V1IngressTLSFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public A addToHosts(int index,java.lang.String item);
    public A setToHosts(int index,java.lang.String item);
    public A addToHosts(java.lang.String... items);
    public A addAllToHosts(java.util.Collection<java.lang.String> items);
    public A removeFromHosts(java.lang.String... items);
    public A removeAllFromHosts(java.util.Collection<java.lang.String> items);
    public java.util.List<java.lang.String> getHosts();
    public java.lang.String getHost(int index);
    public java.lang.String getFirstHost();
    public java.lang.String getLastHost();
    public java.lang.String getMatchingHost(java.util.function.Predicate<java.lang.String> predicate);
    public java.lang.Boolean hasMatchingHost(java.util.function.Predicate<java.lang.String> predicate);
    public A withHosts(java.util.List<java.lang.String> hosts);
    public A withHosts(java.lang.String... hosts);
    public java.lang.Boolean hasHosts();
    public A addNewHost(java.lang.String original);
    public java.lang.String getSecretName();
    public A withSecretName(java.lang.String secretName);
    public java.lang.Boolean hasSecretName();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withSecretName instead.
     */
        public A withNewSecretName(java.lang.String original);
}
