/*
Copyright 2019 The Kubernetes Authors.
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
package io.kubernetes.client.leaderelection.resourcelock;

import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.squareup.okhttp.Call;
import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ApiException;
import io.kubernetes.client.ApiResponse;
import io.kubernetes.client.leaderelection.LeaderElectionRecord;

import java.util.HashMap;
import java.util.Map;

public class ResourceLock implements Lock {

  private static final String METADATA = "metadata";
  private static final String ANNOTATIONS = "annotations";

  private final String name;
  private final String namespace;

  private final ApiClient client;
  private final String apiVersion;
  private final String kind;
  private final String type;

  private final ResourceLockConfig resourceLockConfig;
  private JsonObject object;

  public ResourceLock(String name, String namespace, ApiClient client, String apiVersion,
      String kind, String type,
      ResourceLockConfig resourceLockConfig) {
    this.name = name;
    this.namespace = namespace;
    this.client = client;
    this.apiVersion = apiVersion;
    this.kind = kind;
    this.type = type;
    this.resourceLockConfig = resourceLockConfig;
  }

  private String getRootUrl() {
    return String.format("/api/%s/namespaces/%s/%s",
        client.escapeString(apiVersion),
        client.escapeString(namespace),
        client.escapeString(type));
  }

  private Map<String, String> getHeaders() {
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    final String[] localVarAccepts = {
        "application/json", "application/yaml", "application/vnd.kubernetes.protobuf"
    };
    final String localVarAccept = client.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {
        "*/*"
    };
    final String localVarContentType = client.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    return localVarHeaderParams;
  }

  private String[] getAuthNames() {
    return new String[]{"BearerToken"};
  }

  /**
   * Get returns the election record from a ConfigMap Annotation
   */
  @Override
  public LeaderElectionRecord get() throws ApiException {
    LeaderElectionRecord leaderElectionRecord = null;
    String url = String.format("%s/%s", getRootUrl(), client.escapeString(name));
    Call call = client.buildCall(url, "GET", null, null, null,
        getHeaders(), null, getAuthNames(), null);
    try {
      ApiResponse<JsonObject> response = client.execute(call, new TypeToken<JsonObject>() {
      }.getType());
      object = response.getData();
    } catch (ApiException e) {
      if (e.getCode() == 404) {
        throw new ResourceNotFoundException(url);
      }
    }
    if (object.has(METADATA)) {
      JsonObject meta = object.getAsJsonObject(METADATA);
      if (!meta.has(ANNOTATIONS)) {
        JsonObject annotations = new JsonObject();
        meta.add(ANNOTATIONS, annotations);
      }
      JsonObject annotations = meta.getAsJsonObject(ANNOTATIONS);
      if (annotations.has(LeaderElectionRecordAnnotationKey)) {
        leaderElectionRecord = client.getJSON().deserialize(
            annotations.get(LeaderElectionRecordAnnotationKey).getAsString(),
            LeaderElectionRecord.class);
      }
    }
    return leaderElectionRecord;
  }

  /**
   * build Resource Object with Leader Election annotation
   *
   * @param json leader election annotation value
   * @return JsonObject
   */
  private JsonObject getObject(String json) {
    JsonObject annotations = new JsonObject();
    annotations.addProperty(LeaderElectionRecordAnnotationKey, json);
    JsonObject metadata = new JsonObject();
    if (name != null) {
      metadata.addProperty("name", name);
    }
    metadata.add(ANNOTATIONS, annotations);
    JsonObject cm = new JsonObject();
    cm.addProperty("apiVersion", apiVersion);
    cm.addProperty("kind", kind);
    cm.add(METADATA, metadata);
    return cm;
  }

  /**
   * Create attempts to create a LeaderElectionRecord annotation
   */
  @Override
  public void create(LeaderElectionRecord leaderElectionRecord) throws ApiException {
    String json = client.getJSON().serialize(leaderElectionRecord);
    JsonObject cm = getObject(json);

    String url = getRootUrl();
    Call call = client.buildCall(url, "POST", null, null, cm, getHeaders(),
        null, getAuthNames(), null);
    ApiResponse<JsonObject> response = client.execute(call, new TypeToken<JsonObject>() {
    }.getType());
    object = response.getData();
  }

  /**
   * Update will update an existing annotation on a given resource.
   */
  @Override
  public void update(LeaderElectionRecord leaderElectionRecord) throws ApiException {
    if (object == null) {
      throw new ApiException("configmap not initialized, call get or create first");
    }
    String json = client.getJSON().serialize(leaderElectionRecord);
    JsonObject cm = getObject(json);
    String url = String.format("%s/%s", getRootUrl(), client.escapeString(name));
    Call call = client.buildCall(url, "PUT", null, null, cm, getHeaders(),
        null, getAuthNames(), null);
    ApiResponse<JsonObject> response = client.execute(call, new TypeToken<JsonObject>() {
    }.getType());
    object = response.getData();
  }

  /**
   * RecordEvent in leader election while adding meta-data
   */
  @Override
  public void recordEvent(String s) {
    // TODO: not implement
    return;
  }

  /**
   * Describe is used to convert details on current resource lock into a string
   */
  @Override
  public String describe() {
    return String.format("%s/%s", namespace, name);
  }

  /**
   * @return the Identity of the lock
   */
  @Override
  public String identity() {
    return resourceLockConfig.getIdentity();
  }
}
