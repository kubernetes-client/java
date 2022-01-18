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
public interface V1LimitRangeSpecFluent<
        A extends io.kubernetes.client.openapi.models.V1LimitRangeSpecFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public A addToLimits(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1LimitRangeItem item);

  public A setToLimits(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1LimitRangeItem item);

  public A addToLimits(io.kubernetes.client.openapi.models.V1LimitRangeItem... items);

  public A addAllToLimits(
      java.util.Collection<io.kubernetes.client.openapi.models.V1LimitRangeItem> items);

  public A removeFromLimits(io.kubernetes.client.openapi.models.V1LimitRangeItem... items);

  public A removeAllFromLimits(
      java.util.Collection<io.kubernetes.client.openapi.models.V1LimitRangeItem> items);

  public A removeMatchingFromLimits(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LimitRangeItemBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildLimits instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1LimitRangeItem> getLimits();

  public java.util.List<io.kubernetes.client.openapi.models.V1LimitRangeItem> buildLimits();

  public io.kubernetes.client.openapi.models.V1LimitRangeItem buildLimit(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1LimitRangeItem buildFirstLimit();

  public io.kubernetes.client.openapi.models.V1LimitRangeItem buildLastLimit();

  public io.kubernetes.client.openapi.models.V1LimitRangeItem buildMatchingLimit(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LimitRangeItemBuilder>
          predicate);

  public java.lang.Boolean hasMatchingLimit(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LimitRangeItemBuilder>
          predicate);

  public A withLimits(java.util.List<io.kubernetes.client.openapi.models.V1LimitRangeItem> limits);

  public A withLimits(io.kubernetes.client.openapi.models.V1LimitRangeItem... limits);

  public java.lang.Boolean hasLimits();

  public io.kubernetes.client.openapi.models.V1LimitRangeSpecFluent.LimitsNested<A> addNewLimit();

  public io.kubernetes.client.openapi.models.V1LimitRangeSpecFluent.LimitsNested<A> addNewLimitLike(
      io.kubernetes.client.openapi.models.V1LimitRangeItem item);

  public io.kubernetes.client.openapi.models.V1LimitRangeSpecFluent.LimitsNested<A> setNewLimitLike(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1LimitRangeItem item);

  public io.kubernetes.client.openapi.models.V1LimitRangeSpecFluent.LimitsNested<A> editLimit(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1LimitRangeSpecFluent.LimitsNested<A>
      editFirstLimit();

  public io.kubernetes.client.openapi.models.V1LimitRangeSpecFluent.LimitsNested<A> editLastLimit();

  public io.kubernetes.client.openapi.models.V1LimitRangeSpecFluent.LimitsNested<A>
      editMatchingLimit(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LimitRangeItemBuilder>
              predicate);

  public interface LimitsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1LimitRangeItemFluent<
              io.kubernetes.client.openapi.models.V1LimitRangeSpecFluent.LimitsNested<N>> {
    public N and();

    public N endLimit();
  }
}
