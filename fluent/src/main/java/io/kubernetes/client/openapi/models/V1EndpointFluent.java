package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1EndpointFluent<A extends io.kubernetes.client.openapi.models.V1EndpointFluent<A>> extends BaseFluent<A>{

  private List<String> addresses;
  private V1EndpointConditionsBuilder conditions;
  private Map<String,String> deprecatedTopology;
  private V1EndpointHintsBuilder hints;
  private String hostname;
  private String nodeName;
  private V1ObjectReferenceBuilder targetRef;
  private String zone;

  public V1EndpointFluent() {
  }
  
  public V1EndpointFluent(V1Endpoint instance) {
    this.copyInstance(instance);
  }

  public A addAllToAddresses(Collection<String> items) {
    if (this.addresses == null) {
      this.addresses = new ArrayList();
    }
    for (String item : items) {
      this.addresses.add(item);
    }
    return (A) this;
  }
  
  public A addToAddresses(String... items) {
    if (this.addresses == null) {
      this.addresses = new ArrayList();
    }
    for (String item : items) {
      this.addresses.add(item);
    }
    return (A) this;
  }
  
  public A addToAddresses(int index,String item) {
    if (this.addresses == null) {
      this.addresses = new ArrayList();
    }
    this.addresses.add(index, item);
    return (A) this;
  }
  
  public A addToDeprecatedTopology(Map<String,String> map) {
    if (this.deprecatedTopology == null && map != null) {
      this.deprecatedTopology = new LinkedHashMap();
    }
    if (map != null) {
      this.deprecatedTopology.putAll(map);
    }
    return (A) this;
  }
  
  public A addToDeprecatedTopology(String key,String value) {
    if (this.deprecatedTopology == null && key != null && value != null) {
      this.deprecatedTopology = new LinkedHashMap();
    }
    if (key != null && value != null) {
      this.deprecatedTopology.put(key, value);
    }
    return (A) this;
  }
  
  public V1EndpointConditions buildConditions() {
    return this.conditions != null ? this.conditions.build() : null;
  }
  
  public V1EndpointHints buildHints() {
    return this.hints != null ? this.hints.build() : null;
  }
  
  public V1ObjectReference buildTargetRef() {
    return this.targetRef != null ? this.targetRef.build() : null;
  }
  
  protected void copyInstance(V1Endpoint instance) {
    instance = instance != null ? instance : new V1Endpoint();
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
  
  public ConditionsNested<A> editConditions() {
    return this.withNewConditionsLike(Optional.ofNullable(this.buildConditions()).orElse(null));
  }
  
  public HintsNested<A> editHints() {
    return this.withNewHintsLike(Optional.ofNullable(this.buildHints()).orElse(null));
  }
  
  public ConditionsNested<A> editOrNewConditions() {
    return this.withNewConditionsLike(Optional.ofNullable(this.buildConditions()).orElse(new V1EndpointConditionsBuilder().build()));
  }
  
  public ConditionsNested<A> editOrNewConditionsLike(V1EndpointConditions item) {
    return this.withNewConditionsLike(Optional.ofNullable(this.buildConditions()).orElse(item));
  }
  
  public HintsNested<A> editOrNewHints() {
    return this.withNewHintsLike(Optional.ofNullable(this.buildHints()).orElse(new V1EndpointHintsBuilder().build()));
  }
  
  public HintsNested<A> editOrNewHintsLike(V1EndpointHints item) {
    return this.withNewHintsLike(Optional.ofNullable(this.buildHints()).orElse(item));
  }
  
  public TargetRefNested<A> editOrNewTargetRef() {
    return this.withNewTargetRefLike(Optional.ofNullable(this.buildTargetRef()).orElse(new V1ObjectReferenceBuilder().build()));
  }
  
  public TargetRefNested<A> editOrNewTargetRefLike(V1ObjectReference item) {
    return this.withNewTargetRefLike(Optional.ofNullable(this.buildTargetRef()).orElse(item));
  }
  
  public TargetRefNested<A> editTargetRef() {
    return this.withNewTargetRefLike(Optional.ofNullable(this.buildTargetRef()).orElse(null));
  }
  
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1EndpointFluent that = (V1EndpointFluent) o;
    if (!(Objects.equals(addresses, that.addresses))) {
      return false;
    }
    if (!(Objects.equals(conditions, that.conditions))) {
      return false;
    }
    if (!(Objects.equals(deprecatedTopology, that.deprecatedTopology))) {
      return false;
    }
    if (!(Objects.equals(hints, that.hints))) {
      return false;
    }
    if (!(Objects.equals(hostname, that.hostname))) {
      return false;
    }
    if (!(Objects.equals(nodeName, that.nodeName))) {
      return false;
    }
    if (!(Objects.equals(targetRef, that.targetRef))) {
      return false;
    }
    if (!(Objects.equals(zone, that.zone))) {
      return false;
    }
    return true;
  }
  
  public String getAddress(int index) {
    return this.addresses.get(index);
  }
  
  public List<String> getAddresses() {
    return this.addresses;
  }
  
  public Map<String,String> getDeprecatedTopology() {
    return this.deprecatedTopology;
  }
  
  public String getFirstAddress() {
    return this.addresses.get(0);
  }
  
  public String getHostname() {
    return this.hostname;
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
  
  public String getNodeName() {
    return this.nodeName;
  }
  
  public String getZone() {
    return this.zone;
  }
  
  public boolean hasAddresses() {
    return this.addresses != null && !(this.addresses.isEmpty());
  }
  
  public boolean hasConditions() {
    return this.conditions != null;
  }
  
  public boolean hasDeprecatedTopology() {
    return this.deprecatedTopology != null;
  }
  
  public boolean hasHints() {
    return this.hints != null;
  }
  
  public boolean hasHostname() {
    return this.hostname != null;
  }
  
  public boolean hasMatchingAddress(Predicate<String> predicate) {
      for (String item : addresses) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasNodeName() {
    return this.nodeName != null;
  }
  
  public boolean hasTargetRef() {
    return this.targetRef != null;
  }
  
  public boolean hasZone() {
    return this.zone != null;
  }
  
  public int hashCode() {
    return Objects.hash(addresses, conditions, deprecatedTopology, hints, hostname, nodeName, targetRef, zone);
  }
  
  public A removeAllFromAddresses(Collection<String> items) {
    if (this.addresses == null) {
      return (A) this;
    }
    for (String item : items) {
      this.addresses.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromAddresses(String... items) {
    if (this.addresses == null) {
      return (A) this;
    }
    for (String item : items) {
      this.addresses.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromDeprecatedTopology(String key) {
    if (this.deprecatedTopology == null) {
      return (A) this;
    }
    if (key != null && this.deprecatedTopology != null) {
      this.deprecatedTopology.remove(key);
    }
    return (A) this;
  }
  
  public A removeFromDeprecatedTopology(Map<String,String> map) {
    if (this.deprecatedTopology == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.deprecatedTopology != null) {
          this.deprecatedTopology.remove(key);
        }
      }
    }
    return (A) this;
  }
  
  public A setToAddresses(int index,String item) {
    if (this.addresses == null) {
      this.addresses = new ArrayList();
    }
    this.addresses.set(index, item);
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(addresses == null) && !(addresses.isEmpty())) {
        sb.append("addresses:");
        sb.append(addresses);
        sb.append(",");
    }
    if (!(conditions == null)) {
        sb.append("conditions:");
        sb.append(conditions);
        sb.append(",");
    }
    if (!(deprecatedTopology == null) && !(deprecatedTopology.isEmpty())) {
        sb.append("deprecatedTopology:");
        sb.append(deprecatedTopology);
        sb.append(",");
    }
    if (!(hints == null)) {
        sb.append("hints:");
        sb.append(hints);
        sb.append(",");
    }
    if (!(hostname == null)) {
        sb.append("hostname:");
        sb.append(hostname);
        sb.append(",");
    }
    if (!(nodeName == null)) {
        sb.append("nodeName:");
        sb.append(nodeName);
        sb.append(",");
    }
    if (!(targetRef == null)) {
        sb.append("targetRef:");
        sb.append(targetRef);
        sb.append(",");
    }
    if (!(zone == null)) {
        sb.append("zone:");
        sb.append(zone);
    }
    sb.append("}");
    return sb.toString();
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
  
  public A withAddresses(String... addresses) {
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
  
  public <K,V>A withDeprecatedTopology(Map<String,String> deprecatedTopology) {
    if (deprecatedTopology == null) {
      this.deprecatedTopology = null;
    } else {
      this.deprecatedTopology = new LinkedHashMap(deprecatedTopology);
    }
    return (A) this;
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
  
  public A withHostname(String hostname) {
    this.hostname = hostname;
    return (A) this;
  }
  
  public ConditionsNested<A> withNewConditions() {
    return new ConditionsNested(null);
  }
  
  public ConditionsNested<A> withNewConditionsLike(V1EndpointConditions item) {
    return new ConditionsNested(item);
  }
  
  public HintsNested<A> withNewHints() {
    return new HintsNested(null);
  }
  
  public HintsNested<A> withNewHintsLike(V1EndpointHints item) {
    return new HintsNested(item);
  }
  
  public TargetRefNested<A> withNewTargetRef() {
    return new TargetRefNested(null);
  }
  
  public TargetRefNested<A> withNewTargetRefLike(V1ObjectReference item) {
    return new TargetRefNested(item);
  }
  
  public A withNodeName(String nodeName) {
    this.nodeName = nodeName;
    return (A) this;
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
  
  public A withZone(String zone) {
    this.zone = zone;
    return (A) this;
  }
  public class ConditionsNested<N> extends V1EndpointConditionsFluent<ConditionsNested<N>> implements Nested<N>{
  
    V1EndpointConditionsBuilder builder;
  
    ConditionsNested(V1EndpointConditions item) {
      this.builder = new V1EndpointConditionsBuilder(this, item);
    }
  
    public N and() {
      return (N) V1EndpointFluent.this.withConditions(builder.build());
    }
    
    public N endConditions() {
      return and();
    }
    
  }
  public class HintsNested<N> extends V1EndpointHintsFluent<HintsNested<N>> implements Nested<N>{
  
    V1EndpointHintsBuilder builder;
  
    HintsNested(V1EndpointHints item) {
      this.builder = new V1EndpointHintsBuilder(this, item);
    }
  
    public N and() {
      return (N) V1EndpointFluent.this.withHints(builder.build());
    }
    
    public N endHints() {
      return and();
    }
    
  }
  public class TargetRefNested<N> extends V1ObjectReferenceFluent<TargetRefNested<N>> implements Nested<N>{
  
    V1ObjectReferenceBuilder builder;
  
    TargetRefNested(V1ObjectReference item) {
      this.builder = new V1ObjectReferenceBuilder(this, item);
    }
  
    public N and() {
      return (N) V1EndpointFluent.this.withTargetRef(builder.build());
    }
    
    public N endTargetRef() {
      return and();
    }
    
  }
}