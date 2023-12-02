package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Integer;
import java.time.OffsetDateTime;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class EventsV1EventFluent<A extends EventsV1EventFluent<A>> extends BaseFluent<A>{
  public EventsV1EventFluent() {
  }
  
  public EventsV1EventFluent(EventsV1Event instance) {
    this.copyInstance(instance);
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
  
  protected void copyInstance(EventsV1Event instance) {
    instance = (instance != null ? instance : new EventsV1Event());
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
  
  public String getAction() {
    return this.action;
  }
  
  public A withAction(String action) {
    this.action = action;
    return (A) this;
  }
  
  public boolean hasAction() {
    return this.action != null;
  }
  
  public String getApiVersion() {
    return this.apiVersion;
  }
  
  public A withApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }
  
  public boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  
  public Integer getDeprecatedCount() {
    return this.deprecatedCount;
  }
  
  public A withDeprecatedCount(Integer deprecatedCount) {
    this.deprecatedCount = deprecatedCount;
    return (A) this;
  }
  
  public boolean hasDeprecatedCount() {
    return this.deprecatedCount != null;
  }
  
  public OffsetDateTime getDeprecatedFirstTimestamp() {
    return this.deprecatedFirstTimestamp;
  }
  
  public A withDeprecatedFirstTimestamp(OffsetDateTime deprecatedFirstTimestamp) {
    this.deprecatedFirstTimestamp = deprecatedFirstTimestamp;
    return (A) this;
  }
  
  public boolean hasDeprecatedFirstTimestamp() {
    return this.deprecatedFirstTimestamp != null;
  }
  
  public OffsetDateTime getDeprecatedLastTimestamp() {
    return this.deprecatedLastTimestamp;
  }
  
  public A withDeprecatedLastTimestamp(OffsetDateTime deprecatedLastTimestamp) {
    this.deprecatedLastTimestamp = deprecatedLastTimestamp;
    return (A) this;
  }
  
  public boolean hasDeprecatedLastTimestamp() {
    return this.deprecatedLastTimestamp != null;
  }
  
  public V1EventSource buildDeprecatedSource() {
    return this.deprecatedSource != null ? this.deprecatedSource.build() : null;
  }
  
  public A withDeprecatedSource(V1EventSource deprecatedSource) {
    this._visitables.remove("deprecatedSource");
    if (deprecatedSource != null) {
        this.deprecatedSource = new V1EventSourceBuilder(deprecatedSource);
        this._visitables.get("deprecatedSource").add(this.deprecatedSource);
    } else {
        this.deprecatedSource = null;
        this._visitables.get("deprecatedSource").remove(this.deprecatedSource);
    }
    return (A) this;
  }
  
  public boolean hasDeprecatedSource() {
    return this.deprecatedSource != null;
  }
  
  public DeprecatedSourceNested<A> withNewDeprecatedSource() {
    return new DeprecatedSourceNested(null);
  }
  
  public DeprecatedSourceNested<A> withNewDeprecatedSourceLike(V1EventSource item) {
    return new DeprecatedSourceNested(item);
  }
  
  public DeprecatedSourceNested<A> editDeprecatedSource() {
    return withNewDeprecatedSourceLike(java.util.Optional.ofNullable(buildDeprecatedSource()).orElse(null));
  }
  
  public DeprecatedSourceNested<A> editOrNewDeprecatedSource() {
    return withNewDeprecatedSourceLike(java.util.Optional.ofNullable(buildDeprecatedSource()).orElse(new V1EventSourceBuilder().build()));
  }
  
  public DeprecatedSourceNested<A> editOrNewDeprecatedSourceLike(V1EventSource item) {
    return withNewDeprecatedSourceLike(java.util.Optional.ofNullable(buildDeprecatedSource()).orElse(item));
  }
  
  public OffsetDateTime getEventTime() {
    return this.eventTime;
  }
  
  public A withEventTime(OffsetDateTime eventTime) {
    this.eventTime = eventTime;
    return (A) this;
  }
  
  public boolean hasEventTime() {
    return this.eventTime != null;
  }
  
  public String getKind() {
    return this.kind;
  }
  
  public A withKind(String kind) {
    this.kind = kind;
    return (A) this;
  }
  
  public boolean hasKind() {
    return this.kind != null;
  }
  
  public V1ObjectMeta buildMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }
  
  public A withMetadata(V1ObjectMeta metadata) {
    this._visitables.remove("metadata");
    if (metadata != null) {
        this.metadata = new V1ObjectMetaBuilder(metadata);
        this._visitables.get("metadata").add(this.metadata);
    } else {
        this.metadata = null;
        this._visitables.get("metadata").remove(this.metadata);
    }
    return (A) this;
  }
  
  public boolean hasMetadata() {
    return this.metadata != null;
  }
  
  public MetadataNested<A> withNewMetadata() {
    return new MetadataNested(null);
  }
  
  public MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new MetadataNested(item);
  }
  
  public MetadataNested<A> editMetadata() {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(null));
  }
  
  public MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(new V1ObjectMetaBuilder().build()));
  }
  
  public MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(item));
  }
  
  public String getNote() {
    return this.note;
  }
  
  public A withNote(String note) {
    this.note = note;
    return (A) this;
  }
  
  public boolean hasNote() {
    return this.note != null;
  }
  
  public String getReason() {
    return this.reason;
  }
  
  public A withReason(String reason) {
    this.reason = reason;
    return (A) this;
  }
  
  public boolean hasReason() {
    return this.reason != null;
  }
  
  public V1ObjectReference buildRegarding() {
    return this.regarding != null ? this.regarding.build() : null;
  }
  
  public A withRegarding(V1ObjectReference regarding) {
    this._visitables.remove("regarding");
    if (regarding != null) {
        this.regarding = new V1ObjectReferenceBuilder(regarding);
        this._visitables.get("regarding").add(this.regarding);
    } else {
        this.regarding = null;
        this._visitables.get("regarding").remove(this.regarding);
    }
    return (A) this;
  }
  
  public boolean hasRegarding() {
    return this.regarding != null;
  }
  
  public RegardingNested<A> withNewRegarding() {
    return new RegardingNested(null);
  }
  
  public RegardingNested<A> withNewRegardingLike(V1ObjectReference item) {
    return new RegardingNested(item);
  }
  
  public RegardingNested<A> editRegarding() {
    return withNewRegardingLike(java.util.Optional.ofNullable(buildRegarding()).orElse(null));
  }
  
  public RegardingNested<A> editOrNewRegarding() {
    return withNewRegardingLike(java.util.Optional.ofNullable(buildRegarding()).orElse(new V1ObjectReferenceBuilder().build()));
  }
  
  public RegardingNested<A> editOrNewRegardingLike(V1ObjectReference item) {
    return withNewRegardingLike(java.util.Optional.ofNullable(buildRegarding()).orElse(item));
  }
  
  public V1ObjectReference buildRelated() {
    return this.related != null ? this.related.build() : null;
  }
  
  public A withRelated(V1ObjectReference related) {
    this._visitables.remove("related");
    if (related != null) {
        this.related = new V1ObjectReferenceBuilder(related);
        this._visitables.get("related").add(this.related);
    } else {
        this.related = null;
        this._visitables.get("related").remove(this.related);
    }
    return (A) this;
  }
  
  public boolean hasRelated() {
    return this.related != null;
  }
  
  public RelatedNested<A> withNewRelated() {
    return new RelatedNested(null);
  }
  
  public RelatedNested<A> withNewRelatedLike(V1ObjectReference item) {
    return new RelatedNested(item);
  }
  
  public RelatedNested<A> editRelated() {
    return withNewRelatedLike(java.util.Optional.ofNullable(buildRelated()).orElse(null));
  }
  
  public RelatedNested<A> editOrNewRelated() {
    return withNewRelatedLike(java.util.Optional.ofNullable(buildRelated()).orElse(new V1ObjectReferenceBuilder().build()));
  }
  
  public RelatedNested<A> editOrNewRelatedLike(V1ObjectReference item) {
    return withNewRelatedLike(java.util.Optional.ofNullable(buildRelated()).orElse(item));
  }
  
  public String getReportingController() {
    return this.reportingController;
  }
  
  public A withReportingController(String reportingController) {
    this.reportingController = reportingController;
    return (A) this;
  }
  
  public boolean hasReportingController() {
    return this.reportingController != null;
  }
  
  public String getReportingInstance() {
    return this.reportingInstance;
  }
  
  public A withReportingInstance(String reportingInstance) {
    this.reportingInstance = reportingInstance;
    return (A) this;
  }
  
  public boolean hasReportingInstance() {
    return this.reportingInstance != null;
  }
  
  public EventsV1EventSeries buildSeries() {
    return this.series != null ? this.series.build() : null;
  }
  
  public A withSeries(EventsV1EventSeries series) {
    this._visitables.remove("series");
    if (series != null) {
        this.series = new EventsV1EventSeriesBuilder(series);
        this._visitables.get("series").add(this.series);
    } else {
        this.series = null;
        this._visitables.get("series").remove(this.series);
    }
    return (A) this;
  }
  
  public boolean hasSeries() {
    return this.series != null;
  }
  
  public SeriesNested<A> withNewSeries() {
    return new SeriesNested(null);
  }
  
  public SeriesNested<A> withNewSeriesLike(EventsV1EventSeries item) {
    return new SeriesNested(item);
  }
  
  public SeriesNested<A> editSeries() {
    return withNewSeriesLike(java.util.Optional.ofNullable(buildSeries()).orElse(null));
  }
  
  public SeriesNested<A> editOrNewSeries() {
    return withNewSeriesLike(java.util.Optional.ofNullable(buildSeries()).orElse(new EventsV1EventSeriesBuilder().build()));
  }
  
  public SeriesNested<A> editOrNewSeriesLike(EventsV1EventSeries item) {
    return withNewSeriesLike(java.util.Optional.ofNullable(buildSeries()).orElse(item));
  }
  
  public String getType() {
    return this.type;
  }
  
  public A withType(String type) {
    this.type = type;
    return (A) this;
  }
  
  public boolean hasType() {
    return this.type != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    EventsV1EventFluent that = (EventsV1EventFluent) o;
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
  public class DeprecatedSourceNested<N> extends V1EventSourceFluent<DeprecatedSourceNested<N>> implements Nested<N>{
    DeprecatedSourceNested(V1EventSource item) {
      this.builder = new V1EventSourceBuilder(this, item);
    }
    V1EventSourceBuilder builder;
    
    public N and() {
      return (N) EventsV1EventFluent.this.withDeprecatedSource(builder.build());
    }
    
    public N endDeprecatedSource() {
      return and();
    }
    
  
  }
  public class MetadataNested<N> extends V1ObjectMetaFluent<MetadataNested<N>> implements Nested<N>{
    MetadataNested(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    V1ObjectMetaBuilder builder;
    
    public N and() {
      return (N) EventsV1EventFluent.this.withMetadata(builder.build());
    }
    
    public N endMetadata() {
      return and();
    }
    
  
  }
  public class RegardingNested<N> extends V1ObjectReferenceFluent<RegardingNested<N>> implements Nested<N>{
    RegardingNested(V1ObjectReference item) {
      this.builder = new V1ObjectReferenceBuilder(this, item);
    }
    V1ObjectReferenceBuilder builder;
    
    public N and() {
      return (N) EventsV1EventFluent.this.withRegarding(builder.build());
    }
    
    public N endRegarding() {
      return and();
    }
    
  
  }
  public class RelatedNested<N> extends V1ObjectReferenceFluent<RelatedNested<N>> implements Nested<N>{
    RelatedNested(V1ObjectReference item) {
      this.builder = new V1ObjectReferenceBuilder(this, item);
    }
    V1ObjectReferenceBuilder builder;
    
    public N and() {
      return (N) EventsV1EventFluent.this.withRelated(builder.build());
    }
    
    public N endRelated() {
      return and();
    }
    
  
  }
  public class SeriesNested<N> extends EventsV1EventSeriesFluent<SeriesNested<N>> implements Nested<N>{
    SeriesNested(EventsV1EventSeries item) {
      this.builder = new EventsV1EventSeriesBuilder(this, item);
    }
    EventsV1EventSeriesBuilder builder;
    
    public N and() {
      return (N) EventsV1EventFluent.this.withSeries(builder.build());
    }
    
    public N endSeries() {
      return and();
    }
    
  
  }

}