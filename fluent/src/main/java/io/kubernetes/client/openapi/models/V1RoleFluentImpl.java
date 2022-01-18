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
public class V1RoleFluentImpl<A extends io.kubernetes.client.openapi.models.V1RoleFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1RoleFluent<A> {
  public V1RoleFluentImpl() {}

  public V1RoleFluentImpl(io.kubernetes.client.openapi.models.V1Role instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withRules(instance.getRules());
  }

  private java.lang.String apiVersion;
  private java.lang.String kind;
  private io.kubernetes.client.openapi.models.V1ObjectMetaBuilder metadata;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1PolicyRuleBuilder> rules;

  public java.lang.String getApiVersion() {
    return this.apiVersion;
  }

  public A withApiVersion(java.lang.String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }

  public java.lang.Boolean hasApiVersion() {
    return this.apiVersion != null;
  }

  /** Method is deprecated. use withApiVersion instead. */
  @java.lang.Deprecated
  public A withNewApiVersion(java.lang.String original) {
    return (A) withApiVersion(new String(original));
  }

  public java.lang.String getKind() {
    return this.kind;
  }

  public A withKind(java.lang.String kind) {
    this.kind = kind;
    return (A) this;
  }

  public java.lang.Boolean hasKind() {
    return this.kind != null;
  }

  /** Method is deprecated. use withKind instead. */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String original) {
    return (A) withKind(new String(original));
  }

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }

  public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata) {
    _visitables.get("metadata").remove(this.metadata);
    if (metadata != null) {
      this.metadata = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(metadata);
      _visitables.get("metadata").add(this.metadata);
    }
    return (A) this;
  }

  public java.lang.Boolean hasMetadata() {
    return this.metadata != null;
  }

  public io.kubernetes.client.openapi.models.V1RoleFluent.MetadataNested<A> withNewMetadata() {
    return new io.kubernetes.client.openapi.models.V1RoleFluentImpl.MetadataNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1RoleFluent.MetadataNested<A> withNewMetadataLike(
      io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return new io.kubernetes.client.openapi.models.V1RoleFluentImpl.MetadataNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1RoleFluent.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }

  public io.kubernetes.client.openapi.models.V1RoleFluent.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(
        getMetadata() != null
            ? getMetadata()
            : new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1RoleFluent.MetadataNested<A> editOrNewMetadataLike(
      io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata() : item);
  }

  public A addToRules(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1PolicyRule item) {
    if (this.rules == null) {
      this.rules =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1PolicyRuleBuilder>();
    }
    io.kubernetes.client.openapi.models.V1PolicyRuleBuilder builder =
        new io.kubernetes.client.openapi.models.V1PolicyRuleBuilder(item);
    _visitables.get("rules").add(index >= 0 ? index : _visitables.get("rules").size(), builder);
    this.rules.add(index >= 0 ? index : rules.size(), builder);
    return (A) this;
  }

  public A setToRules(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1PolicyRule item) {
    if (this.rules == null) {
      this.rules =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1PolicyRuleBuilder>();
    }
    io.kubernetes.client.openapi.models.V1PolicyRuleBuilder builder =
        new io.kubernetes.client.openapi.models.V1PolicyRuleBuilder(item);
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

  public A addToRules(io.kubernetes.client.openapi.models.V1PolicyRule... items) {
    if (this.rules == null) {
      this.rules =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1PolicyRuleBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1PolicyRule item : items) {
      io.kubernetes.client.openapi.models.V1PolicyRuleBuilder builder =
          new io.kubernetes.client.openapi.models.V1PolicyRuleBuilder(item);
      _visitables.get("rules").add(builder);
      this.rules.add(builder);
    }
    return (A) this;
  }

  public A addAllToRules(
      java.util.Collection<io.kubernetes.client.openapi.models.V1PolicyRule> items) {
    if (this.rules == null) {
      this.rules =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1PolicyRuleBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1PolicyRule item : items) {
      io.kubernetes.client.openapi.models.V1PolicyRuleBuilder builder =
          new io.kubernetes.client.openapi.models.V1PolicyRuleBuilder(item);
      _visitables.get("rules").add(builder);
      this.rules.add(builder);
    }
    return (A) this;
  }

  public A removeFromRules(io.kubernetes.client.openapi.models.V1PolicyRule... items) {
    for (io.kubernetes.client.openapi.models.V1PolicyRule item : items) {
      io.kubernetes.client.openapi.models.V1PolicyRuleBuilder builder =
          new io.kubernetes.client.openapi.models.V1PolicyRuleBuilder(item);
      _visitables.get("rules").remove(builder);
      if (this.rules != null) {
        this.rules.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromRules(
      java.util.Collection<io.kubernetes.client.openapi.models.V1PolicyRule> items) {
    for (io.kubernetes.client.openapi.models.V1PolicyRule item : items) {
      io.kubernetes.client.openapi.models.V1PolicyRuleBuilder builder =
          new io.kubernetes.client.openapi.models.V1PolicyRuleBuilder(item);
      _visitables.get("rules").remove(builder);
      if (this.rules != null) {
        this.rules.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromRules(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PolicyRuleBuilder>
          predicate) {
    if (rules == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1PolicyRuleBuilder> each = rules.iterator();
    final List visitables = _visitables.get("rules");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1PolicyRuleBuilder builder = each.next();
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
  public java.util.List<io.kubernetes.client.openapi.models.V1PolicyRule> getRules() {
    return rules != null ? build(rules) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1PolicyRule> buildRules() {
    return rules != null ? build(rules) : null;
  }

  public io.kubernetes.client.openapi.models.V1PolicyRule buildRule(java.lang.Integer index) {
    return this.rules.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1PolicyRule buildFirstRule() {
    return this.rules.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1PolicyRule buildLastRule() {
    return this.rules.get(rules.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1PolicyRule buildMatchingRule(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PolicyRuleBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1PolicyRuleBuilder item : rules) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingRule(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PolicyRuleBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1PolicyRuleBuilder item : rules) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withRules(java.util.List<io.kubernetes.client.openapi.models.V1PolicyRule> rules) {
    if (this.rules != null) {
      _visitables.get("rules").removeAll(this.rules);
    }
    if (rules != null) {
      this.rules = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1PolicyRule item : rules) {
        this.addToRules(item);
      }
    } else {
      this.rules = null;
    }
    return (A) this;
  }

  public A withRules(io.kubernetes.client.openapi.models.V1PolicyRule... rules) {
    if (this.rules != null) {
      this.rules.clear();
    }
    if (rules != null) {
      for (io.kubernetes.client.openapi.models.V1PolicyRule item : rules) {
        this.addToRules(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasRules() {
    return rules != null && !rules.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1RoleFluent.RulesNested<A> addNewRule() {
    return new io.kubernetes.client.openapi.models.V1RoleFluentImpl.RulesNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1RoleFluent.RulesNested<A> addNewRuleLike(
      io.kubernetes.client.openapi.models.V1PolicyRule item) {
    return new io.kubernetes.client.openapi.models.V1RoleFluentImpl.RulesNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1RoleFluent.RulesNested<A> setNewRuleLike(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1PolicyRule item) {
    return new io.kubernetes.client.openapi.models.V1RoleFluentImpl.RulesNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V1RoleFluent.RulesNested<A> editRule(
      java.lang.Integer index) {
    if (rules.size() <= index) throw new RuntimeException("Can't edit rules. Index exceeds size.");
    return setNewRuleLike(index, buildRule(index));
  }

  public io.kubernetes.client.openapi.models.V1RoleFluent.RulesNested<A> editFirstRule() {
    if (rules.size() == 0) throw new RuntimeException("Can't edit first rules. The list is empty.");
    return setNewRuleLike(0, buildRule(0));
  }

  public io.kubernetes.client.openapi.models.V1RoleFluent.RulesNested<A> editLastRule() {
    int index = rules.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last rules. The list is empty.");
    return setNewRuleLike(index, buildRule(index));
  }

  public io.kubernetes.client.openapi.models.V1RoleFluent.RulesNested<A> editMatchingRule(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PolicyRuleBuilder>
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
    V1RoleFluentImpl that = (V1RoleFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) : that.apiVersion != null)
      return false;
    if (kind != null ? !kind.equals(that.kind) : that.kind != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) : that.metadata != null) return false;
    if (rules != null ? !rules.equals(that.rules) : that.rules != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(apiVersion, kind, metadata, rules, super.hashCode());
  }

  public class MetadataNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ObjectMetaFluentImpl<
          io.kubernetes.client.openapi.models.V1RoleFluent.MetadataNested<N>>
      implements io.kubernetes.client.openapi.models.V1RoleFluent.MetadataNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    MetadataNestedImpl(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this, item);
    }

    MetadataNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ObjectMetaBuilder builder;

    public N and() {
      return (N) V1RoleFluentImpl.this.withMetadata(builder.build());
    }

    public N endMetadata() {
      return and();
    }
  }

  public class RulesNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1PolicyRuleFluentImpl<
          io.kubernetes.client.openapi.models.V1RoleFluent.RulesNested<N>>
      implements io.kubernetes.client.openapi.models.V1RoleFluent.RulesNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    RulesNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1PolicyRule item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1PolicyRuleBuilder(this, item);
    }

    RulesNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1PolicyRuleBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1PolicyRuleBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1RoleFluentImpl.this.setToRules(index, builder.build());
    }

    public N endRule() {
      return and();
    }
  }
}
