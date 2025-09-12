package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import java.lang.RuntimeException;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import io.kubernetes.client.custom.Quantity;
import java.util.Objects;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta2DeviceRequestAllocationResultFluent<A extends io.kubernetes.client.openapi.models.V1beta2DeviceRequestAllocationResultFluent<A>> extends BaseFluent<A>{
  public V1beta2DeviceRequestAllocationResultFluent() {
  }
  
  public V1beta2DeviceRequestAllocationResultFluent(V1beta2DeviceRequestAllocationResult instance) {
    this.copyInstance(instance);
  }
  private Boolean adminAccess;
  private List<String> bindingConditions;
  private List<String> bindingFailureConditions;
  private Map<String,Quantity> consumedCapacity;
  private String device;
  private String driver;
  private String pool;
  private String request;
  private String shareID;
  private ArrayList<V1beta2DeviceTolerationBuilder> tolerations;
  
  protected void copyInstance(V1beta2DeviceRequestAllocationResult instance) {
    instance = instance != null ? instance : new V1beta2DeviceRequestAllocationResult();
    if (instance != null) {
        this.withAdminAccess(instance.getAdminAccess());
        this.withBindingConditions(instance.getBindingConditions());
        this.withBindingFailureConditions(instance.getBindingFailureConditions());
        this.withConsumedCapacity(instance.getConsumedCapacity());
        this.withDevice(instance.getDevice());
        this.withDriver(instance.getDriver());
        this.withPool(instance.getPool());
        this.withRequest(instance.getRequest());
        this.withShareID(instance.getShareID());
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
  
  public A addToBindingConditions(int index,String item) {
    if (this.bindingConditions == null) {
      this.bindingConditions = new ArrayList();
    }
    this.bindingConditions.add(index, item);
    return (A) this;
  }
  
  public A setToBindingConditions(int index,String item) {
    if (this.bindingConditions == null) {
      this.bindingConditions = new ArrayList();
    }
    this.bindingConditions.set(index, item);
    return (A) this;
  }
  
  public A addToBindingConditions(String... items) {
    if (this.bindingConditions == null) {
      this.bindingConditions = new ArrayList();
    }
    for (String item : items) {
      this.bindingConditions.add(item);
    }
    return (A) this;
  }
  
  public A addAllToBindingConditions(Collection<String> items) {
    if (this.bindingConditions == null) {
      this.bindingConditions = new ArrayList();
    }
    for (String item : items) {
      this.bindingConditions.add(item);
    }
    return (A) this;
  }
  
  public A removeFromBindingConditions(String... items) {
    if (this.bindingConditions == null) {
      return (A) this;
    }
    for (String item : items) {
      this.bindingConditions.remove(item);
    }
    return (A) this;
  }
  
  public A removeAllFromBindingConditions(Collection<String> items) {
    if (this.bindingConditions == null) {
      return (A) this;
    }
    for (String item : items) {
      this.bindingConditions.remove(item);
    }
    return (A) this;
  }
  
  public List<String> getBindingConditions() {
    return this.bindingConditions;
  }
  
  public String getBindingCondition(int index) {
    return this.bindingConditions.get(index);
  }
  
  public String getFirstBindingCondition() {
    return this.bindingConditions.get(0);
  }
  
  public String getLastBindingCondition() {
    return this.bindingConditions.get(bindingConditions.size() - 1);
  }
  
  public String getMatchingBindingCondition(Predicate<String> predicate) {
      for (String item : bindingConditions) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingBindingCondition(Predicate<String> predicate) {
      for (String item : bindingConditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withBindingConditions(List<String> bindingConditions) {
    if (bindingConditions != null) {
        this.bindingConditions = new ArrayList();
        for (String item : bindingConditions) {
          this.addToBindingConditions(item);
        }
    } else {
      this.bindingConditions = null;
    }
    return (A) this;
  }
  
  public A withBindingConditions(String... bindingConditions) {
    if (this.bindingConditions != null) {
        this.bindingConditions.clear();
        _visitables.remove("bindingConditions");
    }
    if (bindingConditions != null) {
      for (String item : bindingConditions) {
        this.addToBindingConditions(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasBindingConditions() {
    return this.bindingConditions != null && !(this.bindingConditions.isEmpty());
  }
  
  public A addToBindingFailureConditions(int index,String item) {
    if (this.bindingFailureConditions == null) {
      this.bindingFailureConditions = new ArrayList();
    }
    this.bindingFailureConditions.add(index, item);
    return (A) this;
  }
  
  public A setToBindingFailureConditions(int index,String item) {
    if (this.bindingFailureConditions == null) {
      this.bindingFailureConditions = new ArrayList();
    }
    this.bindingFailureConditions.set(index, item);
    return (A) this;
  }
  
  public A addToBindingFailureConditions(String... items) {
    if (this.bindingFailureConditions == null) {
      this.bindingFailureConditions = new ArrayList();
    }
    for (String item : items) {
      this.bindingFailureConditions.add(item);
    }
    return (A) this;
  }
  
  public A addAllToBindingFailureConditions(Collection<String> items) {
    if (this.bindingFailureConditions == null) {
      this.bindingFailureConditions = new ArrayList();
    }
    for (String item : items) {
      this.bindingFailureConditions.add(item);
    }
    return (A) this;
  }
  
  public A removeFromBindingFailureConditions(String... items) {
    if (this.bindingFailureConditions == null) {
      return (A) this;
    }
    for (String item : items) {
      this.bindingFailureConditions.remove(item);
    }
    return (A) this;
  }
  
  public A removeAllFromBindingFailureConditions(Collection<String> items) {
    if (this.bindingFailureConditions == null) {
      return (A) this;
    }
    for (String item : items) {
      this.bindingFailureConditions.remove(item);
    }
    return (A) this;
  }
  
  public List<String> getBindingFailureConditions() {
    return this.bindingFailureConditions;
  }
  
  public String getBindingFailureCondition(int index) {
    return this.bindingFailureConditions.get(index);
  }
  
  public String getFirstBindingFailureCondition() {
    return this.bindingFailureConditions.get(0);
  }
  
  public String getLastBindingFailureCondition() {
    return this.bindingFailureConditions.get(bindingFailureConditions.size() - 1);
  }
  
  public String getMatchingBindingFailureCondition(Predicate<String> predicate) {
      for (String item : bindingFailureConditions) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingBindingFailureCondition(Predicate<String> predicate) {
      for (String item : bindingFailureConditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withBindingFailureConditions(List<String> bindingFailureConditions) {
    if (bindingFailureConditions != null) {
        this.bindingFailureConditions = new ArrayList();
        for (String item : bindingFailureConditions) {
          this.addToBindingFailureConditions(item);
        }
    } else {
      this.bindingFailureConditions = null;
    }
    return (A) this;
  }
  
  public A withBindingFailureConditions(String... bindingFailureConditions) {
    if (this.bindingFailureConditions != null) {
        this.bindingFailureConditions.clear();
        _visitables.remove("bindingFailureConditions");
    }
    if (bindingFailureConditions != null) {
      for (String item : bindingFailureConditions) {
        this.addToBindingFailureConditions(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasBindingFailureConditions() {
    return this.bindingFailureConditions != null && !(this.bindingFailureConditions.isEmpty());
  }
  
  public A addToConsumedCapacity(String key,Quantity value) {
    if (this.consumedCapacity == null && key != null && value != null) {
      this.consumedCapacity = new LinkedHashMap();
    }
    if (key != null && value != null) {
      this.consumedCapacity.put(key, value);
    }
    return (A) this;
  }
  
  public A addToConsumedCapacity(Map<String,Quantity> map) {
    if (this.consumedCapacity == null && map != null) {
      this.consumedCapacity = new LinkedHashMap();
    }
    if (map != null) {
      this.consumedCapacity.putAll(map);
    }
    return (A) this;
  }
  
  public A removeFromConsumedCapacity(String key) {
    if (this.consumedCapacity == null) {
      return (A) this;
    }
    if (key != null && this.consumedCapacity != null) {
      this.consumedCapacity.remove(key);
    }
    return (A) this;
  }
  
  public A removeFromConsumedCapacity(Map<String,Quantity> map) {
    if (this.consumedCapacity == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.consumedCapacity != null) {
          this.consumedCapacity.remove(key);
        }
      }
    }
    return (A) this;
  }
  
  public Map<String,Quantity> getConsumedCapacity() {
    return this.consumedCapacity;
  }
  
  public <K,V>A withConsumedCapacity(Map<String,Quantity> consumedCapacity) {
    if (consumedCapacity == null) {
      this.consumedCapacity = null;
    } else {
      this.consumedCapacity = new LinkedHashMap(consumedCapacity);
    }
    return (A) this;
  }
  
  public boolean hasConsumedCapacity() {
    return this.consumedCapacity != null;
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
  
  public String getShareID() {
    return this.shareID;
  }
  
  public A withShareID(String shareID) {
    this.shareID = shareID;
    return (A) this;
  }
  
  public boolean hasShareID() {
    return this.shareID != null;
  }
  
  public A addToTolerations(int index,V1beta2DeviceToleration item) {
    if (this.tolerations == null) {
      this.tolerations = new ArrayList();
    }
    V1beta2DeviceTolerationBuilder builder = new V1beta2DeviceTolerationBuilder(item);
    if (index < 0 || index >= tolerations.size()) {
        _visitables.get("tolerations").add(builder);
        tolerations.add(builder);
    } else {
        _visitables.get("tolerations").add(builder);
        tolerations.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToTolerations(int index,V1beta2DeviceToleration item) {
    if (this.tolerations == null) {
      this.tolerations = new ArrayList();
    }
    V1beta2DeviceTolerationBuilder builder = new V1beta2DeviceTolerationBuilder(item);
    if (index < 0 || index >= tolerations.size()) {
        _visitables.get("tolerations").add(builder);
        tolerations.add(builder);
    } else {
        _visitables.get("tolerations").add(builder);
        tolerations.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToTolerations(V1beta2DeviceToleration... items) {
    if (this.tolerations == null) {
      this.tolerations = new ArrayList();
    }
    for (V1beta2DeviceToleration item : items) {
        V1beta2DeviceTolerationBuilder builder = new V1beta2DeviceTolerationBuilder(item);
        _visitables.get("tolerations").add(builder);
        this.tolerations.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToTolerations(Collection<V1beta2DeviceToleration> items) {
    if (this.tolerations == null) {
      this.tolerations = new ArrayList();
    }
    for (V1beta2DeviceToleration item : items) {
        V1beta2DeviceTolerationBuilder builder = new V1beta2DeviceTolerationBuilder(item);
        _visitables.get("tolerations").add(builder);
        this.tolerations.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromTolerations(V1beta2DeviceToleration... items) {
    if (this.tolerations == null) {
      return (A) this;
    }
    for (V1beta2DeviceToleration item : items) {
        V1beta2DeviceTolerationBuilder builder = new V1beta2DeviceTolerationBuilder(item);
        _visitables.get("tolerations").remove(builder);
        this.tolerations.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromTolerations(Collection<V1beta2DeviceToleration> items) {
    if (this.tolerations == null) {
      return (A) this;
    }
    for (V1beta2DeviceToleration item : items) {
        V1beta2DeviceTolerationBuilder builder = new V1beta2DeviceTolerationBuilder(item);
        _visitables.get("tolerations").remove(builder);
        this.tolerations.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromTolerations(Predicate<V1beta2DeviceTolerationBuilder> predicate) {
    if (tolerations == null) {
      return (A) this;
    }
    Iterator<V1beta2DeviceTolerationBuilder> each = tolerations.iterator();
    List visitables = _visitables.get("tolerations");
    while (each.hasNext()) {
        V1beta2DeviceTolerationBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
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
  
  public A withTolerations(V1beta2DeviceToleration... tolerations) {
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
    return this.tolerations != null && !(this.tolerations.isEmpty());
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
    if (index <= tolerations.size()) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "tolerations"));
    }
    return this.setNewTolerationLike(index, this.buildToleration(index));
  }
  
  public TolerationsNested<A> editFirstToleration() {
    if (tolerations.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "tolerations"));
    }
    return this.setNewTolerationLike(0, this.buildToleration(0));
  }
  
  public TolerationsNested<A> editLastToleration() {
    int index = tolerations.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "tolerations"));
    }
    return this.setNewTolerationLike(index, this.buildToleration(index));
  }
  
  public TolerationsNested<A> editMatchingToleration(Predicate<V1beta2DeviceTolerationBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < tolerations.size();i++) {
      if (predicate.test(tolerations.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "tolerations"));
    }
    return this.setNewTolerationLike(index, this.buildToleration(index));
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
    V1beta2DeviceRequestAllocationResultFluent that = (V1beta2DeviceRequestAllocationResultFluent) o;
    if (!(Objects.equals(adminAccess, that.adminAccess))) {
      return false;
    }
    if (!(Objects.equals(bindingConditions, that.bindingConditions))) {
      return false;
    }
    if (!(Objects.equals(bindingFailureConditions, that.bindingFailureConditions))) {
      return false;
    }
    if (!(Objects.equals(consumedCapacity, that.consumedCapacity))) {
      return false;
    }
    if (!(Objects.equals(device, that.device))) {
      return false;
    }
    if (!(Objects.equals(driver, that.driver))) {
      return false;
    }
    if (!(Objects.equals(pool, that.pool))) {
      return false;
    }
    if (!(Objects.equals(request, that.request))) {
      return false;
    }
    if (!(Objects.equals(shareID, that.shareID))) {
      return false;
    }
    if (!(Objects.equals(tolerations, that.tolerations))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(adminAccess, bindingConditions, bindingFailureConditions, consumedCapacity, device, driver, pool, request, shareID, tolerations);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(adminAccess == null)) {
        sb.append("adminAccess:");
        sb.append(adminAccess);
        sb.append(",");
    }
    if (!(bindingConditions == null) && !(bindingConditions.isEmpty())) {
        sb.append("bindingConditions:");
        sb.append(bindingConditions);
        sb.append(",");
    }
    if (!(bindingFailureConditions == null) && !(bindingFailureConditions.isEmpty())) {
        sb.append("bindingFailureConditions:");
        sb.append(bindingFailureConditions);
        sb.append(",");
    }
    if (!(consumedCapacity == null) && !(consumedCapacity.isEmpty())) {
        sb.append("consumedCapacity:");
        sb.append(consumedCapacity);
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
    if (!(pool == null)) {
        sb.append("pool:");
        sb.append(pool);
        sb.append(",");
    }
    if (!(request == null)) {
        sb.append("request:");
        sb.append(request);
        sb.append(",");
    }
    if (!(shareID == null)) {
        sb.append("shareID:");
        sb.append(shareID);
        sb.append(",");
    }
    if (!(tolerations == null) && !(tolerations.isEmpty())) {
        sb.append("tolerations:");
        sb.append(tolerations);
    }
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
      return (N) V1beta2DeviceRequestAllocationResultFluent.this.setToTolerations(index, builder.build());
    }
    
    public N endToleration() {
      return and();
    }
    
  
  }

}