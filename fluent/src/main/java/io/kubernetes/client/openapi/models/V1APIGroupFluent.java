package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import io.kubernetes.client.fluent.Fluent;
import java.util.Collection;

public interface V1APIGroupFluent<A extends io.kubernetes.client.openapi.models.V1APIGroupFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getApiVersion();
    public A withApiVersion(java.lang.String apiVersion);
    public java.lang.Boolean hasApiVersion();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withApiVersion instead.
     */
        public A withNewApiVersion(java.lang.String original);
    public java.lang.String getKind();
    public A withKind(java.lang.String kind);
    public java.lang.Boolean hasKind();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withKind instead.
     */
        public A withNewKind(java.lang.String original);
    public java.lang.String getName();
    public A withName(java.lang.String name);
    public java.lang.Boolean hasName();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withName instead.
     */
        public A withNewName(java.lang.String original);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildPreferredVersion instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery getPreferredVersion();
    public io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery buildPreferredVersion();
    public A withPreferredVersion(io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery preferredVersion);
    public java.lang.Boolean hasPreferredVersion();
    public io.kubernetes.client.openapi.models.V1APIGroupFluent.PreferredVersionNested<A> withNewPreferredVersion();
    public io.kubernetes.client.openapi.models.V1APIGroupFluent.PreferredVersionNested<A> withNewPreferredVersionLike(io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery item);
    public io.kubernetes.client.openapi.models.V1APIGroupFluent.PreferredVersionNested<A> editPreferredVersion();
    public io.kubernetes.client.openapi.models.V1APIGroupFluent.PreferredVersionNested<A> editOrNewPreferredVersion();
    public io.kubernetes.client.openapi.models.V1APIGroupFluent.PreferredVersionNested<A> editOrNewPreferredVersionLike(io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery item);
    public A addToServerAddressByClientCIDRs(int index,io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR item);
    public A setToServerAddressByClientCIDRs(int index,io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR item);
    public A addToServerAddressByClientCIDRs(io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR... items);
    public A addAllToServerAddressByClientCIDRs(java.util.Collection<io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR> items);
    public A removeFromServerAddressByClientCIDRs(io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR... items);
    public A removeAllFromServerAddressByClientCIDRs(java.util.Collection<io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR> items);
    public A removeMatchingFromServerAddressByClientCIDRs(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildServerAddressByClientCIDRs instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR> getServerAddressByClientCIDRs();
    public java.util.List<io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR> buildServerAddressByClientCIDRs();
    public io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR buildServerAddressByClientCIDR(int index);
    public io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR buildFirstServerAddressByClientCIDR();
    public io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR buildLastServerAddressByClientCIDR();
    public io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR buildMatchingServerAddressByClientCIDR(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder> predicate);
    public java.lang.Boolean hasMatchingServerAddressByClientCIDR(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder> predicate);
    public A withServerAddressByClientCIDRs(java.util.List<io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR> serverAddressByClientCIDRs);
    public A withServerAddressByClientCIDRs(io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR... serverAddressByClientCIDRs);
    public java.lang.Boolean hasServerAddressByClientCIDRs();
    public io.kubernetes.client.openapi.models.V1APIGroupFluent.ServerAddressByClientCIDRsNested<A> addNewServerAddressByClientCIDR();
    public io.kubernetes.client.openapi.models.V1APIGroupFluent.ServerAddressByClientCIDRsNested<A> addNewServerAddressByClientCIDRLike(io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR item);
    public io.kubernetes.client.openapi.models.V1APIGroupFluent.ServerAddressByClientCIDRsNested<A> setNewServerAddressByClientCIDRLike(int index,io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR item);
    public io.kubernetes.client.openapi.models.V1APIGroupFluent.ServerAddressByClientCIDRsNested<A> editServerAddressByClientCIDR(int index);
    public io.kubernetes.client.openapi.models.V1APIGroupFluent.ServerAddressByClientCIDRsNested<A> editFirstServerAddressByClientCIDR();
    public io.kubernetes.client.openapi.models.V1APIGroupFluent.ServerAddressByClientCIDRsNested<A> editLastServerAddressByClientCIDR();
    public io.kubernetes.client.openapi.models.V1APIGroupFluent.ServerAddressByClientCIDRsNested<A> editMatchingServerAddressByClientCIDR(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRBuilder> predicate);
    public A addToVersions(int index,io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery item);
    public A setToVersions(int index,io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery item);
    public A addToVersions(io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery... items);
    public A addAllToVersions(java.util.Collection<io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery> items);
    public A removeFromVersions(io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery... items);
    public A removeAllFromVersions(java.util.Collection<io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery> items);
    public A removeMatchingFromVersions(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildVersions instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery> getVersions();
    public java.util.List<io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery> buildVersions();
    public io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery buildVersion(int index);
    public io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery buildFirstVersion();
    public io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery buildLastVersion();
    public io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery buildMatchingVersion(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder> predicate);
    public java.lang.Boolean hasMatchingVersion(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder> predicate);
    public A withVersions(java.util.List<io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery> versions);
    public A withVersions(io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery... versions);
    public java.lang.Boolean hasVersions();
    public io.kubernetes.client.openapi.models.V1APIGroupFluent.VersionsNested<A> addNewVersion();
    public io.kubernetes.client.openapi.models.V1APIGroupFluent.VersionsNested<A> addNewVersionLike(io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery item);
    public io.kubernetes.client.openapi.models.V1APIGroupFluent.VersionsNested<A> setNewVersionLike(int index,io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery item);
    public io.kubernetes.client.openapi.models.V1APIGroupFluent.VersionsNested<A> editVersion(int index);
    public io.kubernetes.client.openapi.models.V1APIGroupFluent.VersionsNested<A> editFirstVersion();
    public io.kubernetes.client.openapi.models.V1APIGroupFluent.VersionsNested<A> editLastVersion();
    public io.kubernetes.client.openapi.models.V1APIGroupFluent.VersionsNested<A> editMatchingVersion(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder> predicate);
    public interface PreferredVersionNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryFluent<io.kubernetes.client.openapi.models.V1APIGroupFluent.PreferredVersionNested<N>> {

            public N and();
            public N endPreferredVersion();    }


    public interface ServerAddressByClientCIDRsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRFluent<io.kubernetes.client.openapi.models.V1APIGroupFluent.ServerAddressByClientCIDRsNested<N>> {

            public N and();
            public N endServerAddressByClientCIDR();    }


    public interface VersionsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryFluent<io.kubernetes.client.openapi.models.V1APIGroupFluent.VersionsNested<N>> {

            public N and();
            public N endVersion();    }


}
