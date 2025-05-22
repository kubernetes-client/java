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
public class V1beta2DeviceRequestFluent<A extends V1beta2DeviceRequestFluent<A>> extends BaseFluent<A>{
  public V1beta2DeviceRequestFluent() {
  }
  
  public V1beta2DeviceRequestFluent(V1beta2DeviceRequest instance) {
    this.copyInstance(instance);
  }
  private V1beta2ExactDeviceRequestBuilder exactly;
  private ArrayList<V1beta2DeviceSubRequestBuilder> firstAvailable;
  private String name;
  
  protected void copyInstance(V1beta2DeviceRequest instance) {
    instance = (instance != null ? instance : new V1beta2DeviceRequest());
    if (instance != null) {
          this.withExactly(instance.getExactly());
          this.withFirstAvailable(instance.getFirstAvailable());
          this.withName(instance.getName());
        }
  }
  
  public V1beta2ExactDeviceRequest buildExactly() {
    return this.exactly != null ? this.exactly.build() : null;
  }
  
  public A withExactly(V1beta2ExactDeviceRequest exactly) {
    this._visitables.remove("exactly");
    if (exactly != null) {
        this.exactly = new V1beta2ExactDeviceRequestBuilder(exactly);
        this._visitables.get("exactly").add(this.exactly);
    } else {
        this.exactly = null;
        this._visitables.get("exactly").remove(this.exactly);
    }
    return (A) this;
  }
  
  public boolean hasExactly() {
    return this.exactly != null;
  }
  
  public ExactlyNested<A> withNewExactly() {
    return new ExactlyNested(null);
  }
  
  public ExactlyNested<A> withNewExactlyLike(V1beta2ExactDeviceRequest item) {
    return new ExactlyNested(item);
  }
  
  public ExactlyNested<A> editExactly() {
    return withNewExactlyLike(java.util.Optional.ofNullable(buildExactly()).orElse(null));
  }
  
  public ExactlyNested<A> editOrNewExactly() {
    return withNewExactlyLike(java.util.Optional.ofNullable(buildExactly()).orElse(new V1beta2ExactDeviceRequestBuilder().build()));
  }
  
  public ExactlyNested<A> editOrNewExactlyLike(V1beta2ExactDeviceRequest item) {
    return withNewExactlyLike(java.util.Optional.ofNullable(buildExactly()).orElse(item));
  }
  
  public A addToFirstAvailable(int index,V1beta2DeviceSubRequest item) {
    if (this.firstAvailable == null) {this.firstAvailable = new ArrayList<V1beta2DeviceSubRequestBuilder>();}
    V1beta2DeviceSubRequestBuilder builder = new V1beta2DeviceSubRequestBuilder(item);
    if (index < 0 || index >= firstAvailable.size()) {
        _visitables.get("firstAvailable").add(builder);
        firstAvailable.add(builder);
    } else {
        _visitables.get("firstAvailable").add(builder);
        firstAvailable.add(index, builder);
    }
    return (A)this;
  }
  
  public A setToFirstAvailable(int index,V1beta2DeviceSubRequest item) {
    if (this.firstAvailable == null) {this.firstAvailable = new ArrayList<V1beta2DeviceSubRequestBuilder>();}
    V1beta2DeviceSubRequestBuilder builder = new V1beta2DeviceSubRequestBuilder(item);
    if (index < 0 || index >= firstAvailable.size()) {
        _visitables.get("firstAvailable").add(builder);
        firstAvailable.add(builder);
    } else {
        _visitables.get("firstAvailable").add(builder);
        firstAvailable.set(index, builder);
    }
    return (A)this;
  }
  
  public A addToFirstAvailable(io.kubernetes.client.openapi.models.V1beta2DeviceSubRequest... items) {
    if (this.firstAvailable == null) {this.firstAvailable = new ArrayList<V1beta2DeviceSubRequestBuilder>();}
    for (V1beta2DeviceSubRequest item : items) {V1beta2DeviceSubRequestBuilder builder = new V1beta2DeviceSubRequestBuilder(item);_visitables.get("firstAvailable").add(builder);this.firstAvailable.add(builder);} return (A)this;
  }
  
  public A addAllToFirstAvailable(Collection<V1beta2DeviceSubRequest> items) {
    if (this.firstAvailable == null) {this.firstAvailable = new ArrayList<V1beta2DeviceSubRequestBuilder>();}
    for (V1beta2DeviceSubRequest item : items) {V1beta2DeviceSubRequestBuilder builder = new V1beta2DeviceSubRequestBuilder(item);_visitables.get("firstAvailable").add(builder);this.firstAvailable.add(builder);} return (A)this;
  }
  
  public A removeFromFirstAvailable(io.kubernetes.client.openapi.models.V1beta2DeviceSubRequest... items) {
    if (this.firstAvailable == null) return (A)this;
    for (V1beta2DeviceSubRequest item : items) {V1beta2DeviceSubRequestBuilder builder = new V1beta2DeviceSubRequestBuilder(item);_visitables.get("firstAvailable").remove(builder); this.firstAvailable.remove(builder);} return (A)this;
  }
  
  public A removeAllFromFirstAvailable(Collection<V1beta2DeviceSubRequest> items) {
    if (this.firstAvailable == null) return (A)this;
    for (V1beta2DeviceSubRequest item : items) {V1beta2DeviceSubRequestBuilder builder = new V1beta2DeviceSubRequestBuilder(item);_visitables.get("firstAvailable").remove(builder); this.firstAvailable.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromFirstAvailable(Predicate<V1beta2DeviceSubRequestBuilder> predicate) {
    if (firstAvailable == null) return (A) this;
    final Iterator<V1beta2DeviceSubRequestBuilder> each = firstAvailable.iterator();
    final List visitables = _visitables.get("firstAvailable");
    while (each.hasNext()) {
      V1beta2DeviceSubRequestBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1beta2DeviceSubRequest> buildFirstAvailable() {
    return this.firstAvailable != null ? build(firstAvailable) : null;
  }
  
  public V1beta2DeviceSubRequest buildFirstAvailable(int index) {
    return this.firstAvailable.get(index).build();
  }
  
  public V1beta2DeviceSubRequest buildFirstFirstAvailable() {
    return this.firstAvailable.get(0).build();
  }
  
  public V1beta2DeviceSubRequest buildLastFirstAvailable() {
    return this.firstAvailable.get(firstAvailable.size() - 1).build();
  }
  
  public V1beta2DeviceSubRequest buildMatchingFirstAvailable(Predicate<V1beta2DeviceSubRequestBuilder> predicate) {
      for (V1beta2DeviceSubRequestBuilder item : firstAvailable) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingFirstAvailable(Predicate<V1beta2DeviceSubRequestBuilder> predicate) {
      for (V1beta2DeviceSubRequestBuilder item : firstAvailable) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withFirstAvailable(List<V1beta2DeviceSubRequest> firstAvailable) {
    if (this.firstAvailable != null) {
      this._visitables.get("firstAvailable").clear();
    }
    if (firstAvailable != null) {
        this.firstAvailable = new ArrayList();
        for (V1beta2DeviceSubRequest item : firstAvailable) {
          this.addToFirstAvailable(item);
        }
    } else {
      this.firstAvailable = null;
    }
    return (A) this;
  }
  
  public A withFirstAvailable(io.kubernetes.client.openapi.models.V1beta2DeviceSubRequest... firstAvailable) {
    if (this.firstAvailable != null) {
        this.firstAvailable.clear();
        _visitables.remove("firstAvailable");
    }
    if (firstAvailable != null) {
      for (V1beta2DeviceSubRequest item : firstAvailable) {
        this.addToFirstAvailable(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasFirstAvailable() {
    return this.firstAvailable != null && !this.firstAvailable.isEmpty();
  }
  
  public FirstAvailableNested<A> addNewFirstAvailable() {
    return new FirstAvailableNested(-1, null);
  }
  
  public FirstAvailableNested<A> addNewFirstAvailableLike(V1beta2DeviceSubRequest item) {
    return new FirstAvailableNested(-1, item);
  }
  
  public FirstAvailableNested<A> setNewFirstAvailableLike(int index,V1beta2DeviceSubRequest item) {
    return new FirstAvailableNested(index, item);
  }
  
  public FirstAvailableNested<A> editFirstAvailable(int index) {
    if (firstAvailable.size() <= index) throw new RuntimeException("Can't edit firstAvailable. Index exceeds size.");
    return setNewFirstAvailableLike(index, buildFirstAvailable(index));
  }
  
  public FirstAvailableNested<A> editFirstFirstAvailable() {
    if (firstAvailable.size() == 0) throw new RuntimeException("Can't edit first firstAvailable. The list is empty.");
    return setNewFirstAvailableLike(0, buildFirstAvailable(0));
  }
  
  public FirstAvailableNested<A> editLastFirstAvailable() {
    int index = firstAvailable.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last firstAvailable. The list is empty.");
    return setNewFirstAvailableLike(index, buildFirstAvailable(index));
  }
  
  public FirstAvailableNested<A> editMatchingFirstAvailable(Predicate<V1beta2DeviceSubRequestBuilder> predicate) {
    int index = -1;
    for (int i=0;i<firstAvailable.size();i++) { 
    if (predicate.test(firstAvailable.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching firstAvailable. No match found.");
    return setNewFirstAvailableLike(index, buildFirstAvailable(index));
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
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta2DeviceRequestFluent that = (V1beta2DeviceRequestFluent) o;
    if (!java.util.Objects.equals(exactly, that.exactly)) return false;
    if (!java.util.Objects.equals(firstAvailable, that.firstAvailable)) return false;
    if (!java.util.Objects.equals(name, that.name)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(exactly,  firstAvailable,  name,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (exactly != null) { sb.append("exactly:"); sb.append(exactly + ","); }
    if (firstAvailable != null && !firstAvailable.isEmpty()) { sb.append("firstAvailable:"); sb.append(firstAvailable + ","); }
    if (name != null) { sb.append("name:"); sb.append(name); }
    sb.append("}");
    return sb.toString();
  }
  public class ExactlyNested<N> extends V1beta2ExactDeviceRequestFluent<ExactlyNested<N>> implements Nested<N>{
    ExactlyNested(V1beta2ExactDeviceRequest item) {
      this.builder = new V1beta2ExactDeviceRequestBuilder(this, item);
    }
    V1beta2ExactDeviceRequestBuilder builder;
    
    public N and() {
      return (N) V1beta2DeviceRequestFluent.this.withExactly(builder.build());
    }
    
    public N endExactly() {
      return and();
    }
    
  
  }
  public class FirstAvailableNested<N> extends V1beta2DeviceSubRequestFluent<FirstAvailableNested<N>> implements Nested<N>{
    FirstAvailableNested(int index,V1beta2DeviceSubRequest item) {
      this.index = index;
      this.builder = new V1beta2DeviceSubRequestBuilder(this, item);
    }
    V1beta2DeviceSubRequestBuilder builder;
    int index;
    
    public N and() {
      return (N) V1beta2DeviceRequestFluent.this.setToFirstAvailable(index,builder.build());
    }
    
    public N endFirstAvailable() {
      return and();
    }
    
  
  }

}