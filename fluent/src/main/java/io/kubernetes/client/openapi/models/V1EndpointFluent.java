package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

 /**
  * Generated
  */
public interface V1EndpointFluent<A extends V1EndpointFluent<A>> extends Fluent<A>{
  public A addToAddresses(Integer index,String item);
  public A setToAddresses(Integer index,String item);
  public A addToAddresses(java.lang.String... items);
  public A addAllToAddresses(Collection<String> items);
  public A removeFromAddresses(java.lang.String... items);
  public A removeAllFromAddresses(Collection<String> items);
  public List<String> getAddresses();
  public String getAddress(Integer index);
  public String getFirstAddress();
  public String getLastAddress();
  public String getMatchingAddress(Predicate<String> predicate);
  public Boolean hasMatchingAddress(Predicate<String> predicate);
  public A withAddresses(List<String> addresses);
  public A withAddresses(java.lang.String... addresses);
  public Boolean hasAddresses();
  
  /**
   * This method has been deprecated, please use method buildConditions instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1EndpointConditions getConditions();
  public V1EndpointConditions buildConditions();
  public A withConditions(V1EndpointConditions conditions);
  public Boolean hasConditions();
  public V1EndpointFluent.ConditionsNested<A> withNewConditions();
  public V1EndpointFluent.ConditionsNested<A> withNewConditionsLike(V1EndpointConditions item);
  public V1EndpointFluent.ConditionsNested<A> editConditions();
  public V1EndpointFluent.ConditionsNested<A> editOrNewConditions();
  public V1EndpointFluent.ConditionsNested<A> editOrNewConditionsLike(V1EndpointConditions item);
  public A addToDeprecatedTopology(String key,String value);
  public A addToDeprecatedTopology(Map<String,String> map);
  public A removeFromDeprecatedTopology(String key);
  public A removeFromDeprecatedTopology(Map<String,String> map);
  public Map<String,String> getDeprecatedTopology();
  public <K,V>A withDeprecatedTopology(Map<String,String> deprecatedTopology);
  public Boolean hasDeprecatedTopology();
  
  /**
   * This method has been deprecated, please use method buildHints instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1EndpointHints getHints();
  public V1EndpointHints buildHints();
  public A withHints(V1EndpointHints hints);
  public Boolean hasHints();
  public V1EndpointFluent.HintsNested<A> withNewHints();
  public V1EndpointFluent.HintsNested<A> withNewHintsLike(V1EndpointHints item);
  public V1EndpointFluent.HintsNested<A> editHints();
  public V1EndpointFluent.HintsNested<A> editOrNewHints();
  public V1EndpointFluent.HintsNested<A> editOrNewHintsLike(V1EndpointHints item);
  public String getHostname();
  public A withHostname(String hostname);
  public Boolean hasHostname();
  public String getNodeName();
  public A withNodeName(String nodeName);
  public Boolean hasNodeName();
  
  /**
   * This method has been deprecated, please use method buildTargetRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectReference getTargetRef();
  public V1ObjectReference buildTargetRef();
  public A withTargetRef(V1ObjectReference targetRef);
  public Boolean hasTargetRef();
  public V1EndpointFluent.TargetRefNested<A> withNewTargetRef();
  public V1EndpointFluent.TargetRefNested<A> withNewTargetRefLike(V1ObjectReference item);
  public V1EndpointFluent.TargetRefNested<A> editTargetRef();
  public V1EndpointFluent.TargetRefNested<A> editOrNewTargetRef();
  public V1EndpointFluent.TargetRefNested<A> editOrNewTargetRefLike(V1ObjectReference item);
  public String getZone();
  public A withZone(String zone);
  public Boolean hasZone();
  public interface ConditionsNested<N> extends Nested<N>,V1EndpointConditionsFluent<V1EndpointFluent.ConditionsNested<N>>{
    public N and();
    public N endConditions();
    
  }
  public interface HintsNested<N> extends Nested<N>,V1EndpointHintsFluent<V1EndpointFluent.HintsNested<N>>{
    public N and();
    public N endHints();
    
  }
  public interface TargetRefNested<N> extends Nested<N>,V1ObjectReferenceFluent<V1EndpointFluent.TargetRefNested<N>>{
    public N and();
    public N endTargetRef();
    
  }
  
}