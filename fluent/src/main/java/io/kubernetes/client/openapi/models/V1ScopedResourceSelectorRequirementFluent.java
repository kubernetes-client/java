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
public interface V1ScopedResourceSelectorRequirementFluent<A extends V1ScopedResourceSelectorRequirementFluent<A>> extends Fluent<A>{
  public String getOperator();
  public A withOperator(String operator);
  public Boolean hasOperator();
  public String getScopeName();
  public A withScopeName(String scopeName);
  public Boolean hasScopeName();
  public A addToValues(Integer index,String item);
  public A setToValues(Integer index,String item);
  public A addToValues(java.lang.String... items);
  public A addAllToValues(Collection<String> items);
  public A removeFromValues(java.lang.String... items);
  public A removeAllFromValues(Collection<String> items);
  public List<String> getValues();
  public String getValue(Integer index);
  public String getFirstValue();
  public String getLastValue();
  public String getMatchingValue(Predicate<String> predicate);
  public Boolean hasMatchingValue(Predicate<String> predicate);
  public A withValues(List<String> values);
  public A withValues(java.lang.String... values);
  public Boolean hasValues();
  
}