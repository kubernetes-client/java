package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Collection;
import java.lang.Object;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1IngressSpecFluentImpl<A extends V1IngressSpecFluent<A>> extends BaseFluent<A> implements V1IngressSpecFluent<A>{
  public V1IngressSpecFluentImpl() {
  }
  public V1IngressSpecFluentImpl(V1IngressSpec instance) {
    this.withDefaultBackend(instance.getDefaultBackend());

    this.withIngressClassName(instance.getIngressClassName());

    this.withRules(instance.getRules());

    this.withTls(instance.getTls());

  }
  private V1IngressBackendBuilder defaultBackend;
  private String ingressClassName;
  private ArrayList<V1IngressRuleBuilder> rules;
  private ArrayList<V1IngressTLSBuilder> tls;
  
  /**
   * This method has been deprecated, please use method buildDefaultBackend instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1IngressBackend getDefaultBackend() {
    return this.defaultBackend!=null ?this.defaultBackend.build():null;
  }
  public V1IngressBackend buildDefaultBackend() {
    return this.defaultBackend!=null ?this.defaultBackend.build():null;
  }
  public A withDefaultBackend(V1IngressBackend defaultBackend) {
    _visitables.get("defaultBackend").remove(this.defaultBackend);
    if (defaultBackend!=null){ this.defaultBackend= new V1IngressBackendBuilder(defaultBackend); _visitables.get("defaultBackend").add(this.defaultBackend);} else { this.defaultBackend = null; _visitables.get("defaultBackend").remove(this.defaultBackend); } return (A) this;
  }
  public Boolean hasDefaultBackend() {
    return this.defaultBackend != null;
  }
  public V1IngressSpecFluent.DefaultBackendNested<A> withNewDefaultBackend() {
    return new V1IngressSpecFluentImpl.DefaultBackendNestedImpl();
  }
  public V1IngressSpecFluent.DefaultBackendNested<A> withNewDefaultBackendLike(V1IngressBackend item) {
    return new V1IngressSpecFluentImpl.DefaultBackendNestedImpl(item);
  }
  public V1IngressSpecFluent.DefaultBackendNested<A> editDefaultBackend() {
    return withNewDefaultBackendLike(getDefaultBackend());
  }
  public V1IngressSpecFluent.DefaultBackendNested<A> editOrNewDefaultBackend() {
    return withNewDefaultBackendLike(getDefaultBackend() != null ? getDefaultBackend(): new V1IngressBackendBuilder().build());
  }
  public V1IngressSpecFluent.DefaultBackendNested<A> editOrNewDefaultBackendLike(V1IngressBackend item) {
    return withNewDefaultBackendLike(getDefaultBackend() != null ? getDefaultBackend(): item);
  }
  public String getIngressClassName() {
    return this.ingressClassName;
  }
  public A withIngressClassName(String ingressClassName) {
    this.ingressClassName=ingressClassName; return (A) this;
  }
  public Boolean hasIngressClassName() {
    return this.ingressClassName != null;
  }
  public A addToRules(Integer index,V1IngressRule item) {
    if (this.rules == null) {this.rules = new ArrayList<V1IngressRuleBuilder>();}
    V1IngressRuleBuilder builder = new V1IngressRuleBuilder(item);_visitables.get("rules").add(index >= 0 ? index : _visitables.get("rules").size(), builder);this.rules.add(index >= 0 ? index : rules.size(), builder); return (A)this;
  }
  public A setToRules(Integer index,V1IngressRule item) {
    if (this.rules == null) {this.rules = new ArrayList<V1IngressRuleBuilder>();}
    V1IngressRuleBuilder builder = new V1IngressRuleBuilder(item);
    if (index < 0 || index >= _visitables.get("rules").size()) { _visitables.get("rules").add(builder); } else { _visitables.get("rules").set(index, builder);}
    if (index < 0 || index >= rules.size()) { rules.add(builder); } else { rules.set(index, builder);}
     return (A)this;
  }
  public A addToRules(io.kubernetes.client.openapi.models.V1IngressRule... items) {
    if (this.rules == null) {this.rules = new ArrayList<V1IngressRuleBuilder>();}
    for (V1IngressRule item : items) {V1IngressRuleBuilder builder = new V1IngressRuleBuilder(item);_visitables.get("rules").add(builder);this.rules.add(builder);} return (A)this;
  }
  public A addAllToRules(Collection<V1IngressRule> items) {
    if (this.rules == null) {this.rules = new ArrayList<V1IngressRuleBuilder>();}
    for (V1IngressRule item : items) {V1IngressRuleBuilder builder = new V1IngressRuleBuilder(item);_visitables.get("rules").add(builder);this.rules.add(builder);} return (A)this;
  }
  public A removeFromRules(io.kubernetes.client.openapi.models.V1IngressRule... items) {
    for (V1IngressRule item : items) {V1IngressRuleBuilder builder = new V1IngressRuleBuilder(item);_visitables.get("rules").remove(builder);if (this.rules != null) {this.rules.remove(builder);}} return (A)this;
  }
  public A removeAllFromRules(Collection<V1IngressRule> items) {
    for (V1IngressRule item : items) {V1IngressRuleBuilder builder = new V1IngressRuleBuilder(item);_visitables.get("rules").remove(builder);if (this.rules != null) {this.rules.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromRules(Predicate<V1IngressRuleBuilder> predicate) {
    if (rules == null) return (A) this;
    final Iterator<V1IngressRuleBuilder> each = rules.iterator();
    final List visitables = _visitables.get("rules");
    while (each.hasNext()) {
      V1IngressRuleBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildRules instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1IngressRule> getRules() {
    return rules != null ? build(rules) : null;
  }
  public List<V1IngressRule> buildRules() {
    return rules != null ? build(rules) : null;
  }
  public V1IngressRule buildRule(Integer index) {
    return this.rules.get(index).build();
  }
  public V1IngressRule buildFirstRule() {
    return this.rules.get(0).build();
  }
  public V1IngressRule buildLastRule() {
    return this.rules.get(rules.size() - 1).build();
  }
  public V1IngressRule buildMatchingRule(Predicate<V1IngressRuleBuilder> predicate) {
    for (V1IngressRuleBuilder item: rules) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingRule(Predicate<V1IngressRuleBuilder> predicate) {
    for (V1IngressRuleBuilder item: rules) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withRules(List<V1IngressRule> rules) {
    if (this.rules != null) { _visitables.get("rules").removeAll(this.rules);}
    if (rules != null) {this.rules = new ArrayList(); for (V1IngressRule item : rules){this.addToRules(item);}} else { this.rules = null;} return (A) this;
  }
  public A withRules(io.kubernetes.client.openapi.models.V1IngressRule... rules) {
    if (this.rules != null) {this.rules.clear();}
    if (rules != null) {for (V1IngressRule item :rules){ this.addToRules(item);}} return (A) this;
  }
  public Boolean hasRules() {
    return rules != null && !rules.isEmpty();
  }
  public V1IngressSpecFluent.RulesNested<A> addNewRule() {
    return new V1IngressSpecFluentImpl.RulesNestedImpl();
  }
  public V1IngressSpecFluent.RulesNested<A> addNewRuleLike(V1IngressRule item) {
    return new V1IngressSpecFluentImpl.RulesNestedImpl(-1, item);
  }
  public V1IngressSpecFluent.RulesNested<A> setNewRuleLike(Integer index,V1IngressRule item) {
    return new V1IngressSpecFluentImpl.RulesNestedImpl(index, item);
  }
  public V1IngressSpecFluent.RulesNested<A> editRule(Integer index) {
    if (rules.size() <= index) throw new RuntimeException("Can't edit rules. Index exceeds size.");
    return setNewRuleLike(index, buildRule(index));
  }
  public V1IngressSpecFluent.RulesNested<A> editFirstRule() {
    if (rules.size() == 0) throw new RuntimeException("Can't edit first rules. The list is empty.");
    return setNewRuleLike(0, buildRule(0));
  }
  public V1IngressSpecFluent.RulesNested<A> editLastRule() {
    int index = rules.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last rules. The list is empty.");
    return setNewRuleLike(index, buildRule(index));
  }
  public V1IngressSpecFluent.RulesNested<A> editMatchingRule(Predicate<V1IngressRuleBuilder> predicate) {
    int index = -1;
    for (int i=0;i<rules.size();i++) { 
    if (predicate.test(rules.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching rules. No match found.");
    return setNewRuleLike(index, buildRule(index));
  }
  public A addToTls(Integer index,V1IngressTLS item) {
    if (this.tls == null) {this.tls = new ArrayList<V1IngressTLSBuilder>();}
    V1IngressTLSBuilder builder = new V1IngressTLSBuilder(item);_visitables.get("tls").add(index >= 0 ? index : _visitables.get("tls").size(), builder);this.tls.add(index >= 0 ? index : tls.size(), builder); return (A)this;
  }
  public A setToTls(Integer index,V1IngressTLS item) {
    if (this.tls == null) {this.tls = new ArrayList<V1IngressTLSBuilder>();}
    V1IngressTLSBuilder builder = new V1IngressTLSBuilder(item);
    if (index < 0 || index >= _visitables.get("tls").size()) { _visitables.get("tls").add(builder); } else { _visitables.get("tls").set(index, builder);}
    if (index < 0 || index >= tls.size()) { tls.add(builder); } else { tls.set(index, builder);}
     return (A)this;
  }
  public A addToTls(io.kubernetes.client.openapi.models.V1IngressTLS... items) {
    if (this.tls == null) {this.tls = new ArrayList<V1IngressTLSBuilder>();}
    for (V1IngressTLS item : items) {V1IngressTLSBuilder builder = new V1IngressTLSBuilder(item);_visitables.get("tls").add(builder);this.tls.add(builder);} return (A)this;
  }
  public A addAllToTls(Collection<V1IngressTLS> items) {
    if (this.tls == null) {this.tls = new ArrayList<V1IngressTLSBuilder>();}
    for (V1IngressTLS item : items) {V1IngressTLSBuilder builder = new V1IngressTLSBuilder(item);_visitables.get("tls").add(builder);this.tls.add(builder);} return (A)this;
  }
  public A removeFromTls(io.kubernetes.client.openapi.models.V1IngressTLS... items) {
    for (V1IngressTLS item : items) {V1IngressTLSBuilder builder = new V1IngressTLSBuilder(item);_visitables.get("tls").remove(builder);if (this.tls != null) {this.tls.remove(builder);}} return (A)this;
  }
  public A removeAllFromTls(Collection<V1IngressTLS> items) {
    for (V1IngressTLS item : items) {V1IngressTLSBuilder builder = new V1IngressTLSBuilder(item);_visitables.get("tls").remove(builder);if (this.tls != null) {this.tls.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromTls(Predicate<V1IngressTLSBuilder> predicate) {
    if (tls == null) return (A) this;
    final Iterator<V1IngressTLSBuilder> each = tls.iterator();
    final List visitables = _visitables.get("tls");
    while (each.hasNext()) {
      V1IngressTLSBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildTls instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1IngressTLS> getTls() {
    return tls != null ? build(tls) : null;
  }
  public List<V1IngressTLS> buildTls() {
    return tls != null ? build(tls) : null;
  }
  public V1IngressTLS buildTl(Integer index) {
    return this.tls.get(index).build();
  }
  public V1IngressTLS buildFirstTl() {
    return this.tls.get(0).build();
  }
  public V1IngressTLS buildLastTl() {
    return this.tls.get(tls.size() - 1).build();
  }
  public V1IngressTLS buildMatchingTl(Predicate<V1IngressTLSBuilder> predicate) {
    for (V1IngressTLSBuilder item: tls) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingTl(Predicate<V1IngressTLSBuilder> predicate) {
    for (V1IngressTLSBuilder item: tls) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withTls(List<V1IngressTLS> tls) {
    if (this.tls != null) { _visitables.get("tls").removeAll(this.tls);}
    if (tls != null) {this.tls = new ArrayList(); for (V1IngressTLS item : tls){this.addToTls(item);}} else { this.tls = null;} return (A) this;
  }
  public A withTls(io.kubernetes.client.openapi.models.V1IngressTLS... tls) {
    if (this.tls != null) {this.tls.clear();}
    if (tls != null) {for (V1IngressTLS item :tls){ this.addToTls(item);}} return (A) this;
  }
  public Boolean hasTls() {
    return tls != null && !tls.isEmpty();
  }
  public V1IngressSpecFluent.TlsNested<A> addNewTl() {
    return new V1IngressSpecFluentImpl.TlsNestedImpl();
  }
  public V1IngressSpecFluent.TlsNested<A> addNewTlLike(V1IngressTLS item) {
    return new V1IngressSpecFluentImpl.TlsNestedImpl(-1, item);
  }
  public V1IngressSpecFluent.TlsNested<A> setNewTlLike(Integer index,V1IngressTLS item) {
    return new V1IngressSpecFluentImpl.TlsNestedImpl(index, item);
  }
  public V1IngressSpecFluent.TlsNested<A> editTl(Integer index) {
    if (tls.size() <= index) throw new RuntimeException("Can't edit tls. Index exceeds size.");
    return setNewTlLike(index, buildTl(index));
  }
  public V1IngressSpecFluent.TlsNested<A> editFirstTl() {
    if (tls.size() == 0) throw new RuntimeException("Can't edit first tls. The list is empty.");
    return setNewTlLike(0, buildTl(0));
  }
  public V1IngressSpecFluent.TlsNested<A> editLastTl() {
    int index = tls.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last tls. The list is empty.");
    return setNewTlLike(index, buildTl(index));
  }
  public V1IngressSpecFluent.TlsNested<A> editMatchingTl(Predicate<V1IngressTLSBuilder> predicate) {
    int index = -1;
    for (int i=0;i<tls.size();i++) { 
    if (predicate.test(tls.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching tls. No match found.");
    return setNewTlLike(index, buildTl(index));
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1IngressSpecFluentImpl that = (V1IngressSpecFluentImpl) o;
    if (defaultBackend != null ? !defaultBackend.equals(that.defaultBackend) :that.defaultBackend != null) return false;
    if (ingressClassName != null ? !ingressClassName.equals(that.ingressClassName) :that.ingressClassName != null) return false;
    if (rules != null ? !rules.equals(that.rules) :that.rules != null) return false;
    if (tls != null ? !tls.equals(that.tls) :that.tls != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(defaultBackend,  ingressClassName,  rules,  tls,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (defaultBackend != null) { sb.append("defaultBackend:"); sb.append(defaultBackend + ","); }
    if (ingressClassName != null) { sb.append("ingressClassName:"); sb.append(ingressClassName + ","); }
    if (rules != null && !rules.isEmpty()) { sb.append("rules:"); sb.append(rules + ","); }
    if (tls != null && !tls.isEmpty()) { sb.append("tls:"); sb.append(tls); }
    sb.append("}");
    return sb.toString();
  }
  class DefaultBackendNestedImpl<N> extends V1IngressBackendFluentImpl<V1IngressSpecFluent.DefaultBackendNested<N>> implements V1IngressSpecFluent.DefaultBackendNested<N>,Nested<N>{
    DefaultBackendNestedImpl(V1IngressBackend item) {
      this.builder = new V1IngressBackendBuilder(this, item);
    }
    DefaultBackendNestedImpl() {
      this.builder = new V1IngressBackendBuilder(this);
    }
    V1IngressBackendBuilder builder;
    public N and() {
      return (N) V1IngressSpecFluentImpl.this.withDefaultBackend(builder.build());
    }
    public N endDefaultBackend() {
      return and();
    }
    
  }
  class RulesNestedImpl<N> extends V1IngressRuleFluentImpl<V1IngressSpecFluent.RulesNested<N>> implements V1IngressSpecFluent.RulesNested<N>,Nested<N>{
    RulesNestedImpl(Integer index,V1IngressRule item) {
      this.index = index;
      this.builder = new V1IngressRuleBuilder(this, item);
    }
    RulesNestedImpl() {
      this.index = -1;
      this.builder = new V1IngressRuleBuilder(this);
    }
    V1IngressRuleBuilder builder;
    Integer index;
    public N and() {
      return (N) V1IngressSpecFluentImpl.this.setToRules(index,builder.build());
    }
    public N endRule() {
      return and();
    }
    
  }
  class TlsNestedImpl<N> extends V1IngressTLSFluentImpl<V1IngressSpecFluent.TlsNested<N>> implements V1IngressSpecFluent.TlsNested<N>,Nested<N>{
    TlsNestedImpl(Integer index,V1IngressTLS item) {
      this.index = index;
      this.builder = new V1IngressTLSBuilder(this, item);
    }
    TlsNestedImpl() {
      this.index = -1;
      this.builder = new V1IngressTLSBuilder(this);
    }
    V1IngressTLSBuilder builder;
    Integer index;
    public N and() {
      return (N) V1IngressSpecFluentImpl.this.setToTls(index,builder.build());
    }
    public N endTl() {
      return and();
    }
    
  }
  
}