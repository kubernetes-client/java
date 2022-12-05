package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1JSONSchemaPropsFluentImpl<A extends V1JSONSchemaPropsFluent<A>> extends BaseFluent<A> implements V1JSONSchemaPropsFluent<A>{
  public V1JSONSchemaPropsFluentImpl() {
  }
  public V1JSONSchemaPropsFluentImpl(V1JSONSchemaProps instance) {
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
  private String $ref;
  private String $schema;
  private Object additionalItems;
  private Object additionalProperties;
  private ArrayList<V1JSONSchemaPropsBuilder> allOf;
  private ArrayList<V1JSONSchemaPropsBuilder> anyOf;
  private Object _default;
  private Map<String,V1JSONSchemaProps> definitions;
  private Map<String,Object> dependencies;
  private String description;
  private List<Object> _enum;
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
  public String getRef() {
    return this.$ref;
  }
  public A withRef(String $ref) {
    this.$ref=$ref; return (A) this;
  }
  public Boolean hasRef() {
    return this.$ref != null;
  }
  public String getSchema() {
    return this.$schema;
  }
  public A withSchema(String $schema) {
    this.$schema=$schema; return (A) this;
  }
  public Boolean hasSchema() {
    return this.$schema != null;
  }
  public Object getAdditionalItems() {
    return this.additionalItems;
  }
  public A withAdditionalItems(Object additionalItems) {
    this.additionalItems=additionalItems; return (A) this;
  }
  public Boolean hasAdditionalItems() {
    return this.additionalItems != null;
  }
  public Object getAdditionalProperties() {
    return this.additionalProperties;
  }
  public A withAdditionalProperties(Object additionalProperties) {
    this.additionalProperties=additionalProperties; return (A) this;
  }
  public Boolean hasAdditionalProperties() {
    return this.additionalProperties != null;
  }
  public A addToAllOf(Integer index,V1JSONSchemaProps item) {
    if (this.allOf == null) {this.allOf = new ArrayList<V1JSONSchemaPropsBuilder>();}
    V1JSONSchemaPropsBuilder builder = new V1JSONSchemaPropsBuilder(item);_visitables.get("allOf").add(index >= 0 ? index : _visitables.get("allOf").size(), builder);this.allOf.add(index >= 0 ? index : allOf.size(), builder); return (A)this;
  }
  public A setToAllOf(Integer index,V1JSONSchemaProps item) {
    if (this.allOf == null) {this.allOf = new ArrayList<V1JSONSchemaPropsBuilder>();}
    V1JSONSchemaPropsBuilder builder = new V1JSONSchemaPropsBuilder(item);
    if (index < 0 || index >= _visitables.get("allOf").size()) { _visitables.get("allOf").add(builder); } else { _visitables.get("allOf").set(index, builder);}
    if (index < 0 || index >= allOf.size()) { allOf.add(builder); } else { allOf.set(index, builder);}
     return (A)this;
  }
  public A addToAllOf(io.kubernetes.client.openapi.models.V1JSONSchemaProps... items) {
    if (this.allOf == null) {this.allOf = new ArrayList<V1JSONSchemaPropsBuilder>();}
    for (V1JSONSchemaProps item : items) {V1JSONSchemaPropsBuilder builder = new V1JSONSchemaPropsBuilder(item);_visitables.get("allOf").add(builder);this.allOf.add(builder);} return (A)this;
  }
  public A addAllToAllOf(Collection<V1JSONSchemaProps> items) {
    if (this.allOf == null) {this.allOf = new ArrayList<V1JSONSchemaPropsBuilder>();}
    for (V1JSONSchemaProps item : items) {V1JSONSchemaPropsBuilder builder = new V1JSONSchemaPropsBuilder(item);_visitables.get("allOf").add(builder);this.allOf.add(builder);} return (A)this;
  }
  public A removeFromAllOf(io.kubernetes.client.openapi.models.V1JSONSchemaProps... items) {
    for (V1JSONSchemaProps item : items) {V1JSONSchemaPropsBuilder builder = new V1JSONSchemaPropsBuilder(item);_visitables.get("allOf").remove(builder);if (this.allOf != null) {this.allOf.remove(builder);}} return (A)this;
  }
  public A removeAllFromAllOf(Collection<V1JSONSchemaProps> items) {
    for (V1JSONSchemaProps item : items) {V1JSONSchemaPropsBuilder builder = new V1JSONSchemaPropsBuilder(item);_visitables.get("allOf").remove(builder);if (this.allOf != null) {this.allOf.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromAllOf(Predicate<V1JSONSchemaPropsBuilder> predicate) {
    if (allOf == null) return (A) this;
    final Iterator<V1JSONSchemaPropsBuilder> each = allOf.iterator();
    final List visitables = _visitables.get("allOf");
    while (each.hasNext()) {
      V1JSONSchemaPropsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildAllOf instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1JSONSchemaProps> getAllOf() {
    return allOf != null ? build(allOf) : null;
  }
  public List<V1JSONSchemaProps> buildAllOf() {
    return allOf != null ? build(allOf) : null;
  }
  public V1JSONSchemaProps buildAllOf(Integer index) {
    return this.allOf.get(index).build();
  }
  public V1JSONSchemaProps buildFirstAllOf() {
    return this.allOf.get(0).build();
  }
  public V1JSONSchemaProps buildLastAllOf() {
    return this.allOf.get(allOf.size() - 1).build();
  }
  public V1JSONSchemaProps buildMatchingAllOf(Predicate<V1JSONSchemaPropsBuilder> predicate) {
    for (V1JSONSchemaPropsBuilder item: allOf) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingAllOf(Predicate<V1JSONSchemaPropsBuilder> predicate) {
    for (V1JSONSchemaPropsBuilder item: allOf) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withAllOf(List<V1JSONSchemaProps> allOf) {
    if (this.allOf != null) { _visitables.get("allOf").removeAll(this.allOf);}
    if (allOf != null) {this.allOf = new ArrayList(); for (V1JSONSchemaProps item : allOf){this.addToAllOf(item);}} else { this.allOf = null;} return (A) this;
  }
  public A withAllOf(io.kubernetes.client.openapi.models.V1JSONSchemaProps... allOf) {
    if (this.allOf != null) {this.allOf.clear();}
    if (allOf != null) {for (V1JSONSchemaProps item :allOf){ this.addToAllOf(item);}} return (A) this;
  }
  public Boolean hasAllOf() {
    return allOf != null && !allOf.isEmpty();
  }
  public V1JSONSchemaPropsFluent.AllOfNested<A> addNewAllOf() {
    return new V1JSONSchemaPropsFluentImpl.AllOfNestedImpl();
  }
  public V1JSONSchemaPropsFluent.AllOfNested<A> addNewAllOfLike(V1JSONSchemaProps item) {
    return new V1JSONSchemaPropsFluentImpl.AllOfNestedImpl(-1, item);
  }
  public V1JSONSchemaPropsFluent.AllOfNested<A> setNewAllOfLike(Integer index,V1JSONSchemaProps item) {
    return new V1JSONSchemaPropsFluentImpl.AllOfNestedImpl(index, item);
  }
  public V1JSONSchemaPropsFluent.AllOfNested<A> editAllOf(Integer index) {
    if (allOf.size() <= index) throw new RuntimeException("Can't edit allOf. Index exceeds size.");
    return setNewAllOfLike(index, buildAllOf(index));
  }
  public V1JSONSchemaPropsFluent.AllOfNested<A> editFirstAllOf() {
    if (allOf.size() == 0) throw new RuntimeException("Can't edit first allOf. The list is empty.");
    return setNewAllOfLike(0, buildAllOf(0));
  }
  public V1JSONSchemaPropsFluent.AllOfNested<A> editLastAllOf() {
    int index = allOf.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last allOf. The list is empty.");
    return setNewAllOfLike(index, buildAllOf(index));
  }
  public V1JSONSchemaPropsFluent.AllOfNested<A> editMatchingAllOf(Predicate<V1JSONSchemaPropsBuilder> predicate) {
    int index = -1;
    for (int i=0;i<allOf.size();i++) { 
    if (predicate.test(allOf.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching allOf. No match found.");
    return setNewAllOfLike(index, buildAllOf(index));
  }
  public A addToAnyOf(Integer index,V1JSONSchemaProps item) {
    if (this.anyOf == null) {this.anyOf = new ArrayList<V1JSONSchemaPropsBuilder>();}
    V1JSONSchemaPropsBuilder builder = new V1JSONSchemaPropsBuilder(item);_visitables.get("anyOf").add(index >= 0 ? index : _visitables.get("anyOf").size(), builder);this.anyOf.add(index >= 0 ? index : anyOf.size(), builder); return (A)this;
  }
  public A setToAnyOf(Integer index,V1JSONSchemaProps item) {
    if (this.anyOf == null) {this.anyOf = new ArrayList<V1JSONSchemaPropsBuilder>();}
    V1JSONSchemaPropsBuilder builder = new V1JSONSchemaPropsBuilder(item);
    if (index < 0 || index >= _visitables.get("anyOf").size()) { _visitables.get("anyOf").add(builder); } else { _visitables.get("anyOf").set(index, builder);}
    if (index < 0 || index >= anyOf.size()) { anyOf.add(builder); } else { anyOf.set(index, builder);}
     return (A)this;
  }
  public A addToAnyOf(io.kubernetes.client.openapi.models.V1JSONSchemaProps... items) {
    if (this.anyOf == null) {this.anyOf = new ArrayList<V1JSONSchemaPropsBuilder>();}
    for (V1JSONSchemaProps item : items) {V1JSONSchemaPropsBuilder builder = new V1JSONSchemaPropsBuilder(item);_visitables.get("anyOf").add(builder);this.anyOf.add(builder);} return (A)this;
  }
  public A addAllToAnyOf(Collection<V1JSONSchemaProps> items) {
    if (this.anyOf == null) {this.anyOf = new ArrayList<V1JSONSchemaPropsBuilder>();}
    for (V1JSONSchemaProps item : items) {V1JSONSchemaPropsBuilder builder = new V1JSONSchemaPropsBuilder(item);_visitables.get("anyOf").add(builder);this.anyOf.add(builder);} return (A)this;
  }
  public A removeFromAnyOf(io.kubernetes.client.openapi.models.V1JSONSchemaProps... items) {
    for (V1JSONSchemaProps item : items) {V1JSONSchemaPropsBuilder builder = new V1JSONSchemaPropsBuilder(item);_visitables.get("anyOf").remove(builder);if (this.anyOf != null) {this.anyOf.remove(builder);}} return (A)this;
  }
  public A removeAllFromAnyOf(Collection<V1JSONSchemaProps> items) {
    for (V1JSONSchemaProps item : items) {V1JSONSchemaPropsBuilder builder = new V1JSONSchemaPropsBuilder(item);_visitables.get("anyOf").remove(builder);if (this.anyOf != null) {this.anyOf.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromAnyOf(Predicate<V1JSONSchemaPropsBuilder> predicate) {
    if (anyOf == null) return (A) this;
    final Iterator<V1JSONSchemaPropsBuilder> each = anyOf.iterator();
    final List visitables = _visitables.get("anyOf");
    while (each.hasNext()) {
      V1JSONSchemaPropsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildAnyOf instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1JSONSchemaProps> getAnyOf() {
    return anyOf != null ? build(anyOf) : null;
  }
  public List<V1JSONSchemaProps> buildAnyOf() {
    return anyOf != null ? build(anyOf) : null;
  }
  public V1JSONSchemaProps buildAnyOf(Integer index) {
    return this.anyOf.get(index).build();
  }
  public V1JSONSchemaProps buildFirstAnyOf() {
    return this.anyOf.get(0).build();
  }
  public V1JSONSchemaProps buildLastAnyOf() {
    return this.anyOf.get(anyOf.size() - 1).build();
  }
  public V1JSONSchemaProps buildMatchingAnyOf(Predicate<V1JSONSchemaPropsBuilder> predicate) {
    for (V1JSONSchemaPropsBuilder item: anyOf) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingAnyOf(Predicate<V1JSONSchemaPropsBuilder> predicate) {
    for (V1JSONSchemaPropsBuilder item: anyOf) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withAnyOf(List<V1JSONSchemaProps> anyOf) {
    if (this.anyOf != null) { _visitables.get("anyOf").removeAll(this.anyOf);}
    if (anyOf != null) {this.anyOf = new ArrayList(); for (V1JSONSchemaProps item : anyOf){this.addToAnyOf(item);}} else { this.anyOf = null;} return (A) this;
  }
  public A withAnyOf(io.kubernetes.client.openapi.models.V1JSONSchemaProps... anyOf) {
    if (this.anyOf != null) {this.anyOf.clear();}
    if (anyOf != null) {for (V1JSONSchemaProps item :anyOf){ this.addToAnyOf(item);}} return (A) this;
  }
  public Boolean hasAnyOf() {
    return anyOf != null && !anyOf.isEmpty();
  }
  public V1JSONSchemaPropsFluent.AnyOfNested<A> addNewAnyOf() {
    return new V1JSONSchemaPropsFluentImpl.AnyOfNestedImpl();
  }
  public V1JSONSchemaPropsFluent.AnyOfNested<A> addNewAnyOfLike(V1JSONSchemaProps item) {
    return new V1JSONSchemaPropsFluentImpl.AnyOfNestedImpl(-1, item);
  }
  public V1JSONSchemaPropsFluent.AnyOfNested<A> setNewAnyOfLike(Integer index,V1JSONSchemaProps item) {
    return new V1JSONSchemaPropsFluentImpl.AnyOfNestedImpl(index, item);
  }
  public V1JSONSchemaPropsFluent.AnyOfNested<A> editAnyOf(Integer index) {
    if (anyOf.size() <= index) throw new RuntimeException("Can't edit anyOf. Index exceeds size.");
    return setNewAnyOfLike(index, buildAnyOf(index));
  }
  public V1JSONSchemaPropsFluent.AnyOfNested<A> editFirstAnyOf() {
    if (anyOf.size() == 0) throw new RuntimeException("Can't edit first anyOf. The list is empty.");
    return setNewAnyOfLike(0, buildAnyOf(0));
  }
  public V1JSONSchemaPropsFluent.AnyOfNested<A> editLastAnyOf() {
    int index = anyOf.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last anyOf. The list is empty.");
    return setNewAnyOfLike(index, buildAnyOf(index));
  }
  public V1JSONSchemaPropsFluent.AnyOfNested<A> editMatchingAnyOf(Predicate<V1JSONSchemaPropsBuilder> predicate) {
    int index = -1;
    for (int i=0;i<anyOf.size();i++) { 
    if (predicate.test(anyOf.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching anyOf. No match found.");
    return setNewAnyOfLike(index, buildAnyOf(index));
  }
  public Object getDefault() {
    return this._default;
  }
  public A withDefault(Object _default) {
    this._default=_default; return (A) this;
  }
  public Boolean hasDefault() {
    return this._default != null;
  }
  public A addToDefinitions(String key,V1JSONSchemaProps value) {
    if(this.definitions == null && key != null && value != null) { this.definitions = new LinkedHashMap(); }
    if(key != null && value != null) {this.definitions.put(key, value);} return (A)this;
  }
  public A addToDefinitions(Map<String,V1JSONSchemaProps> map) {
    if(this.definitions == null && map != null) { this.definitions = new LinkedHashMap(); }
    if(map != null) { this.definitions.putAll(map);} return (A)this;
  }
  public A removeFromDefinitions(String key) {
    if(this.definitions == null) { return (A) this; }
    if(key != null && this.definitions != null) {this.definitions.remove(key);} return (A)this;
  }
  public A removeFromDefinitions(Map<String,V1JSONSchemaProps> map) {
    if(this.definitions == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.definitions != null){this.definitions.remove(key);}}} return (A)this;
  }
  public Map<String,V1JSONSchemaProps> getDefinitions() {
    return this.definitions;
  }
  public <K,V>A withDefinitions(Map<String,V1JSONSchemaProps> definitions) {
    if (definitions == null) { this.definitions =  null;} else {this.definitions = new LinkedHashMap(definitions);} return (A) this;
  }
  public Boolean hasDefinitions() {
    return this.definitions != null;
  }
  public A addToDependencies(String key,Object value) {
    if(this.dependencies == null && key != null && value != null) { this.dependencies = new LinkedHashMap(); }
    if(key != null && value != null) {this.dependencies.put(key, value);} return (A)this;
  }
  public A addToDependencies(Map<String,Object> map) {
    if(this.dependencies == null && map != null) { this.dependencies = new LinkedHashMap(); }
    if(map != null) { this.dependencies.putAll(map);} return (A)this;
  }
  public A removeFromDependencies(String key) {
    if(this.dependencies == null) { return (A) this; }
    if(key != null && this.dependencies != null) {this.dependencies.remove(key);} return (A)this;
  }
  public A removeFromDependencies(Map<String,Object> map) {
    if(this.dependencies == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.dependencies != null){this.dependencies.remove(key);}}} return (A)this;
  }
  public Map<String,Object> getDependencies() {
    return this.dependencies;
  }
  public <K,V>A withDependencies(Map<String,Object> dependencies) {
    if (dependencies == null) { this.dependencies =  null;} else {this.dependencies = new LinkedHashMap(dependencies);} return (A) this;
  }
  public Boolean hasDependencies() {
    return this.dependencies != null;
  }
  public String getDescription() {
    return this.description;
  }
  public A withDescription(String description) {
    this.description=description; return (A) this;
  }
  public Boolean hasDescription() {
    return this.description != null;
  }
  public A addToEnum(Integer index,Object item) {
    if (this._enum == null) {this._enum = new ArrayList<Object>();}
    this._enum.add(index, item);
    return (A)this;
  }
  public A setToEnum(Integer index,Object item) {
    if (this._enum == null) {this._enum = new ArrayList<Object>();}
    this._enum.set(index, item); return (A)this;
  }
  public A addToEnum(java.lang.Object... items) {
    if (this._enum == null) {this._enum = new ArrayList<Object>();}
    for (Object item : items) {this._enum.add(item);} return (A)this;
  }
  public A addAllToEnum(Collection<Object> items) {
    if (this._enum == null) {this._enum = new ArrayList<Object>();}
    for (Object item : items) {this._enum.add(item);} return (A)this;
  }
  public A removeFromEnum(java.lang.Object... items) {
    for (Object item : items) {if (this._enum!= null){ this._enum.remove(item);}} return (A)this;
  }
  public A removeAllFromEnum(Collection<Object> items) {
    for (Object item : items) {if (this._enum!= null){ this._enum.remove(item);}} return (A)this;
  }
  public List<Object> getEnum() {
    return this._enum;
  }
  public Object getEnum(Integer index) {
    return this._enum.get(index);
  }
  public Object getFirstEnum() {
    return this._enum.get(0);
  }
  public Object getLastEnum() {
    return this._enum.get(_enum.size() - 1);
  }
  public Object getMatchingEnum(Predicate<Object> predicate) {
    for (Object item: _enum) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingEnum(Predicate<Object> predicate) {
    for (Object item: _enum) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withEnum(List<Object> _enum) {
    if (_enum != null) {this._enum = new ArrayList(); for (Object item : _enum){this.addToEnum(item);}} else { this._enum = null;} return (A) this;
  }
  public A withEnum(java.lang.Object... _enum) {
    if (this._enum != null) {this._enum.clear();}
    if (_enum != null) {for (Object item :_enum){ this.addToEnum(item);}} return (A) this;
  }
  public Boolean hasEnum() {
    return _enum != null && !_enum.isEmpty();
  }
  public Object getExample() {
    return this.example;
  }
  public A withExample(Object example) {
    this.example=example; return (A) this;
  }
  public Boolean hasExample() {
    return this.example != null;
  }
  public Boolean getExclusiveMaximum() {
    return this.exclusiveMaximum;
  }
  public A withExclusiveMaximum(Boolean exclusiveMaximum) {
    this.exclusiveMaximum=exclusiveMaximum; return (A) this;
  }
  public Boolean hasExclusiveMaximum() {
    return this.exclusiveMaximum != null;
  }
  public Boolean getExclusiveMinimum() {
    return this.exclusiveMinimum;
  }
  public A withExclusiveMinimum(Boolean exclusiveMinimum) {
    this.exclusiveMinimum=exclusiveMinimum; return (A) this;
  }
  public Boolean hasExclusiveMinimum() {
    return this.exclusiveMinimum != null;
  }
  
  /**
   * This method has been deprecated, please use method buildExternalDocs instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ExternalDocumentation getExternalDocs() {
    return this.externalDocs!=null ?this.externalDocs.build():null;
  }
  public V1ExternalDocumentation buildExternalDocs() {
    return this.externalDocs!=null ?this.externalDocs.build():null;
  }
  public A withExternalDocs(V1ExternalDocumentation externalDocs) {
    _visitables.get("externalDocs").remove(this.externalDocs);
    if (externalDocs!=null){ this.externalDocs= new V1ExternalDocumentationBuilder(externalDocs); _visitables.get("externalDocs").add(this.externalDocs);} else { this.externalDocs = null; _visitables.get("externalDocs").remove(this.externalDocs); } return (A) this;
  }
  public Boolean hasExternalDocs() {
    return this.externalDocs != null;
  }
  public V1JSONSchemaPropsFluent.ExternalDocsNested<A> withNewExternalDocs() {
    return new V1JSONSchemaPropsFluentImpl.ExternalDocsNestedImpl();
  }
  public V1JSONSchemaPropsFluent.ExternalDocsNested<A> withNewExternalDocsLike(V1ExternalDocumentation item) {
    return new V1JSONSchemaPropsFluentImpl.ExternalDocsNestedImpl(item);
  }
  public V1JSONSchemaPropsFluent.ExternalDocsNested<A> editExternalDocs() {
    return withNewExternalDocsLike(getExternalDocs());
  }
  public V1JSONSchemaPropsFluent.ExternalDocsNested<A> editOrNewExternalDocs() {
    return withNewExternalDocsLike(getExternalDocs() != null ? getExternalDocs(): new V1ExternalDocumentationBuilder().build());
  }
  public V1JSONSchemaPropsFluent.ExternalDocsNested<A> editOrNewExternalDocsLike(V1ExternalDocumentation item) {
    return withNewExternalDocsLike(getExternalDocs() != null ? getExternalDocs(): item);
  }
  public String getFormat() {
    return this.format;
  }
  public A withFormat(String format) {
    this.format=format; return (A) this;
  }
  public Boolean hasFormat() {
    return this.format != null;
  }
  public String getId() {
    return this.id;
  }
  public A withId(String id) {
    this.id=id; return (A) this;
  }
  public Boolean hasId() {
    return this.id != null;
  }
  public Object getItems() {
    return this.items;
  }
  public A withItems(Object items) {
    this.items=items; return (A) this;
  }
  public Boolean hasItems() {
    return this.items != null;
  }
  public Long getMaxItems() {
    return this.maxItems;
  }
  public A withMaxItems(Long maxItems) {
    this.maxItems=maxItems; return (A) this;
  }
  public Boolean hasMaxItems() {
    return this.maxItems != null;
  }
  public Long getMaxLength() {
    return this.maxLength;
  }
  public A withMaxLength(Long maxLength) {
    this.maxLength=maxLength; return (A) this;
  }
  public Boolean hasMaxLength() {
    return this.maxLength != null;
  }
  public Long getMaxProperties() {
    return this.maxProperties;
  }
  public A withMaxProperties(Long maxProperties) {
    this.maxProperties=maxProperties; return (A) this;
  }
  public Boolean hasMaxProperties() {
    return this.maxProperties != null;
  }
  public Double getMaximum() {
    return this.maximum;
  }
  public A withMaximum(Double maximum) {
    this.maximum=maximum; return (A) this;
  }
  public Boolean hasMaximum() {
    return this.maximum != null;
  }
  public Long getMinItems() {
    return this.minItems;
  }
  public A withMinItems(Long minItems) {
    this.minItems=minItems; return (A) this;
  }
  public Boolean hasMinItems() {
    return this.minItems != null;
  }
  public Long getMinLength() {
    return this.minLength;
  }
  public A withMinLength(Long minLength) {
    this.minLength=minLength; return (A) this;
  }
  public Boolean hasMinLength() {
    return this.minLength != null;
  }
  public Long getMinProperties() {
    return this.minProperties;
  }
  public A withMinProperties(Long minProperties) {
    this.minProperties=minProperties; return (A) this;
  }
  public Boolean hasMinProperties() {
    return this.minProperties != null;
  }
  public Double getMinimum() {
    return this.minimum;
  }
  public A withMinimum(Double minimum) {
    this.minimum=minimum; return (A) this;
  }
  public Boolean hasMinimum() {
    return this.minimum != null;
  }
  public Double getMultipleOf() {
    return this.multipleOf;
  }
  public A withMultipleOf(Double multipleOf) {
    this.multipleOf=multipleOf; return (A) this;
  }
  public Boolean hasMultipleOf() {
    return this.multipleOf != null;
  }
  
  /**
   * This method has been deprecated, please use method buildNot instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1JSONSchemaProps getNot() {
    return this.not!=null ?this.not.build():null;
  }
  public V1JSONSchemaProps buildNot() {
    return this.not!=null ?this.not.build():null;
  }
  public A withNot(V1JSONSchemaProps not) {
    _visitables.get("not").remove(this.not);
    if (not!=null){ this.not= new V1JSONSchemaPropsBuilder(not); _visitables.get("not").add(this.not);} else { this.not = null; _visitables.get("not").remove(this.not); } return (A) this;
  }
  public Boolean hasNot() {
    return this.not != null;
  }
  public V1JSONSchemaPropsFluent.NotNested<A> withNewNot() {
    return new V1JSONSchemaPropsFluentImpl.NotNestedImpl();
  }
  public V1JSONSchemaPropsFluent.NotNested<A> withNewNotLike(V1JSONSchemaProps item) {
    return new V1JSONSchemaPropsFluentImpl.NotNestedImpl(item);
  }
  public V1JSONSchemaPropsFluent.NotNested<A> editNot() {
    return withNewNotLike(getNot());
  }
  public V1JSONSchemaPropsFluent.NotNested<A> editOrNewNot() {
    return withNewNotLike(getNot() != null ? getNot(): new V1JSONSchemaPropsBuilder().build());
  }
  public V1JSONSchemaPropsFluent.NotNested<A> editOrNewNotLike(V1JSONSchemaProps item) {
    return withNewNotLike(getNot() != null ? getNot(): item);
  }
  public Boolean getNullable() {
    return this.nullable;
  }
  public A withNullable(Boolean nullable) {
    this.nullable=nullable; return (A) this;
  }
  public Boolean hasNullable() {
    return this.nullable != null;
  }
  public A addToOneOf(Integer index,V1JSONSchemaProps item) {
    if (this.oneOf == null) {this.oneOf = new ArrayList<V1JSONSchemaPropsBuilder>();}
    V1JSONSchemaPropsBuilder builder = new V1JSONSchemaPropsBuilder(item);_visitables.get("oneOf").add(index >= 0 ? index : _visitables.get("oneOf").size(), builder);this.oneOf.add(index >= 0 ? index : oneOf.size(), builder); return (A)this;
  }
  public A setToOneOf(Integer index,V1JSONSchemaProps item) {
    if (this.oneOf == null) {this.oneOf = new ArrayList<V1JSONSchemaPropsBuilder>();}
    V1JSONSchemaPropsBuilder builder = new V1JSONSchemaPropsBuilder(item);
    if (index < 0 || index >= _visitables.get("oneOf").size()) { _visitables.get("oneOf").add(builder); } else { _visitables.get("oneOf").set(index, builder);}
    if (index < 0 || index >= oneOf.size()) { oneOf.add(builder); } else { oneOf.set(index, builder);}
     return (A)this;
  }
  public A addToOneOf(io.kubernetes.client.openapi.models.V1JSONSchemaProps... items) {
    if (this.oneOf == null) {this.oneOf = new ArrayList<V1JSONSchemaPropsBuilder>();}
    for (V1JSONSchemaProps item : items) {V1JSONSchemaPropsBuilder builder = new V1JSONSchemaPropsBuilder(item);_visitables.get("oneOf").add(builder);this.oneOf.add(builder);} return (A)this;
  }
  public A addAllToOneOf(Collection<V1JSONSchemaProps> items) {
    if (this.oneOf == null) {this.oneOf = new ArrayList<V1JSONSchemaPropsBuilder>();}
    for (V1JSONSchemaProps item : items) {V1JSONSchemaPropsBuilder builder = new V1JSONSchemaPropsBuilder(item);_visitables.get("oneOf").add(builder);this.oneOf.add(builder);} return (A)this;
  }
  public A removeFromOneOf(io.kubernetes.client.openapi.models.V1JSONSchemaProps... items) {
    for (V1JSONSchemaProps item : items) {V1JSONSchemaPropsBuilder builder = new V1JSONSchemaPropsBuilder(item);_visitables.get("oneOf").remove(builder);if (this.oneOf != null) {this.oneOf.remove(builder);}} return (A)this;
  }
  public A removeAllFromOneOf(Collection<V1JSONSchemaProps> items) {
    for (V1JSONSchemaProps item : items) {V1JSONSchemaPropsBuilder builder = new V1JSONSchemaPropsBuilder(item);_visitables.get("oneOf").remove(builder);if (this.oneOf != null) {this.oneOf.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromOneOf(Predicate<V1JSONSchemaPropsBuilder> predicate) {
    if (oneOf == null) return (A) this;
    final Iterator<V1JSONSchemaPropsBuilder> each = oneOf.iterator();
    final List visitables = _visitables.get("oneOf");
    while (each.hasNext()) {
      V1JSONSchemaPropsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildOneOf instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1JSONSchemaProps> getOneOf() {
    return oneOf != null ? build(oneOf) : null;
  }
  public List<V1JSONSchemaProps> buildOneOf() {
    return oneOf != null ? build(oneOf) : null;
  }
  public V1JSONSchemaProps buildOneOf(Integer index) {
    return this.oneOf.get(index).build();
  }
  public V1JSONSchemaProps buildFirstOneOf() {
    return this.oneOf.get(0).build();
  }
  public V1JSONSchemaProps buildLastOneOf() {
    return this.oneOf.get(oneOf.size() - 1).build();
  }
  public V1JSONSchemaProps buildMatchingOneOf(Predicate<V1JSONSchemaPropsBuilder> predicate) {
    for (V1JSONSchemaPropsBuilder item: oneOf) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingOneOf(Predicate<V1JSONSchemaPropsBuilder> predicate) {
    for (V1JSONSchemaPropsBuilder item: oneOf) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withOneOf(List<V1JSONSchemaProps> oneOf) {
    if (this.oneOf != null) { _visitables.get("oneOf").removeAll(this.oneOf);}
    if (oneOf != null) {this.oneOf = new ArrayList(); for (V1JSONSchemaProps item : oneOf){this.addToOneOf(item);}} else { this.oneOf = null;} return (A) this;
  }
  public A withOneOf(io.kubernetes.client.openapi.models.V1JSONSchemaProps... oneOf) {
    if (this.oneOf != null) {this.oneOf.clear();}
    if (oneOf != null) {for (V1JSONSchemaProps item :oneOf){ this.addToOneOf(item);}} return (A) this;
  }
  public Boolean hasOneOf() {
    return oneOf != null && !oneOf.isEmpty();
  }
  public V1JSONSchemaPropsFluent.OneOfNested<A> addNewOneOf() {
    return new V1JSONSchemaPropsFluentImpl.OneOfNestedImpl();
  }
  public V1JSONSchemaPropsFluent.OneOfNested<A> addNewOneOfLike(V1JSONSchemaProps item) {
    return new V1JSONSchemaPropsFluentImpl.OneOfNestedImpl(-1, item);
  }
  public V1JSONSchemaPropsFluent.OneOfNested<A> setNewOneOfLike(Integer index,V1JSONSchemaProps item) {
    return new V1JSONSchemaPropsFluentImpl.OneOfNestedImpl(index, item);
  }
  public V1JSONSchemaPropsFluent.OneOfNested<A> editOneOf(Integer index) {
    if (oneOf.size() <= index) throw new RuntimeException("Can't edit oneOf. Index exceeds size.");
    return setNewOneOfLike(index, buildOneOf(index));
  }
  public V1JSONSchemaPropsFluent.OneOfNested<A> editFirstOneOf() {
    if (oneOf.size() == 0) throw new RuntimeException("Can't edit first oneOf. The list is empty.");
    return setNewOneOfLike(0, buildOneOf(0));
  }
  public V1JSONSchemaPropsFluent.OneOfNested<A> editLastOneOf() {
    int index = oneOf.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last oneOf. The list is empty.");
    return setNewOneOfLike(index, buildOneOf(index));
  }
  public V1JSONSchemaPropsFluent.OneOfNested<A> editMatchingOneOf(Predicate<V1JSONSchemaPropsBuilder> predicate) {
    int index = -1;
    for (int i=0;i<oneOf.size();i++) { 
    if (predicate.test(oneOf.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching oneOf. No match found.");
    return setNewOneOfLike(index, buildOneOf(index));
  }
  public String getPattern() {
    return this.pattern;
  }
  public A withPattern(String pattern) {
    this.pattern=pattern; return (A) this;
  }
  public Boolean hasPattern() {
    return this.pattern != null;
  }
  public A addToPatternProperties(String key,V1JSONSchemaProps value) {
    if(this.patternProperties == null && key != null && value != null) { this.patternProperties = new LinkedHashMap(); }
    if(key != null && value != null) {this.patternProperties.put(key, value);} return (A)this;
  }
  public A addToPatternProperties(Map<String,V1JSONSchemaProps> map) {
    if(this.patternProperties == null && map != null) { this.patternProperties = new LinkedHashMap(); }
    if(map != null) { this.patternProperties.putAll(map);} return (A)this;
  }
  public A removeFromPatternProperties(String key) {
    if(this.patternProperties == null) { return (A) this; }
    if(key != null && this.patternProperties != null) {this.patternProperties.remove(key);} return (A)this;
  }
  public A removeFromPatternProperties(Map<String,V1JSONSchemaProps> map) {
    if(this.patternProperties == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.patternProperties != null){this.patternProperties.remove(key);}}} return (A)this;
  }
  public Map<String,V1JSONSchemaProps> getPatternProperties() {
    return this.patternProperties;
  }
  public <K,V>A withPatternProperties(Map<String,V1JSONSchemaProps> patternProperties) {
    if (patternProperties == null) { this.patternProperties =  null;} else {this.patternProperties = new LinkedHashMap(patternProperties);} return (A) this;
  }
  public Boolean hasPatternProperties() {
    return this.patternProperties != null;
  }
  public A addToProperties(String key,V1JSONSchemaProps value) {
    if(this.properties == null && key != null && value != null) { this.properties = new LinkedHashMap(); }
    if(key != null && value != null) {this.properties.put(key, value);} return (A)this;
  }
  public A addToProperties(Map<String,V1JSONSchemaProps> map) {
    if(this.properties == null && map != null) { this.properties = new LinkedHashMap(); }
    if(map != null) { this.properties.putAll(map);} return (A)this;
  }
  public A removeFromProperties(String key) {
    if(this.properties == null) { return (A) this; }
    if(key != null && this.properties != null) {this.properties.remove(key);} return (A)this;
  }
  public A removeFromProperties(Map<String,V1JSONSchemaProps> map) {
    if(this.properties == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.properties != null){this.properties.remove(key);}}} return (A)this;
  }
  public Map<String,V1JSONSchemaProps> getProperties() {
    return this.properties;
  }
  public <K,V>A withProperties(Map<String,V1JSONSchemaProps> properties) {
    if (properties == null) { this.properties =  null;} else {this.properties = new LinkedHashMap(properties);} return (A) this;
  }
  public Boolean hasProperties() {
    return this.properties != null;
  }
  public A addToRequired(Integer index,String item) {
    if (this.required == null) {this.required = new ArrayList<String>();}
    this.required.add(index, item);
    return (A)this;
  }
  public A setToRequired(Integer index,String item) {
    if (this.required == null) {this.required = new ArrayList<String>();}
    this.required.set(index, item); return (A)this;
  }
  public A addToRequired(java.lang.String... items) {
    if (this.required == null) {this.required = new ArrayList<String>();}
    for (String item : items) {this.required.add(item);} return (A)this;
  }
  public A addAllToRequired(Collection<String> items) {
    if (this.required == null) {this.required = new ArrayList<String>();}
    for (String item : items) {this.required.add(item);} return (A)this;
  }
  public A removeFromRequired(java.lang.String... items) {
    for (String item : items) {if (this.required!= null){ this.required.remove(item);}} return (A)this;
  }
  public A removeAllFromRequired(Collection<String> items) {
    for (String item : items) {if (this.required!= null){ this.required.remove(item);}} return (A)this;
  }
  public List<String> getRequired() {
    return this.required;
  }
  public String getRequired(Integer index) {
    return this.required.get(index);
  }
  public String getFirstRequired() {
    return this.required.get(0);
  }
  public String getLastRequired() {
    return this.required.get(required.size() - 1);
  }
  public String getMatchingRequired(Predicate<String> predicate) {
    for (String item: required) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingRequired(Predicate<String> predicate) {
    for (String item: required) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withRequired(List<String> required) {
    if (required != null) {this.required = new ArrayList(); for (String item : required){this.addToRequired(item);}} else { this.required = null;} return (A) this;
  }
  public A withRequired(java.lang.String... required) {
    if (this.required != null) {this.required.clear();}
    if (required != null) {for (String item :required){ this.addToRequired(item);}} return (A) this;
  }
  public Boolean hasRequired() {
    return required != null && !required.isEmpty();
  }
  public String getTitle() {
    return this.title;
  }
  public A withTitle(String title) {
    this.title=title; return (A) this;
  }
  public Boolean hasTitle() {
    return this.title != null;
  }
  public String getType() {
    return this.type;
  }
  public A withType(String type) {
    this.type=type; return (A) this;
  }
  public Boolean hasType() {
    return this.type != null;
  }
  public Boolean getUniqueItems() {
    return this.uniqueItems;
  }
  public A withUniqueItems(Boolean uniqueItems) {
    this.uniqueItems=uniqueItems; return (A) this;
  }
  public Boolean hasUniqueItems() {
    return this.uniqueItems != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1JSONSchemaPropsFluentImpl that = (V1JSONSchemaPropsFluentImpl) o;
    if ($ref != null ? !$ref.equals(that.$ref) :that.$ref != null) return false;
    if ($schema != null ? !$schema.equals(that.$schema) :that.$schema != null) return false;
    if (additionalItems != null ? !additionalItems.equals(that.additionalItems) :that.additionalItems != null) return false;
    if (additionalProperties != null ? !additionalProperties.equals(that.additionalProperties) :that.additionalProperties != null) return false;
    if (allOf != null ? !allOf.equals(that.allOf) :that.allOf != null) return false;
    if (anyOf != null ? !anyOf.equals(that.anyOf) :that.anyOf != null) return false;
    if (_default != null ? !_default.equals(that._default) :that._default != null) return false;
    if (definitions != null ? !definitions.equals(that.definitions) :that.definitions != null) return false;
    if (dependencies != null ? !dependencies.equals(that.dependencies) :that.dependencies != null) return false;
    if (description != null ? !description.equals(that.description) :that.description != null) return false;
    if (_enum != null ? !_enum.equals(that._enum) :that._enum != null) return false;
    if (example != null ? !example.equals(that.example) :that.example != null) return false;
    if (exclusiveMaximum != null ? !exclusiveMaximum.equals(that.exclusiveMaximum) :that.exclusiveMaximum != null) return false;
    if (exclusiveMinimum != null ? !exclusiveMinimum.equals(that.exclusiveMinimum) :that.exclusiveMinimum != null) return false;
    if (externalDocs != null ? !externalDocs.equals(that.externalDocs) :that.externalDocs != null) return false;
    if (format != null ? !format.equals(that.format) :that.format != null) return false;
    if (id != null ? !id.equals(that.id) :that.id != null) return false;
    if (items != null ? !items.equals(that.items) :that.items != null) return false;
    if (maxItems != null ? !maxItems.equals(that.maxItems) :that.maxItems != null) return false;
    if (maxLength != null ? !maxLength.equals(that.maxLength) :that.maxLength != null) return false;
    if (maxProperties != null ? !maxProperties.equals(that.maxProperties) :that.maxProperties != null) return false;
    if (maximum != null ? !maximum.equals(that.maximum) :that.maximum != null) return false;
    if (minItems != null ? !minItems.equals(that.minItems) :that.minItems != null) return false;
    if (minLength != null ? !minLength.equals(that.minLength) :that.minLength != null) return false;
    if (minProperties != null ? !minProperties.equals(that.minProperties) :that.minProperties != null) return false;
    if (minimum != null ? !minimum.equals(that.minimum) :that.minimum != null) return false;
    if (multipleOf != null ? !multipleOf.equals(that.multipleOf) :that.multipleOf != null) return false;
    if (not != null ? !not.equals(that.not) :that.not != null) return false;
    if (nullable != null ? !nullable.equals(that.nullable) :that.nullable != null) return false;
    if (oneOf != null ? !oneOf.equals(that.oneOf) :that.oneOf != null) return false;
    if (pattern != null ? !pattern.equals(that.pattern) :that.pattern != null) return false;
    if (patternProperties != null ? !patternProperties.equals(that.patternProperties) :that.patternProperties != null) return false;
    if (properties != null ? !properties.equals(that.properties) :that.properties != null) return false;
    if (required != null ? !required.equals(that.required) :that.required != null) return false;
    if (title != null ? !title.equals(that.title) :that.title != null) return false;
    if (type != null ? !type.equals(that.type) :that.type != null) return false;
    if (uniqueItems != null ? !uniqueItems.equals(that.uniqueItems) :that.uniqueItems != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash($ref,  $schema,  additionalItems,  additionalProperties,  allOf,  anyOf,  _default,  definitions,  dependencies,  description,  _enum,  example,  exclusiveMaximum,  exclusiveMinimum,  externalDocs,  format,  id,  items,  maxItems,  maxLength,  maxProperties,  maximum,  minItems,  minLength,  minProperties,  minimum,  multipleOf,  not,  nullable,  oneOf,  pattern,  patternProperties,  properties,  required,  title,  type,  uniqueItems,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if ($ref != null) { sb.append("$ref:"); sb.append($ref + ","); }
    if ($schema != null) { sb.append("$schema:"); sb.append($schema + ","); }
    if (additionalItems != null) { sb.append("additionalItems:"); sb.append(additionalItems + ","); }
    if (additionalProperties != null) { sb.append("additionalProperties:"); sb.append(additionalProperties + ","); }
    if (allOf != null && !allOf.isEmpty()) { sb.append("allOf:"); sb.append(allOf + ","); }
    if (anyOf != null && !anyOf.isEmpty()) { sb.append("anyOf:"); sb.append(anyOf + ","); }
    if (_default != null) { sb.append("_default:"); sb.append(_default + ","); }
    if (definitions != null && !definitions.isEmpty()) { sb.append("definitions:"); sb.append(definitions + ","); }
    if (dependencies != null && !dependencies.isEmpty()) { sb.append("dependencies:"); sb.append(dependencies + ","); }
    if (description != null) { sb.append("description:"); sb.append(description + ","); }
    if (_enum != null && !_enum.isEmpty()) { sb.append("_enum:"); sb.append(_enum + ","); }
    if (example != null) { sb.append("example:"); sb.append(example + ","); }
    if (exclusiveMaximum != null) { sb.append("exclusiveMaximum:"); sb.append(exclusiveMaximum + ","); }
    if (exclusiveMinimum != null) { sb.append("exclusiveMinimum:"); sb.append(exclusiveMinimum + ","); }
    if (externalDocs != null) { sb.append("externalDocs:"); sb.append(externalDocs + ","); }
    if (format != null) { sb.append("format:"); sb.append(format + ","); }
    if (id != null) { sb.append("id:"); sb.append(id + ","); }
    if (items != null) { sb.append("items:"); sb.append(items + ","); }
    if (maxItems != null) { sb.append("maxItems:"); sb.append(maxItems + ","); }
    if (maxLength != null) { sb.append("maxLength:"); sb.append(maxLength + ","); }
    if (maxProperties != null) { sb.append("maxProperties:"); sb.append(maxProperties + ","); }
    if (maximum != null) { sb.append("maximum:"); sb.append(maximum + ","); }
    if (minItems != null) { sb.append("minItems:"); sb.append(minItems + ","); }
    if (minLength != null) { sb.append("minLength:"); sb.append(minLength + ","); }
    if (minProperties != null) { sb.append("minProperties:"); sb.append(minProperties + ","); }
    if (minimum != null) { sb.append("minimum:"); sb.append(minimum + ","); }
    if (multipleOf != null) { sb.append("multipleOf:"); sb.append(multipleOf + ","); }
    if (not != null) { sb.append("not:"); sb.append(not + ","); }
    if (nullable != null) { sb.append("nullable:"); sb.append(nullable + ","); }
    if (oneOf != null && !oneOf.isEmpty()) { sb.append("oneOf:"); sb.append(oneOf + ","); }
    if (pattern != null) { sb.append("pattern:"); sb.append(pattern + ","); }
    if (patternProperties != null && !patternProperties.isEmpty()) { sb.append("patternProperties:"); sb.append(patternProperties + ","); }
    if (properties != null && !properties.isEmpty()) { sb.append("properties:"); sb.append(properties + ","); }
    if (required != null && !required.isEmpty()) { sb.append("required:"); sb.append(required + ","); }
    if (title != null) { sb.append("title:"); sb.append(title + ","); }
    if (type != null) { sb.append("type:"); sb.append(type + ","); }
    if (uniqueItems != null) { sb.append("uniqueItems:"); sb.append(uniqueItems); }
    sb.append("}");
    return sb.toString();
  }
  public A withExclusiveMaximum() {
    return withExclusiveMaximum(true);
  }
  public A withExclusiveMinimum() {
    return withExclusiveMinimum(true);
  }
  public A withNullable() {
    return withNullable(true);
  }
  public A withUniqueItems() {
    return withUniqueItems(true);
  }
  class AllOfNestedImpl<N> extends V1JSONSchemaPropsFluentImpl<V1JSONSchemaPropsFluent.AllOfNested<N>> implements V1JSONSchemaPropsFluent.AllOfNested<N>,Nested<N>{
    AllOfNestedImpl(Integer index,V1JSONSchemaProps item) {
      this.index = index;
      this.builder = new V1JSONSchemaPropsBuilder(this, item);
    }
    AllOfNestedImpl() {
      this.index = -1;
      this.builder = new V1JSONSchemaPropsBuilder(this);
    }
    V1JSONSchemaPropsBuilder builder;
    Integer index;
    public N and() {
      return (N) V1JSONSchemaPropsFluentImpl.this.setToAllOf(index,builder.build());
    }
    public N endAllOf() {
      return and();
    }
    
  }
  class AnyOfNestedImpl<N> extends V1JSONSchemaPropsFluentImpl<V1JSONSchemaPropsFluent.AnyOfNested<N>> implements V1JSONSchemaPropsFluent.AnyOfNested<N>,Nested<N>{
    AnyOfNestedImpl(Integer index,V1JSONSchemaProps item) {
      this.index = index;
      this.builder = new V1JSONSchemaPropsBuilder(this, item);
    }
    AnyOfNestedImpl() {
      this.index = -1;
      this.builder = new V1JSONSchemaPropsBuilder(this);
    }
    V1JSONSchemaPropsBuilder builder;
    Integer index;
    public N and() {
      return (N) V1JSONSchemaPropsFluentImpl.this.setToAnyOf(index,builder.build());
    }
    public N endAnyOf() {
      return and();
    }
    
  }
  class ExternalDocsNestedImpl<N> extends V1ExternalDocumentationFluentImpl<V1JSONSchemaPropsFluent.ExternalDocsNested<N>> implements V1JSONSchemaPropsFluent.ExternalDocsNested<N>,Nested<N>{
    ExternalDocsNestedImpl(V1ExternalDocumentation item) {
      this.builder = new V1ExternalDocumentationBuilder(this, item);
    }
    ExternalDocsNestedImpl() {
      this.builder = new V1ExternalDocumentationBuilder(this);
    }
    V1ExternalDocumentationBuilder builder;
    public N and() {
      return (N) V1JSONSchemaPropsFluentImpl.this.withExternalDocs(builder.build());
    }
    public N endExternalDocs() {
      return and();
    }
    
  }
  class NotNestedImpl<N> extends V1JSONSchemaPropsFluentImpl<V1JSONSchemaPropsFluent.NotNested<N>> implements V1JSONSchemaPropsFluent.NotNested<N>,Nested<N>{
    NotNestedImpl(V1JSONSchemaProps item) {
      this.builder = new V1JSONSchemaPropsBuilder(this, item);
    }
    NotNestedImpl() {
      this.builder = new V1JSONSchemaPropsBuilder(this);
    }
    V1JSONSchemaPropsBuilder builder;
    public N and() {
      return (N) V1JSONSchemaPropsFluentImpl.this.withNot(builder.build());
    }
    public N endNot() {
      return and();
    }
    
  }
  class OneOfNestedImpl<N> extends V1JSONSchemaPropsFluentImpl<V1JSONSchemaPropsFluent.OneOfNested<N>> implements V1JSONSchemaPropsFluent.OneOfNested<N>,Nested<N>{
    OneOfNestedImpl(Integer index,V1JSONSchemaProps item) {
      this.index = index;
      this.builder = new V1JSONSchemaPropsBuilder(this, item);
    }
    OneOfNestedImpl() {
      this.index = -1;
      this.builder = new V1JSONSchemaPropsBuilder(this);
    }
    V1JSONSchemaPropsBuilder builder;
    Integer index;
    public N and() {
      return (N) V1JSONSchemaPropsFluentImpl.this.setToOneOf(index,builder.build());
    }
    public N endOneOf() {
      return and();
    }
    
  }
  
}