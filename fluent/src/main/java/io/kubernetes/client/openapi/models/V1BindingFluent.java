package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1BindingFluent<A extends V1BindingFluent<A>> extends Fluent<A>{
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
  public V1BindingFluent.MetadataNested<A> withNewMetadata();
  public V1BindingFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1BindingFluent.MetadataNested<A> editMetadata();
  public V1BindingFluent.MetadataNested<A> editOrNewMetadata();
  public V1BindingFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildTarget instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectReference getTarget();
  public V1ObjectReference buildTarget();
  public A withTarget(V1ObjectReference target);
  public Boolean hasTarget();
  public V1BindingFluent.TargetNested<A> withNewTarget();
  public V1BindingFluent.TargetNested<A> withNewTargetLike(V1ObjectReference item);
  public V1BindingFluent.TargetNested<A> editTarget();
  public V1BindingFluent.TargetNested<A> editOrNewTarget();
  public V1BindingFluent.TargetNested<A> editOrNewTargetLike(V1ObjectReference item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1BindingFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface TargetNested<N> extends Nested<N>,V1ObjectReferenceFluent<V1BindingFluent.TargetNested<N>>{
    public N and();
    public N endTarget();
    
  }
  
}