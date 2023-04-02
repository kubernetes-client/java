package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

 /**
  * Generated
  */
public interface V1SchedulingFluent<A extends V1SchedulingFluent<A>> extends Fluent<A>{
  public A addToNodeSelector(String key,String value);
  public A addToNodeSelector(Map<String,String> map);
  public A removeFromNodeSelector(String key);
  public A removeFromNodeSelector(Map<String,String> map);
  public Map<String,String> getNodeSelector();
  public <K,V>A withNodeSelector(Map<String,String> nodeSelector);
  public Boolean hasNodeSelector();
  public A addToTolerations(Integer index,V1Toleration item);
  public A setToTolerations(Integer index,V1Toleration item);
  public A addToTolerations(io.kubernetes.client.openapi.models.V1Toleration... items);
  public A addAllToTolerations(Collection<V1Toleration> items);
  public A removeFromTolerations(io.kubernetes.client.openapi.models.V1Toleration... items);
  public A removeAllFromTolerations(Collection<V1Toleration> items);
  public A removeMatchingFromTolerations(Predicate<V1TolerationBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildTolerations instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1Toleration> getTolerations();
  public List<V1Toleration> buildTolerations();
  public V1Toleration buildToleration(Integer index);
  public V1Toleration buildFirstToleration();
  public V1Toleration buildLastToleration();
  public V1Toleration buildMatchingToleration(Predicate<V1TolerationBuilder> predicate);
  public Boolean hasMatchingToleration(Predicate<V1TolerationBuilder> predicate);
  public A withTolerations(List<V1Toleration> tolerations);
  public A withTolerations(io.kubernetes.client.openapi.models.V1Toleration... tolerations);
  public Boolean hasTolerations();
  public V1SchedulingFluent.TolerationsNested<A> addNewToleration();
  public V1SchedulingFluent.TolerationsNested<A> addNewTolerationLike(V1Toleration item);
  public V1SchedulingFluent.TolerationsNested<A> setNewTolerationLike(Integer index,V1Toleration item);
  public V1SchedulingFluent.TolerationsNested<A> editToleration(Integer index);
  public V1SchedulingFluent.TolerationsNested<A> editFirstToleration();
  public V1SchedulingFluent.TolerationsNested<A> editLastToleration();
  public V1SchedulingFluent.TolerationsNested<A> editMatchingToleration(Predicate<V1TolerationBuilder> predicate);
  public interface TolerationsNested<N> extends Nested<N>,V1TolerationFluent<V1SchedulingFluent.TolerationsNested<N>>{
    public N and();
    public N endToleration();
    
  }
  
}