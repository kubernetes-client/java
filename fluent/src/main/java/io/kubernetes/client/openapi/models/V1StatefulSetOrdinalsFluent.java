package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1StatefulSetOrdinalsFluent<A extends V1StatefulSetOrdinalsFluent<A>> extends Fluent<A>{
  public Integer getStart();
  public A withStart(Integer start);
  public Boolean hasStart();
  
}