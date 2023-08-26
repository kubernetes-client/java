package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Boolean;
import java.lang.Integer;
import java.time.OffsetDateTime;
import java.lang.Object;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class EventsV1EventFluentImpl<A extends EventsV1EventFluent<A>> extends BaseFluent<A> implements EventsV1EventFluent<A>{
  public EventsV1EventFluentImpl() {
  }
  public EventsV1EventFluentImpl(EventsV1Event instance) {
    if (instance != null) {
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
  }
  private String action;
  private String apiVersion;
  private Integer deprecatedCount;
  private OffsetDateTime deprecatedFirstTimestamp;
  private OffsetDateTime deprecatedLastTimestamp;
  private V1EventSourceBuilder deprecatedSource;
  private OffsetDateTime eventTime;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private String note;
  private String reason;
  private V1ObjectReferenceBuilder regarding;
  private V1ObjectReferenceBuilder related;
  private String reportingController;
  private String reportingInstance;
  private EventsV1EventSeriesBuilder series;
  private String type;
  public String getAction() {
    return this.action;
  }
  public A withAction(String action) {
    this.action=action; return (A) this;
  }
  public Boolean hasAction() {
    return this.action != null;
  }
  public String getApiVersion() {
    return this.apiVersion;
  }
  public A withApiVersion(String apiVersion) {
    this.apiVersion=apiVersion; return (A) this;
  }
  public Boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  public Integer getDeprecatedCount() {
    return this.deprecatedCount;
  }
  public A withDeprecatedCount(Integer deprecatedCount) {
    this.deprecatedCount=deprecatedCount; return (A) this;
  }
  public Boolean hasDeprecatedCount() {
    return this.deprecatedCount != null;
  }
  public OffsetDateTime getDeprecatedFirstTimestamp() {
    return this.deprecatedFirstTimestamp;
  }
  public A withDeprecatedFirstTimestamp(OffsetDateTime deprecatedFirstTimestamp) {
    this.deprecatedFirstTimestamp=deprecatedFirstTimestamp; return (A) this;
  }
  public Boolean hasDeprecatedFirstTimestamp() {
    return this.deprecatedFirstTimestamp != null;
  }
  public OffsetDateTime getDeprecatedLastTimestamp() {
    return this.deprecatedLastTimestamp;
  }
  public A withDeprecatedLastTimestamp(OffsetDateTime deprecatedLastTimestamp) {
    this.deprecatedLastTimestamp=deprecatedLastTimestamp; return (A) this;
  }
  public Boolean hasDeprecatedLastTimestamp() {
    return this.deprecatedLastTimestamp != null;
  }
  
  /**
   * This method has been deprecated, please use method buildDeprecatedSource instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1EventSource getDeprecatedSource() {
    return this.deprecatedSource!=null ?this.deprecatedSource.build():null;
  }
  public V1EventSource buildDeprecatedSource() {
    return this.deprecatedSource!=null ?this.deprecatedSource.build():null;
  }
  public A withDeprecatedSource(V1EventSource deprecatedSource) {
    _visitables.get("deprecatedSource").remove(this.deprecatedSource);
    if (deprecatedSource!=null){ this.deprecatedSource= new V1EventSourceBuilder(deprecatedSource); _visitables.get("deprecatedSource").add(this.deprecatedSource);} else { this.deprecatedSource = null; _visitables.get("deprecatedSource").remove(this.deprecatedSource); } return (A) this;
  }
  public Boolean hasDeprecatedSource() {
    return this.deprecatedSource != null;
  }
  public EventsV1EventFluentImpl.DeprecatedSourceNested<A> withNewDeprecatedSource() {
    return new EventsV1EventFluentImpl.DeprecatedSourceNestedImpl();
  }
  public EventsV1EventFluentImpl.DeprecatedSourceNested<A> withNewDeprecatedSourceLike(V1EventSource item) {
    return new EventsV1EventFluentImpl.DeprecatedSourceNestedImpl(item);
  }
  public EventsV1EventFluentImpl.DeprecatedSourceNested<A> editDeprecatedSource() {
    return withNewDeprecatedSourceLike(getDeprecatedSource());
  }
  public EventsV1EventFluentImpl.DeprecatedSourceNested<A> editOrNewDeprecatedSource() {
    return withNewDeprecatedSourceLike(getDeprecatedSource() != null ? getDeprecatedSource(): new V1EventSourceBuilder().build());
  }
  public EventsV1EventFluentImpl.DeprecatedSourceNested<A> editOrNewDeprecatedSourceLike(V1EventSource item) {
    return withNewDeprecatedSourceLike(getDeprecatedSource() != null ? getDeprecatedSource(): item);
  }
  public OffsetDateTime getEventTime() {
    return this.eventTime;
  }
  public A withEventTime(OffsetDateTime eventTime) {
    this.eventTime=eventTime; return (A) this;
  }
  public Boolean hasEventTime() {
    return this.eventTime != null;
  }
  public String getKind() {
    return this.kind;
  }
  public A withKind(String kind) {
    this.kind=kind; return (A) this;
  }
  public Boolean hasKind() {
    return this.kind != null;
  }
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata() {
    return this.metadata!=null ?this.metadata.build():null;
  }
  public V1ObjectMeta buildMetadata() {
    return this.metadata!=null ?this.metadata.build():null;
  }
  public A withMetadata(V1ObjectMeta metadata) {
    _visitables.get("metadata").remove(this.metadata);
    if (metadata!=null){ this.metadata= new V1ObjectMetaBuilder(metadata); _visitables.get("metadata").add(this.metadata);} else { this.metadata = null; _visitables.get("metadata").remove(this.metadata); } return (A) this;
  }
  public Boolean hasMetadata() {
    return this.metadata != null;
  }
  public EventsV1EventFluentImpl.MetadataNested<A> withNewMetadata() {
    return new EventsV1EventFluentImpl.MetadataNestedImpl();
  }
  public EventsV1EventFluentImpl.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new EventsV1EventFluentImpl.MetadataNestedImpl(item);
  }
  public EventsV1EventFluentImpl.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public EventsV1EventFluentImpl.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new V1ObjectMetaBuilder().build());
  }
  public EventsV1EventFluentImpl.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  public String getNote() {
    return this.note;
  }
  public A withNote(String note) {
    this.note=note; return (A) this;
  }
  public Boolean hasNote() {
    return this.note != null;
  }
  public String getReason() {
    return this.reason;
  }
  public A withReason(String reason) {
    this.reason=reason; return (A) this;
  }
  public Boolean hasReason() {
    return this.reason != null;
  }
  
  /**
   * This method has been deprecated, please use method buildRegarding instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectReference getRegarding() {
    return this.regarding!=null ?this.regarding.build():null;
  }
  public V1ObjectReference buildRegarding() {
    return this.regarding!=null ?this.regarding.build():null;
  }
  public A withRegarding(V1ObjectReference regarding) {
    _visitables.get("regarding").remove(this.regarding);
    if (regarding!=null){ this.regarding= new V1ObjectReferenceBuilder(regarding); _visitables.get("regarding").add(this.regarding);} else { this.regarding = null; _visitables.get("regarding").remove(this.regarding); } return (A) this;
  }
  public Boolean hasRegarding() {
    return this.regarding != null;
  }
  public EventsV1EventFluentImpl.RegardingNested<A> withNewRegarding() {
    return new EventsV1EventFluentImpl.RegardingNestedImpl();
  }
  public EventsV1EventFluentImpl.RegardingNested<A> withNewRegardingLike(V1ObjectReference item) {
    return new EventsV1EventFluentImpl.RegardingNestedImpl(item);
  }
  public EventsV1EventFluentImpl.RegardingNested<A> editRegarding() {
    return withNewRegardingLike(getRegarding());
  }
  public EventsV1EventFluentImpl.RegardingNested<A> editOrNewRegarding() {
    return withNewRegardingLike(getRegarding() != null ? getRegarding(): new V1ObjectReferenceBuilder().build());
  }
  public EventsV1EventFluentImpl.RegardingNested<A> editOrNewRegardingLike(V1ObjectReference item) {
    return withNewRegardingLike(getRegarding() != null ? getRegarding(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildRelated instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectReference getRelated() {
    return this.related!=null ?this.related.build():null;
  }
  public V1ObjectReference buildRelated() {
    return this.related!=null ?this.related.build():null;
  }
  public A withRelated(V1ObjectReference related) {
    _visitables.get("related").remove(this.related);
    if (related!=null){ this.related= new V1ObjectReferenceBuilder(related); _visitables.get("related").add(this.related);} else { this.related = null; _visitables.get("related").remove(this.related); } return (A) this;
  }
  public Boolean hasRelated() {
    return this.related != null;
  }
  public EventsV1EventFluentImpl.RelatedNested<A> withNewRelated() {
    return new EventsV1EventFluentImpl.RelatedNestedImpl();
  }
  public EventsV1EventFluentImpl.RelatedNested<A> withNewRelatedLike(V1ObjectReference item) {
    return new EventsV1EventFluentImpl.RelatedNestedImpl(item);
  }
  public EventsV1EventFluentImpl.RelatedNested<A> editRelated() {
    return withNewRelatedLike(getRelated());
  }
  public EventsV1EventFluentImpl.RelatedNested<A> editOrNewRelated() {
    return withNewRelatedLike(getRelated() != null ? getRelated(): new V1ObjectReferenceBuilder().build());
  }
  public EventsV1EventFluentImpl.RelatedNested<A> editOrNewRelatedLike(V1ObjectReference item) {
    return withNewRelatedLike(getRelated() != null ? getRelated(): item);
  }
  public String getReportingController() {
    return this.reportingController;
  }
  public A withReportingController(String reportingController) {
    this.reportingController=reportingController; return (A) this;
  }
  public Boolean hasReportingController() {
    return this.reportingController != null;
  }
  public String getReportingInstance() {
    return this.reportingInstance;
  }
  public A withReportingInstance(String reportingInstance) {
    this.reportingInstance=reportingInstance; return (A) this;
  }
  public Boolean hasReportingInstance() {
    return this.reportingInstance != null;
  }
  
  /**
   * This method has been deprecated, please use method buildSeries instead.
   * @return The buildable object.
   */
  @Deprecated
  public EventsV1EventSeries getSeries() {
    return this.series!=null ?this.series.build():null;
  }
  public EventsV1EventSeries buildSeries() {
    return this.series!=null ?this.series.build():null;
  }
  public A withSeries(EventsV1EventSeries series) {
    _visitables.get("series").remove(this.series);
    if (series!=null){ this.series= new EventsV1EventSeriesBuilder(series); _visitables.get("series").add(this.series);} else { this.series = null; _visitables.get("series").remove(this.series); } return (A) this;
  }
  public Boolean hasSeries() {
    return this.series != null;
  }
  public EventsV1EventFluentImpl.SeriesNested<A> withNewSeries() {
    return new EventsV1EventFluentImpl.SeriesNestedImpl();
  }
  public EventsV1EventFluentImpl.SeriesNested<A> withNewSeriesLike(EventsV1EventSeries item) {
    return new EventsV1EventFluentImpl.SeriesNestedImpl(item);
  }
  public EventsV1EventFluentImpl.SeriesNested<A> editSeries() {
    return withNewSeriesLike(getSeries());
  }
  public EventsV1EventFluentImpl.SeriesNested<A> editOrNewSeries() {
    return withNewSeriesLike(getSeries() != null ? getSeries(): new EventsV1EventSeriesBuilder().build());
  }
  public EventsV1EventFluentImpl.SeriesNested<A> editOrNewSeriesLike(EventsV1EventSeries item) {
    return withNewSeriesLike(getSeries() != null ? getSeries(): item);
  }
  public String getType() {
    return this.type;
  }
  public A withType(String type) {
    this.type=type; return (A) this;
  }
  public Boolean hasType() {
    return this.type != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    EventsV1EventFluentImpl that = (EventsV1EventFluentImpl) o;
    if (!java.util.Objects.equals(action, that.action)) return false;

    if (!java.util.Objects.equals(apiVersion, that.apiVersion)) return false;

    if (!java.util.Objects.equals(deprecatedCount, that.deprecatedCount)) return false;

    if (!java.util.Objects.equals(deprecatedFirstTimestamp, that.deprecatedFirstTimestamp)) return false;

    if (!java.util.Objects.equals(deprecatedLastTimestamp, that.deprecatedLastTimestamp)) return false;

    if (!java.util.Objects.equals(deprecatedSource, that.deprecatedSource)) return false;

    if (!java.util.Objects.equals(eventTime, that.eventTime)) return false;

    if (!java.util.Objects.equals(kind, that.kind)) return false;

    if (!java.util.Objects.equals(metadata, that.metadata)) return false;

    if (!java.util.Objects.equals(note, that.note)) return false;

    if (!java.util.Objects.equals(reason, that.reason)) return false;

    if (!java.util.Objects.equals(regarding, that.regarding)) return false;

    if (!java.util.Objects.equals(related, that.related)) return false;

    if (!java.util.Objects.equals(reportingController, that.reportingController)) return false;

    if (!java.util.Objects.equals(reportingInstance, that.reportingInstance)) return false;

    if (!java.util.Objects.equals(series, that.series)) return false;

    if (!java.util.Objects.equals(type, that.type)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(action,  apiVersion,  deprecatedCount,  deprecatedFirstTimestamp,  deprecatedLastTimestamp,  deprecatedSource,  eventTime,  kind,  metadata,  note,  reason,  regarding,  related,  reportingController,  reportingInstance,  series,  type,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (action != null) { sb.append("action:"); sb.append(action + ","); }
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (deprecatedCount != null) { sb.append("deprecatedCount:"); sb.append(deprecatedCount + ","); }
    if (deprecatedFirstTimestamp != null) { sb.append("deprecatedFirstTimestamp:"); sb.append(deprecatedFirstTimestamp + ","); }
    if (deprecatedLastTimestamp != null) { sb.append("deprecatedLastTimestamp:"); sb.append(deprecatedLastTimestamp + ","); }
    if (deprecatedSource != null) { sb.append("deprecatedSource:"); sb.append(deprecatedSource + ","); }
    if (eventTime != null) { sb.append("eventTime:"); sb.append(eventTime + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata + ","); }
    if (note != null) { sb.append("note:"); sb.append(note + ","); }
    if (reason != null) { sb.append("reason:"); sb.append(reason + ","); }
    if (regarding != null) { sb.append("regarding:"); sb.append(regarding + ","); }
    if (related != null) { sb.append("related:"); sb.append(related + ","); }
    if (reportingController != null) { sb.append("reportingController:"); sb.append(reportingController + ","); }
    if (reportingInstance != null) { sb.append("reportingInstance:"); sb.append(reportingInstance + ","); }
    if (series != null) { sb.append("series:"); sb.append(series + ","); }
    if (type != null) { sb.append("type:"); sb.append(type); }
    sb.append("}");
    return sb.toString();
  }
  class DeprecatedSourceNestedImpl<N> extends V1EventSourceFluentImpl<EventsV1EventFluentImpl.DeprecatedSourceNested<N>> implements EventsV1EventFluentImpl.DeprecatedSourceNested<N>,Nested<N>{
    DeprecatedSourceNestedImpl(V1EventSource item) {
      this.builder = new V1EventSourceBuilder(this, item);
    }
    DeprecatedSourceNestedImpl() {
      this.builder = new V1EventSourceBuilder(this);
    }
    V1EventSourceBuilder builder;
    public N and() {
      return (N) EventsV1EventFluentImpl.this.withDeprecatedSource(builder.build());
    }
    public N endDeprecatedSource() {
      return and();
    }
    
  }
  class MetadataNestedImpl<N> extends V1ObjectMetaFluentImpl<EventsV1EventFluentImpl.MetadataNested<N>> implements EventsV1EventFluentImpl.MetadataNested<N>,Nested<N>{
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new V1ObjectMetaBuilder(this);
    }
    V1ObjectMetaBuilder builder;
    public N and() {
      return (N) EventsV1EventFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  class RegardingNestedImpl<N> extends V1ObjectReferenceFluentImpl<EventsV1EventFluentImpl.RegardingNested<N>> implements EventsV1EventFluentImpl.RegardingNested<N>,Nested<N>{
    RegardingNestedImpl(V1ObjectReference item) {
      this.builder = new V1ObjectReferenceBuilder(this, item);
    }
    RegardingNestedImpl() {
      this.builder = new V1ObjectReferenceBuilder(this);
    }
    V1ObjectReferenceBuilder builder;
    public N and() {
      return (N) EventsV1EventFluentImpl.this.withRegarding(builder.build());
    }
    public N endRegarding() {
      return and();
    }
    
  }
  class RelatedNestedImpl<N> extends V1ObjectReferenceFluentImpl<EventsV1EventFluentImpl.RelatedNested<N>> implements EventsV1EventFluentImpl.RelatedNested<N>,Nested<N>{
    RelatedNestedImpl(V1ObjectReference item) {
      this.builder = new V1ObjectReferenceBuilder(this, item);
    }
    RelatedNestedImpl() {
      this.builder = new V1ObjectReferenceBuilder(this);
    }
    V1ObjectReferenceBuilder builder;
    public N and() {
      return (N) EventsV1EventFluentImpl.this.withRelated(builder.build());
    }
    public N endRelated() {
      return and();
    }
    
  }
  class SeriesNestedImpl<N> extends EventsV1EventSeriesFluentImpl<EventsV1EventFluentImpl.SeriesNested<N>> implements EventsV1EventFluentImpl.SeriesNested<N>,Nested<N>{
    SeriesNestedImpl(EventsV1EventSeries item) {
      this.builder = new EventsV1EventSeriesBuilder(this, item);
    }
    SeriesNestedImpl() {
      this.builder = new EventsV1EventSeriesBuilder(this);
    }
    EventsV1EventSeriesBuilder builder;
    public N and() {
      return (N) EventsV1EventFluentImpl.this.withSeries(builder.build());
    }
    public N endSeries() {
      return and();
    }
    
  }
  
}