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
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1EndpointHintsFluent<A extends io.kubernetes.client.openapi.models.V1EndpointHintsFluent<A>> extends BaseFluent<A>{

  private ArrayList<V1ForNodeBuilder> forNodes;
  private ArrayList<V1ForZoneBuilder> forZones;

  public V1EndpointHintsFluent() {
  }
  
  public V1EndpointHintsFluent(V1EndpointHints instance) {
    this.copyInstance(instance);
  }

  public A addAllToForNodes(Collection<V1ForNode> items) {
    if (this.forNodes == null) {
      this.forNodes = new ArrayList();
    }
    for (V1ForNode item : items) {
        V1ForNodeBuilder builder = new V1ForNodeBuilder(item);
        _visitables.get("forNodes").add(builder);
        this.forNodes.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToForZones(Collection<V1ForZone> items) {
    if (this.forZones == null) {
      this.forZones = new ArrayList();
    }
    for (V1ForZone item : items) {
        V1ForZoneBuilder builder = new V1ForZoneBuilder(item);
        _visitables.get("forZones").add(builder);
        this.forZones.add(builder);
    }
    return (A) this;
  }
  
  public ForNodesNested<A> addNewForNode() {
    return new ForNodesNested(-1, null);
  }
  
  public ForNodesNested<A> addNewForNodeLike(V1ForNode item) {
    return new ForNodesNested(-1, item);
  }
  
  public ForZonesNested<A> addNewForZone() {
    return new ForZonesNested(-1, null);
  }
  
  public ForZonesNested<A> addNewForZoneLike(V1ForZone item) {
    return new ForZonesNested(-1, item);
  }
  
  public A addToForNodes(V1ForNode... items) {
    if (this.forNodes == null) {
      this.forNodes = new ArrayList();
    }
    for (V1ForNode item : items) {
        V1ForNodeBuilder builder = new V1ForNodeBuilder(item);
        _visitables.get("forNodes").add(builder);
        this.forNodes.add(builder);
    }
    return (A) this;
  }
  
  public A addToForNodes(int index,V1ForNode item) {
    if (this.forNodes == null) {
      this.forNodes = new ArrayList();
    }
    V1ForNodeBuilder builder = new V1ForNodeBuilder(item);
    if (index < 0 || index >= forNodes.size()) {
        _visitables.get("forNodes").add(builder);
        forNodes.add(builder);
    } else {
        _visitables.get("forNodes").add(builder);
        forNodes.add(index, builder);
    }
    return (A) this;
  }
  
  public A addToForZones(V1ForZone... items) {
    if (this.forZones == null) {
      this.forZones = new ArrayList();
    }
    for (V1ForZone item : items) {
        V1ForZoneBuilder builder = new V1ForZoneBuilder(item);
        _visitables.get("forZones").add(builder);
        this.forZones.add(builder);
    }
    return (A) this;
  }
  
  public A addToForZones(int index,V1ForZone item) {
    if (this.forZones == null) {
      this.forZones = new ArrayList();
    }
    V1ForZoneBuilder builder = new V1ForZoneBuilder(item);
    if (index < 0 || index >= forZones.size()) {
        _visitables.get("forZones").add(builder);
        forZones.add(builder);
    } else {
        _visitables.get("forZones").add(builder);
        forZones.add(index, builder);
    }
    return (A) this;
  }
  
  public V1ForNode buildFirstForNode() {
    return this.forNodes.get(0).build();
  }
  
  public V1ForZone buildFirstForZone() {
    return this.forZones.get(0).build();
  }
  
  public V1ForNode buildForNode(int index) {
    return this.forNodes.get(index).build();
  }
  
  public List<V1ForNode> buildForNodes() {
    return this.forNodes != null ? build(forNodes) : null;
  }
  
  public V1ForZone buildForZone(int index) {
    return this.forZones.get(index).build();
  }
  
  public List<V1ForZone> buildForZones() {
    return this.forZones != null ? build(forZones) : null;
  }
  
  public V1ForNode buildLastForNode() {
    return this.forNodes.get(forNodes.size() - 1).build();
  }
  
  public V1ForZone buildLastForZone() {
    return this.forZones.get(forZones.size() - 1).build();
  }
  
  public V1ForNode buildMatchingForNode(Predicate<V1ForNodeBuilder> predicate) {
      for (V1ForNodeBuilder item : forNodes) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1ForZone buildMatchingForZone(Predicate<V1ForZoneBuilder> predicate) {
      for (V1ForZoneBuilder item : forZones) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  protected void copyInstance(V1EndpointHints instance) {
    instance = instance != null ? instance : new V1EndpointHints();
    if (instance != null) {
        this.withForNodes(instance.getForNodes());
        this.withForZones(instance.getForZones());
    }
  }
  
  public ForNodesNested<A> editFirstForNode() {
    if (forNodes.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "forNodes"));
    }
    return this.setNewForNodeLike(0, this.buildForNode(0));
  }
  
  public ForZonesNested<A> editFirstForZone() {
    if (forZones.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "forZones"));
    }
    return this.setNewForZoneLike(0, this.buildForZone(0));
  }
  
  public ForNodesNested<A> editForNode(int index) {
    if (forNodes.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "forNodes"));
    }
    return this.setNewForNodeLike(index, this.buildForNode(index));
  }
  
  public ForZonesNested<A> editForZone(int index) {
    if (forZones.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "forZones"));
    }
    return this.setNewForZoneLike(index, this.buildForZone(index));
  }
  
  public ForNodesNested<A> editLastForNode() {
    int index = forNodes.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "forNodes"));
    }
    return this.setNewForNodeLike(index, this.buildForNode(index));
  }
  
  public ForZonesNested<A> editLastForZone() {
    int index = forZones.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "forZones"));
    }
    return this.setNewForZoneLike(index, this.buildForZone(index));
  }
  
  public ForNodesNested<A> editMatchingForNode(Predicate<V1ForNodeBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < forNodes.size();i++) {
      if (predicate.test(forNodes.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "forNodes"));
    }
    return this.setNewForNodeLike(index, this.buildForNode(index));
  }
  
  public ForZonesNested<A> editMatchingForZone(Predicate<V1ForZoneBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < forZones.size();i++) {
      if (predicate.test(forZones.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "forZones"));
    }
    return this.setNewForZoneLike(index, this.buildForZone(index));
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
    V1EndpointHintsFluent that = (V1EndpointHintsFluent) o;
    if (!(Objects.equals(forNodes, that.forNodes))) {
      return false;
    }
    if (!(Objects.equals(forZones, that.forZones))) {
      return false;
    }
    return true;
  }
  
  public boolean hasForNodes() {
    return this.forNodes != null && !(this.forNodes.isEmpty());
  }
  
  public boolean hasForZones() {
    return this.forZones != null && !(this.forZones.isEmpty());
  }
  
  public boolean hasMatchingForNode(Predicate<V1ForNodeBuilder> predicate) {
      for (V1ForNodeBuilder item : forNodes) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingForZone(Predicate<V1ForZoneBuilder> predicate) {
      for (V1ForZoneBuilder item : forZones) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public int hashCode() {
    return Objects.hash(forNodes, forZones);
  }
  
  public A removeAllFromForNodes(Collection<V1ForNode> items) {
    if (this.forNodes == null) {
      return (A) this;
    }
    for (V1ForNode item : items) {
        V1ForNodeBuilder builder = new V1ForNodeBuilder(item);
        _visitables.get("forNodes").remove(builder);
        this.forNodes.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromForZones(Collection<V1ForZone> items) {
    if (this.forZones == null) {
      return (A) this;
    }
    for (V1ForZone item : items) {
        V1ForZoneBuilder builder = new V1ForZoneBuilder(item);
        _visitables.get("forZones").remove(builder);
        this.forZones.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromForNodes(V1ForNode... items) {
    if (this.forNodes == null) {
      return (A) this;
    }
    for (V1ForNode item : items) {
        V1ForNodeBuilder builder = new V1ForNodeBuilder(item);
        _visitables.get("forNodes").remove(builder);
        this.forNodes.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromForZones(V1ForZone... items) {
    if (this.forZones == null) {
      return (A) this;
    }
    for (V1ForZone item : items) {
        V1ForZoneBuilder builder = new V1ForZoneBuilder(item);
        _visitables.get("forZones").remove(builder);
        this.forZones.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromForNodes(Predicate<V1ForNodeBuilder> predicate) {
    if (forNodes == null) {
      return (A) this;
    }
    Iterator<V1ForNodeBuilder> each = forNodes.iterator();
    List visitables = _visitables.get("forNodes");
    while (each.hasNext()) {
        V1ForNodeBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public A removeMatchingFromForZones(Predicate<V1ForZoneBuilder> predicate) {
    if (forZones == null) {
      return (A) this;
    }
    Iterator<V1ForZoneBuilder> each = forZones.iterator();
    List visitables = _visitables.get("forZones");
    while (each.hasNext()) {
        V1ForZoneBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public ForNodesNested<A> setNewForNodeLike(int index,V1ForNode item) {
    return new ForNodesNested(index, item);
  }
  
  public ForZonesNested<A> setNewForZoneLike(int index,V1ForZone item) {
    return new ForZonesNested(index, item);
  }
  
  public A setToForNodes(int index,V1ForNode item) {
    if (this.forNodes == null) {
      this.forNodes = new ArrayList();
    }
    V1ForNodeBuilder builder = new V1ForNodeBuilder(item);
    if (index < 0 || index >= forNodes.size()) {
        _visitables.get("forNodes").add(builder);
        forNodes.add(builder);
    } else {
        _visitables.get("forNodes").add(builder);
        forNodes.set(index, builder);
    }
    return (A) this;
  }
  
  public A setToForZones(int index,V1ForZone item) {
    if (this.forZones == null) {
      this.forZones = new ArrayList();
    }
    V1ForZoneBuilder builder = new V1ForZoneBuilder(item);
    if (index < 0 || index >= forZones.size()) {
        _visitables.get("forZones").add(builder);
        forZones.add(builder);
    } else {
        _visitables.get("forZones").add(builder);
        forZones.set(index, builder);
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(forNodes == null) && !(forNodes.isEmpty())) {
        sb.append("forNodes:");
        sb.append(forNodes);
        sb.append(",");
    }
    if (!(forZones == null) && !(forZones.isEmpty())) {
        sb.append("forZones:");
        sb.append(forZones);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withForNodes(List<V1ForNode> forNodes) {
    if (this.forNodes != null) {
      this._visitables.get("forNodes").clear();
    }
    if (forNodes != null) {
        this.forNodes = new ArrayList();
        for (V1ForNode item : forNodes) {
          this.addToForNodes(item);
        }
    } else {
      this.forNodes = null;
    }
    return (A) this;
  }
  
  public A withForNodes(V1ForNode... forNodes) {
    if (this.forNodes != null) {
        this.forNodes.clear();
        _visitables.remove("forNodes");
    }
    if (forNodes != null) {
      for (V1ForNode item : forNodes) {
        this.addToForNodes(item);
      }
    }
    return (A) this;
  }
  
  public A withForZones(List<V1ForZone> forZones) {
    if (this.forZones != null) {
      this._visitables.get("forZones").clear();
    }
    if (forZones != null) {
        this.forZones = new ArrayList();
        for (V1ForZone item : forZones) {
          this.addToForZones(item);
        }
    } else {
      this.forZones = null;
    }
    return (A) this;
  }
  
  public A withForZones(V1ForZone... forZones) {
    if (this.forZones != null) {
        this.forZones.clear();
        _visitables.remove("forZones");
    }
    if (forZones != null) {
      for (V1ForZone item : forZones) {
        this.addToForZones(item);
      }
    }
    return (A) this;
  }
  public class ForNodesNested<N> extends V1ForNodeFluent<ForNodesNested<N>> implements Nested<N>{
  
    V1ForNodeBuilder builder;
    int index;
  
    ForNodesNested(int index,V1ForNode item) {
      this.index = index;
      this.builder = new V1ForNodeBuilder(this, item);
    }
  
    public N and() {
      return (N) V1EndpointHintsFluent.this.setToForNodes(index, builder.build());
    }
    
    public N endForNode() {
      return and();
    }
    
  }
  public class ForZonesNested<N> extends V1ForZoneFluent<ForZonesNested<N>> implements Nested<N>{
  
    V1ForZoneBuilder builder;
    int index;
  
    ForZonesNested(int index,V1ForZone item) {
      this.index = index;
      this.builder = new V1ForZoneBuilder(this, item);
    }
  
    public N and() {
      return (N) V1EndpointHintsFluent.this.setToForZones(index, builder.build());
    }
    
    public N endForZone() {
      return and();
    }
    
  }
}