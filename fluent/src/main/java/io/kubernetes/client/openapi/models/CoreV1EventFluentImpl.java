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
  public class CoreV1EventFluentImpl<A extends CoreV1EventFluent<A>> extends BaseFluent<A> implements CoreV1EventFluent<A>{
  public CoreV1EventFluentImpl() {
  }
  public CoreV1EventFluentImpl(CoreV1Event instance) {
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
  public Integer getCount() {
    return this.count;
  }
  public A withCount(Integer count) {
    this.count=count; return (A) this;
  }
  public Boolean hasCount() {
    return this.count != null;
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
  public OffsetDateTime getFirstTimestamp() {
    return this.firstTimestamp;
  }
  public A withFirstTimestamp(OffsetDateTime firstTimestamp) {
    this.firstTimestamp=firstTimestamp; return (A) this;
  }
  public Boolean hasFirstTimestamp() {
    return this.firstTimestamp != null;
  }
  
  /**
   * This method has been deprecated, please use method buildInvolvedObject instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectReference getInvolvedObject() {
    return this.involvedObject!=null ?this.involvedObject.build():null;
  }
  public V1ObjectReference buildInvolvedObject() {
    return this.involvedObject!=null ?this.involvedObject.build():null;
  }
  public A withInvolvedObject(V1ObjectReference involvedObject) {
    _visitables.get("involvedObject").remove(this.involvedObject);
    if (involvedObject!=null){ this.involvedObject= new V1ObjectReferenceBuilder(involvedObject); _visitables.get("involvedObject").add(this.involvedObject);} else { this.involvedObject = null; _visitables.get("involvedObject").remove(this.involvedObject); } return (A) this;
  }
  public Boolean hasInvolvedObject() {
    return this.involvedObject != null;
  }
  public CoreV1EventFluent.InvolvedObjectNested<A> withNewInvolvedObject() {
    return new CoreV1EventFluentImpl.InvolvedObjectNestedImpl();
  }
  public CoreV1EventFluent.InvolvedObjectNested<A> withNewInvolvedObjectLike(V1ObjectReference item) {
    return new CoreV1EventFluentImpl.InvolvedObjectNestedImpl(item);
  }
  public CoreV1EventFluent.InvolvedObjectNested<A> editInvolvedObject() {
    return withNewInvolvedObjectLike(getInvolvedObject());
  }
  public CoreV1EventFluent.InvolvedObjectNested<A> editOrNewInvolvedObject() {
    return withNewInvolvedObjectLike(getInvolvedObject() != null ? getInvolvedObject(): new V1ObjectReferenceBuilder().build());
  }
  public CoreV1EventFluent.InvolvedObjectNested<A> editOrNewInvolvedObjectLike(V1ObjectReference item) {
    return withNewInvolvedObjectLike(getInvolvedObject() != null ? getInvolvedObject(): item);
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
  public OffsetDateTime getLastTimestamp() {
    return this.lastTimestamp;
  }
  public A withLastTimestamp(OffsetDateTime lastTimestamp) {
    this.lastTimestamp=lastTimestamp; return (A) this;
  }
  public Boolean hasLastTimestamp() {
    return this.lastTimestamp != null;
  }
  public String getMessage() {
    return this.message;
  }
  public A withMessage(String message) {
    this.message=message; return (A) this;
  }
  public Boolean hasMessage() {
    return this.message != null;
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
  public CoreV1EventFluent.MetadataNested<A> withNewMetadata() {
    return new CoreV1EventFluentImpl.MetadataNestedImpl();
  }
  public CoreV1EventFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new CoreV1EventFluentImpl.MetadataNestedImpl(item);
  }
  public CoreV1EventFluent.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public CoreV1EventFluent.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new V1ObjectMetaBuilder().build());
  }
  public CoreV1EventFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
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
  public CoreV1EventFluent.RelatedNested<A> withNewRelated() {
    return new CoreV1EventFluentImpl.RelatedNestedImpl();
  }
  public CoreV1EventFluent.RelatedNested<A> withNewRelatedLike(V1ObjectReference item) {
    return new CoreV1EventFluentImpl.RelatedNestedImpl(item);
  }
  public CoreV1EventFluent.RelatedNested<A> editRelated() {
    return withNewRelatedLike(getRelated());
  }
  public CoreV1EventFluent.RelatedNested<A> editOrNewRelated() {
    return withNewRelatedLike(getRelated() != null ? getRelated(): new V1ObjectReferenceBuilder().build());
  }
  public CoreV1EventFluent.RelatedNested<A> editOrNewRelatedLike(V1ObjectReference item) {
    return withNewRelatedLike(getRelated() != null ? getRelated(): item);
  }
  public String getReportingComponent() {
    return this.reportingComponent;
  }
  public A withReportingComponent(String reportingComponent) {
    this.reportingComponent=reportingComponent; return (A) this;
  }
  public Boolean hasReportingComponent() {
    return this.reportingComponent != null;
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
  public CoreV1EventSeries getSeries() {
    return this.series!=null ?this.series.build():null;
  }
  public CoreV1EventSeries buildSeries() {
    return this.series!=null ?this.series.build():null;
  }
  public A withSeries(CoreV1EventSeries series) {
    _visitables.get("series").remove(this.series);
    if (series!=null){ this.series= new CoreV1EventSeriesBuilder(series); _visitables.get("series").add(this.series);} else { this.series = null; _visitables.get("series").remove(this.series); } return (A) this;
  }
  public Boolean hasSeries() {
    return this.series != null;
  }
  public CoreV1EventFluent.SeriesNested<A> withNewSeries() {
    return new CoreV1EventFluentImpl.SeriesNestedImpl();
  }
  public CoreV1EventFluent.SeriesNested<A> withNewSeriesLike(CoreV1EventSeries item) {
    return new CoreV1EventFluentImpl.SeriesNestedImpl(item);
  }
  public CoreV1EventFluent.SeriesNested<A> editSeries() {
    return withNewSeriesLike(getSeries());
  }
  public CoreV1EventFluent.SeriesNested<A> editOrNewSeries() {
    return withNewSeriesLike(getSeries() != null ? getSeries(): new CoreV1EventSeriesBuilder().build());
  }
  public CoreV1EventFluent.SeriesNested<A> editOrNewSeriesLike(CoreV1EventSeries item) {
    return withNewSeriesLike(getSeries() != null ? getSeries(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildSource instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1EventSource getSource() {
    return this.source!=null ?this.source.build():null;
  }
  public V1EventSource buildSource() {
    return this.source!=null ?this.source.build():null;
  }
  public A withSource(V1EventSource source) {
    _visitables.get("source").remove(this.source);
    if (source!=null){ this.source= new V1EventSourceBuilder(source); _visitables.get("source").add(this.source);} else { this.source = null; _visitables.get("source").remove(this.source); } return (A) this;
  }
  public Boolean hasSource() {
    return this.source != null;
  }
  public CoreV1EventFluent.SourceNested<A> withNewSource() {
    return new CoreV1EventFluentImpl.SourceNestedImpl();
  }
  public CoreV1EventFluent.SourceNested<A> withNewSourceLike(V1EventSource item) {
    return new CoreV1EventFluentImpl.SourceNestedImpl(item);
  }
  public CoreV1EventFluent.SourceNested<A> editSource() {
    return withNewSourceLike(getSource());
  }
  public CoreV1EventFluent.SourceNested<A> editOrNewSource() {
    return withNewSourceLike(getSource() != null ? getSource(): new V1EventSourceBuilder().build());
  }
  public CoreV1EventFluent.SourceNested<A> editOrNewSourceLike(V1EventSource item) {
    return withNewSourceLike(getSource() != null ? getSource(): item);
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
    CoreV1EventFluentImpl that = (CoreV1EventFluentImpl) o;
    if (action != null ? !action.equals(that.action) :that.action != null) return false;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
    if (count != null ? !count.equals(that.count) :that.count != null) return false;
    if (eventTime != null ? !eventTime.equals(that.eventTime) :that.eventTime != null) return false;
    if (firstTimestamp != null ? !firstTimestamp.equals(that.firstTimestamp) :that.firstTimestamp != null) return false;
    if (involvedObject != null ? !involvedObject.equals(that.involvedObject) :that.involvedObject != null) return false;
    if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
    if (lastTimestamp != null ? !lastTimestamp.equals(that.lastTimestamp) :that.lastTimestamp != null) return false;
    if (message != null ? !message.equals(that.message) :that.message != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
    if (reason != null ? !reason.equals(that.reason) :that.reason != null) return false;
    if (related != null ? !related.equals(that.related) :that.related != null) return false;
    if (reportingComponent != null ? !reportingComponent.equals(that.reportingComponent) :that.reportingComponent != null) return false;
    if (reportingInstance != null ? !reportingInstance.equals(that.reportingInstance) :that.reportingInstance != null) return false;
    if (series != null ? !series.equals(that.series) :that.series != null) return false;
    if (source != null ? !source.equals(that.source) :that.source != null) return false;
    if (type != null ? !type.equals(that.type) :that.type != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(action,  apiVersion,  count,  eventTime,  firstTimestamp,  involvedObject,  kind,  lastTimestamp,  message,  metadata,  reason,  related,  reportingComponent,  reportingInstance,  series,  source,  type,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (action != null) { sb.append("action:"); sb.append(action + ","); }
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (count != null) { sb.append("count:"); sb.append(count + ","); }
    if (eventTime != null) { sb.append("eventTime:"); sb.append(eventTime + ","); }
    if (firstTimestamp != null) { sb.append("firstTimestamp:"); sb.append(firstTimestamp + ","); }
    if (involvedObject != null) { sb.append("involvedObject:"); sb.append(involvedObject + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (lastTimestamp != null) { sb.append("lastTimestamp:"); sb.append(lastTimestamp + ","); }
    if (message != null) { sb.append("message:"); sb.append(message + ","); }
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata + ","); }
    if (reason != null) { sb.append("reason:"); sb.append(reason + ","); }
    if (related != null) { sb.append("related:"); sb.append(related + ","); }
    if (reportingComponent != null) { sb.append("reportingComponent:"); sb.append(reportingComponent + ","); }
    if (reportingInstance != null) { sb.append("reportingInstance:"); sb.append(reportingInstance + ","); }
    if (series != null) { sb.append("series:"); sb.append(series + ","); }
    if (source != null) { sb.append("source:"); sb.append(source + ","); }
    if (type != null) { sb.append("type:"); sb.append(type); }
    sb.append("}");
    return sb.toString();
  }
  class InvolvedObjectNestedImpl<N> extends V1ObjectReferenceFluentImpl<CoreV1EventFluent.InvolvedObjectNested<N>> implements CoreV1EventFluent.InvolvedObjectNested<N>,Nested<N>{
    InvolvedObjectNestedImpl(V1ObjectReference item) {
      this.builder = new V1ObjectReferenceBuilder(this, item);
    }
    InvolvedObjectNestedImpl() {
      this.builder = new V1ObjectReferenceBuilder(this);
    }
    V1ObjectReferenceBuilder builder;
    public N and() {
      return (N) CoreV1EventFluentImpl.this.withInvolvedObject(builder.build());
    }
    public N endInvolvedObject() {
      return and();
    }
    
  }
  class MetadataNestedImpl<N> extends V1ObjectMetaFluentImpl<CoreV1EventFluent.MetadataNested<N>> implements CoreV1EventFluent.MetadataNested<N>,Nested<N>{
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new V1ObjectMetaBuilder(this);
    }
    V1ObjectMetaBuilder builder;
    public N and() {
      return (N) CoreV1EventFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  class RelatedNestedImpl<N> extends V1ObjectReferenceFluentImpl<CoreV1EventFluent.RelatedNested<N>> implements CoreV1EventFluent.RelatedNested<N>,Nested<N>{
    RelatedNestedImpl(V1ObjectReference item) {
      this.builder = new V1ObjectReferenceBuilder(this, item);
    }
    RelatedNestedImpl() {
      this.builder = new V1ObjectReferenceBuilder(this);
    }
    V1ObjectReferenceBuilder builder;
    public N and() {
      return (N) CoreV1EventFluentImpl.this.withRelated(builder.build());
    }
    public N endRelated() {
      return and();
    }
    
  }
  class SeriesNestedImpl<N> extends CoreV1EventSeriesFluentImpl<CoreV1EventFluent.SeriesNested<N>> implements CoreV1EventFluent.SeriesNested<N>,Nested<N>{
    SeriesNestedImpl(CoreV1EventSeries item) {
      this.builder = new CoreV1EventSeriesBuilder(this, item);
    }
    SeriesNestedImpl() {
      this.builder = new CoreV1EventSeriesBuilder(this);
    }
    CoreV1EventSeriesBuilder builder;
    public N and() {
      return (N) CoreV1EventFluentImpl.this.withSeries(builder.build());
    }
    public N endSeries() {
      return and();
    }
    
  }
  class SourceNestedImpl<N> extends V1EventSourceFluentImpl<CoreV1EventFluent.SourceNested<N>> implements CoreV1EventFluent.SourceNested<N>,Nested<N>{
    SourceNestedImpl(V1EventSource item) {
      this.builder = new V1EventSourceBuilder(this, item);
    }
    SourceNestedImpl() {
      this.builder = new V1EventSourceBuilder(this);
    }
    V1EventSourceBuilder builder;
    public N and() {
      return (N) CoreV1EventFluentImpl.this.withSource(builder.build());
    }
    public N endSource() {
      return and();
    }
    
  }
  
}