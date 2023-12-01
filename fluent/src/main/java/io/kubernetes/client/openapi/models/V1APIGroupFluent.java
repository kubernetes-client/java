package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1APIGroupFluent<A extends V1APIGroupFluent<A>> extends BaseFluent<A>{
  public V1APIGroupFluent() {
  }
  
  public V1APIGroupFluent(V1APIGroup instance) {
    this.copyInstance(instance);
  }
  private String apiVersion;
  private String kind;
  private String name;
  private V1GroupVersionForDiscoveryBuilder preferredVersion;
  private ArrayList<V1ServerAddressByClientCIDRBuilder> serverAddressByClientCIDRs;
  private ArrayList<V1GroupVersionForDiscoveryBuilder> versions;
  
  protected void copyInstance(V1APIGroup instance) {
    instance = (instance != null ? instance : new V1APIGroup());
    if (instance != null) {
          this.withApiVersion(instance.getApiVersion());
          this.withKind(instance.getKind());
          this.withName(instance.getName());
          this.withPreferredVersion(instance.getPreferredVersion());
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
  
  public String getName() {
    return this.name;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public V1GroupVersionForDiscovery buildPreferredVersion() {
    return this.preferredVersion != null ? this.preferredVersion.build() : null;
  }
  
  public A withPreferredVersion(V1GroupVersionForDiscovery preferredVersion) {
    this._visitables.remove("preferredVersion");
    if (preferredVersion != null) {
        this.preferredVersion = new V1GroupVersionForDiscoveryBuilder(preferredVersion);
        this._visitables.get("preferredVersion").add(this.preferredVersion);
    } else {
        this.preferredVersion = null;
        this._visitables.get("preferredVersion").remove(this.preferredVersion);
    }
    return (A) this;
  }
  
  public boolean hasPreferredVersion() {
    return this.preferredVersion != null;
  }
  
  public PreferredVersionNested<A> withNewPreferredVersion() {
    return new PreferredVersionNested(null);
  }
  
  public PreferredVersionNested<A> withNewPreferredVersionLike(V1GroupVersionForDiscovery item) {
    return new PreferredVersionNested(item);
  }
  
  public PreferredVersionNested<A> editPreferredVersion() {
    return withNewPreferredVersionLike(java.util.Optional.ofNullable(buildPreferredVersion()).orElse(null));
  }
  
  public PreferredVersionNested<A> editOrNewPreferredVersion() {
    return withNewPreferredVersionLike(java.util.Optional.ofNullable(buildPreferredVersion()).orElse(new V1GroupVersionForDiscoveryBuilder().build()));
  }
  
  public PreferredVersionNested<A> editOrNewPreferredVersionLike(V1GroupVersionForDiscovery item) {
    return withNewPreferredVersionLike(java.util.Optional.ofNullable(buildPreferredVersion()).orElse(item));
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
  
  public A addToVersions(int index,V1GroupVersionForDiscovery item) {
    if (this.versions == null) {this.versions = new ArrayList<V1GroupVersionForDiscoveryBuilder>();}
    V1GroupVersionForDiscoveryBuilder builder = new V1GroupVersionForDiscoveryBuilder(item);
    if (index < 0 || index >= versions.size()) { _visitables.get("versions").add(builder); versions.add(builder); } else { _visitables.get("versions").add(index, builder); versions.add(index, builder);}
    return (A)this;
  }
  
  public A setToVersions(int index,V1GroupVersionForDiscovery item) {
    if (this.versions == null) {this.versions = new ArrayList<V1GroupVersionForDiscoveryBuilder>();}
    V1GroupVersionForDiscoveryBuilder builder = new V1GroupVersionForDiscoveryBuilder(item);
    if (index < 0 || index >= versions.size()) { _visitables.get("versions").add(builder); versions.add(builder); } else { _visitables.get("versions").set(index, builder); versions.set(index, builder);}
    return (A)this;
  }
  
  public A addToVersions(io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery... items) {
    if (this.versions == null) {this.versions = new ArrayList<V1GroupVersionForDiscoveryBuilder>();}
    for (V1GroupVersionForDiscovery item : items) {V1GroupVersionForDiscoveryBuilder builder = new V1GroupVersionForDiscoveryBuilder(item);_visitables.get("versions").add(builder);this.versions.add(builder);} return (A)this;
  }
  
  public A addAllToVersions(Collection<V1GroupVersionForDiscovery> items) {
    if (this.versions == null) {this.versions = new ArrayList<V1GroupVersionForDiscoveryBuilder>();}
    for (V1GroupVersionForDiscovery item : items) {V1GroupVersionForDiscoveryBuilder builder = new V1GroupVersionForDiscoveryBuilder(item);_visitables.get("versions").add(builder);this.versions.add(builder);} return (A)this;
  }
  
  public A removeFromVersions(io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery... items) {
    if (this.versions == null) return (A)this;
    for (V1GroupVersionForDiscovery item : items) {V1GroupVersionForDiscoveryBuilder builder = new V1GroupVersionForDiscoveryBuilder(item);_visitables.get("versions").remove(builder); this.versions.remove(builder);} return (A)this;
  }
  
  public A removeAllFromVersions(Collection<V1GroupVersionForDiscovery> items) {
    if (this.versions == null) return (A)this;
    for (V1GroupVersionForDiscovery item : items) {V1GroupVersionForDiscoveryBuilder builder = new V1GroupVersionForDiscoveryBuilder(item);_visitables.get("versions").remove(builder); this.versions.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromVersions(Predicate<V1GroupVersionForDiscoveryBuilder> predicate) {
    if (versions == null) return (A) this;
    final Iterator<V1GroupVersionForDiscoveryBuilder> each = versions.iterator();
    final List visitables = _visitables.get("versions");
    while (each.hasNext()) {
      V1GroupVersionForDiscoveryBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1GroupVersionForDiscovery> buildVersions() {
    return this.versions != null ? build(versions) : null;
  }
  
  public V1GroupVersionForDiscovery buildVersion(int index) {
    return this.versions.get(index).build();
  }
  
  public V1GroupVersionForDiscovery buildFirstVersion() {
    return this.versions.get(0).build();
  }
  
  public V1GroupVersionForDiscovery buildLastVersion() {
    return this.versions.get(versions.size() - 1).build();
  }
  
  public V1GroupVersionForDiscovery buildMatchingVersion(Predicate<V1GroupVersionForDiscoveryBuilder> predicate) {
      for (V1GroupVersionForDiscoveryBuilder item : versions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingVersion(Predicate<V1GroupVersionForDiscoveryBuilder> predicate) {
      for (V1GroupVersionForDiscoveryBuilder item : versions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withVersions(List<V1GroupVersionForDiscovery> versions) {
    if (this.versions != null) {
      this._visitables.get("versions").clear();
    }
    if (versions != null) {
        this.versions = new ArrayList();
        for (V1GroupVersionForDiscovery item : versions) {
          this.addToVersions(item);
        }
    } else {
      this.versions = null;
    }
    return (A) this;
  }
  
  public A withVersions(io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery... versions) {
    if (this.versions != null) {
        this.versions.clear();
        _visitables.remove("versions");
    }
    if (versions != null) {
      for (V1GroupVersionForDiscovery item : versions) {
        this.addToVersions(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasVersions() {
    return this.versions != null && !this.versions.isEmpty();
  }
  
  public VersionsNested<A> addNewVersion() {
    return new VersionsNested(-1, null);
  }
  
  public VersionsNested<A> addNewVersionLike(V1GroupVersionForDiscovery item) {
    return new VersionsNested(-1, item);
  }
  
  public VersionsNested<A> setNewVersionLike(int index,V1GroupVersionForDiscovery item) {
    return new VersionsNested(index, item);
  }
  
  public VersionsNested<A> editVersion(int index) {
    if (versions.size() <= index) throw new RuntimeException("Can't edit versions. Index exceeds size.");
    return setNewVersionLike(index, buildVersion(index));
  }
  
  public VersionsNested<A> editFirstVersion() {
    if (versions.size() == 0) throw new RuntimeException("Can't edit first versions. The list is empty.");
    return setNewVersionLike(0, buildVersion(0));
  }
  
  public VersionsNested<A> editLastVersion() {
    int index = versions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last versions. The list is empty.");
    return setNewVersionLike(index, buildVersion(index));
  }
  
  public VersionsNested<A> editMatchingVersion(Predicate<V1GroupVersionForDiscoveryBuilder> predicate) {
    int index = -1;
    for (int i=0;i<versions.size();i++) { 
    if (predicate.test(versions.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching versions. No match found.");
    return setNewVersionLike(index, buildVersion(index));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1APIGroupFluent that = (V1APIGroupFluent) o;
    if (!java.util.Objects.equals(apiVersion, that.apiVersion)) return false;
    if (!java.util.Objects.equals(kind, that.kind)) return false;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(preferredVersion, that.preferredVersion)) return false;
    if (!java.util.Objects.equals(serverAddressByClientCIDRs, that.serverAddressByClientCIDRs)) return false;
    if (!java.util.Objects.equals(versions, that.versions)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  kind,  name,  preferredVersion,  serverAddressByClientCIDRs,  versions,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (preferredVersion != null) { sb.append("preferredVersion:"); sb.append(preferredVersion + ","); }
    if (serverAddressByClientCIDRs != null && !serverAddressByClientCIDRs.isEmpty()) { sb.append("serverAddressByClientCIDRs:"); sb.append(serverAddressByClientCIDRs + ","); }
    if (versions != null && !versions.isEmpty()) { sb.append("versions:"); sb.append(versions); }
    sb.append("}");
    return sb.toString();
  }
  public class PreferredVersionNested<N> extends V1GroupVersionForDiscoveryFluent<PreferredVersionNested<N>> implements Nested<N>{
    PreferredVersionNested(V1GroupVersionForDiscovery item) {
      this.builder = new V1GroupVersionForDiscoveryBuilder(this, item);
    }
    V1GroupVersionForDiscoveryBuilder builder;
    
    public N and() {
      return (N) V1APIGroupFluent.this.withPreferredVersion(builder.build());
    }
    
    public N endPreferredVersion() {
      return and();
    }
    
  
  }
  public class ServerAddressByClientCIDRsNested<N> extends V1ServerAddressByClientCIDRFluent<ServerAddressByClientCIDRsNested<N>> implements Nested<N>{
    ServerAddressByClientCIDRsNested(int index,V1ServerAddressByClientCIDR item) {
      this.index = index;
      this.builder = new V1ServerAddressByClientCIDRBuilder(this, item);
    }
    V1ServerAddressByClientCIDRBuilder builder;
    int index;
    
    public N and() {
      return (N) V1APIGroupFluent.this.setToServerAddressByClientCIDRs(index,builder.build());
    }
    
    public N endServerAddressByClientCIDR() {
      return and();
    }
    
  
  }
  public class VersionsNested<N> extends V1GroupVersionForDiscoveryFluent<VersionsNested<N>> implements Nested<N>{
    VersionsNested(int index,V1GroupVersionForDiscovery item) {
      this.index = index;
      this.builder = new V1GroupVersionForDiscoveryBuilder(this, item);
    }
    V1GroupVersionForDiscoveryBuilder builder;
    int index;
    
    public N and() {
      return (N) V1APIGroupFluent.this.setToVersions(index,builder.build());
    }
    
    public N endVersion() {
      return and();
    }
    
  
  }

}