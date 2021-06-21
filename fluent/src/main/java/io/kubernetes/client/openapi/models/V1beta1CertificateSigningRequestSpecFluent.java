package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.lang.Byte;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface V1beta1CertificateSigningRequestSpecFluent<A extends io.kubernetes.client.openapi.models.V1beta1CertificateSigningRequestSpecFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


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
    public A withRequest(byte... request);
    public byte[] getRequest();
    public A addToRequest(int index,java.lang.Byte item);
    public A setToRequest(int index,java.lang.Byte item);
    public A addToRequest(java.lang.Byte... items);
    public A addAllToRequest(java.util.Collection<java.lang.Byte> items);
    public A removeFromRequest(java.lang.Byte... items);
    public A removeAllFromRequest(java.util.Collection<java.lang.Byte> items);
    public java.lang.Boolean hasRequest();
    public java.lang.String getSignerName();
    public A withSignerName(java.lang.String signerName);
    public java.lang.Boolean hasSignerName();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withSignerName instead.
     */
        public A withNewSignerName(java.lang.String original);
    public java.lang.String getUid();
    public A withUid(java.lang.String uid);
    public java.lang.Boolean hasUid();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withUid instead.
     */
        public A withNewUid(java.lang.String original);
    public A addToUsages(int index,java.lang.String item);
    public A setToUsages(int index,java.lang.String item);
    public A addToUsages(java.lang.String... items);
    public A addAllToUsages(java.util.Collection<java.lang.String> items);
    public A removeFromUsages(java.lang.String... items);
    public A removeAllFromUsages(java.util.Collection<java.lang.String> items);
    public java.util.List<java.lang.String> getUsages();
    public java.lang.String getUsage(int index);
    public java.lang.String getFirstUsage();
    public java.lang.String getLastUsage();
    public java.lang.String getMatchingUsage(java.util.function.Predicate<java.lang.String> predicate);
    public java.lang.Boolean hasMatchingUsage(java.util.function.Predicate<java.lang.String> predicate);
    public A withUsages(java.util.List<java.lang.String> usages);
    public A withUsages(java.lang.String... usages);
    public java.lang.Boolean hasUsages();
    public A addNewUsage(java.lang.String original);
    public java.lang.String getUsername();
    public A withUsername(java.lang.String username);
    public java.lang.Boolean hasUsername();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withUsername instead.
     */
        public A withNewUsername(java.lang.String original);
}
