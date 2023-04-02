package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Collection;
import java.lang.Object;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1CustomResourceDefinitionSpecFluentImpl<A extends V1CustomResourceDefinitionSpecFluent<A>> extends BaseFluent<A> implements V1CustomResourceDefinitionSpecFluent<A>{
  public V1CustomResourceDefinitionSpecFluentImpl() {
  }
  public V1CustomResourceDefinitionSpecFluentImpl(V1CustomResourceDefinitionSpec instance) {
    this.withConversion(instance.getConversion());

    this.withGroup(instance.getGroup());

    this.withNames(instance.getNames());

    this.withPreserveUnknownFields(instance.getPreserveUnknownFields());

    this.withScope(instance.getScope());

    this.withVersions(instance.getVersions());

  }
  private V1CustomResourceConversionBuilder conversion;
  private String group;
  private V1CustomResourceDefinitionNamesBuilder names;
  private Boolean preserveUnknownFields;
  private String scope;
  private ArrayList<V1CustomResourceDefinitionVersionBuilder> versions;
  
  /**
   * This method has been deprecated, please use method buildConversion instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1CustomResourceConversion getConversion() {
    return this.conversion!=null ?this.conversion.build():null;
  }
  public V1CustomResourceConversion buildConversion() {
    return this.conversion!=null ?this.conversion.build():null;
  }
  public A withConversion(V1CustomResourceConversion conversion) {
    _visitables.get("conversion").remove(this.conversion);
    if (conversion!=null){ this.conversion= new V1CustomResourceConversionBuilder(conversion); _visitables.get("conversion").add(this.conversion);} else { this.conversion = null; _visitables.get("conversion").remove(this.conversion); } return (A) this;
  }
  public Boolean hasConversion() {
    return this.conversion != null;
  }
  public V1CustomResourceDefinitionSpecFluent.ConversionNested<A> withNewConversion() {
    return new V1CustomResourceDefinitionSpecFluentImpl.ConversionNestedImpl();
  }
  public V1CustomResourceDefinitionSpecFluent.ConversionNested<A> withNewConversionLike(V1CustomResourceConversion item) {
    return new V1CustomResourceDefinitionSpecFluentImpl.ConversionNestedImpl(item);
  }
  public V1CustomResourceDefinitionSpecFluent.ConversionNested<A> editConversion() {
    return withNewConversionLike(getConversion());
  }
  public V1CustomResourceDefinitionSpecFluent.ConversionNested<A> editOrNewConversion() {
    return withNewConversionLike(getConversion() != null ? getConversion(): new V1CustomResourceConversionBuilder().build());
  }
  public V1CustomResourceDefinitionSpecFluent.ConversionNested<A> editOrNewConversionLike(V1CustomResourceConversion item) {
    return withNewConversionLike(getConversion() != null ? getConversion(): item);
  }
  public String getGroup() {
    return this.group;
  }
  public A withGroup(String group) {
    this.group=group; return (A) this;
  }
  public Boolean hasGroup() {
    return this.group != null;
  }
  
  /**
   * This method has been deprecated, please use method buildNames instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1CustomResourceDefinitionNames getNames() {
    return this.names!=null ?this.names.build():null;
  }
  public V1CustomResourceDefinitionNames buildNames() {
    return this.names!=null ?this.names.build():null;
  }
  public A withNames(V1CustomResourceDefinitionNames names) {
    _visitables.get("names").remove(this.names);
    if (names!=null){ this.names= new V1CustomResourceDefinitionNamesBuilder(names); _visitables.get("names").add(this.names);} else { this.names = null; _visitables.get("names").remove(this.names); } return (A) this;
  }
  public Boolean hasNames() {
    return this.names != null;
  }
  public V1CustomResourceDefinitionSpecFluent.NamesNested<A> withNewNames() {
    return new V1CustomResourceDefinitionSpecFluentImpl.NamesNestedImpl();
  }
  public V1CustomResourceDefinitionSpecFluent.NamesNested<A> withNewNamesLike(V1CustomResourceDefinitionNames item) {
    return new V1CustomResourceDefinitionSpecFluentImpl.NamesNestedImpl(item);
  }
  public V1CustomResourceDefinitionSpecFluent.NamesNested<A> editNames() {
    return withNewNamesLike(getNames());
  }
  public V1CustomResourceDefinitionSpecFluent.NamesNested<A> editOrNewNames() {
    return withNewNamesLike(getNames() != null ? getNames(): new V1CustomResourceDefinitionNamesBuilder().build());
  }
  public V1CustomResourceDefinitionSpecFluent.NamesNested<A> editOrNewNamesLike(V1CustomResourceDefinitionNames item) {
    return withNewNamesLike(getNames() != null ? getNames(): item);
  }
  public Boolean getPreserveUnknownFields() {
    return this.preserveUnknownFields;
  }
  public A withPreserveUnknownFields(Boolean preserveUnknownFields) {
    this.preserveUnknownFields=preserveUnknownFields; return (A) this;
  }
  public Boolean hasPreserveUnknownFields() {
    return this.preserveUnknownFields != null;
  }
  public String getScope() {
    return this.scope;
  }
  public A withScope(String scope) {
    this.scope=scope; return (A) this;
  }
  public Boolean hasScope() {
    return this.scope != null;
  }
  public A addToVersions(Integer index,V1CustomResourceDefinitionVersion item) {
    if (this.versions == null) {this.versions = new ArrayList<V1CustomResourceDefinitionVersionBuilder>();}
    V1CustomResourceDefinitionVersionBuilder builder = new V1CustomResourceDefinitionVersionBuilder(item);_visitables.get("versions").add(index >= 0 ? index : _visitables.get("versions").size(), builder);this.versions.add(index >= 0 ? index : versions.size(), builder); return (A)this;
  }
  public A setToVersions(Integer index,V1CustomResourceDefinitionVersion item) {
    if (this.versions == null) {this.versions = new ArrayList<V1CustomResourceDefinitionVersionBuilder>();}
    V1CustomResourceDefinitionVersionBuilder builder = new V1CustomResourceDefinitionVersionBuilder(item);
    if (index < 0 || index >= _visitables.get("versions").size()) { _visitables.get("versions").add(builder); } else { _visitables.get("versions").set(index, builder);}
    if (index < 0 || index >= versions.size()) { versions.add(builder); } else { versions.set(index, builder);}
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
    for (V1CustomResourceDefinitionVersion item : items) {V1CustomResourceDefinitionVersionBuilder builder = new V1CustomResourceDefinitionVersionBuilder(item);_visitables.get("versions").remove(builder);if (this.versions != null) {this.versions.remove(builder);}} return (A)this;
  }
  public A removeAllFromVersions(Collection<V1CustomResourceDefinitionVersion> items) {
    for (V1CustomResourceDefinitionVersion item : items) {V1CustomResourceDefinitionVersionBuilder builder = new V1CustomResourceDefinitionVersionBuilder(item);_visitables.get("versions").remove(builder);if (this.versions != null) {this.versions.remove(builder);}} return (A)this;
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
  
  /**
   * This method has been deprecated, please use method buildVersions instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1CustomResourceDefinitionVersion> getVersions() {
    return versions != null ? build(versions) : null;
  }
  public List<V1CustomResourceDefinitionVersion> buildVersions() {
    return versions != null ? build(versions) : null;
  }
  public V1CustomResourceDefinitionVersion buildVersion(Integer index) {
    return this.versions.get(index).build();
  }
  public V1CustomResourceDefinitionVersion buildFirstVersion() {
    return this.versions.get(0).build();
  }
  public V1CustomResourceDefinitionVersion buildLastVersion() {
    return this.versions.get(versions.size() - 1).build();
  }
  public V1CustomResourceDefinitionVersion buildMatchingVersion(Predicate<V1CustomResourceDefinitionVersionBuilder> predicate) {
    for (V1CustomResourceDefinitionVersionBuilder item: versions) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingVersion(Predicate<V1CustomResourceDefinitionVersionBuilder> predicate) {
    for (V1CustomResourceDefinitionVersionBuilder item: versions) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withVersions(List<V1CustomResourceDefinitionVersion> versions) {
    if (this.versions != null) { _visitables.get("versions").removeAll(this.versions);}
    if (versions != null) {this.versions = new ArrayList(); for (V1CustomResourceDefinitionVersion item : versions){this.addToVersions(item);}} else { this.versions = null;} return (A) this;
  }
  public A withVersions(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion... versions) {
    if (this.versions != null) {this.versions.clear();}
    if (versions != null) {for (V1CustomResourceDefinitionVersion item :versions){ this.addToVersions(item);}} return (A) this;
  }
  public Boolean hasVersions() {
    return versions != null && !versions.isEmpty();
  }
  public V1CustomResourceDefinitionSpecFluent.VersionsNested<A> addNewVersion() {
    return new V1CustomResourceDefinitionSpecFluentImpl.VersionsNestedImpl();
  }
  public V1CustomResourceDefinitionSpecFluent.VersionsNested<A> addNewVersionLike(V1CustomResourceDefinitionVersion item) {
    return new V1CustomResourceDefinitionSpecFluentImpl.VersionsNestedImpl(-1, item);
  }
  public V1CustomResourceDefinitionSpecFluent.VersionsNested<A> setNewVersionLike(Integer index,V1CustomResourceDefinitionVersion item) {
    return new V1CustomResourceDefinitionSpecFluentImpl.VersionsNestedImpl(index, item);
  }
  public V1CustomResourceDefinitionSpecFluent.VersionsNested<A> editVersion(Integer index) {
    if (versions.size() <= index) throw new RuntimeException("Can't edit versions. Index exceeds size.");
    return setNewVersionLike(index, buildVersion(index));
  }
  public V1CustomResourceDefinitionSpecFluent.VersionsNested<A> editFirstVersion() {
    if (versions.size() == 0) throw new RuntimeException("Can't edit first versions. The list is empty.");
    return setNewVersionLike(0, buildVersion(0));
  }
  public V1CustomResourceDefinitionSpecFluent.VersionsNested<A> editLastVersion() {
    int index = versions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last versions. The list is empty.");
    return setNewVersionLike(index, buildVersion(index));
  }
  public V1CustomResourceDefinitionSpecFluent.VersionsNested<A> editMatchingVersion(Predicate<V1CustomResourceDefinitionVersionBuilder> predicate) {
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
    V1CustomResourceDefinitionSpecFluentImpl that = (V1CustomResourceDefinitionSpecFluentImpl) o;
    if (conversion != null ? !conversion.equals(that.conversion) :that.conversion != null) return false;
    if (group != null ? !group.equals(that.group) :that.group != null) return false;
    if (names != null ? !names.equals(that.names) :that.names != null) return false;
    if (preserveUnknownFields != null ? !preserveUnknownFields.equals(that.preserveUnknownFields) :that.preserveUnknownFields != null) return false;
    if (scope != null ? !scope.equals(that.scope) :that.scope != null) return false;
    if (versions != null ? !versions.equals(that.versions) :that.versions != null) return false;
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
  class ConversionNestedImpl<N> extends V1CustomResourceConversionFluentImpl<V1CustomResourceDefinitionSpecFluent.ConversionNested<N>> implements V1CustomResourceDefinitionSpecFluent.ConversionNested<N>,Nested<N>{
    ConversionNestedImpl(V1CustomResourceConversion item) {
      this.builder = new V1CustomResourceConversionBuilder(this, item);
    }
    ConversionNestedImpl() {
      this.builder = new V1CustomResourceConversionBuilder(this);
    }
    V1CustomResourceConversionBuilder builder;
    public N and() {
      return (N) V1CustomResourceDefinitionSpecFluentImpl.this.withConversion(builder.build());
    }
    public N endConversion() {
      return and();
    }
    
  }
  class NamesNestedImpl<N> extends V1CustomResourceDefinitionNamesFluentImpl<V1CustomResourceDefinitionSpecFluent.NamesNested<N>> implements V1CustomResourceDefinitionSpecFluent.NamesNested<N>,Nested<N>{
    NamesNestedImpl(V1CustomResourceDefinitionNames item) {
      this.builder = new V1CustomResourceDefinitionNamesBuilder(this, item);
    }
    NamesNestedImpl() {
      this.builder = new V1CustomResourceDefinitionNamesBuilder(this);
    }
    V1CustomResourceDefinitionNamesBuilder builder;
    public N and() {
      return (N) V1CustomResourceDefinitionSpecFluentImpl.this.withNames(builder.build());
    }
    public N endNames() {
      return and();
    }
    
  }
  class VersionsNestedImpl<N> extends V1CustomResourceDefinitionVersionFluentImpl<V1CustomResourceDefinitionSpecFluent.VersionsNested<N>> implements V1CustomResourceDefinitionSpecFluent.VersionsNested<N>,Nested<N>{
    VersionsNestedImpl(Integer index,V1CustomResourceDefinitionVersion item) {
      this.index = index;
      this.builder = new V1CustomResourceDefinitionVersionBuilder(this, item);
    }
    VersionsNestedImpl() {
      this.index = -1;
      this.builder = new V1CustomResourceDefinitionVersionBuilder(this);
    }
    V1CustomResourceDefinitionVersionBuilder builder;
    Integer index;
    public N and() {
      return (N) V1CustomResourceDefinitionSpecFluentImpl.this.setToVersions(index,builder.build());
    }
    public N endVersion() {
      return and();
    }
    
  }
  
}