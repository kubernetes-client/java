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
  public class V1ConfigMapNodeConfigSourceFluentImpl<A extends V1ConfigMapNodeConfigSourceFluent<A>> extends BaseFluent<A> implements V1ConfigMapNodeConfigSourceFluent<A>{
  public V1ConfigMapNodeConfigSourceFluentImpl() {
  }
  public V1ConfigMapNodeConfigSourceFluentImpl(V1ConfigMapNodeConfigSource instance) {
    this.withKubeletConfigKey(instance.getKubeletConfigKey());

    this.withName(instance.getName());

    this.withNamespace(instance.getNamespace());

    this.withResourceVersion(instance.getResourceVersion());

    this.withUid(instance.getUid());

  }
  private String kubeletConfigKey;
  private String name;
  private String namespace;
  private String resourceVersion;
  private String uid;
  public String getKubeletConfigKey() {
    return this.kubeletConfigKey;
  }
  public A withKubeletConfigKey(String kubeletConfigKey) {
    this.kubeletConfigKey=kubeletConfigKey; return (A) this;
  }
  public Boolean hasKubeletConfigKey() {
    return this.kubeletConfigKey != null;
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
    V1ConfigMapNodeConfigSourceFluentImpl that = (V1ConfigMapNodeConfigSourceFluentImpl) o;
    if (kubeletConfigKey != null ? !kubeletConfigKey.equals(that.kubeletConfigKey) :that.kubeletConfigKey != null) return false;
    if (name != null ? !name.equals(that.name) :that.name != null) return false;
    if (namespace != null ? !namespace.equals(that.namespace) :that.namespace != null) return false;
    if (resourceVersion != null ? !resourceVersion.equals(that.resourceVersion) :that.resourceVersion != null) return false;
    if (uid != null ? !uid.equals(that.uid) :that.uid != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(kubeletConfigKey,  name,  namespace,  resourceVersion,  uid,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (kubeletConfigKey != null) { sb.append("kubeletConfigKey:"); sb.append(kubeletConfigKey + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (namespace != null) { sb.append("namespace:"); sb.append(namespace + ","); }
    if (resourceVersion != null) { sb.append("resourceVersion:"); sb.append(resourceVersion + ","); }
    if (uid != null) { sb.append("uid:"); sb.append(uid); }
    sb.append("}");
    return sb.toString();
  }
  
}