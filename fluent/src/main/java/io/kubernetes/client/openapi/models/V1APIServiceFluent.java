package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1APIServiceFluent<A extends V1APIServiceFluent<A>> extends Fluent<A>{
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
  public V1APIServiceFluent.MetadataNested<A> withNewMetadata();
  public V1APIServiceFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1APIServiceFluent.MetadataNested<A> editMetadata();
  public V1APIServiceFluent.MetadataNested<A> editOrNewMetadata();
  public V1APIServiceFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1APIServiceSpec getSpec();
  public V1APIServiceSpec buildSpec();
  public A withSpec(V1APIServiceSpec spec);
  public Boolean hasSpec();
  public V1APIServiceFluent.SpecNested<A> withNewSpec();
  public V1APIServiceFluent.SpecNested<A> withNewSpecLike(V1APIServiceSpec item);
  public V1APIServiceFluent.SpecNested<A> editSpec();
  public V1APIServiceFluent.SpecNested<A> editOrNewSpec();
  public V1APIServiceFluent.SpecNested<A> editOrNewSpecLike(V1APIServiceSpec item);
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1APIServiceStatus getStatus();
  public V1APIServiceStatus buildStatus();
  public A withStatus(V1APIServiceStatus status);
  public Boolean hasStatus();
  public V1APIServiceFluent.StatusNested<A> withNewStatus();
  public V1APIServiceFluent.StatusNested<A> withNewStatusLike(V1APIServiceStatus item);
  public V1APIServiceFluent.StatusNested<A> editStatus();
  public V1APIServiceFluent.StatusNested<A> editOrNewStatus();
  public V1APIServiceFluent.StatusNested<A> editOrNewStatusLike(V1APIServiceStatus item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1APIServiceFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends Nested<N>,V1APIServiceSpecFluent<V1APIServiceFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  public interface StatusNested<N> extends Nested<N>,V1APIServiceStatusFluent<V1APIServiceFluent.StatusNested<N>>{
    public N and();
    public N endStatus();
    
  }
  
}