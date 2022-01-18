/*
Copyright 2022 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

/** Generated */
public class V1ListMetaFluentImpl<A extends io.kubernetes.client.openapi.models.V1ListMetaFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1ListMetaFluent<A> {
  public V1ListMetaFluentImpl() {}

  public V1ListMetaFluentImpl(io.kubernetes.client.openapi.models.V1ListMeta instance) {
    this.withContinue(instance.getContinue());

    this.withRemainingItemCount(instance.getRemainingItemCount());

    this.withResourceVersion(instance.getResourceVersion());

    this.withSelfLink(instance.getSelfLink());
  }

  private java.lang.String _continue;
  private java.lang.Long remainingItemCount;
  private java.lang.String resourceVersion;
  private java.lang.String selfLink;

  public java.lang.String getContinue() {
    return this._continue;
  }

  public A withContinue(java.lang.String _continue) {
    this._continue = _continue;
    return (A) this;
  }

  public java.lang.Boolean hasContinue() {
    return this._continue != null;
  }

  /** Method is deprecated. use withContinue instead. */
  @java.lang.Deprecated
  public A withNewContinue(java.lang.String original) {
    return (A) withContinue(new String(original));
  }

  public java.lang.Long getRemainingItemCount() {
    return this.remainingItemCount;
  }

  public A withRemainingItemCount(java.lang.Long remainingItemCount) {
    this.remainingItemCount = remainingItemCount;
    return (A) this;
  }

  public java.lang.Boolean hasRemainingItemCount() {
    return this.remainingItemCount != null;
  }

  public java.lang.String getResourceVersion() {
    return this.resourceVersion;
  }

  public A withResourceVersion(java.lang.String resourceVersion) {
    this.resourceVersion = resourceVersion;
    return (A) this;
  }

  public java.lang.Boolean hasResourceVersion() {
    return this.resourceVersion != null;
  }

  /** Method is deprecated. use withResourceVersion instead. */
  @java.lang.Deprecated
  public A withNewResourceVersion(java.lang.String original) {
    return (A) withResourceVersion(new String(original));
  }

  public java.lang.String getSelfLink() {
    return this.selfLink;
  }

  public A withSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return (A) this;
  }

  public java.lang.Boolean hasSelfLink() {
    return this.selfLink != null;
  }

  /** Method is deprecated. use withSelfLink instead. */
  @java.lang.Deprecated
  public A withNewSelfLink(java.lang.String original) {
    return (A) withSelfLink(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ListMetaFluentImpl that = (V1ListMetaFluentImpl) o;
    if (_continue != null ? !_continue.equals(that._continue) : that._continue != null)
      return false;
    if (remainingItemCount != null
        ? !remainingItemCount.equals(that.remainingItemCount)
        : that.remainingItemCount != null) return false;
    if (resourceVersion != null
        ? !resourceVersion.equals(that.resourceVersion)
        : that.resourceVersion != null) return false;
    if (selfLink != null ? !selfLink.equals(that.selfLink) : that.selfLink != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        _continue, remainingItemCount, resourceVersion, selfLink, super.hashCode());
  }
}
