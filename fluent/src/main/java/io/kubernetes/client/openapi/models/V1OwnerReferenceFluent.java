package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1OwnerReferenceFluent<A extends V1OwnerReferenceFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public Boolean getBlockOwnerDeletion();
  public A withBlockOwnerDeletion(Boolean blockOwnerDeletion);
  public Boolean hasBlockOwnerDeletion();
  public Boolean getController();
  public A withController(Boolean controller);
  public Boolean hasController();
  public String getKind();
  public A withKind(String kind);
  public Boolean hasKind();
  public String getName();
  public A withName(String name);
  public Boolean hasName();
  public String getUid();
  public A withUid(String uid);
  public Boolean hasUid();
  public A withBlockOwnerDeletion();
  public A withController();
  
}