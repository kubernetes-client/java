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
public class V1beta2PolicyRulesWithSubjectsFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluent<A> {
  public V1beta2PolicyRulesWithSubjectsFluentImpl() {}

  public V1beta2PolicyRulesWithSubjectsFluentImpl(
      io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects instance) {
    this.withNonResourceRules(instance.getNonResourceRules());

    this.withResourceRules(instance.getResourceRules());

    this.withSubjects(instance.getSubjects());
  }

  private java.util.ArrayList<
          io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRuleBuilder>
      nonResourceRules;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRuleBuilder>
      resourceRules;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta2SubjectBuilder> subjects;

  public A addToNonResourceRules(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRule item) {
    if (this.nonResourceRules == null) {
      this.nonResourceRules =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRuleBuilder>();
    }
    io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRuleBuilder builder =
        new io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRuleBuilder(item);
    _visitables
        .get("nonResourceRules")
        .add(index >= 0 ? index : _visitables.get("nonResourceRules").size(), builder);
    this.nonResourceRules.add(index >= 0 ? index : nonResourceRules.size(), builder);
    return (A) this;
  }

  public A setToNonResourceRules(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRule item) {
    if (this.nonResourceRules == null) {
      this.nonResourceRules =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRuleBuilder>();
    }
    io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRuleBuilder builder =
        new io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRuleBuilder(item);
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

  public A addToNonResourceRules(
      io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRule... items) {
    if (this.nonResourceRules == null) {
      this.nonResourceRules =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRuleBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRule item : items) {
      io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRuleBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRuleBuilder(item);
      _visitables.get("nonResourceRules").add(builder);
      this.nonResourceRules.add(builder);
    }
    return (A) this;
  }

  public A addAllToNonResourceRules(
      java.util.Collection<io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRule>
          items) {
    if (this.nonResourceRules == null) {
      this.nonResourceRules =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRuleBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRule item : items) {
      io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRuleBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRuleBuilder(item);
      _visitables.get("nonResourceRules").add(builder);
      this.nonResourceRules.add(builder);
    }
    return (A) this;
  }

  public A removeFromNonResourceRules(
      io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRule... items) {
    for (io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRule item : items) {
      io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRuleBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRuleBuilder(item);
      _visitables.get("nonResourceRules").remove(builder);
      if (this.nonResourceRules != null) {
        this.nonResourceRules.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromNonResourceRules(
      java.util.Collection<io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRule>
          items) {
    for (io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRule item : items) {
      io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRuleBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRuleBuilder(item);
      _visitables.get("nonResourceRules").remove(builder);
      if (this.nonResourceRules != null) {
        this.nonResourceRules.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromNonResourceRules(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRuleBuilder>
          predicate) {
    if (nonResourceRules == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRuleBuilder> each =
        nonResourceRules.iterator();
    final List visitables = _visitables.get("nonResourceRules");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRuleBuilder builder = each.next();
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
  public java.util.List<io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRule>
      getNonResourceRules() {
    return nonResourceRules != null ? build(nonResourceRules) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRule>
      buildNonResourceRules() {
    return nonResourceRules != null ? build(nonResourceRules) : null;
  }

  public io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRule buildNonResourceRule(
      java.lang.Integer index) {
    return this.nonResourceRules.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRule
      buildFirstNonResourceRule() {
    return this.nonResourceRules.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRule
      buildLastNonResourceRule() {
    return this.nonResourceRules.get(nonResourceRules.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRule
      buildMatchingNonResourceRule(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRuleBuilder>
              predicate) {
    for (io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRuleBuilder item :
        nonResourceRules) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingNonResourceRule(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRuleBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRuleBuilder item :
        nonResourceRules) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withNonResourceRules(
      java.util.List<io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRule>
          nonResourceRules) {
    if (this.nonResourceRules != null) {
      _visitables.get("nonResourceRules").removeAll(this.nonResourceRules);
    }
    if (nonResourceRules != null) {
      this.nonResourceRules = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRule item :
          nonResourceRules) {
        this.addToNonResourceRules(item);
      }
    } else {
      this.nonResourceRules = null;
    }
    return (A) this;
  }

  public A withNonResourceRules(
      io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRule... nonResourceRules) {
    if (this.nonResourceRules != null) {
      this.nonResourceRules.clear();
    }
    if (nonResourceRules != null) {
      for (io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRule item :
          nonResourceRules) {
        this.addToNonResourceRules(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasNonResourceRules() {
    return nonResourceRules != null && !nonResourceRules.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluent
              .NonResourceRulesNested<
          A>
      addNewNonResourceRule() {
    return new io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluentImpl
        .NonResourceRulesNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluent
              .NonResourceRulesNested<
          A>
      addNewNonResourceRuleLike(
          io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRule item) {
    return new io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluentImpl
        .NonResourceRulesNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluent
              .NonResourceRulesNested<
          A>
      setNewNonResourceRuleLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRule item) {
    return new io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluentImpl
        .NonResourceRulesNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluent
              .NonResourceRulesNested<
          A>
      editNonResourceRule(java.lang.Integer index) {
    if (nonResourceRules.size() <= index)
      throw new RuntimeException("Can't edit nonResourceRules. Index exceeds size.");
    return setNewNonResourceRuleLike(index, buildNonResourceRule(index));
  }

  public io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluent
              .NonResourceRulesNested<
          A>
      editFirstNonResourceRule() {
    if (nonResourceRules.size() == 0)
      throw new RuntimeException("Can't edit first nonResourceRules. The list is empty.");
    return setNewNonResourceRuleLike(0, buildNonResourceRule(0));
  }

  public io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluent
              .NonResourceRulesNested<
          A>
      editLastNonResourceRule() {
    int index = nonResourceRules.size() - 1;
    if (index < 0)
      throw new RuntimeException("Can't edit last nonResourceRules. The list is empty.");
    return setNewNonResourceRuleLike(index, buildNonResourceRule(index));
  }

  public io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluent
              .NonResourceRulesNested<
          A>
      editMatchingNonResourceRule(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRuleBuilder>
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
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRule item) {
    if (this.resourceRules == null) {
      this.resourceRules =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRuleBuilder>();
    }
    io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRuleBuilder builder =
        new io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRuleBuilder(item);
    _visitables
        .get("resourceRules")
        .add(index >= 0 ? index : _visitables.get("resourceRules").size(), builder);
    this.resourceRules.add(index >= 0 ? index : resourceRules.size(), builder);
    return (A) this;
  }

  public A setToResourceRules(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRule item) {
    if (this.resourceRules == null) {
      this.resourceRules =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRuleBuilder>();
    }
    io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRuleBuilder builder =
        new io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRuleBuilder(item);
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

  public A addToResourceRules(
      io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRule... items) {
    if (this.resourceRules == null) {
      this.resourceRules =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRuleBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRule item : items) {
      io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRuleBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRuleBuilder(item);
      _visitables.get("resourceRules").add(builder);
      this.resourceRules.add(builder);
    }
    return (A) this;
  }

  public A addAllToResourceRules(
      java.util.Collection<io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRule> items) {
    if (this.resourceRules == null) {
      this.resourceRules =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRuleBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRule item : items) {
      io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRuleBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRuleBuilder(item);
      _visitables.get("resourceRules").add(builder);
      this.resourceRules.add(builder);
    }
    return (A) this;
  }

  public A removeFromResourceRules(
      io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRule... items) {
    for (io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRule item : items) {
      io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRuleBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRuleBuilder(item);
      _visitables.get("resourceRules").remove(builder);
      if (this.resourceRules != null) {
        this.resourceRules.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromResourceRules(
      java.util.Collection<io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRule> items) {
    for (io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRule item : items) {
      io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRuleBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRuleBuilder(item);
      _visitables.get("resourceRules").remove(builder);
      if (this.resourceRules != null) {
        this.resourceRules.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromResourceRules(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRuleBuilder>
          predicate) {
    if (resourceRules == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRuleBuilder> each =
        resourceRules.iterator();
    final List visitables = _visitables.get("resourceRules");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRuleBuilder builder = each.next();
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
  public java.util.List<io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRule>
      getResourceRules() {
    return resourceRules != null ? build(resourceRules) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRule>
      buildResourceRules() {
    return resourceRules != null ? build(resourceRules) : null;
  }

  public io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRule buildResourceRule(
      java.lang.Integer index) {
    return this.resourceRules.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRule buildFirstResourceRule() {
    return this.resourceRules.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRule buildLastResourceRule() {
    return this.resourceRules.get(resourceRules.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRule buildMatchingResourceRule(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRuleBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRuleBuilder item :
        resourceRules) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingResourceRule(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRuleBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRuleBuilder item :
        resourceRules) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withResourceRules(
      java.util.List<io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRule> resourceRules) {
    if (this.resourceRules != null) {
      _visitables.get("resourceRules").removeAll(this.resourceRules);
    }
    if (resourceRules != null) {
      this.resourceRules = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRule item : resourceRules) {
        this.addToResourceRules(item);
      }
    } else {
      this.resourceRules = null;
    }
    return (A) this;
  }

  public A withResourceRules(
      io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRule... resourceRules) {
    if (this.resourceRules != null) {
      this.resourceRules.clear();
    }
    if (resourceRules != null) {
      for (io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRule item : resourceRules) {
        this.addToResourceRules(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasResourceRules() {
    return resourceRules != null && !resourceRules.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluent
              .ResourceRulesNested<
          A>
      addNewResourceRule() {
    return new io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluentImpl
        .ResourceRulesNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluent
              .ResourceRulesNested<
          A>
      addNewResourceRuleLike(io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRule item) {
    return new io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluentImpl
        .ResourceRulesNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluent
              .ResourceRulesNested<
          A>
      setNewResourceRuleLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRule item) {
    return new io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluentImpl
        .ResourceRulesNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluent
              .ResourceRulesNested<
          A>
      editResourceRule(java.lang.Integer index) {
    if (resourceRules.size() <= index)
      throw new RuntimeException("Can't edit resourceRules. Index exceeds size.");
    return setNewResourceRuleLike(index, buildResourceRule(index));
  }

  public io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluent
              .ResourceRulesNested<
          A>
      editFirstResourceRule() {
    if (resourceRules.size() == 0)
      throw new RuntimeException("Can't edit first resourceRules. The list is empty.");
    return setNewResourceRuleLike(0, buildResourceRule(0));
  }

  public io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluent
              .ResourceRulesNested<
          A>
      editLastResourceRule() {
    int index = resourceRules.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last resourceRules. The list is empty.");
    return setNewResourceRuleLike(index, buildResourceRule(index));
  }

  public io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluent
              .ResourceRulesNested<
          A>
      editMatchingResourceRule(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRuleBuilder>
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

  public A addToSubjects(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1beta2Subject item) {
    if (this.subjects == null) {
      this.subjects =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta2SubjectBuilder>();
    }
    io.kubernetes.client.openapi.models.V1beta2SubjectBuilder builder =
        new io.kubernetes.client.openapi.models.V1beta2SubjectBuilder(item);
    _visitables
        .get("subjects")
        .add(index >= 0 ? index : _visitables.get("subjects").size(), builder);
    this.subjects.add(index >= 0 ? index : subjects.size(), builder);
    return (A) this;
  }

  public A setToSubjects(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1beta2Subject item) {
    if (this.subjects == null) {
      this.subjects =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta2SubjectBuilder>();
    }
    io.kubernetes.client.openapi.models.V1beta2SubjectBuilder builder =
        new io.kubernetes.client.openapi.models.V1beta2SubjectBuilder(item);
    if (index < 0 || index >= _visitables.get("subjects").size()) {
      _visitables.get("subjects").add(builder);
    } else {
      _visitables.get("subjects").set(index, builder);
    }
    if (index < 0 || index >= subjects.size()) {
      subjects.add(builder);
    } else {
      subjects.set(index, builder);
    }
    return (A) this;
  }

  public A addToSubjects(io.kubernetes.client.openapi.models.V1beta2Subject... items) {
    if (this.subjects == null) {
      this.subjects =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta2SubjectBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1beta2Subject item : items) {
      io.kubernetes.client.openapi.models.V1beta2SubjectBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta2SubjectBuilder(item);
      _visitables.get("subjects").add(builder);
      this.subjects.add(builder);
    }
    return (A) this;
  }

  public A addAllToSubjects(
      java.util.Collection<io.kubernetes.client.openapi.models.V1beta2Subject> items) {
    if (this.subjects == null) {
      this.subjects =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta2SubjectBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1beta2Subject item : items) {
      io.kubernetes.client.openapi.models.V1beta2SubjectBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta2SubjectBuilder(item);
      _visitables.get("subjects").add(builder);
      this.subjects.add(builder);
    }
    return (A) this;
  }

  public A removeFromSubjects(io.kubernetes.client.openapi.models.V1beta2Subject... items) {
    for (io.kubernetes.client.openapi.models.V1beta2Subject item : items) {
      io.kubernetes.client.openapi.models.V1beta2SubjectBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta2SubjectBuilder(item);
      _visitables.get("subjects").remove(builder);
      if (this.subjects != null) {
        this.subjects.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromSubjects(
      java.util.Collection<io.kubernetes.client.openapi.models.V1beta2Subject> items) {
    for (io.kubernetes.client.openapi.models.V1beta2Subject item : items) {
      io.kubernetes.client.openapi.models.V1beta2SubjectBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta2SubjectBuilder(item);
      _visitables.get("subjects").remove(builder);
      if (this.subjects != null) {
        this.subjects.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromSubjects(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta2SubjectBuilder>
          predicate) {
    if (subjects == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1beta2SubjectBuilder> each =
        subjects.iterator();
    final List visitables = _visitables.get("subjects");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1beta2SubjectBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildSubjects instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1beta2Subject> getSubjects() {
    return subjects != null ? build(subjects) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1beta2Subject> buildSubjects() {
    return subjects != null ? build(subjects) : null;
  }

  public io.kubernetes.client.openapi.models.V1beta2Subject buildSubject(java.lang.Integer index) {
    return this.subjects.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1beta2Subject buildFirstSubject() {
    return this.subjects.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1beta2Subject buildLastSubject() {
    return this.subjects.get(subjects.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1beta2Subject buildMatchingSubject(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta2SubjectBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1beta2SubjectBuilder item : subjects) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingSubject(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta2SubjectBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1beta2SubjectBuilder item : subjects) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withSubjects(
      java.util.List<io.kubernetes.client.openapi.models.V1beta2Subject> subjects) {
    if (this.subjects != null) {
      _visitables.get("subjects").removeAll(this.subjects);
    }
    if (subjects != null) {
      this.subjects = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1beta2Subject item : subjects) {
        this.addToSubjects(item);
      }
    } else {
      this.subjects = null;
    }
    return (A) this;
  }

  public A withSubjects(io.kubernetes.client.openapi.models.V1beta2Subject... subjects) {
    if (this.subjects != null) {
      this.subjects.clear();
    }
    if (subjects != null) {
      for (io.kubernetes.client.openapi.models.V1beta2Subject item : subjects) {
        this.addToSubjects(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasSubjects() {
    return subjects != null && !subjects.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluent.SubjectsNested<A>
      addNewSubject() {
    return new io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluentImpl
        .SubjectsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluent.SubjectsNested<A>
      addNewSubjectLike(io.kubernetes.client.openapi.models.V1beta2Subject item) {
    return new io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluentImpl
        .SubjectsNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluent.SubjectsNested<A>
      setNewSubjectLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1beta2Subject item) {
    return new io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluentImpl
        .SubjectsNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluent.SubjectsNested<A>
      editSubject(java.lang.Integer index) {
    if (subjects.size() <= index)
      throw new RuntimeException("Can't edit subjects. Index exceeds size.");
    return setNewSubjectLike(index, buildSubject(index));
  }

  public io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluent.SubjectsNested<A>
      editFirstSubject() {
    if (subjects.size() == 0)
      throw new RuntimeException("Can't edit first subjects. The list is empty.");
    return setNewSubjectLike(0, buildSubject(0));
  }

  public io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluent.SubjectsNested<A>
      editLastSubject() {
    int index = subjects.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last subjects. The list is empty.");
    return setNewSubjectLike(index, buildSubject(index));
  }

  public io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluent.SubjectsNested<A>
      editMatchingSubject(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta2SubjectBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < subjects.size(); i++) {
      if (predicate.test(subjects.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching subjects. No match found.");
    return setNewSubjectLike(index, buildSubject(index));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta2PolicyRulesWithSubjectsFluentImpl that = (V1beta2PolicyRulesWithSubjectsFluentImpl) o;
    if (nonResourceRules != null
        ? !nonResourceRules.equals(that.nonResourceRules)
        : that.nonResourceRules != null) return false;
    if (resourceRules != null
        ? !resourceRules.equals(that.resourceRules)
        : that.resourceRules != null) return false;
    if (subjects != null ? !subjects.equals(that.subjects) : that.subjects != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(nonResourceRules, resourceRules, subjects, super.hashCode());
  }

  public class NonResourceRulesNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRuleFluentImpl<
          io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluent
                  .NonResourceRulesNested<
              N>>
      implements io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluent
                  .NonResourceRulesNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    NonResourceRulesNestedImpl(
        java.lang.Integer index,
        io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRule item) {
      this.index = index;
      this.builder =
          new io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRuleBuilder(this, item);
    }

    NonResourceRulesNestedImpl() {
      this.index = -1;
      this.builder =
          new io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRuleBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1beta2NonResourcePolicyRuleBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N)
          V1beta2PolicyRulesWithSubjectsFluentImpl.this.setToNonResourceRules(
              index, builder.build());
    }

    public N endNonResourceRule() {
      return and();
    }
  }

  public class ResourceRulesNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRuleFluentImpl<
          io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluent
                  .ResourceRulesNested<
              N>>
      implements io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluent
                  .ResourceRulesNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    ResourceRulesNestedImpl(
        java.lang.Integer index,
        io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRule item) {
      this.index = index;
      this.builder =
          new io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRuleBuilder(this, item);
    }

    ResourceRulesNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRuleBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRuleBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N)
          V1beta2PolicyRulesWithSubjectsFluentImpl.this.setToResourceRules(index, builder.build());
    }

    public N endResourceRule() {
      return and();
    }
  }

  public class SubjectsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1beta2SubjectFluentImpl<
          io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluent.SubjectsNested<
              N>>
      implements io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluent
                  .SubjectsNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    SubjectsNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1beta2Subject item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1beta2SubjectBuilder(this, item);
    }

    SubjectsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1beta2SubjectBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1beta2SubjectBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N)
          V1beta2PolicyRulesWithSubjectsFluentImpl.this.setToSubjects(index, builder.build());
    }

    public N endSubject() {
      return and();
    }
  }
}
