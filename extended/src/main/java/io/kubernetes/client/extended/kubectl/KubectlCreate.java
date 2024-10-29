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
package io.kubernetes.client.extended.kubectl;

import io.kubernetes.client.Discovery;
import io.kubernetes.client.common.KubernetesListObject;
import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.apis.CustomObjectsApi;
import io.kubernetes.client.util.ModelMapper;
import io.kubernetes.client.util.Namespaces;
import io.kubernetes.client.util.Strings;
import io.kubernetes.client.util.Yaml;
import io.kubernetes.client.util.Config;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import io.kubernetes.client.util.generic.KubernetesApiResponse;
import io.kubernetes.client.util.generic.options.CreateOptions;

import java.io.Reader;
import java.text.ParseException;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class KubectlCreate<ApiType extends KubernetesObject>
    extends Kubectl.ResourceBuilder<ApiType, KubectlCreate<ApiType>>
    implements Kubectl.Executable<ApiType> {

  KubectlCreate(Class<ApiType> apiTypeClass) {
    super(apiTypeClass);
  }

  private ApiType targetObj;

  public KubectlCreate<ApiType> resource(ApiType obj) {
    this.targetObj = obj;
    return this;
  }

  @Override
  public ApiType execute() throws KubectlException {
    refreshDiscovery();

    GenericKubernetesApi<ApiType, KubernetesListObject> api = getGenericApi();

    if (ModelMapper.isNamespaced(this.targetObj.getClass())) {
      String targetNamespace =
          namespace != null
              ? namespace
              : Strings.isNullOrEmpty(targetObj.getMetadata().getNamespace())
                  ? Namespaces.NAMESPACE_DEFAULT
                  : targetObj.getMetadata().getNamespace();
      try {
        return api.create(targetNamespace, targetObj, new CreateOptions())
            .throwsApiException()
            .getObject();
      } catch (ApiException e) {
        throw new KubectlException(e);
      }
    } else {
      try {
        return api.create(targetObj, new CreateOptions()).throwsApiException().getObject();
      } catch (ApiException e) {
        throw new KubectlException(e);
      }
    }
  }
  /**
   * Loads an API object from a YAML string representation without knowing the object type
   * and submits any type of resource.
   *
   * Note: This method works for single-instance YAML files only.
   * If the YAML contains multiple resources, it will fail.
   * Support for multiple resources in a single YAML file is not implemented yet.
   *
   * @param content The YAML content as a Reader
   * @return The created resource object
   * @throws Exception If there is an error in parsing and submitting resources.
   */
  public static Object loadAndSubmitResource(Reader content) throws Exception {
    // Initialize the API client and Discovery instance
    ApiClient client = Configuration.getDefaultApiClient();
    Discovery discovery = new Discovery(client);

    // Load the YAML content as an unstructured object
    Object unstructuredObject = Yaml.load(content);

    // Ensure the unstructured object is a Map
    if (!(unstructuredObject instanceof Map)) {
      throw new ParseException("Invalid YAML", 0);
    }

    // Typecasting the unstructured object to a Map
    Map<String, Object> yamlMap = (Map<String, Object>) unstructuredObject;

    // Getting apiVersion and kind
    String apiVersion = (String) yamlMap.get("apiVersion");
    String kind = (String) yamlMap.get("kind");

    // Validate apiVersion and kind
    if (apiVersion == null || kind == null) {
      throw new ParseException("YAML does not contain apiVersion or kind", 0);
    }

    // Finding the resource in the discovery class
    Set<Discovery.APIResource> resources = discovery.findAll();
    Optional<Discovery.APIResource> apiResource = resources.stream()
            .filter(r -> r.getKind().equalsIgnoreCase(kind)
                    && r.getVersions().stream().anyMatch(v -> v.equalsIgnoreCase(apiVersion))
                    && (r.getGroup() == null || r.getGroup().equalsIgnoreCase((String) yamlMap.get("group"))))
            .findFirst();

    // Check if the resource kind was found
    if (apiResource.isPresent()) {
      String group = apiResource.get().getGroup();
      String version = apiResource.get().getPreferredVersion();
      String resourcePlural = apiResource.get().getResourcePlural();

      // Getting the strongly typed class from ModelMapper
      Class<?> modelClass = ModelMapper.getApiTypeClass(group, version, kind);

      // **Change**: Add check for the list type of the resource.
      Class<?> modelListClass = ModelMapper.getApiTypeClass(group, version, kind + "List");

      // Validate model class
      if (modelClass == null) {
        throw new IllegalArgumentException("Could not determine model class for group: "
                + group + ", version: " + version + ", kind: " + kind);
      }

      // Reload the YAML into a strongly typed object
      KubernetesObject typedObject = (KubernetesObject) Yaml.loadAs(content, modelClass);

      // Submit the resource to Kubernetes API
      return submitResourceToApi(typedObject, (Class<KubernetesObject>) modelClass, group, version, resourcePlural, modelListClass);
    } else {
      throw new IllegalArgumentException("Invalid resource kind: " + kind);
    }
  }

  /**
   * Submits any resource to Kubernetes API.
   *
   * @param resource The resource to be submitted
   * @param apiTypeClass The class type of the API resource
   * @param group The API group of the resource
   * @param version The API version of the resource
   * @param resourcePlural The plural form of the resource
   * @param apiListTypeClass The class type for the list of the resource
   * @return The created resource object from the API response
   * @throws Exception If there is an error in submitting the resource
   */
  public static <ApiType extends KubernetesObject> Object submitResourceToApi(
          ApiType resource,
          Class<ApiType> apiTypeClass,
          String group,
          String version,
          String resourcePlural,
          Class<?> apiListTypeClass) throws Exception { // **Change**: Added apiListTypeClass

    // Creating an API client and configuring it
    ApiClient client = Config.defaultClient();
    Configuration.setDefaultApiClient(client);

    // Configuring the GenericKubernetesApi handler with explicit list type
    GenericKubernetesApi<ApiType, KubernetesListObject> genericApi = new GenericKubernetesApi<>(
            apiTypeClass,
            apiListTypeClass,
            group,
            version,
            resourcePlural,
            new CustomObjectsApi(client)
    );

    // Creating the resource in Kubernetes
    KubernetesApiResponse<ApiType> apiResponse = genericApi.create(resource);

    // Check if the resource creation was successful
    if (!apiResponse.isSuccess()) {
      throw new RuntimeException("Failed to create resource: " + apiResponse.getStatus());
    }

    // Return the created resource
    return apiResponse.getObject();
  }

}
