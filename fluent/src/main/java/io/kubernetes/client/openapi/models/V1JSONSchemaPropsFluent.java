package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
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
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public interface V1JSONSchemaPropsFluent<A extends io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getRef();
    public A withRef(java.lang.String $ref);
    public java.lang.Boolean hasRef();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withRef instead.
     */
        public A withNewRef(java.lang.String original);
    public java.lang.String getSchema();
    public A withSchema(java.lang.String $schema);
    public java.lang.Boolean hasSchema();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withSchema instead.
     */
        public A withNewSchema(java.lang.String original);
    public java.lang.Object getAdditionalItems();
    public A withAdditionalItems(java.lang.Object additionalItems);
    public java.lang.Boolean hasAdditionalItems();
    public java.lang.Object getAdditionalProperties();
    public A withAdditionalProperties(java.lang.Object additionalProperties);
    public java.lang.Boolean hasAdditionalProperties();
    public A addToAllOf(int index,io.kubernetes.client.openapi.models.V1JSONSchemaProps item);
    public A setToAllOf(int index,io.kubernetes.client.openapi.models.V1JSONSchemaProps item);
    public A addToAllOf(io.kubernetes.client.openapi.models.V1JSONSchemaProps... items);
    public A addAllToAllOf(java.util.Collection<io.kubernetes.client.openapi.models.V1JSONSchemaProps> items);
    public A removeFromAllOf(io.kubernetes.client.openapi.models.V1JSONSchemaProps... items);
    public A removeAllFromAllOf(java.util.Collection<io.kubernetes.client.openapi.models.V1JSONSchemaProps> items);
    public A removeMatchingFromAllOf(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildAllOf instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1JSONSchemaProps> getAllOf();
    public java.util.List<io.kubernetes.client.openapi.models.V1JSONSchemaProps> buildAllOf();
    public io.kubernetes.client.openapi.models.V1JSONSchemaProps buildAllOf(int index);
    public io.kubernetes.client.openapi.models.V1JSONSchemaProps buildFirstAllOf();
    public io.kubernetes.client.openapi.models.V1JSONSchemaProps buildLastAllOf();
    public io.kubernetes.client.openapi.models.V1JSONSchemaProps buildMatchingAllOf(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder> predicate);
    public java.lang.Boolean hasMatchingAllOf(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder> predicate);
    public A withAllOf(java.util.List<io.kubernetes.client.openapi.models.V1JSONSchemaProps> allOf);
    public A withAllOf(io.kubernetes.client.openapi.models.V1JSONSchemaProps... allOf);
    public java.lang.Boolean hasAllOf();
    public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.AllOfNested<A> addNewAllOf();
    public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.AllOfNested<A> addNewAllOfLike(io.kubernetes.client.openapi.models.V1JSONSchemaProps item);
    public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.AllOfNested<A> setNewAllOfLike(int index,io.kubernetes.client.openapi.models.V1JSONSchemaProps item);
    public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.AllOfNested<A> editAllOf(int index);
    public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.AllOfNested<A> editFirstAllOf();
    public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.AllOfNested<A> editLastAllOf();
    public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.AllOfNested<A> editMatchingAllOf(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder> predicate);
    public A addToAnyOf(int index,io.kubernetes.client.openapi.models.V1JSONSchemaProps item);
    public A setToAnyOf(int index,io.kubernetes.client.openapi.models.V1JSONSchemaProps item);
    public A addToAnyOf(io.kubernetes.client.openapi.models.V1JSONSchemaProps... items);
    public A addAllToAnyOf(java.util.Collection<io.kubernetes.client.openapi.models.V1JSONSchemaProps> items);
    public A removeFromAnyOf(io.kubernetes.client.openapi.models.V1JSONSchemaProps... items);
    public A removeAllFromAnyOf(java.util.Collection<io.kubernetes.client.openapi.models.V1JSONSchemaProps> items);
    public A removeMatchingFromAnyOf(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildAnyOf instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1JSONSchemaProps> getAnyOf();
    public java.util.List<io.kubernetes.client.openapi.models.V1JSONSchemaProps> buildAnyOf();
    public io.kubernetes.client.openapi.models.V1JSONSchemaProps buildAnyOf(int index);
    public io.kubernetes.client.openapi.models.V1JSONSchemaProps buildFirstAnyOf();
    public io.kubernetes.client.openapi.models.V1JSONSchemaProps buildLastAnyOf();
    public io.kubernetes.client.openapi.models.V1JSONSchemaProps buildMatchingAnyOf(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder> predicate);
    public java.lang.Boolean hasMatchingAnyOf(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder> predicate);
    public A withAnyOf(java.util.List<io.kubernetes.client.openapi.models.V1JSONSchemaProps> anyOf);
    public A withAnyOf(io.kubernetes.client.openapi.models.V1JSONSchemaProps... anyOf);
    public java.lang.Boolean hasAnyOf();
    public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.AnyOfNested<A> addNewAnyOf();
    public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.AnyOfNested<A> addNewAnyOfLike(io.kubernetes.client.openapi.models.V1JSONSchemaProps item);
    public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.AnyOfNested<A> setNewAnyOfLike(int index,io.kubernetes.client.openapi.models.V1JSONSchemaProps item);
    public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.AnyOfNested<A> editAnyOf(int index);
    public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.AnyOfNested<A> editFirstAnyOf();
    public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.AnyOfNested<A> editLastAnyOf();
    public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.AnyOfNested<A> editMatchingAnyOf(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder> predicate);
    public java.lang.Object getDefault();
    public A withDefault(java.lang.Object _default);
    public java.lang.Boolean hasDefault();
    public A addToDefinitions(java.lang.String key,io.kubernetes.client.openapi.models.V1JSONSchemaProps value);
    public A addToDefinitions(java.util.Map<java.lang.String,io.kubernetes.client.openapi.models.V1JSONSchemaProps> map);
    public A removeFromDefinitions(java.lang.String key);
    public A removeFromDefinitions(java.util.Map<java.lang.String,io.kubernetes.client.openapi.models.V1JSONSchemaProps> map);
    public java.util.Map<java.lang.String,io.kubernetes.client.openapi.models.V1JSONSchemaProps> getDefinitions();
    public <K,V>A withDefinitions(java.util.Map<java.lang.String,io.kubernetes.client.openapi.models.V1JSONSchemaProps> definitions);
    public java.lang.Boolean hasDefinitions();
    public A addToDependencies(java.lang.String key,java.lang.Object value);
    public A addToDependencies(java.util.Map<java.lang.String,java.lang.Object> map);
    public A removeFromDependencies(java.lang.String key);
    public A removeFromDependencies(java.util.Map<java.lang.String,java.lang.Object> map);
    public java.util.Map<java.lang.String,java.lang.Object> getDependencies();
    public <K,V>A withDependencies(java.util.Map<java.lang.String,java.lang.Object> dependencies);
    public java.lang.Boolean hasDependencies();
    public java.lang.String getDescription();
    public A withDescription(java.lang.String description);
    public java.lang.Boolean hasDescription();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withDescription instead.
     */
        public A withNewDescription(java.lang.String original);
    public A addToEnum(int index,java.lang.Object item);
    public A setToEnum(int index,java.lang.Object item);
    public A addToEnum(java.lang.Object... items);
    public A addAllToEnum(java.util.Collection<java.lang.Object> items);
    public A removeFromEnum(java.lang.Object... items);
    public A removeAllFromEnum(java.util.Collection<java.lang.Object> items);
    public java.util.List<java.lang.Object> getEnum();
    public java.lang.Object getEnum(int index);
    public java.lang.Object getFirstEnum();
    public java.lang.Object getLastEnum();
    public java.lang.Object getMatchingEnum(java.util.function.Predicate<java.lang.Object> predicate);
    public java.lang.Boolean hasMatchingEnum(java.util.function.Predicate<java.lang.Object> predicate);
    public A withEnum(java.util.List<java.lang.Object> _enum);
    public A withEnum(java.lang.Object... _enum);
    public java.lang.Boolean hasEnum();
    public java.lang.Object getExample();
    public A withExample(java.lang.Object example);
    public java.lang.Boolean hasExample();
    public java.lang.Boolean getExclusiveMaximum();
    public A withExclusiveMaximum(java.lang.Boolean exclusiveMaximum);
    public java.lang.Boolean hasExclusiveMaximum();
    public java.lang.Boolean getExclusiveMinimum();
    public A withExclusiveMinimum(java.lang.Boolean exclusiveMinimum);
    public java.lang.Boolean hasExclusiveMinimum();
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildExternalDocs instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1ExternalDocumentation getExternalDocs();
    public io.kubernetes.client.openapi.models.V1ExternalDocumentation buildExternalDocs();
    public A withExternalDocs(io.kubernetes.client.openapi.models.V1ExternalDocumentation externalDocs);
    public java.lang.Boolean hasExternalDocs();
    public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.ExternalDocsNested<A> withNewExternalDocs();
    public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.ExternalDocsNested<A> withNewExternalDocsLike(io.kubernetes.client.openapi.models.V1ExternalDocumentation item);
    public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.ExternalDocsNested<A> editExternalDocs();
    public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.ExternalDocsNested<A> editOrNewExternalDocs();
    public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.ExternalDocsNested<A> editOrNewExternalDocsLike(io.kubernetes.client.openapi.models.V1ExternalDocumentation item);
    public java.lang.String getFormat();
    public A withFormat(java.lang.String format);
    public java.lang.Boolean hasFormat();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withFormat instead.
     */
        public A withNewFormat(java.lang.String original);
    public java.lang.String getId();
    public A withId(java.lang.String id);
    public java.lang.Boolean hasId();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withId instead.
     */
        public A withNewId(java.lang.String original);
    public java.lang.Object getItems();
    public A withItems(java.lang.Object items);
    public java.lang.Boolean hasItems();
    public java.lang.Long getMaxItems();
    public A withMaxItems(java.lang.Long maxItems);
    public java.lang.Boolean hasMaxItems();
    public java.lang.Long getMaxLength();
    public A withMaxLength(java.lang.Long maxLength);
    public java.lang.Boolean hasMaxLength();
    public java.lang.Long getMaxProperties();
    public A withMaxProperties(java.lang.Long maxProperties);
    public java.lang.Boolean hasMaxProperties();
    public java.lang.Double getMaximum();
    public A withMaximum(java.lang.Double maximum);
    public java.lang.Boolean hasMaximum();
    public java.lang.Long getMinItems();
    public A withMinItems(java.lang.Long minItems);
    public java.lang.Boolean hasMinItems();
    public java.lang.Long getMinLength();
    public A withMinLength(java.lang.Long minLength);
    public java.lang.Boolean hasMinLength();
    public java.lang.Long getMinProperties();
    public A withMinProperties(java.lang.Long minProperties);
    public java.lang.Boolean hasMinProperties();
    public java.lang.Double getMinimum();
    public A withMinimum(java.lang.Double minimum);
    public java.lang.Boolean hasMinimum();
    public java.lang.Double getMultipleOf();
    public A withMultipleOf(java.lang.Double multipleOf);
    public java.lang.Boolean hasMultipleOf();
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildNot instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1JSONSchemaProps getNot();
    public io.kubernetes.client.openapi.models.V1JSONSchemaProps buildNot();
    public A withNot(io.kubernetes.client.openapi.models.V1JSONSchemaProps not);
    public java.lang.Boolean hasNot();
    public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.NotNested<A> withNewNot();
    public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.NotNested<A> withNewNotLike(io.kubernetes.client.openapi.models.V1JSONSchemaProps item);
    public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.NotNested<A> editNot();
    public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.NotNested<A> editOrNewNot();
    public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.NotNested<A> editOrNewNotLike(io.kubernetes.client.openapi.models.V1JSONSchemaProps item);
    public java.lang.Boolean getNullable();
    public A withNullable(java.lang.Boolean nullable);
    public java.lang.Boolean hasNullable();
    public A addToOneOf(int index,io.kubernetes.client.openapi.models.V1JSONSchemaProps item);
    public A setToOneOf(int index,io.kubernetes.client.openapi.models.V1JSONSchemaProps item);
    public A addToOneOf(io.kubernetes.client.openapi.models.V1JSONSchemaProps... items);
    public A addAllToOneOf(java.util.Collection<io.kubernetes.client.openapi.models.V1JSONSchemaProps> items);
    public A removeFromOneOf(io.kubernetes.client.openapi.models.V1JSONSchemaProps... items);
    public A removeAllFromOneOf(java.util.Collection<io.kubernetes.client.openapi.models.V1JSONSchemaProps> items);
    public A removeMatchingFromOneOf(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildOneOf instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1JSONSchemaProps> getOneOf();
    public java.util.List<io.kubernetes.client.openapi.models.V1JSONSchemaProps> buildOneOf();
    public io.kubernetes.client.openapi.models.V1JSONSchemaProps buildOneOf(int index);
    public io.kubernetes.client.openapi.models.V1JSONSchemaProps buildFirstOneOf();
    public io.kubernetes.client.openapi.models.V1JSONSchemaProps buildLastOneOf();
    public io.kubernetes.client.openapi.models.V1JSONSchemaProps buildMatchingOneOf(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder> predicate);
    public java.lang.Boolean hasMatchingOneOf(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder> predicate);
    public A withOneOf(java.util.List<io.kubernetes.client.openapi.models.V1JSONSchemaProps> oneOf);
    public A withOneOf(io.kubernetes.client.openapi.models.V1JSONSchemaProps... oneOf);
    public java.lang.Boolean hasOneOf();
    public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.OneOfNested<A> addNewOneOf();
    public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.OneOfNested<A> addNewOneOfLike(io.kubernetes.client.openapi.models.V1JSONSchemaProps item);
    public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.OneOfNested<A> setNewOneOfLike(int index,io.kubernetes.client.openapi.models.V1JSONSchemaProps item);
    public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.OneOfNested<A> editOneOf(int index);
    public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.OneOfNested<A> editFirstOneOf();
    public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.OneOfNested<A> editLastOneOf();
    public io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.OneOfNested<A> editMatchingOneOf(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder> predicate);
    public java.lang.String getPattern();
    public A withPattern(java.lang.String pattern);
    public java.lang.Boolean hasPattern();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withPattern instead.
     */
        public A withNewPattern(java.lang.String original);
    public A addToPatternProperties(java.lang.String key,io.kubernetes.client.openapi.models.V1JSONSchemaProps value);
    public A addToPatternProperties(java.util.Map<java.lang.String,io.kubernetes.client.openapi.models.V1JSONSchemaProps> map);
    public A removeFromPatternProperties(java.lang.String key);
    public A removeFromPatternProperties(java.util.Map<java.lang.String,io.kubernetes.client.openapi.models.V1JSONSchemaProps> map);
    public java.util.Map<java.lang.String,io.kubernetes.client.openapi.models.V1JSONSchemaProps> getPatternProperties();
    public <K,V>A withPatternProperties(java.util.Map<java.lang.String,io.kubernetes.client.openapi.models.V1JSONSchemaProps> patternProperties);
    public java.lang.Boolean hasPatternProperties();
    public A addToProperties(java.lang.String key,io.kubernetes.client.openapi.models.V1JSONSchemaProps value);
    public A addToProperties(java.util.Map<java.lang.String,io.kubernetes.client.openapi.models.V1JSONSchemaProps> map);
    public A removeFromProperties(java.lang.String key);
    public A removeFromProperties(java.util.Map<java.lang.String,io.kubernetes.client.openapi.models.V1JSONSchemaProps> map);
    public java.util.Map<java.lang.String,io.kubernetes.client.openapi.models.V1JSONSchemaProps> getProperties();
    public <K,V>A withProperties(java.util.Map<java.lang.String,io.kubernetes.client.openapi.models.V1JSONSchemaProps> properties);
    public java.lang.Boolean hasProperties();
    public A addToRequired(int index,java.lang.String item);
    public A setToRequired(int index,java.lang.String item);
    public A addToRequired(java.lang.String... items);
    public A addAllToRequired(java.util.Collection<java.lang.String> items);
    public A removeFromRequired(java.lang.String... items);
    public A removeAllFromRequired(java.util.Collection<java.lang.String> items);
    public java.util.List<java.lang.String> getRequired();
    public java.lang.String getRequired(int index);
    public java.lang.String getFirstRequired();
    public java.lang.String getLastRequired();
    public java.lang.String getMatchingRequired(java.util.function.Predicate<java.lang.String> predicate);
    public java.lang.Boolean hasMatchingRequired(java.util.function.Predicate<java.lang.String> predicate);
    public A withRequired(java.util.List<java.lang.String> required);
    public A withRequired(java.lang.String... required);
    public java.lang.Boolean hasRequired();
    public A addNewRequired(java.lang.String original);
    public java.lang.String getTitle();
    public A withTitle(java.lang.String title);
    public java.lang.Boolean hasTitle();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withTitle instead.
     */
        public A withNewTitle(java.lang.String original);
    public java.lang.String getType();
    public A withType(java.lang.String type);
    public java.lang.Boolean hasType();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withType instead.
     */
        public A withNewType(java.lang.String original);
    public java.lang.Boolean getUniqueItems();
    public A withUniqueItems(java.lang.Boolean uniqueItems);
    public java.lang.Boolean hasUniqueItems();
    public interface AllOfNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent<io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.AllOfNested<N>> {

            public N and();
            public N endAllOf();    }


    public interface AnyOfNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent<io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.AnyOfNested<N>> {

            public N and();
            public N endAnyOf();    }


    public interface ExternalDocsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ExternalDocumentationFluent<io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.ExternalDocsNested<N>> {

            public N and();
            public N endExternalDocs();    }


    public interface NotNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent<io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.NotNested<N>> {

            public N and();
            public N endNot();    }


    public interface OneOfNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent<io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent.OneOfNested<N>> {

            public N and();
            public N endOneOf();    }


}
