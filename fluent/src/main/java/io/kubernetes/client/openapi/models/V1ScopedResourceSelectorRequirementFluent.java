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
public interface V1ScopedResourceSelectorRequirementFluent<A extends io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement.OperatorEnum getOperator();
  public A withOperator(io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement.OperatorEnum operator);
  public java.lang.Boolean hasOperator();
  public io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement.ScopeNameEnum getScopeName();
  public A withScopeName(io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement.ScopeNameEnum scopeName);
  public java.lang.Boolean hasScopeName();
  public A addToValues(java.lang.Integer index,java.lang.String item);
  public A setToValues(java.lang.Integer index,java.lang.String item);
  public A addToValues(java.lang.String... items);
  public A addAllToValues(java.util.Collection<java.lang.String> items);
  public A removeFromValues(java.lang.String... items);
  public A removeAllFromValues(java.util.Collection<java.lang.String> items);
  public java.util.List<java.lang.String> getValues();
  public java.lang.String getValue(java.lang.Integer index);
  public java.lang.String getFirstValue();
  public java.lang.String getLastValue();
  public java.lang.String getMatchingValue(java.util.function.Predicate<java.lang.String> predicate);
  public java.lang.Boolean hasMatchingValue(java.util.function.Predicate<java.lang.String> predicate);
  public A withValues(java.util.List<java.lang.String> values);
  public A withValues(java.lang.String... values);
  public java.lang.Boolean hasValues();
  public A addNewValue(java.lang.String original);
  
}