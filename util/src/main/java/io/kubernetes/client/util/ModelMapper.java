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
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.tuple.MutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Model mapper loads pre-built kubernetes models from classpath and manages their mapping between
 * their apiVersion and kind.
 */
public class ModelMapper {

  private static Map<String, Class<?>> classes = new HashMap<>();
  private static Map<String, String> apiGroups = new HashMap<>();
  private static List<String> apiVersions = new ArrayList<>();

  private static final Logger logger = LoggerFactory.getLogger(ModelMapper.class);

  static {
    try {
      initModelMap();
    } catch (Exception ex) {
      logger.error("Unexpected exception while loading classes: " + ex);
    }
  }

  /**
   * Add a mapping from API Group/version/kind to a Class to use when calling <code>load(...)
   * </code> .
   *
   * <p>Shouldn't really be needed as most API Group/Version/Kind are loaded dynamically at startup.
   */
  public static void addModelMap(String apiGroupVersion, String kind, Class<?> clazz) {
    classes.put(apiGroupVersion + "/" + kind, clazz);
  }

  public static Class<?> getApiTypeClass(String apiVersion, String kind) {
    Class<?> clazz = (Class<?>) classes.get(apiVersion + "/" + kind);
    if (clazz == null) {
      // Attempt to detect class from version and kind alone
      if (apiVersion.contains("/")) {
        clazz = (Class<?>) classes.get(apiVersion.split("/")[1] + "/" + kind);
      }
    }
    return clazz;
  }

  public static Map<String, Class<?>> getAllKnownClasses() {
    return ImmutableMap.copyOf(classes);
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

  private static Pair<String, String> getApiVersion(String name) {
    MutablePair<String, String> parts = new MutablePair<>();
    for (String version : apiVersions) {
      if (name.startsWith(version)) {
        parts.left = version.toLowerCase();
        parts.right = name.substring(version.length());
        break;
      }
    }
    if (parts.left == null) parts.right = name;

    return parts;
  }

  private static void initModelMap() throws IOException {
    initApiGroupMap();
    initApiVersionList();

    ClassPath cp = ClassPath.from(Yaml.class.getClassLoader());
    Set<ClassPath.ClassInfo> allClasses =
        cp.getTopLevelClasses("io.kubernetes.client.openapi.models");

    for (ClassPath.ClassInfo clazz : allClasses) {
      String modelName = "";
      Pair<String, String> nameParts = getApiGroup(clazz.getSimpleName());
      modelName += nameParts.getLeft() == null ? "" : nameParts.getLeft() + "/";

      nameParts = getApiVersion(nameParts.getRight());
      modelName += nameParts.getLeft() == null ? "" : nameParts.getLeft() + "/";
      modelName += nameParts.getRight();

      classes.put(modelName, clazz.load());
    }
  }

  private static Pair<String, String> getApiGroup(String name) {
    MutablePair<String, String> parts = new MutablePair<>();
    for (Map.Entry<String, String> entry : apiGroups.entrySet()) {
      if (name.startsWith(entry.getKey())) {
        parts.left = entry.getValue();
        parts.right = name.substring(entry.getKey().length());
        break;
      }
    }
    if (parts.left == null) parts.right = name;
    return parts;
  }
}
