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

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.time.OffsetDateTime;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class CoreV1EventFluentImpl<A extends CoreV1EventFluent<A>> extends BaseFluent<A>
    implements CoreV1EventFluent<A> {
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

  private String action;
  private java.lang.String apiVersion;
  private Integer count;
  private OffsetDateTime eventTime;
  private java.time.OffsetDateTime firstTimestamp;
  private V1ObjectReferenceBuilder involvedObject;
  private java.lang.String kind;
  private java.time.OffsetDateTime lastTimestamp;
  private java.lang.String message;
  private V1ObjectMetaBuilder metadata;
  private java.lang.String reason;
  private V1ObjectReferenceBuilder related;
  private java.lang.String reportingComponent;
  private java.lang.String reportingInstance;
  private CoreV1EventSeriesBuilder series;
  private V1EventSourceBuilder source;
  private java.lang.String type;

  public java.lang.String getAction() {
    return this.action;
  }

  public A withAction(java.lang.String action) {
    this.action = action;
    return (A) this;
  }

  public Boolean hasAction() {
    return this.action != null;
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
  @Deprecated
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

  public CoreV1EventFluent.InvolvedObjectNested<A> withNewInvolvedObject() {
    return new CoreV1EventFluentImpl.InvolvedObjectNestedImpl();
  }

  public io.kubernetes.client.openapi.models.CoreV1EventFluent.InvolvedObjectNested<A>
      withNewInvolvedObjectLike(io.kubernetes.client.openapi.models.V1ObjectReference item) {
    return new CoreV1EventFluentImpl.InvolvedObjectNestedImpl(item);
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
      this.metadata = new V1ObjectMetaBuilder(metadata);
      _visitables.get("metadata").add(this.metadata);
    }
    return (A) this;
  }

  public java.lang.Boolean hasMetadata() {
    return this.metadata != null;
  }

  public CoreV1EventFluent.MetadataNested<A> withNewMetadata() {
    return new CoreV1EventFluentImpl.MetadataNestedImpl();
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

  public CoreV1EventFluent.RelatedNested<A> withNewRelated() {
    return new CoreV1EventFluentImpl.RelatedNestedImpl();
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

  /**
   * This method has been deprecated, please use method buildSeries instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public CoreV1EventSeries getSeries() {
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

  public CoreV1EventFluent.SeriesNested<A> withNewSeries() {
    return new CoreV1EventFluentImpl.SeriesNestedImpl();
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
  public V1EventSource getSource() {
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

  public CoreV1EventFluent.SourceNested<A> withNewSource() {
    return new CoreV1EventFluentImpl.SourceNestedImpl();
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

  public boolean equals(Object o) {
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

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (action != null) {
      sb.append("action:");
      sb.append(action + ",");
    }
    if (apiVersion != null) {
      sb.append("apiVersion:");
      sb.append(apiVersion + ",");
    }
    if (count != null) {
      sb.append("count:");
      sb.append(count + ",");
    }
    if (eventTime != null) {
      sb.append("eventTime:");
      sb.append(eventTime + ",");
    }
    if (firstTimestamp != null) {
      sb.append("firstTimestamp:");
      sb.append(firstTimestamp + ",");
    }
    if (involvedObject != null) {
      sb.append("involvedObject:");
      sb.append(involvedObject + ",");
    }
    if (kind != null) {
      sb.append("kind:");
      sb.append(kind + ",");
    }
    if (lastTimestamp != null) {
      sb.append("lastTimestamp:");
      sb.append(lastTimestamp + ",");
    }
    if (message != null) {
      sb.append("message:");
      sb.append(message + ",");
    }
    if (metadata != null) {
      sb.append("metadata:");
      sb.append(metadata + ",");
    }
    if (reason != null) {
      sb.append("reason:");
      sb.append(reason + ",");
    }
    if (related != null) {
      sb.append("related:");
      sb.append(related + ",");
    }
    if (reportingComponent != null) {
      sb.append("reportingComponent:");
      sb.append(reportingComponent + ",");
    }
    if (reportingInstance != null) {
      sb.append("reportingInstance:");
      sb.append(reportingInstance + ",");
    }
    if (series != null) {
      sb.append("series:");
      sb.append(series + ",");
    }
    if (source != null) {
      sb.append("source:");
      sb.append(source + ",");
    }
    if (type != null) {
      sb.append("type:");
      sb.append(type);
    }
    sb.append("}");
    return sb.toString();
  }

  class InvolvedObjectNestedImpl<N>
      extends V1ObjectReferenceFluentImpl<CoreV1EventFluent.InvolvedObjectNested<N>>
      implements io.kubernetes.client.openapi.models.CoreV1EventFluent.InvolvedObjectNested<N>,
          Nested<N> {
    InvolvedObjectNestedImpl(io.kubernetes.client.openapi.models.V1ObjectReference item) {
      this.builder = new V1ObjectReferenceBuilder(this, item);
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

  class MetadataNestedImpl<N> extends V1ObjectMetaFluentImpl<CoreV1EventFluent.MetadataNested<N>>
      implements io.kubernetes.client.openapi.models.CoreV1EventFluent.MetadataNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
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

  class RelatedNestedImpl<N> extends V1ObjectReferenceFluentImpl<CoreV1EventFluent.RelatedNested<N>>
      implements io.kubernetes.client.openapi.models.CoreV1EventFluent.RelatedNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    RelatedNestedImpl(io.kubernetes.client.openapi.models.V1ObjectReference item) {
      this.builder = new V1ObjectReferenceBuilder(this, item);
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

  class SeriesNestedImpl<N> extends CoreV1EventSeriesFluentImpl<CoreV1EventFluent.SeriesNested<N>>
      implements io.kubernetes.client.openapi.models.CoreV1EventFluent.SeriesNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    SeriesNestedImpl(CoreV1EventSeries item) {
      this.builder = new CoreV1EventSeriesBuilder(this, item);
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

  class SourceNestedImpl<N> extends V1EventSourceFluentImpl<CoreV1EventFluent.SourceNested<N>>
      implements io.kubernetes.client.openapi.models.CoreV1EventFluent.SourceNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    SourceNestedImpl(V1EventSource item) {
      this.builder = new V1EventSourceBuilder(this, item);
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
