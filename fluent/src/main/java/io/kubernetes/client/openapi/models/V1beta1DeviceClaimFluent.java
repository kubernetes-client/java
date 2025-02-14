package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta1DeviceClaimFluent<A extends V1beta1DeviceClaimFluent<A>> extends BaseFluent<A>{
  public V1beta1DeviceClaimFluent() {
  }
  
  public V1beta1DeviceClaimFluent(V1beta1DeviceClaim instance) {
    this.copyInstance(instance);
  }
  private ArrayList<V1beta1DeviceClaimConfigurationBuilder> config;
  private ArrayList<V1beta1DeviceConstraintBuilder> constraints;
  private ArrayList<V1beta1DeviceRequestBuilder> requests;
  
  protected void copyInstance(V1beta1DeviceClaim instance) {
    instance = (instance != null ? instance : new V1beta1DeviceClaim());
    if (instance != null) {
          this.withConfig(instance.getConfig());
          this.withConstraints(instance.getConstraints());
          this.withRequests(instance.getRequests());
        }
  }
  
  public A addToConfig(int index,V1beta1DeviceClaimConfiguration item) {
    if (this.config == null) {this.config = new ArrayList<V1beta1DeviceClaimConfigurationBuilder>();}
    V1beta1DeviceClaimConfigurationBuilder builder = new V1beta1DeviceClaimConfigurationBuilder(item);
    if (index < 0 || index >= config.size()) { _visitables.get("config").add(builder); config.add(builder); } else { _visitables.get("config").add(index, builder); config.add(index, builder);}
    return (A)this;
  }
  
  public A setToConfig(int index,V1beta1DeviceClaimConfiguration item) {
    if (this.config == null) {this.config = new ArrayList<V1beta1DeviceClaimConfigurationBuilder>();}
    V1beta1DeviceClaimConfigurationBuilder builder = new V1beta1DeviceClaimConfigurationBuilder(item);
    if (index < 0 || index >= config.size()) { _visitables.get("config").add(builder); config.add(builder); } else { _visitables.get("config").set(index, builder); config.set(index, builder);}
    return (A)this;
  }
  
  public A addToConfig(io.kubernetes.client.openapi.models.V1beta1DeviceClaimConfiguration... items) {
    if (this.config == null) {this.config = new ArrayList<V1beta1DeviceClaimConfigurationBuilder>();}
    for (V1beta1DeviceClaimConfiguration item : items) {V1beta1DeviceClaimConfigurationBuilder builder = new V1beta1DeviceClaimConfigurationBuilder(item);_visitables.get("config").add(builder);this.config.add(builder);} return (A)this;
  }
  
  public A addAllToConfig(Collection<V1beta1DeviceClaimConfiguration> items) {
    if (this.config == null) {this.config = new ArrayList<V1beta1DeviceClaimConfigurationBuilder>();}
    for (V1beta1DeviceClaimConfiguration item : items) {V1beta1DeviceClaimConfigurationBuilder builder = new V1beta1DeviceClaimConfigurationBuilder(item);_visitables.get("config").add(builder);this.config.add(builder);} return (A)this;
  }
  
  public A removeFromConfig(io.kubernetes.client.openapi.models.V1beta1DeviceClaimConfiguration... items) {
    if (this.config == null) return (A)this;
    for (V1beta1DeviceClaimConfiguration item : items) {V1beta1DeviceClaimConfigurationBuilder builder = new V1beta1DeviceClaimConfigurationBuilder(item);_visitables.get("config").remove(builder); this.config.remove(builder);} return (A)this;
  }
  
  public A removeAllFromConfig(Collection<V1beta1DeviceClaimConfiguration> items) {
    if (this.config == null) return (A)this;
    for (V1beta1DeviceClaimConfiguration item : items) {V1beta1DeviceClaimConfigurationBuilder builder = new V1beta1DeviceClaimConfigurationBuilder(item);_visitables.get("config").remove(builder); this.config.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromConfig(Predicate<V1beta1DeviceClaimConfigurationBuilder> predicate) {
    if (config == null) return (A) this;
    final Iterator<V1beta1DeviceClaimConfigurationBuilder> each = config.iterator();
    final List visitables = _visitables.get("config");
    while (each.hasNext()) {
      V1beta1DeviceClaimConfigurationBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1beta1DeviceClaimConfiguration> buildConfig() {
    return this.config != null ? build(config) : null;
  }
  
  public V1beta1DeviceClaimConfiguration buildConfig(int index) {
    return this.config.get(index).build();
  }
  
  public V1beta1DeviceClaimConfiguration buildFirstConfig() {
    return this.config.get(0).build();
  }
  
  public V1beta1DeviceClaimConfiguration buildLastConfig() {
    return this.config.get(config.size() - 1).build();
  }
  
  public V1beta1DeviceClaimConfiguration buildMatchingConfig(Predicate<V1beta1DeviceClaimConfigurationBuilder> predicate) {
      for (V1beta1DeviceClaimConfigurationBuilder item : config) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingConfig(Predicate<V1beta1DeviceClaimConfigurationBuilder> predicate) {
      for (V1beta1DeviceClaimConfigurationBuilder item : config) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withConfig(List<V1beta1DeviceClaimConfiguration> config) {
    if (this.config != null) {
      this._visitables.get("config").clear();
    }
    if (config != null) {
        this.config = new ArrayList();
        for (V1beta1DeviceClaimConfiguration item : config) {
          this.addToConfig(item);
        }
    } else {
      this.config = null;
    }
    return (A) this;
  }
  
  public A withConfig(io.kubernetes.client.openapi.models.V1beta1DeviceClaimConfiguration... config) {
    if (this.config != null) {
        this.config.clear();
        _visitables.remove("config");
    }
    if (config != null) {
      for (V1beta1DeviceClaimConfiguration item : config) {
        this.addToConfig(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasConfig() {
    return this.config != null && !this.config.isEmpty();
  }
  
  public ConfigNested<A> addNewConfig() {
    return new ConfigNested(-1, null);
  }
  
  public ConfigNested<A> addNewConfigLike(V1beta1DeviceClaimConfiguration item) {
    return new ConfigNested(-1, item);
  }
  
  public ConfigNested<A> setNewConfigLike(int index,V1beta1DeviceClaimConfiguration item) {
    return new ConfigNested(index, item);
  }
  
  public ConfigNested<A> editConfig(int index) {
    if (config.size() <= index) throw new RuntimeException("Can't edit config. Index exceeds size.");
    return setNewConfigLike(index, buildConfig(index));
  }
  
  public ConfigNested<A> editFirstConfig() {
    if (config.size() == 0) throw new RuntimeException("Can't edit first config. The list is empty.");
    return setNewConfigLike(0, buildConfig(0));
  }
  
  public ConfigNested<A> editLastConfig() {
    int index = config.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last config. The list is empty.");
    return setNewConfigLike(index, buildConfig(index));
  }
  
  public ConfigNested<A> editMatchingConfig(Predicate<V1beta1DeviceClaimConfigurationBuilder> predicate) {
    int index = -1;
    for (int i=0;i<config.size();i++) { 
    if (predicate.test(config.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching config. No match found.");
    return setNewConfigLike(index, buildConfig(index));
  }
  
  public A addToConstraints(int index,V1beta1DeviceConstraint item) {
    if (this.constraints == null) {this.constraints = new ArrayList<V1beta1DeviceConstraintBuilder>();}
    V1beta1DeviceConstraintBuilder builder = new V1beta1DeviceConstraintBuilder(item);
    if (index < 0 || index >= constraints.size()) { _visitables.get("constraints").add(builder); constraints.add(builder); } else { _visitables.get("constraints").add(index, builder); constraints.add(index, builder);}
    return (A)this;
  }
  
  public A setToConstraints(int index,V1beta1DeviceConstraint item) {
    if (this.constraints == null) {this.constraints = new ArrayList<V1beta1DeviceConstraintBuilder>();}
    V1beta1DeviceConstraintBuilder builder = new V1beta1DeviceConstraintBuilder(item);
    if (index < 0 || index >= constraints.size()) { _visitables.get("constraints").add(builder); constraints.add(builder); } else { _visitables.get("constraints").set(index, builder); constraints.set(index, builder);}
    return (A)this;
  }
  
  public A addToConstraints(io.kubernetes.client.openapi.models.V1beta1DeviceConstraint... items) {
    if (this.constraints == null) {this.constraints = new ArrayList<V1beta1DeviceConstraintBuilder>();}
    for (V1beta1DeviceConstraint item : items) {V1beta1DeviceConstraintBuilder builder = new V1beta1DeviceConstraintBuilder(item);_visitables.get("constraints").add(builder);this.constraints.add(builder);} return (A)this;
  }
  
  public A addAllToConstraints(Collection<V1beta1DeviceConstraint> items) {
    if (this.constraints == null) {this.constraints = new ArrayList<V1beta1DeviceConstraintBuilder>();}
    for (V1beta1DeviceConstraint item : items) {V1beta1DeviceConstraintBuilder builder = new V1beta1DeviceConstraintBuilder(item);_visitables.get("constraints").add(builder);this.constraints.add(builder);} return (A)this;
  }
  
  public A removeFromConstraints(io.kubernetes.client.openapi.models.V1beta1DeviceConstraint... items) {
    if (this.constraints == null) return (A)this;
    for (V1beta1DeviceConstraint item : items) {V1beta1DeviceConstraintBuilder builder = new V1beta1DeviceConstraintBuilder(item);_visitables.get("constraints").remove(builder); this.constraints.remove(builder);} return (A)this;
  }
  
  public A removeAllFromConstraints(Collection<V1beta1DeviceConstraint> items) {
    if (this.constraints == null) return (A)this;
    for (V1beta1DeviceConstraint item : items) {V1beta1DeviceConstraintBuilder builder = new V1beta1DeviceConstraintBuilder(item);_visitables.get("constraints").remove(builder); this.constraints.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromConstraints(Predicate<V1beta1DeviceConstraintBuilder> predicate) {
    if (constraints == null) return (A) this;
    final Iterator<V1beta1DeviceConstraintBuilder> each = constraints.iterator();
    final List visitables = _visitables.get("constraints");
    while (each.hasNext()) {
      V1beta1DeviceConstraintBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1beta1DeviceConstraint> buildConstraints() {
    return this.constraints != null ? build(constraints) : null;
  }
  
  public V1beta1DeviceConstraint buildConstraint(int index) {
    return this.constraints.get(index).build();
  }
  
  public V1beta1DeviceConstraint buildFirstConstraint() {
    return this.constraints.get(0).build();
  }
  
  public V1beta1DeviceConstraint buildLastConstraint() {
    return this.constraints.get(constraints.size() - 1).build();
  }
  
  public V1beta1DeviceConstraint buildMatchingConstraint(Predicate<V1beta1DeviceConstraintBuilder> predicate) {
      for (V1beta1DeviceConstraintBuilder item : constraints) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingConstraint(Predicate<V1beta1DeviceConstraintBuilder> predicate) {
      for (V1beta1DeviceConstraintBuilder item : constraints) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withConstraints(List<V1beta1DeviceConstraint> constraints) {
    if (this.constraints != null) {
      this._visitables.get("constraints").clear();
    }
    if (constraints != null) {
        this.constraints = new ArrayList();
        for (V1beta1DeviceConstraint item : constraints) {
          this.addToConstraints(item);
        }
    } else {
      this.constraints = null;
    }
    return (A) this;
  }
  
  public A withConstraints(io.kubernetes.client.openapi.models.V1beta1DeviceConstraint... constraints) {
    if (this.constraints != null) {
        this.constraints.clear();
        _visitables.remove("constraints");
    }
    if (constraints != null) {
      for (V1beta1DeviceConstraint item : constraints) {
        this.addToConstraints(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasConstraints() {
    return this.constraints != null && !this.constraints.isEmpty();
  }
  
  public ConstraintsNested<A> addNewConstraint() {
    return new ConstraintsNested(-1, null);
  }
  
  public ConstraintsNested<A> addNewConstraintLike(V1beta1DeviceConstraint item) {
    return new ConstraintsNested(-1, item);
  }
  
  public ConstraintsNested<A> setNewConstraintLike(int index,V1beta1DeviceConstraint item) {
    return new ConstraintsNested(index, item);
  }
  
  public ConstraintsNested<A> editConstraint(int index) {
    if (constraints.size() <= index) throw new RuntimeException("Can't edit constraints. Index exceeds size.");
    return setNewConstraintLike(index, buildConstraint(index));
  }
  
  public ConstraintsNested<A> editFirstConstraint() {
    if (constraints.size() == 0) throw new RuntimeException("Can't edit first constraints. The list is empty.");
    return setNewConstraintLike(0, buildConstraint(0));
  }
  
  public ConstraintsNested<A> editLastConstraint() {
    int index = constraints.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last constraints. The list is empty.");
    return setNewConstraintLike(index, buildConstraint(index));
  }
  
  public ConstraintsNested<A> editMatchingConstraint(Predicate<V1beta1DeviceConstraintBuilder> predicate) {
    int index = -1;
    for (int i=0;i<constraints.size();i++) { 
    if (predicate.test(constraints.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching constraints. No match found.");
    return setNewConstraintLike(index, buildConstraint(index));
  }
  
  public A addToRequests(int index,V1beta1DeviceRequest item) {
    if (this.requests == null) {this.requests = new ArrayList<V1beta1DeviceRequestBuilder>();}
    V1beta1DeviceRequestBuilder builder = new V1beta1DeviceRequestBuilder(item);
    if (index < 0 || index >= requests.size()) { _visitables.get("requests").add(builder); requests.add(builder); } else { _visitables.get("requests").add(index, builder); requests.add(index, builder);}
    return (A)this;
  }
  
  public A setToRequests(int index,V1beta1DeviceRequest item) {
    if (this.requests == null) {this.requests = new ArrayList<V1beta1DeviceRequestBuilder>();}
    V1beta1DeviceRequestBuilder builder = new V1beta1DeviceRequestBuilder(item);
    if (index < 0 || index >= requests.size()) { _visitables.get("requests").add(builder); requests.add(builder); } else { _visitables.get("requests").set(index, builder); requests.set(index, builder);}
    return (A)this;
  }
  
  public A addToRequests(io.kubernetes.client.openapi.models.V1beta1DeviceRequest... items) {
    if (this.requests == null) {this.requests = new ArrayList<V1beta1DeviceRequestBuilder>();}
    for (V1beta1DeviceRequest item : items) {V1beta1DeviceRequestBuilder builder = new V1beta1DeviceRequestBuilder(item);_visitables.get("requests").add(builder);this.requests.add(builder);} return (A)this;
  }
  
  public A addAllToRequests(Collection<V1beta1DeviceRequest> items) {
    if (this.requests == null) {this.requests = new ArrayList<V1beta1DeviceRequestBuilder>();}
    for (V1beta1DeviceRequest item : items) {V1beta1DeviceRequestBuilder builder = new V1beta1DeviceRequestBuilder(item);_visitables.get("requests").add(builder);this.requests.add(builder);} return (A)this;
  }
  
  public A removeFromRequests(io.kubernetes.client.openapi.models.V1beta1DeviceRequest... items) {
    if (this.requests == null) return (A)this;
    for (V1beta1DeviceRequest item : items) {V1beta1DeviceRequestBuilder builder = new V1beta1DeviceRequestBuilder(item);_visitables.get("requests").remove(builder); this.requests.remove(builder);} return (A)this;
  }
  
  public A removeAllFromRequests(Collection<V1beta1DeviceRequest> items) {
    if (this.requests == null) return (A)this;
    for (V1beta1DeviceRequest item : items) {V1beta1DeviceRequestBuilder builder = new V1beta1DeviceRequestBuilder(item);_visitables.get("requests").remove(builder); this.requests.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromRequests(Predicate<V1beta1DeviceRequestBuilder> predicate) {
    if (requests == null) return (A) this;
    final Iterator<V1beta1DeviceRequestBuilder> each = requests.iterator();
    final List visitables = _visitables.get("requests");
    while (each.hasNext()) {
      V1beta1DeviceRequestBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1beta1DeviceRequest> buildRequests() {
    return this.requests != null ? build(requests) : null;
  }
  
  public V1beta1DeviceRequest buildRequest(int index) {
    return this.requests.get(index).build();
  }
  
  public V1beta1DeviceRequest buildFirstRequest() {
    return this.requests.get(0).build();
  }
  
  public V1beta1DeviceRequest buildLastRequest() {
    return this.requests.get(requests.size() - 1).build();
  }
  
  public V1beta1DeviceRequest buildMatchingRequest(Predicate<V1beta1DeviceRequestBuilder> predicate) {
      for (V1beta1DeviceRequestBuilder item : requests) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingRequest(Predicate<V1beta1DeviceRequestBuilder> predicate) {
      for (V1beta1DeviceRequestBuilder item : requests) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withRequests(List<V1beta1DeviceRequest> requests) {
    if (this.requests != null) {
      this._visitables.get("requests").clear();
    }
    if (requests != null) {
        this.requests = new ArrayList();
        for (V1beta1DeviceRequest item : requests) {
          this.addToRequests(item);
        }
    } else {
      this.requests = null;
    }
    return (A) this;
  }
  
  public A withRequests(io.kubernetes.client.openapi.models.V1beta1DeviceRequest... requests) {
    if (this.requests != null) {
        this.requests.clear();
        _visitables.remove("requests");
    }
    if (requests != null) {
      for (V1beta1DeviceRequest item : requests) {
        this.addToRequests(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasRequests() {
    return this.requests != null && !this.requests.isEmpty();
  }
  
  public RequestsNested<A> addNewRequest() {
    return new RequestsNested(-1, null);
  }
  
  public RequestsNested<A> addNewRequestLike(V1beta1DeviceRequest item) {
    return new RequestsNested(-1, item);
  }
  
  public RequestsNested<A> setNewRequestLike(int index,V1beta1DeviceRequest item) {
    return new RequestsNested(index, item);
  }
  
  public RequestsNested<A> editRequest(int index) {
    if (requests.size() <= index) throw new RuntimeException("Can't edit requests. Index exceeds size.");
    return setNewRequestLike(index, buildRequest(index));
  }
  
  public RequestsNested<A> editFirstRequest() {
    if (requests.size() == 0) throw new RuntimeException("Can't edit first requests. The list is empty.");
    return setNewRequestLike(0, buildRequest(0));
  }
  
  public RequestsNested<A> editLastRequest() {
    int index = requests.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last requests. The list is empty.");
    return setNewRequestLike(index, buildRequest(index));
  }
  
  public RequestsNested<A> editMatchingRequest(Predicate<V1beta1DeviceRequestBuilder> predicate) {
    int index = -1;
    for (int i=0;i<requests.size();i++) { 
    if (predicate.test(requests.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching requests. No match found.");
    return setNewRequestLike(index, buildRequest(index));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta1DeviceClaimFluent that = (V1beta1DeviceClaimFluent) o;
    if (!java.util.Objects.equals(config, that.config)) return false;
    if (!java.util.Objects.equals(constraints, that.constraints)) return false;
    if (!java.util.Objects.equals(requests, that.requests)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(config,  constraints,  requests,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (config != null && !config.isEmpty()) { sb.append("config:"); sb.append(config + ","); }
    if (constraints != null && !constraints.isEmpty()) { sb.append("constraints:"); sb.append(constraints + ","); }
    if (requests != null && !requests.isEmpty()) { sb.append("requests:"); sb.append(requests); }
    sb.append("}");
    return sb.toString();
  }
  public class ConfigNested<N> extends V1beta1DeviceClaimConfigurationFluent<ConfigNested<N>> implements Nested<N>{
    ConfigNested(int index,V1beta1DeviceClaimConfiguration item) {
      this.index = index;
      this.builder = new V1beta1DeviceClaimConfigurationBuilder(this, item);
    }
    V1beta1DeviceClaimConfigurationBuilder builder;
    int index;
    
    public N and() {
      return (N) V1beta1DeviceClaimFluent.this.setToConfig(index,builder.build());
    }
    
    public N endConfig() {
      return and();
    }
    
  
  }
  public class ConstraintsNested<N> extends V1beta1DeviceConstraintFluent<ConstraintsNested<N>> implements Nested<N>{
    ConstraintsNested(int index,V1beta1DeviceConstraint item) {
      this.index = index;
      this.builder = new V1beta1DeviceConstraintBuilder(this, item);
    }
    V1beta1DeviceConstraintBuilder builder;
    int index;
    
    public N and() {
      return (N) V1beta1DeviceClaimFluent.this.setToConstraints(index,builder.build());
    }
    
    public N endConstraint() {
      return and();
    }
    
  
  }
  public class RequestsNested<N> extends V1beta1DeviceRequestFluent<RequestsNested<N>> implements Nested<N>{
    RequestsNested(int index,V1beta1DeviceRequest item) {
      this.index = index;
      this.builder = new V1beta1DeviceRequestBuilder(this, item);
    }
    V1beta1DeviceRequestBuilder builder;
    int index;
    
    public N and() {
      return (N) V1beta1DeviceClaimFluent.this.setToRequests(index,builder.build());
    }
    
    public N endRequest() {
      return and();
    }
    
  
  }

}