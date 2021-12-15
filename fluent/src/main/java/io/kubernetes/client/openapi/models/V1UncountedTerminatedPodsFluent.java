package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.lang.String;
import java.lang.Boolean;
import java.util.function.Predicate;

 /**
  * Generated
  */
public interface V1UncountedTerminatedPodsFluent<A extends io.kubernetes.client.openapi.models.V1UncountedTerminatedPodsFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public A addToFailed(java.lang.Integer index,java.lang.String item);
  public A setToFailed(java.lang.Integer index,java.lang.String item);
  public A addToFailed(java.lang.String... items);
  public A addAllToFailed(java.util.Collection<java.lang.String> items);
  public A removeFromFailed(java.lang.String... items);
  public A removeAllFromFailed(java.util.Collection<java.lang.String> items);
  public java.util.List<java.lang.String> getFailed();
  public java.lang.String getFailed(java.lang.Integer index);
  public java.lang.String getFirstFailed();
  public java.lang.String getLastFailed();
  public java.lang.String getMatchingFailed(java.util.function.Predicate<java.lang.String> predicate);
  public java.lang.Boolean hasMatchingFailed(java.util.function.Predicate<java.lang.String> predicate);
  public A withFailed(java.util.List<java.lang.String> failed);
  public A withFailed(java.lang.String... failed);
  public java.lang.Boolean hasFailed();
  public A addNewFailed(java.lang.String original);
  public A addToSucceeded(java.lang.Integer index,java.lang.String item);
  public A setToSucceeded(java.lang.Integer index,java.lang.String item);
  public A addToSucceeded(java.lang.String... items);
  public A addAllToSucceeded(java.util.Collection<java.lang.String> items);
  public A removeFromSucceeded(java.lang.String... items);
  public A removeAllFromSucceeded(java.util.Collection<java.lang.String> items);
  public java.util.List<java.lang.String> getSucceeded();
  public java.lang.String getSucceeded(java.lang.Integer index);
  public java.lang.String getFirstSucceeded();
  public java.lang.String getLastSucceeded();
  public java.lang.String getMatchingSucceeded(java.util.function.Predicate<java.lang.String> predicate);
  public java.lang.Boolean hasMatchingSucceeded(java.util.function.Predicate<java.lang.String> predicate);
  public A withSucceeded(java.util.List<java.lang.String> succeeded);
  public A withSucceeded(java.lang.String... succeeded);
  public java.lang.Boolean hasSucceeded();
  public A addNewSucceeded(java.lang.String original);
  
}