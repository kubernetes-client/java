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

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.custom.Quantity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * CSIStorageCapacity stores the result of one CSI GetCapacity call. For a given StorageClass, this
 * describes the available capacity in a particular topology segment. This can be used when
 * considering where to instantiate new PersistentVolumes. For example this can express things like:
 * - StorageClass \&quot;standard\&quot; has \&quot;1234 GiB\&quot; available in
 * \&quot;topology.kubernetes.io/zone&#x3D;us-east1\&quot; - StorageClass \&quot;localssd\&quot; has
 * \&quot;10 GiB\&quot; available in \&quot;kubernetes.io/hostname&#x3D;knode-abc123\&quot; The
 * following three cases all imply that no capacity is available for a certain combination: - no
 * object exists with suitable topology and storage class name - such an object exists, but the
 * capacity is unset - such an object exists, but the capacity is zero The producer of these objects
 * can decide which approach is more suitable. They are consumed by the kube-scheduler when a CSI
 * driver opts into capacity-aware scheduling with CSIDriverSpec.StorageCapacity. The scheduler
 * compares the MaximumVolumeSize against the requested size of pending volumes to filter out
 * unsuitable nodes. If MaximumVolumeSize is unset, it falls back to a comparison against the less
 * precise Capacity. If that is also unset, the scheduler assumes that capacity is insufficient and
 * tries some other node.
 */
@ApiModel(
    description =
        "CSIStorageCapacity stores the result of one CSI GetCapacity call. For a given StorageClass, this describes the available capacity in a particular topology segment.  This can be used when considering where to instantiate new PersistentVolumes.  For example this can express things like: - StorageClass \"standard\" has \"1234 GiB\" available in \"topology.kubernetes.io/zone=us-east1\" - StorageClass \"localssd\" has \"10 GiB\" available in \"kubernetes.io/hostname=knode-abc123\"  The following three cases all imply that no capacity is available for a certain combination: - no object exists with suitable topology and storage class name - such an object exists, but the capacity is unset - such an object exists, but the capacity is zero  The producer of these objects can decide which approach is more suitable.  They are consumed by the kube-scheduler when a CSI driver opts into capacity-aware scheduling with CSIDriverSpec.StorageCapacity. The scheduler compares the MaximumVolumeSize against the requested size of pending volumes to filter out unsuitable nodes. If MaximumVolumeSize is unset, it falls back to a comparison against the less precise Capacity. If that is also unset, the scheduler assumes that capacity is insufficient and tries some other node.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1CSIStorageCapacity implements io.kubernetes.client.common.KubernetesObject {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";

  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_CAPACITY = "capacity";

  @SerializedName(SERIALIZED_NAME_CAPACITY)
  private Quantity capacity;

  public static final String SERIALIZED_NAME_KIND = "kind";

  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_MAXIMUM_VOLUME_SIZE = "maximumVolumeSize";

  @SerializedName(SERIALIZED_NAME_MAXIMUM_VOLUME_SIZE)
  private Quantity maximumVolumeSize;

  public static final String SERIALIZED_NAME_METADATA = "metadata";

  @SerializedName(SERIALIZED_NAME_METADATA)
  private V1ObjectMeta metadata;

  public static final String SERIALIZED_NAME_NODE_TOPOLOGY = "nodeTopology";

  @SerializedName(SERIALIZED_NAME_NODE_TOPOLOGY)
  private V1LabelSelector nodeTopology;

  public static final String SERIALIZED_NAME_STORAGE_CLASS_NAME = "storageClassName";

  @SerializedName(SERIALIZED_NAME_STORAGE_CLASS_NAME)
  private String storageClassName;

  public V1CSIStorageCapacity apiVersion(String apiVersion) {

    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should
   * convert recognized schemas to the latest internal value, and may reject unrecognized values.
   * More info:
   * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   *
   * @return apiVersion
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public V1CSIStorageCapacity capacity(Quantity capacity) {

    this.capacity = capacity;
    return this;
  }

  /**
   * Quantity is a fixed-point representation of a number. It provides convenient
   * marshaling/unmarshaling in JSON and YAML, in addition to String() and AsInt64() accessors. The
   * serialization format is: &#x60;&#x60;&#x60; &lt;quantity&gt; ::&#x3D;
   * &lt;signedNumber&gt;&lt;suffix&gt; (Note that &lt;suffix&gt; may be empty, from the
   * \&quot;\&quot; case in &lt;decimalSI&gt;.) &lt;digit&gt; ::&#x3D; 0 | 1 | ... | 9
   * &lt;digits&gt; ::&#x3D; &lt;digit&gt; | &lt;digit&gt;&lt;digits&gt; &lt;number&gt; ::&#x3D;
   * &lt;digits&gt; | &lt;digits&gt;.&lt;digits&gt; | &lt;digits&gt;. | .&lt;digits&gt; &lt;sign&gt;
   * ::&#x3D; \&quot;+\&quot; | \&quot;-\&quot; &lt;signedNumber&gt; ::&#x3D; &lt;number&gt; |
   * &lt;sign&gt;&lt;number&gt; &lt;suffix&gt; ::&#x3D; &lt;binarySI&gt; | &lt;decimalExponent&gt; |
   * &lt;decimalSI&gt; &lt;binarySI&gt; ::&#x3D; Ki | Mi | Gi | Ti | Pi | Ei (International System
   * of units; See: http://physics.nist.gov/cuu/Units/binary.html) &lt;decimalSI&gt; ::&#x3D; m |
   * \&quot;\&quot; | k | M | G | T | P | E (Note that 1024 &#x3D; 1Ki but 1000 &#x3D; 1k; I
   * didn&#39;t choose the capitalization.) &lt;decimalExponent&gt; ::&#x3D; \&quot;e\&quot;
   * &lt;signedNumber&gt; | \&quot;E\&quot; &lt;signedNumber&gt; &#x60;&#x60;&#x60; No matter which
   * of the three exponent forms is used, no quantity may represent a number greater than 2^63-1 in
   * magnitude, nor may it have more than 3 decimal places. Numbers larger or more precise will be
   * capped or rounded up. (E.g.: 0.1m will rounded up to 1m.) This may be extended in the future if
   * we require larger or smaller quantities. When a Quantity is parsed from a string, it will
   * remember the type of suffix it had, and will use the same type again when it is serialized.
   * Before serializing, Quantity will be put in \&quot;canonical form\&quot;. This means that
   * Exponent/suffix will be adjusted up or down (with a corresponding increase or decrease in
   * Mantissa) such that: - No precision is lost - No fractional digits will be emitted - The
   * exponent (or suffix) is as large as possible. The sign will be omitted unless the number is
   * negative. Examples: - 1.5 will be serialized as \&quot;1500m\&quot; - 1.5Gi will be serialized
   * as \&quot;1536Mi\&quot; Note that the quantity will NEVER be internally represented by a
   * floating point number. That is the whole point of this exercise. Non-canonical values will
   * still parse as long as they are well formed, but will be re-emitted in their canonical form.
   * (So always use canonical form, or don&#39;t diff.) This format is intended to make it difficult
   * to use these numbers without writing some sort of special handling code in the hopes that that
   * will cause implementors to also use a fixed point implementation.
   *
   * @return capacity
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Quantity is a fixed-point representation of a number. It provides convenient marshaling/unmarshaling in JSON and YAML, in addition to String() and AsInt64() accessors.  The serialization format is:  ``` <quantity>        ::= <signedNumber><suffix>   (Note that <suffix> may be empty, from the \"\" case in <decimalSI>.)  <digit>           ::= 0 | 1 | ... | 9 <digits>          ::= <digit> | <digit><digits> <number>          ::= <digits> | <digits>.<digits> | <digits>. | .<digits> <sign>            ::= \"+\" | \"-\" <signedNumber>    ::= <number> | <sign><number> <suffix>          ::= <binarySI> | <decimalExponent> | <decimalSI> <binarySI>        ::= Ki | Mi | Gi | Ti | Pi | Ei   (International System of units; See: http://physics.nist.gov/cuu/Units/binary.html)  <decimalSI>       ::= m | \"\" | k | M | G | T | P | E   (Note that 1024 = 1Ki but 1000 = 1k; I didn't choose the capitalization.)  <decimalExponent> ::= \"e\" <signedNumber> | \"E\" <signedNumber> ```  No matter which of the three exponent forms is used, no quantity may represent a number greater than 2^63-1 in magnitude, nor may it have more than 3 decimal places. Numbers larger or more precise will be capped or rounded up. (E.g.: 0.1m will rounded up to 1m.) This may be extended in the future if we require larger or smaller quantities.  When a Quantity is parsed from a string, it will remember the type of suffix it had, and will use the same type again when it is serialized.  Before serializing, Quantity will be put in \"canonical form\". This means that Exponent/suffix will be adjusted up or down (with a corresponding increase or decrease in Mantissa) such that:  - No precision is lost - No fractional digits will be emitted - The exponent (or suffix) is as large as possible.  The sign will be omitted unless the number is negative.  Examples:  - 1.5 will be serialized as \"1500m\" - 1.5Gi will be serialized as \"1536Mi\"  Note that the quantity will NEVER be internally represented by a floating point number. That is the whole point of this exercise.  Non-canonical values will still parse as long as they are well formed, but will be re-emitted in their canonical form. (So always use canonical form, or don't diff.)  This format is intended to make it difficult to use these numbers without writing some sort of special handling code in the hopes that that will cause implementors to also use a fixed point implementation.")
  public Quantity getCapacity() {
    return capacity;
  }

  public void setCapacity(Quantity capacity) {
    this.capacity = capacity;
  }

  public V1CSIStorageCapacity kind(String kind) {

    this.kind = kind;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer
   * this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More
   * info:
   * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   *
   * @return kind
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1CSIStorageCapacity maximumVolumeSize(Quantity maximumVolumeSize) {

    this.maximumVolumeSize = maximumVolumeSize;
    return this;
  }

  /**
   * Quantity is a fixed-point representation of a number. It provides convenient
   * marshaling/unmarshaling in JSON and YAML, in addition to String() and AsInt64() accessors. The
   * serialization format is: &#x60;&#x60;&#x60; &lt;quantity&gt; ::&#x3D;
   * &lt;signedNumber&gt;&lt;suffix&gt; (Note that &lt;suffix&gt; may be empty, from the
   * \&quot;\&quot; case in &lt;decimalSI&gt;.) &lt;digit&gt; ::&#x3D; 0 | 1 | ... | 9
   * &lt;digits&gt; ::&#x3D; &lt;digit&gt; | &lt;digit&gt;&lt;digits&gt; &lt;number&gt; ::&#x3D;
   * &lt;digits&gt; | &lt;digits&gt;.&lt;digits&gt; | &lt;digits&gt;. | .&lt;digits&gt; &lt;sign&gt;
   * ::&#x3D; \&quot;+\&quot; | \&quot;-\&quot; &lt;signedNumber&gt; ::&#x3D; &lt;number&gt; |
   * &lt;sign&gt;&lt;number&gt; &lt;suffix&gt; ::&#x3D; &lt;binarySI&gt; | &lt;decimalExponent&gt; |
   * &lt;decimalSI&gt; &lt;binarySI&gt; ::&#x3D; Ki | Mi | Gi | Ti | Pi | Ei (International System
   * of units; See: http://physics.nist.gov/cuu/Units/binary.html) &lt;decimalSI&gt; ::&#x3D; m |
   * \&quot;\&quot; | k | M | G | T | P | E (Note that 1024 &#x3D; 1Ki but 1000 &#x3D; 1k; I
   * didn&#39;t choose the capitalization.) &lt;decimalExponent&gt; ::&#x3D; \&quot;e\&quot;
   * &lt;signedNumber&gt; | \&quot;E\&quot; &lt;signedNumber&gt; &#x60;&#x60;&#x60; No matter which
   * of the three exponent forms is used, no quantity may represent a number greater than 2^63-1 in
   * magnitude, nor may it have more than 3 decimal places. Numbers larger or more precise will be
   * capped or rounded up. (E.g.: 0.1m will rounded up to 1m.) This may be extended in the future if
   * we require larger or smaller quantities. When a Quantity is parsed from a string, it will
   * remember the type of suffix it had, and will use the same type again when it is serialized.
   * Before serializing, Quantity will be put in \&quot;canonical form\&quot;. This means that
   * Exponent/suffix will be adjusted up or down (with a corresponding increase or decrease in
   * Mantissa) such that: - No precision is lost - No fractional digits will be emitted - The
   * exponent (or suffix) is as large as possible. The sign will be omitted unless the number is
   * negative. Examples: - 1.5 will be serialized as \&quot;1500m\&quot; - 1.5Gi will be serialized
   * as \&quot;1536Mi\&quot; Note that the quantity will NEVER be internally represented by a
   * floating point number. That is the whole point of this exercise. Non-canonical values will
   * still parse as long as they are well formed, but will be re-emitted in their canonical form.
   * (So always use canonical form, or don&#39;t diff.) This format is intended to make it difficult
   * to use these numbers without writing some sort of special handling code in the hopes that that
   * will cause implementors to also use a fixed point implementation.
   *
   * @return maximumVolumeSize
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Quantity is a fixed-point representation of a number. It provides convenient marshaling/unmarshaling in JSON and YAML, in addition to String() and AsInt64() accessors.  The serialization format is:  ``` <quantity>        ::= <signedNumber><suffix>   (Note that <suffix> may be empty, from the \"\" case in <decimalSI>.)  <digit>           ::= 0 | 1 | ... | 9 <digits>          ::= <digit> | <digit><digits> <number>          ::= <digits> | <digits>.<digits> | <digits>. | .<digits> <sign>            ::= \"+\" | \"-\" <signedNumber>    ::= <number> | <sign><number> <suffix>          ::= <binarySI> | <decimalExponent> | <decimalSI> <binarySI>        ::= Ki | Mi | Gi | Ti | Pi | Ei   (International System of units; See: http://physics.nist.gov/cuu/Units/binary.html)  <decimalSI>       ::= m | \"\" | k | M | G | T | P | E   (Note that 1024 = 1Ki but 1000 = 1k; I didn't choose the capitalization.)  <decimalExponent> ::= \"e\" <signedNumber> | \"E\" <signedNumber> ```  No matter which of the three exponent forms is used, no quantity may represent a number greater than 2^63-1 in magnitude, nor may it have more than 3 decimal places. Numbers larger or more precise will be capped or rounded up. (E.g.: 0.1m will rounded up to 1m.) This may be extended in the future if we require larger or smaller quantities.  When a Quantity is parsed from a string, it will remember the type of suffix it had, and will use the same type again when it is serialized.  Before serializing, Quantity will be put in \"canonical form\". This means that Exponent/suffix will be adjusted up or down (with a corresponding increase or decrease in Mantissa) such that:  - No precision is lost - No fractional digits will be emitted - The exponent (or suffix) is as large as possible.  The sign will be omitted unless the number is negative.  Examples:  - 1.5 will be serialized as \"1500m\" - 1.5Gi will be serialized as \"1536Mi\"  Note that the quantity will NEVER be internally represented by a floating point number. That is the whole point of this exercise.  Non-canonical values will still parse as long as they are well formed, but will be re-emitted in their canonical form. (So always use canonical form, or don't diff.)  This format is intended to make it difficult to use these numbers without writing some sort of special handling code in the hopes that that will cause implementors to also use a fixed point implementation.")
  public Quantity getMaximumVolumeSize() {
    return maximumVolumeSize;
  }

  public void setMaximumVolumeSize(Quantity maximumVolumeSize) {
    this.maximumVolumeSize = maximumVolumeSize;
  }

  public V1CSIStorageCapacity metadata(V1ObjectMeta metadata) {

    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   *
   * @return metadata
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public V1CSIStorageCapacity nodeTopology(V1LabelSelector nodeTopology) {

    this.nodeTopology = nodeTopology;
    return this;
  }

  /**
   * Get nodeTopology
   *
   * @return nodeTopology
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1LabelSelector getNodeTopology() {
    return nodeTopology;
  }

  public void setNodeTopology(V1LabelSelector nodeTopology) {
    this.nodeTopology = nodeTopology;
  }

  public V1CSIStorageCapacity storageClassName(String storageClassName) {

    this.storageClassName = storageClassName;
    return this;
  }

  /**
   * The name of the StorageClass that the reported capacity applies to. It must meet the same
   * requirements as the name of a StorageClass object (non-empty, DNS subdomain). If that object no
   * longer exists, the CSIStorageCapacity object is obsolete and should be removed by its creator.
   * This field is immutable.
   *
   * @return storageClassName
   */
  @ApiModelProperty(
      required = true,
      value =
          "The name of the StorageClass that the reported capacity applies to. It must meet the same requirements as the name of a StorageClass object (non-empty, DNS subdomain). If that object no longer exists, the CSIStorageCapacity object is obsolete and should be removed by its creator. This field is immutable.")
  public String getStorageClassName() {
    return storageClassName;
  }

  public void setStorageClassName(String storageClassName) {
    this.storageClassName = storageClassName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CSIStorageCapacity v1CSIStorageCapacity = (V1CSIStorageCapacity) o;
    return Objects.equals(this.apiVersion, v1CSIStorageCapacity.apiVersion)
        && Objects.equals(this.capacity, v1CSIStorageCapacity.capacity)
        && Objects.equals(this.kind, v1CSIStorageCapacity.kind)
        && Objects.equals(this.maximumVolumeSize, v1CSIStorageCapacity.maximumVolumeSize)
        && Objects.equals(this.metadata, v1CSIStorageCapacity.metadata)
        && Objects.equals(this.nodeTopology, v1CSIStorageCapacity.nodeTopology)
        && Objects.equals(this.storageClassName, v1CSIStorageCapacity.storageClassName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        apiVersion, capacity, kind, maximumVolumeSize, metadata, nodeTopology, storageClassName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CSIStorageCapacity {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    maximumVolumeSize: ").append(toIndentedString(maximumVolumeSize)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    nodeTopology: ").append(toIndentedString(nodeTopology)).append("\n");
    sb.append("    storageClassName: ").append(toIndentedString(storageClassName)).append("\n");
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
