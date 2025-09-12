package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1DeviceConstraintFluent<A extends io.kubernetes.client.openapi.models.V1DeviceConstraintFluent<A>> extends BaseFluent<A>{
  public V1DeviceConstraintFluent() {
  }
  
  public V1DeviceConstraintFluent(V1DeviceConstraint instance) {
    this.copyInstance(instance);
  }
  private String distinctAttribute;
  private String matchAttribute;
  private List<String> requests;
  
  protected void copyInstance(V1DeviceConstraint instance) {
    instance = instance != null ? instance : new V1DeviceConstraint();
    if (instance != null) {
        this.withDistinctAttribute(instance.getDistinctAttribute());
        this.withMatchAttribute(instance.getMatchAttribute());
        this.withRequests(instance.getRequests());
    }
  }
  
  public String getDistinctAttribute() {
    return this.distinctAttribute;
  }
  
  public A withDistinctAttribute(String distinctAttribute) {
    this.distinctAttribute = distinctAttribute;
    return (A) this;
  }
  
  public boolean hasDistinctAttribute() {
    return this.distinctAttribute != null;
  }
  
  public String getMatchAttribute() {
    return this.matchAttribute;
  }
  
  public A withMatchAttribute(String matchAttribute) {
    this.matchAttribute = matchAttribute;
    return (A) this;
  }
  
  public boolean hasMatchAttribute() {
    return this.matchAttribute != null;
  }
  
  public A addToRequests(int index,String item) {
    if (this.requests == null) {
      this.requests = new ArrayList();
    }
    this.requests.add(index, item);
    return (A) this;
  }
  
  public A setToRequests(int index,String item) {
    if (this.requests == null) {
      this.requests = new ArrayList();
    }
    this.requests.set(index, item);
    return (A) this;
  }
  
  public A addToRequests(String... items) {
    if (this.requests == null) {
      this.requests = new ArrayList();
    }
    for (String item : items) {
      this.requests.add(item);
    }
    return (A) this;
  }
  
  public A addAllToRequests(Collection<String> items) {
    if (this.requests == null) {
      this.requests = new ArrayList();
    }
    for (String item : items) {
      this.requests.add(item);
    }
    return (A) this;
  }
  
  public A removeFromRequests(String... items) {
    if (this.requests == null) {
      return (A) this;
    }
    for (String item : items) {
      this.requests.remove(item);
    }
    return (A) this;
  }
  
  public A removeAllFromRequests(Collection<String> items) {
    if (this.requests == null) {
      return (A) this;
    }
    for (String item : items) {
      this.requests.remove(item);
    }
    return (A) this;
  }
  
  public List<String> getRequests() {
    return this.requests;
  }
  
  public String getRequest(int index) {
    return this.requests.get(index);
  }
  
  public String getFirstRequest() {
    return this.requests.get(0);
  }
  
  public String getLastRequest() {
    return this.requests.get(requests.size() - 1);
  }
  
  public String getMatchingRequest(Predicate<String> predicate) {
      for (String item : requests) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingRequest(Predicate<String> predicate) {
      for (String item : requests) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withRequests(List<String> requests) {
    if (requests != null) {
        this.requests = new ArrayList();
        for (String item : requests) {
          this.addToRequests(item);
        }
    } else {
      this.requests = null;
    }
    return (A) this;
  }
  
  public A withRequests(String... requests) {
    if (this.requests != null) {
        this.requests.clear();
        _visitables.remove("requests");
    }
    if (requests != null) {
      for (String item : requests) {
        this.addToRequests(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasRequests() {
    return this.requests != null && !(this.requests.isEmpty());
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
    V1DeviceConstraintFluent that = (V1DeviceConstraintFluent) o;
    if (!(Objects.equals(distinctAttribute, that.distinctAttribute))) {
      return false;
    }
    if (!(Objects.equals(matchAttribute, that.matchAttribute))) {
      return false;
    }
    if (!(Objects.equals(requests, that.requests))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(distinctAttribute, matchAttribute, requests);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(distinctAttribute == null)) {
        sb.append("distinctAttribute:");
        sb.append(distinctAttribute);
        sb.append(",");
    }
    if (!(matchAttribute == null)) {
        sb.append("matchAttribute:");
        sb.append(matchAttribute);
        sb.append(",");
    }
    if (!(requests == null) && !(requests.isEmpty())) {
        sb.append("requests:");
        sb.append(requests);
    }
    sb.append("}");
    return sb.toString();
  }
  

}