package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1HorizontalPodAutoscalerFluent<A extends V1HorizontalPodAutoscalerFluent<A>> extends Fluent<A>{
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
  public V1HorizontalPodAutoscalerFluent.MetadataNested<A> withNewMetadata();
  public V1HorizontalPodAutoscalerFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1HorizontalPodAutoscalerFluent.MetadataNested<A> editMetadata();
  public V1HorizontalPodAutoscalerFluent.MetadataNested<A> editOrNewMetadata();
  public V1HorizontalPodAutoscalerFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1HorizontalPodAutoscalerSpec getSpec();
  public V1HorizontalPodAutoscalerSpec buildSpec();
  public A withSpec(V1HorizontalPodAutoscalerSpec spec);
  public Boolean hasSpec();
  public V1HorizontalPodAutoscalerFluent.SpecNested<A> withNewSpec();
  public V1HorizontalPodAutoscalerFluent.SpecNested<A> withNewSpecLike(V1HorizontalPodAutoscalerSpec item);
  public V1HorizontalPodAutoscalerFluent.SpecNested<A> editSpec();
  public V1HorizontalPodAutoscalerFluent.SpecNested<A> editOrNewSpec();
  public V1HorizontalPodAutoscalerFluent.SpecNested<A> editOrNewSpecLike(V1HorizontalPodAutoscalerSpec item);
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1HorizontalPodAutoscalerStatus getStatus();
  public V1HorizontalPodAutoscalerStatus buildStatus();
  public A withStatus(V1HorizontalPodAutoscalerStatus status);
  public Boolean hasStatus();
  public V1HorizontalPodAutoscalerFluent.StatusNested<A> withNewStatus();
  public V1HorizontalPodAutoscalerFluent.StatusNested<A> withNewStatusLike(V1HorizontalPodAutoscalerStatus item);
  public V1HorizontalPodAutoscalerFluent.StatusNested<A> editStatus();
  public V1HorizontalPodAutoscalerFluent.StatusNested<A> editOrNewStatus();
  public V1HorizontalPodAutoscalerFluent.StatusNested<A> editOrNewStatusLike(V1HorizontalPodAutoscalerStatus item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1HorizontalPodAutoscalerFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends Nested<N>,V1HorizontalPodAutoscalerSpecFluent<V1HorizontalPodAutoscalerFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  public interface StatusNested<N> extends Nested<N>,V1HorizontalPodAutoscalerStatusFluent<V1HorizontalPodAutoscalerFluent.StatusNested<N>>{
    public N and();
    public N endStatus();
    
  }
  
}