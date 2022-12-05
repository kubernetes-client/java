package io.kubernetes.client.openapi.models;

import java.time.OffsetDateTime;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1TaintFluent<A extends V1TaintFluent<A>> extends Fluent<A>{
  public String getEffect();
  public A withEffect(String effect);
  public Boolean hasEffect();
  public String getKey();
  public A withKey(String key);
  public Boolean hasKey();
  public OffsetDateTime getTimeAdded();
  public A withTimeAdded(OffsetDateTime timeAdded);
  public Boolean hasTimeAdded();
  public String getValue();
  public A withValue(String value);
  public Boolean hasValue();
  
}