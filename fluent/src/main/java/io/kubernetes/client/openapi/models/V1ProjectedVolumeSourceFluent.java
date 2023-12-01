package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ProjectedVolumeSourceFluent<A extends V1ProjectedVolumeSourceFluent<A>> extends BaseFluent<A>{
  public V1ProjectedVolumeSourceFluent() {
  }
  
  public V1ProjectedVolumeSourceFluent(V1ProjectedVolumeSource instance) {
    this.copyInstance(instance);
  }
  private Integer defaultMode;
  private ArrayList<V1VolumeProjectionBuilder> sources;
  
  protected void copyInstance(V1ProjectedVolumeSource instance) {
    instance = (instance != null ? instance : new V1ProjectedVolumeSource());
    if (instance != null) {
          this.withDefaultMode(instance.getDefaultMode());
          this.withSources(instance.getSources());
        }
  }
  
  public Integer getDefaultMode() {
    return this.defaultMode;
  }
  
  public A withDefaultMode(Integer defaultMode) {
    this.defaultMode = defaultMode;
    return (A) this;
  }
  
  public boolean hasDefaultMode() {
    return this.defaultMode != null;
  }
  
  public A addToSources(int index,V1VolumeProjection item) {
    if (this.sources == null) {this.sources = new ArrayList<V1VolumeProjectionBuilder>();}
    V1VolumeProjectionBuilder builder = new V1VolumeProjectionBuilder(item);
    if (index < 0 || index >= sources.size()) { _visitables.get("sources").add(builder); sources.add(builder); } else { _visitables.get("sources").add(index, builder); sources.add(index, builder);}
    return (A)this;
  }
  
  public A setToSources(int index,V1VolumeProjection item) {
    if (this.sources == null) {this.sources = new ArrayList<V1VolumeProjectionBuilder>();}
    V1VolumeProjectionBuilder builder = new V1VolumeProjectionBuilder(item);
    if (index < 0 || index >= sources.size()) { _visitables.get("sources").add(builder); sources.add(builder); } else { _visitables.get("sources").set(index, builder); sources.set(index, builder);}
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
    if (this.sources == null) return (A)this;
    for (V1VolumeProjection item : items) {V1VolumeProjectionBuilder builder = new V1VolumeProjectionBuilder(item);_visitables.get("sources").remove(builder); this.sources.remove(builder);} return (A)this;
  }
  
  public A removeAllFromSources(Collection<V1VolumeProjection> items) {
    if (this.sources == null) return (A)this;
    for (V1VolumeProjection item : items) {V1VolumeProjectionBuilder builder = new V1VolumeProjectionBuilder(item);_visitables.get("sources").remove(builder); this.sources.remove(builder);} return (A)this;
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
  
  public List<V1VolumeProjection> buildSources() {
    return this.sources != null ? build(sources) : null;
  }
  
  public V1VolumeProjection buildSource(int index) {
    return this.sources.get(index).build();
  }
  
  public V1VolumeProjection buildFirstSource() {
    return this.sources.get(0).build();
  }
  
  public V1VolumeProjection buildLastSource() {
    return this.sources.get(sources.size() - 1).build();
  }
  
  public V1VolumeProjection buildMatchingSource(Predicate<V1VolumeProjectionBuilder> predicate) {
      for (V1VolumeProjectionBuilder item : sources) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingSource(Predicate<V1VolumeProjectionBuilder> predicate) {
      for (V1VolumeProjectionBuilder item : sources) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withSources(List<V1VolumeProjection> sources) {
    if (this.sources != null) {
      this._visitables.get("sources").clear();
    }
    if (sources != null) {
        this.sources = new ArrayList();
        for (V1VolumeProjection item : sources) {
          this.addToSources(item);
        }
    } else {
      this.sources = null;
    }
    return (A) this;
  }
  
  public A withSources(io.kubernetes.client.openapi.models.V1VolumeProjection... sources) {
    if (this.sources != null) {
        this.sources.clear();
        _visitables.remove("sources");
    }
    if (sources != null) {
      for (V1VolumeProjection item : sources) {
        this.addToSources(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasSources() {
    return this.sources != null && !this.sources.isEmpty();
  }
  
  public SourcesNested<A> addNewSource() {
    return new SourcesNested(-1, null);
  }
  
  public SourcesNested<A> addNewSourceLike(V1VolumeProjection item) {
    return new SourcesNested(-1, item);
  }
  
  public SourcesNested<A> setNewSourceLike(int index,V1VolumeProjection item) {
    return new SourcesNested(index, item);
  }
  
  public SourcesNested<A> editSource(int index) {
    if (sources.size() <= index) throw new RuntimeException("Can't edit sources. Index exceeds size.");
    return setNewSourceLike(index, buildSource(index));
  }
  
  public SourcesNested<A> editFirstSource() {
    if (sources.size() == 0) throw new RuntimeException("Can't edit first sources. The list is empty.");
    return setNewSourceLike(0, buildSource(0));
  }
  
  public SourcesNested<A> editLastSource() {
    int index = sources.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last sources. The list is empty.");
    return setNewSourceLike(index, buildSource(index));
  }
  
  public SourcesNested<A> editMatchingSource(Predicate<V1VolumeProjectionBuilder> predicate) {
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
    if (!super.equals(o)) return false;
    V1ProjectedVolumeSourceFluent that = (V1ProjectedVolumeSourceFluent) o;
    if (!java.util.Objects.equals(defaultMode, that.defaultMode)) return false;
    if (!java.util.Objects.equals(sources, that.sources)) return false;
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
  public class SourcesNested<N> extends V1VolumeProjectionFluent<SourcesNested<N>> implements Nested<N>{
    SourcesNested(int index,V1VolumeProjection item) {
      this.index = index;
      this.builder = new V1VolumeProjectionBuilder(this, item);
    }
    V1VolumeProjectionBuilder builder;
    int index;
    
    public N and() {
      return (N) V1ProjectedVolumeSourceFluent.this.setToSources(index,builder.build());
    }
    
    public N endSource() {
      return and();
    }
    
  
  }

}