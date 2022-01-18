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
public interface V1beta1RunAsGroupStrategyOptionsFluent<
        A extends io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptionsFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public A addToRanges(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1beta1IDRange item);

  public A setToRanges(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1beta1IDRange item);

  public A addToRanges(io.kubernetes.client.openapi.models.V1beta1IDRange... items);

  public A addAllToRanges(
      java.util.Collection<io.kubernetes.client.openapi.models.V1beta1IDRange> items);

  public A removeFromRanges(io.kubernetes.client.openapi.models.V1beta1IDRange... items);

  public A removeAllFromRanges(
      java.util.Collection<io.kubernetes.client.openapi.models.V1beta1IDRange> items);

  public A removeMatchingFromRanges(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1IDRangeBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildRanges instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1beta1IDRange> getRanges();

  public java.util.List<io.kubernetes.client.openapi.models.V1beta1IDRange> buildRanges();

  public io.kubernetes.client.openapi.models.V1beta1IDRange buildRange(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1beta1IDRange buildFirstRange();

  public io.kubernetes.client.openapi.models.V1beta1IDRange buildLastRange();

  public io.kubernetes.client.openapi.models.V1beta1IDRange buildMatchingRange(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1IDRangeBuilder>
          predicate);

  public java.lang.Boolean hasMatchingRange(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1IDRangeBuilder>
          predicate);

  public A withRanges(java.util.List<io.kubernetes.client.openapi.models.V1beta1IDRange> ranges);

  public A withRanges(io.kubernetes.client.openapi.models.V1beta1IDRange... ranges);

  public java.lang.Boolean hasRanges();

  public io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptionsFluent.RangesNested<A>
      addNewRange();

  public io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptionsFluent.RangesNested<A>
      addNewRangeLike(io.kubernetes.client.openapi.models.V1beta1IDRange item);

  public io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptionsFluent.RangesNested<A>
      setNewRangeLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1beta1IDRange item);

  public io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptionsFluent.RangesNested<A>
      editRange(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptionsFluent.RangesNested<A>
      editFirstRange();

  public io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptionsFluent.RangesNested<A>
      editLastRange();

  public io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptionsFluent.RangesNested<A>
      editMatchingRange(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1IDRangeBuilder>
              predicate);

  public java.lang.String getRule();

  public A withRule(java.lang.String rule);

  public java.lang.Boolean hasRule();

  /** Method is deprecated. use withRule instead. */
  @java.lang.Deprecated
  public A withNewRule(java.lang.String original);

  public interface RangesNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1beta1IDRangeFluent<
              io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptionsFluent
                      .RangesNested<
                  N>> {
    public N and();

    public N endRange();
  }
}
