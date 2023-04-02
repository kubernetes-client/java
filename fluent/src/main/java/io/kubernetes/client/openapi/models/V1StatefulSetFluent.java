package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1StatefulSetFluent<A extends V1StatefulSetFluent<A>> extends Fluent<A>{
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
  public V1StatefulSetFluent.MetadataNested<A> withNewMetadata();
  public V1StatefulSetFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1StatefulSetFluent.MetadataNested<A> editMetadata();
  public V1StatefulSetFluent.MetadataNested<A> editOrNewMetadata();
  public V1StatefulSetFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1StatefulSetSpec getSpec();
  public V1StatefulSetSpec buildSpec();
  public A withSpec(V1StatefulSetSpec spec);
  public Boolean hasSpec();
  public V1StatefulSetFluent.SpecNested<A> withNewSpec();
  public V1StatefulSetFluent.SpecNested<A> withNewSpecLike(V1StatefulSetSpec item);
  public V1StatefulSetFluent.SpecNested<A> editSpec();
  public V1StatefulSetFluent.SpecNested<A> editOrNewSpec();
  public V1StatefulSetFluent.SpecNested<A> editOrNewSpecLike(V1StatefulSetSpec item);
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1StatefulSetStatus getStatus();
  public V1StatefulSetStatus buildStatus();
  public A withStatus(V1StatefulSetStatus status);
  public Boolean hasStatus();
  public V1StatefulSetFluent.StatusNested<A> withNewStatus();
  public V1StatefulSetFluent.StatusNested<A> withNewStatusLike(V1StatefulSetStatus item);
  public V1StatefulSetFluent.StatusNested<A> editStatus();
  public V1StatefulSetFluent.StatusNested<A> editOrNewStatus();
  public V1StatefulSetFluent.StatusNested<A> editOrNewStatusLike(V1StatefulSetStatus item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1StatefulSetFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends Nested<N>,V1StatefulSetSpecFluent<V1StatefulSetFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  public interface StatusNested<N> extends Nested<N>,V1StatefulSetStatusFluent<V1StatefulSetFluent.StatusNested<N>>{
    public N and();
    public N endStatus();
    
  }
  
}