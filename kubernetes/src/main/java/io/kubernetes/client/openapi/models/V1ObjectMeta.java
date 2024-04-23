/*
Copyright 2024 The Kubernetes Authors.
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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1ManagedFieldsEntry;
import io.kubernetes.client.openapi.models.V1OwnerReference;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * ObjectMeta is metadata that all persisted resources must have, which includes all objects users must create.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1ObjectMeta {
  public static final String SERIALIZED_NAME_ANNOTATIONS = "annotations";
  @SerializedName(SERIALIZED_NAME_ANNOTATIONS)
  private Map<String, String> annotations = new HashMap<>();

  public static final String SERIALIZED_NAME_CREATION_TIMESTAMP = "creationTimestamp";
  @SerializedName(SERIALIZED_NAME_CREATION_TIMESTAMP)
  private OffsetDateTime creationTimestamp;

  public static final String SERIALIZED_NAME_DELETION_GRACE_PERIOD_SECONDS = "deletionGracePeriodSeconds";
  @SerializedName(SERIALIZED_NAME_DELETION_GRACE_PERIOD_SECONDS)
  private Long deletionGracePeriodSeconds;

  public static final String SERIALIZED_NAME_DELETION_TIMESTAMP = "deletionTimestamp";
  @SerializedName(SERIALIZED_NAME_DELETION_TIMESTAMP)
  private OffsetDateTime deletionTimestamp;

  public static final String SERIALIZED_NAME_FINALIZERS = "finalizers";
  @SerializedName(SERIALIZED_NAME_FINALIZERS)
  private List<String> finalizers;

  public static final String SERIALIZED_NAME_GENERATE_NAME = "generateName";
  @SerializedName(SERIALIZED_NAME_GENERATE_NAME)
  private String generateName;

  public static final String SERIALIZED_NAME_GENERATION = "generation";
  @SerializedName(SERIALIZED_NAME_GENERATION)
  private Long generation;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = new HashMap<>();

  public static final String SERIALIZED_NAME_MANAGED_FIELDS = "managedFields";
  @SerializedName(SERIALIZED_NAME_MANAGED_FIELDS)
  private List<V1ManagedFieldsEntry> managedFields;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_OWNER_REFERENCES = "ownerReferences";
  @SerializedName(SERIALIZED_NAME_OWNER_REFERENCES)
  private List<V1OwnerReference> ownerReferences;

  public static final String SERIALIZED_NAME_RESOURCE_VERSION = "resourceVersion";
  @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION)
  private String resourceVersion;

  public static final String SERIALIZED_NAME_SELF_LINK = "selfLink";
  @SerializedName(SERIALIZED_NAME_SELF_LINK)
  private String selfLink;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public V1ObjectMeta() {
  }

  public V1ObjectMeta annotations(Map<String, String> annotations) {

    this.annotations = annotations;
    return this;
  }

  public V1ObjectMeta putAnnotationsItem(String key, String annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new HashMap<>();
    }
    this.annotations.put(key, annotationsItem);
    return this;
  }

   /**
   * Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata. They are not queryable and should be preserved when modifying objects. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/annotations
   * @return annotations
  **/
  @jakarta.annotation.Nullable
  public Map<String, String> getAnnotations() {
    return annotations;
  }


  public void setAnnotations(Map<String, String> annotations) {
    this.annotations = annotations;
  }


  public V1ObjectMeta creationTimestamp(OffsetDateTime creationTimestamp) {

    this.creationTimestamp = creationTimestamp;
    return this;
  }

   /**
   * CreationTimestamp is a timestamp representing the server time when this object was created. It is not guaranteed to be set in happens-before order across separate operations. Clients may not set this value. It is represented in RFC3339 form and is in UTC.  Populated by the system. Read-only. Null for lists. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
   * @return creationTimestamp
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getCreationTimestamp() {
    return creationTimestamp;
  }


  public void setCreationTimestamp(OffsetDateTime creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
  }


  public V1ObjectMeta deletionGracePeriodSeconds(Long deletionGracePeriodSeconds) {

    this.deletionGracePeriodSeconds = deletionGracePeriodSeconds;
    return this;
  }

   /**
   * Number of seconds allowed for this object to gracefully terminate before it will be removed from the system. Only set when deletionTimestamp is also set. May only be shortened. Read-only.
   * @return deletionGracePeriodSeconds
  **/
  @jakarta.annotation.Nullable
  public Long getDeletionGracePeriodSeconds() {
    return deletionGracePeriodSeconds;
  }


  public void setDeletionGracePeriodSeconds(Long deletionGracePeriodSeconds) {
    this.deletionGracePeriodSeconds = deletionGracePeriodSeconds;
  }


  public V1ObjectMeta deletionTimestamp(OffsetDateTime deletionTimestamp) {

    this.deletionTimestamp = deletionTimestamp;
    return this;
  }

   /**
   * DeletionTimestamp is RFC 3339 date and time at which this resource will be deleted. This field is set by the server when a graceful deletion is requested by the user, and is not directly settable by a client. The resource is expected to be deleted (no longer visible from resource lists, and not reachable by name) after the time in this field, once the finalizers list is empty. As long as the finalizers list contains items, deletion is blocked. Once the deletionTimestamp is set, this value may not be unset or be set further into the future, although it may be shortened or the resource may be deleted prior to this time. For example, a user may request that a pod is deleted in 30 seconds. The Kubelet will react by sending a graceful termination signal to the containers in the pod. After that 30 seconds, the Kubelet will send a hard termination signal (SIGKILL) to the container and after cleanup, remove the pod from the API. In the presence of network partitions, this object may still exist after this timestamp, until an administrator or automated process can determine the resource is fully terminated. If not set, graceful deletion of the object has not been requested.  Populated by the system when a graceful deletion is requested. Read-only. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
   * @return deletionTimestamp
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getDeletionTimestamp() {
    return deletionTimestamp;
  }


  public void setDeletionTimestamp(OffsetDateTime deletionTimestamp) {
    this.deletionTimestamp = deletionTimestamp;
  }


  public V1ObjectMeta finalizers(List<String> finalizers) {

    this.finalizers = finalizers;
    return this;
  }

  public V1ObjectMeta addFinalizersItem(String finalizersItem) {
    if (this.finalizers == null) {
      this.finalizers = new ArrayList<>();
    }
    this.finalizers.add(finalizersItem);
    return this;
  }

   /**
   * Must be empty before the object is deleted from the registry. Each entry is an identifier for the responsible component that will remove the entry from the list. If the deletionTimestamp of the object is non-nil, entries in this list can only be removed. Finalizers may be processed and removed in any order.  Order is NOT enforced because it introduces significant risk of stuck finalizers. finalizers is a shared field, any actor with permission can reorder it. If the finalizer list is processed in order, then this can lead to a situation in which the component responsible for the first finalizer in the list is waiting for a signal (field value, external system, or other) produced by a component responsible for a finalizer later in the list, resulting in a deadlock. Without enforced ordering finalizers are free to order amongst themselves and are not vulnerable to ordering changes in the list.
   * @return finalizers
  **/
  @jakarta.annotation.Nullable
  public List<String> getFinalizers() {
    return finalizers;
  }


  public void setFinalizers(List<String> finalizers) {
    this.finalizers = finalizers;
  }


  public V1ObjectMeta generateName(String generateName) {

    this.generateName = generateName;
    return this;
  }

   /**
   * GenerateName is an optional prefix, used by the server, to generate a unique name ONLY IF the Name field has not been provided. If this field is used, the name returned to the client will be different than the name passed. This value will also be combined with a unique suffix. The provided value has the same validation rules as the Name field, and may be truncated by the length of the suffix required to make the value unique on the server.  If this field is specified and the generated name exists, the server will return a 409.  Applied only if Name is not specified. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#idempotency
   * @return generateName
  **/
  @jakarta.annotation.Nullable
  public String getGenerateName() {
    return generateName;
  }


  public void setGenerateName(String generateName) {
    this.generateName = generateName;
  }


  public V1ObjectMeta generation(Long generation) {

    this.generation = generation;
    return this;
  }

   /**
   * A sequence number representing a specific generation of the desired state. Populated by the system. Read-only.
   * @return generation
  **/
  @jakarta.annotation.Nullable
  public Long getGeneration() {
    return generation;
  }


  public void setGeneration(Long generation) {
    this.generation = generation;
  }


  public V1ObjectMeta labels(Map<String, String> labels) {

    this.labels = labels;
    return this;
  }

  public V1ObjectMeta putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * Map of string keys and values that can be used to organize and categorize (scope and select) objects. May match selectors of replication controllers and services. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels
   * @return labels
  **/
  @jakarta.annotation.Nullable
  public Map<String, String> getLabels() {
    return labels;
  }


  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public V1ObjectMeta managedFields(List<V1ManagedFieldsEntry> managedFields) {

    this.managedFields = managedFields;
    return this;
  }

  public V1ObjectMeta addManagedFieldsItem(V1ManagedFieldsEntry managedFieldsItem) {
    if (this.managedFields == null) {
      this.managedFields = new ArrayList<>();
    }
    this.managedFields.add(managedFieldsItem);
    return this;
  }

   /**
   * ManagedFields maps workflow-id and version to the set of fields that are managed by that workflow. This is mostly for internal housekeeping, and users typically shouldn&#39;t need to set or understand this field. A workflow can be the user&#39;s name, a controller&#39;s name, or the name of a specific apply path like \&quot;ci-cd\&quot;. The set of fields is always in the version that the workflow used when modifying the object.
   * @return managedFields
  **/
  @jakarta.annotation.Nullable
  public List<V1ManagedFieldsEntry> getManagedFields() {
    return managedFields;
  }


  public void setManagedFields(List<V1ManagedFieldsEntry> managedFields) {
    this.managedFields = managedFields;
  }


  public V1ObjectMeta name(String name) {

    this.name = name;
    return this;
  }

   /**
   * Name must be unique within a namespace. Is required when creating resources, although some resources may allow a client to request the generation of an appropriate name automatically. Name is primarily intended for creation idempotence and configuration definition. Cannot be updated. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names#names
   * @return name
  **/
  @jakarta.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1ObjectMeta namespace(String namespace) {

    this.namespace = namespace;
    return this;
  }

   /**
   * Namespace defines the space within which each name must be unique. An empty namespace is equivalent to the \&quot;default\&quot; namespace, but \&quot;default\&quot; is the canonical representation. Not all objects are required to be scoped to a namespace - the value of this field for those objects will be empty.  Must be a DNS_LABEL. Cannot be updated. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces
   * @return namespace
  **/
  @jakarta.annotation.Nullable
  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public V1ObjectMeta ownerReferences(List<V1OwnerReference> ownerReferences) {

    this.ownerReferences = ownerReferences;
    return this;
  }

  public V1ObjectMeta addOwnerReferencesItem(V1OwnerReference ownerReferencesItem) {
    if (this.ownerReferences == null) {
      this.ownerReferences = new ArrayList<>();
    }
    this.ownerReferences.add(ownerReferencesItem);
    return this;
  }

   /**
   * List of objects depended by this object. If ALL objects in the list have been deleted, this object will be garbage collected. If this object is managed by a controller, then an entry in this list will point to this controller, with the controller field set to true. There cannot be more than one managing controller.
   * @return ownerReferences
  **/
  @jakarta.annotation.Nullable
  public List<V1OwnerReference> getOwnerReferences() {
    return ownerReferences;
  }


  public void setOwnerReferences(List<V1OwnerReference> ownerReferences) {
    this.ownerReferences = ownerReferences;
  }


  public V1ObjectMeta resourceVersion(String resourceVersion) {

    this.resourceVersion = resourceVersion;
    return this;
  }

   /**
   * An opaque value that represents the internal version of this object that can be used by clients to determine when objects have changed. May be used for optimistic concurrency, change detection, and the watch operation on a resource or set of resources. Clients must treat these values as opaque and passed unmodified back to the server. They may only be valid for a particular resource or set of resources.  Populated by the system. Read-only. Value must be treated as opaque by clients and . More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
   * @return resourceVersion
  **/
  @jakarta.annotation.Nullable
  public String getResourceVersion() {
    return resourceVersion;
  }


  public void setResourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
  }


  public V1ObjectMeta selfLink(String selfLink) {

    this.selfLink = selfLink;
    return this;
  }

   /**
   * Deprecated: selfLink is a legacy read-only field that is no longer populated by the system.
   * @return selfLink
  **/
  @jakarta.annotation.Nullable
  public String getSelfLink() {
    return selfLink;
  }


  public void setSelfLink(String selfLink) {
    this.selfLink = selfLink;
  }


  public V1ObjectMeta uid(String uid) {

    this.uid = uid;
    return this;
  }

   /**
   * UID is the unique in time and space value for this object. It is typically generated by the server on successful creation of a resource and is not allowed to change on PUT operations.  Populated by the system. Read-only. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names#uids
   * @return uid
  **/
  @jakarta.annotation.Nullable
  public String getUid() {
    return uid;
  }


  public void setUid(String uid) {
    this.uid = uid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ObjectMeta v1ObjectMeta = (V1ObjectMeta) o;
    return Objects.equals(this.annotations, v1ObjectMeta.annotations) &&
        Objects.equals(this.creationTimestamp, v1ObjectMeta.creationTimestamp) &&
        Objects.equals(this.deletionGracePeriodSeconds, v1ObjectMeta.deletionGracePeriodSeconds) &&
        Objects.equals(this.deletionTimestamp, v1ObjectMeta.deletionTimestamp) &&
        Objects.equals(this.finalizers, v1ObjectMeta.finalizers) &&
        Objects.equals(this.generateName, v1ObjectMeta.generateName) &&
        Objects.equals(this.generation, v1ObjectMeta.generation) &&
        Objects.equals(this.labels, v1ObjectMeta.labels) &&
        Objects.equals(this.managedFields, v1ObjectMeta.managedFields) &&
        Objects.equals(this.name, v1ObjectMeta.name) &&
        Objects.equals(this.namespace, v1ObjectMeta.namespace) &&
        Objects.equals(this.ownerReferences, v1ObjectMeta.ownerReferences) &&
        Objects.equals(this.resourceVersion, v1ObjectMeta.resourceVersion) &&
        Objects.equals(this.selfLink, v1ObjectMeta.selfLink) &&
        Objects.equals(this.uid, v1ObjectMeta.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, creationTimestamp, deletionGracePeriodSeconds, deletionTimestamp, finalizers, generateName, generation, labels, managedFields, name, namespace, ownerReferences, resourceVersion, selfLink, uid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ObjectMeta {\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
    sb.append("    deletionGracePeriodSeconds: ").append(toIndentedString(deletionGracePeriodSeconds)).append("\n");
    sb.append("    deletionTimestamp: ").append(toIndentedString(deletionTimestamp)).append("\n");
    sb.append("    finalizers: ").append(toIndentedString(finalizers)).append("\n");
    sb.append("    generateName: ").append(toIndentedString(generateName)).append("\n");
    sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    managedFields: ").append(toIndentedString(managedFields)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    ownerReferences: ").append(toIndentedString(ownerReferences)).append("\n");
    sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
    sb.append("    selfLink: ").append(toIndentedString(selfLink)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
    openapiFields.add("annotations");
    openapiFields.add("creationTimestamp");
    openapiFields.add("deletionGracePeriodSeconds");
    openapiFields.add("deletionTimestamp");
    openapiFields.add("finalizers");
    openapiFields.add("generateName");
    openapiFields.add("generation");
    openapiFields.add("labels");
    openapiFields.add("managedFields");
    openapiFields.add("name");
    openapiFields.add("namespace");
    openapiFields.add("ownerReferences");
    openapiFields.add("resourceVersion");
    openapiFields.add("selfLink");
    openapiFields.add("uid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1ObjectMeta
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1ObjectMeta.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ObjectMeta is not found in the empty JSON string", V1ObjectMeta.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1ObjectMeta.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ObjectMeta` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("finalizers") != null && !jsonObj.get("finalizers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `finalizers` to be an array in the JSON string but got `%s`", jsonObj.get("finalizers").toString()));
      }
      if ((jsonObj.get("generateName") != null && !jsonObj.get("generateName").isJsonNull()) && !jsonObj.get("generateName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `generateName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("generateName").toString()));
      }
      if (jsonObj.get("managedFields") != null && !jsonObj.get("managedFields").isJsonNull()) {
        JsonArray jsonArraymanagedFields = jsonObj.getAsJsonArray("managedFields");
        if (jsonArraymanagedFields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("managedFields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `managedFields` to be an array in the JSON string but got `%s`", jsonObj.get("managedFields").toString()));
          }

          // validate the optional field `managedFields` (array)
          for (int i = 0; i < jsonArraymanagedFields.size(); i++) {
            V1ManagedFieldsEntry.validateJsonObject(jsonArraymanagedFields.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
      if (jsonObj.get("ownerReferences") != null && !jsonObj.get("ownerReferences").isJsonNull()) {
        JsonArray jsonArrayownerReferences = jsonObj.getAsJsonArray("ownerReferences");
        if (jsonArrayownerReferences != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ownerReferences").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ownerReferences` to be an array in the JSON string but got `%s`", jsonObj.get("ownerReferences").toString()));
          }

          // validate the optional field `ownerReferences` (array)
          for (int i = 0; i < jsonArrayownerReferences.size(); i++) {
            V1OwnerReference.validateJsonObject(jsonArrayownerReferences.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("resourceVersion") != null && !jsonObj.get("resourceVersion").isJsonNull()) && !jsonObj.get("resourceVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourceVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resourceVersion").toString()));
      }
      if ((jsonObj.get("selfLink") != null && !jsonObj.get("selfLink").isJsonNull()) && !jsonObj.get("selfLink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `selfLink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("selfLink").toString()));
      }
      if ((jsonObj.get("uid") != null && !jsonObj.get("uid").isJsonNull()) && !jsonObj.get("uid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ObjectMeta.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ObjectMeta' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ObjectMeta> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ObjectMeta.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ObjectMeta>() {
           @Override
           public void write(JsonWriter out, V1ObjectMeta value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ObjectMeta read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1ObjectMeta given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1ObjectMeta
  * @throws IOException if the JSON string is invalid with respect to V1ObjectMeta
  */
  public static V1ObjectMeta fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ObjectMeta.class);
  }

 /**
  * Convert an instance of V1ObjectMeta to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
