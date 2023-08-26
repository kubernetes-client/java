package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1alpha2ResourceClaimConsumerReferenceFluentImpl<A extends V1alpha2ResourceClaimConsumerReferenceFluent<A>> extends BaseFluent<A> implements V1alpha2ResourceClaimConsumerReferenceFluent<A>{
  public V1alpha2ResourceClaimConsumerReferenceFluentImpl() {
  }
  public V1alpha2ResourceClaimConsumerReferenceFluentImpl(V1alpha2ResourceClaimConsumerReference instance) {
    if (instance != null) {
      this.withApiGroup(instance.getApiGroup());
      this.withName(instance.getName());
      this.withResource(instance.getResource());
      this.withUid(instance.getUid());
    }
  }
  private String apiGroup;
  private String name;
  private String resource;
  private String uid;
  public String getApiGroup() {
    return this.apiGroup;
  }
  public A withApiGroup(String apiGroup) {
    this.apiGroup=apiGroup; return (A) this;
  }
  public Boolean hasApiGroup() {
    return this.apiGroup != null;
  }
  public String getName() {
    return this.name;
  }
  public A withName(String name) {
    this.name=name; return (A) this;
  }
  public Boolean hasName() {
    return this.name != null;
  }
  public String getResource() {
    return this.resource;
  }
  public A withResource(String resource) {
    this.resource=resource; return (A) this;
  }
  public Boolean hasResource() {
    return this.resource != null;
  }
  public String getUid() {
    return this.uid;
  }
  public A withUid(String uid) {
    this.uid=uid; return (A) this;
  }
  public Boolean hasUid() {
    return this.uid != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha2ResourceClaimConsumerReferenceFluentImpl that = (V1alpha2ResourceClaimConsumerReferenceFluentImpl) o;
    if (!java.util.Objects.equals(apiGroup, that.apiGroup)) return false;

    if (!java.util.Objects.equals(name, that.name)) return false;

    if (!java.util.Objects.equals(resource, that.resource)) return false;

    if (!java.util.Objects.equals(uid, that.uid)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(apiGroup,  name,  resource,  uid,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiGroup != null) { sb.append("apiGroup:"); sb.append(apiGroup + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (resource != null) { sb.append("resource:"); sb.append(resource + ","); }
    if (uid != null) { sb.append("uid:"); sb.append(uid); }
    sb.append("}");
    return sb.toString();
  }
  
}