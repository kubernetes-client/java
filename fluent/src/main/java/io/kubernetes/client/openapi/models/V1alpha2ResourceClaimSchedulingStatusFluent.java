package io.kubernetes.client.openapi.models;

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
public interface V1alpha2ResourceClaimSchedulingStatusFluent<A extends V1alpha2ResourceClaimSchedulingStatusFluent<A>> extends Fluent<A>{
  public String getName();
  public A withName(String name);
  public Boolean hasName();
  public A addToUnsuitableNodes(int index,String item);
  public A setToUnsuitableNodes(int index,String item);
  public A addToUnsuitableNodes(java.lang.String... items);
  public A addAllToUnsuitableNodes(Collection<String> items);
  public A removeFromUnsuitableNodes(java.lang.String... items);
  public A removeAllFromUnsuitableNodes(Collection<String> items);
  public List<String> getUnsuitableNodes();
  public String getUnsuitableNode(int index);
  public String getFirstUnsuitableNode();
  public String getLastUnsuitableNode();
  public String getMatchingUnsuitableNode(Predicate<String> predicate);
  public Boolean hasMatchingUnsuitableNode(Predicate<String> predicate);
  public A withUnsuitableNodes(List<String> unsuitableNodes);
  public A withUnsuitableNodes(java.lang.String... unsuitableNodes);
  public Boolean hasUnsuitableNodes();
  
}