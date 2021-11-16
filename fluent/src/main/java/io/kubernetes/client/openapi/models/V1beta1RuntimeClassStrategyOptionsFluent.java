package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
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
public interface V1beta1RuntimeClassStrategyOptionsFluent<A extends io.kubernetes.client.openapi.models.V1beta1RuntimeClassStrategyOptionsFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public A addToAllowedRuntimeClassNames(java.lang.Integer index,java.lang.String item);
  public A setToAllowedRuntimeClassNames(java.lang.Integer index,java.lang.String item);
  public A addToAllowedRuntimeClassNames(java.lang.String... items);
  public A addAllToAllowedRuntimeClassNames(java.util.Collection<java.lang.String> items);
  public A removeFromAllowedRuntimeClassNames(java.lang.String... items);
  public A removeAllFromAllowedRuntimeClassNames(java.util.Collection<java.lang.String> items);
  public java.util.List<java.lang.String> getAllowedRuntimeClassNames();
  public java.lang.String getAllowedRuntimeClassName(java.lang.Integer index);
  public java.lang.String getFirstAllowedRuntimeClassName();
  public java.lang.String getLastAllowedRuntimeClassName();
  public java.lang.String getMatchingAllowedRuntimeClassName(java.util.function.Predicate<java.lang.String> predicate);
  public java.lang.Boolean hasMatchingAllowedRuntimeClassName(java.util.function.Predicate<java.lang.String> predicate);
  public A withAllowedRuntimeClassNames(java.util.List<java.lang.String> allowedRuntimeClassNames);
  public A withAllowedRuntimeClassNames(java.lang.String... allowedRuntimeClassNames);
  public java.lang.Boolean hasAllowedRuntimeClassNames();
  public A addNewAllowedRuntimeClassName(java.lang.String arg0);
  public java.lang.String getDefaultRuntimeClassName();
  public A withDefaultRuntimeClassName(java.lang.String defaultRuntimeClassName);
  public java.lang.Boolean hasDefaultRuntimeClassName();
  
  /**
   * Method is deprecated. use withDefaultRuntimeClassName instead.
   */
  @java.lang.Deprecated
  public A withNewDefaultRuntimeClassName(java.lang.String arg0);
  
}