package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1EndpointFluentImpl<A extends V1EndpointFluent<A>> extends BaseFluent<A> implements V1EndpointFluent<A>{
  public V1EndpointFluentImpl() {
  }
  public V1EndpointFluentImpl(V1Endpoint instance) {
    if (instance != null) {
      this.withAddresses(instance.getAddresses());
      this.withConditions(instance.getConditions());
      this.withDeprecatedTopology(instance.getDeprecatedTopology());
      this.withHints(instance.getHints());
      this.withHostname(instance.getHostname());
      this.withNodeName(instance.getNodeName());
      this.withTargetRef(instance.getTargetRef());
      this.withZone(instance.getZone());
    }
  }
  private List<String> addresses;
  private V1EndpointConditionsBuilder conditions;
  private Map<String,String> deprecatedTopology;
  private V1EndpointHintsBuilder hints;
  private String hostname;
  private String nodeName;
  private V1ObjectReferenceBuilder targetRef;
  private String zone;
  public A addToAddresses(int index,String item) {
    if (this.addresses == null) {this.addresses = new ArrayList<String>();}
    this.addresses.add(index, item);
    return (A)this;
  }
  public A setToAddresses(int index,String item) {
    if (this.addresses == null) {this.addresses = new ArrayList<String>();}
    this.addresses.set(index, item); return (A)this;
  }
  public A addToAddresses(java.lang.String... items) {
    if (this.addresses == null) {this.addresses = new ArrayList<String>();}
    for (String item : items) {this.addresses.add(item);} return (A)this;
  }
  public A addAllToAddresses(Collection<String> items) {
    if (this.addresses == null) {this.addresses = new ArrayList<String>();}
    for (String item : items) {this.addresses.add(item);} return (A)this;
  }
  public A removeFromAddresses(java.lang.String... items) {
    for (String item : items) {if (this.addresses!= null){ this.addresses.remove(item);}} return (A)this;
  }
  public A removeAllFromAddresses(Collection<String> items) {
    for (String item : items) {if (this.addresses!= null){ this.addresses.remove(item);}} return (A)this;
  }
  public List<String> getAddresses() {
    return this.addresses;
  }
  public String getAddress(int index) {
    return this.addresses.get(index);
  }
  public String getFirstAddress() {
    return this.addresses.get(0);
  }
  public String getLastAddress() {
    return this.addresses.get(addresses.size() - 1);
  }
  public String getMatchingAddress(Predicate<String> predicate) {
    for (String item: addresses) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingAddress(Predicate<String> predicate) {
    for (String item: addresses) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withAddresses(List<String> addresses) {
    if (addresses != null) {this.addresses = new ArrayList(); for (String item : addresses){this.addToAddresses(item);}} else { this.addresses = null;} return (A) this;
  }
  public A withAddresses(java.lang.String... addresses) {
    if (this.addresses != null) {this.addresses.clear(); _visitables.remove("addresses"); }
    if (addresses != null) {for (String item :addresses){ this.addToAddresses(item);}} return (A) this;
  }
  public Boolean hasAddresses() {
    return addresses != null && !addresses.isEmpty();
  }
  
  /**
   * This method has been deprecated, please use method buildConditions instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1EndpointConditions getConditions() {
    return this.conditions!=null ?this.conditions.build():null;
  }
  public V1EndpointConditions buildConditions() {
    return this.conditions!=null ?this.conditions.build():null;
  }
  public A withConditions(V1EndpointConditions conditions) {
    _visitables.get("conditions").remove(this.conditions);
    if (conditions!=null){ this.conditions= new V1EndpointConditionsBuilder(conditions); _visitables.get("conditions").add(this.conditions);} else { this.conditions = null; _visitables.get("conditions").remove(this.conditions); } return (A) this;
  }
  public Boolean hasConditions() {
    return this.conditions != null;
  }
  public V1EndpointFluentImpl.ConditionsNested<A> withNewConditions() {
    return new V1EndpointFluentImpl.ConditionsNestedImpl();
  }
  public V1EndpointFluentImpl.ConditionsNested<A> withNewConditionsLike(V1EndpointConditions item) {
    return new V1EndpointFluentImpl.ConditionsNestedImpl(item);
  }
  public V1EndpointFluentImpl.ConditionsNested<A> editConditions() {
    return withNewConditionsLike(getConditions());
  }
  public V1EndpointFluentImpl.ConditionsNested<A> editOrNewConditions() {
    return withNewConditionsLike(getConditions() != null ? getConditions(): new V1EndpointConditionsBuilder().build());
  }
  public V1EndpointFluentImpl.ConditionsNested<A> editOrNewConditionsLike(V1EndpointConditions item) {
    return withNewConditionsLike(getConditions() != null ? getConditions(): item);
  }
  public A addToDeprecatedTopology(String key,String value) {
    if(this.deprecatedTopology == null && key != null && value != null) { this.deprecatedTopology = new LinkedHashMap(); }
    if(key != null && value != null) {this.deprecatedTopology.put(key, value);} return (A)this;
  }
  public A addToDeprecatedTopology(Map<String,String> map) {
    if(this.deprecatedTopology == null && map != null) { this.deprecatedTopology = new LinkedHashMap(); }
    if(map != null) { this.deprecatedTopology.putAll(map);} return (A)this;
  }
  public A removeFromDeprecatedTopology(String key) {
    if(this.deprecatedTopology == null) { return (A) this; }
    if(key != null && this.deprecatedTopology != null) {this.deprecatedTopology.remove(key);} return (A)this;
  }
  public A removeFromDeprecatedTopology(Map<String,String> map) {
    if(this.deprecatedTopology == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.deprecatedTopology != null){this.deprecatedTopology.remove(key);}}} return (A)this;
  }
  public Map<String,String> getDeprecatedTopology() {
    return this.deprecatedTopology;
  }
  public <K,V>A withDeprecatedTopology(Map<String,String> deprecatedTopology) {
    if (deprecatedTopology == null) { this.deprecatedTopology =  null;} else {this.deprecatedTopology = new LinkedHashMap(deprecatedTopology);} return (A) this;
  }
  public Boolean hasDeprecatedTopology() {
    return this.deprecatedTopology != null;
  }
  
  /**
   * This method has been deprecated, please use method buildHints instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1EndpointHints getHints() {
    return this.hints!=null ?this.hints.build():null;
  }
  public V1EndpointHints buildHints() {
    return this.hints!=null ?this.hints.build():null;
  }
  public A withHints(V1EndpointHints hints) {
    _visitables.get("hints").remove(this.hints);
    if (hints!=null){ this.hints= new V1EndpointHintsBuilder(hints); _visitables.get("hints").add(this.hints);} else { this.hints = null; _visitables.get("hints").remove(this.hints); } return (A) this;
  }
  public Boolean hasHints() {
    return this.hints != null;
  }
  public V1EndpointFluentImpl.HintsNested<A> withNewHints() {
    return new V1EndpointFluentImpl.HintsNestedImpl();
  }
  public V1EndpointFluentImpl.HintsNested<A> withNewHintsLike(V1EndpointHints item) {
    return new V1EndpointFluentImpl.HintsNestedImpl(item);
  }
  public V1EndpointFluentImpl.HintsNested<A> editHints() {
    return withNewHintsLike(getHints());
  }
  public V1EndpointFluentImpl.HintsNested<A> editOrNewHints() {
    return withNewHintsLike(getHints() != null ? getHints(): new V1EndpointHintsBuilder().build());
  }
  public V1EndpointFluentImpl.HintsNested<A> editOrNewHintsLike(V1EndpointHints item) {
    return withNewHintsLike(getHints() != null ? getHints(): item);
  }
  public String getHostname() {
    return this.hostname;
  }
  public A withHostname(String hostname) {
    this.hostname=hostname; return (A) this;
  }
  public Boolean hasHostname() {
    return this.hostname != null;
  }
  public String getNodeName() {
    return this.nodeName;
  }
  public A withNodeName(String nodeName) {
    this.nodeName=nodeName; return (A) this;
  }
  public Boolean hasNodeName() {
    return this.nodeName != null;
  }
  
  /**
   * This method has been deprecated, please use method buildTargetRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectReference getTargetRef() {
    return this.targetRef!=null ?this.targetRef.build():null;
  }
  public V1ObjectReference buildTargetRef() {
    return this.targetRef!=null ?this.targetRef.build():null;
  }
  public A withTargetRef(V1ObjectReference targetRef) {
    _visitables.get("targetRef").remove(this.targetRef);
    if (targetRef!=null){ this.targetRef= new V1ObjectReferenceBuilder(targetRef); _visitables.get("targetRef").add(this.targetRef);} else { this.targetRef = null; _visitables.get("targetRef").remove(this.targetRef); } return (A) this;
  }
  public Boolean hasTargetRef() {
    return this.targetRef != null;
  }
  public V1EndpointFluentImpl.TargetRefNested<A> withNewTargetRef() {
    return new V1EndpointFluentImpl.TargetRefNestedImpl();
  }
  public V1EndpointFluentImpl.TargetRefNested<A> withNewTargetRefLike(V1ObjectReference item) {
    return new V1EndpointFluentImpl.TargetRefNestedImpl(item);
  }
  public V1EndpointFluentImpl.TargetRefNested<A> editTargetRef() {
    return withNewTargetRefLike(getTargetRef());
  }
  public V1EndpointFluentImpl.TargetRefNested<A> editOrNewTargetRef() {
    return withNewTargetRefLike(getTargetRef() != null ? getTargetRef(): new V1ObjectReferenceBuilder().build());
  }
  public V1EndpointFluentImpl.TargetRefNested<A> editOrNewTargetRefLike(V1ObjectReference item) {
    return withNewTargetRefLike(getTargetRef() != null ? getTargetRef(): item);
  }
  public String getZone() {
    return this.zone;
  }
  public A withZone(String zone) {
    this.zone=zone; return (A) this;
  }
  public Boolean hasZone() {
    return this.zone != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1EndpointFluentImpl that = (V1EndpointFluentImpl) o;
    if (!java.util.Objects.equals(addresses, that.addresses)) return false;

    if (!java.util.Objects.equals(conditions, that.conditions)) return false;

    if (!java.util.Objects.equals(deprecatedTopology, that.deprecatedTopology)) return false;

    if (!java.util.Objects.equals(hints, that.hints)) return false;

    if (!java.util.Objects.equals(hostname, that.hostname)) return false;

    if (!java.util.Objects.equals(nodeName, that.nodeName)) return false;

    if (!java.util.Objects.equals(targetRef, that.targetRef)) return false;

    if (!java.util.Objects.equals(zone, that.zone)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(addresses,  conditions,  deprecatedTopology,  hints,  hostname,  nodeName,  targetRef,  zone,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (addresses != null && !addresses.isEmpty()) { sb.append("addresses:"); sb.append(addresses + ","); }
    if (conditions != null) { sb.append("conditions:"); sb.append(conditions + ","); }
    if (deprecatedTopology != null && !deprecatedTopology.isEmpty()) { sb.append("deprecatedTopology:"); sb.append(deprecatedTopology + ","); }
    if (hints != null) { sb.append("hints:"); sb.append(hints + ","); }
    if (hostname != null) { sb.append("hostname:"); sb.append(hostname + ","); }
    if (nodeName != null) { sb.append("nodeName:"); sb.append(nodeName + ","); }
    if (targetRef != null) { sb.append("targetRef:"); sb.append(targetRef + ","); }
    if (zone != null) { sb.append("zone:"); sb.append(zone); }
    sb.append("}");
    return sb.toString();
  }
  class ConditionsNestedImpl<N> extends V1EndpointConditionsFluentImpl<V1EndpointFluentImpl.ConditionsNested<N>> implements V1EndpointFluentImpl.ConditionsNested<N>,Nested<N>{
    ConditionsNestedImpl(V1EndpointConditions item) {
      this.builder = new V1EndpointConditionsBuilder(this, item);
    }
    ConditionsNestedImpl() {
      this.builder = new V1EndpointConditionsBuilder(this);
    }
    V1EndpointConditionsBuilder builder;
    public N and() {
      return (N) V1EndpointFluentImpl.this.withConditions(builder.build());
    }
    public N endConditions() {
      return and();
    }
    
  }
  class HintsNestedImpl<N> extends V1EndpointHintsFluentImpl<V1EndpointFluentImpl.HintsNested<N>> implements V1EndpointFluentImpl.HintsNested<N>,Nested<N>{
    HintsNestedImpl(V1EndpointHints item) {
      this.builder = new V1EndpointHintsBuilder(this, item);
    }
    HintsNestedImpl() {
      this.builder = new V1EndpointHintsBuilder(this);
    }
    V1EndpointHintsBuilder builder;
    public N and() {
      return (N) V1EndpointFluentImpl.this.withHints(builder.build());
    }
    public N endHints() {
      return and();
    }
    
  }
  class TargetRefNestedImpl<N> extends V1ObjectReferenceFluentImpl<V1EndpointFluentImpl.TargetRefNested<N>> implements V1EndpointFluentImpl.TargetRefNested<N>,Nested<N>{
    TargetRefNestedImpl(V1ObjectReference item) {
      this.builder = new V1ObjectReferenceBuilder(this, item);
    }
    TargetRefNestedImpl() {
      this.builder = new V1ObjectReferenceBuilder(this);
    }
    V1ObjectReferenceBuilder builder;
    public N and() {
      return (N) V1EndpointFluentImpl.this.withTargetRef(builder.build());
    }
    public N endTargetRef() {
      return and();
    }
    
  }
  
}