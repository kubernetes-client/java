package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1CSINodeFluent<A extends V1CSINodeFluent<A>> extends Fluent<A>{
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
  public V1CSINodeFluent.MetadataNested<A> withNewMetadata();
  public V1CSINodeFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1CSINodeFluent.MetadataNested<A> editMetadata();
  public V1CSINodeFluent.MetadataNested<A> editOrNewMetadata();
  public V1CSINodeFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1CSINodeSpec getSpec();
  public V1CSINodeSpec buildSpec();
  public A withSpec(V1CSINodeSpec spec);
  public Boolean hasSpec();
  public V1CSINodeFluent.SpecNested<A> withNewSpec();
  public V1CSINodeFluent.SpecNested<A> withNewSpecLike(V1CSINodeSpec item);
  public V1CSINodeFluent.SpecNested<A> editSpec();
  public V1CSINodeFluent.SpecNested<A> editOrNewSpec();
  public V1CSINodeFluent.SpecNested<A> editOrNewSpecLike(V1CSINodeSpec item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1CSINodeFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends Nested<N>,V1CSINodeSpecFluent<V1CSINodeFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  
}