package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1beta2PriorityLevelConfigurationFluent<A extends V1beta2PriorityLevelConfigurationFluent<A>> extends Fluent<A>{
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
  public V1beta2PriorityLevelConfigurationFluent.MetadataNested<A> withNewMetadata();
  public V1beta2PriorityLevelConfigurationFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1beta2PriorityLevelConfigurationFluent.MetadataNested<A> editMetadata();
  public V1beta2PriorityLevelConfigurationFluent.MetadataNested<A> editOrNewMetadata();
  public V1beta2PriorityLevelConfigurationFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1beta2PriorityLevelConfigurationSpec getSpec();
  public V1beta2PriorityLevelConfigurationSpec buildSpec();
  public A withSpec(V1beta2PriorityLevelConfigurationSpec spec);
  public Boolean hasSpec();
  public V1beta2PriorityLevelConfigurationFluent.SpecNested<A> withNewSpec();
  public V1beta2PriorityLevelConfigurationFluent.SpecNested<A> withNewSpecLike(V1beta2PriorityLevelConfigurationSpec item);
  public V1beta2PriorityLevelConfigurationFluent.SpecNested<A> editSpec();
  public V1beta2PriorityLevelConfigurationFluent.SpecNested<A> editOrNewSpec();
  public V1beta2PriorityLevelConfigurationFluent.SpecNested<A> editOrNewSpecLike(V1beta2PriorityLevelConfigurationSpec item);
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1beta2PriorityLevelConfigurationStatus getStatus();
  public V1beta2PriorityLevelConfigurationStatus buildStatus();
  public A withStatus(V1beta2PriorityLevelConfigurationStatus status);
  public Boolean hasStatus();
  public V1beta2PriorityLevelConfigurationFluent.StatusNested<A> withNewStatus();
  public V1beta2PriorityLevelConfigurationFluent.StatusNested<A> withNewStatusLike(V1beta2PriorityLevelConfigurationStatus item);
  public V1beta2PriorityLevelConfigurationFluent.StatusNested<A> editStatus();
  public V1beta2PriorityLevelConfigurationFluent.StatusNested<A> editOrNewStatus();
  public V1beta2PriorityLevelConfigurationFluent.StatusNested<A> editOrNewStatusLike(V1beta2PriorityLevelConfigurationStatus item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1beta2PriorityLevelConfigurationFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends Nested<N>,V1beta2PriorityLevelConfigurationSpecFluent<V1beta2PriorityLevelConfigurationFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  public interface StatusNested<N> extends Nested<N>,V1beta2PriorityLevelConfigurationStatusFluent<V1beta2PriorityLevelConfigurationFluent.StatusNested<N>>{
    public N and();
    public N endStatus();
    
  }
  
}