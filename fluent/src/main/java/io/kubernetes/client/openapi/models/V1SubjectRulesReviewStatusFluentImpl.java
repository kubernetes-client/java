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
public class V1SubjectRulesReviewStatusFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent<A> {
  public V1SubjectRulesReviewStatusFluentImpl() {}

  public V1SubjectRulesReviewStatusFluentImpl(
      io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatus instance) {
    this.withEvaluationError(instance.getEvaluationError());

    this.withIncomplete(instance.getIncomplete());

    this.withNonResourceRules(instance.getNonResourceRules());

    this.withResourceRules(instance.getResourceRules());
  }

  private java.lang.String evaluationError;
  private java.lang.Boolean incomplete;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1NonResourceRuleBuilder>
      nonResourceRules;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1ResourceRuleBuilder>
      resourceRules;

  public java.lang.String getEvaluationError() {
    return this.evaluationError;
  }

  public A withEvaluationError(java.lang.String evaluationError) {
    this.evaluationError = evaluationError;
    return (A) this;
  }

  public java.lang.Boolean hasEvaluationError() {
    return this.evaluationError != null;
  }

  /** Method is deprecated. use withEvaluationError instead. */
  @java.lang.Deprecated
  public A withNewEvaluationError(java.lang.String original) {
    return (A) withEvaluationError(new String(original));
  }

  public java.lang.Boolean getIncomplete() {
    return this.incomplete;
  }

  public A withIncomplete(java.lang.Boolean incomplete) {
    this.incomplete = incomplete;
    return (A) this;
  }

  public java.lang.Boolean hasIncomplete() {
    return this.incomplete != null;
  }

  public A addToNonResourceRules(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1NonResourceRule item) {
    if (this.nonResourceRules == null) {
      this.nonResourceRules =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1NonResourceRuleBuilder>();
    }
    io.kubernetes.client.openapi.models.V1NonResourceRuleBuilder builder =
        new io.kubernetes.client.openapi.models.V1NonResourceRuleBuilder(item);
    _visitables
        .get("nonResourceRules")
        .add(index >= 0 ? index : _visitables.get("nonResourceRules").size(), builder);
    this.nonResourceRules.add(index >= 0 ? index : nonResourceRules.size(), builder);
    return (A) this;
  }

  public A setToNonResourceRules(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1NonResourceRule item) {
    if (this.nonResourceRules == null) {
      this.nonResourceRules =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1NonResourceRuleBuilder>();
    }
    io.kubernetes.client.openapi.models.V1NonResourceRuleBuilder builder =
        new io.kubernetes.client.openapi.models.V1NonResourceRuleBuilder(item);
    if (index < 0 || index >= _visitables.get("nonResourceRules").size()) {
      _visitables.get("nonResourceRules").add(builder);
    } else {
      _visitables.get("nonResourceRules").set(index, builder);
    }
    if (index < 0 || index >= nonResourceRules.size()) {
      nonResourceRules.add(builder);
    } else {
      nonResourceRules.set(index, builder);
    }
    return (A) this;
  }

  public A addToNonResourceRules(io.kubernetes.client.openapi.models.V1NonResourceRule... items) {
    if (this.nonResourceRules == null) {
      this.nonResourceRules =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1NonResourceRuleBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1NonResourceRule item : items) {
      io.kubernetes.client.openapi.models.V1NonResourceRuleBuilder builder =
          new io.kubernetes.client.openapi.models.V1NonResourceRuleBuilder(item);
      _visitables.get("nonResourceRules").add(builder);
      this.nonResourceRules.add(builder);
    }
    return (A) this;
  }

  public A addAllToNonResourceRules(
      java.util.Collection<io.kubernetes.client.openapi.models.V1NonResourceRule> items) {
    if (this.nonResourceRules == null) {
      this.nonResourceRules =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1NonResourceRuleBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1NonResourceRule item : items) {
      io.kubernetes.client.openapi.models.V1NonResourceRuleBuilder builder =
          new io.kubernetes.client.openapi.models.V1NonResourceRuleBuilder(item);
      _visitables.get("nonResourceRules").add(builder);
      this.nonResourceRules.add(builder);
    }
    return (A) this;
  }

  public A removeFromNonResourceRules(
      io.kubernetes.client.openapi.models.V1NonResourceRule... items) {
    for (io.kubernetes.client.openapi.models.V1NonResourceRule item : items) {
      io.kubernetes.client.openapi.models.V1NonResourceRuleBuilder builder =
          new io.kubernetes.client.openapi.models.V1NonResourceRuleBuilder(item);
      _visitables.get("nonResourceRules").remove(builder);
      if (this.nonResourceRules != null) {
        this.nonResourceRules.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromNonResourceRules(
      java.util.Collection<io.kubernetes.client.openapi.models.V1NonResourceRule> items) {
    for (io.kubernetes.client.openapi.models.V1NonResourceRule item : items) {
      io.kubernetes.client.openapi.models.V1NonResourceRuleBuilder builder =
          new io.kubernetes.client.openapi.models.V1NonResourceRuleBuilder(item);
      _visitables.get("nonResourceRules").remove(builder);
      if (this.nonResourceRules != null) {
        this.nonResourceRules.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromNonResourceRules(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NonResourceRuleBuilder>
          predicate) {
    if (nonResourceRules == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1NonResourceRuleBuilder> each =
        nonResourceRules.iterator();
    final List visitables = _visitables.get("nonResourceRules");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1NonResourceRuleBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildNonResourceRules instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1NonResourceRule>
      getNonResourceRules() {
    return nonResourceRules != null ? build(nonResourceRules) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1NonResourceRule>
      buildNonResourceRules() {
    return nonResourceRules != null ? build(nonResourceRules) : null;
  }

  public io.kubernetes.client.openapi.models.V1NonResourceRule buildNonResourceRule(
      java.lang.Integer index) {
    return this.nonResourceRules.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1NonResourceRule buildFirstNonResourceRule() {
    return this.nonResourceRules.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1NonResourceRule buildLastNonResourceRule() {
    return this.nonResourceRules.get(nonResourceRules.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1NonResourceRule buildMatchingNonResourceRule(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NonResourceRuleBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1NonResourceRuleBuilder item : nonResourceRules) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingNonResourceRule(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NonResourceRuleBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1NonResourceRuleBuilder item : nonResourceRules) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withNonResourceRules(
      java.util.List<io.kubernetes.client.openapi.models.V1NonResourceRule> nonResourceRules) {
    if (this.nonResourceRules != null) {
      _visitables.get("nonResourceRules").removeAll(this.nonResourceRules);
    }
    if (nonResourceRules != null) {
      this.nonResourceRules = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1NonResourceRule item : nonResourceRules) {
        this.addToNonResourceRules(item);
      }
    } else {
      this.nonResourceRules = null;
    }
    return (A) this;
  }

  public A withNonResourceRules(
      io.kubernetes.client.openapi.models.V1NonResourceRule... nonResourceRules) {
    if (this.nonResourceRules != null) {
      this.nonResourceRules.clear();
    }
    if (nonResourceRules != null) {
      for (io.kubernetes.client.openapi.models.V1NonResourceRule item : nonResourceRules) {
        this.addToNonResourceRules(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasNonResourceRules() {
    return nonResourceRules != null && !nonResourceRules.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent
              .NonResourceRulesNested<
          A>
      addNewNonResourceRule() {
    return new io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluentImpl
        .NonResourceRulesNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent
              .NonResourceRulesNested<
          A>
      addNewNonResourceRuleLike(io.kubernetes.client.openapi.models.V1NonResourceRule item) {
    return new io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluentImpl
        .NonResourceRulesNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent
              .NonResourceRulesNested<
          A>
      setNewNonResourceRuleLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1NonResourceRule item) {
    return new io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluentImpl
        .NonResourceRulesNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent
              .NonResourceRulesNested<
          A>
      editNonResourceRule(java.lang.Integer index) {
    if (nonResourceRules.size() <= index)
      throw new RuntimeException("Can't edit nonResourceRules. Index exceeds size.");
    return setNewNonResourceRuleLike(index, buildNonResourceRule(index));
  }

  public io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent
              .NonResourceRulesNested<
          A>
      editFirstNonResourceRule() {
    if (nonResourceRules.size() == 0)
      throw new RuntimeException("Can't edit first nonResourceRules. The list is empty.");
    return setNewNonResourceRuleLike(0, buildNonResourceRule(0));
  }

  public io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent
              .NonResourceRulesNested<
          A>
      editLastNonResourceRule() {
    int index = nonResourceRules.size() - 1;
    if (index < 0)
      throw new RuntimeException("Can't edit last nonResourceRules. The list is empty.");
    return setNewNonResourceRuleLike(index, buildNonResourceRule(index));
  }

  public io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent
              .NonResourceRulesNested<
          A>
      editMatchingNonResourceRule(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NonResourceRuleBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < nonResourceRules.size(); i++) {
      if (predicate.test(nonResourceRules.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0)
      throw new RuntimeException("Can't edit matching nonResourceRules. No match found.");
    return setNewNonResourceRuleLike(index, buildNonResourceRule(index));
  }

  public A addToResourceRules(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ResourceRule item) {
    if (this.resourceRules == null) {
      this.resourceRules =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ResourceRuleBuilder>();
    }
    io.kubernetes.client.openapi.models.V1ResourceRuleBuilder builder =
        new io.kubernetes.client.openapi.models.V1ResourceRuleBuilder(item);
    _visitables
        .get("resourceRules")
        .add(index >= 0 ? index : _visitables.get("resourceRules").size(), builder);
    this.resourceRules.add(index >= 0 ? index : resourceRules.size(), builder);
    return (A) this;
  }

  public A setToResourceRules(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ResourceRule item) {
    if (this.resourceRules == null) {
      this.resourceRules =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ResourceRuleBuilder>();
    }
    io.kubernetes.client.openapi.models.V1ResourceRuleBuilder builder =
        new io.kubernetes.client.openapi.models.V1ResourceRuleBuilder(item);
    if (index < 0 || index >= _visitables.get("resourceRules").size()) {
      _visitables.get("resourceRules").add(builder);
    } else {
      _visitables.get("resourceRules").set(index, builder);
    }
    if (index < 0 || index >= resourceRules.size()) {
      resourceRules.add(builder);
    } else {
      resourceRules.set(index, builder);
    }
    return (A) this;
  }

  public A addToResourceRules(io.kubernetes.client.openapi.models.V1ResourceRule... items) {
    if (this.resourceRules == null) {
      this.resourceRules =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ResourceRuleBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1ResourceRule item : items) {
      io.kubernetes.client.openapi.models.V1ResourceRuleBuilder builder =
          new io.kubernetes.client.openapi.models.V1ResourceRuleBuilder(item);
      _visitables.get("resourceRules").add(builder);
      this.resourceRules.add(builder);
    }
    return (A) this;
  }

  public A addAllToResourceRules(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ResourceRule> items) {
    if (this.resourceRules == null) {
      this.resourceRules =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ResourceRuleBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1ResourceRule item : items) {
      io.kubernetes.client.openapi.models.V1ResourceRuleBuilder builder =
          new io.kubernetes.client.openapi.models.V1ResourceRuleBuilder(item);
      _visitables.get("resourceRules").add(builder);
      this.resourceRules.add(builder);
    }
    return (A) this;
  }

  public A removeFromResourceRules(io.kubernetes.client.openapi.models.V1ResourceRule... items) {
    for (io.kubernetes.client.openapi.models.V1ResourceRule item : items) {
      io.kubernetes.client.openapi.models.V1ResourceRuleBuilder builder =
          new io.kubernetes.client.openapi.models.V1ResourceRuleBuilder(item);
      _visitables.get("resourceRules").remove(builder);
      if (this.resourceRules != null) {
        this.resourceRules.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromResourceRules(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ResourceRule> items) {
    for (io.kubernetes.client.openapi.models.V1ResourceRule item : items) {
      io.kubernetes.client.openapi.models.V1ResourceRuleBuilder builder =
          new io.kubernetes.client.openapi.models.V1ResourceRuleBuilder(item);
      _visitables.get("resourceRules").remove(builder);
      if (this.resourceRules != null) {
        this.resourceRules.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromResourceRules(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ResourceRuleBuilder>
          predicate) {
    if (resourceRules == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1ResourceRuleBuilder> each =
        resourceRules.iterator();
    final List visitables = _visitables.get("resourceRules");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1ResourceRuleBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildResourceRules instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1ResourceRule> getResourceRules() {
    return resourceRules != null ? build(resourceRules) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1ResourceRule> buildResourceRules() {
    return resourceRules != null ? build(resourceRules) : null;
  }

  public io.kubernetes.client.openapi.models.V1ResourceRule buildResourceRule(
      java.lang.Integer index) {
    return this.resourceRules.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1ResourceRule buildFirstResourceRule() {
    return this.resourceRules.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1ResourceRule buildLastResourceRule() {
    return this.resourceRules.get(resourceRules.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1ResourceRule buildMatchingResourceRule(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ResourceRuleBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1ResourceRuleBuilder item : resourceRules) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingResourceRule(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ResourceRuleBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1ResourceRuleBuilder item : resourceRules) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withResourceRules(
      java.util.List<io.kubernetes.client.openapi.models.V1ResourceRule> resourceRules) {
    if (this.resourceRules != null) {
      _visitables.get("resourceRules").removeAll(this.resourceRules);
    }
    if (resourceRules != null) {
      this.resourceRules = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1ResourceRule item : resourceRules) {
        this.addToResourceRules(item);
      }
    } else {
      this.resourceRules = null;
    }
    return (A) this;
  }

  public A withResourceRules(io.kubernetes.client.openapi.models.V1ResourceRule... resourceRules) {
    if (this.resourceRules != null) {
      this.resourceRules.clear();
    }
    if (resourceRules != null) {
      for (io.kubernetes.client.openapi.models.V1ResourceRule item : resourceRules) {
        this.addToResourceRules(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasResourceRules() {
    return resourceRules != null && !resourceRules.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent.ResourceRulesNested<A>
      addNewResourceRule() {
    return new io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluentImpl
        .ResourceRulesNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent.ResourceRulesNested<A>
      addNewResourceRuleLike(io.kubernetes.client.openapi.models.V1ResourceRule item) {
    return new io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluentImpl
        .ResourceRulesNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent.ResourceRulesNested<A>
      setNewResourceRuleLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1ResourceRule item) {
    return new io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluentImpl
        .ResourceRulesNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent.ResourceRulesNested<A>
      editResourceRule(java.lang.Integer index) {
    if (resourceRules.size() <= index)
      throw new RuntimeException("Can't edit resourceRules. Index exceeds size.");
    return setNewResourceRuleLike(index, buildResourceRule(index));
  }

  public io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent.ResourceRulesNested<A>
      editFirstResourceRule() {
    if (resourceRules.size() == 0)
      throw new RuntimeException("Can't edit first resourceRules. The list is empty.");
    return setNewResourceRuleLike(0, buildResourceRule(0));
  }

  public io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent.ResourceRulesNested<A>
      editLastResourceRule() {
    int index = resourceRules.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last resourceRules. The list is empty.");
    return setNewResourceRuleLike(index, buildResourceRule(index));
  }

  public io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent.ResourceRulesNested<A>
      editMatchingResourceRule(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ResourceRuleBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < resourceRules.size(); i++) {
      if (predicate.test(resourceRules.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching resourceRules. No match found.");
    return setNewResourceRuleLike(index, buildResourceRule(index));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1SubjectRulesReviewStatusFluentImpl that = (V1SubjectRulesReviewStatusFluentImpl) o;
    if (evaluationError != null
        ? !evaluationError.equals(that.evaluationError)
        : that.evaluationError != null) return false;
    if (incomplete != null ? !incomplete.equals(that.incomplete) : that.incomplete != null)
      return false;
    if (nonResourceRules != null
        ? !nonResourceRules.equals(that.nonResourceRules)
        : that.nonResourceRules != null) return false;
    if (resourceRules != null
        ? !resourceRules.equals(that.resourceRules)
        : that.resourceRules != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        evaluationError, incomplete, nonResourceRules, resourceRules, super.hashCode());
  }

  public class NonResourceRulesNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1NonResourceRuleFluentImpl<
          io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent
                  .NonResourceRulesNested<
              N>>
      implements io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent
                  .NonResourceRulesNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    NonResourceRulesNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1NonResourceRule item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1NonResourceRuleBuilder(this, item);
    }

    NonResourceRulesNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1NonResourceRuleBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1NonResourceRuleBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N)
          V1SubjectRulesReviewStatusFluentImpl.this.setToNonResourceRules(index, builder.build());
    }

    public N endNonResourceRule() {
      return and();
    }
  }

  public class ResourceRulesNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ResourceRuleFluentImpl<
          io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent.ResourceRulesNested<
              N>>
      implements io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent
                  .ResourceRulesNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    ResourceRulesNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1ResourceRule item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1ResourceRuleBuilder(this, item);
    }

    ResourceRulesNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1ResourceRuleBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ResourceRuleBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N)
          V1SubjectRulesReviewStatusFluentImpl.this.setToResourceRules(index, builder.build());
    }

    public N endResourceRule() {
      return and();
    }
  }
}
