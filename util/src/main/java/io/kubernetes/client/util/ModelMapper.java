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
package io.kubernetes.client.util;

import com.google.common.collect.ImmutableMap;
import com.google.common.reflect.ClassPath;
import io.kubernetes.client.Discovery;
import io.kubernetes.client.apimachinery.GroupVersionKind;
import io.kubernetes.client.common.KubernetesListObject;
import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.openapi.ApiException;
import java.io.IOException;
import java.time.Duration;
import java.util.*;
import org.apache.commons.lang3.tuple.MutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Model mapper loads pre-built kubernetes models from classpath and manages their mapping between
 * their apiVersion and kind.
 */
public class ModelMapper {

  private static final Logger logger = LoggerFactory.getLogger(ModelMapper.class);

  public static final Duration DEFAULT_DISCOVERY_REFRESH_INTERVAL = Duration.ofMinutes(30);

  private static Map<GroupVersionKind, Class<?>> classes = new HashMap<>();

  private static Set<Discovery.APIResource> lastAPIDiscovery = new HashSet<>();

  private static volatile long nextRefreshTimeMillis = System.currentTimeMillis();

  // Model's api-group prefix to kubernetes api-group
  private static Map<String, String> apiGroups = new HashMap<>();
  // Model's api-version midfix to kubernetes api-version
  private static List<String> apiVersions = new ArrayList<>();

  static {
    try {
      initModelMap();
    } catch (Exception ex) {
      logger.error("Unexpected exception while loading classes: " + ex);
    }
  }

  /**
   * Registering concrete model classes by its apiGroupVersion (e.g. "apps/v1") and kind (e.g.
   * "Deployment").
   *
   * <p>Note that the the so-called apiGroupVersion equals to the "apiVersion" in the kubenretes
   * resource yamls.
   */
  public static void addModelMap(String apiGroupVersion, String kind, Class<?> clazz) {
    String[] parts = apiGroupVersion.split("/");
    if (parts.length == 1) {
      addModelMap("", apiGroupVersion, kind, clazz);
    }
    addModelMap(parts[0], parts[1], kind, clazz);
  }

  /**
   * Registering concrete model classes by its group, version and kind (e.g. "apps", "v1",
   * "Deployment")
   *
   * @param group the group
   * @param version the version
   * @param kind the kind
   * @param clazz the clazz
   */
  public static void addModelMap(String group, String version, String kind, Class<?> clazz) {
    classes.put(new GroupVersionKind(group, version, kind), clazz);
  }

  /**
   * Gets the model classes by given apiGroupVersion (e.g. "apps/v1") and kind (e.g. "Deployment").
   *
   * @param apiGroupVersion the api version
   * @param kind the kind
   * @return the api type class
   */
  public static Class<?> getApiTypeClass(String apiGroupVersion, String kind) {
    String[] parts = apiGroupVersion.split("/");
    if (parts.length == 1) {
      // legacy group
      return getApiTypeClass("", apiGroupVersion, kind);
    }
    return getApiTypeClass(parts[0], parts[1], kind);
  }

  /**
   * Gets the model classes by given group, version and kind (e.g. "apps", ""v1", "Deployment").
   *
   * @param group the group
   * @param version the version
   * @param kind the kind
   * @return the api type class
   */
  public static Class<?> getApiTypeClass(String group, String version, String kind) {
    Class<?> clazz = classes.get(new GroupVersionKind(group, version, kind));
    if (clazz != null) {
      return clazz;
    }
    return classes.get(new GroupVersionKind(null, version, kind));
  }

  /**
   * Returns all the registered model classes.
   *
   * @return the all known classes
   */
  public static Map<GroupVersionKind, Class<?>> getAllKnownClasses() {
    return ImmutableMap.copyOf(classes);
  }

  /**
   * Gets the GVK by the given model class.
   *
   * <p>Note: This method will run a loop over the registered models, consider use {@link
   * ModelMapper#getAllKnownClasses} and build your own index for faster queries.
   *
   * @param clazz the clazz
   * @return the group version kind by class
   */
  public static GroupVersionKind getGroupVersionKindByClass(Class<?> clazz) {
    return classes.entrySet().stream()
        .filter(e -> clazz.equals(e.getValue()))
        .map(e -> e.getKey())
        .findFirst()
        .get();
  }

  public static Set<Discovery.APIResource> refresh(Discovery discovery) throws ApiException {
    return refresh(discovery, DEFAULT_DISCOVERY_REFRESH_INTERVAL);
  }
  /**
   * Refreshes the model mapping by syncing up w/the api discovery info from the kubernetes
   * apiserver.
   *
   * <p>Note: if model mappings can be incomplete if this method is never called.
   *
   * @param discovery the discovery
   * @return the api-discovery set
   * @throws ApiException the api exception
   */
  public static Set<Discovery.APIResource> refresh(Discovery discovery, Duration refreshInterval)
      throws ApiException {
    long nowMillis = System.currentTimeMillis();
    if (nowMillis < nextRefreshTimeMillis) {
      return lastAPIDiscovery;
    }

    Set<Discovery.APIResource> apiResources = discovery.findAll();

    for (Discovery.APIResource apiResource : apiResources) {
      for (String version : apiResource.getVersions()) {
        Class<?> clazz = getApiTypeClass(apiResource.getGroup(), version, apiResource.getKind());
        if (clazz == null) {
          continue;
        }
        // sync up w/ the latest api discovery
        classes.remove(getGroupVersionKindByClass(clazz));
        addModelMap(apiResource.getGroup(), version, apiResource.getKind(), clazz);
      }
    }

    lastAPIDiscovery = apiResources;
    nextRefreshTimeMillis = refreshInterval.toMillis() + nowMillis;
    return lastAPIDiscovery;
  }

  private static void initApiGroupMap() {
    apiGroups.put("Admissionregistration", "admissionregistration.k8s.io");
    apiGroups.put("Apiextensions", "apiextensions.k8s.io");
    apiGroups.put("Apiregistration", "apiregistration.k8s.io");
    apiGroups.put("Apps", "apps");
    apiGroups.put("Authentication", "authentication.k8s.io");
    apiGroups.put("Authorization", "authorization.k8s.io");
    apiGroups.put("Autoscaling", "autoscaling");
    apiGroups.put("Extensions", "extensions");
    apiGroups.put("Batch", "batch");
    apiGroups.put("Certificates", "certificates.k8s.io");
    apiGroups.put("Networking", "networking.k8s.io");
    apiGroups.put("Policy", "policy");
    apiGroups.put("RbacAuthorization", "rbac.authorization.k8s.io");
    apiGroups.put("Scheduling", "scheduling.k8s.io");
    apiGroups.put("Settings", "settings.k8s.io");
    apiGroups.put("Storage", "storage.k8s.io");
    apiGroups.put("FlowControl", "flowcontrol.apiserver.k8s.io");
  }

  private static void initApiVersionList() {
    // Order important
    apiVersions.add("V2beta1");
    apiVersions.add("V2beta2");
    apiVersions.add("V2alpha1");
    apiVersions.add("V1beta2");
    apiVersions.add("V1beta1");
    apiVersions.add("V1alpha1");
    apiVersions.add("V1");
  }

  private static void initModelMap() throws IOException {
    initApiGroupMap();
    initApiVersionList();

    ClassPath cp = ClassPath.from(Yaml.class.getClassLoader());
    Set<ClassPath.ClassInfo> allClasses =
        cp.getTopLevelClasses("io.kubernetes.client.openapi.models");

    for (ClassPath.ClassInfo classInfo : allClasses) {
      Class clazz = classInfo.load();
      if (!KubernetesObject.class.isAssignableFrom(clazz)
          && !KubernetesListObject.class.isAssignableFrom(clazz)) {
        continue;
      }

      Pair<String, String> groupAndOther = getApiGroup(clazz.getSimpleName());
      Pair<String, String> versionAndOther = getApiVersion(groupAndOther.getRight());

      String group = groupAndOther.getLeft();
      String version = versionAndOther.getLeft();
      String kind = versionAndOther.getRight();

      classes.put(new GroupVersionKind(group, version, kind), clazz);
    }
  }

  private static Pair<String, String> getApiGroup(String name) {
    return apiGroups.entrySet().stream()
        .filter(e -> name.startsWith(e.getKey()))
        .map(e -> new MutablePair(e.getValue(), name.substring(e.getKey().length())))
        .findFirst()
        .orElse(new MutablePair(null, name));
  }

  private static Pair<String, String> getApiVersion(String name) {
    return apiVersions.stream()
        .filter(v -> name.startsWith(v))
        .map(v -> new MutablePair(v.toLowerCase(), name.substring(v.length())))
        .findFirst()
        .orElse(new MutablePair(null, name));
  }
}
