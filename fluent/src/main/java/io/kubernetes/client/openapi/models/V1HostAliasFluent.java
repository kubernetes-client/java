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

public interface V1HostAliasFluent<A extends io.kubernetes.client.openapi.models.V1HostAliasFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public A addToHostnames(int index,java.lang.String item);
    public A setToHostnames(int index,java.lang.String item);
    public A addToHostnames(java.lang.String... items);
    public A addAllToHostnames(java.util.Collection<java.lang.String> items);
    public A removeFromHostnames(java.lang.String... items);
    public A removeAllFromHostnames(java.util.Collection<java.lang.String> items);
    public java.util.List<java.lang.String> getHostnames();
    public java.lang.String getHostname(int index);
    public java.lang.String getFirstHostname();
    public java.lang.String getLastHostname();
    public java.lang.String getMatchingHostname(java.util.function.Predicate<java.lang.String> predicate);
    public java.lang.Boolean hasMatchingHostname(java.util.function.Predicate<java.lang.String> predicate);
    public A withHostnames(java.util.List<java.lang.String> hostnames);
    public A withHostnames(java.lang.String... hostnames);
    public java.lang.Boolean hasHostnames();
    public A addNewHostname(java.lang.String original);
    public java.lang.String getIp();
    public A withIp(java.lang.String ip);
    public java.lang.Boolean hasIp();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withIp instead.
     */
        public A withNewIp(java.lang.String original);
}
