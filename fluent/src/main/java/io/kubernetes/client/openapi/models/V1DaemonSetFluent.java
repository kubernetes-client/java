package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1DaemonSetFluent<A extends V1DaemonSetFluent<A>> extends Fluent<A>{
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
  public V1DaemonSetFluent.MetadataNested<A> withNewMetadata();
  public V1DaemonSetFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1DaemonSetFluent.MetadataNested<A> editMetadata();
  public V1DaemonSetFluent.MetadataNested<A> editOrNewMetadata();
  public V1DaemonSetFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1DaemonSetSpec getSpec();
  public V1DaemonSetSpec buildSpec();
  public A withSpec(V1DaemonSetSpec spec);
  public Boolean hasSpec();
  public V1DaemonSetFluent.SpecNested<A> withNewSpec();
  public V1DaemonSetFluent.SpecNested<A> withNewSpecLike(V1DaemonSetSpec item);
  public V1DaemonSetFluent.SpecNested<A> editSpec();
  public V1DaemonSetFluent.SpecNested<A> editOrNewSpec();
  public V1DaemonSetFluent.SpecNested<A> editOrNewSpecLike(V1DaemonSetSpec item);
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1DaemonSetStatus getStatus();
  public V1DaemonSetStatus buildStatus();
  public A withStatus(V1DaemonSetStatus status);
  public Boolean hasStatus();
  public V1DaemonSetFluent.StatusNested<A> withNewStatus();
  public V1DaemonSetFluent.StatusNested<A> withNewStatusLike(V1DaemonSetStatus item);
  public V1DaemonSetFluent.StatusNested<A> editStatus();
  public V1DaemonSetFluent.StatusNested<A> editOrNewStatus();
  public V1DaemonSetFluent.StatusNested<A> editOrNewStatusLike(V1DaemonSetStatus item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1DaemonSetFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends Nested<N>,V1DaemonSetSpecFluent<V1DaemonSetFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  public interface StatusNested<N> extends Nested<N>,V1DaemonSetStatusFluent<V1DaemonSetFluent.StatusNested<N>>{
    public N and();
    public N endStatus();
    
  }
  
}