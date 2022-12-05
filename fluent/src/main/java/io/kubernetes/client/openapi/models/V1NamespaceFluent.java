package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1NamespaceFluent<A extends V1NamespaceFluent<A>> extends Fluent<A>{
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
  public V1NamespaceFluent.MetadataNested<A> withNewMetadata();
  public V1NamespaceFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1NamespaceFluent.MetadataNested<A> editMetadata();
  public V1NamespaceFluent.MetadataNested<A> editOrNewMetadata();
  public V1NamespaceFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1NamespaceSpec getSpec();
  public V1NamespaceSpec buildSpec();
  public A withSpec(V1NamespaceSpec spec);
  public Boolean hasSpec();
  public V1NamespaceFluent.SpecNested<A> withNewSpec();
  public V1NamespaceFluent.SpecNested<A> withNewSpecLike(V1NamespaceSpec item);
  public V1NamespaceFluent.SpecNested<A> editSpec();
  public V1NamespaceFluent.SpecNested<A> editOrNewSpec();
  public V1NamespaceFluent.SpecNested<A> editOrNewSpecLike(V1NamespaceSpec item);
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1NamespaceStatus getStatus();
  public V1NamespaceStatus buildStatus();
  public A withStatus(V1NamespaceStatus status);
  public Boolean hasStatus();
  public V1NamespaceFluent.StatusNested<A> withNewStatus();
  public V1NamespaceFluent.StatusNested<A> withNewStatusLike(V1NamespaceStatus item);
  public V1NamespaceFluent.StatusNested<A> editStatus();
  public V1NamespaceFluent.StatusNested<A> editOrNewStatus();
  public V1NamespaceFluent.StatusNested<A> editOrNewStatusLike(V1NamespaceStatus item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1NamespaceFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends Nested<N>,V1NamespaceSpecFluent<V1NamespaceFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  public interface StatusNested<N> extends Nested<N>,V1NamespaceStatusFluent<V1NamespaceFluent.StatusNested<N>>{
    public N and();
    public N endStatus();
    
  }
  
}