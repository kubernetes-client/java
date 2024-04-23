package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ClusterTrustBundleProjectionFluent<A extends V1ClusterTrustBundleProjectionFluent<A>> extends BaseFluent<A>{
  public V1ClusterTrustBundleProjectionFluent() {
  }
  
  public V1ClusterTrustBundleProjectionFluent(V1ClusterTrustBundleProjection instance) {
    this.copyInstance(instance);
  }
  private V1LabelSelectorBuilder labelSelector;
  private String name;
  private Boolean optional;
  private String path;
  private String signerName;
  
  protected void copyInstance(V1ClusterTrustBundleProjection instance) {
    instance = (instance != null ? instance : new V1ClusterTrustBundleProjection());
    if (instance != null) {
          this.withLabelSelector(instance.getLabelSelector());
          this.withName(instance.getName());
          this.withOptional(instance.getOptional());
          this.withPath(instance.getPath());
          this.withSignerName(instance.getSignerName());
        }
  }
  
  public V1LabelSelector buildLabelSelector() {
    return this.labelSelector != null ? this.labelSelector.build() : null;
  }
  
  public A withLabelSelector(V1LabelSelector labelSelector) {
    this._visitables.remove("labelSelector");
    if (labelSelector != null) {
        this.labelSelector = new V1LabelSelectorBuilder(labelSelector);
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
  
  public LabelSelectorNested<A> withNewLabelSelectorLike(V1LabelSelector item) {
    return new LabelSelectorNested(item);
  }
  
  public LabelSelectorNested<A> editLabelSelector() {
    return withNewLabelSelectorLike(java.util.Optional.ofNullable(buildLabelSelector()).orElse(null));
  }
  
  public LabelSelectorNested<A> editOrNewLabelSelector() {
    return withNewLabelSelectorLike(java.util.Optional.ofNullable(buildLabelSelector()).orElse(new V1LabelSelectorBuilder().build()));
  }
  
  public LabelSelectorNested<A> editOrNewLabelSelectorLike(V1LabelSelector item) {
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
  
  public Boolean getOptional() {
    return this.optional;
  }
  
  public A withOptional(Boolean optional) {
    this.optional = optional;
    return (A) this;
  }
  
  public boolean hasOptional() {
    return this.optional != null;
  }
  
  public String getPath() {
    return this.path;
  }
  
  public A withPath(String path) {
    this.path = path;
    return (A) this;
  }
  
  public boolean hasPath() {
    return this.path != null;
  }
  
  public String getSignerName() {
    return this.signerName;
  }
  
  public A withSignerName(String signerName) {
    this.signerName = signerName;
    return (A) this;
  }
  
  public boolean hasSignerName() {
    return this.signerName != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ClusterTrustBundleProjectionFluent that = (V1ClusterTrustBundleProjectionFluent) o;
    if (!java.util.Objects.equals(labelSelector, that.labelSelector)) return false;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(optional, that.optional)) return false;
    if (!java.util.Objects.equals(path, that.path)) return false;
    if (!java.util.Objects.equals(signerName, that.signerName)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(labelSelector,  name,  optional,  path,  signerName,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (labelSelector != null) { sb.append("labelSelector:"); sb.append(labelSelector + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (optional != null) { sb.append("optional:"); sb.append(optional + ","); }
    if (path != null) { sb.append("path:"); sb.append(path + ","); }
    if (signerName != null) { sb.append("signerName:"); sb.append(signerName); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withOptional() {
    return withOptional(true);
  }
  public class LabelSelectorNested<N> extends V1LabelSelectorFluent<LabelSelectorNested<N>> implements Nested<N>{
    LabelSelectorNested(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
    V1LabelSelectorBuilder builder;
    
    public N and() {
      return (N) V1ClusterTrustBundleProjectionFluent.this.withLabelSelector(builder.build());
    }
    
    public N endLabelSelector() {
      return and();
    }
    
  
  }

}