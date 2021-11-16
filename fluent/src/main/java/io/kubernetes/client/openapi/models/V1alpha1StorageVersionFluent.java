package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1alpha1StorageVersionFluent<A extends io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getApiVersion();
  public A withApiVersion(java.lang.String apiVersion);
  public java.lang.Boolean hasApiVersion();
  
  /**
   * Method is deprecated. use withApiVersion instead.
   */
  @java.lang.Deprecated
  public A withNewApiVersion(java.lang.String arg0);
  public java.lang.String getKind();
  public A withKind(java.lang.String kind);
  public java.lang.Boolean hasKind();
  
  /**
   * Method is deprecated. use withKind instead.
   */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String arg0);
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata();
  public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata();
  public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata);
  public java.lang.Boolean hasMetadata();
  public io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluent.MetadataNested<A> withNewMetadata();
  public io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
  public io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluent.MetadataNested<A> editMetadata();
  public io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluent.MetadataNested<A> editOrNewMetadata();
  public io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
  public java.lang.Object getSpec();
  public A withSpec(java.lang.Object spec);
  public java.lang.Boolean hasSpec();
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatus getStatus();
  public io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatus buildStatus();
  public A withStatus(io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatus status);
  public java.lang.Boolean hasStatus();
  public io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluent.StatusNested<A> withNewStatus();
  public io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluent.StatusNested<A> withNewStatusLike(io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatus item);
  public io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluent.StatusNested<A> editStatus();
  public io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluent.StatusNested<A> editOrNewStatus();
  public io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluent.StatusNested<A> editOrNewStatusLike(io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatus item);
  public interface MetadataNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ObjectMetaFluent<io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface StatusNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent<io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluent.StatusNested<N>>{
    public N and();
    public N endStatus();
    
  }
  
}