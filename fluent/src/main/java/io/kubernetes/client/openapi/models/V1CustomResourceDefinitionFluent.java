package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1CustomResourceDefinitionFluent<A extends V1CustomResourceDefinitionFluent<A>> extends Fluent<A>{
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
  public V1CustomResourceDefinitionFluent.MetadataNested<A> withNewMetadata();
  public V1CustomResourceDefinitionFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1CustomResourceDefinitionFluent.MetadataNested<A> editMetadata();
  public V1CustomResourceDefinitionFluent.MetadataNested<A> editOrNewMetadata();
  public V1CustomResourceDefinitionFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1CustomResourceDefinitionSpec getSpec();
  public V1CustomResourceDefinitionSpec buildSpec();
  public A withSpec(V1CustomResourceDefinitionSpec spec);
  public Boolean hasSpec();
  public V1CustomResourceDefinitionFluent.SpecNested<A> withNewSpec();
  public V1CustomResourceDefinitionFluent.SpecNested<A> withNewSpecLike(V1CustomResourceDefinitionSpec item);
  public V1CustomResourceDefinitionFluent.SpecNested<A> editSpec();
  public V1CustomResourceDefinitionFluent.SpecNested<A> editOrNewSpec();
  public V1CustomResourceDefinitionFluent.SpecNested<A> editOrNewSpecLike(V1CustomResourceDefinitionSpec item);
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1CustomResourceDefinitionStatus getStatus();
  public V1CustomResourceDefinitionStatus buildStatus();
  public A withStatus(V1CustomResourceDefinitionStatus status);
  public Boolean hasStatus();
  public V1CustomResourceDefinitionFluent.StatusNested<A> withNewStatus();
  public V1CustomResourceDefinitionFluent.StatusNested<A> withNewStatusLike(V1CustomResourceDefinitionStatus item);
  public V1CustomResourceDefinitionFluent.StatusNested<A> editStatus();
  public V1CustomResourceDefinitionFluent.StatusNested<A> editOrNewStatus();
  public V1CustomResourceDefinitionFluent.StatusNested<A> editOrNewStatusLike(V1CustomResourceDefinitionStatus item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1CustomResourceDefinitionFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends Nested<N>,V1CustomResourceDefinitionSpecFluent<V1CustomResourceDefinitionFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  public interface StatusNested<N> extends Nested<N>,V1CustomResourceDefinitionStatusFluent<V1CustomResourceDefinitionFluent.StatusNested<N>>{
    public N and();
    public N endStatus();
    
  }
  
}