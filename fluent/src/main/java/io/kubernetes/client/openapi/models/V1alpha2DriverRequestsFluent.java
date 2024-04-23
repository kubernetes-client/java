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
public class V1alpha2DriverRequestsFluent<A extends V1alpha2DriverRequestsFluent<A>> extends BaseFluent<A>{
  public V1alpha2DriverRequestsFluent() {
  }
  
  public V1alpha2DriverRequestsFluent(V1alpha2DriverRequests instance) {
    this.copyInstance(instance);
  }
  private String driverName;
  private ArrayList<V1alpha2ResourceRequestBuilder> requests;
  private Object vendorParameters;
  
  protected void copyInstance(V1alpha2DriverRequests instance) {
    instance = (instance != null ? instance : new V1alpha2DriverRequests());
    if (instance != null) {
          this.withDriverName(instance.getDriverName());
          this.withRequests(instance.getRequests());
          this.withVendorParameters(instance.getVendorParameters());
        }
  }
  
  public String getDriverName() {
    return this.driverName;
  }
  
  public A withDriverName(String driverName) {
    this.driverName = driverName;
    return (A) this;
  }
  
  public boolean hasDriverName() {
    return this.driverName != null;
  }
  
  public A addToRequests(int index,V1alpha2ResourceRequest item) {
    if (this.requests == null) {this.requests = new ArrayList<V1alpha2ResourceRequestBuilder>();}
    V1alpha2ResourceRequestBuilder builder = new V1alpha2ResourceRequestBuilder(item);
    if (index < 0 || index >= requests.size()) { _visitables.get("requests").add(builder); requests.add(builder); } else { _visitables.get("requests").add(index, builder); requests.add(index, builder);}
    return (A)this;
  }
  
  public A setToRequests(int index,V1alpha2ResourceRequest item) {
    if (this.requests == null) {this.requests = new ArrayList<V1alpha2ResourceRequestBuilder>();}
    V1alpha2ResourceRequestBuilder builder = new V1alpha2ResourceRequestBuilder(item);
    if (index < 0 || index >= requests.size()) { _visitables.get("requests").add(builder); requests.add(builder); } else { _visitables.get("requests").set(index, builder); requests.set(index, builder);}
    return (A)this;
  }
  
  public A addToRequests(io.kubernetes.client.openapi.models.V1alpha2ResourceRequest... items) {
    if (this.requests == null) {this.requests = new ArrayList<V1alpha2ResourceRequestBuilder>();}
    for (V1alpha2ResourceRequest item : items) {V1alpha2ResourceRequestBuilder builder = new V1alpha2ResourceRequestBuilder(item);_visitables.get("requests").add(builder);this.requests.add(builder);} return (A)this;
  }
  
  public A addAllToRequests(Collection<V1alpha2ResourceRequest> items) {
    if (this.requests == null) {this.requests = new ArrayList<V1alpha2ResourceRequestBuilder>();}
    for (V1alpha2ResourceRequest item : items) {V1alpha2ResourceRequestBuilder builder = new V1alpha2ResourceRequestBuilder(item);_visitables.get("requests").add(builder);this.requests.add(builder);} return (A)this;
  }
  
  public A removeFromRequests(io.kubernetes.client.openapi.models.V1alpha2ResourceRequest... items) {
    if (this.requests == null) return (A)this;
    for (V1alpha2ResourceRequest item : items) {V1alpha2ResourceRequestBuilder builder = new V1alpha2ResourceRequestBuilder(item);_visitables.get("requests").remove(builder); this.requests.remove(builder);} return (A)this;
  }
  
  public A removeAllFromRequests(Collection<V1alpha2ResourceRequest> items) {
    if (this.requests == null) return (A)this;
    for (V1alpha2ResourceRequest item : items) {V1alpha2ResourceRequestBuilder builder = new V1alpha2ResourceRequestBuilder(item);_visitables.get("requests").remove(builder); this.requests.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromRequests(Predicate<V1alpha2ResourceRequestBuilder> predicate) {
    if (requests == null) return (A) this;
    final Iterator<V1alpha2ResourceRequestBuilder> each = requests.iterator();
    final List visitables = _visitables.get("requests");
    while (each.hasNext()) {
      V1alpha2ResourceRequestBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1alpha2ResourceRequest> buildRequests() {
    return this.requests != null ? build(requests) : null;
  }
  
  public V1alpha2ResourceRequest buildRequest(int index) {
    return this.requests.get(index).build();
  }
  
  public V1alpha2ResourceRequest buildFirstRequest() {
    return this.requests.get(0).build();
  }
  
  public V1alpha2ResourceRequest buildLastRequest() {
    return this.requests.get(requests.size() - 1).build();
  }
  
  public V1alpha2ResourceRequest buildMatchingRequest(Predicate<V1alpha2ResourceRequestBuilder> predicate) {
      for (V1alpha2ResourceRequestBuilder item : requests) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingRequest(Predicate<V1alpha2ResourceRequestBuilder> predicate) {
      for (V1alpha2ResourceRequestBuilder item : requests) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withRequests(List<V1alpha2ResourceRequest> requests) {
    if (this.requests != null) {
      this._visitables.get("requests").clear();
    }
    if (requests != null) {
        this.requests = new ArrayList();
        for (V1alpha2ResourceRequest item : requests) {
          this.addToRequests(item);
        }
    } else {
      this.requests = null;
    }
    return (A) this;
  }
  
  public A withRequests(io.kubernetes.client.openapi.models.V1alpha2ResourceRequest... requests) {
    if (this.requests != null) {
        this.requests.clear();
        _visitables.remove("requests");
    }
    if (requests != null) {
      for (V1alpha2ResourceRequest item : requests) {
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
  
  public RequestsNested<A> addNewRequestLike(V1alpha2ResourceRequest item) {
    return new RequestsNested(-1, item);
  }
  
  public RequestsNested<A> setNewRequestLike(int index,V1alpha2ResourceRequest item) {
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
  
  public RequestsNested<A> editMatchingRequest(Predicate<V1alpha2ResourceRequestBuilder> predicate) {
    int index = -1;
    for (int i=0;i<requests.size();i++) { 
    if (predicate.test(requests.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching requests. No match found.");
    return setNewRequestLike(index, buildRequest(index));
  }
  
  public Object getVendorParameters() {
    return this.vendorParameters;
  }
  
  public A withVendorParameters(Object vendorParameters) {
    this.vendorParameters = vendorParameters;
    return (A) this;
  }
  
  public boolean hasVendorParameters() {
    return this.vendorParameters != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha2DriverRequestsFluent that = (V1alpha2DriverRequestsFluent) o;
    if (!java.util.Objects.equals(driverName, that.driverName)) return false;
    if (!java.util.Objects.equals(requests, that.requests)) return false;
    if (!java.util.Objects.equals(vendorParameters, that.vendorParameters)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(driverName,  requests,  vendorParameters,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (driverName != null) { sb.append("driverName:"); sb.append(driverName + ","); }
    if (requests != null && !requests.isEmpty()) { sb.append("requests:"); sb.append(requests + ","); }
    if (vendorParameters != null) { sb.append("vendorParameters:"); sb.append(vendorParameters); }
    sb.append("}");
    return sb.toString();
  }
  public class RequestsNested<N> extends V1alpha2ResourceRequestFluent<RequestsNested<N>> implements Nested<N>{
    RequestsNested(int index,V1alpha2ResourceRequest item) {
      this.index = index;
      this.builder = new V1alpha2ResourceRequestBuilder(this, item);
    }
    V1alpha2ResourceRequestBuilder builder;
    int index;
    
    public N and() {
      return (N) V1alpha2DriverRequestsFluent.this.setToRequests(index,builder.build());
    }
    
    public N endRequest() {
      return and();
    }
    
  
  }

}