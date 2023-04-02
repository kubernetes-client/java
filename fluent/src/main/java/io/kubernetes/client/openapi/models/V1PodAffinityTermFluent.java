package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1PodAffinityTermFluent<A extends V1PodAffinityTermFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildLabelSelector instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LabelSelector getLabelSelector();
  public V1LabelSelector buildLabelSelector();
  public A withLabelSelector(V1LabelSelector labelSelector);
  public Boolean hasLabelSelector();
  public V1PodAffinityTermFluent.LabelSelectorNested<A> withNewLabelSelector();
  public V1PodAffinityTermFluent.LabelSelectorNested<A> withNewLabelSelectorLike(V1LabelSelector item);
  public V1PodAffinityTermFluent.LabelSelectorNested<A> editLabelSelector();
  public V1PodAffinityTermFluent.LabelSelectorNested<A> editOrNewLabelSelector();
  public V1PodAffinityTermFluent.LabelSelectorNested<A> editOrNewLabelSelectorLike(V1LabelSelector item);
  
  /**
   * This method has been deprecated, please use method buildNamespaceSelector instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LabelSelector getNamespaceSelector();
  public V1LabelSelector buildNamespaceSelector();
  public A withNamespaceSelector(V1LabelSelector namespaceSelector);
  public Boolean hasNamespaceSelector();
  public V1PodAffinityTermFluent.NamespaceSelectorNested<A> withNewNamespaceSelector();
  public V1PodAffinityTermFluent.NamespaceSelectorNested<A> withNewNamespaceSelectorLike(V1LabelSelector item);
  public V1PodAffinityTermFluent.NamespaceSelectorNested<A> editNamespaceSelector();
  public V1PodAffinityTermFluent.NamespaceSelectorNested<A> editOrNewNamespaceSelector();
  public V1PodAffinityTermFluent.NamespaceSelectorNested<A> editOrNewNamespaceSelectorLike(V1LabelSelector item);
  public A addToNamespaces(Integer index,String item);
  public A setToNamespaces(Integer index,String item);
  public A addToNamespaces(java.lang.String... items);
  public A addAllToNamespaces(Collection<String> items);
  public A removeFromNamespaces(java.lang.String... items);
  public A removeAllFromNamespaces(Collection<String> items);
  public List<String> getNamespaces();
  public String getNamespace(Integer index);
  public String getFirstNamespace();
  public String getLastNamespace();
  public String getMatchingNamespace(Predicate<String> predicate);
  public Boolean hasMatchingNamespace(Predicate<String> predicate);
  public A withNamespaces(List<String> namespaces);
  public A withNamespaces(java.lang.String... namespaces);
  public Boolean hasNamespaces();
  public String getTopologyKey();
  public A withTopologyKey(String topologyKey);
  public Boolean hasTopologyKey();
  public interface LabelSelectorNested<N> extends Nested<N>,V1LabelSelectorFluent<V1PodAffinityTermFluent.LabelSelectorNested<N>>{
    public N and();
    public N endLabelSelector();
    
  }
  public interface NamespaceSelectorNested<N> extends Nested<N>,V1LabelSelectorFluent<V1PodAffinityTermFluent.NamespaceSelectorNested<N>>{
    public N and();
    public N endNamespaceSelector();
    
  }
  
}