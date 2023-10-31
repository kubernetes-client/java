package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ConfigMapNodeConfigSourceFluent<A extends V1ConfigMapNodeConfigSourceFluent<A>> extends BaseFluent<A>{
  public V1ConfigMapNodeConfigSourceFluent() {
  }
  
  public V1ConfigMapNodeConfigSourceFluent(V1ConfigMapNodeConfigSource instance) {
    this.copyInstance(instance);
  }
  private String kubeletConfigKey;
  private String name;
  private String namespace;
  private String resourceVersion;
  private String uid;
  
  protected void copyInstance(V1ConfigMapNodeConfigSource instance) {
    instance = (instance != null ? instance : new V1ConfigMapNodeConfigSource());
    if (instance != null) {
          this.withKubeletConfigKey(instance.getKubeletConfigKey());
          this.withName(instance.getName());
          this.withNamespace(instance.getNamespace());
          this.withResourceVersion(instance.getResourceVersion());
          this.withUid(instance.getUid());
        }
  }
  
  public String getKubeletConfigKey() {
    return this.kubeletConfigKey;
  }
  
  public A withKubeletConfigKey(String kubeletConfigKey) {
    this.kubeletConfigKey = kubeletConfigKey;
    return (A) this;
  }
  
  public boolean hasKubeletConfigKey() {
    return this.kubeletConfigKey != null;
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
  
  public String getNamespace() {
    return this.namespace;
  }
  
  public A withNamespace(String namespace) {
    this.namespace = namespace;
    return (A) this;
  }
  
  public boolean hasNamespace() {
    return this.namespace != null;
  }
  
  public String getResourceVersion() {
    return this.resourceVersion;
  }
  
  public A withResourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
    return (A) this;
  }
  
  public boolean hasResourceVersion() {
    return this.resourceVersion != null;
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
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ConfigMapNodeConfigSourceFluent that = (V1ConfigMapNodeConfigSourceFluent) o;
    if (!java.util.Objects.equals(kubeletConfigKey, that.kubeletConfigKey)) return false;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(namespace, that.namespace)) return false;
    if (!java.util.Objects.equals(resourceVersion, that.resourceVersion)) return false;
    if (!java.util.Objects.equals(uid, that.uid)) return false;
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