package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ResourceAttributesFluent<A extends io.kubernetes.client.openapi.models.V1ResourceAttributesFluent<A>> extends BaseFluent<A>{

  private V1FieldSelectorAttributesBuilder fieldSelector;
  private String group;
  private V1LabelSelectorAttributesBuilder labelSelector;
  private String name;
  private String namespace;
  private String resource;
  private String subresource;
  private String verb;
  private String version;

  public V1ResourceAttributesFluent() {
  }
  
  public V1ResourceAttributesFluent(V1ResourceAttributes instance) {
    this.copyInstance(instance);
  }

  public V1FieldSelectorAttributes buildFieldSelector() {
    return this.fieldSelector != null ? this.fieldSelector.build() : null;
  }
  
  public V1LabelSelectorAttributes buildLabelSelector() {
    return this.labelSelector != null ? this.labelSelector.build() : null;
  }
  
  protected void copyInstance(V1ResourceAttributes instance) {
    instance = instance != null ? instance : new V1ResourceAttributes();
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
  
  public FieldSelectorNested<A> editFieldSelector() {
    return this.withNewFieldSelectorLike(Optional.ofNullable(this.buildFieldSelector()).orElse(null));
  }
  
  public LabelSelectorNested<A> editLabelSelector() {
    return this.withNewLabelSelectorLike(Optional.ofNullable(this.buildLabelSelector()).orElse(null));
  }
  
  public FieldSelectorNested<A> editOrNewFieldSelector() {
    return this.withNewFieldSelectorLike(Optional.ofNullable(this.buildFieldSelector()).orElse(new V1FieldSelectorAttributesBuilder().build()));
  }
  
  public FieldSelectorNested<A> editOrNewFieldSelectorLike(V1FieldSelectorAttributes item) {
    return this.withNewFieldSelectorLike(Optional.ofNullable(this.buildFieldSelector()).orElse(item));
  }
  
  public LabelSelectorNested<A> editOrNewLabelSelector() {
    return this.withNewLabelSelectorLike(Optional.ofNullable(this.buildLabelSelector()).orElse(new V1LabelSelectorAttributesBuilder().build()));
  }
  
  public LabelSelectorNested<A> editOrNewLabelSelectorLike(V1LabelSelectorAttributes item) {
    return this.withNewLabelSelectorLike(Optional.ofNullable(this.buildLabelSelector()).orElse(item));
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
    V1ResourceAttributesFluent that = (V1ResourceAttributesFluent) o;
    if (!(Objects.equals(fieldSelector, that.fieldSelector))) {
      return false;
    }
    if (!(Objects.equals(group, that.group))) {
      return false;
    }
    if (!(Objects.equals(labelSelector, that.labelSelector))) {
      return false;
    }
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(namespace, that.namespace))) {
      return false;
    }
    if (!(Objects.equals(resource, that.resource))) {
      return false;
    }
    if (!(Objects.equals(subresource, that.subresource))) {
      return false;
    }
    if (!(Objects.equals(verb, that.verb))) {
      return false;
    }
    if (!(Objects.equals(version, that.version))) {
      return false;
    }
    return true;
  }
  
  public String getGroup() {
    return this.group;
  }
  
  public String getName() {
    return this.name;
  }
  
  public String getNamespace() {
    return this.namespace;
  }
  
  public String getResource() {
    return this.resource;
  }
  
  public String getSubresource() {
    return this.subresource;
  }
  
  public String getVerb() {
    return this.verb;
  }
  
  public String getVersion() {
    return this.version;
  }
  
  public boolean hasFieldSelector() {
    return this.fieldSelector != null;
  }
  
  public boolean hasGroup() {
    return this.group != null;
  }
  
  public boolean hasLabelSelector() {
    return this.labelSelector != null;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public boolean hasNamespace() {
    return this.namespace != null;
  }
  
  public boolean hasResource() {
    return this.resource != null;
  }
  
  public boolean hasSubresource() {
    return this.subresource != null;
  }
  
  public boolean hasVerb() {
    return this.verb != null;
  }
  
  public boolean hasVersion() {
    return this.version != null;
  }
  
  public int hashCode() {
    return Objects.hash(fieldSelector, group, labelSelector, name, namespace, resource, subresource, verb, version);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(fieldSelector == null)) {
        sb.append("fieldSelector:");
        sb.append(fieldSelector);
        sb.append(",");
    }
    if (!(group == null)) {
        sb.append("group:");
        sb.append(group);
        sb.append(",");
    }
    if (!(labelSelector == null)) {
        sb.append("labelSelector:");
        sb.append(labelSelector);
        sb.append(",");
    }
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
        sb.append(",");
    }
    if (!(namespace == null)) {
        sb.append("namespace:");
        sb.append(namespace);
        sb.append(",");
    }
    if (!(resource == null)) {
        sb.append("resource:");
        sb.append(resource);
        sb.append(",");
    }
    if (!(subresource == null)) {
        sb.append("subresource:");
        sb.append(subresource);
        sb.append(",");
    }
    if (!(verb == null)) {
        sb.append("verb:");
        sb.append(verb);
        sb.append(",");
    }
    if (!(version == null)) {
        sb.append("version:");
        sb.append(version);
    }
    sb.append("}");
    return sb.toString();
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
  
  public A withGroup(String group) {
    this.group = group;
    return (A) this;
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
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public A withNamespace(String namespace) {
    this.namespace = namespace;
    return (A) this;
  }
  
  public FieldSelectorNested<A> withNewFieldSelector() {
    return new FieldSelectorNested(null);
  }
  
  public FieldSelectorNested<A> withNewFieldSelectorLike(V1FieldSelectorAttributes item) {
    return new FieldSelectorNested(item);
  }
  
  public LabelSelectorNested<A> withNewLabelSelector() {
    return new LabelSelectorNested(null);
  }
  
  public LabelSelectorNested<A> withNewLabelSelectorLike(V1LabelSelectorAttributes item) {
    return new LabelSelectorNested(item);
  }
  
  public A withResource(String resource) {
    this.resource = resource;
    return (A) this;
  }
  
  public A withSubresource(String subresource) {
    this.subresource = subresource;
    return (A) this;
  }
  
  public A withVerb(String verb) {
    this.verb = verb;
    return (A) this;
  }
  
  public A withVersion(String version) {
    this.version = version;
    return (A) this;
  }
  public class FieldSelectorNested<N> extends V1FieldSelectorAttributesFluent<FieldSelectorNested<N>> implements Nested<N>{
  
    V1FieldSelectorAttributesBuilder builder;
  
    FieldSelectorNested(V1FieldSelectorAttributes item) {
      this.builder = new V1FieldSelectorAttributesBuilder(this, item);
    }
  
    public N and() {
      return (N) V1ResourceAttributesFluent.this.withFieldSelector(builder.build());
    }
    
    public N endFieldSelector() {
      return and();
    }
    
  }
  public class LabelSelectorNested<N> extends V1LabelSelectorAttributesFluent<LabelSelectorNested<N>> implements Nested<N>{
  
    V1LabelSelectorAttributesBuilder builder;
  
    LabelSelectorNested(V1LabelSelectorAttributes item) {
      this.builder = new V1LabelSelectorAttributesBuilder(this, item);
    }
  
    public N and() {
      return (N) V1ResourceAttributesFluent.this.withLabelSelector(builder.build());
    }
    
    public N endLabelSelector() {
      return and();
    }
    
  }
}