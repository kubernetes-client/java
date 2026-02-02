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
package io.kubernetes.client.util;

import io.kubernetes.client.Discovery;
import io.kubernetes.client.apimachinery.GroupVersionKind;
import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import io.kubernetes.client.util.generic.KubernetesApiResponse;
import io.kubernetes.client.util.generic.dynamic.DynamicKubernetesApi;
import io.kubernetes.client.util.generic.dynamic.DynamicKubernetesObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Utility class for loading Kubernetes resources from various sources (files, streams, URLs).
 * Provides fabric8-style resource loading capabilities.
 *
 * <p>Example usage:
 * <pre>{@code
 * // Load a single resource from a file
 * Object resource = ResourceLoader.load(new File("pod.yaml"));
 *
 * // Load multiple resources from a file
 * List<Object> resources = ResourceLoader.loadAll(new File("multi-resource.yaml"));
 *
 * // Load and create resources using ApiClient
 * List<Object> created = ResourceLoader.loadAndCreate(apiClient, new File("deployment.yaml"));
 *
 * // Load from InputStream
 * try (InputStream is = getClass().getResourceAsStream("/my-pod.yaml")) {
 *     V1Pod pod = ResourceLoader.load(is, V1Pod.class);
 * }
 * }</pre>
 */
public class ResourceLoader {

    private ResourceLoader() {
        // Utility class
    }

    /**
     * Load a Kubernetes resource from a file.
     *
     * @param file the file to load from
     * @return the parsed Kubernetes resource
     * @throws IOException if an error occurs reading the file
     */
    public static Object load(File file) throws IOException {
        return Yaml.load(file);
    }

    /**
     * Load a Kubernetes resource from a file as a specific type.
     *
     * @param <T> the resource type
     * @param file the file to load from
     * @param clazz the class of the resource
     * @return the parsed Kubernetes resource
     * @throws IOException if an error occurs reading the file
     */
    public static <T> T load(File file, Class<T> clazz) throws IOException {
        return Yaml.loadAs(file, clazz);
    }

    /**
     * Load a Kubernetes resource from an InputStream.
     *
     * @param inputStream the input stream to load from
     * @return the parsed Kubernetes resource
     * @throws IOException if an error occurs reading the stream
     */
    public static Object load(InputStream inputStream) throws IOException {
        String content = readInputStream(inputStream);
        return Yaml.load(content);
    }

    /**
     * Load a Kubernetes resource from an InputStream as a specific type.
     *
     * @param <T> the resource type
     * @param inputStream the input stream to load from
     * @param clazz the class of the resource
     * @return the parsed Kubernetes resource
     * @throws IOException if an error occurs reading the stream
     */
    public static <T> T load(InputStream inputStream, Class<T> clazz) throws IOException {
        try (Reader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8)) {
            return Yaml.loadAs(reader, clazz);
        }
    }

    /**
     * Load a Kubernetes resource from a URL.
     *
     * @param url the URL to load from
     * @return the parsed Kubernetes resource
     * @throws IOException if an error occurs reading from the URL
     */
    public static Object load(URL url) throws IOException {
        try (InputStream is = url.openStream()) {
            return load(is);
        }
    }

    /**
     * Load a Kubernetes resource from a URL as a specific type.
     *
     * @param <T> the resource type
     * @param url the URL to load from
     * @param clazz the class of the resource
     * @return the parsed Kubernetes resource
     * @throws IOException if an error occurs reading from the URL
     */
    public static <T> T load(URL url, Class<T> clazz) throws IOException {
        try (InputStream is = url.openStream()) {
            return load(is, clazz);
        }
    }

    /**
     * Load a Kubernetes resource from a string.
     *
     * @param content the YAML/JSON content
     * @return the parsed Kubernetes resource
     * @throws IOException if an error occurs parsing the content
     */
    public static Object load(String content) throws IOException {
        return Yaml.load(content);
    }

    /**
     * Load a Kubernetes resource from a string as a specific type.
     *
     * @param <T> the resource type
     * @param content the YAML/JSON content
     * @param clazz the class of the resource
     * @return the parsed Kubernetes resource
     * @throws IOException if an error occurs parsing the content
     */
    public static <T> T load(String content, Class<T> clazz) throws IOException {
        return Yaml.loadAs(content, clazz);
    }

    /**
     * Load all Kubernetes resources from a multi-document YAML file.
     *
     * @param file the file to load from
     * @return list of parsed Kubernetes resources
     * @throws IOException if an error occurs reading the file
     */
    public static List<Object> loadAll(File file) throws IOException {
        try (FileInputStream fis = new FileInputStream(file)) {
            return loadAll(fis);
        }
    }

    /**
     * Load all Kubernetes resources from a multi-document YAML stream.
     *
     * @param inputStream the input stream to load from
     * @return list of parsed Kubernetes resources
     * @throws IOException if an error occurs reading the stream
     */
    public static List<Object> loadAll(InputStream inputStream) throws IOException {
        String content = readInputStream(inputStream);
        return loadAll(content);
    }

    /**
     * Load all Kubernetes resources from a multi-document YAML string.
     *
     * @param content the YAML content (may contain multiple documents)
     * @return list of parsed Kubernetes resources
     * @throws IOException if an error occurs parsing the content
     */
    public static List<Object> loadAll(String content) throws IOException {
        return Yaml.loadAll(content);
    }

    /**
     * Load resources from a file and create them in the cluster.
     *
     * @param apiClient the API client to use
     * @param file the file to load from
     * @return list of created resources
     * @throws IOException if an error occurs reading the file
     * @throws ApiException if an error occurs creating resources
     */
    public static List<Object> loadAndCreate(ApiClient apiClient, File file)
            throws IOException, ApiException {
        List<Object> resources = loadAll(file);
        return createResources(apiClient, resources);
    }

    /**
     * Load resources from a stream and create them in the cluster.
     *
     * @param apiClient the API client to use
     * @param inputStream the input stream to load from
     * @return list of created resources
     * @throws IOException if an error occurs reading the stream
     * @throws ApiException if an error occurs creating resources
     */
    public static List<Object> loadAndCreate(ApiClient apiClient, InputStream inputStream)
            throws IOException, ApiException {
        List<Object> resources = loadAll(inputStream);
        return createResources(apiClient, resources);
    }

    /**
     * Load resources from a string and create them in the cluster.
     *
     * @param apiClient the API client to use
     * @param content the YAML/JSON content
     * @return list of created resources
     * @throws IOException if an error occurs parsing the content
     * @throws ApiException if an error occurs creating resources
     */
    public static List<Object> loadAndCreate(ApiClient apiClient, String content)
            throws IOException, ApiException {
        List<Object> resources = loadAll(content);
        return createResources(apiClient, resources);
    }

    /**
     * Load resources from a file and apply them (create or replace).
     *
     * @param apiClient the API client to use
     * @param file the file to load from
     * @return list of applied resources
     * @throws IOException if an error occurs reading the file
     * @throws ApiException if an error occurs applying resources
     */
    public static List<Object> loadAndApply(ApiClient apiClient, File file)
            throws IOException, ApiException {
        List<Object> resources = loadAll(file);
        return applyResources(apiClient, resources);
    }

    /**
     * Load resources from a stream and apply them (create or replace).
     *
     * @param apiClient the API client to use
     * @param inputStream the input stream to load from
     * @return list of applied resources
     * @throws IOException if an error occurs reading the stream
     * @throws ApiException if an error occurs applying resources
     */
    public static List<Object> loadAndApply(ApiClient apiClient, InputStream inputStream)
            throws IOException, ApiException {
        List<Object> resources = loadAll(inputStream);
        return applyResources(apiClient, resources);
    }

    /**
     * Load resources from a file and delete them.
     *
     * @param apiClient the API client to use
     * @param file the file to load from
     * @throws IOException if an error occurs reading the file
     * @throws ApiException if an error occurs deleting resources
     */
    public static void loadAndDelete(ApiClient apiClient, File file)
            throws IOException, ApiException {
        List<Object> resources = loadAll(file);
        deleteResources(apiClient, resources);
    }

    /**
     * Load resources from a stream and delete them.
     *
     * @param apiClient the API client to use
     * @param inputStream the input stream to load from
     * @throws IOException if an error occurs reading the stream
     * @throws ApiException if an error occurs deleting resources
     */
    public static void loadAndDelete(ApiClient apiClient, InputStream inputStream)
            throws IOException, ApiException {
        List<Object> resources = loadAll(inputStream);
        deleteResources(apiClient, resources);
    }

    /**
     * Create resources in the cluster using DynamicKubernetesApi.
     */
    private static List<Object> createResources(ApiClient apiClient, List<Object> resources)
            throws ApiException {
        List<Object> created = new ArrayList<>();
        io.kubernetes.client.util.generic.options.CreateOptions createOpts =
                new io.kubernetes.client.util.generic.options.CreateOptions();
        for (Object resource : resources) {
            if (resource instanceof KubernetesObject) {
                KubernetesObject k8sObj = (KubernetesObject) resource;
                DynamicKubernetesObject dynamicObj = toDynamicObject(k8sObj);
                DynamicKubernetesApi dynamicApi = getDynamicApi(apiClient, dynamicObj);

                String namespace = dynamicObj.getMetadata().getNamespace();
                KubernetesApiResponse<DynamicKubernetesObject> response;

                if (namespace != null && !namespace.isEmpty()) {
                    response = dynamicApi.create(namespace, dynamicObj, createOpts);
                } else {
                    response = dynamicApi.create(dynamicObj, createOpts);
                }

                if (response.isSuccess()) {
                    created.add(response.getObject());
                } else {
                    throw new ApiException(response.getHttpStatusCode(),
                            "Failed to create resource: " + response.getStatus());
                }
            }
        }
        return created;
    }

    /**
     * Apply (create or update) resources in the cluster.
     */
    private static List<Object> applyResources(ApiClient apiClient, List<Object> resources)
            throws ApiException {
        List<Object> applied = new ArrayList<>();
        io.kubernetes.client.util.generic.options.CreateOptions createOpts =
                new io.kubernetes.client.util.generic.options.CreateOptions();
        for (Object resource : resources) {
            if (resource instanceof KubernetesObject) {
                KubernetesObject k8sObj = (KubernetesObject) resource;
                DynamicKubernetesObject dynamicObj = toDynamicObject(k8sObj);
                DynamicKubernetesApi dynamicApi = getDynamicApi(apiClient, dynamicObj);

                String namespace = dynamicObj.getMetadata().getNamespace();
                String name = dynamicObj.getMetadata().getName();

                // Try to get existing resource
                KubernetesApiResponse<DynamicKubernetesObject> existing;
                if (namespace != null && !namespace.isEmpty()) {
                    existing = dynamicApi.get(namespace, name);
                } else {
                    existing = dynamicApi.get(name);
                }

                KubernetesApiResponse<DynamicKubernetesObject> response;
                if (existing.isSuccess()) {
                    // Update existing resource
                    dynamicObj.getMetadata().setResourceVersion(
                            existing.getObject().getMetadata().getResourceVersion());

                    response = dynamicApi.update(dynamicObj);
                } else {
                    // Create new resource
                    if (namespace != null && !namespace.isEmpty()) {
                        response = dynamicApi.create(namespace, dynamicObj, createOpts);
                    } else {
                        response = dynamicApi.create(dynamicObj, createOpts);
                    }
                }

                if (response.isSuccess()) {
                    applied.add(response.getObject());
                } else {
                    throw new ApiException(response.getHttpStatusCode(),
                            "Failed to apply resource: " + response.getStatus());
                }
            }
        }
        return applied;
    }

    /**
     * Delete resources from the cluster.
     */
    private static void deleteResources(ApiClient apiClient, List<Object> resources)
            throws ApiException {
        for (Object resource : resources) {
            if (resource instanceof KubernetesObject) {
                KubernetesObject k8sObj = (KubernetesObject) resource;
                DynamicKubernetesObject dynamicObj = toDynamicObject(k8sObj);
                DynamicKubernetesApi dynamicApi = getDynamicApi(apiClient, dynamicObj);

                String namespace = dynamicObj.getMetadata().getNamespace();
                String name = dynamicObj.getMetadata().getName();

                KubernetesApiResponse<DynamicKubernetesObject> response;
                if (namespace != null && !namespace.isEmpty()) {
                    response = dynamicApi.delete(namespace, name);
                } else {
                    response = dynamicApi.delete(name);
                }

                // 404 is ok for delete (already deleted)
                if (!response.isSuccess() && response.getHttpStatusCode() != 404) {
                    throw new ApiException(response.getHttpStatusCode(),
                            "Failed to delete resource: " + response.getStatus());
                }
            }
        }
    }

    /**
     * Convert a KubernetesObject to a DynamicKubernetesObject.
     */
    private static DynamicKubernetesObject toDynamicObject(KubernetesObject obj) {
        String yaml;
        try {
            yaml = Yaml.dump(obj);
            return Yaml.loadAs(yaml, DynamicKubernetesObject.class);
        } catch (Exception e) {
            throw new RuntimeException("Failed to convert to dynamic object", e);
        }
    }

    /**
     * Get a DynamicKubernetesApi for the given resource.
     */
    private static DynamicKubernetesApi getDynamicApi(ApiClient apiClient, DynamicKubernetesObject obj) {
        String apiVersion = obj.getApiVersion();
        String kind = obj.getKind();

        // Parse apiVersion into group and version
        String group;
        String version;
        if (apiVersion.contains("/")) {
            String[] parts = apiVersion.split("/");
            group = parts[0];
            version = parts[1];
        } else {
            group = "";
            version = apiVersion;
        }

        // Get the plural name using simple pluralization
        // In a production system, you would use API discovery to get the correct plural
        String plural = pluralize(kind);

        return new DynamicKubernetesApi(group, version, plural, apiClient);
    }

    /**
     * Simple pluralization for Kubernetes resource kinds.
     */
    private static String pluralize(String kind) {
        if (kind == null) {
            return null;
        }
        String lower = kind.toLowerCase();
        // Special cases for Kubernetes kinds
        if (lower.endsWith("s") || lower.endsWith("x") || lower.endsWith("z")
                || lower.endsWith("ch") || lower.endsWith("sh")) {
            return lower + "es";
        }
        if (lower.endsWith("y") && lower.length() > 1) {
            char beforeY = lower.charAt(lower.length() - 2);
            if (beforeY != 'a' && beforeY != 'e' && beforeY != 'i' && beforeY != 'o' && beforeY != 'u') {
                return lower.substring(0, lower.length() - 1) + "ies";
            }
        }
        // Handle known Kubernetes kinds
        switch (lower) {
            case "endpoints":
                return "endpoints";
            case "ingress":
                return "ingresses";
            default:
                return lower + "s";
        }
    }

    /**
     * Read an InputStream to a String.
     */
    private static String readInputStream(InputStream inputStream) throws IOException {
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {
            return reader.lines().collect(Collectors.joining("\n"));
        }
    }
}
