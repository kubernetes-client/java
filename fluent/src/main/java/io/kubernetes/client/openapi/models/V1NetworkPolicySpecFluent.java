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
public class V1NetworkPolicySpecFluent<A extends V1NetworkPolicySpecFluent<A>> extends BaseFluent<A>{
  public V1NetworkPolicySpecFluent() {
  }
  
  public V1NetworkPolicySpecFluent(V1NetworkPolicySpec instance) {
    this.copyInstance(instance);
  }
  private ArrayList<V1NetworkPolicyEgressRuleBuilder> egress;
  private ArrayList<V1NetworkPolicyIngressRuleBuilder> ingress;
  private V1LabelSelectorBuilder podSelector;
  private List<String> policyTypes;
  
  protected void copyInstance(V1NetworkPolicySpec instance) {
    instance = (instance != null ? instance : new V1NetworkPolicySpec());
    if (instance != null) {
          this.withEgress(instance.getEgress());
          this.withIngress(instance.getIngress());
          this.withPodSelector(instance.getPodSelector());
          this.withPolicyTypes(instance.getPolicyTypes());
        }
  }
  
  public A addToEgress(int index,V1NetworkPolicyEgressRule item) {
    if (this.egress == null) {this.egress = new ArrayList<V1NetworkPolicyEgressRuleBuilder>();}
    V1NetworkPolicyEgressRuleBuilder builder = new V1NetworkPolicyEgressRuleBuilder(item);
    if (index < 0 || index >= egress.size()) { _visitables.get("egress").add(builder); egress.add(builder); } else { _visitables.get("egress").add(index, builder); egress.add(index, builder);}
    return (A)this;
  }
  
  public A setToEgress(int index,V1NetworkPolicyEgressRule item) {
    if (this.egress == null) {this.egress = new ArrayList<V1NetworkPolicyEgressRuleBuilder>();}
    V1NetworkPolicyEgressRuleBuilder builder = new V1NetworkPolicyEgressRuleBuilder(item);
    if (index < 0 || index >= egress.size()) { _visitables.get("egress").add(builder); egress.add(builder); } else { _visitables.get("egress").set(index, builder); egress.set(index, builder);}
    return (A)this;
  }
  
  public A addToEgress(io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule... items) {
    if (this.egress == null) {this.egress = new ArrayList<V1NetworkPolicyEgressRuleBuilder>();}
    for (V1NetworkPolicyEgressRule item : items) {V1NetworkPolicyEgressRuleBuilder builder = new V1NetworkPolicyEgressRuleBuilder(item);_visitables.get("egress").add(builder);this.egress.add(builder);} return (A)this;
  }
  
  public A addAllToEgress(Collection<V1NetworkPolicyEgressRule> items) {
    if (this.egress == null) {this.egress = new ArrayList<V1NetworkPolicyEgressRuleBuilder>();}
    for (V1NetworkPolicyEgressRule item : items) {V1NetworkPolicyEgressRuleBuilder builder = new V1NetworkPolicyEgressRuleBuilder(item);_visitables.get("egress").add(builder);this.egress.add(builder);} return (A)this;
  }
  
  public A removeFromEgress(io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule... items) {
    if (this.egress == null) return (A)this;
    for (V1NetworkPolicyEgressRule item : items) {V1NetworkPolicyEgressRuleBuilder builder = new V1NetworkPolicyEgressRuleBuilder(item);_visitables.get("egress").remove(builder); this.egress.remove(builder);} return (A)this;
  }
  
  public A removeAllFromEgress(Collection<V1NetworkPolicyEgressRule> items) {
    if (this.egress == null) return (A)this;
    for (V1NetworkPolicyEgressRule item : items) {V1NetworkPolicyEgressRuleBuilder builder = new V1NetworkPolicyEgressRuleBuilder(item);_visitables.get("egress").remove(builder); this.egress.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromEgress(Predicate<V1NetworkPolicyEgressRuleBuilder> predicate) {
    if (egress == null) return (A) this;
    final Iterator<V1NetworkPolicyEgressRuleBuilder> each = egress.iterator();
    final List visitables = _visitables.get("egress");
    while (each.hasNext()) {
      V1NetworkPolicyEgressRuleBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1NetworkPolicyEgressRule> buildEgress() {
    return this.egress != null ? build(egress) : null;
  }
  
  public V1NetworkPolicyEgressRule buildEgress(int index) {
    return this.egress.get(index).build();
  }
  
  public V1NetworkPolicyEgressRule buildFirstEgress() {
    return this.egress.get(0).build();
  }
  
  public V1NetworkPolicyEgressRule buildLastEgress() {
    return this.egress.get(egress.size() - 1).build();
  }
  
  public V1NetworkPolicyEgressRule buildMatchingEgress(Predicate<V1NetworkPolicyEgressRuleBuilder> predicate) {
      for (V1NetworkPolicyEgressRuleBuilder item : egress) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingEgress(Predicate<V1NetworkPolicyEgressRuleBuilder> predicate) {
      for (V1NetworkPolicyEgressRuleBuilder item : egress) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withEgress(List<V1NetworkPolicyEgressRule> egress) {
    if (this.egress != null) {
      this._visitables.get("egress").clear();
    }
    if (egress != null) {
        this.egress = new ArrayList();
        for (V1NetworkPolicyEgressRule item : egress) {
          this.addToEgress(item);
        }
    } else {
      this.egress = null;
    }
    return (A) this;
  }
  
  public A withEgress(io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule... egress) {
    if (this.egress != null) {
        this.egress.clear();
        _visitables.remove("egress");
    }
    if (egress != null) {
      for (V1NetworkPolicyEgressRule item : egress) {
        this.addToEgress(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasEgress() {
    return this.egress != null && !this.egress.isEmpty();
  }
  
  public EgressNested<A> addNewEgress() {
    return new EgressNested(-1, null);
  }
  
  public EgressNested<A> addNewEgressLike(V1NetworkPolicyEgressRule item) {
    return new EgressNested(-1, item);
  }
  
  public EgressNested<A> setNewEgressLike(int index,V1NetworkPolicyEgressRule item) {
    return new EgressNested(index, item);
  }
  
  public EgressNested<A> editEgress(int index) {
    if (egress.size() <= index) throw new RuntimeException("Can't edit egress. Index exceeds size.");
    return setNewEgressLike(index, buildEgress(index));
  }
  
  public EgressNested<A> editFirstEgress() {
    if (egress.size() == 0) throw new RuntimeException("Can't edit first egress. The list is empty.");
    return setNewEgressLike(0, buildEgress(0));
  }
  
  public EgressNested<A> editLastEgress() {
    int index = egress.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last egress. The list is empty.");
    return setNewEgressLike(index, buildEgress(index));
  }
  
  public EgressNested<A> editMatchingEgress(Predicate<V1NetworkPolicyEgressRuleBuilder> predicate) {
    int index = -1;
    for (int i=0;i<egress.size();i++) { 
    if (predicate.test(egress.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching egress. No match found.");
    return setNewEgressLike(index, buildEgress(index));
  }
  
  public A addToIngress(int index,V1NetworkPolicyIngressRule item) {
    if (this.ingress == null) {this.ingress = new ArrayList<V1NetworkPolicyIngressRuleBuilder>();}
    V1NetworkPolicyIngressRuleBuilder builder = new V1NetworkPolicyIngressRuleBuilder(item);
    if (index < 0 || index >= ingress.size()) { _visitables.get("ingress").add(builder); ingress.add(builder); } else { _visitables.get("ingress").add(index, builder); ingress.add(index, builder);}
    return (A)this;
  }
  
  public A setToIngress(int index,V1NetworkPolicyIngressRule item) {
    if (this.ingress == null) {this.ingress = new ArrayList<V1NetworkPolicyIngressRuleBuilder>();}
    V1NetworkPolicyIngressRuleBuilder builder = new V1NetworkPolicyIngressRuleBuilder(item);
    if (index < 0 || index >= ingress.size()) { _visitables.get("ingress").add(builder); ingress.add(builder); } else { _visitables.get("ingress").set(index, builder); ingress.set(index, builder);}
    return (A)this;
  }
  
  public A addToIngress(io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule... items) {
    if (this.ingress == null) {this.ingress = new ArrayList<V1NetworkPolicyIngressRuleBuilder>();}
    for (V1NetworkPolicyIngressRule item : items) {V1NetworkPolicyIngressRuleBuilder builder = new V1NetworkPolicyIngressRuleBuilder(item);_visitables.get("ingress").add(builder);this.ingress.add(builder);} return (A)this;
  }
  
  public A addAllToIngress(Collection<V1NetworkPolicyIngressRule> items) {
    if (this.ingress == null) {this.ingress = new ArrayList<V1NetworkPolicyIngressRuleBuilder>();}
    for (V1NetworkPolicyIngressRule item : items) {V1NetworkPolicyIngressRuleBuilder builder = new V1NetworkPolicyIngressRuleBuilder(item);_visitables.get("ingress").add(builder);this.ingress.add(builder);} return (A)this;
  }
  
  public A removeFromIngress(io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule... items) {
    if (this.ingress == null) return (A)this;
    for (V1NetworkPolicyIngressRule item : items) {V1NetworkPolicyIngressRuleBuilder builder = new V1NetworkPolicyIngressRuleBuilder(item);_visitables.get("ingress").remove(builder); this.ingress.remove(builder);} return (A)this;
  }
  
  public A removeAllFromIngress(Collection<V1NetworkPolicyIngressRule> items) {
    if (this.ingress == null) return (A)this;
    for (V1NetworkPolicyIngressRule item : items) {V1NetworkPolicyIngressRuleBuilder builder = new V1NetworkPolicyIngressRuleBuilder(item);_visitables.get("ingress").remove(builder); this.ingress.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromIngress(Predicate<V1NetworkPolicyIngressRuleBuilder> predicate) {
    if (ingress == null) return (A) this;
    final Iterator<V1NetworkPolicyIngressRuleBuilder> each = ingress.iterator();
    final List visitables = _visitables.get("ingress");
    while (each.hasNext()) {
      V1NetworkPolicyIngressRuleBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1NetworkPolicyIngressRule> buildIngress() {
    return this.ingress != null ? build(ingress) : null;
  }
  
  public V1NetworkPolicyIngressRule buildIngress(int index) {
    return this.ingress.get(index).build();
  }
  
  public V1NetworkPolicyIngressRule buildFirstIngress() {
    return this.ingress.get(0).build();
  }
  
  public V1NetworkPolicyIngressRule buildLastIngress() {
    return this.ingress.get(ingress.size() - 1).build();
  }
  
  public V1NetworkPolicyIngressRule buildMatchingIngress(Predicate<V1NetworkPolicyIngressRuleBuilder> predicate) {
      for (V1NetworkPolicyIngressRuleBuilder item : ingress) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingIngress(Predicate<V1NetworkPolicyIngressRuleBuilder> predicate) {
      for (V1NetworkPolicyIngressRuleBuilder item : ingress) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withIngress(List<V1NetworkPolicyIngressRule> ingress) {
    if (this.ingress != null) {
      this._visitables.get("ingress").clear();
    }
    if (ingress != null) {
        this.ingress = new ArrayList();
        for (V1NetworkPolicyIngressRule item : ingress) {
          this.addToIngress(item);
        }
    } else {
      this.ingress = null;
    }
    return (A) this;
  }
  
  public A withIngress(io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule... ingress) {
    if (this.ingress != null) {
        this.ingress.clear();
        _visitables.remove("ingress");
    }
    if (ingress != null) {
      for (V1NetworkPolicyIngressRule item : ingress) {
        this.addToIngress(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasIngress() {
    return this.ingress != null && !this.ingress.isEmpty();
  }
  
  public IngressNested<A> addNewIngress() {
    return new IngressNested(-1, null);
  }
  
  public IngressNested<A> addNewIngressLike(V1NetworkPolicyIngressRule item) {
    return new IngressNested(-1, item);
  }
  
  public IngressNested<A> setNewIngressLike(int index,V1NetworkPolicyIngressRule item) {
    return new IngressNested(index, item);
  }
  
  public IngressNested<A> editIngress(int index) {
    if (ingress.size() <= index) throw new RuntimeException("Can't edit ingress. Index exceeds size.");
    return setNewIngressLike(index, buildIngress(index));
  }
  
  public IngressNested<A> editFirstIngress() {
    if (ingress.size() == 0) throw new RuntimeException("Can't edit first ingress. The list is empty.");
    return setNewIngressLike(0, buildIngress(0));
  }
  
  public IngressNested<A> editLastIngress() {
    int index = ingress.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last ingress. The list is empty.");
    return setNewIngressLike(index, buildIngress(index));
  }
  
  public IngressNested<A> editMatchingIngress(Predicate<V1NetworkPolicyIngressRuleBuilder> predicate) {
    int index = -1;
    for (int i=0;i<ingress.size();i++) { 
    if (predicate.test(ingress.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching ingress. No match found.");
    return setNewIngressLike(index, buildIngress(index));
  }
  
  public V1LabelSelector buildPodSelector() {
    return this.podSelector != null ? this.podSelector.build() : null;
  }
  
  public A withPodSelector(V1LabelSelector podSelector) {
    this._visitables.remove("podSelector");
    if (podSelector != null) {
        this.podSelector = new V1LabelSelectorBuilder(podSelector);
        this._visitables.get("podSelector").add(this.podSelector);
    } else {
        this.podSelector = null;
        this._visitables.get("podSelector").remove(this.podSelector);
    }
    return (A) this;
  }
  
  public boolean hasPodSelector() {
    return this.podSelector != null;
  }
  
  public PodSelectorNested<A> withNewPodSelector() {
    return new PodSelectorNested(null);
  }
  
  public PodSelectorNested<A> withNewPodSelectorLike(V1LabelSelector item) {
    return new PodSelectorNested(item);
  }
  
  public PodSelectorNested<A> editPodSelector() {
    return withNewPodSelectorLike(java.util.Optional.ofNullable(buildPodSelector()).orElse(null));
  }
  
  public PodSelectorNested<A> editOrNewPodSelector() {
    return withNewPodSelectorLike(java.util.Optional.ofNullable(buildPodSelector()).orElse(new V1LabelSelectorBuilder().build()));
  }
  
  public PodSelectorNested<A> editOrNewPodSelectorLike(V1LabelSelector item) {
    return withNewPodSelectorLike(java.util.Optional.ofNullable(buildPodSelector()).orElse(item));
  }
  
  public A addToPolicyTypes(int index,String item) {
    if (this.policyTypes == null) {this.policyTypes = new ArrayList<String>();}
    this.policyTypes.add(index, item);
    return (A)this;
  }
  
  public A setToPolicyTypes(int index,String item) {
    if (this.policyTypes == null) {this.policyTypes = new ArrayList<String>();}
    this.policyTypes.set(index, item); return (A)this;
  }
  
  public A addToPolicyTypes(java.lang.String... items) {
    if (this.policyTypes == null) {this.policyTypes = new ArrayList<String>();}
    for (String item : items) {this.policyTypes.add(item);} return (A)this;
  }
  
  public A addAllToPolicyTypes(Collection<String> items) {
    if (this.policyTypes == null) {this.policyTypes = new ArrayList<String>();}
    for (String item : items) {this.policyTypes.add(item);} return (A)this;
  }
  
  public A removeFromPolicyTypes(java.lang.String... items) {
    if (this.policyTypes == null) return (A)this;
    for (String item : items) { this.policyTypes.remove(item);} return (A)this;
  }
  
  public A removeAllFromPolicyTypes(Collection<String> items) {
    if (this.policyTypes == null) return (A)this;
    for (String item : items) { this.policyTypes.remove(item);} return (A)this;
  }
  
  public List<String> getPolicyTypes() {
    return this.policyTypes;
  }
  
  public String getPolicyType(int index) {
    return this.policyTypes.get(index);
  }
  
  public String getFirstPolicyType() {
    return this.policyTypes.get(0);
  }
  
  public String getLastPolicyType() {
    return this.policyTypes.get(policyTypes.size() - 1);
  }
  
  public String getMatchingPolicyType(Predicate<String> predicate) {
      for (String item : policyTypes) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingPolicyType(Predicate<String> predicate) {
      for (String item : policyTypes) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withPolicyTypes(List<String> policyTypes) {
    if (policyTypes != null) {
        this.policyTypes = new ArrayList();
        for (String item : policyTypes) {
          this.addToPolicyTypes(item);
        }
    } else {
      this.policyTypes = null;
    }
    return (A) this;
  }
  
  public A withPolicyTypes(java.lang.String... policyTypes) {
    if (this.policyTypes != null) {
        this.policyTypes.clear();
        _visitables.remove("policyTypes");
    }
    if (policyTypes != null) {
      for (String item : policyTypes) {
        this.addToPolicyTypes(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasPolicyTypes() {
    return this.policyTypes != null && !this.policyTypes.isEmpty();
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1NetworkPolicySpecFluent that = (V1NetworkPolicySpecFluent) o;
    if (!java.util.Objects.equals(egress, that.egress)) return false;
    if (!java.util.Objects.equals(ingress, that.ingress)) return false;
    if (!java.util.Objects.equals(podSelector, that.podSelector)) return false;
    if (!java.util.Objects.equals(policyTypes, that.policyTypes)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(egress,  ingress,  podSelector,  policyTypes,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (egress != null && !egress.isEmpty()) { sb.append("egress:"); sb.append(egress + ","); }
    if (ingress != null && !ingress.isEmpty()) { sb.append("ingress:"); sb.append(ingress + ","); }
    if (podSelector != null) { sb.append("podSelector:"); sb.append(podSelector + ","); }
    if (policyTypes != null && !policyTypes.isEmpty()) { sb.append("policyTypes:"); sb.append(policyTypes); }
    sb.append("}");
    return sb.toString();
  }
  public class EgressNested<N> extends V1NetworkPolicyEgressRuleFluent<EgressNested<N>> implements Nested<N>{
    EgressNested(int index,V1NetworkPolicyEgressRule item) {
      this.index = index;
      this.builder = new V1NetworkPolicyEgressRuleBuilder(this, item);
    }
    V1NetworkPolicyEgressRuleBuilder builder;
    int index;
    
    public N and() {
      return (N) V1NetworkPolicySpecFluent.this.setToEgress(index,builder.build());
    }
    
    public N endEgress() {
      return and();
    }
    
  
  }
  public class IngressNested<N> extends V1NetworkPolicyIngressRuleFluent<IngressNested<N>> implements Nested<N>{
    IngressNested(int index,V1NetworkPolicyIngressRule item) {
      this.index = index;
      this.builder = new V1NetworkPolicyIngressRuleBuilder(this, item);
    }
    V1NetworkPolicyIngressRuleBuilder builder;
    int index;
    
    public N and() {
      return (N) V1NetworkPolicySpecFluent.this.setToIngress(index,builder.build());
    }
    
    public N endIngress() {
      return and();
    }
    
  
  }
  public class PodSelectorNested<N> extends V1LabelSelectorFluent<PodSelectorNested<N>> implements Nested<N>{
    PodSelectorNested(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
    V1LabelSelectorBuilder builder;
    
    public N and() {
      return (N) V1NetworkPolicySpecFluent.this.withPodSelector(builder.build());
    }
    
    public N endPodSelector() {
      return and();
    }
    
  
  }

}