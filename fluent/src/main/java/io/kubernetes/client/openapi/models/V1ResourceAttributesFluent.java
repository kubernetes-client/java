package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ResourceAttributesFluent<A extends V1ResourceAttributesFluent<A>> extends BaseFluent<A>{
  public V1ResourceAttributesFluent() {
  }
  
  public V1ResourceAttributesFluent(V1ResourceAttributes instance) {
    this.copyInstance(instance);
  }
  private String group;
  private String name;
  private String namespace;
  private String resource;
  private String subresource;
  private String verb;
  private String version;
  
  protected void copyInstance(V1ResourceAttributes instance) {
    instance = (instance != null ? instance : new V1ResourceAttributes());
    if (instance != null) {
          this.withGroup(instance.getGroup());
          this.withName(instance.getName());
          this.withNamespace(instance.getNamespace());
          this.withResource(instance.getResource());
          this.withSubresource(instance.getSubresource());
          this.withVerb(instance.getVerb());
          this.withVersion(instance.getVersion());
        }
  }
  
  public String getGroup() {
    return this.group;
  }
  
  public A withGroup(String group) {
    this.group = group;
    return (A) this;
  }
  
  public boolean hasGroup() {
    return this.group != null;
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
  
  public String getSubresource() {
    return this.subresource;
  }
  
  public A withSubresource(String subresource) {
    this.subresource = subresource;
    return (A) this;
  }
  
  public boolean hasSubresource() {
    return this.subresource != null;
  }
  
  public String getVerb() {
    return this.verb;
  }
  
  public A withVerb(String verb) {
    this.verb = verb;
    return (A) this;
  }
  
  public boolean hasVerb() {
    return this.verb != null;
  }
  
  public String getVersion() {
    return this.version;
  }
  
  public A withVersion(String version) {
    this.version = version;
    return (A) this;
  }
  
  public boolean hasVersion() {
    return this.version != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ResourceAttributesFluent that = (V1ResourceAttributesFluent) o;
    if (!java.util.Objects.equals(group, that.group)) return false;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(namespace, that.namespace)) return false;
    if (!java.util.Objects.equals(resource, that.resource)) return false;
    if (!java.util.Objects.equals(subresource, that.subresource)) return false;
    if (!java.util.Objects.equals(verb, that.verb)) return false;
    if (!java.util.Objects.equals(version, that.version)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(group,  name,  namespace,  resource,  subresource,  verb,  version,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (group != null) { sb.append("group:"); sb.append(group + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (namespace != null) { sb.append("namespace:"); sb.append(namespace + ","); }
    if (resource != null) { sb.append("resource:"); sb.append(resource + ","); }
    if (subresource != null) { sb.append("subresource:"); sb.append(subresource + ","); }
    if (verb != null) { sb.append("verb:"); sb.append(verb + ","); }
    if (version != null) { sb.append("version:"); sb.append(version); }
    sb.append("}");
    return sb.toString();
  }
  

}