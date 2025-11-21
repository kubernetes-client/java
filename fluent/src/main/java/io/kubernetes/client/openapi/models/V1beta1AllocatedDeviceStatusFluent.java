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
import java.util.Optional;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta1AllocatedDeviceStatusFluent<A extends io.kubernetes.client.openapi.models.V1beta1AllocatedDeviceStatusFluent<A>> extends BaseFluent<A>{

  private ArrayList<V1ConditionBuilder> conditions;
  private Object data;
  private String device;
  private String driver;
  private V1beta1NetworkDeviceDataBuilder networkData;
  private String pool;
  private String shareID;

  public V1beta1AllocatedDeviceStatusFluent() {
  }
  
  public V1beta1AllocatedDeviceStatusFluent(V1beta1AllocatedDeviceStatus instance) {
    this.copyInstance(instance);
  }

  public A addAllToConditions(Collection<V1Condition> items) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    for (V1Condition item : items) {
        V1ConditionBuilder builder = new V1ConditionBuilder(item);
        _visitables.get("conditions").add(builder);
        this.conditions.add(builder);
    }
    return (A) this;
  }
  
  public ConditionsNested<A> addNewCondition() {
    return new ConditionsNested(-1, null);
  }
  
  public ConditionsNested<A> addNewConditionLike(V1Condition item) {
    return new ConditionsNested(-1, item);
  }
  
  public A addToConditions(V1Condition... items) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    for (V1Condition item : items) {
        V1ConditionBuilder builder = new V1ConditionBuilder(item);
        _visitables.get("conditions").add(builder);
        this.conditions.add(builder);
    }
    return (A) this;
  }
  
  public A addToConditions(int index,V1Condition item) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    V1ConditionBuilder builder = new V1ConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) {
        _visitables.get("conditions").add(builder);
        conditions.add(builder);
    } else {
        _visitables.get("conditions").add(builder);
        conditions.add(index, builder);
    }
    return (A) this;
  }
  
  public V1Condition buildCondition(int index) {
    return this.conditions.get(index).build();
  }
  
  public List<V1Condition> buildConditions() {
    return this.conditions != null ? build(conditions) : null;
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
  
  public V1beta1NetworkDeviceData buildNetworkData() {
    return this.networkData != null ? this.networkData.build() : null;
  }
  
  protected void copyInstance(V1beta1AllocatedDeviceStatus instance) {
    instance = instance != null ? instance : new V1beta1AllocatedDeviceStatus();
    if (instance != null) {
        this.withConditions(instance.getConditions());
        this.withData(instance.getData());
        this.withDevice(instance.getDevice());
        this.withDriver(instance.getDriver());
        this.withNetworkData(instance.getNetworkData());
        this.withPool(instance.getPool());
        this.withShareID(instance.getShareID());
    }
  }
  
  public ConditionsNested<A> editCondition(int index) {
    if (conditions.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "conditions"));
    }
    return this.setNewConditionLike(index, this.buildCondition(index));
  }
  
  public ConditionsNested<A> editFirstCondition() {
    if (conditions.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "conditions"));
    }
    return this.setNewConditionLike(0, this.buildCondition(0));
  }
  
  public ConditionsNested<A> editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "conditions"));
    }
    return this.setNewConditionLike(index, this.buildCondition(index));
  }
  
  public ConditionsNested<A> editMatchingCondition(Predicate<V1ConditionBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < conditions.size();i++) {
      if (predicate.test(conditions.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "conditions"));
    }
    return this.setNewConditionLike(index, this.buildCondition(index));
  }
  
  public NetworkDataNested<A> editNetworkData() {
    return this.withNewNetworkDataLike(Optional.ofNullable(this.buildNetworkData()).orElse(null));
  }
  
  public NetworkDataNested<A> editOrNewNetworkData() {
    return this.withNewNetworkDataLike(Optional.ofNullable(this.buildNetworkData()).orElse(new V1beta1NetworkDeviceDataBuilder().build()));
  }
  
  public NetworkDataNested<A> editOrNewNetworkDataLike(V1beta1NetworkDeviceData item) {
    return this.withNewNetworkDataLike(Optional.ofNullable(this.buildNetworkData()).orElse(item));
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
    V1beta1AllocatedDeviceStatusFluent that = (V1beta1AllocatedDeviceStatusFluent) o;
    if (!(Objects.equals(conditions, that.conditions))) {
      return false;
    }
    if (!(Objects.equals(data, that.data))) {
      return false;
    }
    if (!(Objects.equals(device, that.device))) {
      return false;
    }
    if (!(Objects.equals(driver, that.driver))) {
      return false;
    }
    if (!(Objects.equals(networkData, that.networkData))) {
      return false;
    }
    if (!(Objects.equals(pool, that.pool))) {
      return false;
    }
    if (!(Objects.equals(shareID, that.shareID))) {
      return false;
    }
    return true;
  }
  
  public Object getData() {
    return this.data;
  }
  
  public String getDevice() {
    return this.device;
  }
  
  public String getDriver() {
    return this.driver;
  }
  
  public String getPool() {
    return this.pool;
  }
  
  public String getShareID() {
    return this.shareID;
  }
  
  public boolean hasConditions() {
    return this.conditions != null && !(this.conditions.isEmpty());
  }
  
  public boolean hasData() {
    return this.data != null;
  }
  
  public boolean hasDevice() {
    return this.device != null;
  }
  
  public boolean hasDriver() {
    return this.driver != null;
  }
  
  public boolean hasMatchingCondition(Predicate<V1ConditionBuilder> predicate) {
      for (V1ConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasNetworkData() {
    return this.networkData != null;
  }
  
  public boolean hasPool() {
    return this.pool != null;
  }
  
  public boolean hasShareID() {
    return this.shareID != null;
  }
  
  public int hashCode() {
    return Objects.hash(conditions, data, device, driver, networkData, pool, shareID);
  }
  
  public A removeAllFromConditions(Collection<V1Condition> items) {
    if (this.conditions == null) {
      return (A) this;
    }
    for (V1Condition item : items) {
        V1ConditionBuilder builder = new V1ConditionBuilder(item);
        _visitables.get("conditions").remove(builder);
        this.conditions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromConditions(V1Condition... items) {
    if (this.conditions == null) {
      return (A) this;
    }
    for (V1Condition item : items) {
        V1ConditionBuilder builder = new V1ConditionBuilder(item);
        _visitables.get("conditions").remove(builder);
        this.conditions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromConditions(Predicate<V1ConditionBuilder> predicate) {
    if (conditions == null) {
      return (A) this;
    }
    Iterator<V1ConditionBuilder> each = conditions.iterator();
    List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
        V1ConditionBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public ConditionsNested<A> setNewConditionLike(int index,V1Condition item) {
    return new ConditionsNested(index, item);
  }
  
  public A setToConditions(int index,V1Condition item) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    V1ConditionBuilder builder = new V1ConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) {
        _visitables.get("conditions").add(builder);
        conditions.add(builder);
    } else {
        _visitables.get("conditions").add(builder);
        conditions.set(index, builder);
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(conditions == null) && !(conditions.isEmpty())) {
        sb.append("conditions:");
        sb.append(conditions);
        sb.append(",");
    }
    if (!(data == null)) {
        sb.append("data:");
        sb.append(data);
        sb.append(",");
    }
    if (!(device == null)) {
        sb.append("device:");
        sb.append(device);
        sb.append(",");
    }
    if (!(driver == null)) {
        sb.append("driver:");
        sb.append(driver);
        sb.append(",");
    }
    if (!(networkData == null)) {
        sb.append("networkData:");
        sb.append(networkData);
        sb.append(",");
    }
    if (!(pool == null)) {
        sb.append("pool:");
        sb.append(pool);
        sb.append(",");
    }
    if (!(shareID == null)) {
        sb.append("shareID:");
        sb.append(shareID);
    }
    sb.append("}");
    return sb.toString();
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
  
  public A withConditions(V1Condition... conditions) {
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
  
  public A withData(Object data) {
    this.data = data;
    return (A) this;
  }
  
  public A withDevice(String device) {
    this.device = device;
    return (A) this;
  }
  
  public A withDriver(String driver) {
    this.driver = driver;
    return (A) this;
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
  
  public NetworkDataNested<A> withNewNetworkData() {
    return new NetworkDataNested(null);
  }
  
  public NetworkDataNested<A> withNewNetworkDataLike(V1beta1NetworkDeviceData item) {
    return new NetworkDataNested(item);
  }
  
  public A withPool(String pool) {
    this.pool = pool;
    return (A) this;
  }
  
  public A withShareID(String shareID) {
    this.shareID = shareID;
    return (A) this;
  }
  public class ConditionsNested<N> extends V1ConditionFluent<ConditionsNested<N>> implements Nested<N>{
  
    V1ConditionBuilder builder;
    int index;
  
    ConditionsNested(int index,V1Condition item) {
      this.index = index;
      this.builder = new V1ConditionBuilder(this, item);
    }
  
    public N and() {
      return (N) V1beta1AllocatedDeviceStatusFluent.this.setToConditions(index, builder.build());
    }
    
    public N endCondition() {
      return and();
    }
    
  }
  public class NetworkDataNested<N> extends V1beta1NetworkDeviceDataFluent<NetworkDataNested<N>> implements Nested<N>{
  
    V1beta1NetworkDeviceDataBuilder builder;
  
    NetworkDataNested(V1beta1NetworkDeviceData item) {
      this.builder = new V1beta1NetworkDeviceDataBuilder(this, item);
    }
  
    public N and() {
      return (N) V1beta1AllocatedDeviceStatusFluent.this.withNetworkData(builder.build());
    }
    
    public N endNetworkData() {
      return and();
    }
    
  }
}