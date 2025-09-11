/*
Copyright 2025 The Kubernetes Authors.
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

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1ExternalDocumentation;
import io.kubernetes.client.openapi.models.V1ValidationRule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * JSONSchemaProps is a JSON-Schema following Specification Draft 4 (http://json-schema.org/).
 */
@ApiModel(description = "JSONSchemaProps is a JSON-Schema following Specification Draft 4 (http://json-schema.org/).")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1JSONSchemaProps {
  public static final String SERIALIZED_NAME_$_REF = "$ref";
  @SerializedName(SERIALIZED_NAME_$_REF)
  @jakarta.annotation.Nullable
  private String $ref;

  public static final String SERIALIZED_NAME_$_SCHEMA = "$schema";
  @SerializedName(SERIALIZED_NAME_$_SCHEMA)
  @jakarta.annotation.Nullable
  private String $schema;

  public static final String SERIALIZED_NAME_ADDITIONAL_ITEMS = "additionalItems";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_ITEMS)
  @jakarta.annotation.Nullable
  private Object additionalItems;

  public static final String SERIALIZED_NAME_ADDITIONAL_PROPERTIES = "additionalProperties";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_PROPERTIES)
  @jakarta.annotation.Nullable
  private Object additionalProperties;

  public static final String SERIALIZED_NAME_ALL_OF = "allOf";
  @SerializedName(SERIALIZED_NAME_ALL_OF)
  @jakarta.annotation.Nullable
  private List<V1JSONSchemaProps> allOf = new ArrayList<>();

  public static final String SERIALIZED_NAME_ANY_OF = "anyOf";
  @SerializedName(SERIALIZED_NAME_ANY_OF)
  @jakarta.annotation.Nullable
  private List<V1JSONSchemaProps> anyOf = new ArrayList<>();

  public static final String SERIALIZED_NAME_DEFAULT = "default";
  @SerializedName(SERIALIZED_NAME_DEFAULT)
  @jakarta.annotation.Nullable
  private Object _default;

  public static final String SERIALIZED_NAME_DEFINITIONS = "definitions";
  @SerializedName(SERIALIZED_NAME_DEFINITIONS)
  @jakarta.annotation.Nullable
  private Map<String, V1JSONSchemaProps> definitions = new HashMap<>();

  public static final String SERIALIZED_NAME_DEPENDENCIES = "dependencies";
  @SerializedName(SERIALIZED_NAME_DEPENDENCIES)
  @jakarta.annotation.Nullable
  private Map<String, Object> dependencies = new HashMap<>();

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @jakarta.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_ENUM = "enum";
  @SerializedName(SERIALIZED_NAME_ENUM)
  @jakarta.annotation.Nullable
  private List<Object> _enum = new ArrayList<>();

  public static final String SERIALIZED_NAME_EXAMPLE = "example";
  @SerializedName(SERIALIZED_NAME_EXAMPLE)
  @jakarta.annotation.Nullable
  private Object example;

  public static final String SERIALIZED_NAME_EXCLUSIVE_MAXIMUM = "exclusiveMaximum";
  @SerializedName(SERIALIZED_NAME_EXCLUSIVE_MAXIMUM)
  @jakarta.annotation.Nullable
  private Boolean exclusiveMaximum;

  public static final String SERIALIZED_NAME_EXCLUSIVE_MINIMUM = "exclusiveMinimum";
  @SerializedName(SERIALIZED_NAME_EXCLUSIVE_MINIMUM)
  @jakarta.annotation.Nullable
  private Boolean exclusiveMinimum;

  public static final String SERIALIZED_NAME_EXTERNAL_DOCS = "externalDocs";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_DOCS)
  @jakarta.annotation.Nullable
  private V1ExternalDocumentation externalDocs;

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  @jakarta.annotation.Nullable
  private String format;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @jakarta.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  @jakarta.annotation.Nullable
  private Object items;

  public static final String SERIALIZED_NAME_MAX_ITEMS = "maxItems";
  @SerializedName(SERIALIZED_NAME_MAX_ITEMS)
  @jakarta.annotation.Nullable
  private Long maxItems;

  public static final String SERIALIZED_NAME_MAX_LENGTH = "maxLength";
  @SerializedName(SERIALIZED_NAME_MAX_LENGTH)
  @jakarta.annotation.Nullable
  private Long maxLength;

  public static final String SERIALIZED_NAME_MAX_PROPERTIES = "maxProperties";
  @SerializedName(SERIALIZED_NAME_MAX_PROPERTIES)
  @jakarta.annotation.Nullable
  private Long maxProperties;

  public static final String SERIALIZED_NAME_MAXIMUM = "maximum";
  @SerializedName(SERIALIZED_NAME_MAXIMUM)
  @jakarta.annotation.Nullable
  private Double maximum;

  public static final String SERIALIZED_NAME_MIN_ITEMS = "minItems";
  @SerializedName(SERIALIZED_NAME_MIN_ITEMS)
  @jakarta.annotation.Nullable
  private Long minItems;

  public static final String SERIALIZED_NAME_MIN_LENGTH = "minLength";
  @SerializedName(SERIALIZED_NAME_MIN_LENGTH)
  @jakarta.annotation.Nullable
  private Long minLength;

  public static final String SERIALIZED_NAME_MIN_PROPERTIES = "minProperties";
  @SerializedName(SERIALIZED_NAME_MIN_PROPERTIES)
  @jakarta.annotation.Nullable
  private Long minProperties;

  public static final String SERIALIZED_NAME_MINIMUM = "minimum";
  @SerializedName(SERIALIZED_NAME_MINIMUM)
  @jakarta.annotation.Nullable
  private Double minimum;

  public static final String SERIALIZED_NAME_MULTIPLE_OF = "multipleOf";
  @SerializedName(SERIALIZED_NAME_MULTIPLE_OF)
  @jakarta.annotation.Nullable
  private Double multipleOf;

  public static final String SERIALIZED_NAME_NOT = "not";
  @SerializedName(SERIALIZED_NAME_NOT)
  @jakarta.annotation.Nullable
  private V1JSONSchemaProps not;

  public static final String SERIALIZED_NAME_NULLABLE = "nullable";
  @SerializedName(SERIALIZED_NAME_NULLABLE)
  @jakarta.annotation.Nullable
  private Boolean nullable;

  public static final String SERIALIZED_NAME_ONE_OF = "oneOf";
  @SerializedName(SERIALIZED_NAME_ONE_OF)
  @jakarta.annotation.Nullable
  private List<V1JSONSchemaProps> oneOf = new ArrayList<>();

  public static final String SERIALIZED_NAME_PATTERN = "pattern";
  @SerializedName(SERIALIZED_NAME_PATTERN)
  @jakarta.annotation.Nullable
  private String pattern;

  public static final String SERIALIZED_NAME_PATTERN_PROPERTIES = "patternProperties";
  @SerializedName(SERIALIZED_NAME_PATTERN_PROPERTIES)
  @jakarta.annotation.Nullable
  private Map<String, V1JSONSchemaProps> patternProperties = new HashMap<>();

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  @jakarta.annotation.Nullable
  private Map<String, V1JSONSchemaProps> properties = new HashMap<>();

  public static final String SERIALIZED_NAME_REQUIRED = "required";
  @SerializedName(SERIALIZED_NAME_REQUIRED)
  @jakarta.annotation.Nullable
  private List<String> required = new ArrayList<>();

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  @jakarta.annotation.Nullable
  private String title;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @jakarta.annotation.Nullable
  private String type;

  public static final String SERIALIZED_NAME_UNIQUE_ITEMS = "uniqueItems";
  @SerializedName(SERIALIZED_NAME_UNIQUE_ITEMS)
  @jakarta.annotation.Nullable
  private Boolean uniqueItems;

  public static final String SERIALIZED_NAME_X_KUBERNETES_EMBEDDED_RESOURCE = "x-kubernetes-embedded-resource";
  @SerializedName(SERIALIZED_NAME_X_KUBERNETES_EMBEDDED_RESOURCE)
  @jakarta.annotation.Nullable
  private Boolean xKubernetesEmbeddedResource;

  public static final String SERIALIZED_NAME_X_KUBERNETES_INT_OR_STRING = "x-kubernetes-int-or-string";
  @SerializedName(SERIALIZED_NAME_X_KUBERNETES_INT_OR_STRING)
  @jakarta.annotation.Nullable
  private Boolean xKubernetesIntOrString;

  public static final String SERIALIZED_NAME_X_KUBERNETES_LIST_MAP_KEYS = "x-kubernetes-list-map-keys";
  @SerializedName(SERIALIZED_NAME_X_KUBERNETES_LIST_MAP_KEYS)
  @jakarta.annotation.Nullable
  private List<String> xKubernetesListMapKeys = new ArrayList<>();

  public static final String SERIALIZED_NAME_X_KUBERNETES_LIST_TYPE = "x-kubernetes-list-type";
  @SerializedName(SERIALIZED_NAME_X_KUBERNETES_LIST_TYPE)
  @jakarta.annotation.Nullable
  private String xKubernetesListType;

  public static final String SERIALIZED_NAME_X_KUBERNETES_MAP_TYPE = "x-kubernetes-map-type";
  @SerializedName(SERIALIZED_NAME_X_KUBERNETES_MAP_TYPE)
  @jakarta.annotation.Nullable
  private String xKubernetesMapType;

  public static final String SERIALIZED_NAME_X_KUBERNETES_PRESERVE_UNKNOWN_FIELDS = "x-kubernetes-preserve-unknown-fields";
  @SerializedName(SERIALIZED_NAME_X_KUBERNETES_PRESERVE_UNKNOWN_FIELDS)
  @jakarta.annotation.Nullable
  private Boolean xKubernetesPreserveUnknownFields;

  public static final String SERIALIZED_NAME_X_KUBERNETES_VALIDATIONS = "x-kubernetes-validations";
  @SerializedName(SERIALIZED_NAME_X_KUBERNETES_VALIDATIONS)
  @jakarta.annotation.Nullable
  private List<V1ValidationRule> xKubernetesValidations = new ArrayList<>();

  public V1JSONSchemaProps() {
  }

  public V1JSONSchemaProps $ref(@jakarta.annotation.Nullable String $ref) {
    this.$ref = $ref;
    return this;
  }

  /**
   * Get $ref
   * @return $ref
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public String get$Ref() {
    return $ref;
  }

  public void set$Ref(@jakarta.annotation.Nullable String $ref) {
    this.$ref = $ref;
  }


  public V1JSONSchemaProps $schema(@jakarta.annotation.Nullable String $schema) {
    this.$schema = $schema;
    return this;
  }

  /**
   * Get $schema
   * @return $schema
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public String get$Schema() {
    return $schema;
  }

  public void set$Schema(@jakarta.annotation.Nullable String $schema) {
    this.$schema = $schema;
  }


  public V1JSONSchemaProps additionalItems(@jakarta.annotation.Nullable Object additionalItems) {
    this.additionalItems = additionalItems;
    return this;
  }

  /**
   * JSONSchemaPropsOrBool represents JSONSchemaProps or a boolean value. Defaults to true for the boolean property.
   * @return additionalItems
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "JSONSchemaPropsOrBool represents JSONSchemaProps or a boolean value. Defaults to true for the boolean property.")
  public Object getAdditionalItems() {
    return additionalItems;
  }

  public void setAdditionalItems(@jakarta.annotation.Nullable Object additionalItems) {
    this.additionalItems = additionalItems;
  }


  public V1JSONSchemaProps additionalProperties(@jakarta.annotation.Nullable Object additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  /**
   * JSONSchemaPropsOrBool represents JSONSchemaProps or a boolean value. Defaults to true for the boolean property.
   * @return additionalProperties
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "JSONSchemaPropsOrBool represents JSONSchemaProps or a boolean value. Defaults to true for the boolean property.")
  public Object getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(@jakarta.annotation.Nullable Object additionalProperties) {
    this.additionalProperties = additionalProperties;
  }


  public V1JSONSchemaProps allOf(@jakarta.annotation.Nullable List<V1JSONSchemaProps> allOf) {
    this.allOf = allOf;
    return this;
  }

  public V1JSONSchemaProps addAllOfItem(V1JSONSchemaProps allOfItem) {
    if (this.allOf == null) {
      this.allOf = new ArrayList<>();
    }
    this.allOf.add(allOfItem);
    return this;
  }

  /**
   * Get allOf
   * @return allOf
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public List<V1JSONSchemaProps> getAllOf() {
    return allOf;
  }

  public void setAllOf(@jakarta.annotation.Nullable List<V1JSONSchemaProps> allOf) {
    this.allOf = allOf;
  }


  public V1JSONSchemaProps anyOf(@jakarta.annotation.Nullable List<V1JSONSchemaProps> anyOf) {
    this.anyOf = anyOf;
    return this;
  }

  public V1JSONSchemaProps addAnyOfItem(V1JSONSchemaProps anyOfItem) {
    if (this.anyOf == null) {
      this.anyOf = new ArrayList<>();
    }
    this.anyOf.add(anyOfItem);
    return this;
  }

  /**
   * Get anyOf
   * @return anyOf
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public List<V1JSONSchemaProps> getAnyOf() {
    return anyOf;
  }

  public void setAnyOf(@jakarta.annotation.Nullable List<V1JSONSchemaProps> anyOf) {
    this.anyOf = anyOf;
  }


  public V1JSONSchemaProps _default(@jakarta.annotation.Nullable Object _default) {
    this._default = _default;
    return this;
  }

  /**
   * default is a default value for undefined object fields. Defaulting is a beta feature under the CustomResourceDefaulting feature gate. Defaulting requires spec.preserveUnknownFields to be false.
   * @return _default
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "default is a default value for undefined object fields. Defaulting is a beta feature under the CustomResourceDefaulting feature gate. Defaulting requires spec.preserveUnknownFields to be false.")
  public Object getDefault() {
    return _default;
  }

  public void setDefault(@jakarta.annotation.Nullable Object _default) {
    this._default = _default;
  }


  public V1JSONSchemaProps definitions(@jakarta.annotation.Nullable Map<String, V1JSONSchemaProps> definitions) {
    this.definitions = definitions;
    return this;
  }

  public V1JSONSchemaProps putDefinitionsItem(String key, V1JSONSchemaProps definitionsItem) {
    if (this.definitions == null) {
      this.definitions = new HashMap<>();
    }
    this.definitions.put(key, definitionsItem);
    return this;
  }

  /**
   * Get definitions
   * @return definitions
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public Map<String, V1JSONSchemaProps> getDefinitions() {
    return definitions;
  }

  public void setDefinitions(@jakarta.annotation.Nullable Map<String, V1JSONSchemaProps> definitions) {
    this.definitions = definitions;
  }


  public V1JSONSchemaProps dependencies(@jakarta.annotation.Nullable Map<String, Object> dependencies) {
    this.dependencies = dependencies;
    return this;
  }

  public V1JSONSchemaProps putDependenciesItem(String key, Object dependenciesItem) {
    if (this.dependencies == null) {
      this.dependencies = new HashMap<>();
    }
    this.dependencies.put(key, dependenciesItem);
    return this;
  }

  /**
   * Get dependencies
   * @return dependencies
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public Map<String, Object> getDependencies() {
    return dependencies;
  }

  public void setDependencies(@jakarta.annotation.Nullable Map<String, Object> dependencies) {
    this.dependencies = dependencies;
  }


  public V1JSONSchemaProps description(@jakarta.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(@jakarta.annotation.Nullable String description) {
    this.description = description;
  }


  public V1JSONSchemaProps _enum(@jakarta.annotation.Nullable List<Object> _enum) {
    this._enum = _enum;
    return this;
  }

  public V1JSONSchemaProps addEnumItem(Object _enumItem) {
    if (this._enum == null) {
      this._enum = new ArrayList<>();
    }
    this._enum.add(_enumItem);
    return this;
  }

  /**
   * Get _enum
   * @return _enum
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public List<Object> getEnum() {
    return _enum;
  }

  public void setEnum(@jakarta.annotation.Nullable List<Object> _enum) {
    this._enum = _enum;
  }


  public V1JSONSchemaProps example(@jakarta.annotation.Nullable Object example) {
    this.example = example;
    return this;
  }

  /**
   * JSON represents any valid JSON value. These types are supported: bool, int64, float64, string, []interface{}, map[string]interface{} and nil.
   * @return example
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "JSON represents any valid JSON value. These types are supported: bool, int64, float64, string, []interface{}, map[string]interface{} and nil.")
  public Object getExample() {
    return example;
  }

  public void setExample(@jakarta.annotation.Nullable Object example) {
    this.example = example;
  }


  public V1JSONSchemaProps exclusiveMaximum(@jakarta.annotation.Nullable Boolean exclusiveMaximum) {
    this.exclusiveMaximum = exclusiveMaximum;
    return this;
  }

  /**
   * Get exclusiveMaximum
   * @return exclusiveMaximum
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getExclusiveMaximum() {
    return exclusiveMaximum;
  }

  public void setExclusiveMaximum(@jakarta.annotation.Nullable Boolean exclusiveMaximum) {
    this.exclusiveMaximum = exclusiveMaximum;
  }


  public V1JSONSchemaProps exclusiveMinimum(@jakarta.annotation.Nullable Boolean exclusiveMinimum) {
    this.exclusiveMinimum = exclusiveMinimum;
    return this;
  }

  /**
   * Get exclusiveMinimum
   * @return exclusiveMinimum
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getExclusiveMinimum() {
    return exclusiveMinimum;
  }

  public void setExclusiveMinimum(@jakarta.annotation.Nullable Boolean exclusiveMinimum) {
    this.exclusiveMinimum = exclusiveMinimum;
  }


  public V1JSONSchemaProps externalDocs(@jakarta.annotation.Nullable V1ExternalDocumentation externalDocs) {
    this.externalDocs = externalDocs;
    return this;
  }

  /**
   * Get externalDocs
   * @return externalDocs
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ExternalDocumentation getExternalDocs() {
    return externalDocs;
  }

  public void setExternalDocs(@jakarta.annotation.Nullable V1ExternalDocumentation externalDocs) {
    this.externalDocs = externalDocs;
  }


  public V1JSONSchemaProps format(@jakarta.annotation.Nullable String format) {
    this.format = format;
    return this;
  }

  /**
   * format is an OpenAPI v3 format string. Unknown formats are ignored. The following formats are validated:  - bsonobjectid: a bson object ID, i.e. a 24 characters hex string - uri: an URI as parsed by Golang net/url.ParseRequestURI - email: an email address as parsed by Golang net/mail.ParseAddress - hostname: a valid representation for an Internet host name, as defined by RFC 1034, section 3.1 [RFC1034]. - ipv4: an IPv4 IP as parsed by Golang net.ParseIP - ipv6: an IPv6 IP as parsed by Golang net.ParseIP - cidr: a CIDR as parsed by Golang net.ParseCIDR - mac: a MAC address as parsed by Golang net.ParseMAC - uuid: an UUID that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{12}$ - uuid3: an UUID3 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?3[0-9a-f]{3}-?[0-9a-f]{4}-?[0-9a-f]{12}$ - uuid4: an UUID4 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?4[0-9a-f]{3}-?[89ab][0-9a-f]{3}-?[0-9a-f]{12}$ - uuid5: an UUID5 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?5[0-9a-f]{3}-?[89ab][0-9a-f]{3}-?[0-9a-f]{12}$ - isbn: an ISBN10 or ISBN13 number string like \&quot;0321751043\&quot; or \&quot;978-0321751041\&quot; - isbn10: an ISBN10 number string like \&quot;0321751043\&quot; - isbn13: an ISBN13 number string like \&quot;978-0321751041\&quot; - creditcard: a credit card number defined by the regex ^(?:4[0-9]{12}(?:[0-9]{3})?|5[1-5][0-9]{14}|6(?:011|5[0-9][0-9])[0-9]{12}|3[47][0-9]{13}|3(?:0[0-5]|[68][0-9])[0-9]{11}|(?:2131|1800|35\\\\d{3})\\\\d{11})$ with any non digit characters mixed in - ssn: a U.S. social security number following the regex ^\\\\d{3}[- ]?\\\\d{2}[- ]?\\\\d{4}$ - hexcolor: an hexadecimal color code like \&quot;#FFFFFF: following the regex ^#?([0-9a-fA-F]{3}|[0-9a-fA-F]{6})$ - rgbcolor: an RGB color code like rgb like \&quot;rgb(255,255,2559\&quot; - byte: base64 encoded binary data - password: any kind of string - date: a date string like \&quot;2006-01-02\&quot; as defined by full-date in RFC3339 - duration: a duration string like \&quot;22 ns\&quot; as parsed by Golang time.ParseDuration or compatible with Scala duration format - datetime: a date time string like \&quot;2014-12-15T19:30:20.000Z\&quot; as defined by date-time in RFC3339.
   * @return format
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "format is an OpenAPI v3 format string. Unknown formats are ignored. The following formats are validated:  - bsonobjectid: a bson object ID, i.e. a 24 characters hex string - uri: an URI as parsed by Golang net/url.ParseRequestURI - email: an email address as parsed by Golang net/mail.ParseAddress - hostname: a valid representation for an Internet host name, as defined by RFC 1034, section 3.1 [RFC1034]. - ipv4: an IPv4 IP as parsed by Golang net.ParseIP - ipv6: an IPv6 IP as parsed by Golang net.ParseIP - cidr: a CIDR as parsed by Golang net.ParseCIDR - mac: a MAC address as parsed by Golang net.ParseMAC - uuid: an UUID that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{12}$ - uuid3: an UUID3 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?3[0-9a-f]{3}-?[0-9a-f]{4}-?[0-9a-f]{12}$ - uuid4: an UUID4 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?4[0-9a-f]{3}-?[89ab][0-9a-f]{3}-?[0-9a-f]{12}$ - uuid5: an UUID5 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?5[0-9a-f]{3}-?[89ab][0-9a-f]{3}-?[0-9a-f]{12}$ - isbn: an ISBN10 or ISBN13 number string like \"0321751043\" or \"978-0321751041\" - isbn10: an ISBN10 number string like \"0321751043\" - isbn13: an ISBN13 number string like \"978-0321751041\" - creditcard: a credit card number defined by the regex ^(?:4[0-9]{12}(?:[0-9]{3})?|5[1-5][0-9]{14}|6(?:011|5[0-9][0-9])[0-9]{12}|3[47][0-9]{13}|3(?:0[0-5]|[68][0-9])[0-9]{11}|(?:2131|1800|35\\\\d{3})\\\\d{11})$ with any non digit characters mixed in - ssn: a U.S. social security number following the regex ^\\\\d{3}[- ]?\\\\d{2}[- ]?\\\\d{4}$ - hexcolor: an hexadecimal color code like \"#FFFFFF: following the regex ^#?([0-9a-fA-F]{3}|[0-9a-fA-F]{6})$ - rgbcolor: an RGB color code like rgb like \"rgb(255,255,2559\" - byte: base64 encoded binary data - password: any kind of string - date: a date string like \"2006-01-02\" as defined by full-date in RFC3339 - duration: a duration string like \"22 ns\" as parsed by Golang time.ParseDuration or compatible with Scala duration format - datetime: a date time string like \"2014-12-15T19:30:20.000Z\" as defined by date-time in RFC3339.")
  public String getFormat() {
    return format;
  }

  public void setFormat(@jakarta.annotation.Nullable String format) {
    this.format = format;
  }


  public V1JSONSchemaProps id(@jakarta.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(@jakarta.annotation.Nullable String id) {
    this.id = id;
  }


  public V1JSONSchemaProps items(@jakarta.annotation.Nullable Object items) {
    this.items = items;
    return this;
  }

  /**
   * JSONSchemaPropsOrArray represents a value that can either be a JSONSchemaProps or an array of JSONSchemaProps. Mainly here for serialization purposes.
   * @return items
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "JSONSchemaPropsOrArray represents a value that can either be a JSONSchemaProps or an array of JSONSchemaProps. Mainly here for serialization purposes.")
  public Object getItems() {
    return items;
  }

  public void setItems(@jakarta.annotation.Nullable Object items) {
    this.items = items;
  }


  public V1JSONSchemaProps maxItems(@jakarta.annotation.Nullable Long maxItems) {
    this.maxItems = maxItems;
    return this;
  }

  /**
   * Get maxItems
   * @return maxItems
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public Long getMaxItems() {
    return maxItems;
  }

  public void setMaxItems(@jakarta.annotation.Nullable Long maxItems) {
    this.maxItems = maxItems;
  }


  public V1JSONSchemaProps maxLength(@jakarta.annotation.Nullable Long maxLength) {
    this.maxLength = maxLength;
    return this;
  }

  /**
   * Get maxLength
   * @return maxLength
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public Long getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(@jakarta.annotation.Nullable Long maxLength) {
    this.maxLength = maxLength;
  }


  public V1JSONSchemaProps maxProperties(@jakarta.annotation.Nullable Long maxProperties) {
    this.maxProperties = maxProperties;
    return this;
  }

  /**
   * Get maxProperties
   * @return maxProperties
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public Long getMaxProperties() {
    return maxProperties;
  }

  public void setMaxProperties(@jakarta.annotation.Nullable Long maxProperties) {
    this.maxProperties = maxProperties;
  }


  public V1JSONSchemaProps maximum(@jakarta.annotation.Nullable Double maximum) {
    this.maximum = maximum;
    return this;
  }

  /**
   * Get maximum
   * @return maximum
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public Double getMaximum() {
    return maximum;
  }

  public void setMaximum(@jakarta.annotation.Nullable Double maximum) {
    this.maximum = maximum;
  }


  public V1JSONSchemaProps minItems(@jakarta.annotation.Nullable Long minItems) {
    this.minItems = minItems;
    return this;
  }

  /**
   * Get minItems
   * @return minItems
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public Long getMinItems() {
    return minItems;
  }

  public void setMinItems(@jakarta.annotation.Nullable Long minItems) {
    this.minItems = minItems;
  }


  public V1JSONSchemaProps minLength(@jakarta.annotation.Nullable Long minLength) {
    this.minLength = minLength;
    return this;
  }

  /**
   * Get minLength
   * @return minLength
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public Long getMinLength() {
    return minLength;
  }

  public void setMinLength(@jakarta.annotation.Nullable Long minLength) {
    this.minLength = minLength;
  }


  public V1JSONSchemaProps minProperties(@jakarta.annotation.Nullable Long minProperties) {
    this.minProperties = minProperties;
    return this;
  }

  /**
   * Get minProperties
   * @return minProperties
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public Long getMinProperties() {
    return minProperties;
  }

  public void setMinProperties(@jakarta.annotation.Nullable Long minProperties) {
    this.minProperties = minProperties;
  }


  public V1JSONSchemaProps minimum(@jakarta.annotation.Nullable Double minimum) {
    this.minimum = minimum;
    return this;
  }

  /**
   * Get minimum
   * @return minimum
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public Double getMinimum() {
    return minimum;
  }

  public void setMinimum(@jakarta.annotation.Nullable Double minimum) {
    this.minimum = minimum;
  }


  public V1JSONSchemaProps multipleOf(@jakarta.annotation.Nullable Double multipleOf) {
    this.multipleOf = multipleOf;
    return this;
  }

  /**
   * Get multipleOf
   * @return multipleOf
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public Double getMultipleOf() {
    return multipleOf;
  }

  public void setMultipleOf(@jakarta.annotation.Nullable Double multipleOf) {
    this.multipleOf = multipleOf;
  }


  public V1JSONSchemaProps not(@jakarta.annotation.Nullable V1JSONSchemaProps not) {
    this.not = not;
    return this;
  }

  /**
   * Get not
   * @return not
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1JSONSchemaProps getNot() {
    return not;
  }

  public void setNot(@jakarta.annotation.Nullable V1JSONSchemaProps not) {
    this.not = not;
  }


  public V1JSONSchemaProps nullable(@jakarta.annotation.Nullable Boolean nullable) {
    this.nullable = nullable;
    return this;
  }

  /**
   * Get nullable
   * @return nullable
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getNullable() {
    return nullable;
  }

  public void setNullable(@jakarta.annotation.Nullable Boolean nullable) {
    this.nullable = nullable;
  }


  public V1JSONSchemaProps oneOf(@jakarta.annotation.Nullable List<V1JSONSchemaProps> oneOf) {
    this.oneOf = oneOf;
    return this;
  }

  public V1JSONSchemaProps addOneOfItem(V1JSONSchemaProps oneOfItem) {
    if (this.oneOf == null) {
      this.oneOf = new ArrayList<>();
    }
    this.oneOf.add(oneOfItem);
    return this;
  }

  /**
   * Get oneOf
   * @return oneOf
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public List<V1JSONSchemaProps> getOneOf() {
    return oneOf;
  }

  public void setOneOf(@jakarta.annotation.Nullable List<V1JSONSchemaProps> oneOf) {
    this.oneOf = oneOf;
  }


  public V1JSONSchemaProps pattern(@jakarta.annotation.Nullable String pattern) {
    this.pattern = pattern;
    return this;
  }

  /**
   * Get pattern
   * @return pattern
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getPattern() {
    return pattern;
  }

  public void setPattern(@jakarta.annotation.Nullable String pattern) {
    this.pattern = pattern;
  }


  public V1JSONSchemaProps patternProperties(@jakarta.annotation.Nullable Map<String, V1JSONSchemaProps> patternProperties) {
    this.patternProperties = patternProperties;
    return this;
  }

  public V1JSONSchemaProps putPatternPropertiesItem(String key, V1JSONSchemaProps patternPropertiesItem) {
    if (this.patternProperties == null) {
      this.patternProperties = new HashMap<>();
    }
    this.patternProperties.put(key, patternPropertiesItem);
    return this;
  }

  /**
   * Get patternProperties
   * @return patternProperties
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public Map<String, V1JSONSchemaProps> getPatternProperties() {
    return patternProperties;
  }

  public void setPatternProperties(@jakarta.annotation.Nullable Map<String, V1JSONSchemaProps> patternProperties) {
    this.patternProperties = patternProperties;
  }


  public V1JSONSchemaProps properties(@jakarta.annotation.Nullable Map<String, V1JSONSchemaProps> properties) {
    this.properties = properties;
    return this;
  }

  public V1JSONSchemaProps putPropertiesItem(String key, V1JSONSchemaProps propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

  /**
   * Get properties
   * @return properties
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public Map<String, V1JSONSchemaProps> getProperties() {
    return properties;
  }

  public void setProperties(@jakarta.annotation.Nullable Map<String, V1JSONSchemaProps> properties) {
    this.properties = properties;
  }


  public V1JSONSchemaProps required(@jakarta.annotation.Nullable List<String> required) {
    this.required = required;
    return this;
  }

  public V1JSONSchemaProps addRequiredItem(String requiredItem) {
    if (this.required == null) {
      this.required = new ArrayList<>();
    }
    this.required.add(requiredItem);
    return this;
  }

  /**
   * Get required
   * @return required
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public List<String> getRequired() {
    return required;
  }

  public void setRequired(@jakarta.annotation.Nullable List<String> required) {
    this.required = required;
  }


  public V1JSONSchemaProps title(@jakarta.annotation.Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(@jakarta.annotation.Nullable String title) {
    this.title = title;
  }


  public V1JSONSchemaProps type(@jakarta.annotation.Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(@jakarta.annotation.Nullable String type) {
    this.type = type;
  }


  public V1JSONSchemaProps uniqueItems(@jakarta.annotation.Nullable Boolean uniqueItems) {
    this.uniqueItems = uniqueItems;
    return this;
  }

  /**
   * Get uniqueItems
   * @return uniqueItems
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getUniqueItems() {
    return uniqueItems;
  }

  public void setUniqueItems(@jakarta.annotation.Nullable Boolean uniqueItems) {
    this.uniqueItems = uniqueItems;
  }


  public V1JSONSchemaProps xKubernetesEmbeddedResource(@jakarta.annotation.Nullable Boolean xKubernetesEmbeddedResource) {
    this.xKubernetesEmbeddedResource = xKubernetesEmbeddedResource;
    return this;
  }

  /**
   * x-kubernetes-embedded-resource defines that the value is an embedded Kubernetes runtime.Object, with TypeMeta and ObjectMeta. The type must be object. It is allowed to further restrict the embedded object. kind, apiVersion and metadata are validated automatically. x-kubernetes-preserve-unknown-fields is allowed to be true, but does not have to be if the object is fully specified (up to kind, apiVersion, metadata).
   * @return xKubernetesEmbeddedResource
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "x-kubernetes-embedded-resource defines that the value is an embedded Kubernetes runtime.Object, with TypeMeta and ObjectMeta. The type must be object. It is allowed to further restrict the embedded object. kind, apiVersion and metadata are validated automatically. x-kubernetes-preserve-unknown-fields is allowed to be true, but does not have to be if the object is fully specified (up to kind, apiVersion, metadata).")
  public Boolean getxKubernetesEmbeddedResource() {
    return xKubernetesEmbeddedResource;
  }

  public void setxKubernetesEmbeddedResource(@jakarta.annotation.Nullable Boolean xKubernetesEmbeddedResource) {
    this.xKubernetesEmbeddedResource = xKubernetesEmbeddedResource;
  }


  public V1JSONSchemaProps xKubernetesIntOrString(@jakarta.annotation.Nullable Boolean xKubernetesIntOrString) {
    this.xKubernetesIntOrString = xKubernetesIntOrString;
    return this;
  }

  /**
   * x-kubernetes-int-or-string specifies that this value is either an integer or a string. If this is true, an empty type is allowed and type as child of anyOf is permitted if following one of the following patterns:  1) anyOf:    - type: integer    - type: string 2) allOf:    - anyOf:      - type: integer      - type: string    - ... zero or more
   * @return xKubernetesIntOrString
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "x-kubernetes-int-or-string specifies that this value is either an integer or a string. If this is true, an empty type is allowed and type as child of anyOf is permitted if following one of the following patterns:  1) anyOf:    - type: integer    - type: string 2) allOf:    - anyOf:      - type: integer      - type: string    - ... zero or more")
  public Boolean getxKubernetesIntOrString() {
    return xKubernetesIntOrString;
  }

  public void setxKubernetesIntOrString(@jakarta.annotation.Nullable Boolean xKubernetesIntOrString) {
    this.xKubernetesIntOrString = xKubernetesIntOrString;
  }


  public V1JSONSchemaProps xKubernetesListMapKeys(@jakarta.annotation.Nullable List<String> xKubernetesListMapKeys) {
    this.xKubernetesListMapKeys = xKubernetesListMapKeys;
    return this;
  }

  public V1JSONSchemaProps addXKubernetesListMapKeysItem(String xKubernetesListMapKeysItem) {
    if (this.xKubernetesListMapKeys == null) {
      this.xKubernetesListMapKeys = new ArrayList<>();
    }
    this.xKubernetesListMapKeys.add(xKubernetesListMapKeysItem);
    return this;
  }

  /**
   * x-kubernetes-list-map-keys annotates an array with the x-kubernetes-list-type &#x60;map&#x60; by specifying the keys used as the index of the map.  This tag MUST only be used on lists that have the \&quot;x-kubernetes-list-type\&quot; extension set to \&quot;map\&quot;. Also, the values specified for this attribute must be a scalar typed field of the child structure (no nesting is supported).  The properties specified must either be required or have a default value, to ensure those properties are present for all list items.
   * @return xKubernetesListMapKeys
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "x-kubernetes-list-map-keys annotates an array with the x-kubernetes-list-type `map` by specifying the keys used as the index of the map.  This tag MUST only be used on lists that have the \"x-kubernetes-list-type\" extension set to \"map\". Also, the values specified for this attribute must be a scalar typed field of the child structure (no nesting is supported).  The properties specified must either be required or have a default value, to ensure those properties are present for all list items.")
  public List<String> getxKubernetesListMapKeys() {
    return xKubernetesListMapKeys;
  }

  public void setxKubernetesListMapKeys(@jakarta.annotation.Nullable List<String> xKubernetesListMapKeys) {
    this.xKubernetesListMapKeys = xKubernetesListMapKeys;
  }


  public V1JSONSchemaProps xKubernetesListType(@jakarta.annotation.Nullable String xKubernetesListType) {
    this.xKubernetesListType = xKubernetesListType;
    return this;
  }

  /**
   * x-kubernetes-list-type annotates an array to further describe its topology. This extension must only be used on lists and may have 3 possible values:  1) &#x60;atomic&#x60;: the list is treated as a single entity, like a scalar.      Atomic lists will be entirely replaced when updated. This extension      may be used on any type of list (struct, scalar, ...). 2) &#x60;set&#x60;:      Sets are lists that must not have multiple items with the same value. Each      value must be a scalar, an object with x-kubernetes-map-type &#x60;atomic&#x60; or an      array with x-kubernetes-list-type &#x60;atomic&#x60;. 3) &#x60;map&#x60;:      These lists are like maps in that their elements have a non-index key      used to identify them. Order is preserved upon merge. The map tag      must only be used on a list with elements of type object. Defaults to atomic for arrays.
   * @return xKubernetesListType
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "x-kubernetes-list-type annotates an array to further describe its topology. This extension must only be used on lists and may have 3 possible values:  1) `atomic`: the list is treated as a single entity, like a scalar.      Atomic lists will be entirely replaced when updated. This extension      may be used on any type of list (struct, scalar, ...). 2) `set`:      Sets are lists that must not have multiple items with the same value. Each      value must be a scalar, an object with x-kubernetes-map-type `atomic` or an      array with x-kubernetes-list-type `atomic`. 3) `map`:      These lists are like maps in that their elements have a non-index key      used to identify them. Order is preserved upon merge. The map tag      must only be used on a list with elements of type object. Defaults to atomic for arrays.")
  public String getxKubernetesListType() {
    return xKubernetesListType;
  }

  public void setxKubernetesListType(@jakarta.annotation.Nullable String xKubernetesListType) {
    this.xKubernetesListType = xKubernetesListType;
  }


  public V1JSONSchemaProps xKubernetesMapType(@jakarta.annotation.Nullable String xKubernetesMapType) {
    this.xKubernetesMapType = xKubernetesMapType;
    return this;
  }

  /**
   * x-kubernetes-map-type annotates an object to further describe its topology. This extension must only be used when type is object and may have 2 possible values:  1) &#x60;granular&#x60;:      These maps are actual maps (key-value pairs) and each fields are independent      from each other (they can each be manipulated by separate actors). This is      the default behaviour for all maps. 2) &#x60;atomic&#x60;: the list is treated as a single entity, like a scalar.      Atomic maps will be entirely replaced when updated.
   * @return xKubernetesMapType
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "x-kubernetes-map-type annotates an object to further describe its topology. This extension must only be used when type is object and may have 2 possible values:  1) `granular`:      These maps are actual maps (key-value pairs) and each fields are independent      from each other (they can each be manipulated by separate actors). This is      the default behaviour for all maps. 2) `atomic`: the list is treated as a single entity, like a scalar.      Atomic maps will be entirely replaced when updated.")
  public String getxKubernetesMapType() {
    return xKubernetesMapType;
  }

  public void setxKubernetesMapType(@jakarta.annotation.Nullable String xKubernetesMapType) {
    this.xKubernetesMapType = xKubernetesMapType;
  }


  public V1JSONSchemaProps xKubernetesPreserveUnknownFields(@jakarta.annotation.Nullable Boolean xKubernetesPreserveUnknownFields) {
    this.xKubernetesPreserveUnknownFields = xKubernetesPreserveUnknownFields;
    return this;
  }

  /**
   * x-kubernetes-preserve-unknown-fields stops the API server decoding step from pruning fields which are not specified in the validation schema. This affects fields recursively, but switches back to normal pruning behaviour if nested properties or additionalProperties are specified in the schema. This can either be true or undefined. False is forbidden.
   * @return xKubernetesPreserveUnknownFields
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "x-kubernetes-preserve-unknown-fields stops the API server decoding step from pruning fields which are not specified in the validation schema. This affects fields recursively, but switches back to normal pruning behaviour if nested properties or additionalProperties are specified in the schema. This can either be true or undefined. False is forbidden.")
  public Boolean getxKubernetesPreserveUnknownFields() {
    return xKubernetesPreserveUnknownFields;
  }

  public void setxKubernetesPreserveUnknownFields(@jakarta.annotation.Nullable Boolean xKubernetesPreserveUnknownFields) {
    this.xKubernetesPreserveUnknownFields = xKubernetesPreserveUnknownFields;
  }


  public V1JSONSchemaProps xKubernetesValidations(@jakarta.annotation.Nullable List<V1ValidationRule> xKubernetesValidations) {
    this.xKubernetesValidations = xKubernetesValidations;
    return this;
  }

  public V1JSONSchemaProps addXKubernetesValidationsItem(V1ValidationRule xKubernetesValidationsItem) {
    if (this.xKubernetesValidations == null) {
      this.xKubernetesValidations = new ArrayList<>();
    }
    this.xKubernetesValidations.add(xKubernetesValidationsItem);
    return this;
  }

  /**
   * x-kubernetes-validations describes a list of validation rules written in the CEL expression language.
   * @return xKubernetesValidations
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "x-kubernetes-validations describes a list of validation rules written in the CEL expression language.")
  public List<V1ValidationRule> getxKubernetesValidations() {
    return xKubernetesValidations;
  }

  public void setxKubernetesValidations(@jakarta.annotation.Nullable List<V1ValidationRule> xKubernetesValidations) {
    this.xKubernetesValidations = xKubernetesValidations;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1JSONSchemaProps v1JSONSchemaProps = (V1JSONSchemaProps) o;
    return Objects.equals(this.$ref, v1JSONSchemaProps.$ref) &&
        Objects.equals(this.$schema, v1JSONSchemaProps.$schema) &&
        Objects.equals(this.additionalItems, v1JSONSchemaProps.additionalItems) &&
        Objects.equals(this.additionalProperties, v1JSONSchemaProps.additionalProperties) &&
        Objects.equals(this.allOf, v1JSONSchemaProps.allOf) &&
        Objects.equals(this.anyOf, v1JSONSchemaProps.anyOf) &&
        Objects.equals(this._default, v1JSONSchemaProps._default) &&
        Objects.equals(this.definitions, v1JSONSchemaProps.definitions) &&
        Objects.equals(this.dependencies, v1JSONSchemaProps.dependencies) &&
        Objects.equals(this.description, v1JSONSchemaProps.description) &&
        Objects.equals(this._enum, v1JSONSchemaProps._enum) &&
        Objects.equals(this.example, v1JSONSchemaProps.example) &&
        Objects.equals(this.exclusiveMaximum, v1JSONSchemaProps.exclusiveMaximum) &&
        Objects.equals(this.exclusiveMinimum, v1JSONSchemaProps.exclusiveMinimum) &&
        Objects.equals(this.externalDocs, v1JSONSchemaProps.externalDocs) &&
        Objects.equals(this.format, v1JSONSchemaProps.format) &&
        Objects.equals(this.id, v1JSONSchemaProps.id) &&
        Objects.equals(this.items, v1JSONSchemaProps.items) &&
        Objects.equals(this.maxItems, v1JSONSchemaProps.maxItems) &&
        Objects.equals(this.maxLength, v1JSONSchemaProps.maxLength) &&
        Objects.equals(this.maxProperties, v1JSONSchemaProps.maxProperties) &&
        Objects.equals(this.maximum, v1JSONSchemaProps.maximum) &&
        Objects.equals(this.minItems, v1JSONSchemaProps.minItems) &&
        Objects.equals(this.minLength, v1JSONSchemaProps.minLength) &&
        Objects.equals(this.minProperties, v1JSONSchemaProps.minProperties) &&
        Objects.equals(this.minimum, v1JSONSchemaProps.minimum) &&
        Objects.equals(this.multipleOf, v1JSONSchemaProps.multipleOf) &&
        Objects.equals(this.not, v1JSONSchemaProps.not) &&
        Objects.equals(this.nullable, v1JSONSchemaProps.nullable) &&
        Objects.equals(this.oneOf, v1JSONSchemaProps.oneOf) &&
        Objects.equals(this.pattern, v1JSONSchemaProps.pattern) &&
        Objects.equals(this.patternProperties, v1JSONSchemaProps.patternProperties) &&
        Objects.equals(this.properties, v1JSONSchemaProps.properties) &&
        Objects.equals(this.required, v1JSONSchemaProps.required) &&
        Objects.equals(this.title, v1JSONSchemaProps.title) &&
        Objects.equals(this.type, v1JSONSchemaProps.type) &&
        Objects.equals(this.uniqueItems, v1JSONSchemaProps.uniqueItems) &&
        Objects.equals(this.xKubernetesEmbeddedResource, v1JSONSchemaProps.xKubernetesEmbeddedResource) &&
        Objects.equals(this.xKubernetesIntOrString, v1JSONSchemaProps.xKubernetesIntOrString) &&
        Objects.equals(this.xKubernetesListMapKeys, v1JSONSchemaProps.xKubernetesListMapKeys) &&
        Objects.equals(this.xKubernetesListType, v1JSONSchemaProps.xKubernetesListType) &&
        Objects.equals(this.xKubernetesMapType, v1JSONSchemaProps.xKubernetesMapType) &&
        Objects.equals(this.xKubernetesPreserveUnknownFields, v1JSONSchemaProps.xKubernetesPreserveUnknownFields) &&
        Objects.equals(this.xKubernetesValidations, v1JSONSchemaProps.xKubernetesValidations);
  }

  @Override
  public int hashCode() {
    return Objects.hash($ref, $schema, additionalItems, additionalProperties, allOf, anyOf, _default, definitions, dependencies, description, _enum, example, exclusiveMaximum, exclusiveMinimum, externalDocs, format, id, items, maxItems, maxLength, maxProperties, maximum, minItems, minLength, minProperties, minimum, multipleOf, not, nullable, oneOf, pattern, patternProperties, properties, required, title, type, uniqueItems, xKubernetesEmbeddedResource, xKubernetesIntOrString, xKubernetesListMapKeys, xKubernetesListType, xKubernetesMapType, xKubernetesPreserveUnknownFields, xKubernetesValidations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1JSONSchemaProps {\n");
    sb.append("    $ref: ").append(toIndentedString($ref)).append("\n");
    sb.append("    $schema: ").append(toIndentedString($schema)).append("\n");
    sb.append("    additionalItems: ").append(toIndentedString(additionalItems)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    allOf: ").append(toIndentedString(allOf)).append("\n");
    sb.append("    anyOf: ").append(toIndentedString(anyOf)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    definitions: ").append(toIndentedString(definitions)).append("\n");
    sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    _enum: ").append(toIndentedString(_enum)).append("\n");
    sb.append("    example: ").append(toIndentedString(example)).append("\n");
    sb.append("    exclusiveMaximum: ").append(toIndentedString(exclusiveMaximum)).append("\n");
    sb.append("    exclusiveMinimum: ").append(toIndentedString(exclusiveMinimum)).append("\n");
    sb.append("    externalDocs: ").append(toIndentedString(externalDocs)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    maxItems: ").append(toIndentedString(maxItems)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    maxProperties: ").append(toIndentedString(maxProperties)).append("\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
    sb.append("    minItems: ").append(toIndentedString(minItems)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    minProperties: ").append(toIndentedString(minProperties)).append("\n");
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
    sb.append("    multipleOf: ").append(toIndentedString(multipleOf)).append("\n");
    sb.append("    not: ").append(toIndentedString(not)).append("\n");
    sb.append("    nullable: ").append(toIndentedString(nullable)).append("\n");
    sb.append("    oneOf: ").append(toIndentedString(oneOf)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    patternProperties: ").append(toIndentedString(patternProperties)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uniqueItems: ").append(toIndentedString(uniqueItems)).append("\n");
    sb.append("    xKubernetesEmbeddedResource: ").append(toIndentedString(xKubernetesEmbeddedResource)).append("\n");
    sb.append("    xKubernetesIntOrString: ").append(toIndentedString(xKubernetesIntOrString)).append("\n");
    sb.append("    xKubernetesListMapKeys: ").append(toIndentedString(xKubernetesListMapKeys)).append("\n");
    sb.append("    xKubernetesListType: ").append(toIndentedString(xKubernetesListType)).append("\n");
    sb.append("    xKubernetesMapType: ").append(toIndentedString(xKubernetesMapType)).append("\n");
    sb.append("    xKubernetesPreserveUnknownFields: ").append(toIndentedString(xKubernetesPreserveUnknownFields)).append("\n");
    sb.append("    xKubernetesValidations: ").append(toIndentedString(xKubernetesValidations)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("$ref");
    openapiFields.add("$schema");
    openapiFields.add("additionalItems");
    openapiFields.add("additionalProperties");
    openapiFields.add("allOf");
    openapiFields.add("anyOf");
    openapiFields.add("default");
    openapiFields.add("definitions");
    openapiFields.add("dependencies");
    openapiFields.add("description");
    openapiFields.add("enum");
    openapiFields.add("example");
    openapiFields.add("exclusiveMaximum");
    openapiFields.add("exclusiveMinimum");
    openapiFields.add("externalDocs");
    openapiFields.add("format");
    openapiFields.add("id");
    openapiFields.add("items");
    openapiFields.add("maxItems");
    openapiFields.add("maxLength");
    openapiFields.add("maxProperties");
    openapiFields.add("maximum");
    openapiFields.add("minItems");
    openapiFields.add("minLength");
    openapiFields.add("minProperties");
    openapiFields.add("minimum");
    openapiFields.add("multipleOf");
    openapiFields.add("not");
    openapiFields.add("nullable");
    openapiFields.add("oneOf");
    openapiFields.add("pattern");
    openapiFields.add("patternProperties");
    openapiFields.add("properties");
    openapiFields.add("required");
    openapiFields.add("title");
    openapiFields.add("type");
    openapiFields.add("uniqueItems");
    openapiFields.add("x-kubernetes-embedded-resource");
    openapiFields.add("x-kubernetes-int-or-string");
    openapiFields.add("x-kubernetes-list-map-keys");
    openapiFields.add("x-kubernetes-list-type");
    openapiFields.add("x-kubernetes-map-type");
    openapiFields.add("x-kubernetes-preserve-unknown-fields");
    openapiFields.add("x-kubernetes-validations");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1JSONSchemaProps
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1JSONSchemaProps.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1JSONSchemaProps is not found in the empty JSON string", V1JSONSchemaProps.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1JSONSchemaProps.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1JSONSchemaProps` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("$ref") != null && !jsonObj.get("$ref").isJsonNull()) && !jsonObj.get("$ref").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `$ref` to be a primitive type in the JSON string but got `%s`", jsonObj.get("$ref").toString()));
      }
      if ((jsonObj.get("$schema") != null && !jsonObj.get("$schema").isJsonNull()) && !jsonObj.get("$schema").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `$schema` to be a primitive type in the JSON string but got `%s`", jsonObj.get("$schema").toString()));
      }
      if (jsonObj.get("allOf") != null && !jsonObj.get("allOf").isJsonNull()) {
        JsonArray jsonArrayallOf = jsonObj.getAsJsonArray("allOf");
        if (jsonArrayallOf != null) {
          // ensure the json data is an array
          if (!jsonObj.get("allOf").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `allOf` to be an array in the JSON string but got `%s`", jsonObj.get("allOf").toString()));
          }

          // validate the optional field `allOf` (array)
          for (int i = 0; i < jsonArrayallOf.size(); i++) {
            V1JSONSchemaProps.validateJsonElement(jsonArrayallOf.get(i));
          };
        }
      }
      if (jsonObj.get("anyOf") != null && !jsonObj.get("anyOf").isJsonNull()) {
        JsonArray jsonArrayanyOf = jsonObj.getAsJsonArray("anyOf");
        if (jsonArrayanyOf != null) {
          // ensure the json data is an array
          if (!jsonObj.get("anyOf").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `anyOf` to be an array in the JSON string but got `%s`", jsonObj.get("anyOf").toString()));
          }

          // validate the optional field `anyOf` (array)
          for (int i = 0; i < jsonArrayanyOf.size(); i++) {
            V1JSONSchemaProps.validateJsonElement(jsonArrayanyOf.get(i));
          };
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("enum") != null && !jsonObj.get("enum").isJsonNull() && !jsonObj.get("enum").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `enum` to be an array in the JSON string but got `%s`", jsonObj.get("enum").toString()));
      }
      // validate the optional field `externalDocs`
      if (jsonObj.get("externalDocs") != null && !jsonObj.get("externalDocs").isJsonNull()) {
        V1ExternalDocumentation.validateJsonElement(jsonObj.get("externalDocs"));
      }
      if ((jsonObj.get("format") != null && !jsonObj.get("format").isJsonNull()) && !jsonObj.get("format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("format").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `not`
      if (jsonObj.get("not") != null && !jsonObj.get("not").isJsonNull()) {
        V1JSONSchemaProps.validateJsonElement(jsonObj.get("not"));
      }
      if (jsonObj.get("oneOf") != null && !jsonObj.get("oneOf").isJsonNull()) {
        JsonArray jsonArrayoneOf = jsonObj.getAsJsonArray("oneOf");
        if (jsonArrayoneOf != null) {
          // ensure the json data is an array
          if (!jsonObj.get("oneOf").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `oneOf` to be an array in the JSON string but got `%s`", jsonObj.get("oneOf").toString()));
          }

          // validate the optional field `oneOf` (array)
          for (int i = 0; i < jsonArrayoneOf.size(); i++) {
            V1JSONSchemaProps.validateJsonElement(jsonArrayoneOf.get(i));
          };
        }
      }
      if ((jsonObj.get("pattern") != null && !jsonObj.get("pattern").isJsonNull()) && !jsonObj.get("pattern").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pattern` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pattern").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("required") != null && !jsonObj.get("required").isJsonNull() && !jsonObj.get("required").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `required` to be an array in the JSON string but got `%s`", jsonObj.get("required").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("x-kubernetes-list-map-keys") != null && !jsonObj.get("x-kubernetes-list-map-keys").isJsonNull() && !jsonObj.get("x-kubernetes-list-map-keys").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `x-kubernetes-list-map-keys` to be an array in the JSON string but got `%s`", jsonObj.get("x-kubernetes-list-map-keys").toString()));
      }
      if ((jsonObj.get("x-kubernetes-list-type") != null && !jsonObj.get("x-kubernetes-list-type").isJsonNull()) && !jsonObj.get("x-kubernetes-list-type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `x-kubernetes-list-type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("x-kubernetes-list-type").toString()));
      }
      if ((jsonObj.get("x-kubernetes-map-type") != null && !jsonObj.get("x-kubernetes-map-type").isJsonNull()) && !jsonObj.get("x-kubernetes-map-type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `x-kubernetes-map-type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("x-kubernetes-map-type").toString()));
      }
      if (jsonObj.get("x-kubernetes-validations") != null && !jsonObj.get("x-kubernetes-validations").isJsonNull()) {
        JsonArray jsonArrayxKubernetesValidations = jsonObj.getAsJsonArray("x-kubernetes-validations");
        if (jsonArrayxKubernetesValidations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("x-kubernetes-validations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `x-kubernetes-validations` to be an array in the JSON string but got `%s`", jsonObj.get("x-kubernetes-validations").toString()));
          }

          // validate the optional field `x-kubernetes-validations` (array)
          for (int i = 0; i < jsonArrayxKubernetesValidations.size(); i++) {
            V1ValidationRule.validateJsonElement(jsonArrayxKubernetesValidations.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1JSONSchemaProps.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1JSONSchemaProps' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1JSONSchemaProps> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1JSONSchemaProps.class));

       return (TypeAdapter<T>) new TypeAdapter<V1JSONSchemaProps>() {
           @Override
           public void write(JsonWriter out, V1JSONSchemaProps value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1JSONSchemaProps read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1JSONSchemaProps given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1JSONSchemaProps
   * @throws IOException if the JSON string is invalid with respect to V1JSONSchemaProps
   */
  public static V1JSONSchemaProps fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1JSONSchemaProps.class);
  }

  /**
   * Convert an instance of V1JSONSchemaProps to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
