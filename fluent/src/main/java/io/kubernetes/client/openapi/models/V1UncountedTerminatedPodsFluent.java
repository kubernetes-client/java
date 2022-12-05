package io.kubernetes.client.openapi.models;

import java.lang.Integer;
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
public interface V1UncountedTerminatedPodsFluent<A extends V1UncountedTerminatedPodsFluent<A>> extends Fluent<A>{
  public A addToFailed(Integer index,String item);
  public A setToFailed(Integer index,String item);
  public A addToFailed(java.lang.String... items);
  public A addAllToFailed(Collection<String> items);
  public A removeFromFailed(java.lang.String... items);
  public A removeAllFromFailed(Collection<String> items);
  public List<String> getFailed();
  public String getFailed(Integer index);
  public String getFirstFailed();
  public String getLastFailed();
  public String getMatchingFailed(Predicate<String> predicate);
  public Boolean hasMatchingFailed(Predicate<String> predicate);
  public A withFailed(List<String> failed);
  public A withFailed(java.lang.String... failed);
  public Boolean hasFailed();
  public A addToSucceeded(Integer index,String item);
  public A setToSucceeded(Integer index,String item);
  public A addToSucceeded(java.lang.String... items);
  public A addAllToSucceeded(Collection<String> items);
  public A removeFromSucceeded(java.lang.String... items);
  public A removeAllFromSucceeded(Collection<String> items);
  public List<String> getSucceeded();
  public String getSucceeded(Integer index);
  public String getFirstSucceeded();
  public String getLastSucceeded();
  public String getMatchingSucceeded(Predicate<String> predicate);
  public Boolean hasMatchingSucceeded(Predicate<String> predicate);
  public A withSucceeded(List<String> succeeded);
  public A withSucceeded(java.lang.String... succeeded);
  public Boolean hasSucceeded();
  
}