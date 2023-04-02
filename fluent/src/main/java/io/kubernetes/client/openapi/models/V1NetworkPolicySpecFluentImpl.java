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
  public class V1NetworkPolicySpecFluentImpl<A extends V1NetworkPolicySpecFluent<A>> extends BaseFluent<A> implements V1NetworkPolicySpecFluent<A>{
  public V1NetworkPolicySpecFluentImpl() {
  }
  public V1NetworkPolicySpecFluentImpl(V1NetworkPolicySpec instance) {
    this.withEgress(instance.getEgress());

    this.withIngress(instance.getIngress());

    this.withPodSelector(instance.getPodSelector());

    this.withPolicyTypes(instance.getPolicyTypes());

  }
  private ArrayList<V1NetworkPolicyEgressRuleBuilder> egress;
  private ArrayList<V1NetworkPolicyIngressRuleBuilder> ingress;
  private V1LabelSelectorBuilder podSelector;
  private List<String> policyTypes;
  public A addToEgress(Integer index,V1NetworkPolicyEgressRule item) {
    if (this.egress == null) {this.egress = new ArrayList<V1NetworkPolicyEgressRuleBuilder>();}
    V1NetworkPolicyEgressRuleBuilder builder = new V1NetworkPolicyEgressRuleBuilder(item);_visitables.get("egress").add(index >= 0 ? index : _visitables.get("egress").size(), builder);this.egress.add(index >= 0 ? index : egress.size(), builder); return (A)this;
  }
  public A setToEgress(Integer index,V1NetworkPolicyEgressRule item) {
    if (this.egress == null) {this.egress = new ArrayList<V1NetworkPolicyEgressRuleBuilder>();}
    V1NetworkPolicyEgressRuleBuilder builder = new V1NetworkPolicyEgressRuleBuilder(item);
    if (index < 0 || index >= _visitables.get("egress").size()) { _visitables.get("egress").add(builder); } else { _visitables.get("egress").set(index, builder);}
    if (index < 0 || index >= egress.size()) { egress.add(builder); } else { egress.set(index, builder);}
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
    for (V1NetworkPolicyEgressRule item : items) {V1NetworkPolicyEgressRuleBuilder builder = new V1NetworkPolicyEgressRuleBuilder(item);_visitables.get("egress").remove(builder);if (this.egress != null) {this.egress.remove(builder);}} return (A)this;
  }
  public A removeAllFromEgress(Collection<V1NetworkPolicyEgressRule> items) {
    for (V1NetworkPolicyEgressRule item : items) {V1NetworkPolicyEgressRuleBuilder builder = new V1NetworkPolicyEgressRuleBuilder(item);_visitables.get("egress").remove(builder);if (this.egress != null) {this.egress.remove(builder);}} return (A)this;
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
  
  /**
   * This method has been deprecated, please use method buildEgress instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1NetworkPolicyEgressRule> getEgress() {
    return egress != null ? build(egress) : null;
  }
  public List<V1NetworkPolicyEgressRule> buildEgress() {
    return egress != null ? build(egress) : null;
  }
  public V1NetworkPolicyEgressRule buildEgress(Integer index) {
    return this.egress.get(index).build();
  }
  public V1NetworkPolicyEgressRule buildFirstEgress() {
    return this.egress.get(0).build();
  }
  public V1NetworkPolicyEgressRule buildLastEgress() {
    return this.egress.get(egress.size() - 1).build();
  }
  public V1NetworkPolicyEgressRule buildMatchingEgress(Predicate<V1NetworkPolicyEgressRuleBuilder> predicate) {
    for (V1NetworkPolicyEgressRuleBuilder item: egress) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingEgress(Predicate<V1NetworkPolicyEgressRuleBuilder> predicate) {
    for (V1NetworkPolicyEgressRuleBuilder item: egress) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withEgress(List<V1NetworkPolicyEgressRule> egress) {
    if (this.egress != null) { _visitables.get("egress").removeAll(this.egress);}
    if (egress != null) {this.egress = new ArrayList(); for (V1NetworkPolicyEgressRule item : egress){this.addToEgress(item);}} else { this.egress = null;} return (A) this;
  }
  public A withEgress(io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule... egress) {
    if (this.egress != null) {this.egress.clear();}
    if (egress != null) {for (V1NetworkPolicyEgressRule item :egress){ this.addToEgress(item);}} return (A) this;
  }
  public Boolean hasEgress() {
    return egress != null && !egress.isEmpty();
  }
  public V1NetworkPolicySpecFluent.EgressNested<A> addNewEgress() {
    return new V1NetworkPolicySpecFluentImpl.EgressNestedImpl();
  }
  public V1NetworkPolicySpecFluent.EgressNested<A> addNewEgressLike(V1NetworkPolicyEgressRule item) {
    return new V1NetworkPolicySpecFluentImpl.EgressNestedImpl(-1, item);
  }
  public V1NetworkPolicySpecFluent.EgressNested<A> setNewEgressLike(Integer index,V1NetworkPolicyEgressRule item) {
    return new V1NetworkPolicySpecFluentImpl.EgressNestedImpl(index, item);
  }
  public V1NetworkPolicySpecFluent.EgressNested<A> editEgress(Integer index) {
    if (egress.size() <= index) throw new RuntimeException("Can't edit egress. Index exceeds size.");
    return setNewEgressLike(index, buildEgress(index));
  }
  public V1NetworkPolicySpecFluent.EgressNested<A> editFirstEgress() {
    if (egress.size() == 0) throw new RuntimeException("Can't edit first egress. The list is empty.");
    return setNewEgressLike(0, buildEgress(0));
  }
  public V1NetworkPolicySpecFluent.EgressNested<A> editLastEgress() {
    int index = egress.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last egress. The list is empty.");
    return setNewEgressLike(index, buildEgress(index));
  }
  public V1NetworkPolicySpecFluent.EgressNested<A> editMatchingEgress(Predicate<V1NetworkPolicyEgressRuleBuilder> predicate) {
    int index = -1;
    for (int i=0;i<egress.size();i++) { 
    if (predicate.test(egress.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching egress. No match found.");
    return setNewEgressLike(index, buildEgress(index));
  }
  public A addToIngress(Integer index,V1NetworkPolicyIngressRule item) {
    if (this.ingress == null) {this.ingress = new ArrayList<V1NetworkPolicyIngressRuleBuilder>();}
    V1NetworkPolicyIngressRuleBuilder builder = new V1NetworkPolicyIngressRuleBuilder(item);_visitables.get("ingress").add(index >= 0 ? index : _visitables.get("ingress").size(), builder);this.ingress.add(index >= 0 ? index : ingress.size(), builder); return (A)this;
  }
  public A setToIngress(Integer index,V1NetworkPolicyIngressRule item) {
    if (this.ingress == null) {this.ingress = new ArrayList<V1NetworkPolicyIngressRuleBuilder>();}
    V1NetworkPolicyIngressRuleBuilder builder = new V1NetworkPolicyIngressRuleBuilder(item);
    if (index < 0 || index >= _visitables.get("ingress").size()) { _visitables.get("ingress").add(builder); } else { _visitables.get("ingress").set(index, builder);}
    if (index < 0 || index >= ingress.size()) { ingress.add(builder); } else { ingress.set(index, builder);}
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
    for (V1NetworkPolicyIngressRule item : items) {V1NetworkPolicyIngressRuleBuilder builder = new V1NetworkPolicyIngressRuleBuilder(item);_visitables.get("ingress").remove(builder);if (this.ingress != null) {this.ingress.remove(builder);}} return (A)this;
  }
  public A removeAllFromIngress(Collection<V1NetworkPolicyIngressRule> items) {
    for (V1NetworkPolicyIngressRule item : items) {V1NetworkPolicyIngressRuleBuilder builder = new V1NetworkPolicyIngressRuleBuilder(item);_visitables.get("ingress").remove(builder);if (this.ingress != null) {this.ingress.remove(builder);}} return (A)this;
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
  
  /**
   * This method has been deprecated, please use method buildIngress instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1NetworkPolicyIngressRule> getIngress() {
    return ingress != null ? build(ingress) : null;
  }
  public List<V1NetworkPolicyIngressRule> buildIngress() {
    return ingress != null ? build(ingress) : null;
  }
  public V1NetworkPolicyIngressRule buildIngress(Integer index) {
    return this.ingress.get(index).build();
  }
  public V1NetworkPolicyIngressRule buildFirstIngress() {
    return this.ingress.get(0).build();
  }
  public V1NetworkPolicyIngressRule buildLastIngress() {
    return this.ingress.get(ingress.size() - 1).build();
  }
  public V1NetworkPolicyIngressRule buildMatchingIngress(Predicate<V1NetworkPolicyIngressRuleBuilder> predicate) {
    for (V1NetworkPolicyIngressRuleBuilder item: ingress) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingIngress(Predicate<V1NetworkPolicyIngressRuleBuilder> predicate) {
    for (V1NetworkPolicyIngressRuleBuilder item: ingress) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withIngress(List<V1NetworkPolicyIngressRule> ingress) {
    if (this.ingress != null) { _visitables.get("ingress").removeAll(this.ingress);}
    if (ingress != null) {this.ingress = new ArrayList(); for (V1NetworkPolicyIngressRule item : ingress){this.addToIngress(item);}} else { this.ingress = null;} return (A) this;
  }
  public A withIngress(io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule... ingress) {
    if (this.ingress != null) {this.ingress.clear();}
    if (ingress != null) {for (V1NetworkPolicyIngressRule item :ingress){ this.addToIngress(item);}} return (A) this;
  }
  public Boolean hasIngress() {
    return ingress != null && !ingress.isEmpty();
  }
  public V1NetworkPolicySpecFluent.IngressNested<A> addNewIngress() {
    return new V1NetworkPolicySpecFluentImpl.IngressNestedImpl();
  }
  public V1NetworkPolicySpecFluent.IngressNested<A> addNewIngressLike(V1NetworkPolicyIngressRule item) {
    return new V1NetworkPolicySpecFluentImpl.IngressNestedImpl(-1, item);
  }
  public V1NetworkPolicySpecFluent.IngressNested<A> setNewIngressLike(Integer index,V1NetworkPolicyIngressRule item) {
    return new V1NetworkPolicySpecFluentImpl.IngressNestedImpl(index, item);
  }
  public V1NetworkPolicySpecFluent.IngressNested<A> editIngress(Integer index) {
    if (ingress.size() <= index) throw new RuntimeException("Can't edit ingress. Index exceeds size.");
    return setNewIngressLike(index, buildIngress(index));
  }
  public V1NetworkPolicySpecFluent.IngressNested<A> editFirstIngress() {
    if (ingress.size() == 0) throw new RuntimeException("Can't edit first ingress. The list is empty.");
    return setNewIngressLike(0, buildIngress(0));
  }
  public V1NetworkPolicySpecFluent.IngressNested<A> editLastIngress() {
    int index = ingress.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last ingress. The list is empty.");
    return setNewIngressLike(index, buildIngress(index));
  }
  public V1NetworkPolicySpecFluent.IngressNested<A> editMatchingIngress(Predicate<V1NetworkPolicyIngressRuleBuilder> predicate) {
    int index = -1;
    for (int i=0;i<ingress.size();i++) { 
    if (predicate.test(ingress.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching ingress. No match found.");
    return setNewIngressLike(index, buildIngress(index));
  }
  
  /**
   * This method has been deprecated, please use method buildPodSelector instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LabelSelector getPodSelector() {
    return this.podSelector!=null ?this.podSelector.build():null;
  }
  public V1LabelSelector buildPodSelector() {
    return this.podSelector!=null ?this.podSelector.build():null;
  }
  public A withPodSelector(V1LabelSelector podSelector) {
    _visitables.get("podSelector").remove(this.podSelector);
    if (podSelector!=null){ this.podSelector= new V1LabelSelectorBuilder(podSelector); _visitables.get("podSelector").add(this.podSelector);} else { this.podSelector = null; _visitables.get("podSelector").remove(this.podSelector); } return (A) this;
  }
  public Boolean hasPodSelector() {
    return this.podSelector != null;
  }
  public V1NetworkPolicySpecFluent.PodSelectorNested<A> withNewPodSelector() {
    return new V1NetworkPolicySpecFluentImpl.PodSelectorNestedImpl();
  }
  public V1NetworkPolicySpecFluent.PodSelectorNested<A> withNewPodSelectorLike(V1LabelSelector item) {
    return new V1NetworkPolicySpecFluentImpl.PodSelectorNestedImpl(item);
  }
  public V1NetworkPolicySpecFluent.PodSelectorNested<A> editPodSelector() {
    return withNewPodSelectorLike(getPodSelector());
  }
  public V1NetworkPolicySpecFluent.PodSelectorNested<A> editOrNewPodSelector() {
    return withNewPodSelectorLike(getPodSelector() != null ? getPodSelector(): new V1LabelSelectorBuilder().build());
  }
  public V1NetworkPolicySpecFluent.PodSelectorNested<A> editOrNewPodSelectorLike(V1LabelSelector item) {
    return withNewPodSelectorLike(getPodSelector() != null ? getPodSelector(): item);
  }
  public A addToPolicyTypes(Integer index,String item) {
    if (this.policyTypes == null) {this.policyTypes = new ArrayList<String>();}
    this.policyTypes.add(index, item);
    return (A)this;
  }
  public A setToPolicyTypes(Integer index,String item) {
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
    for (String item : items) {if (this.policyTypes!= null){ this.policyTypes.remove(item);}} return (A)this;
  }
  public A removeAllFromPolicyTypes(Collection<String> items) {
    for (String item : items) {if (this.policyTypes!= null){ this.policyTypes.remove(item);}} return (A)this;
  }
  public List<String> getPolicyTypes() {
    return this.policyTypes;
  }
  public String getPolicyType(Integer index) {
    return this.policyTypes.get(index);
  }
  public String getFirstPolicyType() {
    return this.policyTypes.get(0);
  }
  public String getLastPolicyType() {
    return this.policyTypes.get(policyTypes.size() - 1);
  }
  public String getMatchingPolicyType(Predicate<String> predicate) {
    for (String item: policyTypes) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingPolicyType(Predicate<String> predicate) {
    for (String item: policyTypes) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withPolicyTypes(List<String> policyTypes) {
    if (policyTypes != null) {this.policyTypes = new ArrayList(); for (String item : policyTypes){this.addToPolicyTypes(item);}} else { this.policyTypes = null;} return (A) this;
  }
  public A withPolicyTypes(java.lang.String... policyTypes) {
    if (this.policyTypes != null) {this.policyTypes.clear();}
    if (policyTypes != null) {for (String item :policyTypes){ this.addToPolicyTypes(item);}} return (A) this;
  }
  public Boolean hasPolicyTypes() {
    return policyTypes != null && !policyTypes.isEmpty();
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1NetworkPolicySpecFluentImpl that = (V1NetworkPolicySpecFluentImpl) o;
    if (egress != null ? !egress.equals(that.egress) :that.egress != null) return false;
    if (ingress != null ? !ingress.equals(that.ingress) :that.ingress != null) return false;
    if (podSelector != null ? !podSelector.equals(that.podSelector) :that.podSelector != null) return false;
    if (policyTypes != null ? !policyTypes.equals(that.policyTypes) :that.policyTypes != null) return false;
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
  class EgressNestedImpl<N> extends V1NetworkPolicyEgressRuleFluentImpl<V1NetworkPolicySpecFluent.EgressNested<N>> implements V1NetworkPolicySpecFluent.EgressNested<N>,Nested<N>{
    EgressNestedImpl(Integer index,V1NetworkPolicyEgressRule item) {
      this.index = index;
      this.builder = new V1NetworkPolicyEgressRuleBuilder(this, item);
    }
    EgressNestedImpl() {
      this.index = -1;
      this.builder = new V1NetworkPolicyEgressRuleBuilder(this);
    }
    V1NetworkPolicyEgressRuleBuilder builder;
    Integer index;
    public N and() {
      return (N) V1NetworkPolicySpecFluentImpl.this.setToEgress(index,builder.build());
    }
    public N endEgress() {
      return and();
    }
    
  }
  class IngressNestedImpl<N> extends V1NetworkPolicyIngressRuleFluentImpl<V1NetworkPolicySpecFluent.IngressNested<N>> implements V1NetworkPolicySpecFluent.IngressNested<N>,Nested<N>{
    IngressNestedImpl(Integer index,V1NetworkPolicyIngressRule item) {
      this.index = index;
      this.builder = new V1NetworkPolicyIngressRuleBuilder(this, item);
    }
    IngressNestedImpl() {
      this.index = -1;
      this.builder = new V1NetworkPolicyIngressRuleBuilder(this);
    }
    V1NetworkPolicyIngressRuleBuilder builder;
    Integer index;
    public N and() {
      return (N) V1NetworkPolicySpecFluentImpl.this.setToIngress(index,builder.build());
    }
    public N endIngress() {
      return and();
    }
    
  }
  class PodSelectorNestedImpl<N> extends V1LabelSelectorFluentImpl<V1NetworkPolicySpecFluent.PodSelectorNested<N>> implements V1NetworkPolicySpecFluent.PodSelectorNested<N>,Nested<N>{
    PodSelectorNestedImpl(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
    PodSelectorNestedImpl() {
      this.builder = new V1LabelSelectorBuilder(this);
    }
    V1LabelSelectorBuilder builder;
    public N and() {
      return (N) V1NetworkPolicySpecFluentImpl.this.withPodSelector(builder.build());
    }
    public N endPodSelector() {
      return and();
    }
    
  }
  
}