package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public class V1ConfigMapNodeConfigSourceFluentImpl<A extends io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSourceFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSourceFluent<A>{
  public V1ConfigMapNodeConfigSourceFluentImpl() {
  }
  public V1ConfigMapNodeConfigSourceFluentImpl(io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSource instance) {
    this.withKubeletConfigKey(instance.getKubeletConfigKey());

    this.withName(instance.getName());

    this.withNamespace(instance.getNamespace());

    this.withResourceVersion(instance.getResourceVersion());

    this.withUid(instance.getUid());

  }
  private java.lang.String kubeletConfigKey;
  private java.lang.String name;
  private java.lang.String namespace;
  private java.lang.String resourceVersion;
  private java.lang.String uid;
  public java.lang.String getKubeletConfigKey() {
    return this.kubeletConfigKey;
  }
  public A withKubeletConfigKey(java.lang.String kubeletConfigKey) {
    this.kubeletConfigKey=kubeletConfigKey; return (A) this;
  }
  public java.lang.Boolean hasKubeletConfigKey() {
    return this.kubeletConfigKey != null;
  }
  
  /**
   * Method is deprecated. use withKubeletConfigKey instead.
   */
  @java.lang.Deprecated
  public A withNewKubeletConfigKey(java.lang.String arg0) {
    return (A)withKubeletConfigKey(new String(arg0));
  }
  public java.lang.String getName() {
    return this.name;
  }
  public A withName(java.lang.String name) {
    this.name=name; return (A) this;
  }
  public java.lang.Boolean hasName() {
    return this.name != null;
  }
  
  /**
   * Method is deprecated. use withName instead.
   */
  @java.lang.Deprecated
  public A withNewName(java.lang.String arg0) {
    return (A)withName(new String(arg0));
  }
  public java.lang.String getNamespace() {
    return this.namespace;
  }
  public A withNamespace(java.lang.String namespace) {
    this.namespace=namespace; return (A) this;
  }
  public java.lang.Boolean hasNamespace() {
    return this.namespace != null;
  }
  
  /**
   * Method is deprecated. use withNamespace instead.
   */
  @java.lang.Deprecated
  public A withNewNamespace(java.lang.String arg0) {
    return (A)withNamespace(new String(arg0));
  }
  public java.lang.String getResourceVersion() {
    return this.resourceVersion;
  }
  public A withResourceVersion(java.lang.String resourceVersion) {
    this.resourceVersion=resourceVersion; return (A) this;
  }
  public java.lang.Boolean hasResourceVersion() {
    return this.resourceVersion != null;
  }
  
  /**
   * Method is deprecated. use withResourceVersion instead.
   */
  @java.lang.Deprecated
  public A withNewResourceVersion(java.lang.String arg0) {
    return (A)withResourceVersion(new String(arg0));
  }
  public java.lang.String getUid() {
    return this.uid;
  }
  public A withUid(java.lang.String uid) {
    this.uid=uid; return (A) this;
  }
  public java.lang.Boolean hasUid() {
    return this.uid != null;
  }
  
  /**
   * Method is deprecated. use withUid instead.
   */
  @java.lang.Deprecated
  public A withNewUid(java.lang.String arg0) {
    return (A)withUid(new String(arg0));
  }
  public boolean equals(java.lang.Object o) {
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
  
}