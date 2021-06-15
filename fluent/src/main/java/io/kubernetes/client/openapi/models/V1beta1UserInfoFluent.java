package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.function.Predicate;

public interface V1beta1UserInfoFluent<A extends io.kubernetes.client.openapi.models.V1beta1UserInfoFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public A addToExtra(java.lang.String key,java.util.List<java.lang.String> value);
    public A addToExtra(java.util.Map<java.lang.String,java.util.List<java.lang.String>> map);
    public A removeFromExtra(java.lang.String key);
    public A removeFromExtra(java.util.Map<java.lang.String,java.util.List<java.lang.String>> map);
    public java.util.Map<java.lang.String,java.util.List<java.lang.String>> getExtra();
    public <K,V>A withExtra(java.util.Map<java.lang.String,java.util.List<java.lang.String>> extra);
    public java.lang.Boolean hasExtra();
    public A addToGroups(int index,java.lang.String item);
    public A setToGroups(int index,java.lang.String item);
    public A addToGroups(java.lang.String... items);
    public A addAllToGroups(java.util.Collection<java.lang.String> items);
    public A removeFromGroups(java.lang.String... items);
    public A removeAllFromGroups(java.util.Collection<java.lang.String> items);
    public java.util.List<java.lang.String> getGroups();
    public java.lang.String getGroup(int index);
    public java.lang.String getFirstGroup();
    public java.lang.String getLastGroup();
    public java.lang.String getMatchingGroup(java.util.function.Predicate<java.lang.String> predicate);
    public java.lang.Boolean hasMatchingGroup(java.util.function.Predicate<java.lang.String> predicate);
    public A withGroups(java.util.List<java.lang.String> groups);
    public A withGroups(java.lang.String... groups);
    public java.lang.Boolean hasGroups();
    public A addNewGroup(java.lang.String original);
    public java.lang.String getUid();
    public A withUid(java.lang.String uid);
    public java.lang.Boolean hasUid();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withUid instead.
     */
        public A withNewUid(java.lang.String original);
    public java.lang.String getUsername();
    public A withUsername(java.lang.String username);
    public java.lang.Boolean hasUsername();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withUsername instead.
     */
        public A withNewUsername(java.lang.String original);
}
