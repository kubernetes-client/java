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

public interface V1alpha1ServerStorageVersionFluent<A extends io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getApiServerID();
    public A withApiServerID(java.lang.String apiServerID);
    public java.lang.Boolean hasApiServerID();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withApiServerID instead.
     */
        public A withNewApiServerID(java.lang.String original);
    public A addToDecodableVersions(int index,java.lang.String item);
    public A setToDecodableVersions(int index,java.lang.String item);
    public A addToDecodableVersions(java.lang.String... items);
    public A addAllToDecodableVersions(java.util.Collection<java.lang.String> items);
    public A removeFromDecodableVersions(java.lang.String... items);
    public A removeAllFromDecodableVersions(java.util.Collection<java.lang.String> items);
    public java.util.List<java.lang.String> getDecodableVersions();
    public java.lang.String getDecodableVersion(int index);
    public java.lang.String getFirstDecodableVersion();
    public java.lang.String getLastDecodableVersion();
    public java.lang.String getMatchingDecodableVersion(java.util.function.Predicate<java.lang.String> predicate);
    public java.lang.Boolean hasMatchingDecodableVersion(java.util.function.Predicate<java.lang.String> predicate);
    public A withDecodableVersions(java.util.List<java.lang.String> decodableVersions);
    public A withDecodableVersions(java.lang.String... decodableVersions);
    public java.lang.Boolean hasDecodableVersions();
    public A addNewDecodableVersion(java.lang.String original);
    public java.lang.String getEncodingVersion();
    public A withEncodingVersion(java.lang.String encodingVersion);
    public java.lang.Boolean hasEncodingVersion();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withEncodingVersion instead.
     */
        public A withNewEncodingVersion(java.lang.String original);
}
