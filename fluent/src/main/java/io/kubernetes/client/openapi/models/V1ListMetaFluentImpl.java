package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1ListMetaFluentImpl<A extends V1ListMetaFluent<A>> extends BaseFluent<A> implements V1ListMetaFluent<A>{
  public V1ListMetaFluentImpl() {
  }
  public V1ListMetaFluentImpl(V1ListMeta instance) {
    if (instance != null) {
      this.withContinue(instance.getContinue());
      this.withRemainingItemCount(instance.getRemainingItemCount());
      this.withResourceVersion(instance.getResourceVersion());
      this.withSelfLink(instance.getSelfLink());
    }
  }
  private String _continue;
  private Long remainingItemCount;
  private String resourceVersion;
  private String selfLink;
  public String getContinue() {
    return this._continue;
  }
  public A withContinue(String _continue) {
    this._continue=_continue; return (A) this;
  }
  public Boolean hasContinue() {
    return this._continue != null;
  }
  public Long getRemainingItemCount() {
    return this.remainingItemCount;
  }
  public A withRemainingItemCount(Long remainingItemCount) {
    this.remainingItemCount=remainingItemCount; return (A) this;
  }
  public Boolean hasRemainingItemCount() {
    return this.remainingItemCount != null;
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
  public String getSelfLink() {
    return this.selfLink;
  }
  public A withSelfLink(String selfLink) {
    this.selfLink=selfLink; return (A) this;
  }
  public Boolean hasSelfLink() {
    return this.selfLink != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ListMetaFluentImpl that = (V1ListMetaFluentImpl) o;
    if (!java.util.Objects.equals(_continue, that._continue)) return false;

    if (!java.util.Objects.equals(remainingItemCount, that.remainingItemCount)) return false;

    if (!java.util.Objects.equals(resourceVersion, that.resourceVersion)) return false;

    if (!java.util.Objects.equals(selfLink, that.selfLink)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(_continue,  remainingItemCount,  resourceVersion,  selfLink,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (_continue != null) { sb.append("_continue:"); sb.append(_continue + ","); }
    if (remainingItemCount != null) { sb.append("remainingItemCount:"); sb.append(remainingItemCount + ","); }
    if (resourceVersion != null) { sb.append("resourceVersion:"); sb.append(resourceVersion + ","); }
    if (selfLink != null) { sb.append("selfLink:"); sb.append(selfLink); }
    sb.append("}");
    return sb.toString();
  }
  
}