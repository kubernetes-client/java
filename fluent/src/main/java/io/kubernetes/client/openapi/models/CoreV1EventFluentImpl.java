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
public class CoreV1EventFluentImpl<
        A extends io.kubernetes.client.openapi.models.CoreV1EventFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.CoreV1EventFluent<A> {
  public CoreV1EventFluentImpl() {}

  public CoreV1EventFluentImpl(io.kubernetes.client.openapi.models.CoreV1Event instance) {
    this.withAction(instance.getAction());

    this.withApiVersion(instance.getApiVersion());

    this.withCount(instance.getCount());

    this.withEventTime(instance.getEventTime());

    this.withFirstTimestamp(instance.getFirstTimestamp());

    this.withInvolvedObject(instance.getInvolvedObject());

    this.withKind(instance.getKind());

    this.withLastTimestamp(instance.getLastTimestamp());

    this.withMessage(instance.getMessage());

    this.withMetadata(instance.getMetadata());

    this.withReason(instance.getReason());

    this.withRelated(instance.getRelated());

    this.withReportingComponent(instance.getReportingComponent());

    this.withReportingInstance(instance.getReportingInstance());

    this.withSeries(instance.getSeries());

    this.withSource(instance.getSource());

    this.withType(instance.getType());
  }

  private java.lang.String action;
  private java.lang.String apiVersion;
  private java.lang.Integer count;
  private java.time.OffsetDateTime eventTime;
  private java.time.OffsetDateTime firstTimestamp;
  private io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder involvedObject;
  private java.lang.String kind;
  private java.time.OffsetDateTime lastTimestamp;
  private java.lang.String message;
  private io.kubernetes.client.openapi.models.V1ObjectMetaBuilder metadata;
  private java.lang.String reason;
  private io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder related;
  private java.lang.String reportingComponent;
  private java.lang.String reportingInstance;
  private io.kubernetes.client.openapi.models.CoreV1EventSeriesBuilder series;
  private io.kubernetes.client.openapi.models.V1EventSourceBuilder source;
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

  public java.lang.Integer getCount() {
    return this.count;
  }

  public A withCount(java.lang.Integer count) {
    this.count = count;
    return (A) this;
  }

  public java.lang.Boolean hasCount() {
    return this.count != null;
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

  public java.time.OffsetDateTime getFirstTimestamp() {
    return this.firstTimestamp;
  }

  public A withFirstTimestamp(java.time.OffsetDateTime firstTimestamp) {
    this.firstTimestamp = firstTimestamp;
    return (A) this;
  }

  public java.lang.Boolean hasFirstTimestamp() {
    return this.firstTimestamp != null;
  }

  /**
   * This method has been deprecated, please use method buildInvolvedObject instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectReference getInvolvedObject() {
    return this.involvedObject != null ? this.involvedObject.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ObjectReference buildInvolvedObject() {
    return this.involvedObject != null ? this.involvedObject.build() : null;
  }

  public A withInvolvedObject(
      io.kubernetes.client.openapi.models.V1ObjectReference involvedObject) {
    _visitables.get("involvedObject").remove(this.involvedObject);
    if (involvedObject != null) {
      this.involvedObject =
          new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(involvedObject);
      _visitables.get("involvedObject").add(this.involvedObject);
    }
    return (A) this;
  }

  public java.lang.Boolean hasInvolvedObject() {
    return this.involvedObject != null;
  }

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.InvolvedObjectNested<A>
      withNewInvolvedObject() {
    return new io.kubernetes.client.openapi.models.CoreV1EventFluentImpl.InvolvedObjectNestedImpl();
  }

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.InvolvedObjectNested<A>
      withNewInvolvedObjectLike(io.kubernetes.client.openapi.models.V1ObjectReference item) {
    return new io.kubernetes.client.openapi.models.CoreV1EventFluentImpl.InvolvedObjectNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.InvolvedObjectNested<A>
      editInvolvedObject() {
    return withNewInvolvedObjectLike(getInvolvedObject());
  }

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.InvolvedObjectNested<A>
      editOrNewInvolvedObject() {
    return withNewInvolvedObjectLike(
        getInvolvedObject() != null
            ? getInvolvedObject()
            : new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.InvolvedObjectNested<A>
      editOrNewInvolvedObjectLike(io.kubernetes.client.openapi.models.V1ObjectReference item) {
    return withNewInvolvedObjectLike(getInvolvedObject() != null ? getInvolvedObject() : item);
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

  public java.time.OffsetDateTime getLastTimestamp() {
    return this.lastTimestamp;
  }

  public A withLastTimestamp(java.time.OffsetDateTime lastTimestamp) {
    this.lastTimestamp = lastTimestamp;
    return (A) this;
  }

  public java.lang.Boolean hasLastTimestamp() {
    return this.lastTimestamp != null;
  }

  public java.lang.String getMessage() {
    return this.message;
  }

  public A withMessage(java.lang.String message) {
    this.message = message;
    return (A) this;
  }

  public java.lang.Boolean hasMessage() {
    return this.message != null;
  }

  /** Method is deprecated. use withMessage instead. */
  @java.lang.Deprecated
  public A withNewMessage(java.lang.String original) {
    return (A) withMessage(new String(original));
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

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.MetadataNested<A> withNewMetadata() {
    return new io.kubernetes.client.openapi.models.CoreV1EventFluentImpl.MetadataNestedImpl();
  }

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.MetadataNested<A>
      withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return new io.kubernetes.client.openapi.models.CoreV1EventFluentImpl.MetadataNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.MetadataNested<A>
      editOrNewMetadata() {
    return withNewMetadataLike(
        getMetadata() != null
            ? getMetadata()
            : new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder().build());
  }

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata() : item);
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

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.RelatedNested<A> withNewRelated() {
    return new io.kubernetes.client.openapi.models.CoreV1EventFluentImpl.RelatedNestedImpl();
  }

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.RelatedNested<A> withNewRelatedLike(
      io.kubernetes.client.openapi.models.V1ObjectReference item) {
    return new io.kubernetes.client.openapi.models.CoreV1EventFluentImpl.RelatedNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.RelatedNested<A> editRelated() {
    return withNewRelatedLike(getRelated());
  }

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.RelatedNested<A> editOrNewRelated() {
    return withNewRelatedLike(
        getRelated() != null
            ? getRelated()
            : new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.RelatedNested<A>
      editOrNewRelatedLike(io.kubernetes.client.openapi.models.V1ObjectReference item) {
    return withNewRelatedLike(getRelated() != null ? getRelated() : item);
  }

  public java.lang.String getReportingComponent() {
    return this.reportingComponent;
  }

  public A withReportingComponent(java.lang.String reportingComponent) {
    this.reportingComponent = reportingComponent;
    return (A) this;
  }

  public java.lang.Boolean hasReportingComponent() {
    return this.reportingComponent != null;
  }

  /** Method is deprecated. use withReportingComponent instead. */
  @java.lang.Deprecated
  public A withNewReportingComponent(java.lang.String original) {
    return (A) withReportingComponent(new String(original));
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
  public io.kubernetes.client.openapi.models.CoreV1EventSeries getSeries() {
    return this.series != null ? this.series.build() : null;
  }

  public io.kubernetes.client.openapi.models.CoreV1EventSeries buildSeries() {
    return this.series != null ? this.series.build() : null;
  }

  public A withSeries(io.kubernetes.client.openapi.models.CoreV1EventSeries series) {
    _visitables.get("series").remove(this.series);
    if (series != null) {
      this.series = new io.kubernetes.client.openapi.models.CoreV1EventSeriesBuilder(series);
      _visitables.get("series").add(this.series);
    }
    return (A) this;
  }

  public java.lang.Boolean hasSeries() {
    return this.series != null;
  }

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.SeriesNested<A> withNewSeries() {
    return new io.kubernetes.client.openapi.models.CoreV1EventFluentImpl.SeriesNestedImpl();
  }

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.SeriesNested<A> withNewSeriesLike(
      io.kubernetes.client.openapi.models.CoreV1EventSeries item) {
    return new io.kubernetes.client.openapi.models.CoreV1EventFluentImpl.SeriesNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.SeriesNested<A> editSeries() {
    return withNewSeriesLike(getSeries());
  }

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.SeriesNested<A> editOrNewSeries() {
    return withNewSeriesLike(
        getSeries() != null
            ? getSeries()
            : new io.kubernetes.client.openapi.models.CoreV1EventSeriesBuilder().build());
  }

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.SeriesNested<A> editOrNewSeriesLike(
      io.kubernetes.client.openapi.models.CoreV1EventSeries item) {
    return withNewSeriesLike(getSeries() != null ? getSeries() : item);
  }

  /**
   * This method has been deprecated, please use method buildSource instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1EventSource getSource() {
    return this.source != null ? this.source.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1EventSource buildSource() {
    return this.source != null ? this.source.build() : null;
  }

  public A withSource(io.kubernetes.client.openapi.models.V1EventSource source) {
    _visitables.get("source").remove(this.source);
    if (source != null) {
      this.source = new io.kubernetes.client.openapi.models.V1EventSourceBuilder(source);
      _visitables.get("source").add(this.source);
    }
    return (A) this;
  }

  public java.lang.Boolean hasSource() {
    return this.source != null;
  }

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.SourceNested<A> withNewSource() {
    return new io.kubernetes.client.openapi.models.CoreV1EventFluentImpl.SourceNestedImpl();
  }

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.SourceNested<A> withNewSourceLike(
      io.kubernetes.client.openapi.models.V1EventSource item) {
    return new io.kubernetes.client.openapi.models.CoreV1EventFluentImpl.SourceNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.SourceNested<A> editSource() {
    return withNewSourceLike(getSource());
  }

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.SourceNested<A> editOrNewSource() {
    return withNewSourceLike(
        getSource() != null
            ? getSource()
            : new io.kubernetes.client.openapi.models.V1EventSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.SourceNested<A> editOrNewSourceLike(
      io.kubernetes.client.openapi.models.V1EventSource item) {
    return withNewSourceLike(getSource() != null ? getSource() : item);
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
    CoreV1EventFluentImpl that = (CoreV1EventFluentImpl) o;
    if (action != null ? !action.equals(that.action) : that.action != null) return false;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) : that.apiVersion != null)
      return false;
    if (count != null ? !count.equals(that.count) : that.count != null) return false;
    if (eventTime != null ? !eventTime.equals(that.eventTime) : that.eventTime != null)
      return false;
    if (firstTimestamp != null
        ? !firstTimestamp.equals(that.firstTimestamp)
        : that.firstTimestamp != null) return false;
    if (involvedObject != null
        ? !involvedObject.equals(that.involvedObject)
        : that.involvedObject != null) return false;
    if (kind != null ? !kind.equals(that.kind) : that.kind != null) return false;
    if (lastTimestamp != null
        ? !lastTimestamp.equals(that.lastTimestamp)
        : that.lastTimestamp != null) return false;
    if (message != null ? !message.equals(that.message) : that.message != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) : that.metadata != null) return false;
    if (reason != null ? !reason.equals(that.reason) : that.reason != null) return false;
    if (related != null ? !related.equals(that.related) : that.related != null) return false;
    if (reportingComponent != null
        ? !reportingComponent.equals(that.reportingComponent)
        : that.reportingComponent != null) return false;
    if (reportingInstance != null
        ? !reportingInstance.equals(that.reportingInstance)
        : that.reportingInstance != null) return false;
    if (series != null ? !series.equals(that.series) : that.series != null) return false;
    if (source != null ? !source.equals(that.source) : that.source != null) return false;
    if (type != null ? !type.equals(that.type) : that.type != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        action,
        apiVersion,
        count,
        eventTime,
        firstTimestamp,
        involvedObject,
        kind,
        lastTimestamp,
        message,
        metadata,
        reason,
        related,
        reportingComponent,
        reportingInstance,
        series,
        source,
        type,
        super.hashCode());
  }

  public class InvolvedObjectNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ObjectReferenceFluentImpl<
          io.kubernetes.client.openapi.models.CoreV1EventFluent.InvolvedObjectNested<N>>
      implements io.kubernetes.client.openapi.models.CoreV1EventFluent.InvolvedObjectNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    InvolvedObjectNestedImpl(io.kubernetes.client.openapi.models.V1ObjectReference item) {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(this, item);
    }

    InvolvedObjectNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder builder;

    public N and() {
      return (N) CoreV1EventFluentImpl.this.withInvolvedObject(builder.build());
    }

    public N endInvolvedObject() {
      return and();
    }
  }

  public class MetadataNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ObjectMetaFluentImpl<
          io.kubernetes.client.openapi.models.CoreV1EventFluent.MetadataNested<N>>
      implements io.kubernetes.client.openapi.models.CoreV1EventFluent.MetadataNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    MetadataNestedImpl(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this, item);
    }

    MetadataNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ObjectMetaBuilder builder;

    public N and() {
      return (N) CoreV1EventFluentImpl.this.withMetadata(builder.build());
    }

    public N endMetadata() {
      return and();
    }
  }

  public class RelatedNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ObjectReferenceFluentImpl<
          io.kubernetes.client.openapi.models.CoreV1EventFluent.RelatedNested<N>>
      implements io.kubernetes.client.openapi.models.CoreV1EventFluent.RelatedNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    RelatedNestedImpl(io.kubernetes.client.openapi.models.V1ObjectReference item) {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(this, item);
    }

    RelatedNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder builder;

    public N and() {
      return (N) CoreV1EventFluentImpl.this.withRelated(builder.build());
    }

    public N endRelated() {
      return and();
    }
  }

  public class SeriesNestedImpl<N>
      extends io.kubernetes.client.openapi.models.CoreV1EventSeriesFluentImpl<
          io.kubernetes.client.openapi.models.CoreV1EventFluent.SeriesNested<N>>
      implements io.kubernetes.client.openapi.models.CoreV1EventFluent.SeriesNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    SeriesNestedImpl(io.kubernetes.client.openapi.models.CoreV1EventSeries item) {
      this.builder = new io.kubernetes.client.openapi.models.CoreV1EventSeriesBuilder(this, item);
    }

    SeriesNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.CoreV1EventSeriesBuilder(this);
    }

    io.kubernetes.client.openapi.models.CoreV1EventSeriesBuilder builder;

    public N and() {
      return (N) CoreV1EventFluentImpl.this.withSeries(builder.build());
    }

    public N endSeries() {
      return and();
    }
  }

  public class SourceNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1EventSourceFluentImpl<
          io.kubernetes.client.openapi.models.CoreV1EventFluent.SourceNested<N>>
      implements io.kubernetes.client.openapi.models.CoreV1EventFluent.SourceNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    SourceNestedImpl(io.kubernetes.client.openapi.models.V1EventSource item) {
      this.builder = new io.kubernetes.client.openapi.models.V1EventSourceBuilder(this, item);
    }

    SourceNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1EventSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1EventSourceBuilder builder;

    public N and() {
      return (N) CoreV1EventFluentImpl.this.withSource(builder.build());
    }

    public N endSource() {
      return and();
    }
  }
}
