package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1NetworkPolicyFluent<A extends V1NetworkPolicyFluent<A>> extends Fluent<A>{
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
  public V1NetworkPolicyFluent.MetadataNested<A> withNewMetadata();
  public V1NetworkPolicyFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1NetworkPolicyFluent.MetadataNested<A> editMetadata();
  public V1NetworkPolicyFluent.MetadataNested<A> editOrNewMetadata();
  public V1NetworkPolicyFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1NetworkPolicySpec getSpec();
  public V1NetworkPolicySpec buildSpec();
  public A withSpec(V1NetworkPolicySpec spec);
  public Boolean hasSpec();
  public V1NetworkPolicyFluent.SpecNested<A> withNewSpec();
  public V1NetworkPolicyFluent.SpecNested<A> withNewSpecLike(V1NetworkPolicySpec item);
  public V1NetworkPolicyFluent.SpecNested<A> editSpec();
  public V1NetworkPolicyFluent.SpecNested<A> editOrNewSpec();
  public V1NetworkPolicyFluent.SpecNested<A> editOrNewSpecLike(V1NetworkPolicySpec item);
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1NetworkPolicyStatus getStatus();
  public V1NetworkPolicyStatus buildStatus();
  public A withStatus(V1NetworkPolicyStatus status);
  public Boolean hasStatus();
  public V1NetworkPolicyFluent.StatusNested<A> withNewStatus();
  public V1NetworkPolicyFluent.StatusNested<A> withNewStatusLike(V1NetworkPolicyStatus item);
  public V1NetworkPolicyFluent.StatusNested<A> editStatus();
  public V1NetworkPolicyFluent.StatusNested<A> editOrNewStatus();
  public V1NetworkPolicyFluent.StatusNested<A> editOrNewStatusLike(V1NetworkPolicyStatus item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1NetworkPolicyFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends Nested<N>,V1NetworkPolicySpecFluent<V1NetworkPolicyFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  public interface StatusNested<N> extends Nested<N>,V1NetworkPolicyStatusFluent<V1NetworkPolicyFluent.StatusNested<N>>{
    public N and();
    public N endStatus();
    
  }
  
}