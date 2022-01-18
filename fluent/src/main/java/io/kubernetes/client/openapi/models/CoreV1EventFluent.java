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
public interface CoreV1EventFluent<
        A extends io.kubernetes.client.openapi.models.CoreV1EventFluent<A>>
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

  public java.lang.Integer getCount();

  public A withCount(java.lang.Integer count);

  public java.lang.Boolean hasCount();

  public java.time.OffsetDateTime getEventTime();

  public A withEventTime(java.time.OffsetDateTime eventTime);

  public java.lang.Boolean hasEventTime();

  public java.time.OffsetDateTime getFirstTimestamp();

  public A withFirstTimestamp(java.time.OffsetDateTime firstTimestamp);

  public java.lang.Boolean hasFirstTimestamp();

  /**
   * This method has been deprecated, please use method buildInvolvedObject instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectReference getInvolvedObject();

  public io.kubernetes.client.openapi.models.V1ObjectReference buildInvolvedObject();

  public A withInvolvedObject(io.kubernetes.client.openapi.models.V1ObjectReference involvedObject);

  public java.lang.Boolean hasInvolvedObject();

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.InvolvedObjectNested<A>
      withNewInvolvedObject();

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.InvolvedObjectNested<A>
      withNewInvolvedObjectLike(io.kubernetes.client.openapi.models.V1ObjectReference item);

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.InvolvedObjectNested<A>
      editInvolvedObject();

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.InvolvedObjectNested<A>
      editOrNewInvolvedObject();

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.InvolvedObjectNested<A>
      editOrNewInvolvedObjectLike(io.kubernetes.client.openapi.models.V1ObjectReference item);

  public java.lang.String getKind();

  public A withKind(java.lang.String kind);

  public java.lang.Boolean hasKind();

  /** Method is deprecated. use withKind instead. */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String original);

  public java.time.OffsetDateTime getLastTimestamp();

  public A withLastTimestamp(java.time.OffsetDateTime lastTimestamp);

  public java.lang.Boolean hasLastTimestamp();

  public java.lang.String getMessage();

  public A withMessage(java.lang.String message);

  public java.lang.Boolean hasMessage();

  /** Method is deprecated. use withMessage instead. */
  @java.lang.Deprecated
  public A withNewMessage(java.lang.String original);

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

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.MetadataNested<A> withNewMetadata();

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.MetadataNested<A>
      withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.MetadataNested<A> editMetadata();

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.MetadataNested<A>
      editOrNewMetadata();

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);

  public java.lang.String getReason();

  public A withReason(java.lang.String reason);

  public java.lang.Boolean hasReason();

  /** Method is deprecated. use withReason instead. */
  @java.lang.Deprecated
  public A withNewReason(java.lang.String original);

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

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.RelatedNested<A> withNewRelated();

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.RelatedNested<A> withNewRelatedLike(
      io.kubernetes.client.openapi.models.V1ObjectReference item);

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.RelatedNested<A> editRelated();

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.RelatedNested<A> editOrNewRelated();

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.RelatedNested<A>
      editOrNewRelatedLike(io.kubernetes.client.openapi.models.V1ObjectReference item);

  public java.lang.String getReportingComponent();

  public A withReportingComponent(java.lang.String reportingComponent);

  public java.lang.Boolean hasReportingComponent();

  /** Method is deprecated. use withReportingComponent instead. */
  @java.lang.Deprecated
  public A withNewReportingComponent(java.lang.String original);

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
  public io.kubernetes.client.openapi.models.CoreV1EventSeries getSeries();

  public io.kubernetes.client.openapi.models.CoreV1EventSeries buildSeries();

  public A withSeries(io.kubernetes.client.openapi.models.CoreV1EventSeries series);

  public java.lang.Boolean hasSeries();

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.SeriesNested<A> withNewSeries();

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.SeriesNested<A> withNewSeriesLike(
      io.kubernetes.client.openapi.models.CoreV1EventSeries item);

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.SeriesNested<A> editSeries();

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.SeriesNested<A> editOrNewSeries();

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.SeriesNested<A> editOrNewSeriesLike(
      io.kubernetes.client.openapi.models.CoreV1EventSeries item);

  /**
   * This method has been deprecated, please use method buildSource instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1EventSource getSource();

  public io.kubernetes.client.openapi.models.V1EventSource buildSource();

  public A withSource(io.kubernetes.client.openapi.models.V1EventSource source);

  public java.lang.Boolean hasSource();

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.SourceNested<A> withNewSource();

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.SourceNested<A> withNewSourceLike(
      io.kubernetes.client.openapi.models.V1EventSource item);

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.SourceNested<A> editSource();

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.SourceNested<A> editOrNewSource();

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.SourceNested<A> editOrNewSourceLike(
      io.kubernetes.client.openapi.models.V1EventSource item);

  public java.lang.String getType();

  public A withType(java.lang.String type);

  public java.lang.Boolean hasType();

  /** Method is deprecated. use withType instead. */
  @java.lang.Deprecated
  public A withNewType(java.lang.String original);

  public interface InvolvedObjectNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ObjectReferenceFluent<
              io.kubernetes.client.openapi.models.CoreV1EventFluent.InvolvedObjectNested<N>> {
    public N and();

    public N endInvolvedObject();
  }

  public interface MetadataNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ObjectMetaFluent<
              io.kubernetes.client.openapi.models.CoreV1EventFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }

  public interface RelatedNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ObjectReferenceFluent<
              io.kubernetes.client.openapi.models.CoreV1EventFluent.RelatedNested<N>> {
    public N and();

    public N endRelated();
  }

  public interface SeriesNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.CoreV1EventSeriesFluent<
              io.kubernetes.client.openapi.models.CoreV1EventFluent.SeriesNested<N>> {
    public N and();

    public N endSeries();
  }

  public interface SourceNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1EventSourceFluent<
              io.kubernetes.client.openapi.models.CoreV1EventFluent.SourceNested<N>> {
    public N and();

    public N endSource();
  }
}
