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
import java.util.Objects;
import java.util.Collection;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta2DeviceClaimFluent<A extends io.kubernetes.client.openapi.models.V1beta2DeviceClaimFluent<A>> extends BaseFluent<A>{
  public V1beta2DeviceClaimFluent() {
  }
  
  public V1beta2DeviceClaimFluent(V1beta2DeviceClaim instance) {
    this.copyInstance(instance);
  }
  private ArrayList<V1beta2DeviceClaimConfigurationBuilder> config;
  private ArrayList<V1beta2DeviceConstraintBuilder> constraints;
  private ArrayList<V1beta2DeviceRequestBuilder> requests;
  
  protected void copyInstance(V1beta2DeviceClaim instance) {
    instance = instance != null ? instance : new V1beta2DeviceClaim();
    if (instance != null) {
        this.withConfig(instance.getConfig());
        this.withConstraints(instance.getConstraints());
        this.withRequests(instance.getRequests());
    }
  }
  
  public A addToConfig(int index,V1beta2DeviceClaimConfiguration item) {
    if (this.config == null) {
      this.config = new ArrayList();
    }
    V1beta2DeviceClaimConfigurationBuilder builder = new V1beta2DeviceClaimConfigurationBuilder(item);
    if (index < 0 || index >= config.size()) {
        _visitables.get("config").add(builder);
        config.add(builder);
    } else {
        _visitables.get("config").add(builder);
        config.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToConfig(int index,V1beta2DeviceClaimConfiguration item) {
    if (this.config == null) {
      this.config = new ArrayList();
    }
    V1beta2DeviceClaimConfigurationBuilder builder = new V1beta2DeviceClaimConfigurationBuilder(item);
    if (index < 0 || index >= config.size()) {
        _visitables.get("config").add(builder);
        config.add(builder);
    } else {
        _visitables.get("config").add(builder);
        config.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToConfig(V1beta2DeviceClaimConfiguration... items) {
    if (this.config == null) {
      this.config = new ArrayList();
    }
    for (V1beta2DeviceClaimConfiguration item : items) {
        V1beta2DeviceClaimConfigurationBuilder builder = new V1beta2DeviceClaimConfigurationBuilder(item);
        _visitables.get("config").add(builder);
        this.config.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToConfig(Collection<V1beta2DeviceClaimConfiguration> items) {
    if (this.config == null) {
      this.config = new ArrayList();
    }
    for (V1beta2DeviceClaimConfiguration item : items) {
        V1beta2DeviceClaimConfigurationBuilder builder = new V1beta2DeviceClaimConfigurationBuilder(item);
        _visitables.get("config").add(builder);
        this.config.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromConfig(V1beta2DeviceClaimConfiguration... items) {
    if (this.config == null) {
      return (A) this;
    }
    for (V1beta2DeviceClaimConfiguration item : items) {
        V1beta2DeviceClaimConfigurationBuilder builder = new V1beta2DeviceClaimConfigurationBuilder(item);
        _visitables.get("config").remove(builder);
        this.config.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromConfig(Collection<V1beta2DeviceClaimConfiguration> items) {
    if (this.config == null) {
      return (A) this;
    }
    for (V1beta2DeviceClaimConfiguration item : items) {
        V1beta2DeviceClaimConfigurationBuilder builder = new V1beta2DeviceClaimConfigurationBuilder(item);
        _visitables.get("config").remove(builder);
        this.config.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromConfig(Predicate<V1beta2DeviceClaimConfigurationBuilder> predicate) {
    if (config == null) {
      return (A) this;
    }
    Iterator<V1beta2DeviceClaimConfigurationBuilder> each = config.iterator();
    List visitables = _visitables.get("config");
    while (each.hasNext()) {
        V1beta2DeviceClaimConfigurationBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public List<V1beta2DeviceClaimConfiguration> buildConfig() {
    return this.config != null ? build(config) : null;
  }
  
  public V1beta2DeviceClaimConfiguration buildConfig(int index) {
    return this.config.get(index).build();
  }
  
  public V1beta2DeviceClaimConfiguration buildFirstConfig() {
    return this.config.get(0).build();
  }
  
  public V1beta2DeviceClaimConfiguration buildLastConfig() {
    return this.config.get(config.size() - 1).build();
  }
  
  public V1beta2DeviceClaimConfiguration buildMatchingConfig(Predicate<V1beta2DeviceClaimConfigurationBuilder> predicate) {
      for (V1beta2DeviceClaimConfigurationBuilder item : config) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingConfig(Predicate<V1beta2DeviceClaimConfigurationBuilder> predicate) {
      for (V1beta2DeviceClaimConfigurationBuilder item : config) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withConfig(List<V1beta2DeviceClaimConfiguration> config) {
    if (this.config != null) {
      this._visitables.get("config").clear();
    }
    if (config != null) {
        this.config = new ArrayList();
        for (V1beta2DeviceClaimConfiguration item : config) {
          this.addToConfig(item);
        }
    } else {
      this.config = null;
    }
    return (A) this;
  }
  
  public A withConfig(V1beta2DeviceClaimConfiguration... config) {
    if (this.config != null) {
        this.config.clear();
        _visitables.remove("config");
    }
    if (config != null) {
      for (V1beta2DeviceClaimConfiguration item : config) {
        this.addToConfig(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasConfig() {
    return this.config != null && !(this.config.isEmpty());
  }
  
  public ConfigNested<A> addNewConfig() {
    return new ConfigNested(-1, null);
  }
  
  public ConfigNested<A> addNewConfigLike(V1beta2DeviceClaimConfiguration item) {
    return new ConfigNested(-1, item);
  }
  
  public ConfigNested<A> setNewConfigLike(int index,V1beta2DeviceClaimConfiguration item) {
    return new ConfigNested(index, item);
  }
  
  public ConfigNested<A> editConfig(int index) {
    if (index <= config.size()) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "config"));
    }
    return this.setNewConfigLike(index, this.buildConfig(index));
  }
  
  public ConfigNested<A> editFirstConfig() {
    if (config.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "config"));
    }
    return this.setNewConfigLike(0, this.buildConfig(0));
  }
  
  public ConfigNested<A> editLastConfig() {
    int index = config.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "config"));
    }
    return this.setNewConfigLike(index, this.buildConfig(index));
  }
  
  public ConfigNested<A> editMatchingConfig(Predicate<V1beta2DeviceClaimConfigurationBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < config.size();i++) {
      if (predicate.test(config.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "config"));
    }
    return this.setNewConfigLike(index, this.buildConfig(index));
  }
  
  public A addToConstraints(int index,V1beta2DeviceConstraint item) {
    if (this.constraints == null) {
      this.constraints = new ArrayList();
    }
    V1beta2DeviceConstraintBuilder builder = new V1beta2DeviceConstraintBuilder(item);
    if (index < 0 || index >= constraints.size()) {
        _visitables.get("constraints").add(builder);
        constraints.add(builder);
    } else {
        _visitables.get("constraints").add(builder);
        constraints.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToConstraints(int index,V1beta2DeviceConstraint item) {
    if (this.constraints == null) {
      this.constraints = new ArrayList();
    }
    V1beta2DeviceConstraintBuilder builder = new V1beta2DeviceConstraintBuilder(item);
    if (index < 0 || index >= constraints.size()) {
        _visitables.get("constraints").add(builder);
        constraints.add(builder);
    } else {
        _visitables.get("constraints").add(builder);
        constraints.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToConstraints(V1beta2DeviceConstraint... items) {
    if (this.constraints == null) {
      this.constraints = new ArrayList();
    }
    for (V1beta2DeviceConstraint item : items) {
        V1beta2DeviceConstraintBuilder builder = new V1beta2DeviceConstraintBuilder(item);
        _visitables.get("constraints").add(builder);
        this.constraints.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToConstraints(Collection<V1beta2DeviceConstraint> items) {
    if (this.constraints == null) {
      this.constraints = new ArrayList();
    }
    for (V1beta2DeviceConstraint item : items) {
        V1beta2DeviceConstraintBuilder builder = new V1beta2DeviceConstraintBuilder(item);
        _visitables.get("constraints").add(builder);
        this.constraints.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromConstraints(V1beta2DeviceConstraint... items) {
    if (this.constraints == null) {
      return (A) this;
    }
    for (V1beta2DeviceConstraint item : items) {
        V1beta2DeviceConstraintBuilder builder = new V1beta2DeviceConstraintBuilder(item);
        _visitables.get("constraints").remove(builder);
        this.constraints.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromConstraints(Collection<V1beta2DeviceConstraint> items) {
    if (this.constraints == null) {
      return (A) this;
    }
    for (V1beta2DeviceConstraint item : items) {
        V1beta2DeviceConstraintBuilder builder = new V1beta2DeviceConstraintBuilder(item);
        _visitables.get("constraints").remove(builder);
        this.constraints.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromConstraints(Predicate<V1beta2DeviceConstraintBuilder> predicate) {
    if (constraints == null) {
      return (A) this;
    }
    Iterator<V1beta2DeviceConstraintBuilder> each = constraints.iterator();
    List visitables = _visitables.get("constraints");
    while (each.hasNext()) {
        V1beta2DeviceConstraintBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public List<V1beta2DeviceConstraint> buildConstraints() {
    return this.constraints != null ? build(constraints) : null;
  }
  
  public V1beta2DeviceConstraint buildConstraint(int index) {
    return this.constraints.get(index).build();
  }
  
  public V1beta2DeviceConstraint buildFirstConstraint() {
    return this.constraints.get(0).build();
  }
  
  public V1beta2DeviceConstraint buildLastConstraint() {
    return this.constraints.get(constraints.size() - 1).build();
  }
  
  public V1beta2DeviceConstraint buildMatchingConstraint(Predicate<V1beta2DeviceConstraintBuilder> predicate) {
      for (V1beta2DeviceConstraintBuilder item : constraints) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingConstraint(Predicate<V1beta2DeviceConstraintBuilder> predicate) {
      for (V1beta2DeviceConstraintBuilder item : constraints) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withConstraints(List<V1beta2DeviceConstraint> constraints) {
    if (this.constraints != null) {
      this._visitables.get("constraints").clear();
    }
    if (constraints != null) {
        this.constraints = new ArrayList();
        for (V1beta2DeviceConstraint item : constraints) {
          this.addToConstraints(item);
        }
    } else {
      this.constraints = null;
    }
    return (A) this;
  }
  
  public A withConstraints(V1beta2DeviceConstraint... constraints) {
    if (this.constraints != null) {
        this.constraints.clear();
        _visitables.remove("constraints");
    }
    if (constraints != null) {
      for (V1beta2DeviceConstraint item : constraints) {
        this.addToConstraints(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasConstraints() {
    return this.constraints != null && !(this.constraints.isEmpty());
  }
  
  public ConstraintsNested<A> addNewConstraint() {
    return new ConstraintsNested(-1, null);
  }
  
  public ConstraintsNested<A> addNewConstraintLike(V1beta2DeviceConstraint item) {
    return new ConstraintsNested(-1, item);
  }
  
  public ConstraintsNested<A> setNewConstraintLike(int index,V1beta2DeviceConstraint item) {
    return new ConstraintsNested(index, item);
  }
  
  public ConstraintsNested<A> editConstraint(int index) {
    if (index <= constraints.size()) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "constraints"));
    }
    return this.setNewConstraintLike(index, this.buildConstraint(index));
  }
  
  public ConstraintsNested<A> editFirstConstraint() {
    if (constraints.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "constraints"));
    }
    return this.setNewConstraintLike(0, this.buildConstraint(0));
  }
  
  public ConstraintsNested<A> editLastConstraint() {
    int index = constraints.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "constraints"));
    }
    return this.setNewConstraintLike(index, this.buildConstraint(index));
  }
  
  public ConstraintsNested<A> editMatchingConstraint(Predicate<V1beta2DeviceConstraintBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < constraints.size();i++) {
      if (predicate.test(constraints.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "constraints"));
    }
    return this.setNewConstraintLike(index, this.buildConstraint(index));
  }
  
  public A addToRequests(int index,V1beta2DeviceRequest item) {
    if (this.requests == null) {
      this.requests = new ArrayList();
    }
    V1beta2DeviceRequestBuilder builder = new V1beta2DeviceRequestBuilder(item);
    if (index < 0 || index >= requests.size()) {
        _visitables.get("requests").add(builder);
        requests.add(builder);
    } else {
        _visitables.get("requests").add(builder);
        requests.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToRequests(int index,V1beta2DeviceRequest item) {
    if (this.requests == null) {
      this.requests = new ArrayList();
    }
    V1beta2DeviceRequestBuilder builder = new V1beta2DeviceRequestBuilder(item);
    if (index < 0 || index >= requests.size()) {
        _visitables.get("requests").add(builder);
        requests.add(builder);
    } else {
        _visitables.get("requests").add(builder);
        requests.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToRequests(V1beta2DeviceRequest... items) {
    if (this.requests == null) {
      this.requests = new ArrayList();
    }
    for (V1beta2DeviceRequest item : items) {
        V1beta2DeviceRequestBuilder builder = new V1beta2DeviceRequestBuilder(item);
        _visitables.get("requests").add(builder);
        this.requests.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToRequests(Collection<V1beta2DeviceRequest> items) {
    if (this.requests == null) {
      this.requests = new ArrayList();
    }
    for (V1beta2DeviceRequest item : items) {
        V1beta2DeviceRequestBuilder builder = new V1beta2DeviceRequestBuilder(item);
        _visitables.get("requests").add(builder);
        this.requests.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromRequests(V1beta2DeviceRequest... items) {
    if (this.requests == null) {
      return (A) this;
    }
    for (V1beta2DeviceRequest item : items) {
        V1beta2DeviceRequestBuilder builder = new V1beta2DeviceRequestBuilder(item);
        _visitables.get("requests").remove(builder);
        this.requests.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromRequests(Collection<V1beta2DeviceRequest> items) {
    if (this.requests == null) {
      return (A) this;
    }
    for (V1beta2DeviceRequest item : items) {
        V1beta2DeviceRequestBuilder builder = new V1beta2DeviceRequestBuilder(item);
        _visitables.get("requests").remove(builder);
        this.requests.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromRequests(Predicate<V1beta2DeviceRequestBuilder> predicate) {
    if (requests == null) {
      return (A) this;
    }
    Iterator<V1beta2DeviceRequestBuilder> each = requests.iterator();
    List visitables = _visitables.get("requests");
    while (each.hasNext()) {
        V1beta2DeviceRequestBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public List<V1beta2DeviceRequest> buildRequests() {
    return this.requests != null ? build(requests) : null;
  }
  
  public V1beta2DeviceRequest buildRequest(int index) {
    return this.requests.get(index).build();
  }
  
  public V1beta2DeviceRequest buildFirstRequest() {
    return this.requests.get(0).build();
  }
  
  public V1beta2DeviceRequest buildLastRequest() {
    return this.requests.get(requests.size() - 1).build();
  }
  
  public V1beta2DeviceRequest buildMatchingRequest(Predicate<V1beta2DeviceRequestBuilder> predicate) {
      for (V1beta2DeviceRequestBuilder item : requests) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingRequest(Predicate<V1beta2DeviceRequestBuilder> predicate) {
      for (V1beta2DeviceRequestBuilder item : requests) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withRequests(List<V1beta2DeviceRequest> requests) {
    if (this.requests != null) {
      this._visitables.get("requests").clear();
    }
    if (requests != null) {
        this.requests = new ArrayList();
        for (V1beta2DeviceRequest item : requests) {
          this.addToRequests(item);
        }
    } else {
      this.requests = null;
    }
    return (A) this;
  }
  
  public A withRequests(V1beta2DeviceRequest... requests) {
    if (this.requests != null) {
        this.requests.clear();
        _visitables.remove("requests");
    }
    if (requests != null) {
      for (V1beta2DeviceRequest item : requests) {
        this.addToRequests(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasRequests() {
    return this.requests != null && !(this.requests.isEmpty());
  }
  
  public RequestsNested<A> addNewRequest() {
    return new RequestsNested(-1, null);
  }
  
  public RequestsNested<A> addNewRequestLike(V1beta2DeviceRequest item) {
    return new RequestsNested(-1, item);
  }
  
  public RequestsNested<A> setNewRequestLike(int index,V1beta2DeviceRequest item) {
    return new RequestsNested(index, item);
  }
  
  public RequestsNested<A> editRequest(int index) {
    if (index <= requests.size()) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "requests"));
    }
    return this.setNewRequestLike(index, this.buildRequest(index));
  }
  
  public RequestsNested<A> editFirstRequest() {
    if (requests.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "requests"));
    }
    return this.setNewRequestLike(0, this.buildRequest(0));
  }
  
  public RequestsNested<A> editLastRequest() {
    int index = requests.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "requests"));
    }
    return this.setNewRequestLike(index, this.buildRequest(index));
  }
  
  public RequestsNested<A> editMatchingRequest(Predicate<V1beta2DeviceRequestBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < requests.size();i++) {
      if (predicate.test(requests.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "requests"));
    }
    return this.setNewRequestLike(index, this.buildRequest(index));
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
    V1beta2DeviceClaimFluent that = (V1beta2DeviceClaimFluent) o;
    if (!(Objects.equals(config, that.config))) {
      return false;
    }
    if (!(Objects.equals(constraints, that.constraints))) {
      return false;
    }
    if (!(Objects.equals(requests, that.requests))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(config, constraints, requests);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(config == null) && !(config.isEmpty())) {
        sb.append("config:");
        sb.append(config);
        sb.append(",");
    }
    if (!(constraints == null) && !(constraints.isEmpty())) {
        sb.append("constraints:");
        sb.append(constraints);
        sb.append(",");
    }
    if (!(requests == null) && !(requests.isEmpty())) {
        sb.append("requests:");
        sb.append(requests);
    }
    sb.append("}");
    return sb.toString();
  }
  public class ConfigNested<N> extends V1beta2DeviceClaimConfigurationFluent<ConfigNested<N>> implements Nested<N>{
    ConfigNested(int index,V1beta2DeviceClaimConfiguration item) {
      this.index = index;
      this.builder = new V1beta2DeviceClaimConfigurationBuilder(this, item);
    }
    V1beta2DeviceClaimConfigurationBuilder builder;
    int index;
    
    public N and() {
      return (N) V1beta2DeviceClaimFluent.this.setToConfig(index, builder.build());
    }
    
    public N endConfig() {
      return and();
    }
    
  
  }
  public class ConstraintsNested<N> extends V1beta2DeviceConstraintFluent<ConstraintsNested<N>> implements Nested<N>{
    ConstraintsNested(int index,V1beta2DeviceConstraint item) {
      this.index = index;
      this.builder = new V1beta2DeviceConstraintBuilder(this, item);
    }
    V1beta2DeviceConstraintBuilder builder;
    int index;
    
    public N and() {
      return (N) V1beta2DeviceClaimFluent.this.setToConstraints(index, builder.build());
    }
    
    public N endConstraint() {
      return and();
    }
    
  
  }
  public class RequestsNested<N> extends V1beta2DeviceRequestFluent<RequestsNested<N>> implements Nested<N>{
    RequestsNested(int index,V1beta2DeviceRequest item) {
      this.index = index;
      this.builder = new V1beta2DeviceRequestBuilder(this, item);
    }
    V1beta2DeviceRequestBuilder builder;
    int index;
    
    public N and() {
      return (N) V1beta2DeviceClaimFluent.this.setToRequests(index, builder.build());
    }
    
    public N endRequest() {
      return and();
    }
    
  
  }

}