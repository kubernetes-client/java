package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

 /**
  * Generated
  */
public interface V1UserInfoFluent<A extends io.kubernetes.client.openapi.models.V1UserInfoFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public A addToExtra(java.lang.String key,java.util.List<java.lang.String> value);
  public A addToExtra(java.util.Map<java.lang.String,java.util.List<java.lang.String>> map);
  public A removeFromExtra(java.lang.String key);
  public A removeFromExtra(java.util.Map<java.lang.String,java.util.List<java.lang.String>> map);
  public java.util.Map<java.lang.String,java.util.List<java.lang.String>> getExtra();
  public <K,V>A withExtra(java.util.Map<java.lang.String,java.util.List<java.lang.String>> extra);
  public java.lang.Boolean hasExtra();
  public A addToGroups(java.lang.Integer index,java.lang.String item);
  public A setToGroups(java.lang.Integer index,java.lang.String item);
  public A addToGroups(java.lang.String... items);
  public A addAllToGroups(java.util.Collection<java.lang.String> items);
  public A removeFromGroups(java.lang.String... items);
  public A removeAllFromGroups(java.util.Collection<java.lang.String> items);
  public java.util.List<java.lang.String> getGroups();
  public java.lang.String getGroup(java.lang.Integer index);
  public java.lang.String getFirstGroup();
  public java.lang.String getLastGroup();
  public java.lang.String getMatchingGroup(java.util.function.Predicate<java.lang.String> predicate);
  public java.lang.Boolean hasMatchingGroup(java.util.function.Predicate<java.lang.String> predicate);
  public A withGroups(java.util.List<java.lang.String> groups);
  public A withGroups(java.lang.String... groups);
  public java.lang.Boolean hasGroups();
  public A addNewGroup(java.lang.String original);
  public java.lang.String getUid();
  public A withUid(java.lang.String uid);
  public java.lang.Boolean hasUid();
  
  /**
   * Method is deprecated. use withUid instead.
   */
  @java.lang.Deprecated
  public A withNewUid(java.lang.String original);
  public java.lang.String getUsername();
  public A withUsername(java.lang.String username);
  public java.lang.Boolean hasUsername();
  
  /**
   * Method is deprecated. use withUsername instead.
   */
  @java.lang.Deprecated
  public A withNewUsername(java.lang.String original);
  
}