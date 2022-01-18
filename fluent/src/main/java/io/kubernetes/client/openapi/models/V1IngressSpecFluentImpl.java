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
public class V1IngressSpecFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1IngressSpecFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1IngressSpecFluent<A> {
  public V1IngressSpecFluentImpl() {}

  public V1IngressSpecFluentImpl(io.kubernetes.client.openapi.models.V1IngressSpec instance) {
    this.withDefaultBackend(instance.getDefaultBackend());

    this.withIngressClassName(instance.getIngressClassName());

    this.withRules(instance.getRules());

    this.withTls(instance.getTls());
  }

  private io.kubernetes.client.openapi.models.V1IngressBackendBuilder defaultBackend;
  private java.lang.String ingressClassName;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1IngressRuleBuilder> rules;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1IngressTLSBuilder> tls;

  /**
   * This method has been deprecated, please use method buildDefaultBackend instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1IngressBackend getDefaultBackend() {
    return this.defaultBackend != null ? this.defaultBackend.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1IngressBackend buildDefaultBackend() {
    return this.defaultBackend != null ? this.defaultBackend.build() : null;
  }

  public A withDefaultBackend(io.kubernetes.client.openapi.models.V1IngressBackend defaultBackend) {
    _visitables.get("defaultBackend").remove(this.defaultBackend);
    if (defaultBackend != null) {
      this.defaultBackend =
          new io.kubernetes.client.openapi.models.V1IngressBackendBuilder(defaultBackend);
      _visitables.get("defaultBackend").add(this.defaultBackend);
    }
    return (A) this;
  }

  public java.lang.Boolean hasDefaultBackend() {
    return this.defaultBackend != null;
  }

  public io.kubernetes.client.openapi.models.V1IngressSpecFluent.DefaultBackendNested<A>
      withNewDefaultBackend() {
    return new io.kubernetes.client.openapi.models.V1IngressSpecFluentImpl
        .DefaultBackendNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1IngressSpecFluent.DefaultBackendNested<A>
      withNewDefaultBackendLike(io.kubernetes.client.openapi.models.V1IngressBackend item) {
    return new io.kubernetes.client.openapi.models.V1IngressSpecFluentImpl.DefaultBackendNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1IngressSpecFluent.DefaultBackendNested<A>
      editDefaultBackend() {
    return withNewDefaultBackendLike(getDefaultBackend());
  }

  public io.kubernetes.client.openapi.models.V1IngressSpecFluent.DefaultBackendNested<A>
      editOrNewDefaultBackend() {
    return withNewDefaultBackendLike(
        getDefaultBackend() != null
            ? getDefaultBackend()
            : new io.kubernetes.client.openapi.models.V1IngressBackendBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1IngressSpecFluent.DefaultBackendNested<A>
      editOrNewDefaultBackendLike(io.kubernetes.client.openapi.models.V1IngressBackend item) {
    return withNewDefaultBackendLike(getDefaultBackend() != null ? getDefaultBackend() : item);
  }

  public java.lang.String getIngressClassName() {
    return this.ingressClassName;
  }

  public A withIngressClassName(java.lang.String ingressClassName) {
    this.ingressClassName = ingressClassName;
    return (A) this;
  }

  public java.lang.Boolean hasIngressClassName() {
    return this.ingressClassName != null;
  }

  /** Method is deprecated. use withIngressClassName instead. */
  @java.lang.Deprecated
  public A withNewIngressClassName(java.lang.String original) {
    return (A) withIngressClassName(new String(original));
  }

  public A addToRules(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1IngressRule item) {
    if (this.rules == null) {
      this.rules =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1IngressRuleBuilder>();
    }
    io.kubernetes.client.openapi.models.V1IngressRuleBuilder builder =
        new io.kubernetes.client.openapi.models.V1IngressRuleBuilder(item);
    _visitables.get("rules").add(index >= 0 ? index : _visitables.get("rules").size(), builder);
    this.rules.add(index >= 0 ? index : rules.size(), builder);
    return (A) this;
  }

  public A setToRules(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1IngressRule item) {
    if (this.rules == null) {
      this.rules =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1IngressRuleBuilder>();
    }
    io.kubernetes.client.openapi.models.V1IngressRuleBuilder builder =
        new io.kubernetes.client.openapi.models.V1IngressRuleBuilder(item);
    if (index < 0 || index >= _visitables.get("rules").size()) {
      _visitables.get("rules").add(builder);
    } else {
      _visitables.get("rules").set(index, builder);
    }
    if (index < 0 || index >= rules.size()) {
      rules.add(builder);
    } else {
      rules.set(index, builder);
    }
    return (A) this;
  }

  public A addToRules(io.kubernetes.client.openapi.models.V1IngressRule... items) {
    if (this.rules == null) {
      this.rules =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1IngressRuleBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1IngressRule item : items) {
      io.kubernetes.client.openapi.models.V1IngressRuleBuilder builder =
          new io.kubernetes.client.openapi.models.V1IngressRuleBuilder(item);
      _visitables.get("rules").add(builder);
      this.rules.add(builder);
    }
    return (A) this;
  }

  public A addAllToRules(
      java.util.Collection<io.kubernetes.client.openapi.models.V1IngressRule> items) {
    if (this.rules == null) {
      this.rules =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1IngressRuleBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1IngressRule item : items) {
      io.kubernetes.client.openapi.models.V1IngressRuleBuilder builder =
          new io.kubernetes.client.openapi.models.V1IngressRuleBuilder(item);
      _visitables.get("rules").add(builder);
      this.rules.add(builder);
    }
    return (A) this;
  }

  public A removeFromRules(io.kubernetes.client.openapi.models.V1IngressRule... items) {
    for (io.kubernetes.client.openapi.models.V1IngressRule item : items) {
      io.kubernetes.client.openapi.models.V1IngressRuleBuilder builder =
          new io.kubernetes.client.openapi.models.V1IngressRuleBuilder(item);
      _visitables.get("rules").remove(builder);
      if (this.rules != null) {
        this.rules.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromRules(
      java.util.Collection<io.kubernetes.client.openapi.models.V1IngressRule> items) {
    for (io.kubernetes.client.openapi.models.V1IngressRule item : items) {
      io.kubernetes.client.openapi.models.V1IngressRuleBuilder builder =
          new io.kubernetes.client.openapi.models.V1IngressRuleBuilder(item);
      _visitables.get("rules").remove(builder);
      if (this.rules != null) {
        this.rules.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromRules(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1IngressRuleBuilder>
          predicate) {
    if (rules == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1IngressRuleBuilder> each =
        rules.iterator();
    final List visitables = _visitables.get("rules");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1IngressRuleBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildRules instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1IngressRule> getRules() {
    return rules != null ? build(rules) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1IngressRule> buildRules() {
    return rules != null ? build(rules) : null;
  }

  public io.kubernetes.client.openapi.models.V1IngressRule buildRule(java.lang.Integer index) {
    return this.rules.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1IngressRule buildFirstRule() {
    return this.rules.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1IngressRule buildLastRule() {
    return this.rules.get(rules.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1IngressRule buildMatchingRule(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1IngressRuleBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1IngressRuleBuilder item : rules) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingRule(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1IngressRuleBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1IngressRuleBuilder item : rules) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withRules(java.util.List<io.kubernetes.client.openapi.models.V1IngressRule> rules) {
    if (this.rules != null) {
      _visitables.get("rules").removeAll(this.rules);
    }
    if (rules != null) {
      this.rules = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1IngressRule item : rules) {
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
    }
    if (rules != null) {
      for (io.kubernetes.client.openapi.models.V1IngressRule item : rules) {
        this.addToRules(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasRules() {
    return rules != null && !rules.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1IngressSpecFluent.RulesNested<A> addNewRule() {
    return new io.kubernetes.client.openapi.models.V1IngressSpecFluentImpl.RulesNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1IngressSpecFluent.RulesNested<A> addNewRuleLike(
      io.kubernetes.client.openapi.models.V1IngressRule item) {
    return new io.kubernetes.client.openapi.models.V1IngressSpecFluentImpl.RulesNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1IngressSpecFluent.RulesNested<A> setNewRuleLike(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1IngressRule item) {
    return new io.kubernetes.client.openapi.models.V1IngressSpecFluentImpl.RulesNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1IngressSpecFluent.RulesNested<A> editRule(
      java.lang.Integer index) {
    if (rules.size() <= index) throw new RuntimeException("Can't edit rules. Index exceeds size.");
    return setNewRuleLike(index, buildRule(index));
  }

  public io.kubernetes.client.openapi.models.V1IngressSpecFluent.RulesNested<A> editFirstRule() {
    if (rules.size() == 0) throw new RuntimeException("Can't edit first rules. The list is empty.");
    return setNewRuleLike(0, buildRule(0));
  }

  public io.kubernetes.client.openapi.models.V1IngressSpecFluent.RulesNested<A> editLastRule() {
    int index = rules.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last rules. The list is empty.");
    return setNewRuleLike(index, buildRule(index));
  }

  public io.kubernetes.client.openapi.models.V1IngressSpecFluent.RulesNested<A> editMatchingRule(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1IngressRuleBuilder>
          predicate) {
    int index = -1;
    for (int i = 0; i < rules.size(); i++) {
      if (predicate.test(rules.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching rules. No match found.");
    return setNewRuleLike(index, buildRule(index));
  }

  public A addToTls(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1IngressTLS item) {
    if (this.tls == null) {
      this.tls = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1IngressTLSBuilder>();
    }
    io.kubernetes.client.openapi.models.V1IngressTLSBuilder builder =
        new io.kubernetes.client.openapi.models.V1IngressTLSBuilder(item);
    _visitables.get("tls").add(index >= 0 ? index : _visitables.get("tls").size(), builder);
    this.tls.add(index >= 0 ? index : tls.size(), builder);
    return (A) this;
  }

  public A setToTls(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1IngressTLS item) {
    if (this.tls == null) {
      this.tls = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1IngressTLSBuilder>();
    }
    io.kubernetes.client.openapi.models.V1IngressTLSBuilder builder =
        new io.kubernetes.client.openapi.models.V1IngressTLSBuilder(item);
    if (index < 0 || index >= _visitables.get("tls").size()) {
      _visitables.get("tls").add(builder);
    } else {
      _visitables.get("tls").set(index, builder);
    }
    if (index < 0 || index >= tls.size()) {
      tls.add(builder);
    } else {
      tls.set(index, builder);
    }
    return (A) this;
  }

  public A addToTls(io.kubernetes.client.openapi.models.V1IngressTLS... items) {
    if (this.tls == null) {
      this.tls = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1IngressTLSBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1IngressTLS item : items) {
      io.kubernetes.client.openapi.models.V1IngressTLSBuilder builder =
          new io.kubernetes.client.openapi.models.V1IngressTLSBuilder(item);
      _visitables.get("tls").add(builder);
      this.tls.add(builder);
    }
    return (A) this;
  }

  public A addAllToTls(
      java.util.Collection<io.kubernetes.client.openapi.models.V1IngressTLS> items) {
    if (this.tls == null) {
      this.tls = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1IngressTLSBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1IngressTLS item : items) {
      io.kubernetes.client.openapi.models.V1IngressTLSBuilder builder =
          new io.kubernetes.client.openapi.models.V1IngressTLSBuilder(item);
      _visitables.get("tls").add(builder);
      this.tls.add(builder);
    }
    return (A) this;
  }

  public A removeFromTls(io.kubernetes.client.openapi.models.V1IngressTLS... items) {
    for (io.kubernetes.client.openapi.models.V1IngressTLS item : items) {
      io.kubernetes.client.openapi.models.V1IngressTLSBuilder builder =
          new io.kubernetes.client.openapi.models.V1IngressTLSBuilder(item);
      _visitables.get("tls").remove(builder);
      if (this.tls != null) {
        this.tls.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromTls(
      java.util.Collection<io.kubernetes.client.openapi.models.V1IngressTLS> items) {
    for (io.kubernetes.client.openapi.models.V1IngressTLS item : items) {
      io.kubernetes.client.openapi.models.V1IngressTLSBuilder builder =
          new io.kubernetes.client.openapi.models.V1IngressTLSBuilder(item);
      _visitables.get("tls").remove(builder);
      if (this.tls != null) {
        this.tls.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromTls(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1IngressTLSBuilder>
          predicate) {
    if (tls == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1IngressTLSBuilder> each = tls.iterator();
    final List visitables = _visitables.get("tls");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1IngressTLSBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildTls instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1IngressTLS> getTls() {
    return tls != null ? build(tls) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1IngressTLS> buildTls() {
    return tls != null ? build(tls) : null;
  }

  public io.kubernetes.client.openapi.models.V1IngressTLS buildTl(java.lang.Integer index) {
    return this.tls.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1IngressTLS buildFirstTl() {
    return this.tls.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1IngressTLS buildLastTl() {
    return this.tls.get(tls.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1IngressTLS buildMatchingTl(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1IngressTLSBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1IngressTLSBuilder item : tls) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingTl(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1IngressTLSBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1IngressTLSBuilder item : tls) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withTls(java.util.List<io.kubernetes.client.openapi.models.V1IngressTLS> tls) {
    if (this.tls != null) {
      _visitables.get("tls").removeAll(this.tls);
    }
    if (tls != null) {
      this.tls = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1IngressTLS item : tls) {
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
    }
    if (tls != null) {
      for (io.kubernetes.client.openapi.models.V1IngressTLS item : tls) {
        this.addToTls(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasTls() {
    return tls != null && !tls.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1IngressSpecFluent.TlsNested<A> addNewTl() {
    return new io.kubernetes.client.openapi.models.V1IngressSpecFluentImpl.TlsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1IngressSpecFluent.TlsNested<A> addNewTlLike(
      io.kubernetes.client.openapi.models.V1IngressTLS item) {
    return new io.kubernetes.client.openapi.models.V1IngressSpecFluentImpl.TlsNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1IngressSpecFluent.TlsNested<A> setNewTlLike(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1IngressTLS item) {
    return new io.kubernetes.client.openapi.models.V1IngressSpecFluentImpl.TlsNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1IngressSpecFluent.TlsNested<A> editTl(
      java.lang.Integer index) {
    if (tls.size() <= index) throw new RuntimeException("Can't edit tls. Index exceeds size.");
    return setNewTlLike(index, buildTl(index));
  }

  public io.kubernetes.client.openapi.models.V1IngressSpecFluent.TlsNested<A> editFirstTl() {
    if (tls.size() == 0) throw new RuntimeException("Can't edit first tls. The list is empty.");
    return setNewTlLike(0, buildTl(0));
  }

  public io.kubernetes.client.openapi.models.V1IngressSpecFluent.TlsNested<A> editLastTl() {
    int index = tls.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last tls. The list is empty.");
    return setNewTlLike(index, buildTl(index));
  }

  public io.kubernetes.client.openapi.models.V1IngressSpecFluent.TlsNested<A> editMatchingTl(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1IngressTLSBuilder>
          predicate) {
    int index = -1;
    for (int i = 0; i < tls.size(); i++) {
      if (predicate.test(tls.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching tls. No match found.");
    return setNewTlLike(index, buildTl(index));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1IngressSpecFluentImpl that = (V1IngressSpecFluentImpl) o;
    if (defaultBackend != null
        ? !defaultBackend.equals(that.defaultBackend)
        : that.defaultBackend != null) return false;
    if (ingressClassName != null
        ? !ingressClassName.equals(that.ingressClassName)
        : that.ingressClassName != null) return false;
    if (rules != null ? !rules.equals(that.rules) : that.rules != null) return false;
    if (tls != null ? !tls.equals(that.tls) : that.tls != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(defaultBackend, ingressClassName, rules, tls, super.hashCode());
  }

  public class DefaultBackendNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1IngressBackendFluentImpl<
          io.kubernetes.client.openapi.models.V1IngressSpecFluent.DefaultBackendNested<N>>
      implements io.kubernetes.client.openapi.models.V1IngressSpecFluent.DefaultBackendNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    DefaultBackendNestedImpl(io.kubernetes.client.openapi.models.V1IngressBackend item) {
      this.builder = new io.kubernetes.client.openapi.models.V1IngressBackendBuilder(this, item);
    }

    DefaultBackendNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1IngressBackendBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1IngressBackendBuilder builder;

    public N and() {
      return (N) V1IngressSpecFluentImpl.this.withDefaultBackend(builder.build());
    }

    public N endDefaultBackend() {
      return and();
    }
  }

  public class RulesNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1IngressRuleFluentImpl<
          io.kubernetes.client.openapi.models.V1IngressSpecFluent.RulesNested<N>>
      implements io.kubernetes.client.openapi.models.V1IngressSpecFluent.RulesNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    RulesNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1IngressRule item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1IngressRuleBuilder(this, item);
    }

    RulesNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1IngressRuleBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1IngressRuleBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1IngressSpecFluentImpl.this.setToRules(index, builder.build());
    }

    public N endRule() {
      return and();
    }
  }

  public class TlsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1IngressTLSFluentImpl<
          io.kubernetes.client.openapi.models.V1IngressSpecFluent.TlsNested<N>>
      implements io.kubernetes.client.openapi.models.V1IngressSpecFluent.TlsNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    TlsNestedImpl(java.lang.Integer index, io.kubernetes.client.openapi.models.V1IngressTLS item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1IngressTLSBuilder(this, item);
    }

    TlsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1IngressTLSBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1IngressTLSBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1IngressSpecFluentImpl.this.setToTls(index, builder.build());
    }

    public N endTl() {
      return and();
    }
  }
}
