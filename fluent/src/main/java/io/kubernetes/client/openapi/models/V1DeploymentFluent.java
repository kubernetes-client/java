package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1DeploymentFluent<A extends V1DeploymentFluent<A>> extends Fluent<A>{
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
  public V1DeploymentFluent.MetadataNested<A> withNewMetadata();
  public V1DeploymentFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1DeploymentFluent.MetadataNested<A> editMetadata();
  public V1DeploymentFluent.MetadataNested<A> editOrNewMetadata();
  public V1DeploymentFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1DeploymentSpec getSpec();
  public V1DeploymentSpec buildSpec();
  public A withSpec(V1DeploymentSpec spec);
  public Boolean hasSpec();
  public V1DeploymentFluent.SpecNested<A> withNewSpec();
  public V1DeploymentFluent.SpecNested<A> withNewSpecLike(V1DeploymentSpec item);
  public V1DeploymentFluent.SpecNested<A> editSpec();
  public V1DeploymentFluent.SpecNested<A> editOrNewSpec();
  public V1DeploymentFluent.SpecNested<A> editOrNewSpecLike(V1DeploymentSpec item);
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1DeploymentStatus getStatus();
  public V1DeploymentStatus buildStatus();
  public A withStatus(V1DeploymentStatus status);
  public Boolean hasStatus();
  public V1DeploymentFluent.StatusNested<A> withNewStatus();
  public V1DeploymentFluent.StatusNested<A> withNewStatusLike(V1DeploymentStatus item);
  public V1DeploymentFluent.StatusNested<A> editStatus();
  public V1DeploymentFluent.StatusNested<A> editOrNewStatus();
  public V1DeploymentFluent.StatusNested<A> editOrNewStatusLike(V1DeploymentStatus item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1DeploymentFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends Nested<N>,V1DeploymentSpecFluent<V1DeploymentFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  public interface StatusNested<N> extends Nested<N>,V1DeploymentStatusFluent<V1DeploymentFluent.StatusNested<N>>{
    public N and();
    public N endStatus();
    
  }
  
}