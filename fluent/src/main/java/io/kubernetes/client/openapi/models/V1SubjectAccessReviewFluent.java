package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1SubjectAccessReviewFluent<A extends V1SubjectAccessReviewFluent<A>> extends Fluent<A>{
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
  public V1SubjectAccessReviewFluent.MetadataNested<A> withNewMetadata();
  public V1SubjectAccessReviewFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1SubjectAccessReviewFluent.MetadataNested<A> editMetadata();
  public V1SubjectAccessReviewFluent.MetadataNested<A> editOrNewMetadata();
  public V1SubjectAccessReviewFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1SubjectAccessReviewSpec getSpec();
  public V1SubjectAccessReviewSpec buildSpec();
  public A withSpec(V1SubjectAccessReviewSpec spec);
  public Boolean hasSpec();
  public V1SubjectAccessReviewFluent.SpecNested<A> withNewSpec();
  public V1SubjectAccessReviewFluent.SpecNested<A> withNewSpecLike(V1SubjectAccessReviewSpec item);
  public V1SubjectAccessReviewFluent.SpecNested<A> editSpec();
  public V1SubjectAccessReviewFluent.SpecNested<A> editOrNewSpec();
  public V1SubjectAccessReviewFluent.SpecNested<A> editOrNewSpecLike(V1SubjectAccessReviewSpec item);
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1SubjectAccessReviewStatus getStatus();
  public V1SubjectAccessReviewStatus buildStatus();
  public A withStatus(V1SubjectAccessReviewStatus status);
  public Boolean hasStatus();
  public V1SubjectAccessReviewFluent.StatusNested<A> withNewStatus();
  public V1SubjectAccessReviewFluent.StatusNested<A> withNewStatusLike(V1SubjectAccessReviewStatus item);
  public V1SubjectAccessReviewFluent.StatusNested<A> editStatus();
  public V1SubjectAccessReviewFluent.StatusNested<A> editOrNewStatus();
  public V1SubjectAccessReviewFluent.StatusNested<A> editOrNewStatusLike(V1SubjectAccessReviewStatus item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1SubjectAccessReviewFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends Nested<N>,V1SubjectAccessReviewSpecFluent<V1SubjectAccessReviewFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  public interface StatusNested<N> extends Nested<N>,V1SubjectAccessReviewStatusFluent<V1SubjectAccessReviewFluent.StatusNested<N>>{
    public N and();
    public N endStatus();
    
  }
  
}