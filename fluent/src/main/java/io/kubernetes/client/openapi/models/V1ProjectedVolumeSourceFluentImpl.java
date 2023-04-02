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
  public class V1ProjectedVolumeSourceFluentImpl<A extends V1ProjectedVolumeSourceFluent<A>> extends BaseFluent<A> implements V1ProjectedVolumeSourceFluent<A>{
  public V1ProjectedVolumeSourceFluentImpl() {
  }
  public V1ProjectedVolumeSourceFluentImpl(V1ProjectedVolumeSource instance) {
    this.withDefaultMode(instance.getDefaultMode());

    this.withSources(instance.getSources());

  }
  private Integer defaultMode;
  private ArrayList<V1VolumeProjectionBuilder> sources;
  public Integer getDefaultMode() {
    return this.defaultMode;
  }
  public A withDefaultMode(Integer defaultMode) {
    this.defaultMode=defaultMode; return (A) this;
  }
  public Boolean hasDefaultMode() {
    return this.defaultMode != null;
  }
  public A addToSources(Integer index,V1VolumeProjection item) {
    if (this.sources == null) {this.sources = new ArrayList<V1VolumeProjectionBuilder>();}
    V1VolumeProjectionBuilder builder = new V1VolumeProjectionBuilder(item);_visitables.get("sources").add(index >= 0 ? index : _visitables.get("sources").size(), builder);this.sources.add(index >= 0 ? index : sources.size(), builder); return (A)this;
  }
  public A setToSources(Integer index,V1VolumeProjection item) {
    if (this.sources == null) {this.sources = new ArrayList<V1VolumeProjectionBuilder>();}
    V1VolumeProjectionBuilder builder = new V1VolumeProjectionBuilder(item);
    if (index < 0 || index >= _visitables.get("sources").size()) { _visitables.get("sources").add(builder); } else { _visitables.get("sources").set(index, builder);}
    if (index < 0 || index >= sources.size()) { sources.add(builder); } else { sources.set(index, builder);}
     return (A)this;
  }
  public A addToSources(io.kubernetes.client.openapi.models.V1VolumeProjection... items) {
    if (this.sources == null) {this.sources = new ArrayList<V1VolumeProjectionBuilder>();}
    for (V1VolumeProjection item : items) {V1VolumeProjectionBuilder builder = new V1VolumeProjectionBuilder(item);_visitables.get("sources").add(builder);this.sources.add(builder);} return (A)this;
  }
  public A addAllToSources(Collection<V1VolumeProjection> items) {
    if (this.sources == null) {this.sources = new ArrayList<V1VolumeProjectionBuilder>();}
    for (V1VolumeProjection item : items) {V1VolumeProjectionBuilder builder = new V1VolumeProjectionBuilder(item);_visitables.get("sources").add(builder);this.sources.add(builder);} return (A)this;
  }
  public A removeFromSources(io.kubernetes.client.openapi.models.V1VolumeProjection... items) {
    for (V1VolumeProjection item : items) {V1VolumeProjectionBuilder builder = new V1VolumeProjectionBuilder(item);_visitables.get("sources").remove(builder);if (this.sources != null) {this.sources.remove(builder);}} return (A)this;
  }
  public A removeAllFromSources(Collection<V1VolumeProjection> items) {
    for (V1VolumeProjection item : items) {V1VolumeProjectionBuilder builder = new V1VolumeProjectionBuilder(item);_visitables.get("sources").remove(builder);if (this.sources != null) {this.sources.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromSources(Predicate<V1VolumeProjectionBuilder> predicate) {
    if (sources == null) return (A) this;
    final Iterator<V1VolumeProjectionBuilder> each = sources.iterator();
    final List visitables = _visitables.get("sources");
    while (each.hasNext()) {
      V1VolumeProjectionBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildSources instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1VolumeProjection> getSources() {
    return sources != null ? build(sources) : null;
  }
  public List<V1VolumeProjection> buildSources() {
    return sources != null ? build(sources) : null;
  }
  public V1VolumeProjection buildSource(Integer index) {
    return this.sources.get(index).build();
  }
  public V1VolumeProjection buildFirstSource() {
    return this.sources.get(0).build();
  }
  public V1VolumeProjection buildLastSource() {
    return this.sources.get(sources.size() - 1).build();
  }
  public V1VolumeProjection buildMatchingSource(Predicate<V1VolumeProjectionBuilder> predicate) {
    for (V1VolumeProjectionBuilder item: sources) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingSource(Predicate<V1VolumeProjectionBuilder> predicate) {
    for (V1VolumeProjectionBuilder item: sources) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withSources(List<V1VolumeProjection> sources) {
    if (this.sources != null) { _visitables.get("sources").removeAll(this.sources);}
    if (sources != null) {this.sources = new ArrayList(); for (V1VolumeProjection item : sources){this.addToSources(item);}} else { this.sources = null;} return (A) this;
  }
  public A withSources(io.kubernetes.client.openapi.models.V1VolumeProjection... sources) {
    if (this.sources != null) {this.sources.clear();}
    if (sources != null) {for (V1VolumeProjection item :sources){ this.addToSources(item);}} return (A) this;
  }
  public Boolean hasSources() {
    return sources != null && !sources.isEmpty();
  }
  public V1ProjectedVolumeSourceFluent.SourcesNested<A> addNewSource() {
    return new V1ProjectedVolumeSourceFluentImpl.SourcesNestedImpl();
  }
  public V1ProjectedVolumeSourceFluent.SourcesNested<A> addNewSourceLike(V1VolumeProjection item) {
    return new V1ProjectedVolumeSourceFluentImpl.SourcesNestedImpl(-1, item);
  }
  public V1ProjectedVolumeSourceFluent.SourcesNested<A> setNewSourceLike(Integer index,V1VolumeProjection item) {
    return new V1ProjectedVolumeSourceFluentImpl.SourcesNestedImpl(index, item);
  }
  public V1ProjectedVolumeSourceFluent.SourcesNested<A> editSource(Integer index) {
    if (sources.size() <= index) throw new RuntimeException("Can't edit sources. Index exceeds size.");
    return setNewSourceLike(index, buildSource(index));
  }
  public V1ProjectedVolumeSourceFluent.SourcesNested<A> editFirstSource() {
    if (sources.size() == 0) throw new RuntimeException("Can't edit first sources. The list is empty.");
    return setNewSourceLike(0, buildSource(0));
  }
  public V1ProjectedVolumeSourceFluent.SourcesNested<A> editLastSource() {
    int index = sources.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last sources. The list is empty.");
    return setNewSourceLike(index, buildSource(index));
  }
  public V1ProjectedVolumeSourceFluent.SourcesNested<A> editMatchingSource(Predicate<V1VolumeProjectionBuilder> predicate) {
    int index = -1;
    for (int i=0;i<sources.size();i++) { 
    if (predicate.test(sources.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching sources. No match found.");
    return setNewSourceLike(index, buildSource(index));
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ProjectedVolumeSourceFluentImpl that = (V1ProjectedVolumeSourceFluentImpl) o;
    if (defaultMode != null ? !defaultMode.equals(that.defaultMode) :that.defaultMode != null) return false;
    if (sources != null ? !sources.equals(that.sources) :that.sources != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(defaultMode,  sources,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (defaultMode != null) { sb.append("defaultMode:"); sb.append(defaultMode + ","); }
    if (sources != null && !sources.isEmpty()) { sb.append("sources:"); sb.append(sources); }
    sb.append("}");
    return sb.toString();
  }
  class SourcesNestedImpl<N> extends V1VolumeProjectionFluentImpl<V1ProjectedVolumeSourceFluent.SourcesNested<N>> implements V1ProjectedVolumeSourceFluent.SourcesNested<N>,Nested<N>{
    SourcesNestedImpl(Integer index,V1VolumeProjection item) {
      this.index = index;
      this.builder = new V1VolumeProjectionBuilder(this, item);
    }
    SourcesNestedImpl() {
      this.index = -1;
      this.builder = new V1VolumeProjectionBuilder(this);
    }
    V1VolumeProjectionBuilder builder;
    Integer index;
    public N and() {
      return (N) V1ProjectedVolumeSourceFluentImpl.this.setToSources(index,builder.build());
    }
    public N endSource() {
      return and();
    }
    
  }
  
}