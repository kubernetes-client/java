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
public class V1alpha3DeviceClaimFluent<A extends V1alpha3DeviceClaimFluent<A>> extends BaseFluent<A>{
  public V1alpha3DeviceClaimFluent() {
  }
  
  public V1alpha3DeviceClaimFluent(V1alpha3DeviceClaim instance) {
    this.copyInstance(instance);
  }
  private ArrayList<V1alpha3DeviceClaimConfigurationBuilder> config;
  private ArrayList<V1alpha3DeviceConstraintBuilder> constraints;
  private ArrayList<V1alpha3DeviceRequestBuilder> requests;
  
  protected void copyInstance(V1alpha3DeviceClaim instance) {
    instance = (instance != null ? instance : new V1alpha3DeviceClaim());
    if (instance != null) {
          this.withConfig(instance.getConfig());
          this.withConstraints(instance.getConstraints());
          this.withRequests(instance.getRequests());
        }
  }
  
  public A addToConfig(int index,V1alpha3DeviceClaimConfiguration item) {
    if (this.config == null) {this.config = new ArrayList<V1alpha3DeviceClaimConfigurationBuilder>();}
    V1alpha3DeviceClaimConfigurationBuilder builder = new V1alpha3DeviceClaimConfigurationBuilder(item);
    if (index < 0 || index >= config.size()) { _visitables.get("config").add(builder); config.add(builder); } else { _visitables.get("config").add(index, builder); config.add(index, builder);}
    return (A)this;
  }
  
  public A setToConfig(int index,V1alpha3DeviceClaimConfiguration item) {
    if (this.config == null) {this.config = new ArrayList<V1alpha3DeviceClaimConfigurationBuilder>();}
    V1alpha3DeviceClaimConfigurationBuilder builder = new V1alpha3DeviceClaimConfigurationBuilder(item);
    if (index < 0 || index >= config.size()) { _visitables.get("config").add(builder); config.add(builder); } else { _visitables.get("config").set(index, builder); config.set(index, builder);}
    return (A)this;
  }
  
  public A addToConfig(io.kubernetes.client.openapi.models.V1alpha3DeviceClaimConfiguration... items) {
    if (this.config == null) {this.config = new ArrayList<V1alpha3DeviceClaimConfigurationBuilder>();}
    for (V1alpha3DeviceClaimConfiguration item : items) {V1alpha3DeviceClaimConfigurationBuilder builder = new V1alpha3DeviceClaimConfigurationBuilder(item);_visitables.get("config").add(builder);this.config.add(builder);} return (A)this;
  }
  
  public A addAllToConfig(Collection<V1alpha3DeviceClaimConfiguration> items) {
    if (this.config == null) {this.config = new ArrayList<V1alpha3DeviceClaimConfigurationBuilder>();}
    for (V1alpha3DeviceClaimConfiguration item : items) {V1alpha3DeviceClaimConfigurationBuilder builder = new V1alpha3DeviceClaimConfigurationBuilder(item);_visitables.get("config").add(builder);this.config.add(builder);} return (A)this;
  }
  
  public A removeFromConfig(io.kubernetes.client.openapi.models.V1alpha3DeviceClaimConfiguration... items) {
    if (this.config == null) return (A)this;
    for (V1alpha3DeviceClaimConfiguration item : items) {V1alpha3DeviceClaimConfigurationBuilder builder = new V1alpha3DeviceClaimConfigurationBuilder(item);_visitables.get("config").remove(builder); this.config.remove(builder);} return (A)this;
  }
  
  public A removeAllFromConfig(Collection<V1alpha3DeviceClaimConfiguration> items) {
    if (this.config == null) return (A)this;
    for (V1alpha3DeviceClaimConfiguration item : items) {V1alpha3DeviceClaimConfigurationBuilder builder = new V1alpha3DeviceClaimConfigurationBuilder(item);_visitables.get("config").remove(builder); this.config.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromConfig(Predicate<V1alpha3DeviceClaimConfigurationBuilder> predicate) {
    if (config == null) return (A) this;
    final Iterator<V1alpha3DeviceClaimConfigurationBuilder> each = config.iterator();
    final List visitables = _visitables.get("config");
    while (each.hasNext()) {
      V1alpha3DeviceClaimConfigurationBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1alpha3DeviceClaimConfiguration> buildConfig() {
    return this.config != null ? build(config) : null;
  }
  
  public V1alpha3DeviceClaimConfiguration buildConfig(int index) {
    return this.config.get(index).build();
  }
  
  public V1alpha3DeviceClaimConfiguration buildFirstConfig() {
    return this.config.get(0).build();
  }
  
  public V1alpha3DeviceClaimConfiguration buildLastConfig() {
    return this.config.get(config.size() - 1).build();
  }
  
  public V1alpha3DeviceClaimConfiguration buildMatchingConfig(Predicate<V1alpha3DeviceClaimConfigurationBuilder> predicate) {
      for (V1alpha3DeviceClaimConfigurationBuilder item : config) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingConfig(Predicate<V1alpha3DeviceClaimConfigurationBuilder> predicate) {
      for (V1alpha3DeviceClaimConfigurationBuilder item : config) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withConfig(List<V1alpha3DeviceClaimConfiguration> config) {
    if (this.config != null) {
      this._visitables.get("config").clear();
    }
    if (config != null) {
        this.config = new ArrayList();
        for (V1alpha3DeviceClaimConfiguration item : config) {
          this.addToConfig(item);
        }
    } else {
      this.config = null;
    }
    return (A) this;
  }
  
  public A withConfig(io.kubernetes.client.openapi.models.V1alpha3DeviceClaimConfiguration... config) {
    if (this.config != null) {
        this.config.clear();
        _visitables.remove("config");
    }
    if (config != null) {
      for (V1alpha3DeviceClaimConfiguration item : config) {
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
  
  public ConfigNested<A> addNewConfigLike(V1alpha3DeviceClaimConfiguration item) {
    return new ConfigNested(-1, item);
  }
  
  public ConfigNested<A> setNewConfigLike(int index,V1alpha3DeviceClaimConfiguration item) {
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
  
  public ConfigNested<A> editMatchingConfig(Predicate<V1alpha3DeviceClaimConfigurationBuilder> predicate) {
    int index = -1;
    for (int i=0;i<config.size();i++) { 
    if (predicate.test(config.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching config. No match found.");
    return setNewConfigLike(index, buildConfig(index));
  }
  
  public A addToConstraints(int index,V1alpha3DeviceConstraint item) {
    if (this.constraints == null) {this.constraints = new ArrayList<V1alpha3DeviceConstraintBuilder>();}
    V1alpha3DeviceConstraintBuilder builder = new V1alpha3DeviceConstraintBuilder(item);
    if (index < 0 || index >= constraints.size()) { _visitables.get("constraints").add(builder); constraints.add(builder); } else { _visitables.get("constraints").add(index, builder); constraints.add(index, builder);}
    return (A)this;
  }
  
  public A setToConstraints(int index,V1alpha3DeviceConstraint item) {
    if (this.constraints == null) {this.constraints = new ArrayList<V1alpha3DeviceConstraintBuilder>();}
    V1alpha3DeviceConstraintBuilder builder = new V1alpha3DeviceConstraintBuilder(item);
    if (index < 0 || index >= constraints.size()) { _visitables.get("constraints").add(builder); constraints.add(builder); } else { _visitables.get("constraints").set(index, builder); constraints.set(index, builder);}
    return (A)this;
  }
  
  public A addToConstraints(io.kubernetes.client.openapi.models.V1alpha3DeviceConstraint... items) {
    if (this.constraints == null) {this.constraints = new ArrayList<V1alpha3DeviceConstraintBuilder>();}
    for (V1alpha3DeviceConstraint item : items) {V1alpha3DeviceConstraintBuilder builder = new V1alpha3DeviceConstraintBuilder(item);_visitables.get("constraints").add(builder);this.constraints.add(builder);} return (A)this;
  }
  
  public A addAllToConstraints(Collection<V1alpha3DeviceConstraint> items) {
    if (this.constraints == null) {this.constraints = new ArrayList<V1alpha3DeviceConstraintBuilder>();}
    for (V1alpha3DeviceConstraint item : items) {V1alpha3DeviceConstraintBuilder builder = new V1alpha3DeviceConstraintBuilder(item);_visitables.get("constraints").add(builder);this.constraints.add(builder);} return (A)this;
  }
  
  public A removeFromConstraints(io.kubernetes.client.openapi.models.V1alpha3DeviceConstraint... items) {
    if (this.constraints == null) return (A)this;
    for (V1alpha3DeviceConstraint item : items) {V1alpha3DeviceConstraintBuilder builder = new V1alpha3DeviceConstraintBuilder(item);_visitables.get("constraints").remove(builder); this.constraints.remove(builder);} return (A)this;
  }
  
  public A removeAllFromConstraints(Collection<V1alpha3DeviceConstraint> items) {
    if (this.constraints == null) return (A)this;
    for (V1alpha3DeviceConstraint item : items) {V1alpha3DeviceConstraintBuilder builder = new V1alpha3DeviceConstraintBuilder(item);_visitables.get("constraints").remove(builder); this.constraints.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromConstraints(Predicate<V1alpha3DeviceConstraintBuilder> predicate) {
    if (constraints == null) return (A) this;
    final Iterator<V1alpha3DeviceConstraintBuilder> each = constraints.iterator();
    final List visitables = _visitables.get("constraints");
    while (each.hasNext()) {
      V1alpha3DeviceConstraintBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1alpha3DeviceConstraint> buildConstraints() {
    return this.constraints != null ? build(constraints) : null;
  }
  
  public V1alpha3DeviceConstraint buildConstraint(int index) {
    return this.constraints.get(index).build();
  }
  
  public V1alpha3DeviceConstraint buildFirstConstraint() {
    return this.constraints.get(0).build();
  }
  
  public V1alpha3DeviceConstraint buildLastConstraint() {
    return this.constraints.get(constraints.size() - 1).build();
  }
  
  public V1alpha3DeviceConstraint buildMatchingConstraint(Predicate<V1alpha3DeviceConstraintBuilder> predicate) {
      for (V1alpha3DeviceConstraintBuilder item : constraints) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingConstraint(Predicate<V1alpha3DeviceConstraintBuilder> predicate) {
      for (V1alpha3DeviceConstraintBuilder item : constraints) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withConstraints(List<V1alpha3DeviceConstraint> constraints) {
    if (this.constraints != null) {
      this._visitables.get("constraints").clear();
    }
    if (constraints != null) {
        this.constraints = new ArrayList();
        for (V1alpha3DeviceConstraint item : constraints) {
          this.addToConstraints(item);
        }
    } else {
      this.constraints = null;
    }
    return (A) this;
  }
  
  public A withConstraints(io.kubernetes.client.openapi.models.V1alpha3DeviceConstraint... constraints) {
    if (this.constraints != null) {
        this.constraints.clear();
        _visitables.remove("constraints");
    }
    if (constraints != null) {
      for (V1alpha3DeviceConstraint item : constraints) {
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
  
  public ConstraintsNested<A> addNewConstraintLike(V1alpha3DeviceConstraint item) {
    return new ConstraintsNested(-1, item);
  }
  
  public ConstraintsNested<A> setNewConstraintLike(int index,V1alpha3DeviceConstraint item) {
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
  
  public ConstraintsNested<A> editMatchingConstraint(Predicate<V1alpha3DeviceConstraintBuilder> predicate) {
    int index = -1;
    for (int i=0;i<constraints.size();i++) { 
    if (predicate.test(constraints.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching constraints. No match found.");
    return setNewConstraintLike(index, buildConstraint(index));
  }
  
  public A addToRequests(int index,V1alpha3DeviceRequest item) {
    if (this.requests == null) {this.requests = new ArrayList<V1alpha3DeviceRequestBuilder>();}
    V1alpha3DeviceRequestBuilder builder = new V1alpha3DeviceRequestBuilder(item);
    if (index < 0 || index >= requests.size()) { _visitables.get("requests").add(builder); requests.add(builder); } else { _visitables.get("requests").add(index, builder); requests.add(index, builder);}
    return (A)this;
  }
  
  public A setToRequests(int index,V1alpha3DeviceRequest item) {
    if (this.requests == null) {this.requests = new ArrayList<V1alpha3DeviceRequestBuilder>();}
    V1alpha3DeviceRequestBuilder builder = new V1alpha3DeviceRequestBuilder(item);
    if (index < 0 || index >= requests.size()) { _visitables.get("requests").add(builder); requests.add(builder); } else { _visitables.get("requests").set(index, builder); requests.set(index, builder);}
    return (A)this;
  }
  
  public A addToRequests(io.kubernetes.client.openapi.models.V1alpha3DeviceRequest... items) {
    if (this.requests == null) {this.requests = new ArrayList<V1alpha3DeviceRequestBuilder>();}
    for (V1alpha3DeviceRequest item : items) {V1alpha3DeviceRequestBuilder builder = new V1alpha3DeviceRequestBuilder(item);_visitables.get("requests").add(builder);this.requests.add(builder);} return (A)this;
  }
  
  public A addAllToRequests(Collection<V1alpha3DeviceRequest> items) {
    if (this.requests == null) {this.requests = new ArrayList<V1alpha3DeviceRequestBuilder>();}
    for (V1alpha3DeviceRequest item : items) {V1alpha3DeviceRequestBuilder builder = new V1alpha3DeviceRequestBuilder(item);_visitables.get("requests").add(builder);this.requests.add(builder);} return (A)this;
  }
  
  public A removeFromRequests(io.kubernetes.client.openapi.models.V1alpha3DeviceRequest... items) {
    if (this.requests == null) return (A)this;
    for (V1alpha3DeviceRequest item : items) {V1alpha3DeviceRequestBuilder builder = new V1alpha3DeviceRequestBuilder(item);_visitables.get("requests").remove(builder); this.requests.remove(builder);} return (A)this;
  }
  
  public A removeAllFromRequests(Collection<V1alpha3DeviceRequest> items) {
    if (this.requests == null) return (A)this;
    for (V1alpha3DeviceRequest item : items) {V1alpha3DeviceRequestBuilder builder = new V1alpha3DeviceRequestBuilder(item);_visitables.get("requests").remove(builder); this.requests.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromRequests(Predicate<V1alpha3DeviceRequestBuilder> predicate) {
    if (requests == null) return (A) this;
    final Iterator<V1alpha3DeviceRequestBuilder> each = requests.iterator();
    final List visitables = _visitables.get("requests");
    while (each.hasNext()) {
      V1alpha3DeviceRequestBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1alpha3DeviceRequest> buildRequests() {
    return this.requests != null ? build(requests) : null;
  }
  
  public V1alpha3DeviceRequest buildRequest(int index) {
    return this.requests.get(index).build();
  }
  
  public V1alpha3DeviceRequest buildFirstRequest() {
    return this.requests.get(0).build();
  }
  
  public V1alpha3DeviceRequest buildLastRequest() {
    return this.requests.get(requests.size() - 1).build();
  }
  
  public V1alpha3DeviceRequest buildMatchingRequest(Predicate<V1alpha3DeviceRequestBuilder> predicate) {
      for (V1alpha3DeviceRequestBuilder item : requests) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingRequest(Predicate<V1alpha3DeviceRequestBuilder> predicate) {
      for (V1alpha3DeviceRequestBuilder item : requests) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withRequests(List<V1alpha3DeviceRequest> requests) {
    if (this.requests != null) {
      this._visitables.get("requests").clear();
    }
    if (requests != null) {
        this.requests = new ArrayList();
        for (V1alpha3DeviceRequest item : requests) {
          this.addToRequests(item);
        }
    } else {
      this.requests = null;
    }
    return (A) this;
  }
  
  public A withRequests(io.kubernetes.client.openapi.models.V1alpha3DeviceRequest... requests) {
    if (this.requests != null) {
        this.requests.clear();
        _visitables.remove("requests");
    }
    if (requests != null) {
      for (V1alpha3DeviceRequest item : requests) {
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
  
  public RequestsNested<A> addNewRequestLike(V1alpha3DeviceRequest item) {
    return new RequestsNested(-1, item);
  }
  
  public RequestsNested<A> setNewRequestLike(int index,V1alpha3DeviceRequest item) {
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
  
  public RequestsNested<A> editMatchingRequest(Predicate<V1alpha3DeviceRequestBuilder> predicate) {
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
    V1alpha3DeviceClaimFluent that = (V1alpha3DeviceClaimFluent) o;
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
  public class ConfigNested<N> extends V1alpha3DeviceClaimConfigurationFluent<ConfigNested<N>> implements Nested<N>{
    ConfigNested(int index,V1alpha3DeviceClaimConfiguration item) {
      this.index = index;
      this.builder = new V1alpha3DeviceClaimConfigurationBuilder(this, item);
    }
    V1alpha3DeviceClaimConfigurationBuilder builder;
    int index;
    
    public N and() {
      return (N) V1alpha3DeviceClaimFluent.this.setToConfig(index,builder.build());
    }
    
    public N endConfig() {
      return and();
    }
    
  
  }
  public class ConstraintsNested<N> extends V1alpha3DeviceConstraintFluent<ConstraintsNested<N>> implements Nested<N>{
    ConstraintsNested(int index,V1alpha3DeviceConstraint item) {
      this.index = index;
      this.builder = new V1alpha3DeviceConstraintBuilder(this, item);
    }
    V1alpha3DeviceConstraintBuilder builder;
    int index;
    
    public N and() {
      return (N) V1alpha3DeviceClaimFluent.this.setToConstraints(index,builder.build());
    }
    
    public N endConstraint() {
      return and();
    }
    
  
  }
  public class RequestsNested<N> extends V1alpha3DeviceRequestFluent<RequestsNested<N>> implements Nested<N>{
    RequestsNested(int index,V1alpha3DeviceRequest item) {
      this.index = index;
      this.builder = new V1alpha3DeviceRequestBuilder(this, item);
    }
    V1alpha3DeviceRequestBuilder builder;
    int index;
    
    public N and() {
      return (N) V1alpha3DeviceClaimFluent.this.setToRequests(index,builder.build());
    }
    
    public N endRequest() {
      return and();
    }
    
  
  }

}