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
public interface EventsV1EventFluent<A extends EventsV1EventFluent<A>> extends Fluent<A> {
  public String getAction();

  public A withAction(java.lang.String action);

  public Boolean hasAction();

  public java.lang.String getApiVersion();

  public A withApiVersion(java.lang.String apiVersion);

  public java.lang.Boolean hasApiVersion();

  public Integer getDeprecatedCount();

  public A withDeprecatedCount(java.lang.Integer deprecatedCount);

  public java.lang.Boolean hasDeprecatedCount();

  public OffsetDateTime getDeprecatedFirstTimestamp();

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
  @Deprecated
  public V1EventSource getDeprecatedSource();

  public io.kubernetes.client.openapi.models.V1EventSource buildDeprecatedSource();

  public A withDeprecatedSource(io.kubernetes.client.openapi.models.V1EventSource deprecatedSource);

  public java.lang.Boolean hasDeprecatedSource();

  public EventsV1EventFluent.DeprecatedSourceNested<A> withNewDeprecatedSource();

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.DeprecatedSourceNested<A>
      withNewDeprecatedSourceLike(io.kubernetes.client.openapi.models.V1EventSource item);

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.DeprecatedSourceNested<A>
      editDeprecatedSource();

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.DeprecatedSourceNested<A>
      editOrNewDeprecatedSource();

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.DeprecatedSourceNested<A>
      editOrNewDeprecatedSourceLike(io.kubernetes.client.openapi.models.V1EventSource item);

  public java.time.OffsetDateTime getEventTime();

  public A withEventTime(java.time.OffsetDateTime eventTime);

  public java.lang.Boolean hasEventTime();

  public java.lang.String getKind();

  public A withKind(java.lang.String kind);

  public java.lang.Boolean hasKind();

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

  public EventsV1EventFluent.MetadataNested<A> withNewMetadata();

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.MetadataNested<A>
      withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.MetadataNested<A> editMetadata();

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.MetadataNested<A>
      editOrNewMetadata();

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);

  public java.lang.String getNote();

  public A withNote(java.lang.String note);

  public java.lang.Boolean hasNote();

  public java.lang.String getReason();

  public A withReason(java.lang.String reason);

  public java.lang.Boolean hasReason();

  /**
   * This method has been deprecated, please use method buildRegarding instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1ObjectReference getRegarding();

  public io.kubernetes.client.openapi.models.V1ObjectReference buildRegarding();

  public A withRegarding(io.kubernetes.client.openapi.models.V1ObjectReference regarding);

  public java.lang.Boolean hasRegarding();

  public EventsV1EventFluent.RegardingNested<A> withNewRegarding();

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.RegardingNested<A>
      withNewRegardingLike(io.kubernetes.client.openapi.models.V1ObjectReference item);

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.RegardingNested<A> editRegarding();

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.RegardingNested<A>
      editOrNewRegarding();

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.RegardingNested<A>
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

  public EventsV1EventFluent.RelatedNested<A> withNewRelated();

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.RelatedNested<A>
      withNewRelatedLike(io.kubernetes.client.openapi.models.V1ObjectReference item);

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.RelatedNested<A> editRelated();

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.RelatedNested<A>
      editOrNewRelated();

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.RelatedNested<A>
      editOrNewRelatedLike(io.kubernetes.client.openapi.models.V1ObjectReference item);

  public java.lang.String getReportingController();

  public A withReportingController(java.lang.String reportingController);

  public java.lang.Boolean hasReportingController();

  public java.lang.String getReportingInstance();

  public A withReportingInstance(java.lang.String reportingInstance);

  public java.lang.Boolean hasReportingInstance();

  /**
   * This method has been deprecated, please use method buildSeries instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public EventsV1EventSeries getSeries();

  public io.kubernetes.client.openapi.models.EventsV1EventSeries buildSeries();

  public A withSeries(io.kubernetes.client.openapi.models.EventsV1EventSeries series);

  public java.lang.Boolean hasSeries();

  public EventsV1EventFluent.SeriesNested<A> withNewSeries();

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.SeriesNested<A> withNewSeriesLike(
      io.kubernetes.client.openapi.models.EventsV1EventSeries item);

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.SeriesNested<A> editSeries();

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.SeriesNested<A> editOrNewSeries();

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.SeriesNested<A>
      editOrNewSeriesLike(io.kubernetes.client.openapi.models.EventsV1EventSeries item);

  public java.lang.String getType();

  public A withType(java.lang.String type);

  public java.lang.Boolean hasType();

  public interface DeprecatedSourceNested<N>
      extends Nested<N>, V1EventSourceFluent<EventsV1EventFluent.DeprecatedSourceNested<N>> {
    public N and();

    public N endDeprecatedSource();
  }

  public interface MetadataNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1ObjectMetaFluent<EventsV1EventFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }

  public interface RegardingNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1ObjectReferenceFluent<EventsV1EventFluent.RegardingNested<N>> {
    public N and();

    public N endRegarding();
  }

  public interface RelatedNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1ObjectReferenceFluent<EventsV1EventFluent.RelatedNested<N>> {
    public N and();

    public N endRelated();
  }

  public interface SeriesNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          EventsV1EventSeriesFluent<EventsV1EventFluent.SeriesNested<N>> {
    public N and();

    public N endSeries();
  }
}
