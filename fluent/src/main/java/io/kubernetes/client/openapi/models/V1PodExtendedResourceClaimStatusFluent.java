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
import java.util.Objects;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1PodExtendedResourceClaimStatusFluent<A extends io.kubernetes.client.openapi.models.V1PodExtendedResourceClaimStatusFluent<A>> extends BaseFluent<A>{
  public V1PodExtendedResourceClaimStatusFluent() {
  }
  
  public V1PodExtendedResourceClaimStatusFluent(V1PodExtendedResourceClaimStatus instance) {
    this.copyInstance(instance);
  }
  private ArrayList<V1ContainerExtendedResourceRequestBuilder> requestMappings;
  private String resourceClaimName;
  
  protected void copyInstance(V1PodExtendedResourceClaimStatus instance) {
    instance = instance != null ? instance : new V1PodExtendedResourceClaimStatus();
    if (instance != null) {
        this.withRequestMappings(instance.getRequestMappings());
        this.withResourceClaimName(instance.getResourceClaimName());
    }
  }
  
  public A addToRequestMappings(int index,V1ContainerExtendedResourceRequest item) {
    if (this.requestMappings == null) {
      this.requestMappings = new ArrayList();
    }
    V1ContainerExtendedResourceRequestBuilder builder = new V1ContainerExtendedResourceRequestBuilder(item);
    if (index < 0 || index >= requestMappings.size()) {
        _visitables.get("requestMappings").add(builder);
        requestMappings.add(builder);
    } else {
        _visitables.get("requestMappings").add(builder);
        requestMappings.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToRequestMappings(int index,V1ContainerExtendedResourceRequest item) {
    if (this.requestMappings == null) {
      this.requestMappings = new ArrayList();
    }
    V1ContainerExtendedResourceRequestBuilder builder = new V1ContainerExtendedResourceRequestBuilder(item);
    if (index < 0 || index >= requestMappings.size()) {
        _visitables.get("requestMappings").add(builder);
        requestMappings.add(builder);
    } else {
        _visitables.get("requestMappings").add(builder);
        requestMappings.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToRequestMappings(V1ContainerExtendedResourceRequest... items) {
    if (this.requestMappings == null) {
      this.requestMappings = new ArrayList();
    }
    for (V1ContainerExtendedResourceRequest item : items) {
        V1ContainerExtendedResourceRequestBuilder builder = new V1ContainerExtendedResourceRequestBuilder(item);
        _visitables.get("requestMappings").add(builder);
        this.requestMappings.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToRequestMappings(Collection<V1ContainerExtendedResourceRequest> items) {
    if (this.requestMappings == null) {
      this.requestMappings = new ArrayList();
    }
    for (V1ContainerExtendedResourceRequest item : items) {
        V1ContainerExtendedResourceRequestBuilder builder = new V1ContainerExtendedResourceRequestBuilder(item);
        _visitables.get("requestMappings").add(builder);
        this.requestMappings.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromRequestMappings(V1ContainerExtendedResourceRequest... items) {
    if (this.requestMappings == null) {
      return (A) this;
    }
    for (V1ContainerExtendedResourceRequest item : items) {
        V1ContainerExtendedResourceRequestBuilder builder = new V1ContainerExtendedResourceRequestBuilder(item);
        _visitables.get("requestMappings").remove(builder);
        this.requestMappings.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromRequestMappings(Collection<V1ContainerExtendedResourceRequest> items) {
    if (this.requestMappings == null) {
      return (A) this;
    }
    for (V1ContainerExtendedResourceRequest item : items) {
        V1ContainerExtendedResourceRequestBuilder builder = new V1ContainerExtendedResourceRequestBuilder(item);
        _visitables.get("requestMappings").remove(builder);
        this.requestMappings.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromRequestMappings(Predicate<V1ContainerExtendedResourceRequestBuilder> predicate) {
    if (requestMappings == null) {
      return (A) this;
    }
    Iterator<V1ContainerExtendedResourceRequestBuilder> each = requestMappings.iterator();
    List visitables = _visitables.get("requestMappings");
    while (each.hasNext()) {
        V1ContainerExtendedResourceRequestBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public List<V1ContainerExtendedResourceRequest> buildRequestMappings() {
    return this.requestMappings != null ? build(requestMappings) : null;
  }
  
  public V1ContainerExtendedResourceRequest buildRequestMapping(int index) {
    return this.requestMappings.get(index).build();
  }
  
  public V1ContainerExtendedResourceRequest buildFirstRequestMapping() {
    return this.requestMappings.get(0).build();
  }
  
  public V1ContainerExtendedResourceRequest buildLastRequestMapping() {
    return this.requestMappings.get(requestMappings.size() - 1).build();
  }
  
  public V1ContainerExtendedResourceRequest buildMatchingRequestMapping(Predicate<V1ContainerExtendedResourceRequestBuilder> predicate) {
      for (V1ContainerExtendedResourceRequestBuilder item : requestMappings) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingRequestMapping(Predicate<V1ContainerExtendedResourceRequestBuilder> predicate) {
      for (V1ContainerExtendedResourceRequestBuilder item : requestMappings) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withRequestMappings(List<V1ContainerExtendedResourceRequest> requestMappings) {
    if (this.requestMappings != null) {
      this._visitables.get("requestMappings").clear();
    }
    if (requestMappings != null) {
        this.requestMappings = new ArrayList();
        for (V1ContainerExtendedResourceRequest item : requestMappings) {
          this.addToRequestMappings(item);
        }
    } else {
      this.requestMappings = null;
    }
    return (A) this;
  }
  
  public A withRequestMappings(V1ContainerExtendedResourceRequest... requestMappings) {
    if (this.requestMappings != null) {
        this.requestMappings.clear();
        _visitables.remove("requestMappings");
    }
    if (requestMappings != null) {
      for (V1ContainerExtendedResourceRequest item : requestMappings) {
        this.addToRequestMappings(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasRequestMappings() {
    return this.requestMappings != null && !(this.requestMappings.isEmpty());
  }
  
  public RequestMappingsNested<A> addNewRequestMapping() {
    return new RequestMappingsNested(-1, null);
  }
  
  public RequestMappingsNested<A> addNewRequestMappingLike(V1ContainerExtendedResourceRequest item) {
    return new RequestMappingsNested(-1, item);
  }
  
  public RequestMappingsNested<A> setNewRequestMappingLike(int index,V1ContainerExtendedResourceRequest item) {
    return new RequestMappingsNested(index, item);
  }
  
  public RequestMappingsNested<A> editRequestMapping(int index) {
    if (index <= requestMappings.size()) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "requestMappings"));
    }
    return this.setNewRequestMappingLike(index, this.buildRequestMapping(index));
  }
  
  public RequestMappingsNested<A> editFirstRequestMapping() {
    if (requestMappings.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "requestMappings"));
    }
    return this.setNewRequestMappingLike(0, this.buildRequestMapping(0));
  }
  
  public RequestMappingsNested<A> editLastRequestMapping() {
    int index = requestMappings.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "requestMappings"));
    }
    return this.setNewRequestMappingLike(index, this.buildRequestMapping(index));
  }
  
  public RequestMappingsNested<A> editMatchingRequestMapping(Predicate<V1ContainerExtendedResourceRequestBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < requestMappings.size();i++) {
      if (predicate.test(requestMappings.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "requestMappings"));
    }
    return this.setNewRequestMappingLike(index, this.buildRequestMapping(index));
  }
  
  public String getResourceClaimName() {
    return this.resourceClaimName;
  }
  
  public A withResourceClaimName(String resourceClaimName) {
    this.resourceClaimName = resourceClaimName;
    return (A) this;
  }
  
  public boolean hasResourceClaimName() {
    return this.resourceClaimName != null;
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
    V1PodExtendedResourceClaimStatusFluent that = (V1PodExtendedResourceClaimStatusFluent) o;
    if (!(Objects.equals(requestMappings, that.requestMappings))) {
      return false;
    }
    if (!(Objects.equals(resourceClaimName, that.resourceClaimName))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(requestMappings, resourceClaimName);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(requestMappings == null) && !(requestMappings.isEmpty())) {
        sb.append("requestMappings:");
        sb.append(requestMappings);
        sb.append(",");
    }
    if (!(resourceClaimName == null)) {
        sb.append("resourceClaimName:");
        sb.append(resourceClaimName);
    }
    sb.append("}");
    return sb.toString();
  }
  public class RequestMappingsNested<N> extends V1ContainerExtendedResourceRequestFluent<RequestMappingsNested<N>> implements Nested<N>{
    RequestMappingsNested(int index,V1ContainerExtendedResourceRequest item) {
      this.index = index;
      this.builder = new V1ContainerExtendedResourceRequestBuilder(this, item);
    }
    V1ContainerExtendedResourceRequestBuilder builder;
    int index;
    
    public N and() {
      return (N) V1PodExtendedResourceClaimStatusFluent.this.setToRequestMappings(index, builder.build());
    }
    
    public N endRequestMapping() {
      return and();
    }
    
  
  }

}