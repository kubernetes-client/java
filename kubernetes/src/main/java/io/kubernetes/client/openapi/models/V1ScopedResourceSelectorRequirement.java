/*
Copyright 2021 The Kubernetes Authors.
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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A scoped-resource selector requirement is a selector that contains values, a scope name, and an
 * operator that relates the scope name and values.
 */
@ApiModel(
    description =
        "A scoped-resource selector requirement is a selector that contains values, a scope name, and an operator that relates the scope name and values.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-12-10T19:11:23.904Z[Etc/UTC]")
public class V1ScopedResourceSelectorRequirement {
  /**
   * Represents a scope&#39;s relationship to a set of values. Valid operators are In, NotIn,
   * Exists, DoesNotExist. Possible enum values: - &#x60;\&quot;DoesNotExist\&quot;&#x60; -
   * &#x60;\&quot;Exists\&quot;&#x60; - &#x60;\&quot;In\&quot;&#x60; -
   * &#x60;\&quot;NotIn\&quot;&#x60;
   */
  @JsonAdapter(OperatorEnum.Adapter.class)
  public enum OperatorEnum {
    DOESNOTEXIST("DoesNotExist"),

    EXISTS("Exists"),

    IN("In"),

    NOTIN("NotIn");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OperatorEnum fromValue(String value) {
      for (OperatorEnum b : OperatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OperatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperatorEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperatorEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OperatorEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OPERATOR = "operator";

  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private OperatorEnum operator;

  /**
   * The name of the scope that the selector applies to. Possible enum values: -
   * &#x60;\&quot;BestEffort\&quot;&#x60; Match all pod objects that have best effort quality of
   * service - &#x60;\&quot;CrossNamespacePodAffinity\&quot;&#x60; Match all pod objects that have
   * cross-namespace pod (anti)affinity mentioned. This is a beta feature enabled by the
   * PodAffinityNamespaceSelector feature flag. - &#x60;\&quot;NotBestEffort\&quot;&#x60; Match all
   * pod objects that do not have best effort quality of service -
   * &#x60;\&quot;NotTerminating\&quot;&#x60; Match all pod objects where spec.activeDeadlineSeconds
   * is nil - &#x60;\&quot;PriorityClass\&quot;&#x60; Match all pod objects that have priority class
   * mentioned - &#x60;\&quot;Terminating\&quot;&#x60; Match all pod objects where
   * spec.activeDeadlineSeconds &gt;&#x3D;0
   */
  @JsonAdapter(ScopeNameEnum.Adapter.class)
  public enum ScopeNameEnum {
    BESTEFFORT("BestEffort"),

    CROSSNAMESPACEPODAFFINITY("CrossNamespacePodAffinity"),

    NOTBESTEFFORT("NotBestEffort"),

    NOTTERMINATING("NotTerminating"),

    PRIORITYCLASS("PriorityClass"),

    TERMINATING("Terminating");

    private String value;

    ScopeNameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScopeNameEnum fromValue(String value) {
      for (ScopeNameEnum b : ScopeNameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ScopeNameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScopeNameEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScopeNameEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ScopeNameEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SCOPE_NAME = "scopeName";

  @SerializedName(SERIALIZED_NAME_SCOPE_NAME)
  private ScopeNameEnum scopeName;

  public static final String SERIALIZED_NAME_VALUES = "values";

  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<String> values = null;

  public V1ScopedResourceSelectorRequirement operator(OperatorEnum operator) {

    this.operator = operator;
    return this;
  }

  /**
   * Represents a scope&#39;s relationship to a set of values. Valid operators are In, NotIn,
   * Exists, DoesNotExist. Possible enum values: - &#x60;\&quot;DoesNotExist\&quot;&#x60; -
   * &#x60;\&quot;Exists\&quot;&#x60; - &#x60;\&quot;In\&quot;&#x60; -
   * &#x60;\&quot;NotIn\&quot;&#x60;
   *
   * @return operator
   */
  @ApiModelProperty(
      required = true,
      value =
          "Represents a scope's relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist.  Possible enum values:  - `\"DoesNotExist\"`  - `\"Exists\"`  - `\"In\"`  - `\"NotIn\"`")
  public OperatorEnum getOperator() {
    return operator;
  }

  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  public V1ScopedResourceSelectorRequirement scopeName(ScopeNameEnum scopeName) {

    this.scopeName = scopeName;
    return this;
  }

  /**
   * The name of the scope that the selector applies to. Possible enum values: -
   * &#x60;\&quot;BestEffort\&quot;&#x60; Match all pod objects that have best effort quality of
   * service - &#x60;\&quot;CrossNamespacePodAffinity\&quot;&#x60; Match all pod objects that have
   * cross-namespace pod (anti)affinity mentioned. This is a beta feature enabled by the
   * PodAffinityNamespaceSelector feature flag. - &#x60;\&quot;NotBestEffort\&quot;&#x60; Match all
   * pod objects that do not have best effort quality of service -
   * &#x60;\&quot;NotTerminating\&quot;&#x60; Match all pod objects where spec.activeDeadlineSeconds
   * is nil - &#x60;\&quot;PriorityClass\&quot;&#x60; Match all pod objects that have priority class
   * mentioned - &#x60;\&quot;Terminating\&quot;&#x60; Match all pod objects where
   * spec.activeDeadlineSeconds &gt;&#x3D;0
   *
   * @return scopeName
   */
  @ApiModelProperty(
      required = true,
      value =
          "The name of the scope that the selector applies to.  Possible enum values:  - `\"BestEffort\"` Match all pod objects that have best effort quality of service  - `\"CrossNamespacePodAffinity\"` Match all pod objects that have cross-namespace pod (anti)affinity mentioned. This is a beta feature enabled by the PodAffinityNamespaceSelector feature flag.  - `\"NotBestEffort\"` Match all pod objects that do not have best effort quality of service  - `\"NotTerminating\"` Match all pod objects where spec.activeDeadlineSeconds is nil  - `\"PriorityClass\"` Match all pod objects that have priority class mentioned  - `\"Terminating\"` Match all pod objects where spec.activeDeadlineSeconds >=0")
  public ScopeNameEnum getScopeName() {
    return scopeName;
  }

  public void setScopeName(ScopeNameEnum scopeName) {
    this.scopeName = scopeName;
  }

  public V1ScopedResourceSelectorRequirement values(List<String> values) {

    this.values = values;
    return this;
  }

  public V1ScopedResourceSelectorRequirement addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * An array of string values. If the operator is In or NotIn, the values array must be non-empty.
   * If the operator is Exists or DoesNotExist, the values array must be empty. This array is
   * replaced during a strategic merge patch.
   *
   * @return values
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.")
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ScopedResourceSelectorRequirement v1ScopedResourceSelectorRequirement =
        (V1ScopedResourceSelectorRequirement) o;
    return Objects.equals(this.operator, v1ScopedResourceSelectorRequirement.operator)
        && Objects.equals(this.scopeName, v1ScopedResourceSelectorRequirement.scopeName)
        && Objects.equals(this.values, v1ScopedResourceSelectorRequirement.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, scopeName, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ScopedResourceSelectorRequirement {\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    scopeName: ").append(toIndentedString(scopeName)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
