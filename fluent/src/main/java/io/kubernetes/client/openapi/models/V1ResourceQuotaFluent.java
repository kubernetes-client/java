package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ResourceQuotaFluent<A extends V1ResourceQuotaFluent<A>> extends Fluent<A>{
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
  public V1ResourceQuotaFluent.MetadataNested<A> withNewMetadata();
  public V1ResourceQuotaFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1ResourceQuotaFluent.MetadataNested<A> editMetadata();
  public V1ResourceQuotaFluent.MetadataNested<A> editOrNewMetadata();
  public V1ResourceQuotaFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ResourceQuotaSpec getSpec();
  public V1ResourceQuotaSpec buildSpec();
  public A withSpec(V1ResourceQuotaSpec spec);
  public Boolean hasSpec();
  public V1ResourceQuotaFluent.SpecNested<A> withNewSpec();
  public V1ResourceQuotaFluent.SpecNested<A> withNewSpecLike(V1ResourceQuotaSpec item);
  public V1ResourceQuotaFluent.SpecNested<A> editSpec();
  public V1ResourceQuotaFluent.SpecNested<A> editOrNewSpec();
  public V1ResourceQuotaFluent.SpecNested<A> editOrNewSpecLike(V1ResourceQuotaSpec item);
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ResourceQuotaStatus getStatus();
  public V1ResourceQuotaStatus buildStatus();
  public A withStatus(V1ResourceQuotaStatus status);
  public Boolean hasStatus();
  public V1ResourceQuotaFluent.StatusNested<A> withNewStatus();
  public V1ResourceQuotaFluent.StatusNested<A> withNewStatusLike(V1ResourceQuotaStatus item);
  public V1ResourceQuotaFluent.StatusNested<A> editStatus();
  public V1ResourceQuotaFluent.StatusNested<A> editOrNewStatus();
  public V1ResourceQuotaFluent.StatusNested<A> editOrNewStatusLike(V1ResourceQuotaStatus item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1ResourceQuotaFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends Nested<N>,V1ResourceQuotaSpecFluent<V1ResourceQuotaFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  public interface StatusNested<N> extends Nested<N>,V1ResourceQuotaStatusFluent<V1ResourceQuotaFluent.StatusNested<N>>{
    public N and();
    public N endStatus();
    
  }
  
}