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
public interface V1IPBlockFluent<A extends V1IPBlockFluent<A>> extends Fluent<A>{
  public String getCidr();
  public A withCidr(String cidr);
  public Boolean hasCidr();
  public A addToExcept(Integer index,String item);
  public A setToExcept(Integer index,String item);
  public A addToExcept(java.lang.String... items);
  public A addAllToExcept(Collection<String> items);
  public A removeFromExcept(java.lang.String... items);
  public A removeAllFromExcept(Collection<String> items);
  public List<String> getExcept();
  public String getExcept(Integer index);
  public String getFirstExcept();
  public String getLastExcept();
  public String getMatchingExcept(Predicate<String> predicate);
  public Boolean hasMatchingExcept(Predicate<String> predicate);
  public A withExcept(List<String> except);
  public A withExcept(java.lang.String... except);
  public Boolean hasExcept();
  
}