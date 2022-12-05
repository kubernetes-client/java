package io.kubernetes.client.openapi.models;

import java.time.OffsetDateTime;
import io.kubernetes.client.fluent.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ManagedFieldsEntryFluent<A extends V1ManagedFieldsEntryFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public String getFieldsType();
  public A withFieldsType(String fieldsType);
  public Boolean hasFieldsType();
  public Object getFieldsV1();
  public A withFieldsV1(Object fieldsV1);
  public Boolean hasFieldsV1();
  public String getManager();
  public A withManager(String manager);
  public Boolean hasManager();
  public String getOperation();
  public A withOperation(String operation);
  public Boolean hasOperation();
  public String getSubresource();
  public A withSubresource(String subresource);
  public Boolean hasSubresource();
  public OffsetDateTime getTime();
  public A withTime(OffsetDateTime time);
  public Boolean hasTime();
  
}