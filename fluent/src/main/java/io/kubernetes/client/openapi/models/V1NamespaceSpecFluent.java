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
public interface V1NamespaceSpecFluent<A extends V1NamespaceSpecFluent<A>> extends Fluent<A>{
  public A addToFinalizers(Integer index,String item);
  public A setToFinalizers(Integer index,String item);
  public A addToFinalizers(java.lang.String... items);
  public A addAllToFinalizers(Collection<String> items);
  public A removeFromFinalizers(java.lang.String... items);
  public A removeAllFromFinalizers(Collection<String> items);
  public List<String> getFinalizers();
  public String getFinalizer(Integer index);
  public String getFirstFinalizer();
  public String getLastFinalizer();
  public String getMatchingFinalizer(Predicate<String> predicate);
  public Boolean hasMatchingFinalizer(Predicate<String> predicate);
  public A withFinalizers(List<String> finalizers);
  public A withFinalizers(java.lang.String... finalizers);
  public Boolean hasFinalizers();
  
}