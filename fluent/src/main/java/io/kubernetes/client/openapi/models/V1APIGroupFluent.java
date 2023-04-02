package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1APIGroupFluent<A extends V1APIGroupFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public String getKind();
  public A withKind(String kind);
  public Boolean hasKind();
  public String getName();
  public A withName(String name);
  public Boolean hasName();
  
  /**
   * This method has been deprecated, please use method buildPreferredVersion instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1GroupVersionForDiscovery getPreferredVersion();
  public V1GroupVersionForDiscovery buildPreferredVersion();
  public A withPreferredVersion(V1GroupVersionForDiscovery preferredVersion);
  public Boolean hasPreferredVersion();
  public V1APIGroupFluent.PreferredVersionNested<A> withNewPreferredVersion();
  public V1APIGroupFluent.PreferredVersionNested<A> withNewPreferredVersionLike(V1GroupVersionForDiscovery item);
  public V1APIGroupFluent.PreferredVersionNested<A> editPreferredVersion();
  public V1APIGroupFluent.PreferredVersionNested<A> editOrNewPreferredVersion();
  public V1APIGroupFluent.PreferredVersionNested<A> editOrNewPreferredVersionLike(V1GroupVersionForDiscovery item);
  public A addToServerAddressByClientCIDRs(Integer index,V1ServerAddressByClientCIDR item);
  public A setToServerAddressByClientCIDRs(Integer index,V1ServerAddressByClientCIDR item);
  public A addToServerAddressByClientCIDRs(io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR... items);
  public A addAllToServerAddressByClientCIDRs(Collection<V1ServerAddressByClientCIDR> items);
  public A removeFromServerAddressByClientCIDRs(io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR... items);
  public A removeAllFromServerAddressByClientCIDRs(Collection<V1ServerAddressByClientCIDR> items);
  public A removeMatchingFromServerAddressByClientCIDRs(Predicate<V1ServerAddressByClientCIDRBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildServerAddressByClientCIDRs instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1ServerAddressByClientCIDR> getServerAddressByClientCIDRs();
  public List<V1ServerAddressByClientCIDR> buildServerAddressByClientCIDRs();
  public V1ServerAddressByClientCIDR buildServerAddressByClientCIDR(Integer index);
  public V1ServerAddressByClientCIDR buildFirstServerAddressByClientCIDR();
  public V1ServerAddressByClientCIDR buildLastServerAddressByClientCIDR();
  public V1ServerAddressByClientCIDR buildMatchingServerAddressByClientCIDR(Predicate<V1ServerAddressByClientCIDRBuilder> predicate);
  public Boolean hasMatchingServerAddressByClientCIDR(Predicate<V1ServerAddressByClientCIDRBuilder> predicate);
  public A withServerAddressByClientCIDRs(List<V1ServerAddressByClientCIDR> serverAddressByClientCIDRs);
  public A withServerAddressByClientCIDRs(io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR... serverAddressByClientCIDRs);
  public Boolean hasServerAddressByClientCIDRs();
  public V1APIGroupFluent.ServerAddressByClientCIDRsNested<A> addNewServerAddressByClientCIDR();
  public V1APIGroupFluent.ServerAddressByClientCIDRsNested<A> addNewServerAddressByClientCIDRLike(V1ServerAddressByClientCIDR item);
  public V1APIGroupFluent.ServerAddressByClientCIDRsNested<A> setNewServerAddressByClientCIDRLike(Integer index,V1ServerAddressByClientCIDR item);
  public V1APIGroupFluent.ServerAddressByClientCIDRsNested<A> editServerAddressByClientCIDR(Integer index);
  public V1APIGroupFluent.ServerAddressByClientCIDRsNested<A> editFirstServerAddressByClientCIDR();
  public V1APIGroupFluent.ServerAddressByClientCIDRsNested<A> editLastServerAddressByClientCIDR();
  public V1APIGroupFluent.ServerAddressByClientCIDRsNested<A> editMatchingServerAddressByClientCIDR(Predicate<V1ServerAddressByClientCIDRBuilder> predicate);
  public A addToVersions(Integer index,V1GroupVersionForDiscovery item);
  public A setToVersions(Integer index,V1GroupVersionForDiscovery item);
  public A addToVersions(io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery... items);
  public A addAllToVersions(Collection<V1GroupVersionForDiscovery> items);
  public A removeFromVersions(io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery... items);
  public A removeAllFromVersions(Collection<V1GroupVersionForDiscovery> items);
  public A removeMatchingFromVersions(Predicate<V1GroupVersionForDiscoveryBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildVersions instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1GroupVersionForDiscovery> getVersions();
  public List<V1GroupVersionForDiscovery> buildVersions();
  public V1GroupVersionForDiscovery buildVersion(Integer index);
  public V1GroupVersionForDiscovery buildFirstVersion();
  public V1GroupVersionForDiscovery buildLastVersion();
  public V1GroupVersionForDiscovery buildMatchingVersion(Predicate<V1GroupVersionForDiscoveryBuilder> predicate);
  public Boolean hasMatchingVersion(Predicate<V1GroupVersionForDiscoveryBuilder> predicate);
  public A withVersions(List<V1GroupVersionForDiscovery> versions);
  public A withVersions(io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery... versions);
  public Boolean hasVersions();
  public V1APIGroupFluent.VersionsNested<A> addNewVersion();
  public V1APIGroupFluent.VersionsNested<A> addNewVersionLike(V1GroupVersionForDiscovery item);
  public V1APIGroupFluent.VersionsNested<A> setNewVersionLike(Integer index,V1GroupVersionForDiscovery item);
  public V1APIGroupFluent.VersionsNested<A> editVersion(Integer index);
  public V1APIGroupFluent.VersionsNested<A> editFirstVersion();
  public V1APIGroupFluent.VersionsNested<A> editLastVersion();
  public V1APIGroupFluent.VersionsNested<A> editMatchingVersion(Predicate<V1GroupVersionForDiscoveryBuilder> predicate);
  public interface PreferredVersionNested<N> extends Nested<N>,V1GroupVersionForDiscoveryFluent<V1APIGroupFluent.PreferredVersionNested<N>>{
    public N and();
    public N endPreferredVersion();
    
  }
  public interface ServerAddressByClientCIDRsNested<N> extends Nested<N>,V1ServerAddressByClientCIDRFluent<V1APIGroupFluent.ServerAddressByClientCIDRsNested<N>>{
    public N and();
    public N endServerAddressByClientCIDR();
    
  }
  public interface VersionsNested<N> extends Nested<N>,V1GroupVersionForDiscoveryFluent<V1APIGroupFluent.VersionsNested<N>>{
    public N and();
    public N endVersion();
    
  }
  
}