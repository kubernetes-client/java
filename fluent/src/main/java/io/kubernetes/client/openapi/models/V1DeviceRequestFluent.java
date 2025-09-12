package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.RuntimeException;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Objects;
import java.util.Collection;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1DeviceRequestFluent<A extends io.kubernetes.client.openapi.models.V1DeviceRequestFluent<A>> extends BaseFluent<A>{
  public V1DeviceRequestFluent() {
  }
  
  public V1DeviceRequestFluent(V1DeviceRequest instance) {
    this.copyInstance(instance);
  }
  private V1ExactDeviceRequestBuilder exactly;
  private ArrayList<V1DeviceSubRequestBuilder> firstAvailable;
  private String name;
  
  protected void copyInstance(V1DeviceRequest instance) {
    instance = instance != null ? instance : new V1DeviceRequest();
    if (instance != null) {
        this.withExactly(instance.getExactly());
        this.withFirstAvailable(instance.getFirstAvailable());
        this.withName(instance.getName());
    }
  }
  
  public V1ExactDeviceRequest buildExactly() {
    return this.exactly != null ? this.exactly.build() : null;
  }
  
  public A withExactly(V1ExactDeviceRequest exactly) {
    this._visitables.remove("exactly");
    if (exactly != null) {
        this.exactly = new V1ExactDeviceRequestBuilder(exactly);
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
  
  public ExactlyNested<A> withNewExactlyLike(V1ExactDeviceRequest item) {
    return new ExactlyNested(item);
  }
  
  public ExactlyNested<A> editExactly() {
    return this.withNewExactlyLike(Optional.ofNullable(this.buildExactly()).orElse(null));
  }
  
  public ExactlyNested<A> editOrNewExactly() {
    return this.withNewExactlyLike(Optional.ofNullable(this.buildExactly()).orElse(new V1ExactDeviceRequestBuilder().build()));
  }
  
  public ExactlyNested<A> editOrNewExactlyLike(V1ExactDeviceRequest item) {
    return this.withNewExactlyLike(Optional.ofNullable(this.buildExactly()).orElse(item));
  }
  
  public A addToFirstAvailable(int index,V1DeviceSubRequest item) {
    if (this.firstAvailable == null) {
      this.firstAvailable = new ArrayList();
    }
    V1DeviceSubRequestBuilder builder = new V1DeviceSubRequestBuilder(item);
    if (index < 0 || index >= firstAvailable.size()) {
        _visitables.get("firstAvailable").add(builder);
        firstAvailable.add(builder);
    } else {
        _visitables.get("firstAvailable").add(builder);
        firstAvailable.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToFirstAvailable(int index,V1DeviceSubRequest item) {
    if (this.firstAvailable == null) {
      this.firstAvailable = new ArrayList();
    }
    V1DeviceSubRequestBuilder builder = new V1DeviceSubRequestBuilder(item);
    if (index < 0 || index >= firstAvailable.size()) {
        _visitables.get("firstAvailable").add(builder);
        firstAvailable.add(builder);
    } else {
        _visitables.get("firstAvailable").add(builder);
        firstAvailable.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToFirstAvailable(V1DeviceSubRequest... items) {
    if (this.firstAvailable == null) {
      this.firstAvailable = new ArrayList();
    }
    for (V1DeviceSubRequest item : items) {
        V1DeviceSubRequestBuilder builder = new V1DeviceSubRequestBuilder(item);
        _visitables.get("firstAvailable").add(builder);
        this.firstAvailable.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToFirstAvailable(Collection<V1DeviceSubRequest> items) {
    if (this.firstAvailable == null) {
      this.firstAvailable = new ArrayList();
    }
    for (V1DeviceSubRequest item : items) {
        V1DeviceSubRequestBuilder builder = new V1DeviceSubRequestBuilder(item);
        _visitables.get("firstAvailable").add(builder);
        this.firstAvailable.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromFirstAvailable(V1DeviceSubRequest... items) {
    if (this.firstAvailable == null) {
      return (A) this;
    }
    for (V1DeviceSubRequest item : items) {
        V1DeviceSubRequestBuilder builder = new V1DeviceSubRequestBuilder(item);
        _visitables.get("firstAvailable").remove(builder);
        this.firstAvailable.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromFirstAvailable(Collection<V1DeviceSubRequest> items) {
    if (this.firstAvailable == null) {
      return (A) this;
    }
    for (V1DeviceSubRequest item : items) {
        V1DeviceSubRequestBuilder builder = new V1DeviceSubRequestBuilder(item);
        _visitables.get("firstAvailable").remove(builder);
        this.firstAvailable.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromFirstAvailable(Predicate<V1DeviceSubRequestBuilder> predicate) {
    if (firstAvailable == null) {
      return (A) this;
    }
    Iterator<V1DeviceSubRequestBuilder> each = firstAvailable.iterator();
    List visitables = _visitables.get("firstAvailable");
    while (each.hasNext()) {
        V1DeviceSubRequestBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public List<V1DeviceSubRequest> buildFirstAvailable() {
    return this.firstAvailable != null ? build(firstAvailable) : null;
  }
  
  public V1DeviceSubRequest buildFirstAvailable(int index) {
    return this.firstAvailable.get(index).build();
  }
  
  public V1DeviceSubRequest buildFirstFirstAvailable() {
    return this.firstAvailable.get(0).build();
  }
  
  public V1DeviceSubRequest buildLastFirstAvailable() {
    return this.firstAvailable.get(firstAvailable.size() - 1).build();
  }
  
  public V1DeviceSubRequest buildMatchingFirstAvailable(Predicate<V1DeviceSubRequestBuilder> predicate) {
      for (V1DeviceSubRequestBuilder item : firstAvailable) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingFirstAvailable(Predicate<V1DeviceSubRequestBuilder> predicate) {
      for (V1DeviceSubRequestBuilder item : firstAvailable) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withFirstAvailable(List<V1DeviceSubRequest> firstAvailable) {
    if (this.firstAvailable != null) {
      this._visitables.get("firstAvailable").clear();
    }
    if (firstAvailable != null) {
        this.firstAvailable = new ArrayList();
        for (V1DeviceSubRequest item : firstAvailable) {
          this.addToFirstAvailable(item);
        }
    } else {
      this.firstAvailable = null;
    }
    return (A) this;
  }
  
  public A withFirstAvailable(V1DeviceSubRequest... firstAvailable) {
    if (this.firstAvailable != null) {
        this.firstAvailable.clear();
        _visitables.remove("firstAvailable");
    }
    if (firstAvailable != null) {
      for (V1DeviceSubRequest item : firstAvailable) {
        this.addToFirstAvailable(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasFirstAvailable() {
    return this.firstAvailable != null && !(this.firstAvailable.isEmpty());
  }
  
  public FirstAvailableNested<A> addNewFirstAvailable() {
    return new FirstAvailableNested(-1, null);
  }
  
  public FirstAvailableNested<A> addNewFirstAvailableLike(V1DeviceSubRequest item) {
    return new FirstAvailableNested(-1, item);
  }
  
  public FirstAvailableNested<A> setNewFirstAvailableLike(int index,V1DeviceSubRequest item) {
    return new FirstAvailableNested(index, item);
  }
  
  public FirstAvailableNested<A> editFirstAvailable(int index) {
    if (index <= firstAvailable.size()) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "firstAvailable"));
    }
    return this.setNewFirstAvailableLike(index, this.buildFirstAvailable(index));
  }
  
  public FirstAvailableNested<A> editFirstFirstAvailable() {
    if (firstAvailable.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "firstAvailable"));
    }
    return this.setNewFirstAvailableLike(0, this.buildFirstAvailable(0));
  }
  
  public FirstAvailableNested<A> editLastFirstAvailable() {
    int index = firstAvailable.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "firstAvailable"));
    }
    return this.setNewFirstAvailableLike(index, this.buildFirstAvailable(index));
  }
  
  public FirstAvailableNested<A> editMatchingFirstAvailable(Predicate<V1DeviceSubRequestBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < firstAvailable.size();i++) {
      if (predicate.test(firstAvailable.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "firstAvailable"));
    }
    return this.setNewFirstAvailableLike(index, this.buildFirstAvailable(index));
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
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1DeviceRequestFluent that = (V1DeviceRequestFluent) o;
    if (!(Objects.equals(exactly, that.exactly))) {
      return false;
    }
    if (!(Objects.equals(firstAvailable, that.firstAvailable))) {
      return false;
    }
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(exactly, firstAvailable, name);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(exactly == null)) {
        sb.append("exactly:");
        sb.append(exactly);
        sb.append(",");
    }
    if (!(firstAvailable == null) && !(firstAvailable.isEmpty())) {
        sb.append("firstAvailable:");
        sb.append(firstAvailable);
        sb.append(",");
    }
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
    }
    sb.append("}");
    return sb.toString();
  }
  public class ExactlyNested<N> extends V1ExactDeviceRequestFluent<ExactlyNested<N>> implements Nested<N>{
    ExactlyNested(V1ExactDeviceRequest item) {
      this.builder = new V1ExactDeviceRequestBuilder(this, item);
    }
    V1ExactDeviceRequestBuilder builder;
    
    public N and() {
      return (N) V1DeviceRequestFluent.this.withExactly(builder.build());
    }
    
    public N endExactly() {
      return and();
    }
    
  
  }
  public class FirstAvailableNested<N> extends V1DeviceSubRequestFluent<FirstAvailableNested<N>> implements Nested<N>{
    FirstAvailableNested(int index,V1DeviceSubRequest item) {
      this.index = index;
      this.builder = new V1DeviceSubRequestBuilder(this, item);
    }
    V1DeviceSubRequestBuilder builder;
    int index;
    
    public N and() {
      return (N) V1DeviceRequestFluent.this.setToFirstAvailable(index, builder.build());
    }
    
    public N endFirstAvailable() {
      return and();
    }
    
  
  }

}