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
public class V1SelfSubjectRulesReviewSpecFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1SelfSubjectRulesReviewSpecFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1SelfSubjectRulesReviewSpecFluent<A> {
  public V1SelfSubjectRulesReviewSpecFluentImpl() {}

  public V1SelfSubjectRulesReviewSpecFluentImpl(
      io.kubernetes.client.openapi.models.V1SelfSubjectRulesReviewSpec instance) {
    this.withNamespace(instance.getNamespace());
  }

  private java.lang.String namespace;

  public java.lang.String getNamespace() {
    return this.namespace;
  }

  public A withNamespace(java.lang.String namespace) {
    this.namespace = namespace;
    return (A) this;
  }

  public java.lang.Boolean hasNamespace() {
    return this.namespace != null;
  }

  /** Method is deprecated. use withNamespace instead. */
  @java.lang.Deprecated
  public A withNewNamespace(java.lang.String original) {
    return (A) withNamespace(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1SelfSubjectRulesReviewSpecFluentImpl that = (V1SelfSubjectRulesReviewSpecFluentImpl) o;
    if (namespace != null ? !namespace.equals(that.namespace) : that.namespace != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(namespace, super.hashCode());
  }
}
