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
public class V1NonResourceAttributesFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1NonResourceAttributesFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1NonResourceAttributesFluent<A> {
  public V1NonResourceAttributesFluentImpl() {}

  public V1NonResourceAttributesFluentImpl(
      io.kubernetes.client.openapi.models.V1NonResourceAttributes instance) {
    this.withPath(instance.getPath());

    this.withVerb(instance.getVerb());
  }

  private java.lang.String path;
  private java.lang.String verb;

  public java.lang.String getPath() {
    return this.path;
  }

  public A withPath(java.lang.String path) {
    this.path = path;
    return (A) this;
  }

  public java.lang.Boolean hasPath() {
    return this.path != null;
  }

  /** Method is deprecated. use withPath instead. */
  @java.lang.Deprecated
  public A withNewPath(java.lang.String original) {
    return (A) withPath(new String(original));
  }

  public java.lang.String getVerb() {
    return this.verb;
  }

  public A withVerb(java.lang.String verb) {
    this.verb = verb;
    return (A) this;
  }

  public java.lang.Boolean hasVerb() {
    return this.verb != null;
  }

  /** Method is deprecated. use withVerb instead. */
  @java.lang.Deprecated
  public A withNewVerb(java.lang.String original) {
    return (A) withVerb(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1NonResourceAttributesFluentImpl that = (V1NonResourceAttributesFluentImpl) o;
    if (path != null ? !path.equals(that.path) : that.path != null) return false;
    if (verb != null ? !verb.equals(that.verb) : that.verb != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(path, verb, super.hashCode());
  }
}
