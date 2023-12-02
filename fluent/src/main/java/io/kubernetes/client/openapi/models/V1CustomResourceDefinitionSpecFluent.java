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
import java.lang.Boolean;
import java.util.Collection;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1CustomResourceDefinitionSpecFluent<A extends V1CustomResourceDefinitionSpecFluent<A>> extends BaseFluent<A>{
  public V1CustomResourceDefinitionSpecFluent() {
  }
  
  public V1CustomResourceDefinitionSpecFluent(V1CustomResourceDefinitionSpec instance) {
    this.copyInstance(instance);
  }
  private V1CustomResourceConversionBuilder conversion;
  private String group;
  private V1CustomResourceDefinitionNamesBuilder names;
  private Boolean preserveUnknownFields;
  private String scope;
  private ArrayList<V1CustomResourceDefinitionVersionBuilder> versions;
  
  protected void copyInstance(V1CustomResourceDefinitionSpec instance) {
    instance = (instance != null ? instance : new V1CustomResourceDefinitionSpec());
    if (instance != null) {
          this.withConversion(instance.getConversion());
          this.withGroup(instance.getGroup());
          this.withNames(instance.getNames());
          this.withPreserveUnknownFields(instance.getPreserveUnknownFields());
          this.withScope(instance.getScope());
          this.withVersions(instance.getVersions());
        }
  }
  
  public V1CustomResourceConversion buildConversion() {
    return this.conversion != null ? this.conversion.build() : null;
  }
  
  public A withConversion(V1CustomResourceConversion conversion) {
    this._visitables.remove("conversion");
    if (conversion != null) {
        this.conversion = new V1CustomResourceConversionBuilder(conversion);
        this._visitables.get("conversion").add(this.conversion);
    } else {
        this.conversion = null;
        this._visitables.get("conversion").remove(this.conversion);
    }
    return (A) this;
  }
  
  public boolean hasConversion() {
    return this.conversion != null;
  }
  
  public ConversionNested<A> withNewConversion() {
    return new ConversionNested(null);
  }
  
  public ConversionNested<A> withNewConversionLike(V1CustomResourceConversion item) {
    return new ConversionNested(item);
  }
  
  public ConversionNested<A> editConversion() {
    return withNewConversionLike(java.util.Optional.ofNullable(buildConversion()).orElse(null));
  }
  
  public ConversionNested<A> editOrNewConversion() {
    return withNewConversionLike(java.util.Optional.ofNullable(buildConversion()).orElse(new V1CustomResourceConversionBuilder().build()));
  }
  
  public ConversionNested<A> editOrNewConversionLike(V1CustomResourceConversion item) {
    return withNewConversionLike(java.util.Optional.ofNullable(buildConversion()).orElse(item));
  }
  
  public String getGroup() {
    return this.group;
  }
  
  public A withGroup(String group) {
    this.group = group;
    return (A) this;
  }
  
  public boolean hasGroup() {
    return this.group != null;
  }
  
  public V1CustomResourceDefinitionNames buildNames() {
    return this.names != null ? this.names.build() : null;
  }
  
  public A withNames(V1CustomResourceDefinitionNames names) {
    this._visitables.remove("names");
    if (names != null) {
        this.names = new V1CustomResourceDefinitionNamesBuilder(names);
        this._visitables.get("names").add(this.names);
    } else {
        this.names = null;
        this._visitables.get("names").remove(this.names);
    }
    return (A) this;
  }
  
  public boolean hasNames() {
    return this.names != null;
  }
  
  public NamesNested<A> withNewNames() {
    return new NamesNested(null);
  }
  
  public NamesNested<A> withNewNamesLike(V1CustomResourceDefinitionNames item) {
    return new NamesNested(item);
  }
  
  public NamesNested<A> editNames() {
    return withNewNamesLike(java.util.Optional.ofNullable(buildNames()).orElse(null));
  }
  
  public NamesNested<A> editOrNewNames() {
    return withNewNamesLike(java.util.Optional.ofNullable(buildNames()).orElse(new V1CustomResourceDefinitionNamesBuilder().build()));
  }
  
  public NamesNested<A> editOrNewNamesLike(V1CustomResourceDefinitionNames item) {
    return withNewNamesLike(java.util.Optional.ofNullable(buildNames()).orElse(item));
  }
  
  public Boolean getPreserveUnknownFields() {
    return this.preserveUnknownFields;
  }
  
  public A withPreserveUnknownFields(Boolean preserveUnknownFields) {
    this.preserveUnknownFields = preserveUnknownFields;
    return (A) this;
  }
  
  public boolean hasPreserveUnknownFields() {
    return this.preserveUnknownFields != null;
  }
  
  public String getScope() {
    return this.scope;
  }
  
  public A withScope(String scope) {
    this.scope = scope;
    return (A) this;
  }
  
  public boolean hasScope() {
    return this.scope != null;
  }
  
  public A addToVersions(int index,V1CustomResourceDefinitionVersion item) {
    if (this.versions == null) {this.versions = new ArrayList<V1CustomResourceDefinitionVersionBuilder>();}
    V1CustomResourceDefinitionVersionBuilder builder = new V1CustomResourceDefinitionVersionBuilder(item);
    if (index < 0 || index >= versions.size()) { _visitables.get("versions").add(builder); versions.add(builder); } else { _visitables.get("versions").add(index, builder); versions.add(index, builder);}
    return (A)this;
  }
  
  public A setToVersions(int index,V1CustomResourceDefinitionVersion item) {
    if (this.versions == null) {this.versions = new ArrayList<V1CustomResourceDefinitionVersionBuilder>();}
    V1CustomResourceDefinitionVersionBuilder builder = new V1CustomResourceDefinitionVersionBuilder(item);
    if (index < 0 || index >= versions.size()) { _visitables.get("versions").add(builder); versions.add(builder); } else { _visitables.get("versions").set(index, builder); versions.set(index, builder);}
    return (A)this;
  }
  
  public A addToVersions(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion... items) {
    if (this.versions == null) {this.versions = new ArrayList<V1CustomResourceDefinitionVersionBuilder>();}
    for (V1CustomResourceDefinitionVersion item : items) {V1CustomResourceDefinitionVersionBuilder builder = new V1CustomResourceDefinitionVersionBuilder(item);_visitables.get("versions").add(builder);this.versions.add(builder);} return (A)this;
  }
  
  public A addAllToVersions(Collection<V1CustomResourceDefinitionVersion> items) {
    if (this.versions == null) {this.versions = new ArrayList<V1CustomResourceDefinitionVersionBuilder>();}
    for (V1CustomResourceDefinitionVersion item : items) {V1CustomResourceDefinitionVersionBuilder builder = new V1CustomResourceDefinitionVersionBuilder(item);_visitables.get("versions").add(builder);this.versions.add(builder);} return (A)this;
  }
  
  public A removeFromVersions(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion... items) {
    if (this.versions == null) return (A)this;
    for (V1CustomResourceDefinitionVersion item : items) {V1CustomResourceDefinitionVersionBuilder builder = new V1CustomResourceDefinitionVersionBuilder(item);_visitables.get("versions").remove(builder); this.versions.remove(builder);} return (A)this;
  }
  
  public A removeAllFromVersions(Collection<V1CustomResourceDefinitionVersion> items) {
    if (this.versions == null) return (A)this;
    for (V1CustomResourceDefinitionVersion item : items) {V1CustomResourceDefinitionVersionBuilder builder = new V1CustomResourceDefinitionVersionBuilder(item);_visitables.get("versions").remove(builder); this.versions.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromVersions(Predicate<V1CustomResourceDefinitionVersionBuilder> predicate) {
    if (versions == null) return (A) this;
    final Iterator<V1CustomResourceDefinitionVersionBuilder> each = versions.iterator();
    final List visitables = _visitables.get("versions");
    while (each.hasNext()) {
      V1CustomResourceDefinitionVersionBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1CustomResourceDefinitionVersion> buildVersions() {
    return this.versions != null ? build(versions) : null;
  }
  
  public V1CustomResourceDefinitionVersion buildVersion(int index) {
    return this.versions.get(index).build();
  }
  
  public V1CustomResourceDefinitionVersion buildFirstVersion() {
    return this.versions.get(0).build();
  }
  
  public V1CustomResourceDefinitionVersion buildLastVersion() {
    return this.versions.get(versions.size() - 1).build();
  }
  
  public V1CustomResourceDefinitionVersion buildMatchingVersion(Predicate<V1CustomResourceDefinitionVersionBuilder> predicate) {
      for (V1CustomResourceDefinitionVersionBuilder item : versions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingVersion(Predicate<V1CustomResourceDefinitionVersionBuilder> predicate) {
      for (V1CustomResourceDefinitionVersionBuilder item : versions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withVersions(List<V1CustomResourceDefinitionVersion> versions) {
    if (this.versions != null) {
      this._visitables.get("versions").clear();
    }
    if (versions != null) {
        this.versions = new ArrayList();
        for (V1CustomResourceDefinitionVersion item : versions) {
          this.addToVersions(item);
        }
    } else {
      this.versions = null;
    }
    return (A) this;
  }
  
  public A withVersions(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion... versions) {
    if (this.versions != null) {
        this.versions.clear();
        _visitables.remove("versions");
    }
    if (versions != null) {
      for (V1CustomResourceDefinitionVersion item : versions) {
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
  
  public VersionsNested<A> addNewVersionLike(V1CustomResourceDefinitionVersion item) {
    return new VersionsNested(-1, item);
  }
  
  public VersionsNested<A> setNewVersionLike(int index,V1CustomResourceDefinitionVersion item) {
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
  
  public VersionsNested<A> editMatchingVersion(Predicate<V1CustomResourceDefinitionVersionBuilder> predicate) {
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
    V1CustomResourceDefinitionSpecFluent that = (V1CustomResourceDefinitionSpecFluent) o;
    if (!java.util.Objects.equals(conversion, that.conversion)) return false;
    if (!java.util.Objects.equals(group, that.group)) return false;
    if (!java.util.Objects.equals(names, that.names)) return false;
    if (!java.util.Objects.equals(preserveUnknownFields, that.preserveUnknownFields)) return false;
    if (!java.util.Objects.equals(scope, that.scope)) return false;
    if (!java.util.Objects.equals(versions, that.versions)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(conversion,  group,  names,  preserveUnknownFields,  scope,  versions,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (conversion != null) { sb.append("conversion:"); sb.append(conversion + ","); }
    if (group != null) { sb.append("group:"); sb.append(group + ","); }
    if (names != null) { sb.append("names:"); sb.append(names + ","); }
    if (preserveUnknownFields != null) { sb.append("preserveUnknownFields:"); sb.append(preserveUnknownFields + ","); }
    if (scope != null) { sb.append("scope:"); sb.append(scope + ","); }
    if (versions != null && !versions.isEmpty()) { sb.append("versions:"); sb.append(versions); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withPreserveUnknownFields() {
    return withPreserveUnknownFields(true);
  }
  public class ConversionNested<N> extends V1CustomResourceConversionFluent<ConversionNested<N>> implements Nested<N>{
    ConversionNested(V1CustomResourceConversion item) {
      this.builder = new V1CustomResourceConversionBuilder(this, item);
    }
    V1CustomResourceConversionBuilder builder;
    
    public N and() {
      return (N) V1CustomResourceDefinitionSpecFluent.this.withConversion(builder.build());
    }
    
    public N endConversion() {
      return and();
    }
    
  
  }
  public class NamesNested<N> extends V1CustomResourceDefinitionNamesFluent<NamesNested<N>> implements Nested<N>{
    NamesNested(V1CustomResourceDefinitionNames item) {
      this.builder = new V1CustomResourceDefinitionNamesBuilder(this, item);
    }
    V1CustomResourceDefinitionNamesBuilder builder;
    
    public N and() {
      return (N) V1CustomResourceDefinitionSpecFluent.this.withNames(builder.build());
    }
    
    public N endNames() {
      return and();
    }
    
  
  }
  public class VersionsNested<N> extends V1CustomResourceDefinitionVersionFluent<VersionsNested<N>> implements Nested<N>{
    VersionsNested(int index,V1CustomResourceDefinitionVersion item) {
      this.index = index;
      this.builder = new V1CustomResourceDefinitionVersionBuilder(this, item);
    }
    V1CustomResourceDefinitionVersionBuilder builder;
    int index;
    
    public N and() {
      return (N) V1CustomResourceDefinitionSpecFluent.this.setToVersions(index,builder.build());
    }
    
    public N endVersion() {
      return and();
    }
    
  
  }

}