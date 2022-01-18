/*
Copyright 2022 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import java.util.Iterator;
import java.util.List;

/** Generated */
public class V1NetworkPolicySpecFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent<A> {
  public V1NetworkPolicySpecFluentImpl() {}

  public V1NetworkPolicySpecFluentImpl(
      io.kubernetes.client.openapi.models.V1NetworkPolicySpec instance) {
    this.withEgress(instance.getEgress());

    this.withIngress(instance.getIngress());

    this.withPodSelector(instance.getPodSelector());

    this.withPolicyTypes(instance.getPolicyTypes());
  }

  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleBuilder>
      egress;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleBuilder>
      ingress;
  private io.kubernetes.client.openapi.models.V1LabelSelectorBuilder podSelector;
  private java.util.List<java.lang.String> policyTypes;

  public A addToEgress(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule item) {
    if (this.egress == null) {
      this.egress =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleBuilder>();
    }
    io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleBuilder builder =
        new io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleBuilder(item);
    _visitables.get("egress").add(index >= 0 ? index : _visitables.get("egress").size(), builder);
    this.egress.add(index >= 0 ? index : egress.size(), builder);
    return (A) this;
  }

  public A setToEgress(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule item) {
    if (this.egress == null) {
      this.egress =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleBuilder>();
    }
    io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleBuilder builder =
        new io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleBuilder(item);
    if (index < 0 || index >= _visitables.get("egress").size()) {
      _visitables.get("egress").add(builder);
    } else {
      _visitables.get("egress").set(index, builder);
    }
    if (index < 0 || index >= egress.size()) {
      egress.add(builder);
    } else {
      egress.set(index, builder);
    }
    return (A) this;
  }

  public A addToEgress(io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule... items) {
    if (this.egress == null) {
      this.egress =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule item : items) {
      io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleBuilder builder =
          new io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleBuilder(item);
      _visitables.get("egress").add(builder);
      this.egress.add(builder);
    }
    return (A) this;
  }

  public A addAllToEgress(
      java.util.Collection<io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule> items) {
    if (this.egress == null) {
      this.egress =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule item : items) {
      io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleBuilder builder =
          new io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleBuilder(item);
      _visitables.get("egress").add(builder);
      this.egress.add(builder);
    }
    return (A) this;
  }

  public A removeFromEgress(
      io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule... items) {
    for (io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule item : items) {
      io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleBuilder builder =
          new io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleBuilder(item);
      _visitables.get("egress").remove(builder);
      if (this.egress != null) {
        this.egress.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromEgress(
      java.util.Collection<io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule> items) {
    for (io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule item : items) {
      io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleBuilder builder =
          new io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleBuilder(item);
      _visitables.get("egress").remove(builder);
      if (this.egress != null) {
        this.egress.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromEgress(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleBuilder>
          predicate) {
    if (egress == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleBuilder> each =
        egress.iterator();
    final List visitables = _visitables.get("egress");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildEgress instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule> getEgress() {
    return egress != null ? build(egress) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule>
      buildEgress() {
    return egress != null ? build(egress) : null;
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule buildEgress(
      java.lang.Integer index) {
    return this.egress.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule buildFirstEgress() {
    return this.egress.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule buildLastEgress() {
    return this.egress.get(egress.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule buildMatchingEgress(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleBuilder item : egress) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingEgress(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleBuilder item : egress) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withEgress(
      java.util.List<io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule> egress) {
    if (this.egress != null) {
      _visitables.get("egress").removeAll(this.egress);
    }
    if (egress != null) {
      this.egress = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule item : egress) {
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
    }
    if (egress != null) {
      for (io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule item : egress) {
        this.addToEgress(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasEgress() {
    return egress != null && !egress.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent.EgressNested<A>
      addNewEgress() {
    return new io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluentImpl.EgressNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent.EgressNested<A>
      addNewEgressLike(io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule item) {
    return new io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluentImpl.EgressNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent.EgressNested<A>
      setNewEgressLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule item) {
    return new io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluentImpl.EgressNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent.EgressNested<A> editEgress(
      java.lang.Integer index) {
    if (egress.size() <= index)
      throw new RuntimeException("Can't edit egress. Index exceeds size.");
    return setNewEgressLike(index, buildEgress(index));
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent.EgressNested<A>
      editFirstEgress() {
    if (egress.size() == 0)
      throw new RuntimeException("Can't edit first egress. The list is empty.");
    return setNewEgressLike(0, buildEgress(0));
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent.EgressNested<A>
      editLastEgress() {
    int index = egress.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last egress. The list is empty.");
    return setNewEgressLike(index, buildEgress(index));
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent.EgressNested<A>
      editMatchingEgress(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < egress.size(); i++) {
      if (predicate.test(egress.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching egress. No match found.");
    return setNewEgressLike(index, buildEgress(index));
  }

  public A addToIngress(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule item) {
    if (this.ingress == null) {
      this.ingress =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleBuilder>();
    }
    io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleBuilder builder =
        new io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleBuilder(item);
    _visitables.get("ingress").add(index >= 0 ? index : _visitables.get("ingress").size(), builder);
    this.ingress.add(index >= 0 ? index : ingress.size(), builder);
    return (A) this;
  }

  public A setToIngress(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule item) {
    if (this.ingress == null) {
      this.ingress =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleBuilder>();
    }
    io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleBuilder builder =
        new io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleBuilder(item);
    if (index < 0 || index >= _visitables.get("ingress").size()) {
      _visitables.get("ingress").add(builder);
    } else {
      _visitables.get("ingress").set(index, builder);
    }
    if (index < 0 || index >= ingress.size()) {
      ingress.add(builder);
    } else {
      ingress.set(index, builder);
    }
    return (A) this;
  }

  public A addToIngress(io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule... items) {
    if (this.ingress == null) {
      this.ingress =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule item : items) {
      io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleBuilder builder =
          new io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleBuilder(item);
      _visitables.get("ingress").add(builder);
      this.ingress.add(builder);
    }
    return (A) this;
  }

  public A addAllToIngress(
      java.util.Collection<io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule> items) {
    if (this.ingress == null) {
      this.ingress =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule item : items) {
      io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleBuilder builder =
          new io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleBuilder(item);
      _visitables.get("ingress").add(builder);
      this.ingress.add(builder);
    }
    return (A) this;
  }

  public A removeFromIngress(
      io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule... items) {
    for (io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule item : items) {
      io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleBuilder builder =
          new io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleBuilder(item);
      _visitables.get("ingress").remove(builder);
      if (this.ingress != null) {
        this.ingress.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromIngress(
      java.util.Collection<io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule> items) {
    for (io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule item : items) {
      io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleBuilder builder =
          new io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleBuilder(item);
      _visitables.get("ingress").remove(builder);
      if (this.ingress != null) {
        this.ingress.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromIngress(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleBuilder>
          predicate) {
    if (ingress == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleBuilder> each =
        ingress.iterator();
    final List visitables = _visitables.get("ingress");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildIngress instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule>
      getIngress() {
    return ingress != null ? build(ingress) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule>
      buildIngress() {
    return ingress != null ? build(ingress) : null;
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule buildIngress(
      java.lang.Integer index) {
    return this.ingress.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule buildFirstIngress() {
    return this.ingress.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule buildLastIngress() {
    return this.ingress.get(ingress.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule buildMatchingIngress(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleBuilder item : ingress) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingIngress(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleBuilder item : ingress) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withIngress(
      java.util.List<io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule> ingress) {
    if (this.ingress != null) {
      _visitables.get("ingress").removeAll(this.ingress);
    }
    if (ingress != null) {
      this.ingress = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule item : ingress) {
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
    }
    if (ingress != null) {
      for (io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule item : ingress) {
        this.addToIngress(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasIngress() {
    return ingress != null && !ingress.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent.IngressNested<A>
      addNewIngress() {
    return new io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluentImpl
        .IngressNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent.IngressNested<A>
      addNewIngressLike(io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule item) {
    return new io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluentImpl.IngressNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent.IngressNested<A>
      setNewIngressLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule item) {
    return new io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluentImpl.IngressNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent.IngressNested<A> editIngress(
      java.lang.Integer index) {
    if (ingress.size() <= index)
      throw new RuntimeException("Can't edit ingress. Index exceeds size.");
    return setNewIngressLike(index, buildIngress(index));
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent.IngressNested<A>
      editFirstIngress() {
    if (ingress.size() == 0)
      throw new RuntimeException("Can't edit first ingress. The list is empty.");
    return setNewIngressLike(0, buildIngress(0));
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent.IngressNested<A>
      editLastIngress() {
    int index = ingress.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last ingress. The list is empty.");
    return setNewIngressLike(index, buildIngress(index));
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent.IngressNested<A>
      editMatchingIngress(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < ingress.size(); i++) {
      if (predicate.test(ingress.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching ingress. No match found.");
    return setNewIngressLike(index, buildIngress(index));
  }

  /**
   * This method has been deprecated, please use method buildPodSelector instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1LabelSelector getPodSelector() {
    return this.podSelector != null ? this.podSelector.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1LabelSelector buildPodSelector() {
    return this.podSelector != null ? this.podSelector.build() : null;
  }

  public A withPodSelector(io.kubernetes.client.openapi.models.V1LabelSelector podSelector) {
    _visitables.get("podSelector").remove(this.podSelector);
    if (podSelector != null) {
      this.podSelector =
          new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(podSelector);
      _visitables.get("podSelector").add(this.podSelector);
    }
    return (A) this;
  }

  public java.lang.Boolean hasPodSelector() {
    return this.podSelector != null;
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent.PodSelectorNested<A>
      withNewPodSelector() {
    return new io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluentImpl
        .PodSelectorNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent.PodSelectorNested<A>
      withNewPodSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return new io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluentImpl
        .PodSelectorNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent.PodSelectorNested<A>
      editPodSelector() {
    return withNewPodSelectorLike(getPodSelector());
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent.PodSelectorNested<A>
      editOrNewPodSelector() {
    return withNewPodSelectorLike(
        getPodSelector() != null
            ? getPodSelector()
            : new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent.PodSelectorNested<A>
      editOrNewPodSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return withNewPodSelectorLike(getPodSelector() != null ? getPodSelector() : item);
  }

  public A addToPolicyTypes(java.lang.Integer index, java.lang.String item) {
    if (this.policyTypes == null) {
      this.policyTypes = new java.util.ArrayList<java.lang.String>();
    }
    this.policyTypes.add(index, item);
    return (A) this;
  }

  public A setToPolicyTypes(java.lang.Integer index, java.lang.String item) {
    if (this.policyTypes == null) {
      this.policyTypes = new java.util.ArrayList<java.lang.String>();
    }
    this.policyTypes.set(index, item);
    return (A) this;
  }

  public A addToPolicyTypes(java.lang.String... items) {
    if (this.policyTypes == null) {
      this.policyTypes = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.policyTypes.add(item);
    }
    return (A) this;
  }

  public A addAllToPolicyTypes(java.util.Collection<java.lang.String> items) {
    if (this.policyTypes == null) {
      this.policyTypes = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.policyTypes.add(item);
    }
    return (A) this;
  }

  public A removeFromPolicyTypes(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.policyTypes != null) {
        this.policyTypes.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromPolicyTypes(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.policyTypes != null) {
        this.policyTypes.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getPolicyTypes() {
    return this.policyTypes;
  }

  public java.lang.String getPolicyType(java.lang.Integer index) {
    return this.policyTypes.get(index);
  }

  public java.lang.String getFirstPolicyType() {
    return this.policyTypes.get(0);
  }

  public java.lang.String getLastPolicyType() {
    return this.policyTypes.get(policyTypes.size() - 1);
  }

  public java.lang.String getMatchingPolicyType(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : policyTypes) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingPolicyType(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : policyTypes) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withPolicyTypes(java.util.List<java.lang.String> policyTypes) {
    if (policyTypes != null) {
      this.policyTypes = new java.util.ArrayList();
      for (java.lang.String item : policyTypes) {
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
    }
    if (policyTypes != null) {
      for (java.lang.String item : policyTypes) {
        this.addToPolicyTypes(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasPolicyTypes() {
    return policyTypes != null && !policyTypes.isEmpty();
  }

  public A addNewPolicyType(java.lang.String original) {
    return (A) addToPolicyTypes(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1NetworkPolicySpecFluentImpl that = (V1NetworkPolicySpecFluentImpl) o;
    if (egress != null ? !egress.equals(that.egress) : that.egress != null) return false;
    if (ingress != null ? !ingress.equals(that.ingress) : that.ingress != null) return false;
    if (podSelector != null ? !podSelector.equals(that.podSelector) : that.podSelector != null)
      return false;
    if (policyTypes != null ? !policyTypes.equals(that.policyTypes) : that.policyTypes != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(egress, ingress, podSelector, policyTypes, super.hashCode());
  }

  public class EgressNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluentImpl<
          io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent.EgressNested<N>>
      implements io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent.EgressNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    EgressNestedImpl(
        java.lang.Integer index,
        io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule item) {
      this.index = index;
      this.builder =
          new io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleBuilder(this, item);
    }

    EgressNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1NetworkPolicySpecFluentImpl.this.setToEgress(index, builder.build());
    }

    public N endEgress() {
      return and();
    }
  }

  public class IngressNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluentImpl<
          io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent.IngressNested<N>>
      implements io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent.IngressNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    IngressNestedImpl(
        java.lang.Integer index,
        io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule item) {
      this.index = index;
      this.builder =
          new io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleBuilder(this, item);
    }

    IngressNestedImpl() {
      this.index = -1;
      this.builder =
          new io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1NetworkPolicySpecFluentImpl.this.setToIngress(index, builder.build());
    }

    public N endIngress() {
      return and();
    }
  }

  public class PodSelectorNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1LabelSelectorFluentImpl<
          io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent.PodSelectorNested<N>>
      implements io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent.PodSelectorNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    PodSelectorNestedImpl(io.kubernetes.client.openapi.models.V1LabelSelector item) {
      this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this, item);
    }

    PodSelectorNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1LabelSelectorBuilder builder;

    public N and() {
      return (N) V1NetworkPolicySpecFluentImpl.this.withPodSelector(builder.build());
    }

    public N endPodSelector() {
      return and();
    }
  }
}
