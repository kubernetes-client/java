package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1beta3FlowSchemaFluent<A extends V1beta3FlowSchemaFluent<A>> extends Fluent<A>{
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
  public V1beta3FlowSchemaFluent.MetadataNested<A> withNewMetadata();
  public V1beta3FlowSchemaFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1beta3FlowSchemaFluent.MetadataNested<A> editMetadata();
  public V1beta3FlowSchemaFluent.MetadataNested<A> editOrNewMetadata();
  public V1beta3FlowSchemaFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1beta3FlowSchemaSpec getSpec();
  public V1beta3FlowSchemaSpec buildSpec();
  public A withSpec(V1beta3FlowSchemaSpec spec);
  public Boolean hasSpec();
  public V1beta3FlowSchemaFluent.SpecNested<A> withNewSpec();
  public V1beta3FlowSchemaFluent.SpecNested<A> withNewSpecLike(V1beta3FlowSchemaSpec item);
  public V1beta3FlowSchemaFluent.SpecNested<A> editSpec();
  public V1beta3FlowSchemaFluent.SpecNested<A> editOrNewSpec();
  public V1beta3FlowSchemaFluent.SpecNested<A> editOrNewSpecLike(V1beta3FlowSchemaSpec item);
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1beta3FlowSchemaStatus getStatus();
  public V1beta3FlowSchemaStatus buildStatus();
  public A withStatus(V1beta3FlowSchemaStatus status);
  public Boolean hasStatus();
  public V1beta3FlowSchemaFluent.StatusNested<A> withNewStatus();
  public V1beta3FlowSchemaFluent.StatusNested<A> withNewStatusLike(V1beta3FlowSchemaStatus item);
  public V1beta3FlowSchemaFluent.StatusNested<A> editStatus();
  public V1beta3FlowSchemaFluent.StatusNested<A> editOrNewStatus();
  public V1beta3FlowSchemaFluent.StatusNested<A> editOrNewStatusLike(V1beta3FlowSchemaStatus item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1beta3FlowSchemaFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends Nested<N>,V1beta3FlowSchemaSpecFluent<V1beta3FlowSchemaFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  public interface StatusNested<N> extends Nested<N>,V1beta3FlowSchemaStatusFluent<V1beta3FlowSchemaFluent.StatusNested<N>>{
    public N and();
    public N endStatus();
    
  }
  
}