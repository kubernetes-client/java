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
public class V1beta2FlowSchemaSpecFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent<A> {
  public V1beta2FlowSchemaSpecFluentImpl() {}

  public V1beta2FlowSchemaSpecFluentImpl(
      io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpec instance) {
    this.withDistinguisherMethod(instance.getDistinguisherMethod());

    this.withMatchingPrecedence(instance.getMatchingPrecedence());

    this.withPriorityLevelConfiguration(instance.getPriorityLevelConfiguration());

    this.withRules(instance.getRules());
  }

  private io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethodBuilder
      distinguisherMethod;
  private java.lang.Integer matchingPrecedence;
  private io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReferenceBuilder
      priorityLevelConfiguration;
  private java.util.ArrayList<
          io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsBuilder>
      rules;

  /**
   * This method has been deprecated, please use method buildDistinguisherMethod instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethod
      getDistinguisherMethod() {
    return this.distinguisherMethod != null ? this.distinguisherMethod.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethod
      buildDistinguisherMethod() {
    return this.distinguisherMethod != null ? this.distinguisherMethod.build() : null;
  }

  public A withDistinguisherMethod(
      io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethod distinguisherMethod) {
    _visitables.get("distinguisherMethod").remove(this.distinguisherMethod);
    if (distinguisherMethod != null) {
      this.distinguisherMethod =
          new io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethodBuilder(
              distinguisherMethod);
      _visitables.get("distinguisherMethod").add(this.distinguisherMethod);
    }
    return (A) this;
  }

  public java.lang.Boolean hasDistinguisherMethod() {
    return this.distinguisherMethod != null;
  }

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent.DistinguisherMethodNested<
          A>
      withNewDistinguisherMethod() {
    return new io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluentImpl
        .DistinguisherMethodNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent.DistinguisherMethodNested<
          A>
      withNewDistinguisherMethodLike(
          io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethod item) {
    return new io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluentImpl
        .DistinguisherMethodNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent.DistinguisherMethodNested<
          A>
      editDistinguisherMethod() {
    return withNewDistinguisherMethodLike(getDistinguisherMethod());
  }

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent.DistinguisherMethodNested<
          A>
      editOrNewDistinguisherMethod() {
    return withNewDistinguisherMethodLike(
        getDistinguisherMethod() != null
            ? getDistinguisherMethod()
            : new io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethodBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent.DistinguisherMethodNested<
          A>
      editOrNewDistinguisherMethodLike(
          io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethod item) {
    return withNewDistinguisherMethodLike(
        getDistinguisherMethod() != null ? getDistinguisherMethod() : item);
  }

  public java.lang.Integer getMatchingPrecedence() {
    return this.matchingPrecedence;
  }

  public A withMatchingPrecedence(java.lang.Integer matchingPrecedence) {
    this.matchingPrecedence = matchingPrecedence;
    return (A) this;
  }

  public java.lang.Boolean hasMatchingPrecedence() {
    return this.matchingPrecedence != null;
  }

  /**
   * This method has been deprecated, please use method buildPriorityLevelConfiguration instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReference
      getPriorityLevelConfiguration() {
    return this.priorityLevelConfiguration != null ? this.priorityLevelConfiguration.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReference
      buildPriorityLevelConfiguration() {
    return this.priorityLevelConfiguration != null ? this.priorityLevelConfiguration.build() : null;
  }

  public A withPriorityLevelConfiguration(
      io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReference
          priorityLevelConfiguration) {
    _visitables.get("priorityLevelConfiguration").remove(this.priorityLevelConfiguration);
    if (priorityLevelConfiguration != null) {
      this.priorityLevelConfiguration =
          new io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReferenceBuilder(
              priorityLevelConfiguration);
      _visitables.get("priorityLevelConfiguration").add(this.priorityLevelConfiguration);
    }
    return (A) this;
  }

  public java.lang.Boolean hasPriorityLevelConfiguration() {
    return this.priorityLevelConfiguration != null;
  }

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent
              .PriorityLevelConfigurationNested<
          A>
      withNewPriorityLevelConfiguration() {
    return new io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluentImpl
        .PriorityLevelConfigurationNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent
              .PriorityLevelConfigurationNested<
          A>
      withNewPriorityLevelConfigurationLike(
          io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReference item) {
    return new io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluentImpl
        .PriorityLevelConfigurationNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent
              .PriorityLevelConfigurationNested<
          A>
      editPriorityLevelConfiguration() {
    return withNewPriorityLevelConfigurationLike(getPriorityLevelConfiguration());
  }

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent
              .PriorityLevelConfigurationNested<
          A>
      editOrNewPriorityLevelConfiguration() {
    return withNewPriorityLevelConfigurationLike(
        getPriorityLevelConfiguration() != null
            ? getPriorityLevelConfiguration()
            : new io.kubernetes.client.openapi.models
                    .V1beta2PriorityLevelConfigurationReferenceBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent
              .PriorityLevelConfigurationNested<
          A>
      editOrNewPriorityLevelConfigurationLike(
          io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReference item) {
    return withNewPriorityLevelConfigurationLike(
        getPriorityLevelConfiguration() != null ? getPriorityLevelConfiguration() : item);
  }

  public A addToRules(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects item) {
    if (this.rules == null) {
      this.rules =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsBuilder>();
    }
    io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsBuilder builder =
        new io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsBuilder(item);
    _visitables.get("rules").add(index >= 0 ? index : _visitables.get("rules").size(), builder);
    this.rules.add(index >= 0 ? index : rules.size(), builder);
    return (A) this;
  }

  public A setToRules(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects item) {
    if (this.rules == null) {
      this.rules =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsBuilder>();
    }
    io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsBuilder builder =
        new io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsBuilder(item);
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

  public A addToRules(io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects... items) {
    if (this.rules == null) {
      this.rules =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects item : items) {
      io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsBuilder(item);
      _visitables.get("rules").add(builder);
      this.rules.add(builder);
    }
    return (A) this;
  }

  public A addAllToRules(
      java.util.Collection<io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects>
          items) {
    if (this.rules == null) {
      this.rules =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects item : items) {
      io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsBuilder(item);
      _visitables.get("rules").add(builder);
      this.rules.add(builder);
    }
    return (A) this;
  }

  public A removeFromRules(
      io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects... items) {
    for (io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects item : items) {
      io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsBuilder(item);
      _visitables.get("rules").remove(builder);
      if (this.rules != null) {
        this.rules.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromRules(
      java.util.Collection<io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects>
          items) {
    for (io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects item : items) {
      io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsBuilder(item);
      _visitables.get("rules").remove(builder);
      if (this.rules != null) {
        this.rules.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromRules(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsBuilder>
          predicate) {
    if (rules == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsBuilder> each =
        rules.iterator();
    final List visitables = _visitables.get("rules");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsBuilder builder =
          each.next();
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
  public java.util.List<io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects>
      getRules() {
    return rules != null ? build(rules) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects>
      buildRules() {
    return rules != null ? build(rules) : null;
  }

  public io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects buildRule(
      java.lang.Integer index) {
    return this.rules.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects buildFirstRule() {
    return this.rules.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects buildLastRule() {
    return this.rules.get(rules.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects buildMatchingRule(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsBuilder item : rules) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingRule(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsBuilder item : rules) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withRules(
      java.util.List<io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects> rules) {
    if (this.rules != null) {
      _visitables.get("rules").removeAll(this.rules);
    }
    if (rules != null) {
      this.rules = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects item : rules) {
        this.addToRules(item);
      }
    } else {
      this.rules = null;
    }
    return (A) this;
  }

  public A withRules(io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects... rules) {
    if (this.rules != null) {
      this.rules.clear();
    }
    if (rules != null) {
      for (io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects item : rules) {
        this.addToRules(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasRules() {
    return rules != null && !rules.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent.RulesNested<A>
      addNewRule() {
    return new io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluentImpl
        .RulesNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent.RulesNested<A>
      addNewRuleLike(io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects item) {
    return new io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluentImpl.RulesNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent.RulesNested<A>
      setNewRuleLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects item) {
    return new io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluentImpl.RulesNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent.RulesNested<A> editRule(
      java.lang.Integer index) {
    if (rules.size() <= index) throw new RuntimeException("Can't edit rules. Index exceeds size.");
    return setNewRuleLike(index, buildRule(index));
  }

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent.RulesNested<A>
      editFirstRule() {
    if (rules.size() == 0) throw new RuntimeException("Can't edit first rules. The list is empty.");
    return setNewRuleLike(0, buildRule(0));
  }

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent.RulesNested<A>
      editLastRule() {
    int index = rules.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last rules. The list is empty.");
    return setNewRuleLike(index, buildRule(index));
  }

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent.RulesNested<A>
      editMatchingRule(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsBuilder>
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

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta2FlowSchemaSpecFluentImpl that = (V1beta2FlowSchemaSpecFluentImpl) o;
    if (distinguisherMethod != null
        ? !distinguisherMethod.equals(that.distinguisherMethod)
        : that.distinguisherMethod != null) return false;
    if (matchingPrecedence != null
        ? !matchingPrecedence.equals(that.matchingPrecedence)
        : that.matchingPrecedence != null) return false;
    if (priorityLevelConfiguration != null
        ? !priorityLevelConfiguration.equals(that.priorityLevelConfiguration)
        : that.priorityLevelConfiguration != null) return false;
    if (rules != null ? !rules.equals(that.rules) : that.rules != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        distinguisherMethod,
        matchingPrecedence,
        priorityLevelConfiguration,
        rules,
        super.hashCode());
  }

  public class DistinguisherMethodNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethodFluentImpl<
          io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent.DistinguisherMethodNested<
              N>>
      implements io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent
                  .DistinguisherMethodNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    DistinguisherMethodNestedImpl(
        io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethod item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethodBuilder(this, item);
    }

    DistinguisherMethodNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethodBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethodBuilder builder;

    public N and() {
      return (N) V1beta2FlowSchemaSpecFluentImpl.this.withDistinguisherMethod(builder.build());
    }

    public N endDistinguisherMethod() {
      return and();
    }
  }

  public class PriorityLevelConfigurationNestedImpl<N>
      extends io.kubernetes.client.openapi.models
              .V1beta2PriorityLevelConfigurationReferenceFluentImpl<
          io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent
                  .PriorityLevelConfigurationNested<
              N>>
      implements io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent
                  .PriorityLevelConfigurationNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    PriorityLevelConfigurationNestedImpl(
        io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReference item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReferenceBuilder(
              this, item);
    }

    PriorityLevelConfigurationNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReferenceBuilder(
              this);
    }

    io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReferenceBuilder builder;

    public N and() {
      return (N)
          V1beta2FlowSchemaSpecFluentImpl.this.withPriorityLevelConfiguration(builder.build());
    }

    public N endPriorityLevelConfiguration() {
      return and();
    }
  }

  public class RulesNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluentImpl<
          io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent.RulesNested<N>>
      implements io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent.RulesNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    RulesNestedImpl(
        java.lang.Integer index,
        io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects item) {
      this.index = index;
      this.builder =
          new io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsBuilder(this, item);
    }

    RulesNestedImpl() {
      this.index = -1;
      this.builder =
          new io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1beta2FlowSchemaSpecFluentImpl.this.setToRules(index, builder.build());
    }

    public N endRule() {
      return and();
    }
  }
}
