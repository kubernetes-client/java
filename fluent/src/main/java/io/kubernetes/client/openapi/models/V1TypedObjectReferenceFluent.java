package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1TypedObjectReferenceFluent<A extends V1TypedObjectReferenceFluent<A>> extends BaseFluent<A>{
  public V1TypedObjectReferenceFluent() {
  }
  
  public V1TypedObjectReferenceFluent(V1TypedObjectReference instance) {
    this.copyInstance(instance);
  }
  private String apiGroup;
  private String kind;
  private String name;
  private String namespace;
  
  protected void copyInstance(V1TypedObjectReference instance) {
    instance = (instance != null ? instance : new V1TypedObjectReference());
    if (instance != null) {
          this.withApiGroup(instance.getApiGroup());
          this.withKind(instance.getKind());
          this.withName(instance.getName());
          this.withNamespace(instance.getNamespace());
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
  
  public String getKind() {
    return this.kind;
  }
  
  public A withKind(String kind) {
    this.kind = kind;
    return (A) this;
  }
  
  public boolean hasKind() {
    return this.kind != null;
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
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1TypedObjectReferenceFluent that = (V1TypedObjectReferenceFluent) o;
    if (!java.util.Objects.equals(apiGroup, that.apiGroup)) return false;
    if (!java.util.Objects.equals(kind, that.kind)) return false;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(namespace, that.namespace)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(apiGroup,  kind,  name,  namespace,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiGroup != null) { sb.append("apiGroup:"); sb.append(apiGroup + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (namespace != null) { sb.append("namespace:"); sb.append(namespace); }
    sb.append("}");
    return sb.toString();
  }
  

}