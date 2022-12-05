package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1GitRepoVolumeSourceFluent<A extends V1GitRepoVolumeSourceFluent<A>> extends Fluent<A>{
  public String getDirectory();
  public A withDirectory(String directory);
  public Boolean hasDirectory();
  public String getRepository();
  public A withRepository(String repository);
  public Boolean hasRepository();
  public String getRevision();
  public A withRevision(String revision);
  public Boolean hasRevision();
  
}