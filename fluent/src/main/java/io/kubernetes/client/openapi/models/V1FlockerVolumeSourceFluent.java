package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1FlockerVolumeSourceFluent<A extends V1FlockerVolumeSourceFluent<A>> extends Fluent<A>{
  public String getDatasetName();
  public A withDatasetName(String datasetName);
  public Boolean hasDatasetName();
  public String getDatasetUUID();
  public A withDatasetUUID(String datasetUUID);
  public Boolean hasDatasetUUID();
  
}