package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1LeaseFluent<A extends V1LeaseFluent<A>> extends Fluent<A>{
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
  public V1LeaseFluent.MetadataNested<A> withNewMetadata();
  public V1LeaseFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1LeaseFluent.MetadataNested<A> editMetadata();
  public V1LeaseFluent.MetadataNested<A> editOrNewMetadata();
  public V1LeaseFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LeaseSpec getSpec();
  public V1LeaseSpec buildSpec();
  public A withSpec(V1LeaseSpec spec);
  public Boolean hasSpec();
  public V1LeaseFluent.SpecNested<A> withNewSpec();
  public V1LeaseFluent.SpecNested<A> withNewSpecLike(V1LeaseSpec item);
  public V1LeaseFluent.SpecNested<A> editSpec();
  public V1LeaseFluent.SpecNested<A> editOrNewSpec();
  public V1LeaseFluent.SpecNested<A> editOrNewSpecLike(V1LeaseSpec item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1LeaseFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends Nested<N>,V1LeaseSpecFluent<V1LeaseFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  
}