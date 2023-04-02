package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1CronJobFluent<A extends V1CronJobFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
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
  public V1CronJobFluent.MetadataNested<A> withNewMetadata();
  public V1CronJobFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1CronJobFluent.MetadataNested<A> editMetadata();
  public V1CronJobFluent.MetadataNested<A> editOrNewMetadata();
  public V1CronJobFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1CronJobSpec getSpec();
  public V1CronJobSpec buildSpec();
  public A withSpec(V1CronJobSpec spec);
  public Boolean hasSpec();
  public V1CronJobFluent.SpecNested<A> withNewSpec();
  public V1CronJobFluent.SpecNested<A> withNewSpecLike(V1CronJobSpec item);
  public V1CronJobFluent.SpecNested<A> editSpec();
  public V1CronJobFluent.SpecNested<A> editOrNewSpec();
  public V1CronJobFluent.SpecNested<A> editOrNewSpecLike(V1CronJobSpec item);
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1CronJobStatus getStatus();
  public V1CronJobStatus buildStatus();
  public A withStatus(V1CronJobStatus status);
  public Boolean hasStatus();
  public V1CronJobFluent.StatusNested<A> withNewStatus();
  public V1CronJobFluent.StatusNested<A> withNewStatusLike(V1CronJobStatus item);
  public V1CronJobFluent.StatusNested<A> editStatus();
  public V1CronJobFluent.StatusNested<A> editOrNewStatus();
  public V1CronJobFluent.StatusNested<A> editOrNewStatusLike(V1CronJobStatus item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1CronJobFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends Nested<N>,V1CronJobSpecFluent<V1CronJobFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  public interface StatusNested<N> extends Nested<N>,V1CronJobStatusFluent<V1CronJobFluent.StatusNested<N>>{
    public N and();
    public N endStatus();
    
  }
  
}