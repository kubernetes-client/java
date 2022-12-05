package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1NodeFluent<A extends V1NodeFluent<A>> extends Fluent<A>{
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
  public V1NodeFluent.MetadataNested<A> withNewMetadata();
  public V1NodeFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1NodeFluent.MetadataNested<A> editMetadata();
  public V1NodeFluent.MetadataNested<A> editOrNewMetadata();
  public V1NodeFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1NodeSpec getSpec();
  public V1NodeSpec buildSpec();
  public A withSpec(V1NodeSpec spec);
  public Boolean hasSpec();
  public V1NodeFluent.SpecNested<A> withNewSpec();
  public V1NodeFluent.SpecNested<A> withNewSpecLike(V1NodeSpec item);
  public V1NodeFluent.SpecNested<A> editSpec();
  public V1NodeFluent.SpecNested<A> editOrNewSpec();
  public V1NodeFluent.SpecNested<A> editOrNewSpecLike(V1NodeSpec item);
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1NodeStatus getStatus();
  public V1NodeStatus buildStatus();
  public A withStatus(V1NodeStatus status);
  public Boolean hasStatus();
  public V1NodeFluent.StatusNested<A> withNewStatus();
  public V1NodeFluent.StatusNested<A> withNewStatusLike(V1NodeStatus item);
  public V1NodeFluent.StatusNested<A> editStatus();
  public V1NodeFluent.StatusNested<A> editOrNewStatus();
  public V1NodeFluent.StatusNested<A> editOrNewStatusLike(V1NodeStatus item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1NodeFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends Nested<N>,V1NodeSpecFluent<V1NodeFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  public interface StatusNested<N> extends Nested<N>,V1NodeStatusFluent<V1NodeFluent.StatusNested<N>>{
    public N and();
    public N endStatus();
    
  }
  
}