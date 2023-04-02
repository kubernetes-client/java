package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1SelfSubjectAccessReviewFluent<A extends V1SelfSubjectAccessReviewFluent<A>> extends Fluent<A>{
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
  public V1SelfSubjectAccessReviewFluent.MetadataNested<A> withNewMetadata();
  public V1SelfSubjectAccessReviewFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1SelfSubjectAccessReviewFluent.MetadataNested<A> editMetadata();
  public V1SelfSubjectAccessReviewFluent.MetadataNested<A> editOrNewMetadata();
  public V1SelfSubjectAccessReviewFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1SelfSubjectAccessReviewSpec getSpec();
  public V1SelfSubjectAccessReviewSpec buildSpec();
  public A withSpec(V1SelfSubjectAccessReviewSpec spec);
  public Boolean hasSpec();
  public V1SelfSubjectAccessReviewFluent.SpecNested<A> withNewSpec();
  public V1SelfSubjectAccessReviewFluent.SpecNested<A> withNewSpecLike(V1SelfSubjectAccessReviewSpec item);
  public V1SelfSubjectAccessReviewFluent.SpecNested<A> editSpec();
  public V1SelfSubjectAccessReviewFluent.SpecNested<A> editOrNewSpec();
  public V1SelfSubjectAccessReviewFluent.SpecNested<A> editOrNewSpecLike(V1SelfSubjectAccessReviewSpec item);
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1SubjectAccessReviewStatus getStatus();
  public V1SubjectAccessReviewStatus buildStatus();
  public A withStatus(V1SubjectAccessReviewStatus status);
  public Boolean hasStatus();
  public V1SelfSubjectAccessReviewFluent.StatusNested<A> withNewStatus();
  public V1SelfSubjectAccessReviewFluent.StatusNested<A> withNewStatusLike(V1SubjectAccessReviewStatus item);
  public V1SelfSubjectAccessReviewFluent.StatusNested<A> editStatus();
  public V1SelfSubjectAccessReviewFluent.StatusNested<A> editOrNewStatus();
  public V1SelfSubjectAccessReviewFluent.StatusNested<A> editOrNewStatusLike(V1SubjectAccessReviewStatus item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1SelfSubjectAccessReviewFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends Nested<N>,V1SelfSubjectAccessReviewSpecFluent<V1SelfSubjectAccessReviewFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  public interface StatusNested<N> extends Nested<N>,V1SubjectAccessReviewStatusFluent<V1SelfSubjectAccessReviewFluent.StatusNested<N>>{
    public N and();
    public N endStatus();
    
  }
  
}