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
public interface CoreV1EventFluent<A extends CoreV1EventFluent<A>> extends Fluent<A>{
  public String getAction();
  public A withAction(String action);
  public Boolean hasAction();
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public Integer getCount();
  public A withCount(Integer count);
  public Boolean hasCount();
  public OffsetDateTime getEventTime();
  public A withEventTime(OffsetDateTime eventTime);
  public Boolean hasEventTime();
  public OffsetDateTime getFirstTimestamp();
  public A withFirstTimestamp(OffsetDateTime firstTimestamp);
  public Boolean hasFirstTimestamp();
  
  /**
   * This method has been deprecated, please use method buildInvolvedObject instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectReference getInvolvedObject();
  public V1ObjectReference buildInvolvedObject();
  public A withInvolvedObject(V1ObjectReference involvedObject);
  public Boolean hasInvolvedObject();
  public CoreV1EventFluent.InvolvedObjectNested<A> withNewInvolvedObject();
  public CoreV1EventFluent.InvolvedObjectNested<A> withNewInvolvedObjectLike(V1ObjectReference item);
  public CoreV1EventFluent.InvolvedObjectNested<A> editInvolvedObject();
  public CoreV1EventFluent.InvolvedObjectNested<A> editOrNewInvolvedObject();
  public CoreV1EventFluent.InvolvedObjectNested<A> editOrNewInvolvedObjectLike(V1ObjectReference item);
  public String getKind();
  public A withKind(String kind);
  public Boolean hasKind();
  public OffsetDateTime getLastTimestamp();
  public A withLastTimestamp(OffsetDateTime lastTimestamp);
  public Boolean hasLastTimestamp();
  public String getMessage();
  public A withMessage(String message);
  public Boolean hasMessage();
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata();
  public V1ObjectMeta buildMetadata();
  public A withMetadata(V1ObjectMeta metadata);
  public Boolean hasMetadata();
  public CoreV1EventFluent.MetadataNested<A> withNewMetadata();
  public CoreV1EventFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public CoreV1EventFluent.MetadataNested<A> editMetadata();
  public CoreV1EventFluent.MetadataNested<A> editOrNewMetadata();
  public CoreV1EventFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  public String getReason();
  public A withReason(String reason);
  public Boolean hasReason();
  
  /**
   * This method has been deprecated, please use method buildRelated instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectReference getRelated();
  public V1ObjectReference buildRelated();
  public A withRelated(V1ObjectReference related);
  public Boolean hasRelated();
  public CoreV1EventFluent.RelatedNested<A> withNewRelated();
  public CoreV1EventFluent.RelatedNested<A> withNewRelatedLike(V1ObjectReference item);
  public CoreV1EventFluent.RelatedNested<A> editRelated();
  public CoreV1EventFluent.RelatedNested<A> editOrNewRelated();
  public CoreV1EventFluent.RelatedNested<A> editOrNewRelatedLike(V1ObjectReference item);
  public String getReportingComponent();
  public A withReportingComponent(String reportingComponent);
  public Boolean hasReportingComponent();
  public String getReportingInstance();
  public A withReportingInstance(String reportingInstance);
  public Boolean hasReportingInstance();
  
  /**
   * This method has been deprecated, please use method buildSeries instead.
   * @return The buildable object.
   */
  @Deprecated
  public CoreV1EventSeries getSeries();
  public CoreV1EventSeries buildSeries();
  public A withSeries(CoreV1EventSeries series);
  public Boolean hasSeries();
  public CoreV1EventFluent.SeriesNested<A> withNewSeries();
  public CoreV1EventFluent.SeriesNested<A> withNewSeriesLike(CoreV1EventSeries item);
  public CoreV1EventFluent.SeriesNested<A> editSeries();
  public CoreV1EventFluent.SeriesNested<A> editOrNewSeries();
  public CoreV1EventFluent.SeriesNested<A> editOrNewSeriesLike(CoreV1EventSeries item);
  
  /**
   * This method has been deprecated, please use method buildSource instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1EventSource getSource();
  public V1EventSource buildSource();
  public A withSource(V1EventSource source);
  public Boolean hasSource();
  public CoreV1EventFluent.SourceNested<A> withNewSource();
  public CoreV1EventFluent.SourceNested<A> withNewSourceLike(V1EventSource item);
  public CoreV1EventFluent.SourceNested<A> editSource();
  public CoreV1EventFluent.SourceNested<A> editOrNewSource();
  public CoreV1EventFluent.SourceNested<A> editOrNewSourceLike(V1EventSource item);
  public String getType();
  public A withType(String type);
  public Boolean hasType();
  public interface InvolvedObjectNested<N> extends Nested<N>,V1ObjectReferenceFluent<CoreV1EventFluent.InvolvedObjectNested<N>>{
    public N and();
    public N endInvolvedObject();
    
  }
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<CoreV1EventFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface RelatedNested<N> extends Nested<N>,V1ObjectReferenceFluent<CoreV1EventFluent.RelatedNested<N>>{
    public N and();
    public N endRelated();
    
  }
  public interface SeriesNested<N> extends Nested<N>,CoreV1EventSeriesFluent<CoreV1EventFluent.SeriesNested<N>>{
    public N and();
    public N endSeries();
    
  }
  public interface SourceNested<N> extends Nested<N>,V1EventSourceFluent<CoreV1EventFluent.SourceNested<N>>{
    public N and();
    public N endSource();
    
  }
  
}