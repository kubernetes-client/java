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
public interface V1alpha1SelfSubjectReviewFluent<A extends V1alpha1SelfSubjectReviewFluent<A>> extends Fluent<A>{
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
  public V1alpha1SelfSubjectReviewFluent.MetadataNested<A> withNewMetadata();
  public V1alpha1SelfSubjectReviewFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1alpha1SelfSubjectReviewFluent.MetadataNested<A> editMetadata();
  public V1alpha1SelfSubjectReviewFluent.MetadataNested<A> editOrNewMetadata();
  public V1alpha1SelfSubjectReviewFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1alpha1SelfSubjectReviewStatus getStatus();
  public V1alpha1SelfSubjectReviewStatus buildStatus();
  public A withStatus(V1alpha1SelfSubjectReviewStatus status);
  public Boolean hasStatus();
  public V1alpha1SelfSubjectReviewFluent.StatusNested<A> withNewStatus();
  public V1alpha1SelfSubjectReviewFluent.StatusNested<A> withNewStatusLike(V1alpha1SelfSubjectReviewStatus item);
  public V1alpha1SelfSubjectReviewFluent.StatusNested<A> editStatus();
  public V1alpha1SelfSubjectReviewFluent.StatusNested<A> editOrNewStatus();
  public V1alpha1SelfSubjectReviewFluent.StatusNested<A> editOrNewStatusLike(V1alpha1SelfSubjectReviewStatus item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1alpha1SelfSubjectReviewFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface StatusNested<N> extends Nested<N>,V1alpha1SelfSubjectReviewStatusFluent<V1alpha1SelfSubjectReviewFluent.StatusNested<N>>{
    public N and();
    public N endStatus();
    
  }
  
}