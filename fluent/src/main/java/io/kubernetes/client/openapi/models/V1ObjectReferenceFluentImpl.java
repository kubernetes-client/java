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
  public class V1ObjectReferenceFluentImpl<A extends V1ObjectReferenceFluent<A>> extends BaseFluent<A> implements V1ObjectReferenceFluent<A>{
  public V1ObjectReferenceFluentImpl() {
  }
  public V1ObjectReferenceFluentImpl(V1ObjectReference instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withFieldPath(instance.getFieldPath());

    this.withKind(instance.getKind());

    this.withName(instance.getName());

    this.withNamespace(instance.getNamespace());

    this.withResourceVersion(instance.getResourceVersion());

    this.withUid(instance.getUid());

  }
  private String apiVersion;
  private String fieldPath;
  private String kind;
  private String name;
  private String namespace;
  private String resourceVersion;
  private String uid;
  public String getApiVersion() {
    return this.apiVersion;
  }
  public A withApiVersion(String apiVersion) {
    this.apiVersion=apiVersion; return (A) this;
  }
  public Boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  public String getFieldPath() {
    return this.fieldPath;
  }
  public A withFieldPath(String fieldPath) {
    this.fieldPath=fieldPath; return (A) this;
  }
  public Boolean hasFieldPath() {
    return this.fieldPath != null;
  }
  public String getKind() {
    return this.kind;
  }
  public A withKind(String kind) {
    this.kind=kind; return (A) this;
  }
  public Boolean hasKind() {
    return this.kind != null;
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
  public String getNamespace() {
    return this.namespace;
  }
  public A withNamespace(String namespace) {
    this.namespace=namespace; return (A) this;
  }
  public Boolean hasNamespace() {
    return this.namespace != null;
  }
  public String getResourceVersion() {
    return this.resourceVersion;
  }
  public A withResourceVersion(String resourceVersion) {
    this.resourceVersion=resourceVersion; return (A) this;
  }
  public Boolean hasResourceVersion() {
    return this.resourceVersion != null;
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
    V1ObjectReferenceFluentImpl that = (V1ObjectReferenceFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
    if (fieldPath != null ? !fieldPath.equals(that.fieldPath) :that.fieldPath != null) return false;
    if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
    if (name != null ? !name.equals(that.name) :that.name != null) return false;
    if (namespace != null ? !namespace.equals(that.namespace) :that.namespace != null) return false;
    if (resourceVersion != null ? !resourceVersion.equals(that.resourceVersion) :that.resourceVersion != null) return false;
    if (uid != null ? !uid.equals(that.uid) :that.uid != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  fieldPath,  kind,  name,  namespace,  resourceVersion,  uid,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (fieldPath != null) { sb.append("fieldPath:"); sb.append(fieldPath + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (namespace != null) { sb.append("namespace:"); sb.append(namespace + ","); }
    if (resourceVersion != null) { sb.append("resourceVersion:"); sb.append(resourceVersion + ","); }
    if (uid != null) { sb.append("uid:"); sb.append(uid); }
    sb.append("}");
    return sb.toString();
  }
  
}