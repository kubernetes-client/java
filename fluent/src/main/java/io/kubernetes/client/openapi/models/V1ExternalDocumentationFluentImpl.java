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

import io.kubernetes.client.fluent.BaseFluent;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1ExternalDocumentationFluentImpl<A extends V1ExternalDocumentationFluent<A>>
    extends BaseFluent<A> implements V1ExternalDocumentationFluent<A> {
  public V1ExternalDocumentationFluentImpl() {}

  public V1ExternalDocumentationFluentImpl(
      io.kubernetes.client.openapi.models.V1ExternalDocumentation instance) {
    this.withDescription(instance.getDescription());

    this.withUrl(instance.getUrl());
  }

  private String description;
  private java.lang.String url;

  public java.lang.String getDescription() {
    return this.description;
  }

  public A withDescription(java.lang.String description) {
    this.description = description;
    return (A) this;
  }

  public Boolean hasDescription() {
    return this.description != null;
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

  public boolean equals(Object o) {
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

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (description != null) {
      sb.append("description:");
      sb.append(description + ",");
    }
    if (url != null) {
      sb.append("url:");
      sb.append(url);
    }
    sb.append("}");
    return sb.toString();
  }
}
