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
public class V1beta1AllocatedDeviceStatusFluent<A extends V1beta1AllocatedDeviceStatusFluent<A>> extends BaseFluent<A>{
  public V1beta1AllocatedDeviceStatusFluent() {
  }
  
  public V1beta1AllocatedDeviceStatusFluent(V1beta1AllocatedDeviceStatus instance) {
    this.copyInstance(instance);
  }
  private ArrayList<V1ConditionBuilder> conditions;
  private Object data;
  private String device;
  private String driver;
  private V1beta1NetworkDeviceDataBuilder networkData;
  private String pool;
  
  protected void copyInstance(V1beta1AllocatedDeviceStatus instance) {
    instance = (instance != null ? instance : new V1beta1AllocatedDeviceStatus());
    if (instance != null) {
          this.withConditions(instance.getConditions());
          this.withData(instance.getData());
          this.withDevice(instance.getDevice());
          this.withDriver(instance.getDriver());
          this.withNetworkData(instance.getNetworkData());
          this.withPool(instance.getPool());
        }
  }
  
  public A addToConditions(int index,V1Condition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1ConditionBuilder>();}
    V1ConditionBuilder builder = new V1ConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) { _visitables.get("conditions").add(builder); conditions.add(builder); } else { _visitables.get("conditions").add(index, builder); conditions.add(index, builder);}
    return (A)this;
  }
  
  public A setToConditions(int index,V1Condition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1ConditionBuilder>();}
    V1ConditionBuilder builder = new V1ConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) { _visitables.get("conditions").add(builder); conditions.add(builder); } else { _visitables.get("conditions").set(index, builder); conditions.set(index, builder);}
    return (A)this;
  }
  
  public A addToConditions(io.kubernetes.client.openapi.models.V1Condition... items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1ConditionBuilder>();}
    for (V1Condition item : items) {V1ConditionBuilder builder = new V1ConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  
  public A addAllToConditions(Collection<V1Condition> items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1ConditionBuilder>();}
    for (V1Condition item : items) {V1ConditionBuilder builder = new V1ConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1Condition... items) {
    if (this.conditions == null) return (A)this;
    for (V1Condition item : items) {V1ConditionBuilder builder = new V1ConditionBuilder(item);_visitables.get("conditions").remove(builder); this.conditions.remove(builder);} return (A)this;
  }
  
  public A removeAllFromConditions(Collection<V1Condition> items) {
    if (this.conditions == null) return (A)this;
    for (V1Condition item : items) {V1ConditionBuilder builder = new V1ConditionBuilder(item);_visitables.get("conditions").remove(builder); this.conditions.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromConditions(Predicate<V1ConditionBuilder> predicate) {
    if (conditions == null) return (A) this;
    final Iterator<V1ConditionBuilder> each = conditions.iterator();
    final List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
      V1ConditionBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1Condition> buildConditions() {
    return this.conditions != null ? build(conditions) : null;
  }
  
  public V1Condition buildCondition(int index) {
    return this.conditions.get(index).build();
  }
  
  public V1Condition buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  
  public V1Condition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  
  public V1Condition buildMatchingCondition(Predicate<V1ConditionBuilder> predicate) {
      for (V1ConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingCondition(Predicate<V1ConditionBuilder> predicate) {
      for (V1ConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withConditions(List<V1Condition> conditions) {
    if (this.conditions != null) {
      this._visitables.get("conditions").clear();
    }
    if (conditions != null) {
        this.conditions = new ArrayList();
        for (V1Condition item : conditions) {
          this.addToConditions(item);
        }
    } else {
      this.conditions = null;
    }
    return (A) this;
  }
  
  public A withConditions(io.kubernetes.client.openapi.models.V1Condition... conditions) {
    if (this.conditions != null) {
        this.conditions.clear();
        _visitables.remove("conditions");
    }
    if (conditions != null) {
      for (V1Condition item : conditions) {
        this.addToConditions(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasConditions() {
    return this.conditions != null && !this.conditions.isEmpty();
  }
  
  public ConditionsNested<A> addNewCondition() {
    return new ConditionsNested(-1, null);
  }
  
  public ConditionsNested<A> addNewConditionLike(V1Condition item) {
    return new ConditionsNested(-1, item);
  }
  
  public ConditionsNested<A> setNewConditionLike(int index,V1Condition item) {
    return new ConditionsNested(index, item);
  }
  
  public ConditionsNested<A> editCondition(int index) {
    if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
    return setNewConditionLike(index, buildCondition(index));
  }
  
  public ConditionsNested<A> editFirstCondition() {
    if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
    return setNewConditionLike(0, buildCondition(0));
  }
  
  public ConditionsNested<A> editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
    return setNewConditionLike(index, buildCondition(index));
  }
  
  public ConditionsNested<A> editMatchingCondition(Predicate<V1ConditionBuilder> predicate) {
    int index = -1;
    for (int i=0;i<conditions.size();i++) { 
    if (predicate.test(conditions.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
    return setNewConditionLike(index, buildCondition(index));
  }
  
  public Object getData() {
    return this.data;
  }
  
  public A withData(Object data) {
    this.data = data;
    return (A) this;
  }
  
  public boolean hasData() {
    return this.data != null;
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
  
  public V1beta1NetworkDeviceData buildNetworkData() {
    return this.networkData != null ? this.networkData.build() : null;
  }
  
  public A withNetworkData(V1beta1NetworkDeviceData networkData) {
    this._visitables.remove("networkData");
    if (networkData != null) {
        this.networkData = new V1beta1NetworkDeviceDataBuilder(networkData);
        this._visitables.get("networkData").add(this.networkData);
    } else {
        this.networkData = null;
        this._visitables.get("networkData").remove(this.networkData);
    }
    return (A) this;
  }
  
  public boolean hasNetworkData() {
    return this.networkData != null;
  }
  
  public NetworkDataNested<A> withNewNetworkData() {
    return new NetworkDataNested(null);
  }
  
  public NetworkDataNested<A> withNewNetworkDataLike(V1beta1NetworkDeviceData item) {
    return new NetworkDataNested(item);
  }
  
  public NetworkDataNested<A> editNetworkData() {
    return withNewNetworkDataLike(java.util.Optional.ofNullable(buildNetworkData()).orElse(null));
  }
  
  public NetworkDataNested<A> editOrNewNetworkData() {
    return withNewNetworkDataLike(java.util.Optional.ofNullable(buildNetworkData()).orElse(new V1beta1NetworkDeviceDataBuilder().build()));
  }
  
  public NetworkDataNested<A> editOrNewNetworkDataLike(V1beta1NetworkDeviceData item) {
    return withNewNetworkDataLike(java.util.Optional.ofNullable(buildNetworkData()).orElse(item));
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
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta1AllocatedDeviceStatusFluent that = (V1beta1AllocatedDeviceStatusFluent) o;
    if (!java.util.Objects.equals(conditions, that.conditions)) return false;
    if (!java.util.Objects.equals(data, that.data)) return false;
    if (!java.util.Objects.equals(device, that.device)) return false;
    if (!java.util.Objects.equals(driver, that.driver)) return false;
    if (!java.util.Objects.equals(networkData, that.networkData)) return false;
    if (!java.util.Objects.equals(pool, that.pool)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(conditions,  data,  device,  driver,  networkData,  pool,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (conditions != null && !conditions.isEmpty()) { sb.append("conditions:"); sb.append(conditions + ","); }
    if (data != null) { sb.append("data:"); sb.append(data + ","); }
    if (device != null) { sb.append("device:"); sb.append(device + ","); }
    if (driver != null) { sb.append("driver:"); sb.append(driver + ","); }
    if (networkData != null) { sb.append("networkData:"); sb.append(networkData + ","); }
    if (pool != null) { sb.append("pool:"); sb.append(pool); }
    sb.append("}");
    return sb.toString();
  }
  public class ConditionsNested<N> extends V1ConditionFluent<ConditionsNested<N>> implements Nested<N>{
    ConditionsNested(int index,V1Condition item) {
      this.index = index;
      this.builder = new V1ConditionBuilder(this, item);
    }
    V1ConditionBuilder builder;
    int index;
    
    public N and() {
      return (N) V1beta1AllocatedDeviceStatusFluent.this.setToConditions(index,builder.build());
    }
    
    public N endCondition() {
      return and();
    }
    
  
  }
  public class NetworkDataNested<N> extends V1beta1NetworkDeviceDataFluent<NetworkDataNested<N>> implements Nested<N>{
    NetworkDataNested(V1beta1NetworkDeviceData item) {
      this.builder = new V1beta1NetworkDeviceDataBuilder(this, item);
    }
    V1beta1NetworkDeviceDataBuilder builder;
    
    public N and() {
      return (N) V1beta1AllocatedDeviceStatusFluent.this.withNetworkData(builder.build());
    }
    
    public N endNetworkData() {
      return and();
    }
    
  
  }

}