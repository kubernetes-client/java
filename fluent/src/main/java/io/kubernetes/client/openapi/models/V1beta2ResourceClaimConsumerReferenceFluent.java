package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta2ResourceClaimConsumerReferenceFluent<A extends io.kubernetes.client.openapi.models.V1beta2ResourceClaimConsumerReferenceFluent<A>> extends BaseFluent<A>{
  public V1beta2ResourceClaimConsumerReferenceFluent() {
  }
  
  public V1beta2ResourceClaimConsumerReferenceFluent(V1beta2ResourceClaimConsumerReference instance) {
    this.copyInstance(instance);
  }
  private String apiGroup;
  private String name;
  private String resource;
  private String uid;
  
  protected void copyInstance(V1beta2ResourceClaimConsumerReference instance) {
    instance = instance != null ? instance : new V1beta2ResourceClaimConsumerReference();
    if (instance != null) {
        this.withApiGroup(instance.getApiGroup());
        this.withName(instance.getName());
        this.withResource(instance.getResource());
        this.withUid(instance.getUid());
    }
  }
  
  public String getApiGroup() {
    return this.apiGroup;
  }
  
  public A withApiGroup(String apiGroup) {
    this.apiGroup = apiGroup;
    return (A) this;
  }
  
  public boolean hasApiGroup() {
    return this.apiGroup != null;
  }
  
  public String getName() {
    return this.name;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public String getResource() {
    return this.resource;
  }
  
  public A withResource(String resource) {
    this.resource = resource;
    return (A) this;
  }
  
  public boolean hasResource() {
    return this.resource != null;
  }
  
  public String getUid() {
    return this.uid;
  }
  
  public A withUid(String uid) {
    this.uid = uid;
    return (A) this;
  }
  
  public boolean hasUid() {
    return this.uid != null;
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
    V1beta2ResourceClaimConsumerReferenceFluent that = (V1beta2ResourceClaimConsumerReferenceFluent) o;
    if (!(Objects.equals(apiGroup, that.apiGroup))) {
      return false;
    }
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(resource, that.resource))) {
      return false;
    }
    if (!(Objects.equals(uid, that.uid))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(apiGroup, name, resource, uid);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(apiGroup == null)) {
        sb.append("apiGroup:");
        sb.append(apiGroup);
        sb.append(",");
    }
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
        sb.append(",");
    }
    if (!(resource == null)) {
        sb.append("resource:");
        sb.append(resource);
        sb.append(",");
    }
    if (!(uid == null)) {
        sb.append("uid:");
        sb.append(uid);
    }
    sb.append("}");
    return sb.toString();
  }
  

}