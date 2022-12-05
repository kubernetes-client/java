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
public interface V1APIVersionsFluent<A extends V1APIVersionsFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public String getKind();
  public A withKind(String kind);
  public Boolean hasKind();
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
  public V1APIVersionsFluent.ServerAddressByClientCIDRsNested<A> addNewServerAddressByClientCIDR();
  public V1APIVersionsFluent.ServerAddressByClientCIDRsNested<A> addNewServerAddressByClientCIDRLike(V1ServerAddressByClientCIDR item);
  public V1APIVersionsFluent.ServerAddressByClientCIDRsNested<A> setNewServerAddressByClientCIDRLike(Integer index,V1ServerAddressByClientCIDR item);
  public V1APIVersionsFluent.ServerAddressByClientCIDRsNested<A> editServerAddressByClientCIDR(Integer index);
  public V1APIVersionsFluent.ServerAddressByClientCIDRsNested<A> editFirstServerAddressByClientCIDR();
  public V1APIVersionsFluent.ServerAddressByClientCIDRsNested<A> editLastServerAddressByClientCIDR();
  public V1APIVersionsFluent.ServerAddressByClientCIDRsNested<A> editMatchingServerAddressByClientCIDR(Predicate<V1ServerAddressByClientCIDRBuilder> predicate);
  public A addToVersions(Integer index,String item);
  public A setToVersions(Integer index,String item);
  public A addToVersions(java.lang.String... items);
  public A addAllToVersions(Collection<String> items);
  public A removeFromVersions(java.lang.String... items);
  public A removeAllFromVersions(Collection<String> items);
  public List<String> getVersions();
  public String getVersion(Integer index);
  public String getFirstVersion();
  public String getLastVersion();
  public String getMatchingVersion(Predicate<String> predicate);
  public Boolean hasMatchingVersion(Predicate<String> predicate);
  public A withVersions(List<String> versions);
  public A withVersions(java.lang.String... versions);
  public Boolean hasVersions();
  public interface ServerAddressByClientCIDRsNested<N> extends Nested<N>,V1ServerAddressByClientCIDRFluent<V1APIVersionsFluent.ServerAddressByClientCIDRsNested<N>>{
    public N and();
    public N endServerAddressByClientCIDR();
    
  }
  
}