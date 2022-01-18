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
public class EventsV1EventFluentImpl<
        A extends io.kubernetes.client.openapi.models.EventsV1EventFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.EventsV1EventFluent<A> {
  public EventsV1EventFluentImpl() {}

  public EventsV1EventFluentImpl(io.kubernetes.client.openapi.models.EventsV1Event instance) {
    this.withAction(instance.getAction());

    this.withApiVersion(instance.getApiVersion());

    this.withDeprecatedCount(instance.getDeprecatedCount());

    this.withDeprecatedFirstTimestamp(instance.getDeprecatedFirstTimestamp());

    this.withDeprecatedLastTimestamp(instance.getDeprecatedLastTimestamp());

    this.withDeprecatedSource(instance.getDeprecatedSource());

    this.withEventTime(instance.getEventTime());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withNote(instance.getNote());

    this.withReason(instance.getReason());

    this.withRegarding(instance.getRegarding());

    this.withRelated(instance.getRelated());

    this.withReportingController(instance.getReportingController());

    this.withReportingInstance(instance.getReportingInstance());

    this.withSeries(instance.getSeries());

    this.withType(instance.getType());
  }

  private java.lang.String action;
  private java.lang.String apiVersion;
  private java.lang.Integer deprecatedCount;
  private java.time.OffsetDateTime deprecatedFirstTimestamp;
  private java.time.OffsetDateTime deprecatedLastTimestamp;
  private io.kubernetes.client.openapi.models.V1EventSourceBuilder deprecatedSource;
  private java.time.OffsetDateTime eventTime;
  private java.lang.String kind;
  private io.kubernetes.client.openapi.models.V1ObjectMetaBuilder metadata;
  private java.lang.String note;
  private java.lang.String reason;
  private io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder regarding;
  private io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder related;
  private java.lang.String reportingController;
  private java.lang.String reportingInstance;
  private io.kubernetes.client.openapi.models.EventsV1EventSeriesBuilder series;
  private java.lang.String type;

  public java.lang.String getAction() {
    return this.action;
  }

  public A withAction(java.lang.String action) {
    this.action = action;
    return (A) this;
  }

  public java.lang.Boolean hasAction() {
    return this.action != null;
  }

  /** Method is deprecated. use withAction instead. */
  @java.lang.Deprecated
  public A withNewAction(java.lang.String original) {
    return (A) withAction(new String(original));
  }

  public java.lang.String getApiVersion() {
    return this.apiVersion;
  }

  public A withApiVersion(java.lang.String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }

  public java.lang.Boolean hasApiVersion() {
    return this.apiVersion != null;
  }

  /** Method is deprecated. use withApiVersion instead. */
  @java.lang.Deprecated
  public A withNewApiVersion(java.lang.String original) {
    return (A) withApiVersion(new String(original));
  }

  public java.lang.Integer getDeprecatedCount() {
    return this.deprecatedCount;
  }

  public A withDeprecatedCount(java.lang.Integer deprecatedCount) {
    this.deprecatedCount = deprecatedCount;
    return (A) this;
  }

  public java.lang.Boolean hasDeprecatedCount() {
    return this.deprecatedCount != null;
  }

  public java.time.OffsetDateTime getDeprecatedFirstTimestamp() {
    return this.deprecatedFirstTimestamp;
  }

  public A withDeprecatedFirstTimestamp(java.time.OffsetDateTime deprecatedFirstTimestamp) {
    this.deprecatedFirstTimestamp = deprecatedFirstTimestamp;
    return (A) this;
  }

  public java.lang.Boolean hasDeprecatedFirstTimestamp() {
    return this.deprecatedFirstTimestamp != null;
  }

  public java.time.OffsetDateTime getDeprecatedLastTimestamp() {
    return this.deprecatedLastTimestamp;
  }

  public A withDeprecatedLastTimestamp(java.time.OffsetDateTime deprecatedLastTimestamp) {
    this.deprecatedLastTimestamp = deprecatedLastTimestamp;
    return (A) this;
  }

  public java.lang.Boolean hasDeprecatedLastTimestamp() {
    return this.deprecatedLastTimestamp != null;
  }

  /**
   * This method has been deprecated, please use method buildDeprecatedSource instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1EventSource getDeprecatedSource() {
    return this.deprecatedSource != null ? this.deprecatedSource.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1EventSource buildDeprecatedSource() {
    return this.deprecatedSource != null ? this.deprecatedSource.build() : null;
  }

  public A withDeprecatedSource(
      io.kubernetes.client.openapi.models.V1EventSource deprecatedSource) {
    _visitables.get("deprecatedSource").remove(this.deprecatedSource);
    if (deprecatedSource != null) {
      this.deprecatedSource =
          new io.kubernetes.client.openapi.models.V1EventSourceBuilder(deprecatedSource);
      _visitables.get("deprecatedSource").add(this.deprecatedSource);
    }
    return (A) this;
  }

  public java.lang.Boolean hasDeprecatedSource() {
    return this.deprecatedSource != null;
  }

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.DeprecatedSourceNested<A>
      withNewDeprecatedSource() {
    return new io.kubernetes.client.openapi.models.EventsV1EventFluentImpl
        .DeprecatedSourceNestedImpl();
  }

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.DeprecatedSourceNested<A>
      withNewDeprecatedSourceLike(io.kubernetes.client.openapi.models.V1EventSource item) {
    return new io.kubernetes.client.openapi.models.EventsV1EventFluentImpl
        .DeprecatedSourceNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.DeprecatedSourceNested<A>
      editDeprecatedSource() {
    return withNewDeprecatedSourceLike(getDeprecatedSource());
  }

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.DeprecatedSourceNested<A>
      editOrNewDeprecatedSource() {
    return withNewDeprecatedSourceLike(
        getDeprecatedSource() != null
            ? getDeprecatedSource()
            : new io.kubernetes.client.openapi.models.V1EventSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.DeprecatedSourceNested<A>
      editOrNewDeprecatedSourceLike(io.kubernetes.client.openapi.models.V1EventSource item) {
    return withNewDeprecatedSourceLike(
        getDeprecatedSource() != null ? getDeprecatedSource() : item);
  }

  public java.time.OffsetDateTime getEventTime() {
    return this.eventTime;
  }

  public A withEventTime(java.time.OffsetDateTime eventTime) {
    this.eventTime = eventTime;
    return (A) this;
  }

  public java.lang.Boolean hasEventTime() {
    return this.eventTime != null;
  }

  public java.lang.String getKind() {
    return this.kind;
  }

  public A withKind(java.lang.String kind) {
    this.kind = kind;
    return (A) this;
  }

  public java.lang.Boolean hasKind() {
    return this.kind != null;
  }

  /** Method is deprecated. use withKind instead. */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String original) {
    return (A) withKind(new String(original));
  }

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }

  public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata) {
    _visitables.get("metadata").remove(this.metadata);
    if (metadata != null) {
      this.metadata = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(metadata);
      _visitables.get("metadata").add(this.metadata);
    }
    return (A) this;
  }

  public java.lang.Boolean hasMetadata() {
    return this.metadata != null;
  }

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.MetadataNested<A>
      withNewMetadata() {
    return new io.kubernetes.client.openapi.models.EventsV1EventFluentImpl.MetadataNestedImpl();
  }

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.MetadataNested<A>
      withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return new io.kubernetes.client.openapi.models.EventsV1EventFluentImpl.MetadataNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.MetadataNested<A>
      editOrNewMetadata() {
    return withNewMetadataLike(
        getMetadata() != null
            ? getMetadata()
            : new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder().build());
  }

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata() : item);
  }

  public java.lang.String getNote() {
    return this.note;
  }

  public A withNote(java.lang.String note) {
    this.note = note;
    return (A) this;
  }

  public java.lang.Boolean hasNote() {
    return this.note != null;
  }

  /** Method is deprecated. use withNote instead. */
  @java.lang.Deprecated
  public A withNewNote(java.lang.String original) {
    return (A) withNote(new String(original));
  }

  public java.lang.String getReason() {
    return this.reason;
  }

  public A withReason(java.lang.String reason) {
    this.reason = reason;
    return (A) this;
  }

  public java.lang.Boolean hasReason() {
    return this.reason != null;
  }

  /** Method is deprecated. use withReason instead. */
  @java.lang.Deprecated
  public A withNewReason(java.lang.String original) {
    return (A) withReason(new String(original));
  }

  /**
   * This method has been deprecated, please use method buildRegarding instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectReference getRegarding() {
    return this.regarding != null ? this.regarding.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ObjectReference buildRegarding() {
    return this.regarding != null ? this.regarding.build() : null;
  }

  public A withRegarding(io.kubernetes.client.openapi.models.V1ObjectReference regarding) {
    _visitables.get("regarding").remove(this.regarding);
    if (regarding != null) {
      this.regarding = new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(regarding);
      _visitables.get("regarding").add(this.regarding);
    }
    return (A) this;
  }

  public java.lang.Boolean hasRegarding() {
    return this.regarding != null;
  }

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.RegardingNested<A>
      withNewRegarding() {
    return new io.kubernetes.client.openapi.models.EventsV1EventFluentImpl.RegardingNestedImpl();
  }

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.RegardingNested<A>
      withNewRegardingLike(io.kubernetes.client.openapi.models.V1ObjectReference item) {
    return new io.kubernetes.client.openapi.models.EventsV1EventFluentImpl.RegardingNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.RegardingNested<A>
      editRegarding() {
    return withNewRegardingLike(getRegarding());
  }

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.RegardingNested<A>
      editOrNewRegarding() {
    return withNewRegardingLike(
        getRegarding() != null
            ? getRegarding()
            : new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.RegardingNested<A>
      editOrNewRegardingLike(io.kubernetes.client.openapi.models.V1ObjectReference item) {
    return withNewRegardingLike(getRegarding() != null ? getRegarding() : item);
  }

  /**
   * This method has been deprecated, please use method buildRelated instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectReference getRelated() {
    return this.related != null ? this.related.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ObjectReference buildRelated() {
    return this.related != null ? this.related.build() : null;
  }

  public A withRelated(io.kubernetes.client.openapi.models.V1ObjectReference related) {
    _visitables.get("related").remove(this.related);
    if (related != null) {
      this.related = new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(related);
      _visitables.get("related").add(this.related);
    }
    return (A) this;
  }

  public java.lang.Boolean hasRelated() {
    return this.related != null;
  }

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.RelatedNested<A> withNewRelated() {
    return new io.kubernetes.client.openapi.models.EventsV1EventFluentImpl.RelatedNestedImpl();
  }

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.RelatedNested<A>
      withNewRelatedLike(io.kubernetes.client.openapi.models.V1ObjectReference item) {
    return new io.kubernetes.client.openapi.models.EventsV1EventFluentImpl.RelatedNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.RelatedNested<A> editRelated() {
    return withNewRelatedLike(getRelated());
  }

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.RelatedNested<A>
      editOrNewRelated() {
    return withNewRelatedLike(
        getRelated() != null
            ? getRelated()
            : new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.RelatedNested<A>
      editOrNewRelatedLike(io.kubernetes.client.openapi.models.V1ObjectReference item) {
    return withNewRelatedLike(getRelated() != null ? getRelated() : item);
  }

  public java.lang.String getReportingController() {
    return this.reportingController;
  }

  public A withReportingController(java.lang.String reportingController) {
    this.reportingController = reportingController;
    return (A) this;
  }

  public java.lang.Boolean hasReportingController() {
    return this.reportingController != null;
  }

  /** Method is deprecated. use withReportingController instead. */
  @java.lang.Deprecated
  public A withNewReportingController(java.lang.String original) {
    return (A) withReportingController(new String(original));
  }

  public java.lang.String getReportingInstance() {
    return this.reportingInstance;
  }

  public A withReportingInstance(java.lang.String reportingInstance) {
    this.reportingInstance = reportingInstance;
    return (A) this;
  }

  public java.lang.Boolean hasReportingInstance() {
    return this.reportingInstance != null;
  }

  /** Method is deprecated. use withReportingInstance instead. */
  @java.lang.Deprecated
  public A withNewReportingInstance(java.lang.String original) {
    return (A) withReportingInstance(new String(original));
  }

  /**
   * This method has been deprecated, please use method buildSeries instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.EventsV1EventSeries getSeries() {
    return this.series != null ? this.series.build() : null;
  }

  public io.kubernetes.client.openapi.models.EventsV1EventSeries buildSeries() {
    return this.series != null ? this.series.build() : null;
  }

  public A withSeries(io.kubernetes.client.openapi.models.EventsV1EventSeries series) {
    _visitables.get("series").remove(this.series);
    if (series != null) {
      this.series = new io.kubernetes.client.openapi.models.EventsV1EventSeriesBuilder(series);
      _visitables.get("series").add(this.series);
    }
    return (A) this;
  }

  public java.lang.Boolean hasSeries() {
    return this.series != null;
  }

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.SeriesNested<A> withNewSeries() {
    return new io.kubernetes.client.openapi.models.EventsV1EventFluentImpl.SeriesNestedImpl();
  }

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.SeriesNested<A> withNewSeriesLike(
      io.kubernetes.client.openapi.models.EventsV1EventSeries item) {
    return new io.kubernetes.client.openapi.models.EventsV1EventFluentImpl.SeriesNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.SeriesNested<A> editSeries() {
    return withNewSeriesLike(getSeries());
  }

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.SeriesNested<A> editOrNewSeries() {
    return withNewSeriesLike(
        getSeries() != null
            ? getSeries()
            : new io.kubernetes.client.openapi.models.EventsV1EventSeriesBuilder().build());
  }

  public io.kubernetes.client.openapi.models.EventsV1EventFluent.SeriesNested<A>
      editOrNewSeriesLike(io.kubernetes.client.openapi.models.EventsV1EventSeries item) {
    return withNewSeriesLike(getSeries() != null ? getSeries() : item);
  }

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
    EventsV1EventFluentImpl that = (EventsV1EventFluentImpl) o;
    if (action != null ? !action.equals(that.action) : that.action != null) return false;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) : that.apiVersion != null)
      return false;
    if (deprecatedCount != null
        ? !deprecatedCount.equals(that.deprecatedCount)
        : that.deprecatedCount != null) return false;
    if (deprecatedFirstTimestamp != null
        ? !deprecatedFirstTimestamp.equals(that.deprecatedFirstTimestamp)
        : that.deprecatedFirstTimestamp != null) return false;
    if (deprecatedLastTimestamp != null
        ? !deprecatedLastTimestamp.equals(that.deprecatedLastTimestamp)
        : that.deprecatedLastTimestamp != null) return false;
    if (deprecatedSource != null
        ? !deprecatedSource.equals(that.deprecatedSource)
        : that.deprecatedSource != null) return false;
    if (eventTime != null ? !eventTime.equals(that.eventTime) : that.eventTime != null)
      return false;
    if (kind != null ? !kind.equals(that.kind) : that.kind != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) : that.metadata != null) return false;
    if (note != null ? !note.equals(that.note) : that.note != null) return false;
    if (reason != null ? !reason.equals(that.reason) : that.reason != null) return false;
    if (regarding != null ? !regarding.equals(that.regarding) : that.regarding != null)
      return false;
    if (related != null ? !related.equals(that.related) : that.related != null) return false;
    if (reportingController != null
        ? !reportingController.equals(that.reportingController)
        : that.reportingController != null) return false;
    if (reportingInstance != null
        ? !reportingInstance.equals(that.reportingInstance)
        : that.reportingInstance != null) return false;
    if (series != null ? !series.equals(that.series) : that.series != null) return false;
    if (type != null ? !type.equals(that.type) : that.type != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        action,
        apiVersion,
        deprecatedCount,
        deprecatedFirstTimestamp,
        deprecatedLastTimestamp,
        deprecatedSource,
        eventTime,
        kind,
        metadata,
        note,
        reason,
        regarding,
        related,
        reportingController,
        reportingInstance,
        series,
        type,
        super.hashCode());
  }

  public class DeprecatedSourceNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1EventSourceFluentImpl<
          io.kubernetes.client.openapi.models.EventsV1EventFluent.DeprecatedSourceNested<N>>
      implements io.kubernetes.client.openapi.models.EventsV1EventFluent.DeprecatedSourceNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    DeprecatedSourceNestedImpl(io.kubernetes.client.openapi.models.V1EventSource item) {
      this.builder = new io.kubernetes.client.openapi.models.V1EventSourceBuilder(this, item);
    }

    DeprecatedSourceNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1EventSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1EventSourceBuilder builder;

    public N and() {
      return (N) EventsV1EventFluentImpl.this.withDeprecatedSource(builder.build());
    }

    public N endDeprecatedSource() {
      return and();
    }
  }

  public class MetadataNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ObjectMetaFluentImpl<
          io.kubernetes.client.openapi.models.EventsV1EventFluent.MetadataNested<N>>
      implements io.kubernetes.client.openapi.models.EventsV1EventFluent.MetadataNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    MetadataNestedImpl(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this, item);
    }

    MetadataNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ObjectMetaBuilder builder;

    public N and() {
      return (N) EventsV1EventFluentImpl.this.withMetadata(builder.build());
    }

    public N endMetadata() {
      return and();
    }
  }

  public class RegardingNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ObjectReferenceFluentImpl<
          io.kubernetes.client.openapi.models.EventsV1EventFluent.RegardingNested<N>>
      implements io.kubernetes.client.openapi.models.EventsV1EventFluent.RegardingNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    RegardingNestedImpl(io.kubernetes.client.openapi.models.V1ObjectReference item) {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(this, item);
    }

    RegardingNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder builder;

    public N and() {
      return (N) EventsV1EventFluentImpl.this.withRegarding(builder.build());
    }

    public N endRegarding() {
      return and();
    }
  }

  public class RelatedNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ObjectReferenceFluentImpl<
          io.kubernetes.client.openapi.models.EventsV1EventFluent.RelatedNested<N>>
      implements io.kubernetes.client.openapi.models.EventsV1EventFluent.RelatedNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    RelatedNestedImpl(io.kubernetes.client.openapi.models.V1ObjectReference item) {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(this, item);
    }

    RelatedNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder builder;

    public N and() {
      return (N) EventsV1EventFluentImpl.this.withRelated(builder.build());
    }

    public N endRelated() {
      return and();
    }
  }

  public class SeriesNestedImpl<N>
      extends io.kubernetes.client.openapi.models.EventsV1EventSeriesFluentImpl<
          io.kubernetes.client.openapi.models.EventsV1EventFluent.SeriesNested<N>>
      implements io.kubernetes.client.openapi.models.EventsV1EventFluent.SeriesNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    SeriesNestedImpl(io.kubernetes.client.openapi.models.EventsV1EventSeries item) {
      this.builder = new io.kubernetes.client.openapi.models.EventsV1EventSeriesBuilder(this, item);
    }

    SeriesNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.EventsV1EventSeriesBuilder(this);
    }

    io.kubernetes.client.openapi.models.EventsV1EventSeriesBuilder builder;

    public N and() {
      return (N) EventsV1EventFluentImpl.this.withSeries(builder.build());
    }

    public N endSeries() {
      return and();
    }
  }
}
