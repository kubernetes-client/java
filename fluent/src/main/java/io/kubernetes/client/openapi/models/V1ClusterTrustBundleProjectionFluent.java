package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;
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
public class V1ClusterTrustBundleProjectionFluent<A extends io.kubernetes.client.openapi.models.V1ClusterTrustBundleProjectionFluent<A>> extends BaseFluent<A>{

  private V1LabelSelectorBuilder labelSelector;
  private String name;
  private Boolean optional;
  private String path;
  private String signerName;

  public V1ClusterTrustBundleProjectionFluent() {
  }
  
  public V1ClusterTrustBundleProjectionFluent(V1ClusterTrustBundleProjection instance) {
    this.copyInstance(instance);
  }

  public V1LabelSelector buildLabelSelector() {
    return this.labelSelector != null ? this.labelSelector.build() : null;
  }
  
  protected void copyInstance(V1ClusterTrustBundleProjection instance) {
    instance = instance != null ? instance : new V1ClusterTrustBundleProjection();
    if (instance != null) {
        this.withLabelSelector(instance.getLabelSelector());
        this.withName(instance.getName());
        this.withOptional(instance.getOptional());
        this.withPath(instance.getPath());
        this.withSignerName(instance.getSignerName());
    }
  }
  
  public LabelSelectorNested<A> editLabelSelector() {
    return this.withNewLabelSelectorLike(Optional.ofNullable(this.buildLabelSelector()).orElse(null));
  }
  
  public LabelSelectorNested<A> editOrNewLabelSelector() {
    return this.withNewLabelSelectorLike(Optional.ofNullable(this.buildLabelSelector()).orElse(new V1LabelSelectorBuilder().build()));
  }
  
  public LabelSelectorNested<A> editOrNewLabelSelectorLike(V1LabelSelector item) {
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
    V1ClusterTrustBundleProjectionFluent that = (V1ClusterTrustBundleProjectionFluent) o;
    if (!(Objects.equals(labelSelector, that.labelSelector))) {
      return false;
    }
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(optional, that.optional))) {
      return false;
    }
    if (!(Objects.equals(path, that.path))) {
      return false;
    }
    if (!(Objects.equals(signerName, that.signerName))) {
      return false;
    }
    return true;
  }
  
  public String getName() {
    return this.name;
  }
  
  public Boolean getOptional() {
    return this.optional;
  }
  
  public String getPath() {
    return this.path;
  }
  
  public String getSignerName() {
    return this.signerName;
  }
  
  public boolean hasLabelSelector() {
    return this.labelSelector != null;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public boolean hasOptional() {
    return this.optional != null;
  }
  
  public boolean hasPath() {
    return this.path != null;
  }
  
  public boolean hasSignerName() {
    return this.signerName != null;
  }
  
  public int hashCode() {
    return Objects.hash(labelSelector, name, optional, path, signerName);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
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
    if (!(optional == null)) {
        sb.append("optional:");
        sb.append(optional);
        sb.append(",");
    }
    if (!(path == null)) {
        sb.append("path:");
        sb.append(path);
        sb.append(",");
    }
    if (!(signerName == null)) {
        sb.append("signerName:");
        sb.append(signerName);
    }
    sb.append("}");
    return sb.toString();
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
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public LabelSelectorNested<A> withNewLabelSelector() {
    return new LabelSelectorNested(null);
  }
  
  public LabelSelectorNested<A> withNewLabelSelectorLike(V1LabelSelector item) {
    return new LabelSelectorNested(item);
  }
  
  public A withOptional() {
    return withOptional(true);
  }
  
  public A withOptional(Boolean optional) {
    this.optional = optional;
    return (A) this;
  }
  
  public A withPath(String path) {
    this.path = path;
    return (A) this;
  }
  
  public A withSignerName(String signerName) {
    this.signerName = signerName;
    return (A) this;
  }
  public class LabelSelectorNested<N> extends V1LabelSelectorFluent<LabelSelectorNested<N>> implements Nested<N>{
  
    V1LabelSelectorBuilder builder;
  
    LabelSelectorNested(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
  
    public N and() {
      return (N) V1ClusterTrustBundleProjectionFluent.this.withLabelSelector(builder.build());
    }
    
    public N endLabelSelector() {
      return and();
    }
    
  }
}