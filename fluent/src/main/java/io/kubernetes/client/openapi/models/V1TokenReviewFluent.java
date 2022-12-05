package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1TokenReviewFluent<A extends V1TokenReviewFluent<A>> extends Fluent<A>{
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
  public V1TokenReviewFluent.MetadataNested<A> withNewMetadata();
  public V1TokenReviewFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1TokenReviewFluent.MetadataNested<A> editMetadata();
  public V1TokenReviewFluent.MetadataNested<A> editOrNewMetadata();
  public V1TokenReviewFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1TokenReviewSpec getSpec();
  public V1TokenReviewSpec buildSpec();
  public A withSpec(V1TokenReviewSpec spec);
  public Boolean hasSpec();
  public V1TokenReviewFluent.SpecNested<A> withNewSpec();
  public V1TokenReviewFluent.SpecNested<A> withNewSpecLike(V1TokenReviewSpec item);
  public V1TokenReviewFluent.SpecNested<A> editSpec();
  public V1TokenReviewFluent.SpecNested<A> editOrNewSpec();
  public V1TokenReviewFluent.SpecNested<A> editOrNewSpecLike(V1TokenReviewSpec item);
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1TokenReviewStatus getStatus();
  public V1TokenReviewStatus buildStatus();
  public A withStatus(V1TokenReviewStatus status);
  public Boolean hasStatus();
  public V1TokenReviewFluent.StatusNested<A> withNewStatus();
  public V1TokenReviewFluent.StatusNested<A> withNewStatusLike(V1TokenReviewStatus item);
  public V1TokenReviewFluent.StatusNested<A> editStatus();
  public V1TokenReviewFluent.StatusNested<A> editOrNewStatus();
  public V1TokenReviewFluent.StatusNested<A> editOrNewStatusLike(V1TokenReviewStatus item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1TokenReviewFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends Nested<N>,V1TokenReviewSpecFluent<V1TokenReviewFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  public interface StatusNested<N> extends Nested<N>,V1TokenReviewStatusFluent<V1TokenReviewFluent.StatusNested<N>>{
    public N and();
    public N endStatus();
    
  }
  
}