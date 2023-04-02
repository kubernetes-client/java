package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1APIVersionsFluentImpl<A extends V1APIVersionsFluent<A>> extends BaseFluent<A> implements V1APIVersionsFluent<A>{
  public V1APIVersionsFluentImpl() {
  }
  public V1APIVersionsFluentImpl(V1APIVersions instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withServerAddressByClientCIDRs(instance.getServerAddressByClientCIDRs());

    this.withVersions(instance.getVersions());

  }
  private String apiVersion;
  private String kind;
  private ArrayList<V1ServerAddressByClientCIDRBuilder> serverAddressByClientCIDRs;
  private List<String> versions;
  public String getApiVersion() {
    return this.apiVersion;
  }
  public A withApiVersion(String apiVersion) {
    this.apiVersion=apiVersion; return (A) this;
  }
  public Boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  public String getKind() {
    return this.kind;
  }
  public A withKind(String kind) {
    this.kind=kind; return (A) this;
  }
  public Boolean hasKind() {
    return this.kind != null;
  }
  public A addToServerAddressByClientCIDRs(Integer index,V1ServerAddressByClientCIDR item) {
    if (this.serverAddressByClientCIDRs == null) {this.serverAddressByClientCIDRs = new ArrayList<V1ServerAddressByClientCIDRBuilder>();}
    V1ServerAddressByClientCIDRBuilder builder = new V1ServerAddressByClientCIDRBuilder(item);_visitables.get("serverAddressByClientCIDRs").add(index >= 0 ? index : _visitables.get("serverAddressByClientCIDRs").size(), builder);this.serverAddressByClientCIDRs.add(index >= 0 ? index : serverAddressByClientCIDRs.size(), builder); return (A)this;
  }
  public A setToServerAddressByClientCIDRs(Integer index,V1ServerAddressByClientCIDR item) {
    if (this.serverAddressByClientCIDRs == null) {this.serverAddressByClientCIDRs = new ArrayList<V1ServerAddressByClientCIDRBuilder>();}
    V1ServerAddressByClientCIDRBuilder builder = new V1ServerAddressByClientCIDRBuilder(item);
    if (index < 0 || index >= _visitables.get("serverAddressByClientCIDRs").size()) { _visitables.get("serverAddressByClientCIDRs").add(builder); } else { _visitables.get("serverAddressByClientCIDRs").set(index, builder);}
    if (index < 0 || index >= serverAddressByClientCIDRs.size()) { serverAddressByClientCIDRs.add(builder); } else { serverAddressByClientCIDRs.set(index, builder);}
     return (A)this;
  }
  public A addToServerAddressByClientCIDRs(io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR... items) {
    if (this.serverAddressByClientCIDRs == null) {this.serverAddressByClientCIDRs = new ArrayList<V1ServerAddressByClientCIDRBuilder>();}
    for (V1ServerAddressByClientCIDR item : items) {V1ServerAddressByClientCIDRBuilder builder = new V1ServerAddressByClientCIDRBuilder(item);_visitables.get("serverAddressByClientCIDRs").add(builder);this.serverAddressByClientCIDRs.add(builder);} return (A)this;
  }
  public A addAllToServerAddressByClientCIDRs(Collection<V1ServerAddressByClientCIDR> items) {
    if (this.serverAddressByClientCIDRs == null) {this.serverAddressByClientCIDRs = new ArrayList<V1ServerAddressByClientCIDRBuilder>();}
    for (V1ServerAddressByClientCIDR item : items) {V1ServerAddressByClientCIDRBuilder builder = new V1ServerAddressByClientCIDRBuilder(item);_visitables.get("serverAddressByClientCIDRs").add(builder);this.serverAddressByClientCIDRs.add(builder);} return (A)this;
  }
  public A removeFromServerAddressByClientCIDRs(io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR... items) {
    for (V1ServerAddressByClientCIDR item : items) {V1ServerAddressByClientCIDRBuilder builder = new V1ServerAddressByClientCIDRBuilder(item);_visitables.get("serverAddressByClientCIDRs").remove(builder);if (this.serverAddressByClientCIDRs != null) {this.serverAddressByClientCIDRs.remove(builder);}} return (A)this;
  }
  public A removeAllFromServerAddressByClientCIDRs(Collection<V1ServerAddressByClientCIDR> items) {
    for (V1ServerAddressByClientCIDR item : items) {V1ServerAddressByClientCIDRBuilder builder = new V1ServerAddressByClientCIDRBuilder(item);_visitables.get("serverAddressByClientCIDRs").remove(builder);if (this.serverAddressByClientCIDRs != null) {this.serverAddressByClientCIDRs.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromServerAddressByClientCIDRs(Predicate<V1ServerAddressByClientCIDRBuilder> predicate) {
    if (serverAddressByClientCIDRs == null) return (A) this;
    final Iterator<V1ServerAddressByClientCIDRBuilder> each = serverAddressByClientCIDRs.iterator();
    final List visitables = _visitables.get("serverAddressByClientCIDRs");
    while (each.hasNext()) {
      V1ServerAddressByClientCIDRBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildServerAddressByClientCIDRs instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1ServerAddressByClientCIDR> getServerAddressByClientCIDRs() {
    return serverAddressByClientCIDRs != null ? build(serverAddressByClientCIDRs) : null;
  }
  public List<V1ServerAddressByClientCIDR> buildServerAddressByClientCIDRs() {
    return serverAddressByClientCIDRs != null ? build(serverAddressByClientCIDRs) : null;
  }
  public V1ServerAddressByClientCIDR buildServerAddressByClientCIDR(Integer index) {
    return this.serverAddressByClientCIDRs.get(index).build();
  }
  public V1ServerAddressByClientCIDR buildFirstServerAddressByClientCIDR() {
    return this.serverAddressByClientCIDRs.get(0).build();
  }
  public V1ServerAddressByClientCIDR buildLastServerAddressByClientCIDR() {
    return this.serverAddressByClientCIDRs.get(serverAddressByClientCIDRs.size() - 1).build();
  }
  public V1ServerAddressByClientCIDR buildMatchingServerAddressByClientCIDR(Predicate<V1ServerAddressByClientCIDRBuilder> predicate) {
    for (V1ServerAddressByClientCIDRBuilder item: serverAddressByClientCIDRs) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingServerAddressByClientCIDR(Predicate<V1ServerAddressByClientCIDRBuilder> predicate) {
    for (V1ServerAddressByClientCIDRBuilder item: serverAddressByClientCIDRs) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withServerAddressByClientCIDRs(List<V1ServerAddressByClientCIDR> serverAddressByClientCIDRs) {
    if (this.serverAddressByClientCIDRs != null) { _visitables.get("serverAddressByClientCIDRs").removeAll(this.serverAddressByClientCIDRs);}
    if (serverAddressByClientCIDRs != null) {this.serverAddressByClientCIDRs = new ArrayList(); for (V1ServerAddressByClientCIDR item : serverAddressByClientCIDRs){this.addToServerAddressByClientCIDRs(item);}} else { this.serverAddressByClientCIDRs = null;} return (A) this;
  }
  public A withServerAddressByClientCIDRs(io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR... serverAddressByClientCIDRs) {
    if (this.serverAddressByClientCIDRs != null) {this.serverAddressByClientCIDRs.clear();}
    if (serverAddressByClientCIDRs != null) {for (V1ServerAddressByClientCIDR item :serverAddressByClientCIDRs){ this.addToServerAddressByClientCIDRs(item);}} return (A) this;
  }
  public Boolean hasServerAddressByClientCIDRs() {
    return serverAddressByClientCIDRs != null && !serverAddressByClientCIDRs.isEmpty();
  }
  public V1APIVersionsFluent.ServerAddressByClientCIDRsNested<A> addNewServerAddressByClientCIDR() {
    return new V1APIVersionsFluentImpl.ServerAddressByClientCIDRsNestedImpl();
  }
  public V1APIVersionsFluent.ServerAddressByClientCIDRsNested<A> addNewServerAddressByClientCIDRLike(V1ServerAddressByClientCIDR item) {
    return new V1APIVersionsFluentImpl.ServerAddressByClientCIDRsNestedImpl(-1, item);
  }
  public V1APIVersionsFluent.ServerAddressByClientCIDRsNested<A> setNewServerAddressByClientCIDRLike(Integer index,V1ServerAddressByClientCIDR item) {
    return new V1APIVersionsFluentImpl.ServerAddressByClientCIDRsNestedImpl(index, item);
  }
  public V1APIVersionsFluent.ServerAddressByClientCIDRsNested<A> editServerAddressByClientCIDR(Integer index) {
    if (serverAddressByClientCIDRs.size() <= index) throw new RuntimeException("Can't edit serverAddressByClientCIDRs. Index exceeds size.");
    return setNewServerAddressByClientCIDRLike(index, buildServerAddressByClientCIDR(index));
  }
  public V1APIVersionsFluent.ServerAddressByClientCIDRsNested<A> editFirstServerAddressByClientCIDR() {
    if (serverAddressByClientCIDRs.size() == 0) throw new RuntimeException("Can't edit first serverAddressByClientCIDRs. The list is empty.");
    return setNewServerAddressByClientCIDRLike(0, buildServerAddressByClientCIDR(0));
  }
  public V1APIVersionsFluent.ServerAddressByClientCIDRsNested<A> editLastServerAddressByClientCIDR() {
    int index = serverAddressByClientCIDRs.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last serverAddressByClientCIDRs. The list is empty.");
    return setNewServerAddressByClientCIDRLike(index, buildServerAddressByClientCIDR(index));
  }
  public V1APIVersionsFluent.ServerAddressByClientCIDRsNested<A> editMatchingServerAddressByClientCIDR(Predicate<V1ServerAddressByClientCIDRBuilder> predicate) {
    int index = -1;
    for (int i=0;i<serverAddressByClientCIDRs.size();i++) { 
    if (predicate.test(serverAddressByClientCIDRs.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching serverAddressByClientCIDRs. No match found.");
    return setNewServerAddressByClientCIDRLike(index, buildServerAddressByClientCIDR(index));
  }
  public A addToVersions(Integer index,String item) {
    if (this.versions == null) {this.versions = new ArrayList<String>();}
    this.versions.add(index, item);
    return (A)this;
  }
  public A setToVersions(Integer index,String item) {
    if (this.versions == null) {this.versions = new ArrayList<String>();}
    this.versions.set(index, item); return (A)this;
  }
  public A addToVersions(java.lang.String... items) {
    if (this.versions == null) {this.versions = new ArrayList<String>();}
    for (String item : items) {this.versions.add(item);} return (A)this;
  }
  public A addAllToVersions(Collection<String> items) {
    if (this.versions == null) {this.versions = new ArrayList<String>();}
    for (String item : items) {this.versions.add(item);} return (A)this;
  }
  public A removeFromVersions(java.lang.String... items) {
    for (String item : items) {if (this.versions!= null){ this.versions.remove(item);}} return (A)this;
  }
  public A removeAllFromVersions(Collection<String> items) {
    for (String item : items) {if (this.versions!= null){ this.versions.remove(item);}} return (A)this;
  }
  public List<String> getVersions() {
    return this.versions;
  }
  public String getVersion(Integer index) {
    return this.versions.get(index);
  }
  public String getFirstVersion() {
    return this.versions.get(0);
  }
  public String getLastVersion() {
    return this.versions.get(versions.size() - 1);
  }
  public String getMatchingVersion(Predicate<String> predicate) {
    for (String item: versions) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingVersion(Predicate<String> predicate) {
    for (String item: versions) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withVersions(List<String> versions) {
    if (versions != null) {this.versions = new ArrayList(); for (String item : versions){this.addToVersions(item);}} else { this.versions = null;} return (A) this;
  }
  public A withVersions(java.lang.String... versions) {
    if (this.versions != null) {this.versions.clear();}
    if (versions != null) {for (String item :versions){ this.addToVersions(item);}} return (A) this;
  }
  public Boolean hasVersions() {
    return versions != null && !versions.isEmpty();
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1APIVersionsFluentImpl that = (V1APIVersionsFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
    if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
    if (serverAddressByClientCIDRs != null ? !serverAddressByClientCIDRs.equals(that.serverAddressByClientCIDRs) :that.serverAddressByClientCIDRs != null) return false;
    if (versions != null ? !versions.equals(that.versions) :that.versions != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  kind,  serverAddressByClientCIDRs,  versions,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (serverAddressByClientCIDRs != null && !serverAddressByClientCIDRs.isEmpty()) { sb.append("serverAddressByClientCIDRs:"); sb.append(serverAddressByClientCIDRs + ","); }
    if (versions != null && !versions.isEmpty()) { sb.append("versions:"); sb.append(versions); }
    sb.append("}");
    return sb.toString();
  }
  class ServerAddressByClientCIDRsNestedImpl<N> extends V1ServerAddressByClientCIDRFluentImpl<V1APIVersionsFluent.ServerAddressByClientCIDRsNested<N>> implements V1APIVersionsFluent.ServerAddressByClientCIDRsNested<N>,Nested<N>{
    ServerAddressByClientCIDRsNestedImpl(Integer index,V1ServerAddressByClientCIDR item) {
      this.index = index;
      this.builder = new V1ServerAddressByClientCIDRBuilder(this, item);
    }
    ServerAddressByClientCIDRsNestedImpl() {
      this.index = -1;
      this.builder = new V1ServerAddressByClientCIDRBuilder(this);
    }
    V1ServerAddressByClientCIDRBuilder builder;
    Integer index;
    public N and() {
      return (N) V1APIVersionsFluentImpl.this.setToServerAddressByClientCIDRs(index,builder.build());
    }
    public N endServerAddressByClientCIDR() {
      return and();
    }
    
  }
  
}