package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Long;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1JSONSchemaPropsFluent<A extends io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent<A>> extends BaseFluent<A>{

  private String $ref;
  private String $schema;
  private Object _default;
  private List<Object> _enum;
  private Object additionalItems;
  private Object additionalProperties;
  private ArrayList<V1JSONSchemaPropsBuilder> allOf;
  private ArrayList<V1JSONSchemaPropsBuilder> anyOf;
  private Map<String,V1JSONSchemaProps> definitions;
  private Map<String,Object> dependencies;
  private String description;
  private Object example;
  private Boolean exclusiveMaximum;
  private Boolean exclusiveMinimum;
  private V1ExternalDocumentationBuilder externalDocs;
  private String format;
  private String id;
  private Object items;
  private Long maxItems;
  private Long maxLength;
  private Long maxProperties;
  private Double maximum;
  private Long minItems;
  private Long minLength;
  private Long minProperties;
  private Double minimum;
  private Double multipleOf;
  private V1JSONSchemaPropsBuilder not;
  private Boolean nullable;
  private ArrayList<V1JSONSchemaPropsBuilder> oneOf;
  private String pattern;
  private Map<String,V1JSONSchemaProps> patternProperties;
  private Map<String,V1JSONSchemaProps> properties;
  private List<String> required;
  private String title;
  private String type;
  private Boolean uniqueItems;

  public V1JSONSchemaPropsFluent() {
  }
  
  public V1JSONSchemaPropsFluent(V1JSONSchemaProps instance) {
    this.copyInstance(instance);
  }

  public A addAllToAllOf(Collection<V1JSONSchemaProps> items) {
    if (this.allOf == null) {
      this.allOf = new ArrayList();
    }
    for (V1JSONSchemaProps item : items) {
        V1JSONSchemaPropsBuilder builder = new V1JSONSchemaPropsBuilder(item);
        _visitables.get("allOf").add(builder);
        this.allOf.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToAnyOf(Collection<V1JSONSchemaProps> items) {
    if (this.anyOf == null) {
      this.anyOf = new ArrayList();
    }
    for (V1JSONSchemaProps item : items) {
        V1JSONSchemaPropsBuilder builder = new V1JSONSchemaPropsBuilder(item);
        _visitables.get("anyOf").add(builder);
        this.anyOf.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToEnum(Collection<Object> items) {
    if (this._enum == null) {
      this._enum = new ArrayList();
    }
    for (Object item : items) {
      this._enum.add(item);
    }
    return (A) this;
  }
  
  public A addAllToOneOf(Collection<V1JSONSchemaProps> items) {
    if (this.oneOf == null) {
      this.oneOf = new ArrayList();
    }
    for (V1JSONSchemaProps item : items) {
        V1JSONSchemaPropsBuilder builder = new V1JSONSchemaPropsBuilder(item);
        _visitables.get("oneOf").add(builder);
        this.oneOf.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToRequired(Collection<String> items) {
    if (this.required == null) {
      this.required = new ArrayList();
    }
    for (String item : items) {
      this.required.add(item);
    }
    return (A) this;
  }
  
  public AllOfNested<A> addNewAllOf() {
    return new AllOfNested(-1, null);
  }
  
  public AllOfNested<A> addNewAllOfLike(V1JSONSchemaProps item) {
    return new AllOfNested(-1, item);
  }
  
  public AnyOfNested<A> addNewAnyOf() {
    return new AnyOfNested(-1, null);
  }
  
  public AnyOfNested<A> addNewAnyOfLike(V1JSONSchemaProps item) {
    return new AnyOfNested(-1, item);
  }
  
  public OneOfNested<A> addNewOneOf() {
    return new OneOfNested(-1, null);
  }
  
  public OneOfNested<A> addNewOneOfLike(V1JSONSchemaProps item) {
    return new OneOfNested(-1, item);
  }
  
  public A addToAllOf(V1JSONSchemaProps... items) {
    if (this.allOf == null) {
      this.allOf = new ArrayList();
    }
    for (V1JSONSchemaProps item : items) {
        V1JSONSchemaPropsBuilder builder = new V1JSONSchemaPropsBuilder(item);
        _visitables.get("allOf").add(builder);
        this.allOf.add(builder);
    }
    return (A) this;
  }
  
  public A addToAllOf(int index,V1JSONSchemaProps item) {
    if (this.allOf == null) {
      this.allOf = new ArrayList();
    }
    V1JSONSchemaPropsBuilder builder = new V1JSONSchemaPropsBuilder(item);
    if (index < 0 || index >= allOf.size()) {
        _visitables.get("allOf").add(builder);
        allOf.add(builder);
    } else {
        _visitables.get("allOf").add(builder);
        allOf.add(index, builder);
    }
    return (A) this;
  }
  
  public A addToAnyOf(V1JSONSchemaProps... items) {
    if (this.anyOf == null) {
      this.anyOf = new ArrayList();
    }
    for (V1JSONSchemaProps item : items) {
        V1JSONSchemaPropsBuilder builder = new V1JSONSchemaPropsBuilder(item);
        _visitables.get("anyOf").add(builder);
        this.anyOf.add(builder);
    }
    return (A) this;
  }
  
  public A addToAnyOf(int index,V1JSONSchemaProps item) {
    if (this.anyOf == null) {
      this.anyOf = new ArrayList();
    }
    V1JSONSchemaPropsBuilder builder = new V1JSONSchemaPropsBuilder(item);
    if (index < 0 || index >= anyOf.size()) {
        _visitables.get("anyOf").add(builder);
        anyOf.add(builder);
    } else {
        _visitables.get("anyOf").add(builder);
        anyOf.add(index, builder);
    }
    return (A) this;
  }
  
  public A addToDefinitions(Map<String,V1JSONSchemaProps> map) {
    if (this.definitions == null && map != null) {
      this.definitions = new LinkedHashMap();
    }
    if (map != null) {
      this.definitions.putAll(map);
    }
    return (A) this;
  }
  
  public A addToDefinitions(String key,V1JSONSchemaProps value) {
    if (this.definitions == null && key != null && value != null) {
      this.definitions = new LinkedHashMap();
    }
    if (key != null && value != null) {
      this.definitions.put(key, value);
    }
    return (A) this;
  }
  
  public A addToDependencies(Map<String,Object> map) {
    if (this.dependencies == null && map != null) {
      this.dependencies = new LinkedHashMap();
    }
    if (map != null) {
      this.dependencies.putAll(map);
    }
    return (A) this;
  }
  
  public A addToDependencies(String key,Object value) {
    if (this.dependencies == null && key != null && value != null) {
      this.dependencies = new LinkedHashMap();
    }
    if (key != null && value != null) {
      this.dependencies.put(key, value);
    }
    return (A) this;
  }
  
  public A addToEnum(Object... items) {
    if (this._enum == null) {
      this._enum = new ArrayList();
    }
    for (Object item : items) {
      this._enum.add(item);
    }
    return (A) this;
  }
  
  public A addToEnum(int index,Object item) {
    if (this._enum == null) {
      this._enum = new ArrayList();
    }
    this._enum.add(index, item);
    return (A) this;
  }
  
  public A addToOneOf(V1JSONSchemaProps... items) {
    if (this.oneOf == null) {
      this.oneOf = new ArrayList();
    }
    for (V1JSONSchemaProps item : items) {
        V1JSONSchemaPropsBuilder builder = new V1JSONSchemaPropsBuilder(item);
        _visitables.get("oneOf").add(builder);
        this.oneOf.add(builder);
    }
    return (A) this;
  }
  
  public A addToOneOf(int index,V1JSONSchemaProps item) {
    if (this.oneOf == null) {
      this.oneOf = new ArrayList();
    }
    V1JSONSchemaPropsBuilder builder = new V1JSONSchemaPropsBuilder(item);
    if (index < 0 || index >= oneOf.size()) {
        _visitables.get("oneOf").add(builder);
        oneOf.add(builder);
    } else {
        _visitables.get("oneOf").add(builder);
        oneOf.add(index, builder);
    }
    return (A) this;
  }
  
  public A addToPatternProperties(Map<String,V1JSONSchemaProps> map) {
    if (this.patternProperties == null && map != null) {
      this.patternProperties = new LinkedHashMap();
    }
    if (map != null) {
      this.patternProperties.putAll(map);
    }
    return (A) this;
  }
  
  public A addToPatternProperties(String key,V1JSONSchemaProps value) {
    if (this.patternProperties == null && key != null && value != null) {
      this.patternProperties = new LinkedHashMap();
    }
    if (key != null && value != null) {
      this.patternProperties.put(key, value);
    }
    return (A) this;
  }
  
  public A addToProperties(Map<String,V1JSONSchemaProps> map) {
    if (this.properties == null && map != null) {
      this.properties = new LinkedHashMap();
    }
    if (map != null) {
      this.properties.putAll(map);
    }
    return (A) this;
  }
  
  public A addToProperties(String key,V1JSONSchemaProps value) {
    if (this.properties == null && key != null && value != null) {
      this.properties = new LinkedHashMap();
    }
    if (key != null && value != null) {
      this.properties.put(key, value);
    }
    return (A) this;
  }
  
  public A addToRequired(String... items) {
    if (this.required == null) {
      this.required = new ArrayList();
    }
    for (String item : items) {
      this.required.add(item);
    }
    return (A) this;
  }
  
  public A addToRequired(int index,String item) {
    if (this.required == null) {
      this.required = new ArrayList();
    }
    this.required.add(index, item);
    return (A) this;
  }
  
  public List<V1JSONSchemaProps> buildAllOf() {
    return this.allOf != null ? build(allOf) : null;
  }
  
  public V1JSONSchemaProps buildAllOf(int index) {
    return this.allOf.get(index).build();
  }
  
  public List<V1JSONSchemaProps> buildAnyOf() {
    return this.anyOf != null ? build(anyOf) : null;
  }
  
  public V1JSONSchemaProps buildAnyOf(int index) {
    return this.anyOf.get(index).build();
  }
  
  public V1ExternalDocumentation buildExternalDocs() {
    return this.externalDocs != null ? this.externalDocs.build() : null;
  }
  
  public V1JSONSchemaProps buildFirstAllOf() {
    return this.allOf.get(0).build();
  }
  
  public V1JSONSchemaProps buildFirstAnyOf() {
    return this.anyOf.get(0).build();
  }
  
  public V1JSONSchemaProps buildFirstOneOf() {
    return this.oneOf.get(0).build();
  }
  
  public V1JSONSchemaProps buildLastAllOf() {
    return this.allOf.get(allOf.size() - 1).build();
  }
  
  public V1JSONSchemaProps buildLastAnyOf() {
    return this.anyOf.get(anyOf.size() - 1).build();
  }
  
  public V1JSONSchemaProps buildLastOneOf() {
    return this.oneOf.get(oneOf.size() - 1).build();
  }
  
  public V1JSONSchemaProps buildMatchingAllOf(Predicate<V1JSONSchemaPropsBuilder> predicate) {
      for (V1JSONSchemaPropsBuilder item : allOf) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1JSONSchemaProps buildMatchingAnyOf(Predicate<V1JSONSchemaPropsBuilder> predicate) {
      for (V1JSONSchemaPropsBuilder item : anyOf) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1JSONSchemaProps buildMatchingOneOf(Predicate<V1JSONSchemaPropsBuilder> predicate) {
      for (V1JSONSchemaPropsBuilder item : oneOf) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1JSONSchemaProps buildNot() {
    return this.not != null ? this.not.build() : null;
  }
  
  public List<V1JSONSchemaProps> buildOneOf() {
    return this.oneOf != null ? build(oneOf) : null;
  }
  
  public V1JSONSchemaProps buildOneOf(int index) {
    return this.oneOf.get(index).build();
  }
  
  protected void copyInstance(V1JSONSchemaProps instance) {
    instance = instance != null ? instance : new V1JSONSchemaProps();
    if (instance != null) {
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
  }
  
  public AllOfNested<A> editAllOf(int index) {
    if (allOf.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "allOf"));
    }
    return this.setNewAllOfLike(index, this.buildAllOf(index));
  }
  
  public AnyOfNested<A> editAnyOf(int index) {
    if (anyOf.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "anyOf"));
    }
    return this.setNewAnyOfLike(index, this.buildAnyOf(index));
  }
  
  public ExternalDocsNested<A> editExternalDocs() {
    return this.withNewExternalDocsLike(Optional.ofNullable(this.buildExternalDocs()).orElse(null));
  }
  
  public AllOfNested<A> editFirstAllOf() {
    if (allOf.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "allOf"));
    }
    return this.setNewAllOfLike(0, this.buildAllOf(0));
  }
  
  public AnyOfNested<A> editFirstAnyOf() {
    if (anyOf.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "anyOf"));
    }
    return this.setNewAnyOfLike(0, this.buildAnyOf(0));
  }
  
  public OneOfNested<A> editFirstOneOf() {
    if (oneOf.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "oneOf"));
    }
    return this.setNewOneOfLike(0, this.buildOneOf(0));
  }
  
  public AllOfNested<A> editLastAllOf() {
    int index = allOf.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "allOf"));
    }
    return this.setNewAllOfLike(index, this.buildAllOf(index));
  }
  
  public AnyOfNested<A> editLastAnyOf() {
    int index = anyOf.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "anyOf"));
    }
    return this.setNewAnyOfLike(index, this.buildAnyOf(index));
  }
  
  public OneOfNested<A> editLastOneOf() {
    int index = oneOf.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "oneOf"));
    }
    return this.setNewOneOfLike(index, this.buildOneOf(index));
  }
  
  public AllOfNested<A> editMatchingAllOf(Predicate<V1JSONSchemaPropsBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < allOf.size();i++) {
      if (predicate.test(allOf.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "allOf"));
    }
    return this.setNewAllOfLike(index, this.buildAllOf(index));
  }
  
  public AnyOfNested<A> editMatchingAnyOf(Predicate<V1JSONSchemaPropsBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < anyOf.size();i++) {
      if (predicate.test(anyOf.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "anyOf"));
    }
    return this.setNewAnyOfLike(index, this.buildAnyOf(index));
  }
  
  public OneOfNested<A> editMatchingOneOf(Predicate<V1JSONSchemaPropsBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < oneOf.size();i++) {
      if (predicate.test(oneOf.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "oneOf"));
    }
    return this.setNewOneOfLike(index, this.buildOneOf(index));
  }
  
  public NotNested<A> editNot() {
    return this.withNewNotLike(Optional.ofNullable(this.buildNot()).orElse(null));
  }
  
  public OneOfNested<A> editOneOf(int index) {
    if (oneOf.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "oneOf"));
    }
    return this.setNewOneOfLike(index, this.buildOneOf(index));
  }
  
  public ExternalDocsNested<A> editOrNewExternalDocs() {
    return this.withNewExternalDocsLike(Optional.ofNullable(this.buildExternalDocs()).orElse(new V1ExternalDocumentationBuilder().build()));
  }
  
  public ExternalDocsNested<A> editOrNewExternalDocsLike(V1ExternalDocumentation item) {
    return this.withNewExternalDocsLike(Optional.ofNullable(this.buildExternalDocs()).orElse(item));
  }
  
  public NotNested<A> editOrNewNot() {
    return this.withNewNotLike(Optional.ofNullable(this.buildNot()).orElse(new V1JSONSchemaPropsBuilder().build()));
  }
  
  public NotNested<A> editOrNewNotLike(V1JSONSchemaProps item) {
    return this.withNewNotLike(Optional.ofNullable(this.buildNot()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1JSONSchemaPropsFluent that = (V1JSONSchemaPropsFluent) o;
    if (!(Objects.equals($ref, that.$ref))) {
      return false;
    }
    if (!(Objects.equals($schema, that.$schema))) {
      return false;
    }
    if (!(Objects.equals(additionalItems, that.additionalItems))) {
      return false;
    }
    if (!(Objects.equals(additionalProperties, that.additionalProperties))) {
      return false;
    }
    if (!(Objects.equals(allOf, that.allOf))) {
      return false;
    }
    if (!(Objects.equals(anyOf, that.anyOf))) {
      return false;
    }
    if (!(Objects.equals(_default, that._default))) {
      return false;
    }
    if (!(Objects.equals(definitions, that.definitions))) {
      return false;
    }
    if (!(Objects.equals(dependencies, that.dependencies))) {
      return false;
    }
    if (!(Objects.equals(description, that.description))) {
      return false;
    }
    if (!(Objects.equals(_enum, that._enum))) {
      return false;
    }
    if (!(Objects.equals(example, that.example))) {
      return false;
    }
    if (!(Objects.equals(exclusiveMaximum, that.exclusiveMaximum))) {
      return false;
    }
    if (!(Objects.equals(exclusiveMinimum, that.exclusiveMinimum))) {
      return false;
    }
    if (!(Objects.equals(externalDocs, that.externalDocs))) {
      return false;
    }
    if (!(Objects.equals(format, that.format))) {
      return false;
    }
    if (!(Objects.equals(id, that.id))) {
      return false;
    }
    if (!(Objects.equals(items, that.items))) {
      return false;
    }
    if (!(Objects.equals(maxItems, that.maxItems))) {
      return false;
    }
    if (!(Objects.equals(maxLength, that.maxLength))) {
      return false;
    }
    if (!(Objects.equals(maxProperties, that.maxProperties))) {
      return false;
    }
    if (!(Objects.equals(maximum, that.maximum))) {
      return false;
    }
    if (!(Objects.equals(minItems, that.minItems))) {
      return false;
    }
    if (!(Objects.equals(minLength, that.minLength))) {
      return false;
    }
    if (!(Objects.equals(minProperties, that.minProperties))) {
      return false;
    }
    if (!(Objects.equals(minimum, that.minimum))) {
      return false;
    }
    if (!(Objects.equals(multipleOf, that.multipleOf))) {
      return false;
    }
    if (!(Objects.equals(not, that.not))) {
      return false;
    }
    if (!(Objects.equals(nullable, that.nullable))) {
      return false;
    }
    if (!(Objects.equals(oneOf, that.oneOf))) {
      return false;
    }
    if (!(Objects.equals(pattern, that.pattern))) {
      return false;
    }
    if (!(Objects.equals(patternProperties, that.patternProperties))) {
      return false;
    }
    if (!(Objects.equals(properties, that.properties))) {
      return false;
    }
    if (!(Objects.equals(required, that.required))) {
      return false;
    }
    if (!(Objects.equals(title, that.title))) {
      return false;
    }
    if (!(Objects.equals(type, that.type))) {
      return false;
    }
    if (!(Objects.equals(uniqueItems, that.uniqueItems))) {
      return false;
    }
    return true;
  }
  
  public Object getAdditionalItems() {
    return this.additionalItems;
  }
  
  public Object getAdditionalProperties() {
    return this.additionalProperties;
  }
  
  public Object getDefault() {
    return this._default;
  }
  
  public Map<String,V1JSONSchemaProps> getDefinitions() {
    return this.definitions;
  }
  
  public Map<String,Object> getDependencies() {
    return this.dependencies;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public List<Object> getEnum() {
    return this._enum;
  }
  
  public Object getEnum(int index) {
    return this._enum.get(index);
  }
  
  public Object getExample() {
    return this.example;
  }
  
  public Boolean getExclusiveMaximum() {
    return this.exclusiveMaximum;
  }
  
  public Boolean getExclusiveMinimum() {
    return this.exclusiveMinimum;
  }
  
  public Object getFirstEnum() {
    return this._enum.get(0);
  }
  
  public String getFirstRequired() {
    return this.required.get(0);
  }
  
  public String getFormat() {
    return this.format;
  }
  
  public String getId() {
    return this.id;
  }
  
  public Object getItems() {
    return this.items;
  }
  
  public Object getLastEnum() {
    return this._enum.get(_enum.size() - 1);
  }
  
  public String getLastRequired() {
    return this.required.get(required.size() - 1);
  }
  
  public Object getMatchingEnum(Predicate<Object> predicate) {
      for (Object item : _enum) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public String getMatchingRequired(Predicate<String> predicate) {
      for (String item : required) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public Long getMaxItems() {
    return this.maxItems;
  }
  
  public Long getMaxLength() {
    return this.maxLength;
  }
  
  public Long getMaxProperties() {
    return this.maxProperties;
  }
  
  public Double getMaximum() {
    return this.maximum;
  }
  
  public Long getMinItems() {
    return this.minItems;
  }
  
  public Long getMinLength() {
    return this.minLength;
  }
  
  public Long getMinProperties() {
    return this.minProperties;
  }
  
  public Double getMinimum() {
    return this.minimum;
  }
  
  public Double getMultipleOf() {
    return this.multipleOf;
  }
  
  public Boolean getNullable() {
    return this.nullable;
  }
  
  public String getPattern() {
    return this.pattern;
  }
  
  public Map<String,V1JSONSchemaProps> getPatternProperties() {
    return this.patternProperties;
  }
  
  public Map<String,V1JSONSchemaProps> getProperties() {
    return this.properties;
  }
  
  public String getRef() {
    return this.$ref;
  }
  
  public List<String> getRequired() {
    return this.required;
  }
  
  public String getRequired(int index) {
    return this.required.get(index);
  }
  
  public String getSchema() {
    return this.$schema;
  }
  
  public String getTitle() {
    return this.title;
  }
  
  public String getType() {
    return this.type;
  }
  
  public Boolean getUniqueItems() {
    return this.uniqueItems;
  }
  
  public boolean hasAdditionalItems() {
    return this.additionalItems != null;
  }
  
  public boolean hasAdditionalProperties() {
    return this.additionalProperties != null;
  }
  
  public boolean hasAllOf() {
    return this.allOf != null && !(this.allOf.isEmpty());
  }
  
  public boolean hasAnyOf() {
    return this.anyOf != null && !(this.anyOf.isEmpty());
  }
  
  public boolean hasDefault() {
    return this._default != null;
  }
  
  public boolean hasDefinitions() {
    return this.definitions != null;
  }
  
  public boolean hasDependencies() {
    return this.dependencies != null;
  }
  
  public boolean hasDescription() {
    return this.description != null;
  }
  
  public boolean hasEnum() {
    return this._enum != null && !(this._enum.isEmpty());
  }
  
  public boolean hasExample() {
    return this.example != null;
  }
  
  public boolean hasExclusiveMaximum() {
    return this.exclusiveMaximum != null;
  }
  
  public boolean hasExclusiveMinimum() {
    return this.exclusiveMinimum != null;
  }
  
  public boolean hasExternalDocs() {
    return this.externalDocs != null;
  }
  
  public boolean hasFormat() {
    return this.format != null;
  }
  
  public boolean hasId() {
    return this.id != null;
  }
  
  public boolean hasItems() {
    return this.items != null;
  }
  
  public boolean hasMatchingAllOf(Predicate<V1JSONSchemaPropsBuilder> predicate) {
      for (V1JSONSchemaPropsBuilder item : allOf) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingAnyOf(Predicate<V1JSONSchemaPropsBuilder> predicate) {
      for (V1JSONSchemaPropsBuilder item : anyOf) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingEnum(Predicate<Object> predicate) {
      for (Object item : _enum) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingOneOf(Predicate<V1JSONSchemaPropsBuilder> predicate) {
      for (V1JSONSchemaPropsBuilder item : oneOf) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingRequired(Predicate<String> predicate) {
      for (String item : required) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMaxItems() {
    return this.maxItems != null;
  }
  
  public boolean hasMaxLength() {
    return this.maxLength != null;
  }
  
  public boolean hasMaxProperties() {
    return this.maxProperties != null;
  }
  
  public boolean hasMaximum() {
    return this.maximum != null;
  }
  
  public boolean hasMinItems() {
    return this.minItems != null;
  }
  
  public boolean hasMinLength() {
    return this.minLength != null;
  }
  
  public boolean hasMinProperties() {
    return this.minProperties != null;
  }
  
  public boolean hasMinimum() {
    return this.minimum != null;
  }
  
  public boolean hasMultipleOf() {
    return this.multipleOf != null;
  }
  
  public boolean hasNot() {
    return this.not != null;
  }
  
  public boolean hasNullable() {
    return this.nullable != null;
  }
  
  public boolean hasOneOf() {
    return this.oneOf != null && !(this.oneOf.isEmpty());
  }
  
  public boolean hasPattern() {
    return this.pattern != null;
  }
  
  public boolean hasPatternProperties() {
    return this.patternProperties != null;
  }
  
  public boolean hasProperties() {
    return this.properties != null;
  }
  
  public boolean hasRef() {
    return this.$ref != null;
  }
  
  public boolean hasRequired() {
    return this.required != null && !(this.required.isEmpty());
  }
  
  public boolean hasSchema() {
    return this.$schema != null;
  }
  
  public boolean hasTitle() {
    return this.title != null;
  }
  
  public boolean hasType() {
    return this.type != null;
  }
  
  public boolean hasUniqueItems() {
    return this.uniqueItems != null;
  }
  
  public int hashCode() {
    return Objects.hash($ref, $schema, additionalItems, additionalProperties, allOf, anyOf, _default, definitions, dependencies, description, _enum, example, exclusiveMaximum, exclusiveMinimum, externalDocs, format, id, items, maxItems, maxLength, maxProperties, maximum, minItems, minLength, minProperties, minimum, multipleOf, not, nullable, oneOf, pattern, patternProperties, properties, required, title, type, uniqueItems);
  }
  
  public A removeAllFromAllOf(Collection<V1JSONSchemaProps> items) {
    if (this.allOf == null) {
      return (A) this;
    }
    for (V1JSONSchemaProps item : items) {
        V1JSONSchemaPropsBuilder builder = new V1JSONSchemaPropsBuilder(item);
        _visitables.get("allOf").remove(builder);
        this.allOf.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromAnyOf(Collection<V1JSONSchemaProps> items) {
    if (this.anyOf == null) {
      return (A) this;
    }
    for (V1JSONSchemaProps item : items) {
        V1JSONSchemaPropsBuilder builder = new V1JSONSchemaPropsBuilder(item);
        _visitables.get("anyOf").remove(builder);
        this.anyOf.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromEnum(Collection<Object> items) {
    if (this._enum == null) {
      return (A) this;
    }
    for (Object item : items) {
      this._enum.remove(item);
    }
    return (A) this;
  }
  
  public A removeAllFromOneOf(Collection<V1JSONSchemaProps> items) {
    if (this.oneOf == null) {
      return (A) this;
    }
    for (V1JSONSchemaProps item : items) {
        V1JSONSchemaPropsBuilder builder = new V1JSONSchemaPropsBuilder(item);
        _visitables.get("oneOf").remove(builder);
        this.oneOf.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromRequired(Collection<String> items) {
    if (this.required == null) {
      return (A) this;
    }
    for (String item : items) {
      this.required.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromAllOf(V1JSONSchemaProps... items) {
    if (this.allOf == null) {
      return (A) this;
    }
    for (V1JSONSchemaProps item : items) {
        V1JSONSchemaPropsBuilder builder = new V1JSONSchemaPropsBuilder(item);
        _visitables.get("allOf").remove(builder);
        this.allOf.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromAnyOf(V1JSONSchemaProps... items) {
    if (this.anyOf == null) {
      return (A) this;
    }
    for (V1JSONSchemaProps item : items) {
        V1JSONSchemaPropsBuilder builder = new V1JSONSchemaPropsBuilder(item);
        _visitables.get("anyOf").remove(builder);
        this.anyOf.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromDefinitions(String key) {
    if (this.definitions == null) {
      return (A) this;
    }
    if (key != null && this.definitions != null) {
      this.definitions.remove(key);
    }
    return (A) this;
  }
  
  public A removeFromDefinitions(Map<String,V1JSONSchemaProps> map) {
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
  
  public A removeFromDependencies(String key) {
    if (this.dependencies == null) {
      return (A) this;
    }
    if (key != null && this.dependencies != null) {
      this.dependencies.remove(key);
    }
    return (A) this;
  }
  
  public A removeFromDependencies(Map<String,Object> map) {
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
  
  public A removeFromEnum(Object... items) {
    if (this._enum == null) {
      return (A) this;
    }
    for (Object item : items) {
      this._enum.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromOneOf(V1JSONSchemaProps... items) {
    if (this.oneOf == null) {
      return (A) this;
    }
    for (V1JSONSchemaProps item : items) {
        V1JSONSchemaPropsBuilder builder = new V1JSONSchemaPropsBuilder(item);
        _visitables.get("oneOf").remove(builder);
        this.oneOf.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromPatternProperties(String key) {
    if (this.patternProperties == null) {
      return (A) this;
    }
    if (key != null && this.patternProperties != null) {
      this.patternProperties.remove(key);
    }
    return (A) this;
  }
  
  public A removeFromPatternProperties(Map<String,V1JSONSchemaProps> map) {
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
  
  public A removeFromProperties(String key) {
    if (this.properties == null) {
      return (A) this;
    }
    if (key != null && this.properties != null) {
      this.properties.remove(key);
    }
    return (A) this;
  }
  
  public A removeFromProperties(Map<String,V1JSONSchemaProps> map) {
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
  
  public A removeFromRequired(String... items) {
    if (this.required == null) {
      return (A) this;
    }
    for (String item : items) {
      this.required.remove(item);
    }
    return (A) this;
  }
  
  public A removeMatchingFromAllOf(Predicate<V1JSONSchemaPropsBuilder> predicate) {
    if (allOf == null) {
      return (A) this;
    }
    Iterator<V1JSONSchemaPropsBuilder> each = allOf.iterator();
    List visitables = _visitables.get("allOf");
    while (each.hasNext()) {
        V1JSONSchemaPropsBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public A removeMatchingFromAnyOf(Predicate<V1JSONSchemaPropsBuilder> predicate) {
    if (anyOf == null) {
      return (A) this;
    }
    Iterator<V1JSONSchemaPropsBuilder> each = anyOf.iterator();
    List visitables = _visitables.get("anyOf");
    while (each.hasNext()) {
        V1JSONSchemaPropsBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public A removeMatchingFromOneOf(Predicate<V1JSONSchemaPropsBuilder> predicate) {
    if (oneOf == null) {
      return (A) this;
    }
    Iterator<V1JSONSchemaPropsBuilder> each = oneOf.iterator();
    List visitables = _visitables.get("oneOf");
    while (each.hasNext()) {
        V1JSONSchemaPropsBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public AllOfNested<A> setNewAllOfLike(int index,V1JSONSchemaProps item) {
    return new AllOfNested(index, item);
  }
  
  public AnyOfNested<A> setNewAnyOfLike(int index,V1JSONSchemaProps item) {
    return new AnyOfNested(index, item);
  }
  
  public OneOfNested<A> setNewOneOfLike(int index,V1JSONSchemaProps item) {
    return new OneOfNested(index, item);
  }
  
  public A setToAllOf(int index,V1JSONSchemaProps item) {
    if (this.allOf == null) {
      this.allOf = new ArrayList();
    }
    V1JSONSchemaPropsBuilder builder = new V1JSONSchemaPropsBuilder(item);
    if (index < 0 || index >= allOf.size()) {
        _visitables.get("allOf").add(builder);
        allOf.add(builder);
    } else {
        _visitables.get("allOf").add(builder);
        allOf.set(index, builder);
    }
    return (A) this;
  }
  
  public A setToAnyOf(int index,V1JSONSchemaProps item) {
    if (this.anyOf == null) {
      this.anyOf = new ArrayList();
    }
    V1JSONSchemaPropsBuilder builder = new V1JSONSchemaPropsBuilder(item);
    if (index < 0 || index >= anyOf.size()) {
        _visitables.get("anyOf").add(builder);
        anyOf.add(builder);
    } else {
        _visitables.get("anyOf").add(builder);
        anyOf.set(index, builder);
    }
    return (A) this;
  }
  
  public A setToEnum(int index,Object item) {
    if (this._enum == null) {
      this._enum = new ArrayList();
    }
    this._enum.set(index, item);
    return (A) this;
  }
  
  public A setToOneOf(int index,V1JSONSchemaProps item) {
    if (this.oneOf == null) {
      this.oneOf = new ArrayList();
    }
    V1JSONSchemaPropsBuilder builder = new V1JSONSchemaPropsBuilder(item);
    if (index < 0 || index >= oneOf.size()) {
        _visitables.get("oneOf").add(builder);
        oneOf.add(builder);
    } else {
        _visitables.get("oneOf").add(builder);
        oneOf.set(index, builder);
    }
    return (A) this;
  }
  
  public A setToRequired(int index,String item) {
    if (this.required == null) {
      this.required = new ArrayList();
    }
    this.required.set(index, item);
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!($ref == null)) {
        sb.append("$ref:");
        sb.append($ref);
        sb.append(",");
    }
    if (!($schema == null)) {
        sb.append("$schema:");
        sb.append($schema);
        sb.append(",");
    }
    if (!(additionalItems == null)) {
        sb.append("additionalItems:");
        sb.append(additionalItems);
        sb.append(",");
    }
    if (!(additionalProperties == null)) {
        sb.append("additionalProperties:");
        sb.append(additionalProperties);
        sb.append(",");
    }
    if (!(allOf == null) && !(allOf.isEmpty())) {
        sb.append("allOf:");
        sb.append(allOf);
        sb.append(",");
    }
    if (!(anyOf == null) && !(anyOf.isEmpty())) {
        sb.append("anyOf:");
        sb.append(anyOf);
        sb.append(",");
    }
    if (!(_default == null)) {
        sb.append("_default:");
        sb.append(_default);
        sb.append(",");
    }
    if (!(definitions == null) && !(definitions.isEmpty())) {
        sb.append("definitions:");
        sb.append(definitions);
        sb.append(",");
    }
    if (!(dependencies == null) && !(dependencies.isEmpty())) {
        sb.append("dependencies:");
        sb.append(dependencies);
        sb.append(",");
    }
    if (!(description == null)) {
        sb.append("description:");
        sb.append(description);
        sb.append(",");
    }
    if (!(_enum == null) && !(_enum.isEmpty())) {
        sb.append("_enum:");
        sb.append(_enum);
        sb.append(",");
    }
    if (!(example == null)) {
        sb.append("example:");
        sb.append(example);
        sb.append(",");
    }
    if (!(exclusiveMaximum == null)) {
        sb.append("exclusiveMaximum:");
        sb.append(exclusiveMaximum);
        sb.append(",");
    }
    if (!(exclusiveMinimum == null)) {
        sb.append("exclusiveMinimum:");
        sb.append(exclusiveMinimum);
        sb.append(",");
    }
    if (!(externalDocs == null)) {
        sb.append("externalDocs:");
        sb.append(externalDocs);
        sb.append(",");
    }
    if (!(format == null)) {
        sb.append("format:");
        sb.append(format);
        sb.append(",");
    }
    if (!(id == null)) {
        sb.append("id:");
        sb.append(id);
        sb.append(",");
    }
    if (!(items == null)) {
        sb.append("items:");
        sb.append(items);
        sb.append(",");
    }
    if (!(maxItems == null)) {
        sb.append("maxItems:");
        sb.append(maxItems);
        sb.append(",");
    }
    if (!(maxLength == null)) {
        sb.append("maxLength:");
        sb.append(maxLength);
        sb.append(",");
    }
    if (!(maxProperties == null)) {
        sb.append("maxProperties:");
        sb.append(maxProperties);
        sb.append(",");
    }
    if (!(maximum == null)) {
        sb.append("maximum:");
        sb.append(maximum);
        sb.append(",");
    }
    if (!(minItems == null)) {
        sb.append("minItems:");
        sb.append(minItems);
        sb.append(",");
    }
    if (!(minLength == null)) {
        sb.append("minLength:");
        sb.append(minLength);
        sb.append(",");
    }
    if (!(minProperties == null)) {
        sb.append("minProperties:");
        sb.append(minProperties);
        sb.append(",");
    }
    if (!(minimum == null)) {
        sb.append("minimum:");
        sb.append(minimum);
        sb.append(",");
    }
    if (!(multipleOf == null)) {
        sb.append("multipleOf:");
        sb.append(multipleOf);
        sb.append(",");
    }
    if (!(not == null)) {
        sb.append("not:");
        sb.append(not);
        sb.append(",");
    }
    if (!(nullable == null)) {
        sb.append("nullable:");
        sb.append(nullable);
        sb.append(",");
    }
    if (!(oneOf == null) && !(oneOf.isEmpty())) {
        sb.append("oneOf:");
        sb.append(oneOf);
        sb.append(",");
    }
    if (!(pattern == null)) {
        sb.append("pattern:");
        sb.append(pattern);
        sb.append(",");
    }
    if (!(patternProperties == null) && !(patternProperties.isEmpty())) {
        sb.append("patternProperties:");
        sb.append(patternProperties);
        sb.append(",");
    }
    if (!(properties == null) && !(properties.isEmpty())) {
        sb.append("properties:");
        sb.append(properties);
        sb.append(",");
    }
    if (!(required == null) && !(required.isEmpty())) {
        sb.append("required:");
        sb.append(required);
        sb.append(",");
    }
    if (!(title == null)) {
        sb.append("title:");
        sb.append(title);
        sb.append(",");
    }
    if (!(type == null)) {
        sb.append("type:");
        sb.append(type);
        sb.append(",");
    }
    if (!(uniqueItems == null)) {
        sb.append("uniqueItems:");
        sb.append(uniqueItems);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withAdditionalItems(Object additionalItems) {
    this.additionalItems = additionalItems;
    return (A) this;
  }
  
  public A withAdditionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
    return (A) this;
  }
  
  public A withAllOf(List<V1JSONSchemaProps> allOf) {
    if (this.allOf != null) {
      this._visitables.get("allOf").clear();
    }
    if (allOf != null) {
        this.allOf = new ArrayList();
        for (V1JSONSchemaProps item : allOf) {
          this.addToAllOf(item);
        }
    } else {
      this.allOf = null;
    }
    return (A) this;
  }
  
  public A withAllOf(V1JSONSchemaProps... allOf) {
    if (this.allOf != null) {
        this.allOf.clear();
        _visitables.remove("allOf");
    }
    if (allOf != null) {
      for (V1JSONSchemaProps item : allOf) {
        this.addToAllOf(item);
      }
    }
    return (A) this;
  }
  
  public A withAnyOf(List<V1JSONSchemaProps> anyOf) {
    if (this.anyOf != null) {
      this._visitables.get("anyOf").clear();
    }
    if (anyOf != null) {
        this.anyOf = new ArrayList();
        for (V1JSONSchemaProps item : anyOf) {
          this.addToAnyOf(item);
        }
    } else {
      this.anyOf = null;
    }
    return (A) this;
  }
  
  public A withAnyOf(V1JSONSchemaProps... anyOf) {
    if (this.anyOf != null) {
        this.anyOf.clear();
        _visitables.remove("anyOf");
    }
    if (anyOf != null) {
      for (V1JSONSchemaProps item : anyOf) {
        this.addToAnyOf(item);
      }
    }
    return (A) this;
  }
  
  public A withDefault(Object _default) {
    this._default = _default;
    return (A) this;
  }
  
  public <K,V>A withDefinitions(Map<String,V1JSONSchemaProps> definitions) {
    if (definitions == null) {
      this.definitions = null;
    } else {
      this.definitions = new LinkedHashMap(definitions);
    }
    return (A) this;
  }
  
  public <K,V>A withDependencies(Map<String,Object> dependencies) {
    if (dependencies == null) {
      this.dependencies = null;
    } else {
      this.dependencies = new LinkedHashMap(dependencies);
    }
    return (A) this;
  }
  
  public A withDescription(String description) {
    this.description = description;
    return (A) this;
  }
  
  public A withEnum(List<Object> _enum) {
    if (_enum != null) {
        this._enum = new ArrayList();
        for (Object item : _enum) {
          this.addToEnum(item);
        }
    } else {
      this._enum = null;
    }
    return (A) this;
  }
  
  public A withEnum(Object... _enum) {
    if (this._enum != null) {
        this._enum.clear();
        _visitables.remove("_enum");
    }
    if (_enum != null) {
      for (Object item : _enum) {
        this.addToEnum(item);
      }
    }
    return (A) this;
  }
  
  public A withExample(Object example) {
    this.example = example;
    return (A) this;
  }
  
  public A withExclusiveMaximum() {
    return withExclusiveMaximum(true);
  }
  
  public A withExclusiveMaximum(Boolean exclusiveMaximum) {
    this.exclusiveMaximum = exclusiveMaximum;
    return (A) this;
  }
  
  public A withExclusiveMinimum() {
    return withExclusiveMinimum(true);
  }
  
  public A withExclusiveMinimum(Boolean exclusiveMinimum) {
    this.exclusiveMinimum = exclusiveMinimum;
    return (A) this;
  }
  
  public A withExternalDocs(V1ExternalDocumentation externalDocs) {
    this._visitables.remove("externalDocs");
    if (externalDocs != null) {
        this.externalDocs = new V1ExternalDocumentationBuilder(externalDocs);
        this._visitables.get("externalDocs").add(this.externalDocs);
    } else {
        this.externalDocs = null;
        this._visitables.get("externalDocs").remove(this.externalDocs);
    }
    return (A) this;
  }
  
  public A withFormat(String format) {
    this.format = format;
    return (A) this;
  }
  
  public A withId(String id) {
    this.id = id;
    return (A) this;
  }
  
  public A withItems(Object items) {
    this.items = items;
    return (A) this;
  }
  
  public A withMaxItems(Long maxItems) {
    this.maxItems = maxItems;
    return (A) this;
  }
  
  public A withMaxLength(Long maxLength) {
    this.maxLength = maxLength;
    return (A) this;
  }
  
  public A withMaxProperties(Long maxProperties) {
    this.maxProperties = maxProperties;
    return (A) this;
  }
  
  public A withMaximum(Double maximum) {
    this.maximum = maximum;
    return (A) this;
  }
  
  public A withMinItems(Long minItems) {
    this.minItems = minItems;
    return (A) this;
  }
  
  public A withMinLength(Long minLength) {
    this.minLength = minLength;
    return (A) this;
  }
  
  public A withMinProperties(Long minProperties) {
    this.minProperties = minProperties;
    return (A) this;
  }
  
  public A withMinimum(Double minimum) {
    this.minimum = minimum;
    return (A) this;
  }
  
  public A withMultipleOf(Double multipleOf) {
    this.multipleOf = multipleOf;
    return (A) this;
  }
  
  public ExternalDocsNested<A> withNewExternalDocs() {
    return new ExternalDocsNested(null);
  }
  
  public ExternalDocsNested<A> withNewExternalDocsLike(V1ExternalDocumentation item) {
    return new ExternalDocsNested(item);
  }
  
  public NotNested<A> withNewNot() {
    return new NotNested(null);
  }
  
  public NotNested<A> withNewNotLike(V1JSONSchemaProps item) {
    return new NotNested(item);
  }
  
  public A withNot(V1JSONSchemaProps not) {
    this._visitables.remove("not");
    if (not != null) {
        this.not = new V1JSONSchemaPropsBuilder(not);
        this._visitables.get("not").add(this.not);
    } else {
        this.not = null;
        this._visitables.get("not").remove(this.not);
    }
    return (A) this;
  }
  
  public A withNullable() {
    return withNullable(true);
  }
  
  public A withNullable(Boolean nullable) {
    this.nullable = nullable;
    return (A) this;
  }
  
  public A withOneOf(List<V1JSONSchemaProps> oneOf) {
    if (this.oneOf != null) {
      this._visitables.get("oneOf").clear();
    }
    if (oneOf != null) {
        this.oneOf = new ArrayList();
        for (V1JSONSchemaProps item : oneOf) {
          this.addToOneOf(item);
        }
    } else {
      this.oneOf = null;
    }
    return (A) this;
  }
  
  public A withOneOf(V1JSONSchemaProps... oneOf) {
    if (this.oneOf != null) {
        this.oneOf.clear();
        _visitables.remove("oneOf");
    }
    if (oneOf != null) {
      for (V1JSONSchemaProps item : oneOf) {
        this.addToOneOf(item);
      }
    }
    return (A) this;
  }
  
  public A withPattern(String pattern) {
    this.pattern = pattern;
    return (A) this;
  }
  
  public <K,V>A withPatternProperties(Map<String,V1JSONSchemaProps> patternProperties) {
    if (patternProperties == null) {
      this.patternProperties = null;
    } else {
      this.patternProperties = new LinkedHashMap(patternProperties);
    }
    return (A) this;
  }
  
  public <K,V>A withProperties(Map<String,V1JSONSchemaProps> properties) {
    if (properties == null) {
      this.properties = null;
    } else {
      this.properties = new LinkedHashMap(properties);
    }
    return (A) this;
  }
  
  public A withRef(String $ref) {
    this.$ref = $ref;
    return (A) this;
  }
  
  public A withRequired(List<String> required) {
    if (required != null) {
        this.required = new ArrayList();
        for (String item : required) {
          this.addToRequired(item);
        }
    } else {
      this.required = null;
    }
    return (A) this;
  }
  
  public A withRequired(String... required) {
    if (this.required != null) {
        this.required.clear();
        _visitables.remove("required");
    }
    if (required != null) {
      for (String item : required) {
        this.addToRequired(item);
      }
    }
    return (A) this;
  }
  
  public A withSchema(String $schema) {
    this.$schema = $schema;
    return (A) this;
  }
  
  public A withTitle(String title) {
    this.title = title;
    return (A) this;
  }
  
  public A withType(String type) {
    this.type = type;
    return (A) this;
  }
  
  public A withUniqueItems() {
    return withUniqueItems(true);
  }
  
  public A withUniqueItems(Boolean uniqueItems) {
    this.uniqueItems = uniqueItems;
    return (A) this;
  }
  public class AllOfNested<N> extends V1JSONSchemaPropsFluent<AllOfNested<N>> implements Nested<N>{
  
    V1JSONSchemaPropsBuilder builder;
    int index;
  
    AllOfNested(int index,V1JSONSchemaProps item) {
      this.index = index;
      this.builder = new V1JSONSchemaPropsBuilder(this, item);
    }
  
    public N and() {
      return (N) V1JSONSchemaPropsFluent.this.setToAllOf(index, builder.build());
    }
    
    public N endAllOf() {
      return and();
    }
    
  }
  public class AnyOfNested<N> extends V1JSONSchemaPropsFluent<AnyOfNested<N>> implements Nested<N>{
  
    V1JSONSchemaPropsBuilder builder;
    int index;
  
    AnyOfNested(int index,V1JSONSchemaProps item) {
      this.index = index;
      this.builder = new V1JSONSchemaPropsBuilder(this, item);
    }
  
    public N and() {
      return (N) V1JSONSchemaPropsFluent.this.setToAnyOf(index, builder.build());
    }
    
    public N endAnyOf() {
      return and();
    }
    
  }
  public class ExternalDocsNested<N> extends V1ExternalDocumentationFluent<ExternalDocsNested<N>> implements Nested<N>{
  
    V1ExternalDocumentationBuilder builder;
  
    ExternalDocsNested(V1ExternalDocumentation item) {
      this.builder = new V1ExternalDocumentationBuilder(this, item);
    }
  
    public N and() {
      return (N) V1JSONSchemaPropsFluent.this.withExternalDocs(builder.build());
    }
    
    public N endExternalDocs() {
      return and();
    }
    
  }
  public class NotNested<N> extends V1JSONSchemaPropsFluent<NotNested<N>> implements Nested<N>{
  
    V1JSONSchemaPropsBuilder builder;
  
    NotNested(V1JSONSchemaProps item) {
      this.builder = new V1JSONSchemaPropsBuilder(this, item);
    }
  
    public N and() {
      return (N) V1JSONSchemaPropsFluent.this.withNot(builder.build());
    }
    
    public N endNot() {
      return and();
    }
    
  }
  public class OneOfNested<N> extends V1JSONSchemaPropsFluent<OneOfNested<N>> implements Nested<N>{
  
    V1JSONSchemaPropsBuilder builder;
    int index;
  
    OneOfNested(int index,V1JSONSchemaProps item) {
      this.index = index;
      this.builder = new V1JSONSchemaPropsBuilder(this, item);
    }
  
    public N and() {
      return (N) V1JSONSchemaPropsFluent.this.setToOneOf(index, builder.build());
    }
    
    public N endOneOf() {
      return and();
    }
    
  }
}