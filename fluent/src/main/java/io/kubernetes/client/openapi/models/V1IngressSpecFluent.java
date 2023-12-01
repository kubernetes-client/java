package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1IngressSpecFluent<A extends V1IngressSpecFluent<A>> extends BaseFluent<A>{
  public V1IngressSpecFluent() {
  }
  
  public V1IngressSpecFluent(V1IngressSpec instance) {
    this.copyInstance(instance);
  }
  private V1IngressBackendBuilder defaultBackend;
  private String ingressClassName;
  private ArrayList<V1IngressRuleBuilder> rules;
  private ArrayList<V1IngressTLSBuilder> tls;
  
  protected void copyInstance(V1IngressSpec instance) {
    instance = (instance != null ? instance : new V1IngressSpec());
    if (instance != null) {
          this.withDefaultBackend(instance.getDefaultBackend());
          this.withIngressClassName(instance.getIngressClassName());
          this.withRules(instance.getRules());
          this.withTls(instance.getTls());
        }
  }
  
  public V1IngressBackend buildDefaultBackend() {
    return this.defaultBackend != null ? this.defaultBackend.build() : null;
  }
  
  public A withDefaultBackend(V1IngressBackend defaultBackend) {
    this._visitables.remove("defaultBackend");
    if (defaultBackend != null) {
        this.defaultBackend = new V1IngressBackendBuilder(defaultBackend);
        this._visitables.get("defaultBackend").add(this.defaultBackend);
    } else {
        this.defaultBackend = null;
        this._visitables.get("defaultBackend").remove(this.defaultBackend);
    }
    return (A) this;
  }
  
  public boolean hasDefaultBackend() {
    return this.defaultBackend != null;
  }
  
  public DefaultBackendNested<A> withNewDefaultBackend() {
    return new DefaultBackendNested(null);
  }
  
  public DefaultBackendNested<A> withNewDefaultBackendLike(V1IngressBackend item) {
    return new DefaultBackendNested(item);
  }
  
  public DefaultBackendNested<A> editDefaultBackend() {
    return withNewDefaultBackendLike(java.util.Optional.ofNullable(buildDefaultBackend()).orElse(null));
  }
  
  public DefaultBackendNested<A> editOrNewDefaultBackend() {
    return withNewDefaultBackendLike(java.util.Optional.ofNullable(buildDefaultBackend()).orElse(new V1IngressBackendBuilder().build()));
  }
  
  public DefaultBackendNested<A> editOrNewDefaultBackendLike(V1IngressBackend item) {
    return withNewDefaultBackendLike(java.util.Optional.ofNullable(buildDefaultBackend()).orElse(item));
  }
  
  public String getIngressClassName() {
    return this.ingressClassName;
  }
  
  public A withIngressClassName(String ingressClassName) {
    this.ingressClassName = ingressClassName;
    return (A) this;
  }
  
  public boolean hasIngressClassName() {
    return this.ingressClassName != null;
  }
  
  public A addToRules(int index,V1IngressRule item) {
    if (this.rules == null) {this.rules = new ArrayList<V1IngressRuleBuilder>();}
    V1IngressRuleBuilder builder = new V1IngressRuleBuilder(item);
    if (index < 0 || index >= rules.size()) { _visitables.get("rules").add(builder); rules.add(builder); } else { _visitables.get("rules").add(index, builder); rules.add(index, builder);}
    return (A)this;
  }
  
  public A setToRules(int index,V1IngressRule item) {
    if (this.rules == null) {this.rules = new ArrayList<V1IngressRuleBuilder>();}
    V1IngressRuleBuilder builder = new V1IngressRuleBuilder(item);
    if (index < 0 || index >= rules.size()) { _visitables.get("rules").add(builder); rules.add(builder); } else { _visitables.get("rules").set(index, builder); rules.set(index, builder);}
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
    if (this.rules == null) return (A)this;
    for (V1IngressRule item : items) {V1IngressRuleBuilder builder = new V1IngressRuleBuilder(item);_visitables.get("rules").remove(builder); this.rules.remove(builder);} return (A)this;
  }
  
  public A removeAllFromRules(Collection<V1IngressRule> items) {
    if (this.rules == null) return (A)this;
    for (V1IngressRule item : items) {V1IngressRuleBuilder builder = new V1IngressRuleBuilder(item);_visitables.get("rules").remove(builder); this.rules.remove(builder);} return (A)this;
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
  
  public List<V1IngressRule> buildRules() {
    return this.rules != null ? build(rules) : null;
  }
  
  public V1IngressRule buildRule(int index) {
    return this.rules.get(index).build();
  }
  
  public V1IngressRule buildFirstRule() {
    return this.rules.get(0).build();
  }
  
  public V1IngressRule buildLastRule() {
    return this.rules.get(rules.size() - 1).build();
  }
  
  public V1IngressRule buildMatchingRule(Predicate<V1IngressRuleBuilder> predicate) {
      for (V1IngressRuleBuilder item : rules) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingRule(Predicate<V1IngressRuleBuilder> predicate) {
      for (V1IngressRuleBuilder item : rules) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withRules(List<V1IngressRule> rules) {
    if (this.rules != null) {
      this._visitables.get("rules").clear();
    }
    if (rules != null) {
        this.rules = new ArrayList();
        for (V1IngressRule item : rules) {
          this.addToRules(item);
        }
    } else {
      this.rules = null;
    }
    return (A) this;
  }
  
  public A withRules(io.kubernetes.client.openapi.models.V1IngressRule... rules) {
    if (this.rules != null) {
        this.rules.clear();
        _visitables.remove("rules");
    }
    if (rules != null) {
      for (V1IngressRule item : rules) {
        this.addToRules(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasRules() {
    return this.rules != null && !this.rules.isEmpty();
  }
  
  public RulesNested<A> addNewRule() {
    return new RulesNested(-1, null);
  }
  
  public RulesNested<A> addNewRuleLike(V1IngressRule item) {
    return new RulesNested(-1, item);
  }
  
  public RulesNested<A> setNewRuleLike(int index,V1IngressRule item) {
    return new RulesNested(index, item);
  }
  
  public RulesNested<A> editRule(int index) {
    if (rules.size() <= index) throw new RuntimeException("Can't edit rules. Index exceeds size.");
    return setNewRuleLike(index, buildRule(index));
  }
  
  public RulesNested<A> editFirstRule() {
    if (rules.size() == 0) throw new RuntimeException("Can't edit first rules. The list is empty.");
    return setNewRuleLike(0, buildRule(0));
  }
  
  public RulesNested<A> editLastRule() {
    int index = rules.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last rules. The list is empty.");
    return setNewRuleLike(index, buildRule(index));
  }
  
  public RulesNested<A> editMatchingRule(Predicate<V1IngressRuleBuilder> predicate) {
    int index = -1;
    for (int i=0;i<rules.size();i++) { 
    if (predicate.test(rules.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching rules. No match found.");
    return setNewRuleLike(index, buildRule(index));
  }
  
  public A addToTls(int index,V1IngressTLS item) {
    if (this.tls == null) {this.tls = new ArrayList<V1IngressTLSBuilder>();}
    V1IngressTLSBuilder builder = new V1IngressTLSBuilder(item);
    if (index < 0 || index >= tls.size()) { _visitables.get("tls").add(builder); tls.add(builder); } else { _visitables.get("tls").add(index, builder); tls.add(index, builder);}
    return (A)this;
  }
  
  public A setToTls(int index,V1IngressTLS item) {
    if (this.tls == null) {this.tls = new ArrayList<V1IngressTLSBuilder>();}
    V1IngressTLSBuilder builder = new V1IngressTLSBuilder(item);
    if (index < 0 || index >= tls.size()) { _visitables.get("tls").add(builder); tls.add(builder); } else { _visitables.get("tls").set(index, builder); tls.set(index, builder);}
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
    if (this.tls == null) return (A)this;
    for (V1IngressTLS item : items) {V1IngressTLSBuilder builder = new V1IngressTLSBuilder(item);_visitables.get("tls").remove(builder); this.tls.remove(builder);} return (A)this;
  }
  
  public A removeAllFromTls(Collection<V1IngressTLS> items) {
    if (this.tls == null) return (A)this;
    for (V1IngressTLS item : items) {V1IngressTLSBuilder builder = new V1IngressTLSBuilder(item);_visitables.get("tls").remove(builder); this.tls.remove(builder);} return (A)this;
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
  
  public List<V1IngressTLS> buildTls() {
    return this.tls != null ? build(tls) : null;
  }
  
  public V1IngressTLS buildTl(int index) {
    return this.tls.get(index).build();
  }
  
  public V1IngressTLS buildFirstTl() {
    return this.tls.get(0).build();
  }
  
  public V1IngressTLS buildLastTl() {
    return this.tls.get(tls.size() - 1).build();
  }
  
  public V1IngressTLS buildMatchingTl(Predicate<V1IngressTLSBuilder> predicate) {
      for (V1IngressTLSBuilder item : tls) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingTl(Predicate<V1IngressTLSBuilder> predicate) {
      for (V1IngressTLSBuilder item : tls) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withTls(List<V1IngressTLS> tls) {
    if (this.tls != null) {
      this._visitables.get("tls").clear();
    }
    if (tls != null) {
        this.tls = new ArrayList();
        for (V1IngressTLS item : tls) {
          this.addToTls(item);
        }
    } else {
      this.tls = null;
    }
    return (A) this;
  }
  
  public A withTls(io.kubernetes.client.openapi.models.V1IngressTLS... tls) {
    if (this.tls != null) {
        this.tls.clear();
        _visitables.remove("tls");
    }
    if (tls != null) {
      for (V1IngressTLS item : tls) {
        this.addToTls(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasTls() {
    return this.tls != null && !this.tls.isEmpty();
  }
  
  public TlsNested<A> addNewTl() {
    return new TlsNested(-1, null);
  }
  
  public TlsNested<A> addNewTlLike(V1IngressTLS item) {
    return new TlsNested(-1, item);
  }
  
  public TlsNested<A> setNewTlLike(int index,V1IngressTLS item) {
    return new TlsNested(index, item);
  }
  
  public TlsNested<A> editTl(int index) {
    if (tls.size() <= index) throw new RuntimeException("Can't edit tls. Index exceeds size.");
    return setNewTlLike(index, buildTl(index));
  }
  
  public TlsNested<A> editFirstTl() {
    if (tls.size() == 0) throw new RuntimeException("Can't edit first tls. The list is empty.");
    return setNewTlLike(0, buildTl(0));
  }
  
  public TlsNested<A> editLastTl() {
    int index = tls.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last tls. The list is empty.");
    return setNewTlLike(index, buildTl(index));
  }
  
  public TlsNested<A> editMatchingTl(Predicate<V1IngressTLSBuilder> predicate) {
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
    if (!super.equals(o)) return false;
    V1IngressSpecFluent that = (V1IngressSpecFluent) o;
    if (!java.util.Objects.equals(defaultBackend, that.defaultBackend)) return false;
    if (!java.util.Objects.equals(ingressClassName, that.ingressClassName)) return false;
    if (!java.util.Objects.equals(rules, that.rules)) return false;
    if (!java.util.Objects.equals(tls, that.tls)) return false;
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
  public class DefaultBackendNested<N> extends V1IngressBackendFluent<DefaultBackendNested<N>> implements Nested<N>{
    DefaultBackendNested(V1IngressBackend item) {
      this.builder = new V1IngressBackendBuilder(this, item);
    }
    V1IngressBackendBuilder builder;
    
    public N and() {
      return (N) V1IngressSpecFluent.this.withDefaultBackend(builder.build());
    }
    
    public N endDefaultBackend() {
      return and();
    }
    
  
  }
  public class RulesNested<N> extends V1IngressRuleFluent<RulesNested<N>> implements Nested<N>{
    RulesNested(int index,V1IngressRule item) {
      this.index = index;
      this.builder = new V1IngressRuleBuilder(this, item);
    }
    V1IngressRuleBuilder builder;
    int index;
    
    public N and() {
      return (N) V1IngressSpecFluent.this.setToRules(index,builder.build());
    }
    
    public N endRule() {
      return and();
    }
    
  
  }
  public class TlsNested<N> extends V1IngressTLSFluent<TlsNested<N>> implements Nested<N>{
    TlsNested(int index,V1IngressTLS item) {
      this.index = index;
      this.builder = new V1IngressTLSBuilder(this, item);
    }
    V1IngressTLSBuilder builder;
    int index;
    
    public N and() {
      return (N) V1IngressSpecFluent.this.setToTls(index,builder.build());
    }
    
    public N endTl() {
      return and();
    }
    
  
  }

}