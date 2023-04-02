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
public interface V1CapabilitiesFluent<A extends V1CapabilitiesFluent<A>> extends Fluent<A>{
  public A addToAdd(Integer index,String item);
  public A setToAdd(Integer index,String item);
  public A addToAdd(java.lang.String... items);
  public A addAllToAdd(Collection<String> items);
  public A removeFromAdd(java.lang.String... items);
  public A removeAllFromAdd(Collection<String> items);
  public List<String> getAdd();
  public String getAdd(Integer index);
  public String getFirstAdd();
  public String getLastAdd();
  public String getMatchingAdd(Predicate<String> predicate);
  public Boolean hasMatchingAdd(Predicate<String> predicate);
  public A withAdd(List<String> add);
  public A withAdd(java.lang.String... add);
  public Boolean hasAdd();
  public A addToDrop(Integer index,String item);
  public A setToDrop(Integer index,String item);
  public A addToDrop(java.lang.String... items);
  public A addAllToDrop(Collection<String> items);
  public A removeFromDrop(java.lang.String... items);
  public A removeAllFromDrop(Collection<String> items);
  public List<String> getDrop();
  public String getDrop(Integer index);
  public String getFirstDrop();
  public String getLastDrop();
  public String getMatchingDrop(Predicate<String> predicate);
  public Boolean hasMatchingDrop(Predicate<String> predicate);
  public A withDrop(List<String> drop);
  public A withDrop(java.lang.String... drop);
  public Boolean hasDrop();
  
}