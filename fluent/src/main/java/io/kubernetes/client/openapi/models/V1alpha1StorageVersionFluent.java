package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1alpha1StorageVersionFluent<A extends V1alpha1StorageVersionFluent<A>> extends Fluent<A>{
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
  public V1alpha1StorageVersionFluent.MetadataNested<A> withNewMetadata();
  public V1alpha1StorageVersionFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1alpha1StorageVersionFluent.MetadataNested<A> editMetadata();
  public V1alpha1StorageVersionFluent.MetadataNested<A> editOrNewMetadata();
  public V1alpha1StorageVersionFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  public Object getSpec();
  public A withSpec(Object spec);
  public Boolean hasSpec();
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1alpha1StorageVersionStatus getStatus();
  public V1alpha1StorageVersionStatus buildStatus();
  public A withStatus(V1alpha1StorageVersionStatus status);
  public Boolean hasStatus();
  public V1alpha1StorageVersionFluent.StatusNested<A> withNewStatus();
  public V1alpha1StorageVersionFluent.StatusNested<A> withNewStatusLike(V1alpha1StorageVersionStatus item);
  public V1alpha1StorageVersionFluent.StatusNested<A> editStatus();
  public V1alpha1StorageVersionFluent.StatusNested<A> editOrNewStatus();
  public V1alpha1StorageVersionFluent.StatusNested<A> editOrNewStatusLike(V1alpha1StorageVersionStatus item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1alpha1StorageVersionFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface StatusNested<N> extends Nested<N>,V1alpha1StorageVersionStatusFluent<V1alpha1StorageVersionFluent.StatusNested<N>>{
    public N and();
    public N endStatus();
    
  }
  
}