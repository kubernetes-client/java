package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;

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
  private V1FieldSelectorAttributesBuilder fieldSelector;
  private String group;
  private V1LabelSelectorAttributesBuilder labelSelector;
  private String name;
  private String namespace;
  private String resource;
  private String subresource;
  private String verb;
  private String version;
  
  protected void copyInstance(V1ResourceAttributes instance) {
    instance = (instance != null ? instance : new V1ResourceAttributes());
    if (instance != null) {
          this.withFieldSelector(instance.getFieldSelector());
          this.withGroup(instance.getGroup());
          this.withLabelSelector(instance.getLabelSelector());
          this.withName(instance.getName());
          this.withNamespace(instance.getNamespace());
          this.withResource(instance.getResource());
          this.withSubresource(instance.getSubresource());
          this.withVerb(instance.getVerb());
          this.withVersion(instance.getVersion());
        }
  }
  
  public V1FieldSelectorAttributes buildFieldSelector() {
    return this.fieldSelector != null ? this.fieldSelector.build() : null;
  }
  
  public A withFieldSelector(V1FieldSelectorAttributes fieldSelector) {
    this._visitables.remove("fieldSelector");
    if (fieldSelector != null) {
        this.fieldSelector = new V1FieldSelectorAttributesBuilder(fieldSelector);
        this._visitables.get("fieldSelector").add(this.fieldSelector);
    } else {
        this.fieldSelector = null;
        this._visitables.get("fieldSelector").remove(this.fieldSelector);
    }
    return (A) this;
  }
  
  public boolean hasFieldSelector() {
    return this.fieldSelector != null;
  }
  
  public FieldSelectorNested<A> withNewFieldSelector() {
    return new FieldSelectorNested(null);
  }
  
  public FieldSelectorNested<A> withNewFieldSelectorLike(V1FieldSelectorAttributes item) {
    return new FieldSelectorNested(item);
  }
  
  public FieldSelectorNested<A> editFieldSelector() {
    return withNewFieldSelectorLike(java.util.Optional.ofNullable(buildFieldSelector()).orElse(null));
  }
  
  public FieldSelectorNested<A> editOrNewFieldSelector() {
    return withNewFieldSelectorLike(java.util.Optional.ofNullable(buildFieldSelector()).orElse(new V1FieldSelectorAttributesBuilder().build()));
  }
  
  public FieldSelectorNested<A> editOrNewFieldSelectorLike(V1FieldSelectorAttributes item) {
    return withNewFieldSelectorLike(java.util.Optional.ofNullable(buildFieldSelector()).orElse(item));
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
  
  public V1LabelSelectorAttributes buildLabelSelector() {
    return this.labelSelector != null ? this.labelSelector.build() : null;
  }
  
  public A withLabelSelector(V1LabelSelectorAttributes labelSelector) {
    this._visitables.remove("labelSelector");
    if (labelSelector != null) {
        this.labelSelector = new V1LabelSelectorAttributesBuilder(labelSelector);
        this._visitables.get("labelSelector").add(this.labelSelector);
    } else {
        this.labelSelector = null;
        this._visitables.get("labelSelector").remove(this.labelSelector);
    }
    return (A) this;
  }
  
  public boolean hasLabelSelector() {
    return this.labelSelector != null;
  }
  
  public LabelSelectorNested<A> withNewLabelSelector() {
    return new LabelSelectorNested(null);
  }
  
  public LabelSelectorNested<A> withNewLabelSelectorLike(V1LabelSelectorAttributes item) {
    return new LabelSelectorNested(item);
  }
  
  public LabelSelectorNested<A> editLabelSelector() {
    return withNewLabelSelectorLike(java.util.Optional.ofNullable(buildLabelSelector()).orElse(null));
  }
  
  public LabelSelectorNested<A> editOrNewLabelSelector() {
    return withNewLabelSelectorLike(java.util.Optional.ofNullable(buildLabelSelector()).orElse(new V1LabelSelectorAttributesBuilder().build()));
  }
  
  public LabelSelectorNested<A> editOrNewLabelSelectorLike(V1LabelSelectorAttributes item) {
    return withNewLabelSelectorLike(java.util.Optional.ofNullable(buildLabelSelector()).orElse(item));
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
    if (!java.util.Objects.equals(fieldSelector, that.fieldSelector)) return false;
    if (!java.util.Objects.equals(group, that.group)) return false;
    if (!java.util.Objects.equals(labelSelector, that.labelSelector)) return false;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(namespace, that.namespace)) return false;
    if (!java.util.Objects.equals(resource, that.resource)) return false;
    if (!java.util.Objects.equals(subresource, that.subresource)) return false;
    if (!java.util.Objects.equals(verb, that.verb)) return false;
    if (!java.util.Objects.equals(version, that.version)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(fieldSelector,  group,  labelSelector,  name,  namespace,  resource,  subresource,  verb,  version,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (fieldSelector != null) { sb.append("fieldSelector:"); sb.append(fieldSelector + ","); }
    if (group != null) { sb.append("group:"); sb.append(group + ","); }
    if (labelSelector != null) { sb.append("labelSelector:"); sb.append(labelSelector + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (namespace != null) { sb.append("namespace:"); sb.append(namespace + ","); }
    if (resource != null) { sb.append("resource:"); sb.append(resource + ","); }
    if (subresource != null) { sb.append("subresource:"); sb.append(subresource + ","); }
    if (verb != null) { sb.append("verb:"); sb.append(verb + ","); }
    if (version != null) { sb.append("version:"); sb.append(version); }
    sb.append("}");
    return sb.toString();
  }
  public class FieldSelectorNested<N> extends V1FieldSelectorAttributesFluent<FieldSelectorNested<N>> implements Nested<N>{
    FieldSelectorNested(V1FieldSelectorAttributes item) {
      this.builder = new V1FieldSelectorAttributesBuilder(this, item);
    }
    V1FieldSelectorAttributesBuilder builder;
    
    public N and() {
      return (N) V1ResourceAttributesFluent.this.withFieldSelector(builder.build());
    }
    
    public N endFieldSelector() {
      return and();
    }
    
  
  }
  public class LabelSelectorNested<N> extends V1LabelSelectorAttributesFluent<LabelSelectorNested<N>> implements Nested<N>{
    LabelSelectorNested(V1LabelSelectorAttributes item) {
      this.builder = new V1LabelSelectorAttributesBuilder(this, item);
    }
    V1LabelSelectorAttributesBuilder builder;
    
    public N and() {
      return (N) V1ResourceAttributesFluent.this.withLabelSelector(builder.build());
    }
    
    public N endLabelSelector() {
      return and();
    }
    
  
  }

}