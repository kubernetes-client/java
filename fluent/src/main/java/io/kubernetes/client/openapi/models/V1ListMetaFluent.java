package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.Long;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ListMetaFluent<A extends V1ListMetaFluent<A>> extends Fluent<A>{
  public String getContinue();
  public A withContinue(String _continue);
  public Boolean hasContinue();
  public Long getRemainingItemCount();
  public A withRemainingItemCount(Long remainingItemCount);
  public Boolean hasRemainingItemCount();
  public String getResourceVersion();
  public A withResourceVersion(String resourceVersion);
  public Boolean hasResourceVersion();
  public String getSelfLink();
  public A withSelfLink(String selfLink);
  public Boolean hasSelfLink();
  
}