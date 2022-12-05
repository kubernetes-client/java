package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1beta1FlowSchemaFluent<A extends V1beta1FlowSchemaFluent<A>> extends Fluent<A>{
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
  public V1beta1FlowSchemaFluent.MetadataNested<A> withNewMetadata();
  public V1beta1FlowSchemaFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1beta1FlowSchemaFluent.MetadataNested<A> editMetadata();
  public V1beta1FlowSchemaFluent.MetadataNested<A> editOrNewMetadata();
  public V1beta1FlowSchemaFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1beta1FlowSchemaSpec getSpec();
  public V1beta1FlowSchemaSpec buildSpec();
  public A withSpec(V1beta1FlowSchemaSpec spec);
  public Boolean hasSpec();
  public V1beta1FlowSchemaFluent.SpecNested<A> withNewSpec();
  public V1beta1FlowSchemaFluent.SpecNested<A> withNewSpecLike(V1beta1FlowSchemaSpec item);
  public V1beta1FlowSchemaFluent.SpecNested<A> editSpec();
  public V1beta1FlowSchemaFluent.SpecNested<A> editOrNewSpec();
  public V1beta1FlowSchemaFluent.SpecNested<A> editOrNewSpecLike(V1beta1FlowSchemaSpec item);
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1beta1FlowSchemaStatus getStatus();
  public V1beta1FlowSchemaStatus buildStatus();
  public A withStatus(V1beta1FlowSchemaStatus status);
  public Boolean hasStatus();
  public V1beta1FlowSchemaFluent.StatusNested<A> withNewStatus();
  public V1beta1FlowSchemaFluent.StatusNested<A> withNewStatusLike(V1beta1FlowSchemaStatus item);
  public V1beta1FlowSchemaFluent.StatusNested<A> editStatus();
  public V1beta1FlowSchemaFluent.StatusNested<A> editOrNewStatus();
  public V1beta1FlowSchemaFluent.StatusNested<A> editOrNewStatusLike(V1beta1FlowSchemaStatus item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1beta1FlowSchemaFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends Nested<N>,V1beta1FlowSchemaSpecFluent<V1beta1FlowSchemaFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  public interface StatusNested<N> extends Nested<N>,V1beta1FlowSchemaStatusFluent<V1beta1FlowSchemaFluent.StatusNested<N>>{
    public N and();
    public N endStatus();
    
  }
  
}