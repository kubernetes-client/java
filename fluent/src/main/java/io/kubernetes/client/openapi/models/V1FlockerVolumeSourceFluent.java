package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1FlockerVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1FlockerVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getDatasetName();
  public A withDatasetName(java.lang.String datasetName);
  public java.lang.Boolean hasDatasetName();
  
  /**
   * Method is deprecated. use withDatasetName instead.
   */
  @java.lang.Deprecated
  public A withNewDatasetName(java.lang.String arg0);
  public java.lang.String getDatasetUUID();
  public A withDatasetUUID(java.lang.String datasetUUID);
  public java.lang.Boolean hasDatasetUUID();
  
  /**
   * Method is deprecated. use withDatasetUUID instead.
   */
  @java.lang.Deprecated
  public A withNewDatasetUUID(java.lang.String arg0);
  
}