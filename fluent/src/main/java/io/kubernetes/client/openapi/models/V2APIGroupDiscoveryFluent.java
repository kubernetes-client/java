/*
Copyright 2026 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V2APIGroupDiscoveryFluent<A extends io.kubernetes.client.openapi.models.V2APIGroupDiscoveryFluent<A>> extends BaseFluent<A>{

  private String apiVersion;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private ArrayList<V2APIVersionDiscoveryBuilder> versions;

  public V2APIGroupDiscoveryFluent() {
  }
  
  public V2APIGroupDiscoveryFluent(V2APIGroupDiscovery instance) {
    this.copyInstance(instance);
  }

  public A addAllToVersions(Collection<V2APIVersionDiscovery> items) {
    if (this.versions == null) {
      this.versions = new ArrayList();
    }
    for (V2APIVersionDiscovery item : items) {
        V2APIVersionDiscoveryBuilder builder = new V2APIVersionDiscoveryBuilder(item);
        this._visitables.get("versions").add(builder);
        this.versions.add(builder);
    }
    return (A) this;
  }
  
  public VersionsNested<A> addNewVersion() {
    return new VersionsNested(-1, null);
  }
  
  public VersionsNested<A> addNewVersionLike(V2APIVersionDiscovery item) {
    return new VersionsNested(-1, item);
  }
  
  public A addToVersions(V2APIVersionDiscovery... items) {
    if (this.versions == null) {
      this.versions = new ArrayList();
    }
    for (V2APIVersionDiscovery item : items) {
        V2APIVersionDiscoveryBuilder builder = new V2APIVersionDiscoveryBuilder(item);
        this._visitables.get("versions").add(builder);
        this.versions.add(builder);
    }
    return (A) this;
  }
  
  public A addToVersions(int index,V2APIVersionDiscovery item) {
    if (this.versions == null) {
      this.versions = new ArrayList();
    }
    V2APIVersionDiscoveryBuilder builder = new V2APIVersionDiscoveryBuilder(item);
    if (index < 0 || index >= this.versions.size()) {
        this._visitables.get("versions").add(builder);
        this.versions.add(builder);
    } else {
        this._visitables.get("versions").add(builder);
        this.versions.add(index, builder);
    }
    return (A) this;
  }
  
  public V2APIVersionDiscovery buildFirstVersion() {
    return this.versions.get(0).build();
  }
  
  public V2APIVersionDiscovery buildLastVersion() {
    return this.versions.get(versions.size() - 1).build();
  }
  
  public V2APIVersionDiscovery buildMatchingVersion(Predicate<V2APIVersionDiscoveryBuilder> predicate) {
      for (V2APIVersionDiscoveryBuilder item : versions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1ObjectMeta buildMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }
  
  public V2APIVersionDiscovery buildVersion(int index) {
    return this.versions.get(index).build();
  }
  
  public List<V2APIVersionDiscovery> buildVersions() {
    return this.versions != null ? build(versions) : null;
  }
  
  protected void copyInstance(V2APIGroupDiscovery instance) {
    instance = instance != null ? instance : new V2APIGroupDiscovery();
    if (instance != null) {
        this.withApiVersion(instance.getApiVersion());
        this.withKind(instance.getKind());
        this.withMetadata(instance.getMetadata());
        this.withVersions(instance.getVersions());
    }
  }
  
  public VersionsNested<A> editFirstVersion() {
    if (versions.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "versions"));
    }
    return this.setNewVersionLike(0, this.buildVersion(0));
  }
  
  public VersionsNested<A> editLastVersion() {
    int index = versions.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "versions"));
    }
    return this.setNewVersionLike(index, this.buildVersion(index));
  }
  
  public VersionsNested<A> editMatchingVersion(Predicate<V2APIVersionDiscoveryBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < versions.size();i++) {
      if (predicate.test(versions.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "versions"));
    }
    return this.setNewVersionLike(index, this.buildVersion(index));
  }
  
  public MetadataNested<A> editMetadata() {
    return this.withNewMetadataLike(Optional.ofNullable(this.buildMetadata()).orElse(null));
  }
  
  public MetadataNested<A> editOrNewMetadata() {
    return this.withNewMetadataLike(Optional.ofNullable(this.buildMetadata()).orElse(new V1ObjectMetaBuilder().build()));
  }
  
  public MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return this.withNewMetadataLike(Optional.ofNullable(this.buildMetadata()).orElse(item));
  }
  
  public VersionsNested<A> editVersion(int index) {
    if (versions.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "versions"));
    }
    return this.setNewVersionLike(index, this.buildVersion(index));
  }
  
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V2APIGroupDiscoveryFluent that = (V2APIGroupDiscoveryFluent) o;
    if (!(Objects.equals(apiVersion, that.apiVersion))) {
      return false;
    }
    if (!(Objects.equals(kind, that.kind))) {
      return false;
    }
    if (!(Objects.equals(metadata, that.metadata))) {
      return false;
    }
    if (!(Objects.equals(versions, that.versions))) {
      return false;
    }
    return true;
  }
  
  public String getApiVersion() {
    return this.apiVersion;
  }
  
  public String getKind() {
    return this.kind;
  }
  
  public boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  
  public boolean hasKind() {
    return this.kind != null;
  }
  
  public boolean hasMatchingVersion(Predicate<V2APIVersionDiscoveryBuilder> predicate) {
      for (V2APIVersionDiscoveryBuilder item : versions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMetadata() {
    return this.metadata != null;
  }
  
  public boolean hasVersions() {
    return this.versions != null && !(this.versions.isEmpty());
  }
  
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, versions);
  }
  
  public A removeAllFromVersions(Collection<V2APIVersionDiscovery> items) {
    if (this.versions == null) {
      return (A) this;
    }
    for (V2APIVersionDiscovery item : items) {
        V2APIVersionDiscoveryBuilder builder = new V2APIVersionDiscoveryBuilder(item);
        _visitables.get("versions").remove(builder);
        this.versions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromVersions(V2APIVersionDiscovery... items) {
    if (this.versions == null) {
      return (A) this;
    }
    for (V2APIVersionDiscovery item : items) {
        V2APIVersionDiscoveryBuilder builder = new V2APIVersionDiscoveryBuilder(item);
        _visitables.get("versions").remove(builder);
        this.versions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromVersions(Predicate<V2APIVersionDiscoveryBuilder> predicate) {
    if (versions == null) {
      return (A) this;
    }
    Iterator<V2APIVersionDiscoveryBuilder> each = versions.iterator();
    List visitables = this._visitables.get("versions");
    while (each.hasNext()) {
        V2APIVersionDiscoveryBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public VersionsNested<A> setNewVersionLike(int index,V2APIVersionDiscovery item) {
    return new VersionsNested(index, item);
  }
  
  public A setToVersions(int index,V2APIVersionDiscovery item) {
    if (this.versions == null) {
      this.versions = new ArrayList();
    }
    V2APIVersionDiscoveryBuilder builder = new V2APIVersionDiscoveryBuilder(item);
    if (index < 0 || index >= this.versions.size()) {
        this._visitables.get("versions").add(builder);
        this.versions.add(builder);
    } else {
        this._visitables.get("versions").add(builder);
        this.versions.set(index, builder);
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(apiVersion == null)) {
        sb.append("apiVersion:");
        sb.append(apiVersion);
        sb.append(",");
    }
    if (!(kind == null)) {
        sb.append("kind:");
        sb.append(kind);
        sb.append(",");
    }
    if (!(metadata == null)) {
        sb.append("metadata:");
        sb.append(metadata);
        sb.append(",");
    }
    if (!(versions == null) && !(versions.isEmpty())) {
        sb.append("versions:");
        sb.append(versions);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }
  
  public A withKind(String kind) {
    this.kind = kind;
    return (A) this;
  }
  
  public A withMetadata(V1ObjectMeta metadata) {
    this._visitables.remove("metadata");
    if (metadata != null) {
        this.metadata = new V1ObjectMetaBuilder(metadata);
        this._visitables.get("metadata").add(this.metadata);
    } else {
        this.metadata = null;
        this._visitables.get("metadata").remove(this.metadata);
    }
    return (A) this;
  }
  
  public MetadataNested<A> withNewMetadata() {
    return new MetadataNested(null);
  }
  
  public MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new MetadataNested(item);
  }
  
  public A withVersions(List<V2APIVersionDiscovery> versions) {
    if (this.versions != null) {
      this._visitables.get("versions").clear();
    }
    if (versions != null) {
        this.versions = new ArrayList();
        for (V2APIVersionDiscovery item : versions) {
          this.addToVersions(item);
        }
    } else {
      this.versions = null;
    }
    return (A) this;
  }
  
  public A withVersions(V2APIVersionDiscovery... versions) {
    if (this.versions != null) {
        this.versions.clear();
        _visitables.remove("versions");
    }
    if (versions != null) {
      for (V2APIVersionDiscovery item : versions) {
        this.addToVersions(item);
      }
    }
    return (A) this;
  }
  public class MetadataNested<N> extends V1ObjectMetaFluent<MetadataNested<N>> implements Nested<N>{
  
    V1ObjectMetaBuilder builder;
  
    MetadataNested(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
  
    public N and() {
      return (N) V2APIGroupDiscoveryFluent.this.withMetadata(builder.build());
    }
    
    public N endMetadata() {
      return and();
    }
    
  }
  public class VersionsNested<N> extends V2APIVersionDiscoveryFluent<VersionsNested<N>> implements Nested<N>{
  
    V2APIVersionDiscoveryBuilder builder;
    int index;
  
    VersionsNested(int index,V2APIVersionDiscovery item) {
      this.index = index;
      this.builder = new V2APIVersionDiscoveryBuilder(this, item);
    }
  
    public N and() {
      return (N) V2APIGroupDiscoveryFluent.this.setToVersions(index, builder.build());
    }
    
    public N endVersion() {
      return and();
    }
    
  }
}