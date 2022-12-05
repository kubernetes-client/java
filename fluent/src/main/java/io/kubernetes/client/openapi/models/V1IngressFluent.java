package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1IngressFluent<A extends V1IngressFluent<A>> extends Fluent<A>{
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
  public V1IngressFluent.MetadataNested<A> withNewMetadata();
  public V1IngressFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1IngressFluent.MetadataNested<A> editMetadata();
  public V1IngressFluent.MetadataNested<A> editOrNewMetadata();
  public V1IngressFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1IngressSpec getSpec();
  public V1IngressSpec buildSpec();
  public A withSpec(V1IngressSpec spec);
  public Boolean hasSpec();
  public V1IngressFluent.SpecNested<A> withNewSpec();
  public V1IngressFluent.SpecNested<A> withNewSpecLike(V1IngressSpec item);
  public V1IngressFluent.SpecNested<A> editSpec();
  public V1IngressFluent.SpecNested<A> editOrNewSpec();
  public V1IngressFluent.SpecNested<A> editOrNewSpecLike(V1IngressSpec item);
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1IngressStatus getStatus();
  public V1IngressStatus buildStatus();
  public A withStatus(V1IngressStatus status);
  public Boolean hasStatus();
  public V1IngressFluent.StatusNested<A> withNewStatus();
  public V1IngressFluent.StatusNested<A> withNewStatusLike(V1IngressStatus item);
  public V1IngressFluent.StatusNested<A> editStatus();
  public V1IngressFluent.StatusNested<A> editOrNewStatus();
  public V1IngressFluent.StatusNested<A> editOrNewStatusLike(V1IngressStatus item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1IngressFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends Nested<N>,V1IngressSpecFluent<V1IngressFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  public interface StatusNested<N> extends Nested<N>,V1IngressStatusFluent<V1IngressFluent.StatusNested<N>>{
    public N and();
    public N endStatus();
    
  }
  
}