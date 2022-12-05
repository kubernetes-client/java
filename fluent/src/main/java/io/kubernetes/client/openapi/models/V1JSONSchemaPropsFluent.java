package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import io.kubernetes.client.fluent.Fluent;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

 /**
  * Generated
  */
public interface V1JSONSchemaPropsFluent<A extends V1JSONSchemaPropsFluent<A>> extends Fluent<A>{
  public String getRef();
  public A withRef(String $ref);
  public Boolean hasRef();
  public String getSchema();
  public A withSchema(String $schema);
  public Boolean hasSchema();
  public Object getAdditionalItems();
  public A withAdditionalItems(Object additionalItems);
  public Boolean hasAdditionalItems();
  public Object getAdditionalProperties();
  public A withAdditionalProperties(Object additionalProperties);
  public Boolean hasAdditionalProperties();
  public A addToAllOf(Integer index,V1JSONSchemaProps item);
  public A setToAllOf(Integer index,V1JSONSchemaProps item);
  public A addToAllOf(io.kubernetes.client.openapi.models.V1JSONSchemaProps... items);
  public A addAllToAllOf(Collection<V1JSONSchemaProps> items);
  public A removeFromAllOf(io.kubernetes.client.openapi.models.V1JSONSchemaProps... items);
  public A removeAllFromAllOf(Collection<V1JSONSchemaProps> items);
  public A removeMatchingFromAllOf(Predicate<V1JSONSchemaPropsBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildAllOf instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1JSONSchemaProps> getAllOf();
  public List<V1JSONSchemaProps> buildAllOf();
  public V1JSONSchemaProps buildAllOf(Integer index);
  public V1JSONSchemaProps buildFirstAllOf();
  public V1JSONSchemaProps buildLastAllOf();
  public V1JSONSchemaProps buildMatchingAllOf(Predicate<V1JSONSchemaPropsBuilder> predicate);
  public Boolean hasMatchingAllOf(Predicate<V1JSONSchemaPropsBuilder> predicate);
  public A withAllOf(List<V1JSONSchemaProps> allOf);
  public A withAllOf(io.kubernetes.client.openapi.models.V1JSONSchemaProps... allOf);
  public Boolean hasAllOf();
  public V1JSONSchemaPropsFluent.AllOfNested<A> addNewAllOf();
  public V1JSONSchemaPropsFluent.AllOfNested<A> addNewAllOfLike(V1JSONSchemaProps item);
  public V1JSONSchemaPropsFluent.AllOfNested<A> setNewAllOfLike(Integer index,V1JSONSchemaProps item);
  public V1JSONSchemaPropsFluent.AllOfNested<A> editAllOf(Integer index);
  public V1JSONSchemaPropsFluent.AllOfNested<A> editFirstAllOf();
  public V1JSONSchemaPropsFluent.AllOfNested<A> editLastAllOf();
  public V1JSONSchemaPropsFluent.AllOfNested<A> editMatchingAllOf(Predicate<V1JSONSchemaPropsBuilder> predicate);
  public A addToAnyOf(Integer index,V1JSONSchemaProps item);
  public A setToAnyOf(Integer index,V1JSONSchemaProps item);
  public A addToAnyOf(io.kubernetes.client.openapi.models.V1JSONSchemaProps... items);
  public A addAllToAnyOf(Collection<V1JSONSchemaProps> items);
  public A removeFromAnyOf(io.kubernetes.client.openapi.models.V1JSONSchemaProps... items);
  public A removeAllFromAnyOf(Collection<V1JSONSchemaProps> items);
  public A removeMatchingFromAnyOf(Predicate<V1JSONSchemaPropsBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildAnyOf instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1JSONSchemaProps> getAnyOf();
  public List<V1JSONSchemaProps> buildAnyOf();
  public V1JSONSchemaProps buildAnyOf(Integer index);
  public V1JSONSchemaProps buildFirstAnyOf();
  public V1JSONSchemaProps buildLastAnyOf();
  public V1JSONSchemaProps buildMatchingAnyOf(Predicate<V1JSONSchemaPropsBuilder> predicate);
  public Boolean hasMatchingAnyOf(Predicate<V1JSONSchemaPropsBuilder> predicate);
  public A withAnyOf(List<V1JSONSchemaProps> anyOf);
  public A withAnyOf(io.kubernetes.client.openapi.models.V1JSONSchemaProps... anyOf);
  public Boolean hasAnyOf();
  public V1JSONSchemaPropsFluent.AnyOfNested<A> addNewAnyOf();
  public V1JSONSchemaPropsFluent.AnyOfNested<A> addNewAnyOfLike(V1JSONSchemaProps item);
  public V1JSONSchemaPropsFluent.AnyOfNested<A> setNewAnyOfLike(Integer index,V1JSONSchemaProps item);
  public V1JSONSchemaPropsFluent.AnyOfNested<A> editAnyOf(Integer index);
  public V1JSONSchemaPropsFluent.AnyOfNested<A> editFirstAnyOf();
  public V1JSONSchemaPropsFluent.AnyOfNested<A> editLastAnyOf();
  public V1JSONSchemaPropsFluent.AnyOfNested<A> editMatchingAnyOf(Predicate<V1JSONSchemaPropsBuilder> predicate);
  public Object getDefault();
  public A withDefault(Object _default);
  public Boolean hasDefault();
  public A addToDefinitions(String key,V1JSONSchemaProps value);
  public A addToDefinitions(Map<String,V1JSONSchemaProps> map);
  public A removeFromDefinitions(String key);
  public A removeFromDefinitions(Map<String,V1JSONSchemaProps> map);
  public Map<String,V1JSONSchemaProps> getDefinitions();
  public <K,V>A withDefinitions(Map<String,V1JSONSchemaProps> definitions);
  public Boolean hasDefinitions();
  public A addToDependencies(String key,Object value);
  public A addToDependencies(Map<String,Object> map);
  public A removeFromDependencies(String key);
  public A removeFromDependencies(Map<String,Object> map);
  public Map<String,Object> getDependencies();
  public <K,V>A withDependencies(Map<String,Object> dependencies);
  public Boolean hasDependencies();
  public String getDescription();
  public A withDescription(String description);
  public Boolean hasDescription();
  public A addToEnum(Integer index,Object item);
  public A setToEnum(Integer index,Object item);
  public A addToEnum(java.lang.Object... items);
  public A addAllToEnum(Collection<Object> items);
  public A removeFromEnum(java.lang.Object... items);
  public A removeAllFromEnum(Collection<Object> items);
  public List<Object> getEnum();
  public Object getEnum(Integer index);
  public Object getFirstEnum();
  public Object getLastEnum();
  public Object getMatchingEnum(Predicate<Object> predicate);
  public Boolean hasMatchingEnum(Predicate<Object> predicate);
  public A withEnum(List<Object> _enum);
  public A withEnum(java.lang.Object... _enum);
  public Boolean hasEnum();
  public Object getExample();
  public A withExample(Object example);
  public Boolean hasExample();
  public Boolean getExclusiveMaximum();
  public A withExclusiveMaximum(Boolean exclusiveMaximum);
  public Boolean hasExclusiveMaximum();
  public Boolean getExclusiveMinimum();
  public A withExclusiveMinimum(Boolean exclusiveMinimum);
  public Boolean hasExclusiveMinimum();
  
  /**
   * This method has been deprecated, please use method buildExternalDocs instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ExternalDocumentation getExternalDocs();
  public V1ExternalDocumentation buildExternalDocs();
  public A withExternalDocs(V1ExternalDocumentation externalDocs);
  public Boolean hasExternalDocs();
  public V1JSONSchemaPropsFluent.ExternalDocsNested<A> withNewExternalDocs();
  public V1JSONSchemaPropsFluent.ExternalDocsNested<A> withNewExternalDocsLike(V1ExternalDocumentation item);
  public V1JSONSchemaPropsFluent.ExternalDocsNested<A> editExternalDocs();
  public V1JSONSchemaPropsFluent.ExternalDocsNested<A> editOrNewExternalDocs();
  public V1JSONSchemaPropsFluent.ExternalDocsNested<A> editOrNewExternalDocsLike(V1ExternalDocumentation item);
  public String getFormat();
  public A withFormat(String format);
  public Boolean hasFormat();
  public String getId();
  public A withId(String id);
  public Boolean hasId();
  public Object getItems();
  public A withItems(Object items);
  public Boolean hasItems();
  public Long getMaxItems();
  public A withMaxItems(Long maxItems);
  public Boolean hasMaxItems();
  public Long getMaxLength();
  public A withMaxLength(Long maxLength);
  public Boolean hasMaxLength();
  public Long getMaxProperties();
  public A withMaxProperties(Long maxProperties);
  public Boolean hasMaxProperties();
  public Double getMaximum();
  public A withMaximum(Double maximum);
  public Boolean hasMaximum();
  public Long getMinItems();
  public A withMinItems(Long minItems);
  public Boolean hasMinItems();
  public Long getMinLength();
  public A withMinLength(Long minLength);
  public Boolean hasMinLength();
  public Long getMinProperties();
  public A withMinProperties(Long minProperties);
  public Boolean hasMinProperties();
  public Double getMinimum();
  public A withMinimum(Double minimum);
  public Boolean hasMinimum();
  public Double getMultipleOf();
  public A withMultipleOf(Double multipleOf);
  public Boolean hasMultipleOf();
  
  /**
   * This method has been deprecated, please use method buildNot instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1JSONSchemaProps getNot();
  public V1JSONSchemaProps buildNot();
  public A withNot(V1JSONSchemaProps not);
  public Boolean hasNot();
  public V1JSONSchemaPropsFluent.NotNested<A> withNewNot();
  public V1JSONSchemaPropsFluent.NotNested<A> withNewNotLike(V1JSONSchemaProps item);
  public V1JSONSchemaPropsFluent.NotNested<A> editNot();
  public V1JSONSchemaPropsFluent.NotNested<A> editOrNewNot();
  public V1JSONSchemaPropsFluent.NotNested<A> editOrNewNotLike(V1JSONSchemaProps item);
  public Boolean getNullable();
  public A withNullable(Boolean nullable);
  public Boolean hasNullable();
  public A addToOneOf(Integer index,V1JSONSchemaProps item);
  public A setToOneOf(Integer index,V1JSONSchemaProps item);
  public A addToOneOf(io.kubernetes.client.openapi.models.V1JSONSchemaProps... items);
  public A addAllToOneOf(Collection<V1JSONSchemaProps> items);
  public A removeFromOneOf(io.kubernetes.client.openapi.models.V1JSONSchemaProps... items);
  public A removeAllFromOneOf(Collection<V1JSONSchemaProps> items);
  public A removeMatchingFromOneOf(Predicate<V1JSONSchemaPropsBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildOneOf instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1JSONSchemaProps> getOneOf();
  public List<V1JSONSchemaProps> buildOneOf();
  public V1JSONSchemaProps buildOneOf(Integer index);
  public V1JSONSchemaProps buildFirstOneOf();
  public V1JSONSchemaProps buildLastOneOf();
  public V1JSONSchemaProps buildMatchingOneOf(Predicate<V1JSONSchemaPropsBuilder> predicate);
  public Boolean hasMatchingOneOf(Predicate<V1JSONSchemaPropsBuilder> predicate);
  public A withOneOf(List<V1JSONSchemaProps> oneOf);
  public A withOneOf(io.kubernetes.client.openapi.models.V1JSONSchemaProps... oneOf);
  public Boolean hasOneOf();
  public V1JSONSchemaPropsFluent.OneOfNested<A> addNewOneOf();
  public V1JSONSchemaPropsFluent.OneOfNested<A> addNewOneOfLike(V1JSONSchemaProps item);
  public V1JSONSchemaPropsFluent.OneOfNested<A> setNewOneOfLike(Integer index,V1JSONSchemaProps item);
  public V1JSONSchemaPropsFluent.OneOfNested<A> editOneOf(Integer index);
  public V1JSONSchemaPropsFluent.OneOfNested<A> editFirstOneOf();
  public V1JSONSchemaPropsFluent.OneOfNested<A> editLastOneOf();
  public V1JSONSchemaPropsFluent.OneOfNested<A> editMatchingOneOf(Predicate<V1JSONSchemaPropsBuilder> predicate);
  public String getPattern();
  public A withPattern(String pattern);
  public Boolean hasPattern();
  public A addToPatternProperties(String key,V1JSONSchemaProps value);
  public A addToPatternProperties(Map<String,V1JSONSchemaProps> map);
  public A removeFromPatternProperties(String key);
  public A removeFromPatternProperties(Map<String,V1JSONSchemaProps> map);
  public Map<String,V1JSONSchemaProps> getPatternProperties();
  public <K,V>A withPatternProperties(Map<String,V1JSONSchemaProps> patternProperties);
  public Boolean hasPatternProperties();
  public A addToProperties(String key,V1JSONSchemaProps value);
  public A addToProperties(Map<String,V1JSONSchemaProps> map);
  public A removeFromProperties(String key);
  public A removeFromProperties(Map<String,V1JSONSchemaProps> map);
  public Map<String,V1JSONSchemaProps> getProperties();
  public <K,V>A withProperties(Map<String,V1JSONSchemaProps> properties);
  public Boolean hasProperties();
  public A addToRequired(Integer index,String item);
  public A setToRequired(Integer index,String item);
  public A addToRequired(java.lang.String... items);
  public A addAllToRequired(Collection<String> items);
  public A removeFromRequired(java.lang.String... items);
  public A removeAllFromRequired(Collection<String> items);
  public List<String> getRequired();
  public String getRequired(Integer index);
  public String getFirstRequired();
  public String getLastRequired();
  public String getMatchingRequired(Predicate<String> predicate);
  public Boolean hasMatchingRequired(Predicate<String> predicate);
  public A withRequired(List<String> required);
  public A withRequired(java.lang.String... required);
  public Boolean hasRequired();
  public String getTitle();
  public A withTitle(String title);
  public Boolean hasTitle();
  public String getType();
  public A withType(String type);
  public Boolean hasType();
  public Boolean getUniqueItems();
  public A withUniqueItems(Boolean uniqueItems);
  public Boolean hasUniqueItems();
  public A withExclusiveMaximum();
  public A withExclusiveMinimum();
  public A withNullable();
  public A withUniqueItems();
  public interface AllOfNested<N> extends Nested<N>,V1JSONSchemaPropsFluent<V1JSONSchemaPropsFluent.AllOfNested<N>>{
    public N and();
    public N endAllOf();
    
  }
  public interface AnyOfNested<N> extends Nested<N>,V1JSONSchemaPropsFluent<V1JSONSchemaPropsFluent.AnyOfNested<N>>{
    public N and();
    public N endAnyOf();
    
  }
  public interface ExternalDocsNested<N> extends Nested<N>,V1ExternalDocumentationFluent<V1JSONSchemaPropsFluent.ExternalDocsNested<N>>{
    public N and();
    public N endExternalDocs();
    
  }
  public interface NotNested<N> extends Nested<N>,V1JSONSchemaPropsFluent<V1JSONSchemaPropsFluent.NotNested<N>>{
    public N and();
    public N endNot();
    
  }
  public interface OneOfNested<N> extends Nested<N>,V1JSONSchemaPropsFluent<V1JSONSchemaPropsFluent.OneOfNested<N>>{
    public N and();
    public N endOneOf();
    
  }
  
}