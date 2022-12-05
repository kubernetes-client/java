package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.Fluent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.function.Predicate;

 /**
  * Generated
  */
public interface V1UserInfoFluent<A extends V1UserInfoFluent<A>> extends Fluent<A>{
  public A addToExtra(String key,List<String> value);
  public A addToExtra(Map<String,List<String>> map);
  public A removeFromExtra(String key);
  public A removeFromExtra(Map<String,List<String>> map);
  public Map<String,List<String>> getExtra();
  public <K,V>A withExtra(Map<String,List<String>> extra);
  public Boolean hasExtra();
  public A addToGroups(Integer index,String item);
  public A setToGroups(Integer index,String item);
  public A addToGroups(java.lang.String... items);
  public A addAllToGroups(Collection<String> items);
  public A removeFromGroups(java.lang.String... items);
  public A removeAllFromGroups(Collection<String> items);
  public List<String> getGroups();
  public String getGroup(Integer index);
  public String getFirstGroup();
  public String getLastGroup();
  public String getMatchingGroup(Predicate<String> predicate);
  public Boolean hasMatchingGroup(Predicate<String> predicate);
  public A withGroups(List<String> groups);
  public A withGroups(java.lang.String... groups);
  public Boolean hasGroups();
  public String getUid();
  public A withUid(String uid);
  public Boolean hasUid();
  public String getUsername();
  public A withUsername(String username);
  public Boolean hasUsername();
  
}