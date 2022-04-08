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

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;

/** Generated */
public interface V1IngressRuleFluent<A extends V1IngressRuleFluent<A>> extends Fluent<A> {
  public String getHost();

  public A withHost(java.lang.String host);

  public Boolean hasHost();

  /**
   * This method has been deprecated, please use method buildHttp instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1HTTPIngressRuleValue getHttp();

  public io.kubernetes.client.openapi.models.V1HTTPIngressRuleValue buildHttp();

  public A withHttp(io.kubernetes.client.openapi.models.V1HTTPIngressRuleValue http);

  public java.lang.Boolean hasHttp();

  public V1IngressRuleFluent.HttpNested<A> withNewHttp();

  public io.kubernetes.client.openapi.models.V1IngressRuleFluent.HttpNested<A> withNewHttpLike(
      io.kubernetes.client.openapi.models.V1HTTPIngressRuleValue item);

  public io.kubernetes.client.openapi.models.V1IngressRuleFluent.HttpNested<A> editHttp();

  public io.kubernetes.client.openapi.models.V1IngressRuleFluent.HttpNested<A> editOrNewHttp();

  public io.kubernetes.client.openapi.models.V1IngressRuleFluent.HttpNested<A> editOrNewHttpLike(
      io.kubernetes.client.openapi.models.V1HTTPIngressRuleValue item);

  public interface HttpNested<N>
      extends Nested<N>, V1HTTPIngressRuleValueFluent<V1IngressRuleFluent.HttpNested<N>> {
    public N and();

    public N endHttp();
  }
}
