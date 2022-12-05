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
public interface V1PodFailurePolicyOnExitCodesRequirementFluent<A extends V1PodFailurePolicyOnExitCodesRequirementFluent<A>> extends Fluent<A>{
  public String getContainerName();
  public A withContainerName(String containerName);
  public Boolean hasContainerName();
  public String getOperator();
  public A withOperator(String operator);
  public Boolean hasOperator();
  public A addToValues(Integer index,Integer item);
  public A setToValues(Integer index,Integer item);
  public A addToValues(java.lang.Integer... items);
  public A addAllToValues(Collection<Integer> items);
  public A removeFromValues(java.lang.Integer... items);
  public A removeAllFromValues(Collection<Integer> items);
  public List<Integer> getValues();
  public Integer getValue(Integer index);
  public Integer getFirstValue();
  public Integer getLastValue();
  public Integer getMatchingValue(Predicate<Integer> predicate);
  public Boolean hasMatchingValue(Predicate<Integer> predicate);
  public A withValues(List<Integer> values);
  public A withValues(java.lang.Integer... values);
  public Boolean hasValues();
  
}