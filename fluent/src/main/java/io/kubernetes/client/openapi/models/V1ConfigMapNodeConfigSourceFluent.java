package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ConfigMapNodeConfigSourceFluent<A extends io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getKubeletConfigKey();
  public A withKubeletConfigKey(java.lang.String kubeletConfigKey);
  public java.lang.Boolean hasKubeletConfigKey();
  
  /**
   * Method is deprecated. use withKubeletConfigKey instead.
   */
  @java.lang.Deprecated
  public A withNewKubeletConfigKey(java.lang.String original);
  public java.lang.String getName();
  public A withName(java.lang.String name);
  public java.lang.Boolean hasName();
  
  /**
   * Method is deprecated. use withName instead.
   */
  @java.lang.Deprecated
  public A withNewName(java.lang.String original);
  public java.lang.String getNamespace();
  public A withNamespace(java.lang.String namespace);
  public java.lang.Boolean hasNamespace();
  
  /**
   * Method is deprecated. use withNamespace instead.
   */
  @java.lang.Deprecated
  public A withNewNamespace(java.lang.String original);
  public java.lang.String getResourceVersion();
  public A withResourceVersion(java.lang.String resourceVersion);
  public java.lang.Boolean hasResourceVersion();
  
  /**
   * Method is deprecated. use withResourceVersion instead.
   */
  @java.lang.Deprecated
  public A withNewResourceVersion(java.lang.String original);
  public java.lang.String getUid();
  public A withUid(java.lang.String uid);
  public java.lang.Boolean hasUid();
  
  /**
   * Method is deprecated. use withUid instead.
   */
  @java.lang.Deprecated
  public A withNewUid(java.lang.String original);
  
}