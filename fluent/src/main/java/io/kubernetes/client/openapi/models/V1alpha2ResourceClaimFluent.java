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
public interface V1alpha2ResourceClaimFluent<A extends V1alpha2ResourceClaimFluent<A>> extends Fluent<A>{
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
  public V1alpha2ResourceClaimFluent.MetadataNested<A> withNewMetadata();
  public V1alpha2ResourceClaimFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1alpha2ResourceClaimFluent.MetadataNested<A> editMetadata();
  public V1alpha2ResourceClaimFluent.MetadataNested<A> editOrNewMetadata();
  public V1alpha2ResourceClaimFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1alpha2ResourceClaimSpec getSpec();
  public V1alpha2ResourceClaimSpec buildSpec();
  public A withSpec(V1alpha2ResourceClaimSpec spec);
  public Boolean hasSpec();
  public V1alpha2ResourceClaimFluent.SpecNested<A> withNewSpec();
  public V1alpha2ResourceClaimFluent.SpecNested<A> withNewSpecLike(V1alpha2ResourceClaimSpec item);
  public V1alpha2ResourceClaimFluent.SpecNested<A> editSpec();
  public V1alpha2ResourceClaimFluent.SpecNested<A> editOrNewSpec();
  public V1alpha2ResourceClaimFluent.SpecNested<A> editOrNewSpecLike(V1alpha2ResourceClaimSpec item);
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1alpha2ResourceClaimStatus getStatus();
  public V1alpha2ResourceClaimStatus buildStatus();
  public A withStatus(V1alpha2ResourceClaimStatus status);
  public Boolean hasStatus();
  public V1alpha2ResourceClaimFluent.StatusNested<A> withNewStatus();
  public V1alpha2ResourceClaimFluent.StatusNested<A> withNewStatusLike(V1alpha2ResourceClaimStatus item);
  public V1alpha2ResourceClaimFluent.StatusNested<A> editStatus();
  public V1alpha2ResourceClaimFluent.StatusNested<A> editOrNewStatus();
  public V1alpha2ResourceClaimFluent.StatusNested<A> editOrNewStatusLike(V1alpha2ResourceClaimStatus item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1alpha2ResourceClaimFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends Nested<N>,V1alpha2ResourceClaimSpecFluent<V1alpha2ResourceClaimFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  public interface StatusNested<N> extends Nested<N>,V1alpha2ResourceClaimStatusFluent<V1alpha2ResourceClaimFluent.StatusNested<N>>{
    public N and();
    public N endStatus();
    
  }
  
}