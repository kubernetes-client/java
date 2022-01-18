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
public interface V1beta1EventFluent<
        A extends io.kubernetes.client.openapi.models.V1beta1EventFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.String getAction();

  public A withAction(java.lang.String action);

  public java.lang.Boolean hasAction();

  /** Method is deprecated. use withAction instead. */
  @java.lang.Deprecated
  public A withNewAction(java.lang.String original);

  public java.lang.String getApiVersion();

  public A withApiVersion(java.lang.String apiVersion);

  public java.lang.Boolean hasApiVersion();

  /** Method is deprecated. use withApiVersion instead. */
  @java.lang.Deprecated
  public A withNewApiVersion(java.lang.String original);

  public java.lang.Integer getDeprecatedCount();

  public A withDeprecatedCount(java.lang.Integer deprecatedCount);

  public java.lang.Boolean hasDeprecatedCount();

  public java.time.OffsetDateTime getDeprecatedFirstTimestamp();

  public A withDeprecatedFirstTimestamp(java.time.OffsetDateTime deprecatedFirstTimestamp);

  public java.lang.Boolean hasDeprecatedFirstTimestamp();

  public java.time.OffsetDateTime getDeprecatedLastTimestamp();

  public A withDeprecatedLastTimestamp(java.time.OffsetDateTime deprecatedLastTimestamp);

  public java.lang.Boolean hasDeprecatedLastTimestamp();

  /**
   * This method has been deprecated, please use method buildDeprecatedSource instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1EventSource getDeprecatedSource();

  public io.kubernetes.client.openapi.models.V1EventSource buildDeprecatedSource();

  public A withDeprecatedSource(io.kubernetes.client.openapi.models.V1EventSource deprecatedSource);

  public java.lang.Boolean hasDeprecatedSource();

  public io.kubernetes.client.openapi.models.V1beta1EventFluent.DeprecatedSourceNested<A>
      withNewDeprecatedSource();

  public io.kubernetes.client.openapi.models.V1beta1EventFluent.DeprecatedSourceNested<A>
      withNewDeprecatedSourceLike(io.kubernetes.client.openapi.models.V1EventSource item);

  public io.kubernetes.client.openapi.models.V1beta1EventFluent.DeprecatedSourceNested<A>
      editDeprecatedSource();

  public io.kubernetes.client.openapi.models.V1beta1EventFluent.DeprecatedSourceNested<A>
      editOrNewDeprecatedSource();

  public io.kubernetes.client.openapi.models.V1beta1EventFluent.DeprecatedSourceNested<A>
      editOrNewDeprecatedSourceLike(io.kubernetes.client.openapi.models.V1EventSource item);

  public java.time.OffsetDateTime getEventTime();

  public A withEventTime(java.time.OffsetDateTime eventTime);

  public java.lang.Boolean hasEventTime();

  public java.lang.String getKind();

  public A withKind(java.lang.String kind);

  public java.lang.Boolean hasKind();

  /** Method is deprecated. use withKind instead. */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String original);

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata();

  public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata();

  public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata);

  public java.lang.Boolean hasMetadata();

  public io.kubernetes.client.openapi.models.V1beta1EventFluent.MetadataNested<A> withNewMetadata();

  public io.kubernetes.client.openapi.models.V1beta1EventFluent.MetadataNested<A>
      withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);

  public io.kubernetes.client.openapi.models.V1beta1EventFluent.MetadataNested<A> editMetadata();

  public io.kubernetes.client.openapi.models.V1beta1EventFluent.MetadataNested<A>
      editOrNewMetadata();

  public io.kubernetes.client.openapi.models.V1beta1EventFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);

  public java.lang.String getNote();

  public A withNote(java.lang.String note);

  public java.lang.Boolean hasNote();

  /** Method is deprecated. use withNote instead. */
  @java.lang.Deprecated
  public A withNewNote(java.lang.String original);

  public java.lang.String getReason();

  public A withReason(java.lang.String reason);

  public java.lang.Boolean hasReason();

  /** Method is deprecated. use withReason instead. */
  @java.lang.Deprecated
  public A withNewReason(java.lang.String original);

  /**
   * This method has been deprecated, please use method buildRegarding instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectReference getRegarding();

  public io.kubernetes.client.openapi.models.V1ObjectReference buildRegarding();

  public A withRegarding(io.kubernetes.client.openapi.models.V1ObjectReference regarding);

  public java.lang.Boolean hasRegarding();

  public io.kubernetes.client.openapi.models.V1beta1EventFluent.RegardingNested<A>
      withNewRegarding();

  public io.kubernetes.client.openapi.models.V1beta1EventFluent.RegardingNested<A>
      withNewRegardingLike(io.kubernetes.client.openapi.models.V1ObjectReference item);

  public io.kubernetes.client.openapi.models.V1beta1EventFluent.RegardingNested<A> editRegarding();

  public io.kubernetes.client.openapi.models.V1beta1EventFluent.RegardingNested<A>
      editOrNewRegarding();

  public io.kubernetes.client.openapi.models.V1beta1EventFluent.RegardingNested<A>
      editOrNewRegardingLike(io.kubernetes.client.openapi.models.V1ObjectReference item);

  /**
   * This method has been deprecated, please use method buildRelated instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectReference getRelated();

  public io.kubernetes.client.openapi.models.V1ObjectReference buildRelated();

  public A withRelated(io.kubernetes.client.openapi.models.V1ObjectReference related);

  public java.lang.Boolean hasRelated();

  public io.kubernetes.client.openapi.models.V1beta1EventFluent.RelatedNested<A> withNewRelated();

  public io.kubernetes.client.openapi.models.V1beta1EventFluent.RelatedNested<A> withNewRelatedLike(
      io.kubernetes.client.openapi.models.V1ObjectReference item);

  public io.kubernetes.client.openapi.models.V1beta1EventFluent.RelatedNested<A> editRelated();

  public io.kubernetes.client.openapi.models.V1beta1EventFluent.RelatedNested<A> editOrNewRelated();

  public io.kubernetes.client.openapi.models.V1beta1EventFluent.RelatedNested<A>
      editOrNewRelatedLike(io.kubernetes.client.openapi.models.V1ObjectReference item);

  public java.lang.String getReportingController();

  public A withReportingController(java.lang.String reportingController);

  public java.lang.Boolean hasReportingController();

  /** Method is deprecated. use withReportingController instead. */
  @java.lang.Deprecated
  public A withNewReportingController(java.lang.String original);

  public java.lang.String getReportingInstance();

  public A withReportingInstance(java.lang.String reportingInstance);

  public java.lang.Boolean hasReportingInstance();

  /** Method is deprecated. use withReportingInstance instead. */
  @java.lang.Deprecated
  public A withNewReportingInstance(java.lang.String original);

  /**
   * This method has been deprecated, please use method buildSeries instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1beta1EventSeries getSeries();

  public io.kubernetes.client.openapi.models.V1beta1EventSeries buildSeries();

  public A withSeries(io.kubernetes.client.openapi.models.V1beta1EventSeries series);

  public java.lang.Boolean hasSeries();

  public io.kubernetes.client.openapi.models.V1beta1EventFluent.SeriesNested<A> withNewSeries();

  public io.kubernetes.client.openapi.models.V1beta1EventFluent.SeriesNested<A> withNewSeriesLike(
      io.kubernetes.client.openapi.models.V1beta1EventSeries item);

  public io.kubernetes.client.openapi.models.V1beta1EventFluent.SeriesNested<A> editSeries();

  public io.kubernetes.client.openapi.models.V1beta1EventFluent.SeriesNested<A> editOrNewSeries();

  public io.kubernetes.client.openapi.models.V1beta1EventFluent.SeriesNested<A> editOrNewSeriesLike(
      io.kubernetes.client.openapi.models.V1beta1EventSeries item);

  public java.lang.String getType();

  public A withType(java.lang.String type);

  public java.lang.Boolean hasType();

  /** Method is deprecated. use withType instead. */
  @java.lang.Deprecated
  public A withNewType(java.lang.String original);

  public interface DeprecatedSourceNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1EventSourceFluent<
              io.kubernetes.client.openapi.models.V1beta1EventFluent.DeprecatedSourceNested<N>> {
    public N and();

    public N endDeprecatedSource();
  }

  public interface MetadataNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ObjectMetaFluent<
              io.kubernetes.client.openapi.models.V1beta1EventFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }

  public interface RegardingNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ObjectReferenceFluent<
              io.kubernetes.client.openapi.models.V1beta1EventFluent.RegardingNested<N>> {
    public N and();

    public N endRegarding();
  }

  public interface RelatedNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ObjectReferenceFluent<
              io.kubernetes.client.openapi.models.V1beta1EventFluent.RelatedNested<N>> {
    public N and();

    public N endRelated();
  }

  public interface SeriesNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1beta1EventSeriesFluent<
              io.kubernetes.client.openapi.models.V1beta1EventFluent.SeriesNested<N>> {
    public N and();

    public N endSeries();
  }
}
