package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.lang.Boolean;
import java.util.function.Predicate;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1alpha2PodSchedulingContextSpecFluentImpl<A extends V1alpha2PodSchedulingContextSpecFluent<A>> extends BaseFluent<A> implements V1alpha2PodSchedulingContextSpecFluent<A>{
  public V1alpha2PodSchedulingContextSpecFluentImpl() {
  }
  public V1alpha2PodSchedulingContextSpecFluentImpl(V1alpha2PodSchedulingContextSpec instance) {
    if (instance != null) {
      this.withPotentialNodes(instance.getPotentialNodes());
      this.withSelectedNode(instance.getSelectedNode());
    }
  }
  private List<String> potentialNodes;
  private String selectedNode;
  public A addToPotentialNodes(int index,String item) {
    if (this.potentialNodes == null) {this.potentialNodes = new ArrayList<String>();}
    this.potentialNodes.add(index, item);
    return (A)this;
  }
  public A setToPotentialNodes(int index,String item) {
    if (this.potentialNodes == null) {this.potentialNodes = new ArrayList<String>();}
    this.potentialNodes.set(index, item); return (A)this;
  }
  public A addToPotentialNodes(java.lang.String... items) {
    if (this.potentialNodes == null) {this.potentialNodes = new ArrayList<String>();}
    for (String item : items) {this.potentialNodes.add(item);} return (A)this;
  }
  public A addAllToPotentialNodes(Collection<String> items) {
    if (this.potentialNodes == null) {this.potentialNodes = new ArrayList<String>();}
    for (String item : items) {this.potentialNodes.add(item);} return (A)this;
  }
  public A removeFromPotentialNodes(java.lang.String... items) {
    for (String item : items) {if (this.potentialNodes!= null){ this.potentialNodes.remove(item);}} return (A)this;
  }
  public A removeAllFromPotentialNodes(Collection<String> items) {
    for (String item : items) {if (this.potentialNodes!= null){ this.potentialNodes.remove(item);}} return (A)this;
  }
  public List<String> getPotentialNodes() {
    return this.potentialNodes;
  }
  public String getPotentialNode(int index) {
    return this.potentialNodes.get(index);
  }
  public String getFirstPotentialNode() {
    return this.potentialNodes.get(0);
  }
  public String getLastPotentialNode() {
    return this.potentialNodes.get(potentialNodes.size() - 1);
  }
  public String getMatchingPotentialNode(Predicate<String> predicate) {
    for (String item: potentialNodes) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingPotentialNode(Predicate<String> predicate) {
    for (String item: potentialNodes) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withPotentialNodes(List<String> potentialNodes) {
    if (potentialNodes != null) {this.potentialNodes = new ArrayList(); for (String item : potentialNodes){this.addToPotentialNodes(item);}} else { this.potentialNodes = null;} return (A) this;
  }
  public A withPotentialNodes(java.lang.String... potentialNodes) {
    if (this.potentialNodes != null) {this.potentialNodes.clear(); _visitables.remove("potentialNodes"); }
    if (potentialNodes != null) {for (String item :potentialNodes){ this.addToPotentialNodes(item);}} return (A) this;
  }
  public Boolean hasPotentialNodes() {
    return potentialNodes != null && !potentialNodes.isEmpty();
  }
  public String getSelectedNode() {
    return this.selectedNode;
  }
  public A withSelectedNode(String selectedNode) {
    this.selectedNode=selectedNode; return (A) this;
  }
  public Boolean hasSelectedNode() {
    return this.selectedNode != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha2PodSchedulingContextSpecFluentImpl that = (V1alpha2PodSchedulingContextSpecFluentImpl) o;
    if (!java.util.Objects.equals(potentialNodes, that.potentialNodes)) return false;

    if (!java.util.Objects.equals(selectedNode, that.selectedNode)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(potentialNodes,  selectedNode,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (potentialNodes != null && !potentialNodes.isEmpty()) { sb.append("potentialNodes:"); sb.append(potentialNodes + ","); }
    if (selectedNode != null) { sb.append("selectedNode:"); sb.append(selectedNode); }
    sb.append("}");
    return sb.toString();
  }
  
}