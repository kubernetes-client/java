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
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta2DeviceRequestAllocationResultFluent<A extends V1beta2DeviceRequestAllocationResultFluent<A>> extends BaseFluent<A>{
  public V1beta2DeviceRequestAllocationResultFluent() {
  }
  
  public V1beta2DeviceRequestAllocationResultFluent(V1beta2DeviceRequestAllocationResult instance) {
    this.copyInstance(instance);
  }
  private Boolean adminAccess;
  private String device;
  private String driver;
  private String pool;
  private String request;
  private ArrayList<V1beta2DeviceTolerationBuilder> tolerations;
  
  protected void copyInstance(V1beta2DeviceRequestAllocationResult instance) {
    instance = (instance != null ? instance : new V1beta2DeviceRequestAllocationResult());
    if (instance != null) {
          this.withAdminAccess(instance.getAdminAccess());
          this.withDevice(instance.getDevice());
          this.withDriver(instance.getDriver());
          this.withPool(instance.getPool());
          this.withRequest(instance.getRequest());
          this.withTolerations(instance.getTolerations());
        }
  }
  
  public Boolean getAdminAccess() {
    return this.adminAccess;
  }
  
  public A withAdminAccess(Boolean adminAccess) {
    this.adminAccess = adminAccess;
    return (A) this;
  }
  
  public boolean hasAdminAccess() {
    return this.adminAccess != null;
  }
  
  public String getDevice() {
    return this.device;
  }
  
  public A withDevice(String device) {
    this.device = device;
    return (A) this;
  }
  
  public boolean hasDevice() {
    return this.device != null;
  }
  
  public String getDriver() {
    return this.driver;
  }
  
  public A withDriver(String driver) {
    this.driver = driver;
    return (A) this;
  }
  
  public boolean hasDriver() {
    return this.driver != null;
  }
  
  public String getPool() {
    return this.pool;
  }
  
  public A withPool(String pool) {
    this.pool = pool;
    return (A) this;
  }
  
  public boolean hasPool() {
    return this.pool != null;
  }
  
  public String getRequest() {
    return this.request;
  }
  
  public A withRequest(String request) {
    this.request = request;
    return (A) this;
  }
  
  public boolean hasRequest() {
    return this.request != null;
  }
  
  public A addToTolerations(int index,V1beta2DeviceToleration item) {
    if (this.tolerations == null) {this.tolerations = new ArrayList<V1beta2DeviceTolerationBuilder>();}
    V1beta2DeviceTolerationBuilder builder = new V1beta2DeviceTolerationBuilder(item);
    if (index < 0 || index >= tolerations.size()) {
        _visitables.get("tolerations").add(builder);
        tolerations.add(builder);
    } else {
        _visitables.get("tolerations").add(builder);
        tolerations.add(index, builder);
    }
    return (A)this;
  }
  
  public A setToTolerations(int index,V1beta2DeviceToleration item) {
    if (this.tolerations == null) {this.tolerations = new ArrayList<V1beta2DeviceTolerationBuilder>();}
    V1beta2DeviceTolerationBuilder builder = new V1beta2DeviceTolerationBuilder(item);
    if (index < 0 || index >= tolerations.size()) {
        _visitables.get("tolerations").add(builder);
        tolerations.add(builder);
    } else {
        _visitables.get("tolerations").add(builder);
        tolerations.set(index, builder);
    }
    return (A)this;
  }
  
  public A addToTolerations(io.kubernetes.client.openapi.models.V1beta2DeviceToleration... items) {
    if (this.tolerations == null) {this.tolerations = new ArrayList<V1beta2DeviceTolerationBuilder>();}
    for (V1beta2DeviceToleration item : items) {V1beta2DeviceTolerationBuilder builder = new V1beta2DeviceTolerationBuilder(item);_visitables.get("tolerations").add(builder);this.tolerations.add(builder);} return (A)this;
  }
  
  public A addAllToTolerations(Collection<V1beta2DeviceToleration> items) {
    if (this.tolerations == null) {this.tolerations = new ArrayList<V1beta2DeviceTolerationBuilder>();}
    for (V1beta2DeviceToleration item : items) {V1beta2DeviceTolerationBuilder builder = new V1beta2DeviceTolerationBuilder(item);_visitables.get("tolerations").add(builder);this.tolerations.add(builder);} return (A)this;
  }
  
  public A removeFromTolerations(io.kubernetes.client.openapi.models.V1beta2DeviceToleration... items) {
    if (this.tolerations == null) return (A)this;
    for (V1beta2DeviceToleration item : items) {V1beta2DeviceTolerationBuilder builder = new V1beta2DeviceTolerationBuilder(item);_visitables.get("tolerations").remove(builder); this.tolerations.remove(builder);} return (A)this;
  }
  
  public A removeAllFromTolerations(Collection<V1beta2DeviceToleration> items) {
    if (this.tolerations == null) return (A)this;
    for (V1beta2DeviceToleration item : items) {V1beta2DeviceTolerationBuilder builder = new V1beta2DeviceTolerationBuilder(item);_visitables.get("tolerations").remove(builder); this.tolerations.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromTolerations(Predicate<V1beta2DeviceTolerationBuilder> predicate) {
    if (tolerations == null) return (A) this;
    final Iterator<V1beta2DeviceTolerationBuilder> each = tolerations.iterator();
    final List visitables = _visitables.get("tolerations");
    while (each.hasNext()) {
      V1beta2DeviceTolerationBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1beta2DeviceToleration> buildTolerations() {
    return this.tolerations != null ? build(tolerations) : null;
  }
  
  public V1beta2DeviceToleration buildToleration(int index) {
    return this.tolerations.get(index).build();
  }
  
  public V1beta2DeviceToleration buildFirstToleration() {
    return this.tolerations.get(0).build();
  }
  
  public V1beta2DeviceToleration buildLastToleration() {
    return this.tolerations.get(tolerations.size() - 1).build();
  }
  
  public V1beta2DeviceToleration buildMatchingToleration(Predicate<V1beta2DeviceTolerationBuilder> predicate) {
      for (V1beta2DeviceTolerationBuilder item : tolerations) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingToleration(Predicate<V1beta2DeviceTolerationBuilder> predicate) {
      for (V1beta2DeviceTolerationBuilder item : tolerations) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withTolerations(List<V1beta2DeviceToleration> tolerations) {
    if (this.tolerations != null) {
      this._visitables.get("tolerations").clear();
    }
    if (tolerations != null) {
        this.tolerations = new ArrayList();
        for (V1beta2DeviceToleration item : tolerations) {
          this.addToTolerations(item);
        }
    } else {
      this.tolerations = null;
    }
    return (A) this;
  }
  
  public A withTolerations(io.kubernetes.client.openapi.models.V1beta2DeviceToleration... tolerations) {
    if (this.tolerations != null) {
        this.tolerations.clear();
        _visitables.remove("tolerations");
    }
    if (tolerations != null) {
      for (V1beta2DeviceToleration item : tolerations) {
        this.addToTolerations(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasTolerations() {
    return this.tolerations != null && !this.tolerations.isEmpty();
  }
  
  public TolerationsNested<A> addNewToleration() {
    return new TolerationsNested(-1, null);
  }
  
  public TolerationsNested<A> addNewTolerationLike(V1beta2DeviceToleration item) {
    return new TolerationsNested(-1, item);
  }
  
  public TolerationsNested<A> setNewTolerationLike(int index,V1beta2DeviceToleration item) {
    return new TolerationsNested(index, item);
  }
  
  public TolerationsNested<A> editToleration(int index) {
    if (tolerations.size() <= index) throw new RuntimeException("Can't edit tolerations. Index exceeds size.");
    return setNewTolerationLike(index, buildToleration(index));
  }
  
  public TolerationsNested<A> editFirstToleration() {
    if (tolerations.size() == 0) throw new RuntimeException("Can't edit first tolerations. The list is empty.");
    return setNewTolerationLike(0, buildToleration(0));
  }
  
  public TolerationsNested<A> editLastToleration() {
    int index = tolerations.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last tolerations. The list is empty.");
    return setNewTolerationLike(index, buildToleration(index));
  }
  
  public TolerationsNested<A> editMatchingToleration(Predicate<V1beta2DeviceTolerationBuilder> predicate) {
    int index = -1;
    for (int i=0;i<tolerations.size();i++) { 
    if (predicate.test(tolerations.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching tolerations. No match found.");
    return setNewTolerationLike(index, buildToleration(index));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta2DeviceRequestAllocationResultFluent that = (V1beta2DeviceRequestAllocationResultFluent) o;
    if (!java.util.Objects.equals(adminAccess, that.adminAccess)) return false;
    if (!java.util.Objects.equals(device, that.device)) return false;
    if (!java.util.Objects.equals(driver, that.driver)) return false;
    if (!java.util.Objects.equals(pool, that.pool)) return false;
    if (!java.util.Objects.equals(request, that.request)) return false;
    if (!java.util.Objects.equals(tolerations, that.tolerations)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(adminAccess,  device,  driver,  pool,  request,  tolerations,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (adminAccess != null) { sb.append("adminAccess:"); sb.append(adminAccess + ","); }
    if (device != null) { sb.append("device:"); sb.append(device + ","); }
    if (driver != null) { sb.append("driver:"); sb.append(driver + ","); }
    if (pool != null) { sb.append("pool:"); sb.append(pool + ","); }
    if (request != null) { sb.append("request:"); sb.append(request + ","); }
    if (tolerations != null && !tolerations.isEmpty()) { sb.append("tolerations:"); sb.append(tolerations); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withAdminAccess() {
    return withAdminAccess(true);
  }
  public class TolerationsNested<N> extends V1beta2DeviceTolerationFluent<TolerationsNested<N>> implements Nested<N>{
    TolerationsNested(int index,V1beta2DeviceToleration item) {
      this.index = index;
      this.builder = new V1beta2DeviceTolerationBuilder(this, item);
    }
    V1beta2DeviceTolerationBuilder builder;
    int index;
    
    public N and() {
      return (N) V1beta2DeviceRequestAllocationResultFluent.this.setToTolerations(index,builder.build());
    }
    
    public N endToleration() {
      return and();
    }
    
  
  }

}