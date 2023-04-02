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
package io.kubernetes.client.util.generic.dynamic;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import io.kubernetes.client.common.KubernetesListObject;
import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.util.generic.GenericKubernetesApi;

/**
 * DynamicKubernetesApi can be used for reading and writing arbitrary resources without knowing it's
 * java definitions.
 */
public class DynamicKubernetesApi
    extends GenericKubernetesApi<DynamicKubernetesObject, DynamicKubernetesListObject> {

  private final Gson gson;

  /**
   * Instantiates a new Dynamic kubernetes api.
   *
   * @param apiGroup the api group
   * @param apiVersion the api version
   * @param resourcePlural the resource plural
   * @param apiClient the api client
   */
  public DynamicKubernetesApi(
      String apiGroup, String apiVersion, String resourcePlural, ApiClient apiClient) {
    super(
        DynamicKubernetesObject.class,
        DynamicKubernetesListObject.class,
        apiGroup,
        apiVersion,
        resourcePlural,
        apiClient);
    TypeAdapter<KubernetesObject> objAdapter =
        apiClient.getJSON().getGson().getAdapter(KubernetesObject.class);
    TypeAdapter<KubernetesListObject> objListAdapter =
        apiClient.getJSON().getGson().getAdapter(KubernetesListObject.class);
    if (!DynamicKubernetesTypeAdaptorFactory.GenericListObjectCreator.class.equals(
            objListAdapter.getClass())
        || !DynamicKubernetesTypeAdaptorFactory.GenericObjectCreator.class.equals(
            objAdapter.getClass())) {
      apiClient
          .getJSON()
          .setGson(
              apiClient
                  .getJSON()
                  .getGson()
                  .newBuilder()
                  .registerTypeAdapterFactory(new DynamicKubernetesTypeAdaptorFactory())
                  .create());
    }
    gson = apiClient.getJSON().getGson();
  }

  /**
   * Gets gson instance.
   *
   * @return the gson
   */
  public Gson getGson() {
    return gson;
  }
}
