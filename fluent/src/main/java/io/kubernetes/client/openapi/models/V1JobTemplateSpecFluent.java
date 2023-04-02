package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1JobTemplateSpecFluent<A extends V1JobTemplateSpecFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata();
  public V1ObjectMeta buildMetadata();
  public A withMetadata(V1ObjectMeta metadata);
  public Boolean hasMetadata();
  public V1JobTemplateSpecFluent.MetadataNested<A> withNewMetadata();
  public V1JobTemplateSpecFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1JobTemplateSpecFluent.MetadataNested<A> editMetadata();
  public V1JobTemplateSpecFluent.MetadataNested<A> editOrNewMetadata();
  public V1JobTemplateSpecFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1JobSpec getSpec();
  public V1JobSpec buildSpec();
  public A withSpec(V1JobSpec spec);
  public Boolean hasSpec();
  public V1JobTemplateSpecFluent.SpecNested<A> withNewSpec();
  public V1JobTemplateSpecFluent.SpecNested<A> withNewSpecLike(V1JobSpec item);
  public V1JobTemplateSpecFluent.SpecNested<A> editSpec();
  public V1JobTemplateSpecFluent.SpecNested<A> editOrNewSpec();
  public V1JobTemplateSpecFluent.SpecNested<A> editOrNewSpecLike(V1JobSpec item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1JobTemplateSpecFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends Nested<N>,V1JobSpecFluent<V1JobTemplateSpecFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  
}