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
public class V1JSONSchemaPropsFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent<A> {
  public V1JSONSchemaPropsFluentImpl() {}

  public V1JSONSchemaPropsFluentImpl(
      io.kubernetes.client.openapi.models.V1JSONSchemaProps instance) {
    this.withRef(instance.get$Ref());

    this.withSchema(instance.get$Schema());

    this.withAdditionalItems(instance.getAdditionalItems());

    this.withAdditionalProperties(instance.getAdditionalProperties());

    this.withAllOf(instance.getAllOf());

    this.withAnyOf(instance.getAnyOf());

    this.withDefault(instance.getDefault());

    this.withDefinitions(instance.getDefinitions());

    this.withDependencies(instance.getDependencies());

    this.withDescription(instance.getDescription());

    this.withEnum(instance.getEnum());

    this.withExample(instance.getExample());

    this.withExclusiveMaximum(instance.getExclusiveMaximum());

    this.withExclusiveMinimum(instance.getExclusiveMinimum());

    this.withExternalDocs(instance.getExternalDocs());

    this.withFormat(instance.getFormat());

    this.withId(instance.getId());

    this.withItems(instance.getItems());

    this.withMaxItems(instance.getMaxItems());

    this.withMaxLength(instance.getMaxLength());

    this.withMaxProperties(instance.getMaxProperties());

    this.withMaximum(instance.getMaximum());

    this.withMinItems(instance.getMinItems());

    this.withMinLength(instance.getMinLength());

    this.withMinProperties(instance.getMinProperties());

    this.withMinimum(instance.getMinimum());

    this.withMultipleOf(instance.getMultipleOf());

    this.withNot(instance.getNot());

    this.withNullable(instance.getNullable());

    this.withOneOf(instance.getOneOf());

    this.withPattern(instance.getPattern());

    this.withPatternProperties(instance.getPatternProperties());

    this.withProperties(instance.getProperties());

    this.withRequired(instance.getRequired());

    this.withTitle(instance.getTitle());

    this.withType(instance.getType());

    this.withUniqueItems(instance.getUniqueItems());
  }

  private java.lang.String $ref;
  private java.lang.String $schema;
  private java.lang.Object additionalItems;
  private java.lang.Object additionalProperties;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder> allOf;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder> anyOf;
  private java.lang.Object _default;
  private java.util.Map<java.lang.String, io.kubernetes.client.openapi.models.V1JSONSchemaProps>
      definitions;
  private java.util.Map<java.lang.String, java.lang.Object> dependencies;
  private java.lang.String description;
  private java.util.List<java.lang.Object> _enum;
  private java.lang.Object example;
  private java.lang.Boolean exclusiveMaximum;
  private java.lang.Boolean exclusiveMinimum;
  private io.kubernetes.client.openapi.models.V1ExternalDocumentationBuilder externalDocs;
  private java.lang.String format;
  private java.lang.String id;
  private java.lang.Object items;
  private java.lang.Long maxItems;
  private java.lang.Long maxLength;
  private java.lang.Long maxProperties;
  private java.lang.Double maximum;
  private java.lang.Long minItems;
  private java.lang.Long minLength;
  private java.lang.Long minProperties;
  private java.lang.Double minimum;
  private java.lang.Double multipleOf;
  private io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder not;
  private java.lang.Boolean nullable;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder> oneOf;
  private java.lang.String pattern;
  private java.util.Map<java.lang.String, io.kubernetes.client.openapi.models.V1JSONSchemaProps>
      patternProperties;
  private java.util.Map<java.lang.String, io.kubernetes.client.openapi.models.V1JSONSchemaProps>
      properties;
  private java.util.List<java.lang.String> required;
  private java.lang.String title;
  private java.lang.String type;
  private java.lang.Boolean uniqueItems;

  public java.lang.String getRef() {
    return this.$ref;
  }

  public A withRef(java.lang.String $ref) {
    this.$ref = $ref;
    return (A) this;
  }

  public java.lang.Boolean hasRef() {
    return this.$ref != null;
  }

  /** Method is deprecated. use withRef instead. */
  @java.lang.Deprecated
  public A withNewRef(java.lang.String original) {
    return (A) withRef(new String(original));
  }

  public java.lang.String getSchema() {
    return this.$schema;
  }

  public A withSchema(java.lang.String $schema) {
    this.$schema = $schema;
    return (A) this;
  }

  public java.lang.Boolean hasSchema() {
    return this.$schema != null;
  }

  /** Method is deprecated. use withSchema instead. */
  @java.lang.Deprecated
  public A withNewSchema(java.lang.String original) {
    return (A) withSchema(new String(original));
  }

  public java.lang.Object getAdditionalItems() {
    return this.additionalItems;
  }

  public A withAdditionalItems(java.lang.Object additionalItems) {
    this.additionalItems = additionalItems;
    return (A) this;
  }

  public java.lang.Boolean hasAdditionalItems() {
    return this.additionalItems != null;
  }

  public java.lang.Object getAdditionalProperties() {
    return this.additionalProperties;
  }

  public A withAdditionalProperties(java.lang.Object additionalProperties) {
    this.additionalProperties = additionalProperties;
    return (A) this;
  }

  public java.lang.Boolean hasAdditionalProperties() {
    return this.additionalProperties != null;
  }

  public A addToAllOf(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1JSONSchemaProps item) {
    if (this.allOf == null) {
      this.allOf =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder>();
    }
    io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder builder =
        new io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder(item);
    _visitables.get("allOf").add(index >= 0 ? index : _visitables.get("allOf").size(), builder);
    this.allOf.add(index >= 0 ? index : allOf.size(), builder);
    return (A) this;
  }

  public A setToAllOf(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1JSONSchemaProps item) {
    if (this.allOf == null) {
      this.allOf =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder>();
    }
    io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder builder =
        new io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder(item);
    if (index < 0 || index >= _visitables.get("allOf").size()) {
      _visitables.get("allOf").add(builder);
    } else {
      _visitables.get("allOf").set(index, builder);
    }
    if (index < 0 || index >= allOf.size()) {
      allOf.add(builder);
    } else {
      allOf.set(index, builder);
    }
    return (A) this;
  }

  public A addToAllOf(io.kubernetes.client.openapi.models.V1JSONSchemaProps... items) {
    if (this.allOf == null) {
      this.allOf =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1JSONSchemaProps item : items) {
      io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder builder =
          new io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder(item);
      _visitables.get("allOf").add(builder);
      this.allOf.add(builder);
    }
    return (A) this;
  }

  public A addAllToAllOf(
      java.util.Collection<io.kubernetes.client.openapi.models.V1JSONSchemaProps> items) {
    if (this.allOf == null) {
      this.allOf =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1JSONSchemaProps item : items) {
      io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder builder =
          new io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder(item);
      _visitables.get("allOf").add(builder);
      this.allOf.add(builder);
    }
    return (A) this;
  }

  public A removeFromAllOf(io.kubernetes.client.openapi.models.V1JSONSchemaProps... items) {
    for (io.kubernetes.client.openapi.models.V1JSONSchemaProps item : items) {
      io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder builder =
          new io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder(item);
      _visitables.get("allOf").remove(builder);
      if (this.allOf != null) {
        this.allOf.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromAllOf(
      java.util.Collection<io.kubernetes.client.openapi.models.V1JSONSchemaProps> items) {
    for (io.kubernetes.client.openapi.models.V1JSONSchemaProps item : items) {
      io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder builder =
          new io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder(item);
      _visitables.get("allOf").remove(builder);
      if (this.allOf != null) {
        this.allOf.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromAllOf(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder>
          predicate) {
    if (allOf == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder> each =
        allOf.iterator();
    final List visitables = _visitables.get("allOf");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildAllOf instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1JSONSchemaProps> getAllOf() {
    return allOf != null ? build(allOf) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1JSONSchemaProps> buildAllOf() {
    return allOf != null ? build(allOf) : null;
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaProps buildAllOf(java.lang.Integer index) {
    return this.allOf.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaProps buildFirstAllOf() {
    return this.allOf.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaProps buildLastAllOf() {
    return this.allOf.get(allOf.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaProps buildMatchingAllOf(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder item : allOf) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingAllOf(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder item : allOf) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withAllOf(java.util.List<io.kubernetes.client.openapi.models.V1JSONSchemaProps> allOf) {
    if (this.allOf != null) {
      _visitables.get("allOf").removeAll(this.allOf);
    }
    if (allOf != null) {
      this.allOf = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1JSONSchemaProps item : allOf) {
        this.addToAllOf(item);
      }
    } else {
      this.allOf = null;
    }
    return (A) this;
  }

  public A withAllOf(io.kubernetes.client.openapi.models.V1JSONSchemaProps... allOf) {
    if (this.allOf != null) {
      this.allOf.clear();
    }
    if (allOf != null) {
      for (io.kubernetes.client.openapi.models.V1JSONSchemaProps item : allOf) {
        this.addToAllOf(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasAllOf() {
    return allOf != null && !allOf.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.AllOfNested<A> addNewAllOf() {
    return new io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluentImpl.AllOfNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.AllOfNested<A> addNewAllOfLike(
      io.kubernetes.client.openapi.models.V1JSONSchemaProps item) {
    return new io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluentImpl.AllOfNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.AllOfNested<A> setNewAllOfLike(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1JSONSchemaProps item) {
    return new io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluentImpl.AllOfNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.AllOfNested<A> editAllOf(
      java.lang.Integer index) {
    if (allOf.size() <= index) throw new RuntimeException("Can't edit allOf. Index exceeds size.");
    return setNewAllOfLike(index, buildAllOf(index));
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.AllOfNested<A>
      editFirstAllOf() {
    if (allOf.size() == 0) throw new RuntimeException("Can't edit first allOf. The list is empty.");
    return setNewAllOfLike(0, buildAllOf(0));
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.AllOfNested<A>
      editLastAllOf() {
    int index = allOf.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last allOf. The list is empty.");
    return setNewAllOfLike(index, buildAllOf(index));
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.AllOfNested<A>
      editMatchingAllOf(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < allOf.size(); i++) {
      if (predicate.test(allOf.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching allOf. No match found.");
    return setNewAllOfLike(index, buildAllOf(index));
  }

  public A addToAnyOf(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1JSONSchemaProps item) {
    if (this.anyOf == null) {
      this.anyOf =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder>();
    }
    io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder builder =
        new io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder(item);
    _visitables.get("anyOf").add(index >= 0 ? index : _visitables.get("anyOf").size(), builder);
    this.anyOf.add(index >= 0 ? index : anyOf.size(), builder);
    return (A) this;
  }

  public A setToAnyOf(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1JSONSchemaProps item) {
    if (this.anyOf == null) {
      this.anyOf =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder>();
    }
    io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder builder =
        new io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder(item);
    if (index < 0 || index >= _visitables.get("anyOf").size()) {
      _visitables.get("anyOf").add(builder);
    } else {
      _visitables.get("anyOf").set(index, builder);
    }
    if (index < 0 || index >= anyOf.size()) {
      anyOf.add(builder);
    } else {
      anyOf.set(index, builder);
    }
    return (A) this;
  }

  public A addToAnyOf(io.kubernetes.client.openapi.models.V1JSONSchemaProps... items) {
    if (this.anyOf == null) {
      this.anyOf =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1JSONSchemaProps item : items) {
      io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder builder =
          new io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder(item);
      _visitables.get("anyOf").add(builder);
      this.anyOf.add(builder);
    }
    return (A) this;
  }

  public A addAllToAnyOf(
      java.util.Collection<io.kubernetes.client.openapi.models.V1JSONSchemaProps> items) {
    if (this.anyOf == null) {
      this.anyOf =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1JSONSchemaProps item : items) {
      io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder builder =
          new io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder(item);
      _visitables.get("anyOf").add(builder);
      this.anyOf.add(builder);
    }
    return (A) this;
  }

  public A removeFromAnyOf(io.kubernetes.client.openapi.models.V1JSONSchemaProps... items) {
    for (io.kubernetes.client.openapi.models.V1JSONSchemaProps item : items) {
      io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder builder =
          new io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder(item);
      _visitables.get("anyOf").remove(builder);
      if (this.anyOf != null) {
        this.anyOf.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromAnyOf(
      java.util.Collection<io.kubernetes.client.openapi.models.V1JSONSchemaProps> items) {
    for (io.kubernetes.client.openapi.models.V1JSONSchemaProps item : items) {
      io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder builder =
          new io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder(item);
      _visitables.get("anyOf").remove(builder);
      if (this.anyOf != null) {
        this.anyOf.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromAnyOf(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder>
          predicate) {
    if (anyOf == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder> each =
        anyOf.iterator();
    final List visitables = _visitables.get("anyOf");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildAnyOf instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1JSONSchemaProps> getAnyOf() {
    return anyOf != null ? build(anyOf) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1JSONSchemaProps> buildAnyOf() {
    return anyOf != null ? build(anyOf) : null;
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaProps buildAnyOf(java.lang.Integer index) {
    return this.anyOf.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaProps buildFirstAnyOf() {
    return this.anyOf.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaProps buildLastAnyOf() {
    return this.anyOf.get(anyOf.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaProps buildMatchingAnyOf(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder item : anyOf) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingAnyOf(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder item : anyOf) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withAnyOf(java.util.List<io.kubernetes.client.openapi.models.V1JSONSchemaProps> anyOf) {
    if (this.anyOf != null) {
      _visitables.get("anyOf").removeAll(this.anyOf);
    }
    if (anyOf != null) {
      this.anyOf = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1JSONSchemaProps item : anyOf) {
        this.addToAnyOf(item);
      }
    } else {
      this.anyOf = null;
    }
    return (A) this;
  }

  public A withAnyOf(io.kubernetes.client.openapi.models.V1JSONSchemaProps... anyOf) {
    if (this.anyOf != null) {
      this.anyOf.clear();
    }
    if (anyOf != null) {
      for (io.kubernetes.client.openapi.models.V1JSONSchemaProps item : anyOf) {
        this.addToAnyOf(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasAnyOf() {
    return anyOf != null && !anyOf.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.AnyOfNested<A> addNewAnyOf() {
    return new io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluentImpl.AnyOfNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.AnyOfNested<A> addNewAnyOfLike(
      io.kubernetes.client.openapi.models.V1JSONSchemaProps item) {
    return new io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluentImpl.AnyOfNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.AnyOfNested<A> setNewAnyOfLike(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1JSONSchemaProps item) {
    return new io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluentImpl.AnyOfNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.AnyOfNested<A> editAnyOf(
      java.lang.Integer index) {
    if (anyOf.size() <= index) throw new RuntimeException("Can't edit anyOf. Index exceeds size.");
    return setNewAnyOfLike(index, buildAnyOf(index));
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.AnyOfNested<A>
      editFirstAnyOf() {
    if (anyOf.size() == 0) throw new RuntimeException("Can't edit first anyOf. The list is empty.");
    return setNewAnyOfLike(0, buildAnyOf(0));
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.AnyOfNested<A>
      editLastAnyOf() {
    int index = anyOf.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last anyOf. The list is empty.");
    return setNewAnyOfLike(index, buildAnyOf(index));
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.AnyOfNested<A>
      editMatchingAnyOf(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < anyOf.size(); i++) {
      if (predicate.test(anyOf.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching anyOf. No match found.");
    return setNewAnyOfLike(index, buildAnyOf(index));
  }

  public java.lang.Object getDefault() {
    return this._default;
  }

  public A withDefault(java.lang.Object _default) {
    this._default = _default;
    return (A) this;
  }

  public java.lang.Boolean hasDefault() {
    return this._default != null;
  }

  public A addToDefinitions(
      java.lang.String key, io.kubernetes.client.openapi.models.V1JSONSchemaProps value) {
    if (this.definitions == null && key != null && value != null) {
      this.definitions = new java.util.LinkedHashMap();
    }
    if (key != null && value != null) {
      this.definitions.put(key, value);
    }
    return (A) this;
  }

  public A addToDefinitions(
      java.util.Map<java.lang.String, io.kubernetes.client.openapi.models.V1JSONSchemaProps> map) {
    if (this.definitions == null && map != null) {
      this.definitions = new java.util.LinkedHashMap();
    }
    if (map != null) {
      this.definitions.putAll(map);
    }
    return (A) this;
  }

  public A removeFromDefinitions(java.lang.String key) {
    if (this.definitions == null) {
      return (A) this;
    }
    if (key != null && this.definitions != null) {
      this.definitions.remove(key);
    }
    return (A) this;
  }

  public A removeFromDefinitions(
      java.util.Map<java.lang.String, io.kubernetes.client.openapi.models.V1JSONSchemaProps> map) {
    if (this.definitions == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.definitions != null) {
          this.definitions.remove(key);
        }
      }
    }
    return (A) this;
  }

  public java.util.Map<java.lang.String, io.kubernetes.client.openapi.models.V1JSONSchemaProps>
      getDefinitions() {
    return this.definitions;
  }

  public <K, V> A withDefinitions(
      java.util.Map<java.lang.String, io.kubernetes.client.openapi.models.V1JSONSchemaProps>
          definitions) {
    if (definitions == null) {
      this.definitions = null;
    } else {
      this.definitions = new java.util.LinkedHashMap(definitions);
    }
    return (A) this;
  }

  public java.lang.Boolean hasDefinitions() {
    return this.definitions != null;
  }

  public A addToDependencies(java.lang.String key, java.lang.Object value) {
    if (this.dependencies == null && key != null && value != null) {
      this.dependencies = new java.util.LinkedHashMap();
    }
    if (key != null && value != null) {
      this.dependencies.put(key, value);
    }
    return (A) this;
  }

  public A addToDependencies(java.util.Map<java.lang.String, java.lang.Object> map) {
    if (this.dependencies == null && map != null) {
      this.dependencies = new java.util.LinkedHashMap();
    }
    if (map != null) {
      this.dependencies.putAll(map);
    }
    return (A) this;
  }

  public A removeFromDependencies(java.lang.String key) {
    if (this.dependencies == null) {
      return (A) this;
    }
    if (key != null && this.dependencies != null) {
      this.dependencies.remove(key);
    }
    return (A) this;
  }

  public A removeFromDependencies(java.util.Map<java.lang.String, java.lang.Object> map) {
    if (this.dependencies == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.dependencies != null) {
          this.dependencies.remove(key);
        }
      }
    }
    return (A) this;
  }

  public java.util.Map<java.lang.String, java.lang.Object> getDependencies() {
    return this.dependencies;
  }

  public <K, V> A withDependencies(java.util.Map<java.lang.String, java.lang.Object> dependencies) {
    if (dependencies == null) {
      this.dependencies = null;
    } else {
      this.dependencies = new java.util.LinkedHashMap(dependencies);
    }
    return (A) this;
  }

  public java.lang.Boolean hasDependencies() {
    return this.dependencies != null;
  }

  public java.lang.String getDescription() {
    return this.description;
  }

  public A withDescription(java.lang.String description) {
    this.description = description;
    return (A) this;
  }

  public java.lang.Boolean hasDescription() {
    return this.description != null;
  }

  /** Method is deprecated. use withDescription instead. */
  @java.lang.Deprecated
  public A withNewDescription(java.lang.String original) {
    return (A) withDescription(new String(original));
  }

  public A addToEnum(java.lang.Integer index, java.lang.Object item) {
    if (this._enum == null) {
      this._enum = new java.util.ArrayList<java.lang.Object>();
    }
    this._enum.add(index, item);
    return (A) this;
  }

  public A setToEnum(java.lang.Integer index, java.lang.Object item) {
    if (this._enum == null) {
      this._enum = new java.util.ArrayList<java.lang.Object>();
    }
    this._enum.set(index, item);
    return (A) this;
  }

  public A addToEnum(java.lang.Object... items) {
    if (this._enum == null) {
      this._enum = new java.util.ArrayList<java.lang.Object>();
    }
    for (java.lang.Object item : items) {
      this._enum.add(item);
    }
    return (A) this;
  }

  public A addAllToEnum(java.util.Collection<java.lang.Object> items) {
    if (this._enum == null) {
      this._enum = new java.util.ArrayList<java.lang.Object>();
    }
    for (java.lang.Object item : items) {
      this._enum.add(item);
    }
    return (A) this;
  }

  public A removeFromEnum(java.lang.Object... items) {
    for (java.lang.Object item : items) {
      if (this._enum != null) {
        this._enum.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromEnum(java.util.Collection<java.lang.Object> items) {
    for (java.lang.Object item : items) {
      if (this._enum != null) {
        this._enum.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.Object> getEnum() {
    return this._enum;
  }

  public java.lang.Object getEnum(java.lang.Integer index) {
    return this._enum.get(index);
  }

  public java.lang.Object getFirstEnum() {
    return this._enum.get(0);
  }

  public java.lang.Object getLastEnum() {
    return this._enum.get(_enum.size() - 1);
  }

  public java.lang.Object getMatchingEnum(
      java.util.function.Predicate<java.lang.Object> predicate) {
    for (java.lang.Object item : _enum) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingEnum(
      java.util.function.Predicate<java.lang.Object> predicate) {
    for (java.lang.Object item : _enum) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withEnum(java.util.List<java.lang.Object> _enum) {
    if (_enum != null) {
      this._enum = new java.util.ArrayList();
      for (java.lang.Object item : _enum) {
        this.addToEnum(item);
      }
    } else {
      this._enum = null;
    }
    return (A) this;
  }

  public A withEnum(java.lang.Object... _enum) {
    if (this._enum != null) {
      this._enum.clear();
    }
    if (_enum != null) {
      for (java.lang.Object item : _enum) {
        this.addToEnum(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasEnum() {
    return _enum != null && !_enum.isEmpty();
  }

  public java.lang.Object getExample() {
    return this.example;
  }

  public A withExample(java.lang.Object example) {
    this.example = example;
    return (A) this;
  }

  public java.lang.Boolean hasExample() {
    return this.example != null;
  }

  public java.lang.Boolean getExclusiveMaximum() {
    return this.exclusiveMaximum;
  }

  public A withExclusiveMaximum(java.lang.Boolean exclusiveMaximum) {
    this.exclusiveMaximum = exclusiveMaximum;
    return (A) this;
  }

  public java.lang.Boolean hasExclusiveMaximum() {
    return this.exclusiveMaximum != null;
  }

  public java.lang.Boolean getExclusiveMinimum() {
    return this.exclusiveMinimum;
  }

  public A withExclusiveMinimum(java.lang.Boolean exclusiveMinimum) {
    this.exclusiveMinimum = exclusiveMinimum;
    return (A) this;
  }

  public java.lang.Boolean hasExclusiveMinimum() {
    return this.exclusiveMinimum != null;
  }

  /**
   * This method has been deprecated, please use method buildExternalDocs instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ExternalDocumentation getExternalDocs() {
    return this.externalDocs != null ? this.externalDocs.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ExternalDocumentation buildExternalDocs() {
    return this.externalDocs != null ? this.externalDocs.build() : null;
  }

  public A withExternalDocs(
      io.kubernetes.client.openapi.models.V1ExternalDocumentation externalDocs) {
    _visitables.get("externalDocs").remove(this.externalDocs);
    if (externalDocs != null) {
      this.externalDocs =
          new io.kubernetes.client.openapi.models.V1ExternalDocumentationBuilder(externalDocs);
      _visitables.get("externalDocs").add(this.externalDocs);
    }
    return (A) this;
  }

  public java.lang.Boolean hasExternalDocs() {
    return this.externalDocs != null;
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.ExternalDocsNested<A>
      withNewExternalDocs() {
    return new io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluentImpl
        .ExternalDocsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.ExternalDocsNested<A>
      withNewExternalDocsLike(io.kubernetes.client.openapi.models.V1ExternalDocumentation item) {
    return new io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluentImpl
        .ExternalDocsNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.ExternalDocsNested<A>
      editExternalDocs() {
    return withNewExternalDocsLike(getExternalDocs());
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.ExternalDocsNested<A>
      editOrNewExternalDocs() {
    return withNewExternalDocsLike(
        getExternalDocs() != null
            ? getExternalDocs()
            : new io.kubernetes.client.openapi.models.V1ExternalDocumentationBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.ExternalDocsNested<A>
      editOrNewExternalDocsLike(io.kubernetes.client.openapi.models.V1ExternalDocumentation item) {
    return withNewExternalDocsLike(getExternalDocs() != null ? getExternalDocs() : item);
  }

  public java.lang.String getFormat() {
    return this.format;
  }

  public A withFormat(java.lang.String format) {
    this.format = format;
    return (A) this;
  }

  public java.lang.Boolean hasFormat() {
    return this.format != null;
  }

  /** Method is deprecated. use withFormat instead. */
  @java.lang.Deprecated
  public A withNewFormat(java.lang.String original) {
    return (A) withFormat(new String(original));
  }

  public java.lang.String getId() {
    return this.id;
  }

  public A withId(java.lang.String id) {
    this.id = id;
    return (A) this;
  }

  public java.lang.Boolean hasId() {
    return this.id != null;
  }

  /** Method is deprecated. use withId instead. */
  @java.lang.Deprecated
  public A withNewId(java.lang.String original) {
    return (A) withId(new String(original));
  }

  public java.lang.Object getItems() {
    return this.items;
  }

  public A withItems(java.lang.Object items) {
    this.items = items;
    return (A) this;
  }

  public java.lang.Boolean hasItems() {
    return this.items != null;
  }

  public java.lang.Long getMaxItems() {
    return this.maxItems;
  }

  public A withMaxItems(java.lang.Long maxItems) {
    this.maxItems = maxItems;
    return (A) this;
  }

  public java.lang.Boolean hasMaxItems() {
    return this.maxItems != null;
  }

  public java.lang.Long getMaxLength() {
    return this.maxLength;
  }

  public A withMaxLength(java.lang.Long maxLength) {
    this.maxLength = maxLength;
    return (A) this;
  }

  public java.lang.Boolean hasMaxLength() {
    return this.maxLength != null;
  }

  public java.lang.Long getMaxProperties() {
    return this.maxProperties;
  }

  public A withMaxProperties(java.lang.Long maxProperties) {
    this.maxProperties = maxProperties;
    return (A) this;
  }

  public java.lang.Boolean hasMaxProperties() {
    return this.maxProperties != null;
  }

  public java.lang.Double getMaximum() {
    return this.maximum;
  }

  public A withMaximum(java.lang.Double maximum) {
    this.maximum = maximum;
    return (A) this;
  }

  public java.lang.Boolean hasMaximum() {
    return this.maximum != null;
  }

  public java.lang.Long getMinItems() {
    return this.minItems;
  }

  public A withMinItems(java.lang.Long minItems) {
    this.minItems = minItems;
    return (A) this;
  }

  public java.lang.Boolean hasMinItems() {
    return this.minItems != null;
  }

  public java.lang.Long getMinLength() {
    return this.minLength;
  }

  public A withMinLength(java.lang.Long minLength) {
    this.minLength = minLength;
    return (A) this;
  }

  public java.lang.Boolean hasMinLength() {
    return this.minLength != null;
  }

  public java.lang.Long getMinProperties() {
    return this.minProperties;
  }

  public A withMinProperties(java.lang.Long minProperties) {
    this.minProperties = minProperties;
    return (A) this;
  }

  public java.lang.Boolean hasMinProperties() {
    return this.minProperties != null;
  }

  public java.lang.Double getMinimum() {
    return this.minimum;
  }

  public A withMinimum(java.lang.Double minimum) {
    this.minimum = minimum;
    return (A) this;
  }

  public java.lang.Boolean hasMinimum() {
    return this.minimum != null;
  }

  public java.lang.Double getMultipleOf() {
    return this.multipleOf;
  }

  public A withMultipleOf(java.lang.Double multipleOf) {
    this.multipleOf = multipleOf;
    return (A) this;
  }

  public java.lang.Boolean hasMultipleOf() {
    return this.multipleOf != null;
  }

  /**
   * This method has been deprecated, please use method buildNot instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1JSONSchemaProps getNot() {
    return this.not != null ? this.not.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaProps buildNot() {
    return this.not != null ? this.not.build() : null;
  }

  public A withNot(io.kubernetes.client.openapi.models.V1JSONSchemaProps not) {
    _visitables.get("not").remove(this.not);
    if (not != null) {
      this.not = new io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder(not);
      _visitables.get("not").add(this.not);
    }
    return (A) this;
  }

  public java.lang.Boolean hasNot() {
    return this.not != null;
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.NotNested<A> withNewNot() {
    return new io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluentImpl.NotNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.NotNested<A> withNewNotLike(
      io.kubernetes.client.openapi.models.V1JSONSchemaProps item) {
    return new io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluentImpl.NotNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.NotNested<A> editNot() {
    return withNewNotLike(getNot());
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.NotNested<A> editOrNewNot() {
    return withNewNotLike(
        getNot() != null
            ? getNot()
            : new io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.NotNested<A> editOrNewNotLike(
      io.kubernetes.client.openapi.models.V1JSONSchemaProps item) {
    return withNewNotLike(getNot() != null ? getNot() : item);
  }

  public java.lang.Boolean getNullable() {
    return this.nullable;
  }

  public A withNullable(java.lang.Boolean nullable) {
    this.nullable = nullable;
    return (A) this;
  }

  public java.lang.Boolean hasNullable() {
    return this.nullable != null;
  }

  public A addToOneOf(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1JSONSchemaProps item) {
    if (this.oneOf == null) {
      this.oneOf =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder>();
    }
    io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder builder =
        new io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder(item);
    _visitables.get("oneOf").add(index >= 0 ? index : _visitables.get("oneOf").size(), builder);
    this.oneOf.add(index >= 0 ? index : oneOf.size(), builder);
    return (A) this;
  }

  public A setToOneOf(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1JSONSchemaProps item) {
    if (this.oneOf == null) {
      this.oneOf =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder>();
    }
    io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder builder =
        new io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder(item);
    if (index < 0 || index >= _visitables.get("oneOf").size()) {
      _visitables.get("oneOf").add(builder);
    } else {
      _visitables.get("oneOf").set(index, builder);
    }
    if (index < 0 || index >= oneOf.size()) {
      oneOf.add(builder);
    } else {
      oneOf.set(index, builder);
    }
    return (A) this;
  }

  public A addToOneOf(io.kubernetes.client.openapi.models.V1JSONSchemaProps... items) {
    if (this.oneOf == null) {
      this.oneOf =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1JSONSchemaProps item : items) {
      io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder builder =
          new io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder(item);
      _visitables.get("oneOf").add(builder);
      this.oneOf.add(builder);
    }
    return (A) this;
  }

  public A addAllToOneOf(
      java.util.Collection<io.kubernetes.client.openapi.models.V1JSONSchemaProps> items) {
    if (this.oneOf == null) {
      this.oneOf =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1JSONSchemaProps item : items) {
      io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder builder =
          new io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder(item);
      _visitables.get("oneOf").add(builder);
      this.oneOf.add(builder);
    }
    return (A) this;
  }

  public A removeFromOneOf(io.kubernetes.client.openapi.models.V1JSONSchemaProps... items) {
    for (io.kubernetes.client.openapi.models.V1JSONSchemaProps item : items) {
      io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder builder =
          new io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder(item);
      _visitables.get("oneOf").remove(builder);
      if (this.oneOf != null) {
        this.oneOf.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromOneOf(
      java.util.Collection<io.kubernetes.client.openapi.models.V1JSONSchemaProps> items) {
    for (io.kubernetes.client.openapi.models.V1JSONSchemaProps item : items) {
      io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder builder =
          new io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder(item);
      _visitables.get("oneOf").remove(builder);
      if (this.oneOf != null) {
        this.oneOf.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromOneOf(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder>
          predicate) {
    if (oneOf == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder> each =
        oneOf.iterator();
    final List visitables = _visitables.get("oneOf");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildOneOf instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1JSONSchemaProps> getOneOf() {
    return oneOf != null ? build(oneOf) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1JSONSchemaProps> buildOneOf() {
    return oneOf != null ? build(oneOf) : null;
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaProps buildOneOf(java.lang.Integer index) {
    return this.oneOf.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaProps buildFirstOneOf() {
    return this.oneOf.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaProps buildLastOneOf() {
    return this.oneOf.get(oneOf.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaProps buildMatchingOneOf(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder item : oneOf) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingOneOf(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder item : oneOf) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withOneOf(java.util.List<io.kubernetes.client.openapi.models.V1JSONSchemaProps> oneOf) {
    if (this.oneOf != null) {
      _visitables.get("oneOf").removeAll(this.oneOf);
    }
    if (oneOf != null) {
      this.oneOf = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1JSONSchemaProps item : oneOf) {
        this.addToOneOf(item);
      }
    } else {
      this.oneOf = null;
    }
    return (A) this;
  }

  public A withOneOf(io.kubernetes.client.openapi.models.V1JSONSchemaProps... oneOf) {
    if (this.oneOf != null) {
      this.oneOf.clear();
    }
    if (oneOf != null) {
      for (io.kubernetes.client.openapi.models.V1JSONSchemaProps item : oneOf) {
        this.addToOneOf(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasOneOf() {
    return oneOf != null && !oneOf.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.OneOfNested<A> addNewOneOf() {
    return new io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluentImpl.OneOfNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.OneOfNested<A> addNewOneOfLike(
      io.kubernetes.client.openapi.models.V1JSONSchemaProps item) {
    return new io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluentImpl.OneOfNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.OneOfNested<A> setNewOneOfLike(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1JSONSchemaProps item) {
    return new io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluentImpl.OneOfNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.OneOfNested<A> editOneOf(
      java.lang.Integer index) {
    if (oneOf.size() <= index) throw new RuntimeException("Can't edit oneOf. Index exceeds size.");
    return setNewOneOfLike(index, buildOneOf(index));
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.OneOfNested<A>
      editFirstOneOf() {
    if (oneOf.size() == 0) throw new RuntimeException("Can't edit first oneOf. The list is empty.");
    return setNewOneOfLike(0, buildOneOf(0));
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.OneOfNested<A>
      editLastOneOf() {
    int index = oneOf.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last oneOf. The list is empty.");
    return setNewOneOfLike(index, buildOneOf(index));
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.OneOfNested<A>
      editMatchingOneOf(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < oneOf.size(); i++) {
      if (predicate.test(oneOf.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching oneOf. No match found.");
    return setNewOneOfLike(index, buildOneOf(index));
  }

  public java.lang.String getPattern() {
    return this.pattern;
  }

  public A withPattern(java.lang.String pattern) {
    this.pattern = pattern;
    return (A) this;
  }

  public java.lang.Boolean hasPattern() {
    return this.pattern != null;
  }

  /** Method is deprecated. use withPattern instead. */
  @java.lang.Deprecated
  public A withNewPattern(java.lang.String original) {
    return (A) withPattern(new String(original));
  }

  public A addToPatternProperties(
      java.lang.String key, io.kubernetes.client.openapi.models.V1JSONSchemaProps value) {
    if (this.patternProperties == null && key != null && value != null) {
      this.patternProperties = new java.util.LinkedHashMap();
    }
    if (key != null && value != null) {
      this.patternProperties.put(key, value);
    }
    return (A) this;
  }

  public A addToPatternProperties(
      java.util.Map<java.lang.String, io.kubernetes.client.openapi.models.V1JSONSchemaProps> map) {
    if (this.patternProperties == null && map != null) {
      this.patternProperties = new java.util.LinkedHashMap();
    }
    if (map != null) {
      this.patternProperties.putAll(map);
    }
    return (A) this;
  }

  public A removeFromPatternProperties(java.lang.String key) {
    if (this.patternProperties == null) {
      return (A) this;
    }
    if (key != null && this.patternProperties != null) {
      this.patternProperties.remove(key);
    }
    return (A) this;
  }

  public A removeFromPatternProperties(
      java.util.Map<java.lang.String, io.kubernetes.client.openapi.models.V1JSONSchemaProps> map) {
    if (this.patternProperties == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.patternProperties != null) {
          this.patternProperties.remove(key);
        }
      }
    }
    return (A) this;
  }

  public java.util.Map<java.lang.String, io.kubernetes.client.openapi.models.V1JSONSchemaProps>
      getPatternProperties() {
    return this.patternProperties;
  }

  public <K, V> A withPatternProperties(
      java.util.Map<java.lang.String, io.kubernetes.client.openapi.models.V1JSONSchemaProps>
          patternProperties) {
    if (patternProperties == null) {
      this.patternProperties = null;
    } else {
      this.patternProperties = new java.util.LinkedHashMap(patternProperties);
    }
    return (A) this;
  }

  public java.lang.Boolean hasPatternProperties() {
    return this.patternProperties != null;
  }

  public A addToProperties(
      java.lang.String key, io.kubernetes.client.openapi.models.V1JSONSchemaProps value) {
    if (this.properties == null && key != null && value != null) {
      this.properties = new java.util.LinkedHashMap();
    }
    if (key != null && value != null) {
      this.properties.put(key, value);
    }
    return (A) this;
  }

  public A addToProperties(
      java.util.Map<java.lang.String, io.kubernetes.client.openapi.models.V1JSONSchemaProps> map) {
    if (this.properties == null && map != null) {
      this.properties = new java.util.LinkedHashMap();
    }
    if (map != null) {
      this.properties.putAll(map);
    }
    return (A) this;
  }

  public A removeFromProperties(java.lang.String key) {
    if (this.properties == null) {
      return (A) this;
    }
    if (key != null && this.properties != null) {
      this.properties.remove(key);
    }
    return (A) this;
  }

  public A removeFromProperties(
      java.util.Map<java.lang.String, io.kubernetes.client.openapi.models.V1JSONSchemaProps> map) {
    if (this.properties == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.properties != null) {
          this.properties.remove(key);
        }
      }
    }
    return (A) this;
  }

  public java.util.Map<java.lang.String, io.kubernetes.client.openapi.models.V1JSONSchemaProps>
      getProperties() {
    return this.properties;
  }

  public <K, V> A withProperties(
      java.util.Map<java.lang.String, io.kubernetes.client.openapi.models.V1JSONSchemaProps>
          properties) {
    if (properties == null) {
      this.properties = null;
    } else {
      this.properties = new java.util.LinkedHashMap(properties);
    }
    return (A) this;
  }

  public java.lang.Boolean hasProperties() {
    return this.properties != null;
  }

  public A addToRequired(java.lang.Integer index, java.lang.String item) {
    if (this.required == null) {
      this.required = new java.util.ArrayList<java.lang.String>();
    }
    this.required.add(index, item);
    return (A) this;
  }

  public A setToRequired(java.lang.Integer index, java.lang.String item) {
    if (this.required == null) {
      this.required = new java.util.ArrayList<java.lang.String>();
    }
    this.required.set(index, item);
    return (A) this;
  }

  public A addToRequired(java.lang.String... items) {
    if (this.required == null) {
      this.required = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.required.add(item);
    }
    return (A) this;
  }

  public A addAllToRequired(java.util.Collection<java.lang.String> items) {
    if (this.required == null) {
      this.required = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.required.add(item);
    }
    return (A) this;
  }

  public A removeFromRequired(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.required != null) {
        this.required.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromRequired(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.required != null) {
        this.required.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getRequired() {
    return this.required;
  }

  public java.lang.String getRequired(java.lang.Integer index) {
    return this.required.get(index);
  }

  public java.lang.String getFirstRequired() {
    return this.required.get(0);
  }

  public java.lang.String getLastRequired() {
    return this.required.get(required.size() - 1);
  }

  public java.lang.String getMatchingRequired(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : required) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingRequired(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : required) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withRequired(java.util.List<java.lang.String> required) {
    if (required != null) {
      this.required = new java.util.ArrayList();
      for (java.lang.String item : required) {
        this.addToRequired(item);
      }
    } else {
      this.required = null;
    }
    return (A) this;
  }

  public A withRequired(java.lang.String... required) {
    if (this.required != null) {
      this.required.clear();
    }
    if (required != null) {
      for (java.lang.String item : required) {
        this.addToRequired(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasRequired() {
    return required != null && !required.isEmpty();
  }

  public A addNewRequired(java.lang.String original) {
    return (A) addToRequired(new String(original));
  }

  public java.lang.String getTitle() {
    return this.title;
  }

  public A withTitle(java.lang.String title) {
    this.title = title;
    return (A) this;
  }

  public java.lang.Boolean hasTitle() {
    return this.title != null;
  }

  /** Method is deprecated. use withTitle instead. */
  @java.lang.Deprecated
  public A withNewTitle(java.lang.String original) {
    return (A) withTitle(new String(original));
  }

  public java.lang.String getType() {
    return this.type;
  }

  public A withType(java.lang.String type) {
    this.type = type;
    return (A) this;
  }

  public java.lang.Boolean hasType() {
    return this.type != null;
  }

  /** Method is deprecated. use withType instead. */
  @java.lang.Deprecated
  public A withNewType(java.lang.String original) {
    return (A) withType(new String(original));
  }

  public java.lang.Boolean getUniqueItems() {
    return this.uniqueItems;
  }

  public A withUniqueItems(java.lang.Boolean uniqueItems) {
    this.uniqueItems = uniqueItems;
    return (A) this;
  }

  public java.lang.Boolean hasUniqueItems() {
    return this.uniqueItems != null;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1JSONSchemaPropsFluentImpl that = (V1JSONSchemaPropsFluentImpl) o;
    if ($ref != null ? !$ref.equals(that.$ref) : that.$ref != null) return false;
    if ($schema != null ? !$schema.equals(that.$schema) : that.$schema != null) return false;
    if (additionalItems != null
        ? !additionalItems.equals(that.additionalItems)
        : that.additionalItems != null) return false;
    if (additionalProperties != null
        ? !additionalProperties.equals(that.additionalProperties)
        : that.additionalProperties != null) return false;
    if (allOf != null ? !allOf.equals(that.allOf) : that.allOf != null) return false;
    if (anyOf != null ? !anyOf.equals(that.anyOf) : that.anyOf != null) return false;
    if (_default != null ? !_default.equals(that._default) : that._default != null) return false;
    if (definitions != null ? !definitions.equals(that.definitions) : that.definitions != null)
      return false;
    if (dependencies != null ? !dependencies.equals(that.dependencies) : that.dependencies != null)
      return false;
    if (description != null ? !description.equals(that.description) : that.description != null)
      return false;
    if (_enum != null ? !_enum.equals(that._enum) : that._enum != null) return false;
    if (example != null ? !example.equals(that.example) : that.example != null) return false;
    if (exclusiveMaximum != null
        ? !exclusiveMaximum.equals(that.exclusiveMaximum)
        : that.exclusiveMaximum != null) return false;
    if (exclusiveMinimum != null
        ? !exclusiveMinimum.equals(that.exclusiveMinimum)
        : that.exclusiveMinimum != null) return false;
    if (externalDocs != null ? !externalDocs.equals(that.externalDocs) : that.externalDocs != null)
      return false;
    if (format != null ? !format.equals(that.format) : that.format != null) return false;
    if (id != null ? !id.equals(that.id) : that.id != null) return false;
    if (items != null ? !items.equals(that.items) : that.items != null) return false;
    if (maxItems != null ? !maxItems.equals(that.maxItems) : that.maxItems != null) return false;
    if (maxLength != null ? !maxLength.equals(that.maxLength) : that.maxLength != null)
      return false;
    if (maxProperties != null
        ? !maxProperties.equals(that.maxProperties)
        : that.maxProperties != null) return false;
    if (maximum != null ? !maximum.equals(that.maximum) : that.maximum != null) return false;
    if (minItems != null ? !minItems.equals(that.minItems) : that.minItems != null) return false;
    if (minLength != null ? !minLength.equals(that.minLength) : that.minLength != null)
      return false;
    if (minProperties != null
        ? !minProperties.equals(that.minProperties)
        : that.minProperties != null) return false;
    if (minimum != null ? !minimum.equals(that.minimum) : that.minimum != null) return false;
    if (multipleOf != null ? !multipleOf.equals(that.multipleOf) : that.multipleOf != null)
      return false;
    if (not != null ? !not.equals(that.not) : that.not != null) return false;
    if (nullable != null ? !nullable.equals(that.nullable) : that.nullable != null) return false;
    if (oneOf != null ? !oneOf.equals(that.oneOf) : that.oneOf != null) return false;
    if (pattern != null ? !pattern.equals(that.pattern) : that.pattern != null) return false;
    if (patternProperties != null
        ? !patternProperties.equals(that.patternProperties)
        : that.patternProperties != null) return false;
    if (properties != null ? !properties.equals(that.properties) : that.properties != null)
      return false;
    if (required != null ? !required.equals(that.required) : that.required != null) return false;
    if (title != null ? !title.equals(that.title) : that.title != null) return false;
    if (type != null ? !type.equals(that.type) : that.type != null) return false;
    if (uniqueItems != null ? !uniqueItems.equals(that.uniqueItems) : that.uniqueItems != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        $ref,
        $schema,
        additionalItems,
        additionalProperties,
        allOf,
        anyOf,
        _default,
        definitions,
        dependencies,
        description,
        _enum,
        example,
        exclusiveMaximum,
        exclusiveMinimum,
        externalDocs,
        format,
        id,
        items,
        maxItems,
        maxLength,
        maxProperties,
        maximum,
        minItems,
        minLength,
        minProperties,
        minimum,
        multipleOf,
        not,
        nullable,
        oneOf,
        pattern,
        patternProperties,
        properties,
        required,
        title,
        type,
        uniqueItems,
        super.hashCode());
  }

  public class AllOfNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluentImpl<
          io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.AllOfNested<N>>
      implements io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.AllOfNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    AllOfNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1JSONSchemaProps item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder(this, item);
    }

    AllOfNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1JSONSchemaPropsFluentImpl.this.setToAllOf(index, builder.build());
    }

    public N endAllOf() {
      return and();
    }
  }

  public class AnyOfNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluentImpl<
          io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.AnyOfNested<N>>
      implements io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.AnyOfNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    AnyOfNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1JSONSchemaProps item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder(this, item);
    }

    AnyOfNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1JSONSchemaPropsFluentImpl.this.setToAnyOf(index, builder.build());
    }

    public N endAnyOf() {
      return and();
    }
  }

  public class ExternalDocsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ExternalDocumentationFluentImpl<
          io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.ExternalDocsNested<N>>
      implements io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.ExternalDocsNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    ExternalDocsNestedImpl(io.kubernetes.client.openapi.models.V1ExternalDocumentation item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1ExternalDocumentationBuilder(this, item);
    }

    ExternalDocsNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ExternalDocumentationBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ExternalDocumentationBuilder builder;

    public N and() {
      return (N) V1JSONSchemaPropsFluentImpl.this.withExternalDocs(builder.build());
    }

    public N endExternalDocs() {
      return and();
    }
  }

  public class NotNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluentImpl<
          io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.NotNested<N>>
      implements io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.NotNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    NotNestedImpl(io.kubernetes.client.openapi.models.V1JSONSchemaProps item) {
      this.builder = new io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder(this, item);
    }

    NotNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder builder;

    public N and() {
      return (N) V1JSONSchemaPropsFluentImpl.this.withNot(builder.build());
    }

    public N endNot() {
      return and();
    }
  }

  public class OneOfNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluentImpl<
          io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.OneOfNested<N>>
      implements io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.OneOfNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    OneOfNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1JSONSchemaProps item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder(this, item);
    }

    OneOfNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1JSONSchemaPropsFluentImpl.this.setToOneOf(index, builder.build());
    }

    public N endOneOf() {
      return and();
    }
  }
}
