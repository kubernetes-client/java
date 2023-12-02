package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.List;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1EndpointFluent<A extends V1EndpointFluent<A>> extends BaseFluent<A>{
  public V1EndpointFluent() {
  }
  
  public V1EndpointFluent(V1Endpoint instance) {
    this.copyInstance(instance);
  }
  private List<String> addresses;
  private V1EndpointConditionsBuilder conditions;
  private Map<String,String> deprecatedTopology;
  private V1EndpointHintsBuilder hints;
  private String hostname;
  private String nodeName;
  private V1ObjectReferenceBuilder targetRef;
  private String zone;
  
  protected void copyInstance(V1Endpoint instance) {
    instance = (instance != null ? instance : new V1Endpoint());
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
    if (this.addresses == null) return (A)this;
    for (String item : items) { this.addresses.remove(item);} return (A)this;
  }
  
  public A removeAllFromAddresses(Collection<String> items) {
    if (this.addresses == null) return (A)this;
    for (String item : items) { this.addresses.remove(item);} return (A)this;
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
      for (String item : addresses) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingAddress(Predicate<String> predicate) {
      for (String item : addresses) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withAddresses(List<String> addresses) {
    if (addresses != null) {
        this.addresses = new ArrayList();
        for (String item : addresses) {
          this.addToAddresses(item);
        }
    } else {
      this.addresses = null;
    }
    return (A) this;
  }
  
  public A withAddresses(java.lang.String... addresses) {
    if (this.addresses != null) {
        this.addresses.clear();
        _visitables.remove("addresses");
    }
    if (addresses != null) {
      for (String item : addresses) {
        this.addToAddresses(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasAddresses() {
    return this.addresses != null && !this.addresses.isEmpty();
  }
  
  public V1EndpointConditions buildConditions() {
    return this.conditions != null ? this.conditions.build() : null;
  }
  
  public A withConditions(V1EndpointConditions conditions) {
    this._visitables.remove("conditions");
    if (conditions != null) {
        this.conditions = new V1EndpointConditionsBuilder(conditions);
        this._visitables.get("conditions").add(this.conditions);
    } else {
        this.conditions = null;
        this._visitables.get("conditions").remove(this.conditions);
    }
    return (A) this;
  }
  
  public boolean hasConditions() {
    return this.conditions != null;
  }
  
  public ConditionsNested<A> withNewConditions() {
    return new ConditionsNested(null);
  }
  
  public ConditionsNested<A> withNewConditionsLike(V1EndpointConditions item) {
    return new ConditionsNested(item);
  }
  
  public ConditionsNested<A> editConditions() {
    return withNewConditionsLike(java.util.Optional.ofNullable(buildConditions()).orElse(null));
  }
  
  public ConditionsNested<A> editOrNewConditions() {
    return withNewConditionsLike(java.util.Optional.ofNullable(buildConditions()).orElse(new V1EndpointConditionsBuilder().build()));
  }
  
  public ConditionsNested<A> editOrNewConditionsLike(V1EndpointConditions item) {
    return withNewConditionsLike(java.util.Optional.ofNullable(buildConditions()).orElse(item));
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
    if (deprecatedTopology == null) {
      this.deprecatedTopology = null;
    } else {
      this.deprecatedTopology = new LinkedHashMap(deprecatedTopology);
    }
    return (A) this;
  }
  
  public boolean hasDeprecatedTopology() {
    return this.deprecatedTopology != null;
  }
  
  public V1EndpointHints buildHints() {
    return this.hints != null ? this.hints.build() : null;
  }
  
  public A withHints(V1EndpointHints hints) {
    this._visitables.remove("hints");
    if (hints != null) {
        this.hints = new V1EndpointHintsBuilder(hints);
        this._visitables.get("hints").add(this.hints);
    } else {
        this.hints = null;
        this._visitables.get("hints").remove(this.hints);
    }
    return (A) this;
  }
  
  public boolean hasHints() {
    return this.hints != null;
  }
  
  public HintsNested<A> withNewHints() {
    return new HintsNested(null);
  }
  
  public HintsNested<A> withNewHintsLike(V1EndpointHints item) {
    return new HintsNested(item);
  }
  
  public HintsNested<A> editHints() {
    return withNewHintsLike(java.util.Optional.ofNullable(buildHints()).orElse(null));
  }
  
  public HintsNested<A> editOrNewHints() {
    return withNewHintsLike(java.util.Optional.ofNullable(buildHints()).orElse(new V1EndpointHintsBuilder().build()));
  }
  
  public HintsNested<A> editOrNewHintsLike(V1EndpointHints item) {
    return withNewHintsLike(java.util.Optional.ofNullable(buildHints()).orElse(item));
  }
  
  public String getHostname() {
    return this.hostname;
  }
  
  public A withHostname(String hostname) {
    this.hostname = hostname;
    return (A) this;
  }
  
  public boolean hasHostname() {
    return this.hostname != null;
  }
  
  public String getNodeName() {
    return this.nodeName;
  }
  
  public A withNodeName(String nodeName) {
    this.nodeName = nodeName;
    return (A) this;
  }
  
  public boolean hasNodeName() {
    return this.nodeName != null;
  }
  
  public V1ObjectReference buildTargetRef() {
    return this.targetRef != null ? this.targetRef.build() : null;
  }
  
  public A withTargetRef(V1ObjectReference targetRef) {
    this._visitables.remove("targetRef");
    if (targetRef != null) {
        this.targetRef = new V1ObjectReferenceBuilder(targetRef);
        this._visitables.get("targetRef").add(this.targetRef);
    } else {
        this.targetRef = null;
        this._visitables.get("targetRef").remove(this.targetRef);
    }
    return (A) this;
  }
  
  public boolean hasTargetRef() {
    return this.targetRef != null;
  }
  
  public TargetRefNested<A> withNewTargetRef() {
    return new TargetRefNested(null);
  }
  
  public TargetRefNested<A> withNewTargetRefLike(V1ObjectReference item) {
    return new TargetRefNested(item);
  }
  
  public TargetRefNested<A> editTargetRef() {
    return withNewTargetRefLike(java.util.Optional.ofNullable(buildTargetRef()).orElse(null));
  }
  
  public TargetRefNested<A> editOrNewTargetRef() {
    return withNewTargetRefLike(java.util.Optional.ofNullable(buildTargetRef()).orElse(new V1ObjectReferenceBuilder().build()));
  }
  
  public TargetRefNested<A> editOrNewTargetRefLike(V1ObjectReference item) {
    return withNewTargetRefLike(java.util.Optional.ofNullable(buildTargetRef()).orElse(item));
  }
  
  public String getZone() {
    return this.zone;
  }
  
  public A withZone(String zone) {
    this.zone = zone;
    return (A) this;
  }
  
  public boolean hasZone() {
    return this.zone != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1EndpointFluent that = (V1EndpointFluent) o;
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
  public class ConditionsNested<N> extends V1EndpointConditionsFluent<ConditionsNested<N>> implements Nested<N>{
    ConditionsNested(V1EndpointConditions item) {
      this.builder = new V1EndpointConditionsBuilder(this, item);
    }
    V1EndpointConditionsBuilder builder;
    
    public N and() {
      return (N) V1EndpointFluent.this.withConditions(builder.build());
    }
    
    public N endConditions() {
      return and();
    }
    
  
  }
  public class HintsNested<N> extends V1EndpointHintsFluent<HintsNested<N>> implements Nested<N>{
    HintsNested(V1EndpointHints item) {
      this.builder = new V1EndpointHintsBuilder(this, item);
    }
    V1EndpointHintsBuilder builder;
    
    public N and() {
      return (N) V1EndpointFluent.this.withHints(builder.build());
    }
    
    public N endHints() {
      return and();
    }
    
  
  }
  public class TargetRefNested<N> extends V1ObjectReferenceFluent<TargetRefNested<N>> implements Nested<N>{
    TargetRefNested(V1ObjectReference item) {
      this.builder = new V1ObjectReferenceBuilder(this, item);
    }
    V1ObjectReferenceBuilder builder;
    
    public N and() {
      return (N) V1EndpointFluent.this.withTargetRef(builder.build());
    }
    
    public N endTargetRef() {
      return and();
    }
    
  
  }

}