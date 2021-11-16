package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1GitRepoVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1GitRepoVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getDirectory();
  public A withDirectory(java.lang.String directory);
  public java.lang.Boolean hasDirectory();
  
  /**
   * Method is deprecated. use withDirectory instead.
   */
  @java.lang.Deprecated
  public A withNewDirectory(java.lang.String arg0);
  public java.lang.String getRepository();
  public A withRepository(java.lang.String repository);
  public java.lang.Boolean hasRepository();
  
  /**
   * Method is deprecated. use withRepository instead.
   */
  @java.lang.Deprecated
  public A withNewRepository(java.lang.String arg0);
  public java.lang.String getRevision();
  public A withRevision(java.lang.String revision);
  public java.lang.Boolean hasRevision();
  
  /**
   * Method is deprecated. use withRevision instead.
   */
  @java.lang.Deprecated
  public A withNewRevision(java.lang.String arg0);
  
}