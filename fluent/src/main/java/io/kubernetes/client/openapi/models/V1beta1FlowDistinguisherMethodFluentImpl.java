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
public class V1beta1FlowDistinguisherMethodFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1beta1FlowDistinguisherMethodFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1beta1FlowDistinguisherMethodFluent<A> {
  public V1beta1FlowDistinguisherMethodFluentImpl() {}

  public V1beta1FlowDistinguisherMethodFluentImpl(
      io.kubernetes.client.openapi.models.V1beta1FlowDistinguisherMethod instance) {
    this.withType(instance.getType());
  }

  private java.lang.String type;

  public java.lang.String getType() {
    return this.type;
  }

  public A withType(java.lang.String type) {
    this.type = type;
    return (A) this;
  }

  public java.lang.Boolean hasType() {
    return this.type != null;
  }

  /** Method is deprecated. use withType instead. */
  @java.lang.Deprecated
  public A withNewType(java.lang.String original) {
    return (A) withType(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta1FlowDistinguisherMethodFluentImpl that = (V1beta1FlowDistinguisherMethodFluentImpl) o;
    if (type != null ? !type.equals(that.type) : that.type != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(type, super.hashCode());
  }
}
