/*
Copyright 2020 The Kubernetes Authors.
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
package io.kubernetes.client;

import com.google.common.io.CharStreams;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1ConfigMap;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.util.exception.CreateConfigmapException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Response;

/** Utility class to create Configmaps */
public class Configmap {

  private ApiClient apiClient;
  private CoreV1Api coreClient;

  public Configmap() {
    this(Configuration.getDefaultApiClient());
  }

  public Configmap(ApiClient apiClient) {
    this.apiClient = apiClient;
    this.coreClient = new CoreV1Api(apiClient);
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Method to create a Configmap from a file. The file should contain key-value pairs
   *
   * @param namespace
   * @param name
   * @param file
   * @throws IOException
   * @throws CreateConfigmapException
   * @throws ApiException
   */
  public void createFromFile(String namespace, String name, Path file)
      throws IOException, CreateConfigmapException, ApiException {
    if (Files.isRegularFile(file)) {
      try (BufferedReader bufferedReader =
          new BufferedReader(new FileReader(String.valueOf(file)))) {
        createFromReader(namespace, name, bufferedReader);
      }
    } else {
      throw new CreateConfigmapException("Target path is a directory");
    }
  }

  /**
   * To create Configmap by passing InputStream of a file which has key value pairs
   *
   * @param namespace
   * @param name
   * @param stream
   * @throws IOException
   * @throws CreateConfigmapException
   * @throws ApiException
   */
  public void createFromStream(String namespace, String name, InputStream stream)
      throws IOException, CreateConfigmapException, ApiException {
    createFromReader(namespace, name, new InputStreamReader(stream));
  }

  /**
   * To creat Configmap by passing string literal. Value should be a string in the form "key=value"
   *
   * @param namespace
   * @param name
   * @param value
   * @throws IOException
   * @throws CreateConfigmapException
   * @throws ApiException
   */
  public void createFromString(String namespace, String name, String value)
      throws IOException, CreateConfigmapException, ApiException {
    createFromReader(namespace, name, new StringReader(value));
  }

  /**
   * To create Configmap by passing Reader of a file which has key value pairs
   *
   * @param namespace
   * @param name
   * @param reader
   * @throws IOException
   * @throws CreateConfigmapException
   * @throws ApiException
   */
  public void createFromReader(String namespace, String name, Reader reader)
      throws IOException, CreateConfigmapException, ApiException {
    if (reader != null) {
      if (name != null && !name.isEmpty()) {
        V1ConfigMap v1ConfigMap = createConfigmapObject(name);
        byte[] data = CharStreams.toString(reader).getBytes();
        if (isValidUtf8(data)) {
          Map<String, String> dataMap = new HashMap<>();
          dataMap.put(name, new String(data));
          v1ConfigMap.setData(dataMap);
        } else {
          // populate base64 binary data in V1ConfigMap
          Map<String, byte[]> binMap = new HashMap<>();
          binMap.put(name, Base64.getEncoder().encode(data));
        }
        createConfigmap(namespace, v1ConfigMap);
      } else {
        throw new CreateConfigmapException("Invalid Configmap name.");
      }
    } else {
      throw new CreateConfigmapException("Reader object is null.");
    }
  }

  /**
   * Helper method to create request object to create Configmap.
   *
   * @param configmapName
   * @return
   */
  private V1ConfigMap createConfigmapObject(String configmapName) {
    V1ConfigMap v1ConfigMap = new V1ConfigMap();
    V1ObjectMeta metadata = new V1ObjectMeta();
    metadata.setName(configmapName);
    v1ConfigMap.setKind("ConfigMap");
    v1ConfigMap.setApiVersion("v1");
    v1ConfigMap.setMetadata(metadata);
    return v1ConfigMap;
  }

  /**
   * This method makes API call to K8 server to create configmap
   *
   * @param namespace
   * @param v1ConfigMap
   * @throws IOException
   * @throws ApiException
   */
  private void createConfigmap(String namespace, V1ConfigMap v1ConfigMap)
      throws IOException, ApiException {
    Call call =
        coreClient.createNamespacedConfigMapCall(namespace, v1ConfigMap, "false", null, null, null);
    try (Response response = call.execute()) {
      if (!response.isSuccessful()) {
        throw new ApiException(
            response.code(),
            "Request to create Configmap failed with error code: " + response.code());
      }
    }
  }

  /**
   * Helper method to test if the byte array contains valid UTF-8 data
   *
   * @param byteArr
   * @return
   */
  private boolean isValidUtf8(byte[] byteArr) {
    CharsetDecoder decoder = StandardCharsets.UTF_8.newDecoder();
    try {
      decoder.decode(ByteBuffer.wrap(byteArr));
    } catch (CharacterCodingException ex) {
      return false;
    }
    return true;
  }
}
