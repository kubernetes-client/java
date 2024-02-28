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

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.ApiResponse;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.models.V1APIGroup;
import io.kubernetes.client.openapi.models.V1APIGroupList;
import io.kubernetes.client.openapi.models.V1APIResourceList;
import io.kubernetes.client.openapi.models.V1APIVersions;
import io.kubernetes.client.util.exception.IncompleteDiscoveryException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import okhttp3.Call;

public class Discovery {

  private final ApiClient apiClient;

  public Discovery() {
    this(Configuration.getDefaultApiClient());
  }

  public Discovery(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public Set<APIResource> findAll() throws ApiException {
    Set<APIResource> allResources = new HashSet<>();
    for (String version : legacyCoreApi().getVersions()) {
      allResources.addAll(findAll("", Arrays.asList(version), version, "/api/" + version));
    }
    IncompleteDiscoveryException incompleteDiscoveryException = null;
    for (V1APIGroup group : groupDiscovery("/apis").getGroups()) {
      try {
        allResources.addAll(
            findAll(
                group.getName(),
                group.getVersions().stream().map(v -> v.getVersion()).collect(Collectors.toList()),
                group.getPreferredVersion().getVersion()));
      } catch (ApiException e){
        IncompleteDiscoveryException resourceDiscoveryException = new IncompleteDiscoveryException(
            String.format("Unable to retrieve the complete list of server APIs: %s/%s : %s",
                group.getName(), group.getPreferredVersion().getVersion(), e.getResponseBody()),
            e, allResources);
        if (incompleteDiscoveryException == null) {
          incompleteDiscoveryException = resourceDiscoveryException;
        }else {
          incompleteDiscoveryException.addSuppressed(resourceDiscoveryException);
        }
      }
    }
    if (incompleteDiscoveryException != null) {
      throw incompleteDiscoveryException;
    }
    return allResources;
  }

  public Set<APIResource> findAll(String group, List<String> versions, String preferredVersion)
      throws ApiException {
    return findAll(group, versions, preferredVersion, "/apis/" + group + "/" + preferredVersion);
  }

  public Set<APIResource> findAll(
      String group, List<String> versions, String preferredVersion, String path)
      throws ApiException {
    V1APIResourceList resourceList = resourceDiscovery(path);
    return groupResourcesByName(group, versions, preferredVersion, resourceList);
  }

  public Set<APIResource> groupResourcesByName(
      String group,
      List<String> versions,
      String preferredVersion,
      V1APIResourceList resourceList) {
    // parse raw discovery responses to APIResource for better readability
    Set<APIResource> resources =
        resourceList.getResources().stream()
            .filter(r -> getSubResourceNameIfPossible(r.getName()).isEmpty())
            .map(
                r ->
                    new APIResource(
                        group,
                        versions,
                        preferredVersion,
                        r.getKind(),
                        r.getNamespaced(),
                        r.getName(),
                        r.getSingularName()))
            .collect(Collectors.toSet());

    // wiring up connections between major-resource and sub-resources
    Map<String, Set<String>> subResources = manageRelationFromResourceToSubResources(resourceList);
    resources.stream()
        .forEach(
            r -> {
              if (subResources.containsKey(r.getResourcePlural())) {
                r.subResources.addAll(subResources.get(r.getResourcePlural()));
              }
            });
    return resources;
  }

  private Map<String, Set<String>> manageRelationFromResourceToSubResources(
      V1APIResourceList resourceList) {
    Map<String, Set<String>> subResources = new HashMap<>();
    resourceList.getResources().stream()
        .forEach(r -> subResources.put(r.getName(), new HashSet<>()));
    resourceList.getResources().stream()
        .forEach(
            r -> {
              getSubResourceNameIfPossible(r.getName())
                  .ifPresent(
                      subResourceName -> {
                        subResources
                            .computeIfAbsent(
                                getMajorResourceName(r.getName()),
                                majorResourceName -> new HashSet<>())
                            .add(subResourceName);
                      });
            });
    return subResources;
  }

  private String getMajorResourceName(String discoveredResourceName) {
    String[] parts = discoveredResourceName.split("/", 2);
    return parts[0];
  }

  private Optional<String> getSubResourceNameIfPossible(String discoveredResourceName) {
    boolean isSubResource = discoveredResourceName.contains("/");
    if (!isSubResource) {
      return Optional.empty();
    }
    String[] parts = discoveredResourceName.split("/", 2);
    return Optional.of(parts[1]);
  }

  public V1APIVersions legacyCoreApi() throws ApiException {
    return versionDiscovery("/api");
  }

  public V1APIGroupList groupDiscovery(String path) throws ApiException {
    return get(V1APIGroupList.class, path);
  }

  public V1APIVersions versionDiscovery(String path) throws ApiException {
    return get(V1APIVersions.class, path);
  }

  public V1APIResourceList resourceDiscovery(String path) throws ApiException {
    return get(V1APIResourceList.class, path);
  }

  private <T> T get(Class<T> returnTypeClass, String urlPath) throws ApiException {
    Map<String, String> headers = new HashMap<>();
    headers.put("Content-Type", "application/json");
    Call call =
        apiClient.buildCall(
                apiClient.getBasePath(),
            urlPath,
            "GET",
            Collections.emptyList(),
                Collections.emptyList(),
            null,
            headers,
            Collections.emptyMap(),
            Collections.emptyMap(),
            new String[] {"BearerToken"},
            null);
    ApiResponse<T> resourceList = apiClient.execute(call, returnTypeClass);
    return resourceList.getData();
  }

  public static class APIResource {

    private final String group;
    private final String kind;
    private final List<String> versions;
    private final String preferredVersion;
    private final Boolean isNamespaced;
    private final String resourcePlural;
    private final String resourceSingular;
    private final List<String> subResources;

    public APIResource(
        String group,
        List<String> versions,
        String preferredVersion,
        String kind,
        Boolean isNamespaced,
        String resourcePlural,
        String resourceSingular) {
      this.group = group;
      this.versions = versions;
      this.preferredVersion = preferredVersion;
      this.kind = kind;
      this.isNamespaced = isNamespaced;
      this.resourcePlural = resourcePlural;
      this.resourceSingular = resourceSingular;
      this.subResources = new ArrayList<>();
    }

    public String getGroup() {
      return group;
    }

    public List<String> getVersions() {
      return versions;
    }

    public String getPreferredVersion() {
      return preferredVersion;
    }

    public String getKind() {
      return kind;
    }

    public Boolean getNamespaced() {
      return isNamespaced;
    }

    public String getResourcePlural() {
      return resourcePlural;
    }

    public String getResourceSingular() {
      return resourceSingular;
    }

    public List<String> getSubResources() {
      return subResources;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      APIResource that = (APIResource) o;
      return Objects.equals(group, that.group)
          && Objects.equals(kind, that.kind)
          && Objects.equals(versions, that.versions)
          && Objects.equals(preferredVersion, that.preferredVersion)
          && Objects.equals(isNamespaced, that.isNamespaced)
          && Objects.equals(resourcePlural, that.resourcePlural)
          && Objects.equals(resourceSingular, that.resourceSingular)
          && Objects.equals(subResources, that.subResources);
    }

    @Override
    public int hashCode() {
      return Objects.hash(
          group,
          kind,
          versions,
          preferredVersion,
          isNamespaced,
          resourcePlural,
          resourceSingular,
          subResources);
    }
  }
}
