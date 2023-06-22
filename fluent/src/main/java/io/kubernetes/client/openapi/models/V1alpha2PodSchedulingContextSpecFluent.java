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
public interface V1alpha2PodSchedulingContextSpecFluent<A extends V1alpha2PodSchedulingContextSpecFluent<A>> extends Fluent<A>{
  public A addToPotentialNodes(int index,String item);
  public A setToPotentialNodes(int index,String item);
  public A addToPotentialNodes(java.lang.String... items);
  public A addAllToPotentialNodes(Collection<String> items);
  public A removeFromPotentialNodes(java.lang.String... items);
  public A removeAllFromPotentialNodes(Collection<String> items);
  public List<String> getPotentialNodes();
  public String getPotentialNode(int index);
  public String getFirstPotentialNode();
  public String getLastPotentialNode();
  public String getMatchingPotentialNode(Predicate<String> predicate);
  public Boolean hasMatchingPotentialNode(Predicate<String> predicate);
  public A withPotentialNodes(List<String> potentialNodes);
  public A withPotentialNodes(java.lang.String... potentialNodes);
  public Boolean hasPotentialNodes();
  public String getSelectedNode();
  public A withSelectedNode(String selectedNode);
  public Boolean hasSelectedNode();
  
}