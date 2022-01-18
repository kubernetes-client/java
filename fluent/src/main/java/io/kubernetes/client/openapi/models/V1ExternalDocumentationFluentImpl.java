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
public class V1ExternalDocumentationFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1ExternalDocumentationFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1ExternalDocumentationFluent<A> {
  public V1ExternalDocumentationFluentImpl() {}

  public V1ExternalDocumentationFluentImpl(
      io.kubernetes.client.openapi.models.V1ExternalDocumentation instance) {
    this.withDescription(instance.getDescription());

    this.withUrl(instance.getUrl());
  }

  private java.lang.String description;
  private java.lang.String url;

  public java.lang.String getDescription() {
    return this.description;
  }

  public A withDescription(java.lang.String description) {
    this.description = description;
    return (A) this;
  }

  public java.lang.Boolean hasDescription() {
    return this.description != null;
  }

  /** Method is deprecated. use withDescription instead. */
  @java.lang.Deprecated
  public A withNewDescription(java.lang.String original) {
    return (A) withDescription(new String(original));
  }

  public java.lang.String getUrl() {
    return this.url;
  }

  public A withUrl(java.lang.String url) {
    this.url = url;
    return (A) this;
  }

  public java.lang.Boolean hasUrl() {
    return this.url != null;
  }

  /** Method is deprecated. use withUrl instead. */
  @java.lang.Deprecated
  public A withNewUrl(java.lang.String original) {
    return (A) withUrl(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ExternalDocumentationFluentImpl that = (V1ExternalDocumentationFluentImpl) o;
    if (description != null ? !description.equals(that.description) : that.description != null)
      return false;
    if (url != null ? !url.equals(that.url) : that.url != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(description, url, super.hashCode());
  }
}
