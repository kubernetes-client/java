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
public interface V1alpha2PodSchedulingContextFluent<A extends V1alpha2PodSchedulingContextFluent<A>> extends Fluent<A>{
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
  public V1alpha2PodSchedulingContextFluent.MetadataNested<A> withNewMetadata();
  public V1alpha2PodSchedulingContextFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1alpha2PodSchedulingContextFluent.MetadataNested<A> editMetadata();
  public V1alpha2PodSchedulingContextFluent.MetadataNested<A> editOrNewMetadata();
  public V1alpha2PodSchedulingContextFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1alpha2PodSchedulingContextSpec getSpec();
  public V1alpha2PodSchedulingContextSpec buildSpec();
  public A withSpec(V1alpha2PodSchedulingContextSpec spec);
  public Boolean hasSpec();
  public V1alpha2PodSchedulingContextFluent.SpecNested<A> withNewSpec();
  public V1alpha2PodSchedulingContextFluent.SpecNested<A> withNewSpecLike(V1alpha2PodSchedulingContextSpec item);
  public V1alpha2PodSchedulingContextFluent.SpecNested<A> editSpec();
  public V1alpha2PodSchedulingContextFluent.SpecNested<A> editOrNewSpec();
  public V1alpha2PodSchedulingContextFluent.SpecNested<A> editOrNewSpecLike(V1alpha2PodSchedulingContextSpec item);
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1alpha2PodSchedulingContextStatus getStatus();
  public V1alpha2PodSchedulingContextStatus buildStatus();
  public A withStatus(V1alpha2PodSchedulingContextStatus status);
  public Boolean hasStatus();
  public V1alpha2PodSchedulingContextFluent.StatusNested<A> withNewStatus();
  public V1alpha2PodSchedulingContextFluent.StatusNested<A> withNewStatusLike(V1alpha2PodSchedulingContextStatus item);
  public V1alpha2PodSchedulingContextFluent.StatusNested<A> editStatus();
  public V1alpha2PodSchedulingContextFluent.StatusNested<A> editOrNewStatus();
  public V1alpha2PodSchedulingContextFluent.StatusNested<A> editOrNewStatusLike(V1alpha2PodSchedulingContextStatus item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1alpha2PodSchedulingContextFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends Nested<N>,V1alpha2PodSchedulingContextSpecFluent<V1alpha2PodSchedulingContextFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  public interface StatusNested<N> extends Nested<N>,V1alpha2PodSchedulingContextStatusFluent<V1alpha2PodSchedulingContextFluent.StatusNested<N>>{
    public N and();
    public N endStatus();
    
  }
  
}