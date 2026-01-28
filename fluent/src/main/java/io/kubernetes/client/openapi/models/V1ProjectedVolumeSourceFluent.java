package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Integer;
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
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ProjectedVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluent<A>> extends BaseFluent<A>{

  private Integer defaultMode;
  private ArrayList<V1VolumeProjectionBuilder> sources;

  public V1ProjectedVolumeSourceFluent() {
  }
  
  public V1ProjectedVolumeSourceFluent(V1ProjectedVolumeSource instance) {
    this.copyInstance(instance);
  }

  public A addAllToSources(Collection<V1VolumeProjection> items) {
    if (this.sources == null) {
      this.sources = new ArrayList();
    }
    for (V1VolumeProjection item : items) {
        V1VolumeProjectionBuilder builder = new V1VolumeProjectionBuilder(item);
        _visitables.get("sources").add(builder);
        this.sources.add(builder);
    }
    return (A) this;
  }
  
  public SourcesNested<A> addNewSource() {
    return new SourcesNested(-1, null);
  }
  
  public SourcesNested<A> addNewSourceLike(V1VolumeProjection item) {
    return new SourcesNested(-1, item);
  }
  
  public A addToSources(V1VolumeProjection... items) {
    if (this.sources == null) {
      this.sources = new ArrayList();
    }
    for (V1VolumeProjection item : items) {
        V1VolumeProjectionBuilder builder = new V1VolumeProjectionBuilder(item);
        _visitables.get("sources").add(builder);
        this.sources.add(builder);
    }
    return (A) this;
  }
  
  public A addToSources(int index,V1VolumeProjection item) {
    if (this.sources == null) {
      this.sources = new ArrayList();
    }
    V1VolumeProjectionBuilder builder = new V1VolumeProjectionBuilder(item);
    if (index < 0 || index >= sources.size()) {
        _visitables.get("sources").add(builder);
        sources.add(builder);
    } else {
        _visitables.get("sources").add(builder);
        sources.add(index, builder);
    }
    return (A) this;
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
  
  public V1VolumeProjection buildSource(int index) {
    return this.sources.get(index).build();
  }
  
  public List<V1VolumeProjection> buildSources() {
    return this.sources != null ? build(sources) : null;
  }
  
  protected void copyInstance(V1ProjectedVolumeSource instance) {
    instance = instance != null ? instance : new V1ProjectedVolumeSource();
    if (instance != null) {
        this.withDefaultMode(instance.getDefaultMode());
        this.withSources(instance.getSources());
    }
  }
  
  public SourcesNested<A> editFirstSource() {
    if (sources.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "sources"));
    }
    return this.setNewSourceLike(0, this.buildSource(0));
  }
  
  public SourcesNested<A> editLastSource() {
    int index = sources.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "sources"));
    }
    return this.setNewSourceLike(index, this.buildSource(index));
  }
  
  public SourcesNested<A> editMatchingSource(Predicate<V1VolumeProjectionBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < sources.size();i++) {
      if (predicate.test(sources.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "sources"));
    }
    return this.setNewSourceLike(index, this.buildSource(index));
  }
  
  public SourcesNested<A> editSource(int index) {
    if (sources.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "sources"));
    }
    return this.setNewSourceLike(index, this.buildSource(index));
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
    V1ProjectedVolumeSourceFluent that = (V1ProjectedVolumeSourceFluent) o;
    if (!(Objects.equals(defaultMode, that.defaultMode))) {
      return false;
    }
    if (!(Objects.equals(sources, that.sources))) {
      return false;
    }
    return true;
  }
  
  public Integer getDefaultMode() {
    return this.defaultMode;
  }
  
  public boolean hasDefaultMode() {
    return this.defaultMode != null;
  }
  
  public boolean hasMatchingSource(Predicate<V1VolumeProjectionBuilder> predicate) {
      for (V1VolumeProjectionBuilder item : sources) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasSources() {
    return this.sources != null && !(this.sources.isEmpty());
  }
  
  public int hashCode() {
    return Objects.hash(defaultMode, sources);
  }
  
  public A removeAllFromSources(Collection<V1VolumeProjection> items) {
    if (this.sources == null) {
      return (A) this;
    }
    for (V1VolumeProjection item : items) {
        V1VolumeProjectionBuilder builder = new V1VolumeProjectionBuilder(item);
        _visitables.get("sources").remove(builder);
        this.sources.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromSources(V1VolumeProjection... items) {
    if (this.sources == null) {
      return (A) this;
    }
    for (V1VolumeProjection item : items) {
        V1VolumeProjectionBuilder builder = new V1VolumeProjectionBuilder(item);
        _visitables.get("sources").remove(builder);
        this.sources.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromSources(Predicate<V1VolumeProjectionBuilder> predicate) {
    if (sources == null) {
      return (A) this;
    }
    Iterator<V1VolumeProjectionBuilder> each = sources.iterator();
    List visitables = _visitables.get("sources");
    while (each.hasNext()) {
        V1VolumeProjectionBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public SourcesNested<A> setNewSourceLike(int index,V1VolumeProjection item) {
    return new SourcesNested(index, item);
  }
  
  public A setToSources(int index,V1VolumeProjection item) {
    if (this.sources == null) {
      this.sources = new ArrayList();
    }
    V1VolumeProjectionBuilder builder = new V1VolumeProjectionBuilder(item);
    if (index < 0 || index >= sources.size()) {
        _visitables.get("sources").add(builder);
        sources.add(builder);
    } else {
        _visitables.get("sources").add(builder);
        sources.set(index, builder);
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(defaultMode == null)) {
        sb.append("defaultMode:");
        sb.append(defaultMode);
        sb.append(",");
    }
    if (!(sources == null) && !(sources.isEmpty())) {
        sb.append("sources:");
        sb.append(sources);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withDefaultMode(Integer defaultMode) {
    this.defaultMode = defaultMode;
    return (A) this;
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
  
  public A withSources(V1VolumeProjection... sources) {
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
  public class SourcesNested<N> extends V1VolumeProjectionFluent<SourcesNested<N>> implements Nested<N>{
  
    V1VolumeProjectionBuilder builder;
    int index;
  
    SourcesNested(int index,V1VolumeProjection item) {
      this.index = index;
      this.builder = new V1VolumeProjectionBuilder(this, item);
    }
  
    public N and() {
      return (N) V1ProjectedVolumeSourceFluent.this.setToSources(index, builder.build());
    }
    
    public N endSource() {
      return and();
    }
    
  }
}