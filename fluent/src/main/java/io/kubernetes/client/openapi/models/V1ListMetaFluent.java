package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ListMetaFluent<A extends io.kubernetes.client.openapi.models.V1ListMetaFluent<A>> extends BaseFluent<A>{

  private String _continue;
  private Long remainingItemCount;
  private String resourceVersion;
  private String selfLink;

  public V1ListMetaFluent() {
  }
  
  public V1ListMetaFluent(V1ListMeta instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1ListMeta instance) {
    instance = instance != null ? instance : new V1ListMeta();
    if (instance != null) {
        this.withContinue(instance.getContinue());
        this.withRemainingItemCount(instance.getRemainingItemCount());
        this.withResourceVersion(instance.getResourceVersion());
        this.withSelfLink(instance.getSelfLink());
    }
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
    V1ListMetaFluent that = (V1ListMetaFluent) o;
    if (!(Objects.equals(_continue, that._continue))) {
      return false;
    }
    if (!(Objects.equals(remainingItemCount, that.remainingItemCount))) {
      return false;
    }
    if (!(Objects.equals(resourceVersion, that.resourceVersion))) {
      return false;
    }
    if (!(Objects.equals(selfLink, that.selfLink))) {
      return false;
    }
    return true;
  }
  
  public String getContinue() {
    return this._continue;
  }
  
  public Long getRemainingItemCount() {
    return this.remainingItemCount;
  }
  
  public String getResourceVersion() {
    return this.resourceVersion;
  }
  
  public String getSelfLink() {
    return this.selfLink;
  }
  
  public boolean hasContinue() {
    return this._continue != null;
  }
  
  public boolean hasRemainingItemCount() {
    return this.remainingItemCount != null;
  }
  
  public boolean hasResourceVersion() {
    return this.resourceVersion != null;
  }
  
  public boolean hasSelfLink() {
    return this.selfLink != null;
  }
  
  public int hashCode() {
    return Objects.hash(_continue, remainingItemCount, resourceVersion, selfLink);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(_continue == null)) {
        sb.append("_continue:");
        sb.append(_continue);
        sb.append(",");
    }
    if (!(remainingItemCount == null)) {
        sb.append("remainingItemCount:");
        sb.append(remainingItemCount);
        sb.append(",");
    }
    if (!(resourceVersion == null)) {
        sb.append("resourceVersion:");
        sb.append(resourceVersion);
        sb.append(",");
    }
    if (!(selfLink == null)) {
        sb.append("selfLink:");
        sb.append(selfLink);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withContinue(String _continue) {
    this._continue = _continue;
    return (A) this;
  }
  
  public A withRemainingItemCount(Long remainingItemCount) {
    this.remainingItemCount = remainingItemCount;
    return (A) this;
  }
  
  public A withResourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
    return (A) this;
  }
  
  public A withSelfLink(String selfLink) {
    this.selfLink = selfLink;
    return (A) this;
  }
  
}