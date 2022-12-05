package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1JSONSchemaPropsBuilder extends V1JSONSchemaPropsFluentImpl<V1JSONSchemaPropsBuilder> implements VisitableBuilder<V1JSONSchemaProps,V1JSONSchemaPropsBuilder>{
  public V1JSONSchemaPropsBuilder() {
    this(false);
  }
  public V1JSONSchemaPropsBuilder(Boolean validationEnabled) {
    this(new V1JSONSchemaProps(), validationEnabled);
  }
  public V1JSONSchemaPropsBuilder(V1JSONSchemaPropsFluent<?> fluent) {
    this(fluent, false);
  }
  public V1JSONSchemaPropsBuilder(V1JSONSchemaPropsFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1JSONSchemaProps(), validationEnabled);
  }
  public V1JSONSchemaPropsBuilder(V1JSONSchemaPropsFluent<?> fluent,V1JSONSchemaProps instance) {
    this(fluent, instance, false);
  }
  public V1JSONSchemaPropsBuilder(V1JSONSchemaPropsFluent<?> fluent,V1JSONSchemaProps instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withRef(instance.get$Ref());

    fluent.withSchema(instance.get$Schema());

    fluent.withAdditionalItems(instance.getAdditionalItems());

    fluent.withAdditionalProperties(instance.getAdditionalProperties());

    fluent.withAllOf(instance.getAllOf());

    fluent.withAnyOf(instance.getAnyOf());

    fluent.withDefault(instance.getDefault());

    fluent.withDefinitions(instance.getDefinitions());

    fluent.withDependencies(instance.getDependencies());

    fluent.withDescription(instance.getDescription());

    fluent.withEnum(instance.getEnum());

    fluent.withExample(instance.getExample());

    fluent.withExclusiveMaximum(instance.getExclusiveMaximum());

    fluent.withExclusiveMinimum(instance.getExclusiveMinimum());

    fluent.withExternalDocs(instance.getExternalDocs());

    fluent.withFormat(instance.getFormat());

    fluent.withId(instance.getId());

    fluent.withItems(instance.getItems());

    fluent.withMaxItems(instance.getMaxItems());

    fluent.withMaxLength(instance.getMaxLength());

    fluent.withMaxProperties(instance.getMaxProperties());

    fluent.withMaximum(instance.getMaximum());

    fluent.withMinItems(instance.getMinItems());

    fluent.withMinLength(instance.getMinLength());

    fluent.withMinProperties(instance.getMinProperties());

    fluent.withMinimum(instance.getMinimum());

    fluent.withMultipleOf(instance.getMultipleOf());

    fluent.withNot(instance.getNot());

    fluent.withNullable(instance.getNullable());

    fluent.withOneOf(instance.getOneOf());

    fluent.withPattern(instance.getPattern());

    fluent.withPatternProperties(instance.getPatternProperties());

    fluent.withProperties(instance.getProperties());

    fluent.withRequired(instance.getRequired());

    fluent.withTitle(instance.getTitle());

    fluent.withType(instance.getType());

    fluent.withUniqueItems(instance.getUniqueItems());

    this.validationEnabled = validationEnabled; 
  }
  public V1JSONSchemaPropsBuilder(V1JSONSchemaProps instance) {
    this(instance,false);
  }
  public V1JSONSchemaPropsBuilder(V1JSONSchemaProps instance,Boolean validationEnabled) {
    this.fluent = this; 
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

    this.validationEnabled = validationEnabled; 
  }
  V1JSONSchemaPropsFluent<?> fluent;
  Boolean validationEnabled;
  public V1JSONSchemaProps build() {
    V1JSONSchemaProps buildable = new V1JSONSchemaProps();
    buildable.set$Ref(fluent.getRef());
    buildable.set$Schema(fluent.getSchema());
    buildable.setAdditionalItems(fluent.getAdditionalItems());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    buildable.setAllOf(fluent.getAllOf());
    buildable.setAnyOf(fluent.getAnyOf());
    buildable.setDefault(fluent.getDefault());
    buildable.setDefinitions(fluent.getDefinitions());
    buildable.setDependencies(fluent.getDependencies());
    buildable.setDescription(fluent.getDescription());
    buildable.setEnum(fluent.getEnum());
    buildable.setExample(fluent.getExample());
    buildable.setExclusiveMaximum(fluent.getExclusiveMaximum());
    buildable.setExclusiveMinimum(fluent.getExclusiveMinimum());
    buildable.setExternalDocs(fluent.getExternalDocs());
    buildable.setFormat(fluent.getFormat());
    buildable.setId(fluent.getId());
    buildable.setItems(fluent.getItems());
    buildable.setMaxItems(fluent.getMaxItems());
    buildable.setMaxLength(fluent.getMaxLength());
    buildable.setMaxProperties(fluent.getMaxProperties());
    buildable.setMaximum(fluent.getMaximum());
    buildable.setMinItems(fluent.getMinItems());
    buildable.setMinLength(fluent.getMinLength());
    buildable.setMinProperties(fluent.getMinProperties());
    buildable.setMinimum(fluent.getMinimum());
    buildable.setMultipleOf(fluent.getMultipleOf());
    buildable.setNot(fluent.getNot());
    buildable.setNullable(fluent.getNullable());
    buildable.setOneOf(fluent.getOneOf());
    buildable.setPattern(fluent.getPattern());
    buildable.setPatternProperties(fluent.getPatternProperties());
    buildable.setProperties(fluent.getProperties());
    buildable.setRequired(fluent.getRequired());
    buildable.setTitle(fluent.getTitle());
    buildable.setType(fluent.getType());
    buildable.setUniqueItems(fluent.getUniqueItems());
    return buildable;
  }
  
}