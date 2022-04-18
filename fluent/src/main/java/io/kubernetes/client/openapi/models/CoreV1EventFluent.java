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
import java.time.OffsetDateTime;

/** Generated */
public interface CoreV1EventFluent<A extends CoreV1EventFluent<A>> extends Fluent<A> {
  public String getAction();

  public A withAction(java.lang.String action);

  public Boolean hasAction();

  public java.lang.String getApiVersion();

  public A withApiVersion(java.lang.String apiVersion);

  public java.lang.Boolean hasApiVersion();

  public Integer getCount();

  public A withCount(java.lang.Integer count);

  public java.lang.Boolean hasCount();

  public OffsetDateTime getEventTime();

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
  @Deprecated
  public V1ObjectReference getInvolvedObject();

  public io.kubernetes.client.openapi.models.V1ObjectReference buildInvolvedObject();

  public A withInvolvedObject(io.kubernetes.client.openapi.models.V1ObjectReference involvedObject);

  public java.lang.Boolean hasInvolvedObject();

  public CoreV1EventFluent.InvolvedObjectNested<A> withNewInvolvedObject();

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

  public java.time.OffsetDateTime getLastTimestamp();

  public A withLastTimestamp(java.time.OffsetDateTime lastTimestamp);

  public java.lang.Boolean hasLastTimestamp();

  public java.lang.String getMessage();

  public A withMessage(java.lang.String message);

  public java.lang.Boolean hasMessage();

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1ObjectMeta getMetadata();

  public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata();

  public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata);

  public java.lang.Boolean hasMetadata();

  public CoreV1EventFluent.MetadataNested<A> withNewMetadata();

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

  public CoreV1EventFluent.RelatedNested<A> withNewRelated();

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.RelatedNested<A> withNewRelatedLike(
      io.kubernetes.client.openapi.models.V1ObjectReference item);

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.RelatedNested<A> editRelated();

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.RelatedNested<A> editOrNewRelated();

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.RelatedNested<A>
      editOrNewRelatedLike(io.kubernetes.client.openapi.models.V1ObjectReference item);

  public java.lang.String getReportingComponent();

  public A withReportingComponent(java.lang.String reportingComponent);

  public java.lang.Boolean hasReportingComponent();

  public java.lang.String getReportingInstance();

  public A withReportingInstance(java.lang.String reportingInstance);

  public java.lang.Boolean hasReportingInstance();

  /**
   * This method has been deprecated, please use method buildSeries instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public CoreV1EventSeries getSeries();

  public io.kubernetes.client.openapi.models.CoreV1EventSeries buildSeries();

  public A withSeries(io.kubernetes.client.openapi.models.CoreV1EventSeries series);

  public java.lang.Boolean hasSeries();

  public CoreV1EventFluent.SeriesNested<A> withNewSeries();

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
  public V1EventSource getSource();

  public io.kubernetes.client.openapi.models.V1EventSource buildSource();

  public A withSource(io.kubernetes.client.openapi.models.V1EventSource source);

  public java.lang.Boolean hasSource();

  public CoreV1EventFluent.SourceNested<A> withNewSource();

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.SourceNested<A> withNewSourceLike(
      io.kubernetes.client.openapi.models.V1EventSource item);

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.SourceNested<A> editSource();

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.SourceNested<A> editOrNewSource();

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.SourceNested<A> editOrNewSourceLike(
      io.kubernetes.client.openapi.models.V1EventSource item);

  public java.lang.String getType();

  public A withType(java.lang.String type);

  public java.lang.Boolean hasType();

  public interface InvolvedObjectNested<N>
      extends Nested<N>, V1ObjectReferenceFluent<CoreV1EventFluent.InvolvedObjectNested<N>> {
    public N and();

    public N endInvolvedObject();
  }

  public interface MetadataNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1ObjectMetaFluent<CoreV1EventFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }

  public interface RelatedNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1ObjectReferenceFluent<CoreV1EventFluent.RelatedNested<N>> {
    public N and();

    public N endRelated();
  }

  public interface SeriesNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          CoreV1EventSeriesFluent<CoreV1EventFluent.SeriesNested<N>> {
    public N and();

    public N endSeries();
  }

  public interface SourceNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1EventSourceFluent<CoreV1EventFluent.SourceNested<N>> {
    public N and();

    public N endSource();
  }
}
