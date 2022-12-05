package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1PodTemplateSpecFluent<A extends V1PodTemplateSpecFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata();
  public V1ObjectMeta buildMetadata();
  public A withMetadata(V1ObjectMeta metadata);
  public Boolean hasMetadata();
  public V1PodTemplateSpecFluent.MetadataNested<A> withNewMetadata();
  public V1PodTemplateSpecFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1PodTemplateSpecFluent.MetadataNested<A> editMetadata();
  public V1PodTemplateSpecFluent.MetadataNested<A> editOrNewMetadata();
  public V1PodTemplateSpecFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PodSpec getSpec();
  public V1PodSpec buildSpec();
  public A withSpec(V1PodSpec spec);
  public Boolean hasSpec();
  public V1PodTemplateSpecFluent.SpecNested<A> withNewSpec();
  public V1PodTemplateSpecFluent.SpecNested<A> withNewSpecLike(V1PodSpec item);
  public V1PodTemplateSpecFluent.SpecNested<A> editSpec();
  public V1PodTemplateSpecFluent.SpecNested<A> editOrNewSpec();
  public V1PodTemplateSpecFluent.SpecNested<A> editOrNewSpecLike(V1PodSpec item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1PodTemplateSpecFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends Nested<N>,V1PodSpecFluent<V1PodTemplateSpecFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  
}