package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1alpha2ResourceClaimConsumerReferenceFluent<A extends V1alpha2ResourceClaimConsumerReferenceFluent<A>> extends Fluent<A>{
  public String getApiGroup();
  public A withApiGroup(String apiGroup);
  public Boolean hasApiGroup();
  public String getName();
  public A withName(String name);
  public Boolean hasName();
  public String getResource();
  public A withResource(String resource);
  public Boolean hasResource();
  public String getUid();
  public A withUid(String uid);
  public Boolean hasUid();
  
}