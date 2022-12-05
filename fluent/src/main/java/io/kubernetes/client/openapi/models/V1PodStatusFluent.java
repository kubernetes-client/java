package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import io.kubernetes.client.fluent.Fluent;
import java.lang.Integer;
import java.time.OffsetDateTime;
import java.util.Collection;

 /**
  * Generated
  */
public interface V1PodStatusFluent<A extends V1PodStatusFluent<A>> extends Fluent<A>{
  public A addToConditions(Integer index,V1PodCondition item);
  public A setToConditions(Integer index,V1PodCondition item);
  public A addToConditions(io.kubernetes.client.openapi.models.V1PodCondition... items);
  public A addAllToConditions(Collection<V1PodCondition> items);
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1PodCondition... items);
  public A removeAllFromConditions(Collection<V1PodCondition> items);
  public A removeMatchingFromConditions(Predicate<V1PodConditionBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildConditions instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1PodCondition> getConditions();
  public List<V1PodCondition> buildConditions();
  public V1PodCondition buildCondition(Integer index);
  public V1PodCondition buildFirstCondition();
  public V1PodCondition buildLastCondition();
  public V1PodCondition buildMatchingCondition(Predicate<V1PodConditionBuilder> predicate);
  public Boolean hasMatchingCondition(Predicate<V1PodConditionBuilder> predicate);
  public A withConditions(List<V1PodCondition> conditions);
  public A withConditions(io.kubernetes.client.openapi.models.V1PodCondition... conditions);
  public Boolean hasConditions();
  public V1PodStatusFluent.ConditionsNested<A> addNewCondition();
  public V1PodStatusFluent.ConditionsNested<A> addNewConditionLike(V1PodCondition item);
  public V1PodStatusFluent.ConditionsNested<A> setNewConditionLike(Integer index,V1PodCondition item);
  public V1PodStatusFluent.ConditionsNested<A> editCondition(Integer index);
  public V1PodStatusFluent.ConditionsNested<A> editFirstCondition();
  public V1PodStatusFluent.ConditionsNested<A> editLastCondition();
  public V1PodStatusFluent.ConditionsNested<A> editMatchingCondition(Predicate<V1PodConditionBuilder> predicate);
  public A addToContainerStatuses(Integer index,V1ContainerStatus item);
  public A setToContainerStatuses(Integer index,V1ContainerStatus item);
  public A addToContainerStatuses(io.kubernetes.client.openapi.models.V1ContainerStatus... items);
  public A addAllToContainerStatuses(Collection<V1ContainerStatus> items);
  public A removeFromContainerStatuses(io.kubernetes.client.openapi.models.V1ContainerStatus... items);
  public A removeAllFromContainerStatuses(Collection<V1ContainerStatus> items);
  public A removeMatchingFromContainerStatuses(Predicate<V1ContainerStatusBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildContainerStatuses instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1ContainerStatus> getContainerStatuses();
  public List<V1ContainerStatus> buildContainerStatuses();
  public V1ContainerStatus buildContainerStatus(Integer index);
  public V1ContainerStatus buildFirstContainerStatus();
  public V1ContainerStatus buildLastContainerStatus();
  public V1ContainerStatus buildMatchingContainerStatus(Predicate<V1ContainerStatusBuilder> predicate);
  public Boolean hasMatchingContainerStatus(Predicate<V1ContainerStatusBuilder> predicate);
  public A withContainerStatuses(List<V1ContainerStatus> containerStatuses);
  public A withContainerStatuses(io.kubernetes.client.openapi.models.V1ContainerStatus... containerStatuses);
  public Boolean hasContainerStatuses();
  public V1PodStatusFluent.ContainerStatusesNested<A> addNewContainerStatus();
  public V1PodStatusFluent.ContainerStatusesNested<A> addNewContainerStatusLike(V1ContainerStatus item);
  public V1PodStatusFluent.ContainerStatusesNested<A> setNewContainerStatusLike(Integer index,V1ContainerStatus item);
  public V1PodStatusFluent.ContainerStatusesNested<A> editContainerStatus(Integer index);
  public V1PodStatusFluent.ContainerStatusesNested<A> editFirstContainerStatus();
  public V1PodStatusFluent.ContainerStatusesNested<A> editLastContainerStatus();
  public V1PodStatusFluent.ContainerStatusesNested<A> editMatchingContainerStatus(Predicate<V1ContainerStatusBuilder> predicate);
  public A addToEphemeralContainerStatuses(Integer index,V1ContainerStatus item);
  public A setToEphemeralContainerStatuses(Integer index,V1ContainerStatus item);
  public A addToEphemeralContainerStatuses(io.kubernetes.client.openapi.models.V1ContainerStatus... items);
  public A addAllToEphemeralContainerStatuses(Collection<V1ContainerStatus> items);
  public A removeFromEphemeralContainerStatuses(io.kubernetes.client.openapi.models.V1ContainerStatus... items);
  public A removeAllFromEphemeralContainerStatuses(Collection<V1ContainerStatus> items);
  public A removeMatchingFromEphemeralContainerStatuses(Predicate<V1ContainerStatusBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildEphemeralContainerStatuses instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1ContainerStatus> getEphemeralContainerStatuses();
  public List<V1ContainerStatus> buildEphemeralContainerStatuses();
  public V1ContainerStatus buildEphemeralContainerStatus(Integer index);
  public V1ContainerStatus buildFirstEphemeralContainerStatus();
  public V1ContainerStatus buildLastEphemeralContainerStatus();
  public V1ContainerStatus buildMatchingEphemeralContainerStatus(Predicate<V1ContainerStatusBuilder> predicate);
  public Boolean hasMatchingEphemeralContainerStatus(Predicate<V1ContainerStatusBuilder> predicate);
  public A withEphemeralContainerStatuses(List<V1ContainerStatus> ephemeralContainerStatuses);
  public A withEphemeralContainerStatuses(io.kubernetes.client.openapi.models.V1ContainerStatus... ephemeralContainerStatuses);
  public Boolean hasEphemeralContainerStatuses();
  public V1PodStatusFluent.EphemeralContainerStatusesNested<A> addNewEphemeralContainerStatus();
  public V1PodStatusFluent.EphemeralContainerStatusesNested<A> addNewEphemeralContainerStatusLike(V1ContainerStatus item);
  public V1PodStatusFluent.EphemeralContainerStatusesNested<A> setNewEphemeralContainerStatusLike(Integer index,V1ContainerStatus item);
  public V1PodStatusFluent.EphemeralContainerStatusesNested<A> editEphemeralContainerStatus(Integer index);
  public V1PodStatusFluent.EphemeralContainerStatusesNested<A> editFirstEphemeralContainerStatus();
  public V1PodStatusFluent.EphemeralContainerStatusesNested<A> editLastEphemeralContainerStatus();
  public V1PodStatusFluent.EphemeralContainerStatusesNested<A> editMatchingEphemeralContainerStatus(Predicate<V1ContainerStatusBuilder> predicate);
  public String getHostIP();
  public A withHostIP(String hostIP);
  public Boolean hasHostIP();
  public A addToInitContainerStatuses(Integer index,V1ContainerStatus item);
  public A setToInitContainerStatuses(Integer index,V1ContainerStatus item);
  public A addToInitContainerStatuses(io.kubernetes.client.openapi.models.V1ContainerStatus... items);
  public A addAllToInitContainerStatuses(Collection<V1ContainerStatus> items);
  public A removeFromInitContainerStatuses(io.kubernetes.client.openapi.models.V1ContainerStatus... items);
  public A removeAllFromInitContainerStatuses(Collection<V1ContainerStatus> items);
  public A removeMatchingFromInitContainerStatuses(Predicate<V1ContainerStatusBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildInitContainerStatuses instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1ContainerStatus> getInitContainerStatuses();
  public List<V1ContainerStatus> buildInitContainerStatuses();
  public V1ContainerStatus buildInitContainerStatus(Integer index);
  public V1ContainerStatus buildFirstInitContainerStatus();
  public V1ContainerStatus buildLastInitContainerStatus();
  public V1ContainerStatus buildMatchingInitContainerStatus(Predicate<V1ContainerStatusBuilder> predicate);
  public Boolean hasMatchingInitContainerStatus(Predicate<V1ContainerStatusBuilder> predicate);
  public A withInitContainerStatuses(List<V1ContainerStatus> initContainerStatuses);
  public A withInitContainerStatuses(io.kubernetes.client.openapi.models.V1ContainerStatus... initContainerStatuses);
  public Boolean hasInitContainerStatuses();
  public V1PodStatusFluent.InitContainerStatusesNested<A> addNewInitContainerStatus();
  public V1PodStatusFluent.InitContainerStatusesNested<A> addNewInitContainerStatusLike(V1ContainerStatus item);
  public V1PodStatusFluent.InitContainerStatusesNested<A> setNewInitContainerStatusLike(Integer index,V1ContainerStatus item);
  public V1PodStatusFluent.InitContainerStatusesNested<A> editInitContainerStatus(Integer index);
  public V1PodStatusFluent.InitContainerStatusesNested<A> editFirstInitContainerStatus();
  public V1PodStatusFluent.InitContainerStatusesNested<A> editLastInitContainerStatus();
  public V1PodStatusFluent.InitContainerStatusesNested<A> editMatchingInitContainerStatus(Predicate<V1ContainerStatusBuilder> predicate);
  public String getMessage();
  public A withMessage(String message);
  public Boolean hasMessage();
  public String getNominatedNodeName();
  public A withNominatedNodeName(String nominatedNodeName);
  public Boolean hasNominatedNodeName();
  public String getPhase();
  public A withPhase(String phase);
  public Boolean hasPhase();
  public String getPodIP();
  public A withPodIP(String podIP);
  public Boolean hasPodIP();
  public A addToPodIPs(Integer index,V1PodIP item);
  public A setToPodIPs(Integer index,V1PodIP item);
  public A addToPodIPs(io.kubernetes.client.openapi.models.V1PodIP... items);
  public A addAllToPodIPs(Collection<V1PodIP> items);
  public A removeFromPodIPs(io.kubernetes.client.openapi.models.V1PodIP... items);
  public A removeAllFromPodIPs(Collection<V1PodIP> items);
  public A removeMatchingFromPodIPs(Predicate<V1PodIPBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildPodIPs instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1PodIP> getPodIPs();
  public List<V1PodIP> buildPodIPs();
  public V1PodIP buildPodIP(Integer index);
  public V1PodIP buildFirstPodIP();
  public V1PodIP buildLastPodIP();
  public V1PodIP buildMatchingPodIP(Predicate<V1PodIPBuilder> predicate);
  public Boolean hasMatchingPodIP(Predicate<V1PodIPBuilder> predicate);
  public A withPodIPs(List<V1PodIP> podIPs);
  public A withPodIPs(io.kubernetes.client.openapi.models.V1PodIP... podIPs);
  public Boolean hasPodIPs();
  public V1PodStatusFluent.PodIPsNested<A> addNewPodIP();
  public V1PodStatusFluent.PodIPsNested<A> addNewPodIPLike(V1PodIP item);
  public V1PodStatusFluent.PodIPsNested<A> setNewPodIPLike(Integer index,V1PodIP item);
  public V1PodStatusFluent.PodIPsNested<A> editPodIP(Integer index);
  public V1PodStatusFluent.PodIPsNested<A> editFirstPodIP();
  public V1PodStatusFluent.PodIPsNested<A> editLastPodIP();
  public V1PodStatusFluent.PodIPsNested<A> editMatchingPodIP(Predicate<V1PodIPBuilder> predicate);
  public String getQosClass();
  public A withQosClass(String qosClass);
  public Boolean hasQosClass();
  public String getReason();
  public A withReason(String reason);
  public Boolean hasReason();
  public OffsetDateTime getStartTime();
  public A withStartTime(OffsetDateTime startTime);
  public Boolean hasStartTime();
  public interface ConditionsNested<N> extends Nested<N>,V1PodConditionFluent<V1PodStatusFluent.ConditionsNested<N>>{
    public N and();
    public N endCondition();
    
  }
  public interface ContainerStatusesNested<N> extends Nested<N>,V1ContainerStatusFluent<V1PodStatusFluent.ContainerStatusesNested<N>>{
    public N and();
    public N endContainerStatus();
    
  }
  public interface EphemeralContainerStatusesNested<N> extends Nested<N>,V1ContainerStatusFluent<V1PodStatusFluent.EphemeralContainerStatusesNested<N>>{
    public N and();
    public N endEphemeralContainerStatus();
    
  }
  public interface InitContainerStatusesNested<N> extends Nested<N>,V1ContainerStatusFluent<V1PodStatusFluent.InitContainerStatusesNested<N>>{
    public N and();
    public N endInitContainerStatus();
    
  }
  public interface PodIPsNested<N> extends Nested<N>,V1PodIPFluent<V1PodStatusFluent.PodIPsNested<N>>{
    public N and();
    public N endPodIP();
    
  }
  
}