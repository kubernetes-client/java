package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1APIVersionsFluent<A extends V1APIVersionsFluent<A>> extends BaseFluent<A>{
  public V1APIVersionsFluent() {
  }
  
  public V1APIVersionsFluent(V1APIVersions instance) {
    this.copyInstance(instance);
  }
  private String apiVersion;
  private String kind;
  private ArrayList<V1ServerAddressByClientCIDRBuilder> serverAddressByClientCIDRs;
  private List<String> versions;
  
  protected void copyInstance(V1APIVersions instance) {
    instance = (instance != null ? instance : new V1APIVersions());
    if (instance != null) {
          this.withApiVersion(instance.getApiVersion());
          this.withKind(instance.getKind());
          this.withServerAddressByClientCIDRs(instance.getServerAddressByClientCIDRs());
          this.withVersions(instance.getVersions());
        }
  }
  
  public String getApiVersion() {
    return this.apiVersion;
  }
  
  public A withApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }
  
  public boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  
  public String getKind() {
    return this.kind;
  }
  
  public A withKind(String kind) {
    this.kind = kind;
    return (A) this;
  }
  
  public boolean hasKind() {
    return this.kind != null;
  }
  
  public A addToServerAddressByClientCIDRs(int index,V1ServerAddressByClientCIDR item) {
    if (this.serverAddressByClientCIDRs == null) {this.serverAddressByClientCIDRs = new ArrayList<V1ServerAddressByClientCIDRBuilder>();}
    V1ServerAddressByClientCIDRBuilder builder = new V1ServerAddressByClientCIDRBuilder(item);
    if (index < 0 || index >= serverAddressByClientCIDRs.size()) { _visitables.get("serverAddressByClientCIDRs").add(builder); serverAddressByClientCIDRs.add(builder); } else { _visitables.get("serverAddressByClientCIDRs").add(index, builder); serverAddressByClientCIDRs.add(index, builder);}
    return (A)this;
  }
  
  public A setToServerAddressByClientCIDRs(int index,V1ServerAddressByClientCIDR item) {
    if (this.serverAddressByClientCIDRs == null) {this.serverAddressByClientCIDRs = new ArrayList<V1ServerAddressByClientCIDRBuilder>();}
    V1ServerAddressByClientCIDRBuilder builder = new V1ServerAddressByClientCIDRBuilder(item);
    if (index < 0 || index >= serverAddressByClientCIDRs.size()) { _visitables.get("serverAddressByClientCIDRs").add(builder); serverAddressByClientCIDRs.add(builder); } else { _visitables.get("serverAddressByClientCIDRs").set(index, builder); serverAddressByClientCIDRs.set(index, builder);}
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
    if (this.serverAddressByClientCIDRs == null) return (A)this;
    for (V1ServerAddressByClientCIDR item : items) {V1ServerAddressByClientCIDRBuilder builder = new V1ServerAddressByClientCIDRBuilder(item);_visitables.get("serverAddressByClientCIDRs").remove(builder); this.serverAddressByClientCIDRs.remove(builder);} return (A)this;
  }
  
  public A removeAllFromServerAddressByClientCIDRs(Collection<V1ServerAddressByClientCIDR> items) {
    if (this.serverAddressByClientCIDRs == null) return (A)this;
    for (V1ServerAddressByClientCIDR item : items) {V1ServerAddressByClientCIDRBuilder builder = new V1ServerAddressByClientCIDRBuilder(item);_visitables.get("serverAddressByClientCIDRs").remove(builder); this.serverAddressByClientCIDRs.remove(builder);} return (A)this;
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
  
  public List<V1ServerAddressByClientCIDR> buildServerAddressByClientCIDRs() {
    return this.serverAddressByClientCIDRs != null ? build(serverAddressByClientCIDRs) : null;
  }
  
  public V1ServerAddressByClientCIDR buildServerAddressByClientCIDR(int index) {
    return this.serverAddressByClientCIDRs.get(index).build();
  }
  
  public V1ServerAddressByClientCIDR buildFirstServerAddressByClientCIDR() {
    return this.serverAddressByClientCIDRs.get(0).build();
  }
  
  public V1ServerAddressByClientCIDR buildLastServerAddressByClientCIDR() {
    return this.serverAddressByClientCIDRs.get(serverAddressByClientCIDRs.size() - 1).build();
  }
  
  public V1ServerAddressByClientCIDR buildMatchingServerAddressByClientCIDR(Predicate<V1ServerAddressByClientCIDRBuilder> predicate) {
      for (V1ServerAddressByClientCIDRBuilder item : serverAddressByClientCIDRs) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingServerAddressByClientCIDR(Predicate<V1ServerAddressByClientCIDRBuilder> predicate) {
      for (V1ServerAddressByClientCIDRBuilder item : serverAddressByClientCIDRs) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withServerAddressByClientCIDRs(List<V1ServerAddressByClientCIDR> serverAddressByClientCIDRs) {
    if (this.serverAddressByClientCIDRs != null) {
      this._visitables.get("serverAddressByClientCIDRs").clear();
    }
    if (serverAddressByClientCIDRs != null) {
        this.serverAddressByClientCIDRs = new ArrayList();
        for (V1ServerAddressByClientCIDR item : serverAddressByClientCIDRs) {
          this.addToServerAddressByClientCIDRs(item);
        }
    } else {
      this.serverAddressByClientCIDRs = null;
    }
    return (A) this;
  }
  
  public A withServerAddressByClientCIDRs(io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR... serverAddressByClientCIDRs) {
    if (this.serverAddressByClientCIDRs != null) {
        this.serverAddressByClientCIDRs.clear();
        _visitables.remove("serverAddressByClientCIDRs");
    }
    if (serverAddressByClientCIDRs != null) {
      for (V1ServerAddressByClientCIDR item : serverAddressByClientCIDRs) {
        this.addToServerAddressByClientCIDRs(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasServerAddressByClientCIDRs() {
    return this.serverAddressByClientCIDRs != null && !this.serverAddressByClientCIDRs.isEmpty();
  }
  
  public ServerAddressByClientCIDRsNested<A> addNewServerAddressByClientCIDR() {
    return new ServerAddressByClientCIDRsNested(-1, null);
  }
  
  public ServerAddressByClientCIDRsNested<A> addNewServerAddressByClientCIDRLike(V1ServerAddressByClientCIDR item) {
    return new ServerAddressByClientCIDRsNested(-1, item);
  }
  
  public ServerAddressByClientCIDRsNested<A> setNewServerAddressByClientCIDRLike(int index,V1ServerAddressByClientCIDR item) {
    return new ServerAddressByClientCIDRsNested(index, item);
  }
  
  public ServerAddressByClientCIDRsNested<A> editServerAddressByClientCIDR(int index) {
    if (serverAddressByClientCIDRs.size() <= index) throw new RuntimeException("Can't edit serverAddressByClientCIDRs. Index exceeds size.");
    return setNewServerAddressByClientCIDRLike(index, buildServerAddressByClientCIDR(index));
  }
  
  public ServerAddressByClientCIDRsNested<A> editFirstServerAddressByClientCIDR() {
    if (serverAddressByClientCIDRs.size() == 0) throw new RuntimeException("Can't edit first serverAddressByClientCIDRs. The list is empty.");
    return setNewServerAddressByClientCIDRLike(0, buildServerAddressByClientCIDR(0));
  }
  
  public ServerAddressByClientCIDRsNested<A> editLastServerAddressByClientCIDR() {
    int index = serverAddressByClientCIDRs.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last serverAddressByClientCIDRs. The list is empty.");
    return setNewServerAddressByClientCIDRLike(index, buildServerAddressByClientCIDR(index));
  }
  
  public ServerAddressByClientCIDRsNested<A> editMatchingServerAddressByClientCIDR(Predicate<V1ServerAddressByClientCIDRBuilder> predicate) {
    int index = -1;
    for (int i=0;i<serverAddressByClientCIDRs.size();i++) { 
    if (predicate.test(serverAddressByClientCIDRs.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching serverAddressByClientCIDRs. No match found.");
    return setNewServerAddressByClientCIDRLike(index, buildServerAddressByClientCIDR(index));
  }
  
  public A addToVersions(int index,String item) {
    if (this.versions == null) {this.versions = new ArrayList<String>();}
    this.versions.add(index, item);
    return (A)this;
  }
  
  public A setToVersions(int index,String item) {
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
    if (this.versions == null) return (A)this;
    for (String item : items) { this.versions.remove(item);} return (A)this;
  }
  
  public A removeAllFromVersions(Collection<String> items) {
    if (this.versions == null) return (A)this;
    for (String item : items) { this.versions.remove(item);} return (A)this;
  }
  
  public List<String> getVersions() {
    return this.versions;
  }
  
  public String getVersion(int index) {
    return this.versions.get(index);
  }
  
  public String getFirstVersion() {
    return this.versions.get(0);
  }
  
  public String getLastVersion() {
    return this.versions.get(versions.size() - 1);
  }
  
  public String getMatchingVersion(Predicate<String> predicate) {
      for (String item : versions) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingVersion(Predicate<String> predicate) {
      for (String item : versions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withVersions(List<String> versions) {
    if (versions != null) {
        this.versions = new ArrayList();
        for (String item : versions) {
          this.addToVersions(item);
        }
    } else {
      this.versions = null;
    }
    return (A) this;
  }
  
  public A withVersions(java.lang.String... versions) {
    if (this.versions != null) {
        this.versions.clear();
        _visitables.remove("versions");
    }
    if (versions != null) {
      for (String item : versions) {
        this.addToVersions(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasVersions() {
    return this.versions != null && !this.versions.isEmpty();
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1APIVersionsFluent that = (V1APIVersionsFluent) o;
    if (!java.util.Objects.equals(apiVersion, that.apiVersion)) return false;
    if (!java.util.Objects.equals(kind, that.kind)) return false;
    if (!java.util.Objects.equals(serverAddressByClientCIDRs, that.serverAddressByClientCIDRs)) return false;
    if (!java.util.Objects.equals(versions, that.versions)) return false;
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
  public class ServerAddressByClientCIDRsNested<N> extends V1ServerAddressByClientCIDRFluent<ServerAddressByClientCIDRsNested<N>> implements Nested<N>{
    ServerAddressByClientCIDRsNested(int index,V1ServerAddressByClientCIDR item) {
      this.index = index;
      this.builder = new V1ServerAddressByClientCIDRBuilder(this, item);
    }
    V1ServerAddressByClientCIDRBuilder builder;
    int index;
    
    public N and() {
      return (N) V1APIVersionsFluent.this.setToServerAddressByClientCIDRs(index,builder.build());
    }
    
    public N endServerAddressByClientCIDR() {
      return and();
    }
    
  
  }

}