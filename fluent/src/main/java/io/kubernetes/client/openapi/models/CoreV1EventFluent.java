package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Optional;
import java.lang.Integer;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class CoreV1EventFluent<A extends io.kubernetes.client.openapi.models.CoreV1EventFluent<A>> extends BaseFluent<A>{
  public CoreV1EventFluent() {
  }
  
  public CoreV1EventFluent(CoreV1Event instance) {
    this.copyInstance(instance);
  }
  private String action;
  private String apiVersion;
  private Integer count;
  private OffsetDateTime eventTime;
  private OffsetDateTime firstTimestamp;
  private V1ObjectReferenceBuilder involvedObject;
  private String kind;
  private OffsetDateTime lastTimestamp;
  private String message;
  private V1ObjectMetaBuilder metadata;
  private String reason;
  private V1ObjectReferenceBuilder related;
  private String reportingComponent;
  private String reportingInstance;
  private CoreV1EventSeriesBuilder series;
  private V1EventSourceBuilder source;
  private String type;
  
  protected void copyInstance(CoreV1Event instance) {
    instance = instance != null ? instance : new CoreV1Event();
    if (instance != null) {
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
  
  public Integer getCount() {
    return this.count;
  }
  
  public A withCount(Integer count) {
    this.count = count;
    return (A) this;
  }
  
  public boolean hasCount() {
    return this.count != null;
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
  
  public OffsetDateTime getFirstTimestamp() {
    return this.firstTimestamp;
  }
  
  public A withFirstTimestamp(OffsetDateTime firstTimestamp) {
    this.firstTimestamp = firstTimestamp;
    return (A) this;
  }
  
  public boolean hasFirstTimestamp() {
    return this.firstTimestamp != null;
  }
  
  public V1ObjectReference buildInvolvedObject() {
    return this.involvedObject != null ? this.involvedObject.build() : null;
  }
  
  public A withInvolvedObject(V1ObjectReference involvedObject) {
    this._visitables.remove("involvedObject");
    if (involvedObject != null) {
        this.involvedObject = new V1ObjectReferenceBuilder(involvedObject);
        this._visitables.get("involvedObject").add(this.involvedObject);
    } else {
        this.involvedObject = null;
        this._visitables.get("involvedObject").remove(this.involvedObject);
    }
    return (A) this;
  }
  
  public boolean hasInvolvedObject() {
    return this.involvedObject != null;
  }
  
  public InvolvedObjectNested<A> withNewInvolvedObject() {
    return new InvolvedObjectNested(null);
  }
  
  public InvolvedObjectNested<A> withNewInvolvedObjectLike(V1ObjectReference item) {
    return new InvolvedObjectNested(item);
  }
  
  public InvolvedObjectNested<A> editInvolvedObject() {
    return this.withNewInvolvedObjectLike(Optional.ofNullable(this.buildInvolvedObject()).orElse(null));
  }
  
  public InvolvedObjectNested<A> editOrNewInvolvedObject() {
    return this.withNewInvolvedObjectLike(Optional.ofNullable(this.buildInvolvedObject()).orElse(new V1ObjectReferenceBuilder().build()));
  }
  
  public InvolvedObjectNested<A> editOrNewInvolvedObjectLike(V1ObjectReference item) {
    return this.withNewInvolvedObjectLike(Optional.ofNullable(this.buildInvolvedObject()).orElse(item));
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
  
  public OffsetDateTime getLastTimestamp() {
    return this.lastTimestamp;
  }
  
  public A withLastTimestamp(OffsetDateTime lastTimestamp) {
    this.lastTimestamp = lastTimestamp;
    return (A) this;
  }
  
  public boolean hasLastTimestamp() {
    return this.lastTimestamp != null;
  }
  
  public String getMessage() {
    return this.message;
  }
  
  public A withMessage(String message) {
    this.message = message;
    return (A) this;
  }
  
  public boolean hasMessage() {
    return this.message != null;
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
    return this.withNewMetadataLike(Optional.ofNullable(this.buildMetadata()).orElse(null));
  }
  
  public MetadataNested<A> editOrNewMetadata() {
    return this.withNewMetadataLike(Optional.ofNullable(this.buildMetadata()).orElse(new V1ObjectMetaBuilder().build()));
  }
  
  public MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return this.withNewMetadataLike(Optional.ofNullable(this.buildMetadata()).orElse(item));
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
    return this.withNewRelatedLike(Optional.ofNullable(this.buildRelated()).orElse(null));
  }
  
  public RelatedNested<A> editOrNewRelated() {
    return this.withNewRelatedLike(Optional.ofNullable(this.buildRelated()).orElse(new V1ObjectReferenceBuilder().build()));
  }
  
  public RelatedNested<A> editOrNewRelatedLike(V1ObjectReference item) {
    return this.withNewRelatedLike(Optional.ofNullable(this.buildRelated()).orElse(item));
  }
  
  public String getReportingComponent() {
    return this.reportingComponent;
  }
  
  public A withReportingComponent(String reportingComponent) {
    this.reportingComponent = reportingComponent;
    return (A) this;
  }
  
  public boolean hasReportingComponent() {
    return this.reportingComponent != null;
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
  
  public CoreV1EventSeries buildSeries() {
    return this.series != null ? this.series.build() : null;
  }
  
  public A withSeries(CoreV1EventSeries series) {
    this._visitables.remove("series");
    if (series != null) {
        this.series = new CoreV1EventSeriesBuilder(series);
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
  
  public SeriesNested<A> withNewSeriesLike(CoreV1EventSeries item) {
    return new SeriesNested(item);
  }
  
  public SeriesNested<A> editSeries() {
    return this.withNewSeriesLike(Optional.ofNullable(this.buildSeries()).orElse(null));
  }
  
  public SeriesNested<A> editOrNewSeries() {
    return this.withNewSeriesLike(Optional.ofNullable(this.buildSeries()).orElse(new CoreV1EventSeriesBuilder().build()));
  }
  
  public SeriesNested<A> editOrNewSeriesLike(CoreV1EventSeries item) {
    return this.withNewSeriesLike(Optional.ofNullable(this.buildSeries()).orElse(item));
  }
  
  public V1EventSource buildSource() {
    return this.source != null ? this.source.build() : null;
  }
  
  public A withSource(V1EventSource source) {
    this._visitables.remove("source");
    if (source != null) {
        this.source = new V1EventSourceBuilder(source);
        this._visitables.get("source").add(this.source);
    } else {
        this.source = null;
        this._visitables.get("source").remove(this.source);
    }
    return (A) this;
  }
  
  public boolean hasSource() {
    return this.source != null;
  }
  
  public SourceNested<A> withNewSource() {
    return new SourceNested(null);
  }
  
  public SourceNested<A> withNewSourceLike(V1EventSource item) {
    return new SourceNested(item);
  }
  
  public SourceNested<A> editSource() {
    return this.withNewSourceLike(Optional.ofNullable(this.buildSource()).orElse(null));
  }
  
  public SourceNested<A> editOrNewSource() {
    return this.withNewSourceLike(Optional.ofNullable(this.buildSource()).orElse(new V1EventSourceBuilder().build()));
  }
  
  public SourceNested<A> editOrNewSourceLike(V1EventSource item) {
    return this.withNewSourceLike(Optional.ofNullable(this.buildSource()).orElse(item));
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
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    CoreV1EventFluent that = (CoreV1EventFluent) o;
    if (!(Objects.equals(action, that.action))) {
      return false;
    }
    if (!(Objects.equals(apiVersion, that.apiVersion))) {
      return false;
    }
    if (!(Objects.equals(count, that.count))) {
      return false;
    }
    if (!(Objects.equals(eventTime, that.eventTime))) {
      return false;
    }
    if (!(Objects.equals(firstTimestamp, that.firstTimestamp))) {
      return false;
    }
    if (!(Objects.equals(involvedObject, that.involvedObject))) {
      return false;
    }
    if (!(Objects.equals(kind, that.kind))) {
      return false;
    }
    if (!(Objects.equals(lastTimestamp, that.lastTimestamp))) {
      return false;
    }
    if (!(Objects.equals(message, that.message))) {
      return false;
    }
    if (!(Objects.equals(metadata, that.metadata))) {
      return false;
    }
    if (!(Objects.equals(reason, that.reason))) {
      return false;
    }
    if (!(Objects.equals(related, that.related))) {
      return false;
    }
    if (!(Objects.equals(reportingComponent, that.reportingComponent))) {
      return false;
    }
    if (!(Objects.equals(reportingInstance, that.reportingInstance))) {
      return false;
    }
    if (!(Objects.equals(series, that.series))) {
      return false;
    }
    if (!(Objects.equals(source, that.source))) {
      return false;
    }
    if (!(Objects.equals(type, that.type))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(action, apiVersion, count, eventTime, firstTimestamp, involvedObject, kind, lastTimestamp, message, metadata, reason, related, reportingComponent, reportingInstance, series, source, type);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(action == null)) {
        sb.append("action:");
        sb.append(action);
        sb.append(",");
    }
    if (!(apiVersion == null)) {
        sb.append("apiVersion:");
        sb.append(apiVersion);
        sb.append(",");
    }
    if (!(count == null)) {
        sb.append("count:");
        sb.append(count);
        sb.append(",");
    }
    if (!(eventTime == null)) {
        sb.append("eventTime:");
        sb.append(eventTime);
        sb.append(",");
    }
    if (!(firstTimestamp == null)) {
        sb.append("firstTimestamp:");
        sb.append(firstTimestamp);
        sb.append(",");
    }
    if (!(involvedObject == null)) {
        sb.append("involvedObject:");
        sb.append(involvedObject);
        sb.append(",");
    }
    if (!(kind == null)) {
        sb.append("kind:");
        sb.append(kind);
        sb.append(",");
    }
    if (!(lastTimestamp == null)) {
        sb.append("lastTimestamp:");
        sb.append(lastTimestamp);
        sb.append(",");
    }
    if (!(message == null)) {
        sb.append("message:");
        sb.append(message);
        sb.append(",");
    }
    if (!(metadata == null)) {
        sb.append("metadata:");
        sb.append(metadata);
        sb.append(",");
    }
    if (!(reason == null)) {
        sb.append("reason:");
        sb.append(reason);
        sb.append(",");
    }
    if (!(related == null)) {
        sb.append("related:");
        sb.append(related);
        sb.append(",");
    }
    if (!(reportingComponent == null)) {
        sb.append("reportingComponent:");
        sb.append(reportingComponent);
        sb.append(",");
    }
    if (!(reportingInstance == null)) {
        sb.append("reportingInstance:");
        sb.append(reportingInstance);
        sb.append(",");
    }
    if (!(series == null)) {
        sb.append("series:");
        sb.append(series);
        sb.append(",");
    }
    if (!(source == null)) {
        sb.append("source:");
        sb.append(source);
        sb.append(",");
    }
    if (!(type == null)) {
        sb.append("type:");
        sb.append(type);
    }
    sb.append("}");
    return sb.toString();
  }
  public class InvolvedObjectNested<N> extends V1ObjectReferenceFluent<InvolvedObjectNested<N>> implements Nested<N>{
    InvolvedObjectNested(V1ObjectReference item) {
      this.builder = new V1ObjectReferenceBuilder(this, item);
    }
    V1ObjectReferenceBuilder builder;
    
    public N and() {
      return (N) CoreV1EventFluent.this.withInvolvedObject(builder.build());
    }
    
    public N endInvolvedObject() {
      return and();
    }
    
  
  }
  public class MetadataNested<N> extends V1ObjectMetaFluent<MetadataNested<N>> implements Nested<N>{
    MetadataNested(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    V1ObjectMetaBuilder builder;
    
    public N and() {
      return (N) CoreV1EventFluent.this.withMetadata(builder.build());
    }
    
    public N endMetadata() {
      return and();
    }
    
  
  }
  public class RelatedNested<N> extends V1ObjectReferenceFluent<RelatedNested<N>> implements Nested<N>{
    RelatedNested(V1ObjectReference item) {
      this.builder = new V1ObjectReferenceBuilder(this, item);
    }
    V1ObjectReferenceBuilder builder;
    
    public N and() {
      return (N) CoreV1EventFluent.this.withRelated(builder.build());
    }
    
    public N endRelated() {
      return and();
    }
    
  
  }
  public class SeriesNested<N> extends CoreV1EventSeriesFluent<SeriesNested<N>> implements Nested<N>{
    SeriesNested(CoreV1EventSeries item) {
      this.builder = new CoreV1EventSeriesBuilder(this, item);
    }
    CoreV1EventSeriesBuilder builder;
    
    public N and() {
      return (N) CoreV1EventFluent.this.withSeries(builder.build());
    }
    
    public N endSeries() {
      return and();
    }
    
  
  }
  public class SourceNested<N> extends V1EventSourceFluent<SourceNested<N>> implements Nested<N>{
    SourceNested(V1EventSource item) {
      this.builder = new V1EventSourceBuilder(this, item);
    }
    V1EventSourceBuilder builder;
    
    public N and() {
      return (N) CoreV1EventFluent.this.withSource(builder.build());
    }
    
    public N endSource() {
      return and();
    }
    
  
  }

}