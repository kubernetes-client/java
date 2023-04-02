package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1JobFluent<A extends V1JobFluent<A>> extends Fluent<A>{
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
  public V1JobFluent.MetadataNested<A> withNewMetadata();
  public V1JobFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1JobFluent.MetadataNested<A> editMetadata();
  public V1JobFluent.MetadataNested<A> editOrNewMetadata();
  public V1JobFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1JobSpec getSpec();
  public V1JobSpec buildSpec();
  public A withSpec(V1JobSpec spec);
  public Boolean hasSpec();
  public V1JobFluent.SpecNested<A> withNewSpec();
  public V1JobFluent.SpecNested<A> withNewSpecLike(V1JobSpec item);
  public V1JobFluent.SpecNested<A> editSpec();
  public V1JobFluent.SpecNested<A> editOrNewSpec();
  public V1JobFluent.SpecNested<A> editOrNewSpecLike(V1JobSpec item);
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1JobStatus getStatus();
  public V1JobStatus buildStatus();
  public A withStatus(V1JobStatus status);
  public Boolean hasStatus();
  public V1JobFluent.StatusNested<A> withNewStatus();
  public V1JobFluent.StatusNested<A> withNewStatusLike(V1JobStatus item);
  public V1JobFluent.StatusNested<A> editStatus();
  public V1JobFluent.StatusNested<A> editOrNewStatus();
  public V1JobFluent.StatusNested<A> editOrNewStatusLike(V1JobStatus item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1JobFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends Nested<N>,V1JobSpecFluent<V1JobFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  public interface StatusNested<N> extends Nested<N>,V1JobStatusFluent<V1JobFluent.StatusNested<N>>{
    public N and();
    public N endStatus();
    
  }
  
}