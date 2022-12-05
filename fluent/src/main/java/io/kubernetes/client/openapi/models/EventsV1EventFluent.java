package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import java.time.OffsetDateTime;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface EventsV1EventFluent<A extends EventsV1EventFluent<A>> extends Fluent<A>{
  public String getAction();
  public A withAction(String action);
  public Boolean hasAction();
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public Integer getDeprecatedCount();
  public A withDeprecatedCount(Integer deprecatedCount);
  public Boolean hasDeprecatedCount();
  public OffsetDateTime getDeprecatedFirstTimestamp();
  public A withDeprecatedFirstTimestamp(OffsetDateTime deprecatedFirstTimestamp);
  public Boolean hasDeprecatedFirstTimestamp();
  public OffsetDateTime getDeprecatedLastTimestamp();
  public A withDeprecatedLastTimestamp(OffsetDateTime deprecatedLastTimestamp);
  public Boolean hasDeprecatedLastTimestamp();
  
  /**
   * This method has been deprecated, please use method buildDeprecatedSource instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1EventSource getDeprecatedSource();
  public V1EventSource buildDeprecatedSource();
  public A withDeprecatedSource(V1EventSource deprecatedSource);
  public Boolean hasDeprecatedSource();
  public EventsV1EventFluent.DeprecatedSourceNested<A> withNewDeprecatedSource();
  public EventsV1EventFluent.DeprecatedSourceNested<A> withNewDeprecatedSourceLike(V1EventSource item);
  public EventsV1EventFluent.DeprecatedSourceNested<A> editDeprecatedSource();
  public EventsV1EventFluent.DeprecatedSourceNested<A> editOrNewDeprecatedSource();
  public EventsV1EventFluent.DeprecatedSourceNested<A> editOrNewDeprecatedSourceLike(V1EventSource item);
  public OffsetDateTime getEventTime();
  public A withEventTime(OffsetDateTime eventTime);
  public Boolean hasEventTime();
  public String getKind();
  public A withKind(String kind);
  public Boolean hasKind();
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata();
  public V1ObjectMeta buildMetadata();
  public A withMetadata(V1ObjectMeta metadata);
  public Boolean hasMetadata();
  public EventsV1EventFluent.MetadataNested<A> withNewMetadata();
  public EventsV1EventFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public EventsV1EventFluent.MetadataNested<A> editMetadata();
  public EventsV1EventFluent.MetadataNested<A> editOrNewMetadata();
  public EventsV1EventFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  public String getNote();
  public A withNote(String note);
  public Boolean hasNote();
  public String getReason();
  public A withReason(String reason);
  public Boolean hasReason();
  
  /**
   * This method has been deprecated, please use method buildRegarding instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectReference getRegarding();
  public V1ObjectReference buildRegarding();
  public A withRegarding(V1ObjectReference regarding);
  public Boolean hasRegarding();
  public EventsV1EventFluent.RegardingNested<A> withNewRegarding();
  public EventsV1EventFluent.RegardingNested<A> withNewRegardingLike(V1ObjectReference item);
  public EventsV1EventFluent.RegardingNested<A> editRegarding();
  public EventsV1EventFluent.RegardingNested<A> editOrNewRegarding();
  public EventsV1EventFluent.RegardingNested<A> editOrNewRegardingLike(V1ObjectReference item);
  
  /**
   * This method has been deprecated, please use method buildRelated instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectReference getRelated();
  public V1ObjectReference buildRelated();
  public A withRelated(V1ObjectReference related);
  public Boolean hasRelated();
  public EventsV1EventFluent.RelatedNested<A> withNewRelated();
  public EventsV1EventFluent.RelatedNested<A> withNewRelatedLike(V1ObjectReference item);
  public EventsV1EventFluent.RelatedNested<A> editRelated();
  public EventsV1EventFluent.RelatedNested<A> editOrNewRelated();
  public EventsV1EventFluent.RelatedNested<A> editOrNewRelatedLike(V1ObjectReference item);
  public String getReportingController();
  public A withReportingController(String reportingController);
  public Boolean hasReportingController();
  public String getReportingInstance();
  public A withReportingInstance(String reportingInstance);
  public Boolean hasReportingInstance();
  
  /**
   * This method has been deprecated, please use method buildSeries instead.
   * @return The buildable object.
   */
  @Deprecated
  public EventsV1EventSeries getSeries();
  public EventsV1EventSeries buildSeries();
  public A withSeries(EventsV1EventSeries series);
  public Boolean hasSeries();
  public EventsV1EventFluent.SeriesNested<A> withNewSeries();
  public EventsV1EventFluent.SeriesNested<A> withNewSeriesLike(EventsV1EventSeries item);
  public EventsV1EventFluent.SeriesNested<A> editSeries();
  public EventsV1EventFluent.SeriesNested<A> editOrNewSeries();
  public EventsV1EventFluent.SeriesNested<A> editOrNewSeriesLike(EventsV1EventSeries item);
  public String getType();
  public A withType(String type);
  public Boolean hasType();
  public interface DeprecatedSourceNested<N> extends Nested<N>,V1EventSourceFluent<EventsV1EventFluent.DeprecatedSourceNested<N>>{
    public N and();
    public N endDeprecatedSource();
    
  }
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<EventsV1EventFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface RegardingNested<N> extends Nested<N>,V1ObjectReferenceFluent<EventsV1EventFluent.RegardingNested<N>>{
    public N and();
    public N endRegarding();
    
  }
  public interface RelatedNested<N> extends Nested<N>,V1ObjectReferenceFluent<EventsV1EventFluent.RelatedNested<N>>{
    public N and();
    public N endRelated();
    
  }
  public interface SeriesNested<N> extends Nested<N>,EventsV1EventSeriesFluent<EventsV1EventFluent.SeriesNested<N>>{
    public N and();
    public N endSeries();
    
  }
  
}