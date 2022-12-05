package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ServiceFluent<A extends V1ServiceFluent<A>> extends Fluent<A>{
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
  public V1ServiceFluent.MetadataNested<A> withNewMetadata();
  public V1ServiceFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1ServiceFluent.MetadataNested<A> editMetadata();
  public V1ServiceFluent.MetadataNested<A> editOrNewMetadata();
  public V1ServiceFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ServiceSpec getSpec();
  public V1ServiceSpec buildSpec();
  public A withSpec(V1ServiceSpec spec);
  public Boolean hasSpec();
  public V1ServiceFluent.SpecNested<A> withNewSpec();
  public V1ServiceFluent.SpecNested<A> withNewSpecLike(V1ServiceSpec item);
  public V1ServiceFluent.SpecNested<A> editSpec();
  public V1ServiceFluent.SpecNested<A> editOrNewSpec();
  public V1ServiceFluent.SpecNested<A> editOrNewSpecLike(V1ServiceSpec item);
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ServiceStatus getStatus();
  public V1ServiceStatus buildStatus();
  public A withStatus(V1ServiceStatus status);
  public Boolean hasStatus();
  public V1ServiceFluent.StatusNested<A> withNewStatus();
  public V1ServiceFluent.StatusNested<A> withNewStatusLike(V1ServiceStatus item);
  public V1ServiceFluent.StatusNested<A> editStatus();
  public V1ServiceFluent.StatusNested<A> editOrNewStatus();
  public V1ServiceFluent.StatusNested<A> editOrNewStatusLike(V1ServiceStatus item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1ServiceFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends Nested<N>,V1ServiceSpecFluent<V1ServiceFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  public interface StatusNested<N> extends Nested<N>,V1ServiceStatusFluent<V1ServiceFluent.StatusNested<N>>{
    public N and();
    public N endStatus();
    
  }
  
}