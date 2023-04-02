package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1NodeSelectorFluent<A extends V1NodeSelectorFluent<A>> extends Fluent<A>{
  public A addToNodeSelectorTerms(Integer index,V1NodeSelectorTerm item);
  public A setToNodeSelectorTerms(Integer index,V1NodeSelectorTerm item);
  public A addToNodeSelectorTerms(io.kubernetes.client.openapi.models.V1NodeSelectorTerm... items);
  public A addAllToNodeSelectorTerms(Collection<V1NodeSelectorTerm> items);
  public A removeFromNodeSelectorTerms(io.kubernetes.client.openapi.models.V1NodeSelectorTerm... items);
  public A removeAllFromNodeSelectorTerms(Collection<V1NodeSelectorTerm> items);
  public A removeMatchingFromNodeSelectorTerms(Predicate<V1NodeSelectorTermBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildNodeSelectorTerms instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1NodeSelectorTerm> getNodeSelectorTerms();
  public List<V1NodeSelectorTerm> buildNodeSelectorTerms();
  public V1NodeSelectorTerm buildNodeSelectorTerm(Integer index);
  public V1NodeSelectorTerm buildFirstNodeSelectorTerm();
  public V1NodeSelectorTerm buildLastNodeSelectorTerm();
  public V1NodeSelectorTerm buildMatchingNodeSelectorTerm(Predicate<V1NodeSelectorTermBuilder> predicate);
  public Boolean hasMatchingNodeSelectorTerm(Predicate<V1NodeSelectorTermBuilder> predicate);
  public A withNodeSelectorTerms(List<V1NodeSelectorTerm> nodeSelectorTerms);
  public A withNodeSelectorTerms(io.kubernetes.client.openapi.models.V1NodeSelectorTerm... nodeSelectorTerms);
  public Boolean hasNodeSelectorTerms();
  public V1NodeSelectorFluent.NodeSelectorTermsNested<A> addNewNodeSelectorTerm();
  public V1NodeSelectorFluent.NodeSelectorTermsNested<A> addNewNodeSelectorTermLike(V1NodeSelectorTerm item);
  public V1NodeSelectorFluent.NodeSelectorTermsNested<A> setNewNodeSelectorTermLike(Integer index,V1NodeSelectorTerm item);
  public V1NodeSelectorFluent.NodeSelectorTermsNested<A> editNodeSelectorTerm(Integer index);
  public V1NodeSelectorFluent.NodeSelectorTermsNested<A> editFirstNodeSelectorTerm();
  public V1NodeSelectorFluent.NodeSelectorTermsNested<A> editLastNodeSelectorTerm();
  public V1NodeSelectorFluent.NodeSelectorTermsNested<A> editMatchingNodeSelectorTerm(Predicate<V1NodeSelectorTermBuilder> predicate);
  public interface NodeSelectorTermsNested<N> extends Nested<N>,V1NodeSelectorTermFluent<V1NodeSelectorFluent.NodeSelectorTermsNested<N>>{
    public N and();
    public N endNodeSelectorTerm();
    
  }
  
}