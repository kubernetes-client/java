package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ConfigMapNodeConfigSourceFluent<A extends V1ConfigMapNodeConfigSourceFluent<A>> extends Fluent<A>{
  public String getKubeletConfigKey();
  public A withKubeletConfigKey(String kubeletConfigKey);
  public Boolean hasKubeletConfigKey();
  public String getName();
  public A withName(String name);
  public Boolean hasName();
  public String getNamespace();
  public A withNamespace(String namespace);
  public Boolean hasNamespace();
  public String getResourceVersion();
  public A withResourceVersion(String resourceVersion);
  public Boolean hasResourceVersion();
  public String getUid();
  public A withUid(String uid);
  public Boolean hasUid();
  
}