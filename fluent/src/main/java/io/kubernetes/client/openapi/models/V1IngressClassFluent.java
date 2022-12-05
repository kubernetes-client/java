package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1IngressClassFluent<A extends V1IngressClassFluent<A>> extends Fluent<A>{
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
  public V1IngressClassFluent.MetadataNested<A> withNewMetadata();
  public V1IngressClassFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1IngressClassFluent.MetadataNested<A> editMetadata();
  public V1IngressClassFluent.MetadataNested<A> editOrNewMetadata();
  public V1IngressClassFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1IngressClassSpec getSpec();
  public V1IngressClassSpec buildSpec();
  public A withSpec(V1IngressClassSpec spec);
  public Boolean hasSpec();
  public V1IngressClassFluent.SpecNested<A> withNewSpec();
  public V1IngressClassFluent.SpecNested<A> withNewSpecLike(V1IngressClassSpec item);
  public V1IngressClassFluent.SpecNested<A> editSpec();
  public V1IngressClassFluent.SpecNested<A> editOrNewSpec();
  public V1IngressClassFluent.SpecNested<A> editOrNewSpecLike(V1IngressClassSpec item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1IngressClassFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends Nested<N>,V1IngressClassSpecFluent<V1IngressClassFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  
}