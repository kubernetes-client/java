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

import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.util.generic.dynamic.DynamicKubernetesApi;
import io.kubernetes.client.util.generic.dynamic.DynamicKubernetesObject;
import io.kubernetes.client.util.generic.KubernetesApiResponse;
import io.kubernetes.client.util.generic.options.DeleteOptions;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.TimeoutException;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Batch operations for multiple Kubernetes resources.
 * Provides fabric8-style resourceList() operations for creating, deleting,
 * and managing multiple resources at once.
 *
 * <p>Example usage:
 * <pre>{@code
 * // Load and create multiple resources from a file
 * List<Object> created = ResourceList.fromFile(apiClient, new File("app.yaml"))
 *     .create();
 *
 * // Create multiple resources
 * List<Object> resources = Arrays.asList(deployment, service, configMap);
 * List<Object> created = ResourceList.from(apiClient, resources)
 *     .inNamespace("my-namespace")
 *     .create();
 *
 * // Delete multiple resources
 * ResourceList.from(apiClient, resources)
 *     .inNamespace("my-namespace")
 *     .delete();
 *
 * // Wait for all resources to be ready
 * ResourceList.from(apiClient, resources)
 *     .waitUntilAllReady(Duration.ofMinutes(5));
 *
 * // Server-side apply all resources
 * List<Object> applied = ResourceList.fromFile(apiClient, new File("app.yaml"))
 *     .serverSideApply("my-controller");
 * }</pre>
 */
public class ResourceList {

    private final ApiClient apiClient;
    private final List<Object> resources;
    private String namespace;
    private boolean continueOnError = false;

    private ResourceList(ApiClient apiClient, List<Object> resources) {
        this.apiClient = Objects.requireNonNull(apiClient, "ApiClient must not be null");
        this.resources = new ArrayList<>(Objects.requireNonNull(resources, "Resources must not be null"));
    }

    /**
     * Create a ResourceList from a list of resources.
     *
     * @param apiClient the API client
     * @param resources the resources
     * @return a new ResourceList
     */
    public static ResourceList from(ApiClient apiClient, List<Object> resources) {
        return new ResourceList(apiClient, resources);
    }

    /**
     * Create a ResourceList from resources.
     *
     * @param apiClient the API client
     * @param resources the resources
     * @return a new ResourceList
     */
    public static ResourceList from(ApiClient apiClient, Object... resources) {
        return new ResourceList(apiClient, Arrays.asList(resources));
    }

    /**
     * Load resources from a YAML file.
     *
     * @param apiClient the API client
     * @param file the YAML file
     * @return a new ResourceList
     * @throws IOException if an error occurs reading the file
     */
    public static ResourceList fromFile(ApiClient apiClient, File file) throws IOException {
        List<Object> resources = ResourceLoader.loadAll(file);
        return new ResourceList(apiClient, resources);
    }

    /**
     * Load resources from an InputStream.
     *
     * @param apiClient the API client
     * @param inputStream the input stream
     * @return a new ResourceList
     * @throws IOException if an error occurs reading the stream
     */
    public static ResourceList fromStream(ApiClient apiClient, InputStream inputStream) throws IOException {
        List<Object> resources = ResourceLoader.loadAll(inputStream);
        return new ResourceList(apiClient, resources);
    }

    /**
     * Load resources from a YAML string.
     *
     * @param apiClient the API client
     * @param yaml the YAML content
     * @return a new ResourceList
     * @throws IOException if an error occurs parsing the YAML
     */
    public static ResourceList fromYaml(ApiClient apiClient, String yaml) throws IOException {
        List<Object> resources = ResourceLoader.loadAll(yaml);
        return new ResourceList(apiClient, resources);
    }

    /**
     * Get the list of resources.
     *
     * @return the resources
     */
    public List<Object> getResources() {
        return Collections.unmodifiableList(resources);
    }

    /**
     * Specify the namespace for all resources.
     * This will override the namespace specified in individual resources.
     *
     * @param namespace the namespace
     * @return this ResourceList for chaining
     */
    public ResourceList inNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * Continue processing remaining resources even if one fails.
     *
     * @param continueOnError whether to continue on error
     * @return this ResourceList for chaining
     */
    public ResourceList continueOnError(boolean continueOnError) {
        this.continueOnError = continueOnError;
        return this;
    }

    /**
     * Create all resources in the cluster.
     *
     * @return list of created resources
     * @throws ApiException if an API error occurs
     */
    public List<Object> create() throws ApiException {
        List<Object> created = new ArrayList<>();
        List<ApiException> errors = new ArrayList<>();

        for (Object resource : resources) {
            try {
                Object result = createResource(resource);
                created.add(result);
            } catch (ApiException e) {
                if (continueOnError) {
                    errors.add(e);
                } else {
                    throw e;
                }
            }
        }

        if (!errors.isEmpty()) {
            throw new BatchOperationException("Some resources failed to create", errors, created);
        }
        return created;
    }

    /**
     * Create or replace all resources in the cluster.
     *
     * @return list of created or replaced resources
     * @throws ApiException if an API error occurs
     */
    public List<Object> createOrReplace() throws ApiException {
        List<Object> results = new ArrayList<>();
        List<ApiException> errors = new ArrayList<>();

        for (Object resource : resources) {
            try {
                Object result = createOrReplaceResource(resource);
                results.add(result);
            } catch (ApiException e) {
                if (continueOnError) {
                    errors.add(e);
                } else {
                    throw e;
                }
            }
        }

        if (!errors.isEmpty()) {
            throw new BatchOperationException("Some resources failed to create/replace", errors, results);
        }
        return results;
    }

    /**
     * Delete all resources from the cluster.
     *
     * @throws ApiException if an API error occurs
     */
    public void delete() throws ApiException {
        List<ApiException> errors = new ArrayList<>();

        // Delete in reverse order (dependency order)
        for (int i = resources.size() - 1; i >= 0; i--) {
            Object resource = resources.get(i);
            try {
                deleteResource(resource);
            } catch (ApiException e) {
                // Ignore 404 - resource already deleted
                if (e.getCode() != 404) {
                    if (continueOnError) {
                        errors.add(e);
                    } else {
                        throw e;
                    }
                }
            }
        }

        if (!errors.isEmpty()) {
            throw new BatchOperationException("Some resources failed to delete", errors, Collections.emptyList());
        }
    }

    /**
     * Apply all resources using server-side apply.
     *
     * @param fieldManager the field manager name
     * @return list of applied resources
     * @throws ApiException if an API error occurs
     */
    public List<Object> serverSideApply(String fieldManager) throws ApiException {
        return serverSideApply(fieldManager, false);
    }

    /**
     * Apply all resources using server-side apply.
     *
     * @param fieldManager the field manager name
     * @param forceConflicts whether to force ownership of conflicting fields
     * @return list of applied resources
     * @throws ApiException if an API error occurs
     */
    public List<Object> serverSideApply(String fieldManager, boolean forceConflicts) throws ApiException {
        List<Object> applied = new ArrayList<>();
        List<ApiException> errors = new ArrayList<>();

        for (Object resource : resources) {
            try {
                Object result = serverSideApplyResource(resource, fieldManager, forceConflicts);
                applied.add(result);
            } catch (ApiException e) {
                if (continueOnError) {
                    errors.add(e);
                } else {
                    throw e;
                }
            }
        }

        if (!errors.isEmpty()) {
            throw new BatchOperationException("Some resources failed to apply", errors, applied);
        }
        return applied;
    }

    /**
     * Wait until all resources are ready.
     *
     * @param timeout the maximum time to wait for each resource
     * @throws ApiException if an API error occurs
     * @throws InterruptedException if the wait is interrupted
     * @throws TimeoutException if the timeout is exceeded
     */
    public void waitUntilAllReady(Duration timeout)
            throws ApiException, InterruptedException, TimeoutException {
        for (Object resource : resources) {
            if (resource instanceof KubernetesObject) {
                waitForResource((KubernetesObject) resource, timeout);
            }
        }
    }

    /**
     * Wait until all resources are ready, returning a CompletableFuture.
     *
     * @param timeout the maximum time to wait for each resource
     * @return a CompletableFuture that completes when all resources are ready
     */
    public CompletableFuture<Void> waitUntilAllReadyAsync(Duration timeout) {
        List<CompletableFuture<Void>> futures = resources.stream()
                .filter(r -> r instanceof KubernetesObject)
                .map(r -> waitForResourceAsync((KubernetesObject) r, timeout))
                .collect(Collectors.toList());

        return CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]));
    }

    /**
     * Wait until all resources are deleted.
     *
     * @param timeout the maximum time to wait for each resource
     * @throws ApiException if an API error occurs
     * @throws InterruptedException if the wait is interrupted
     * @throws TimeoutException if the timeout is exceeded
     */
    public void waitUntilAllDeleted(Duration timeout)
            throws ApiException, InterruptedException, TimeoutException {
        for (Object resource : resources) {
            if (resource instanceof KubernetesObject) {
                waitForDeletion((KubernetesObject) resource, timeout);
            }
        }
    }

    /**
     * Check if all resources are ready.
     *
     * @return true if all resources are ready
     * @throws ApiException if an API error occurs
     */
    public boolean areAllReady() throws ApiException {
        for (Object resource : resources) {
            if (resource instanceof KubernetesObject) {
                KubernetesObject k8sObj = (KubernetesObject) resource;
                DynamicKubernetesObject dynamicObj = toDynamicObject(k8sObj);
                DynamicKubernetesApi dynamicApi = getDynamicApi(dynamicObj);

                String ns = getEffectiveNamespace(dynamicObj);
                String name = dynamicObj.getMetadata().getName();

                KubernetesApiResponse<DynamicKubernetesObject> response;
                if (ns != null) {
                    response = dynamicApi.get(ns, name);
                } else {
                    response = dynamicApi.get(name);
                }

                if (!response.isSuccess()) {
                    return false;
                }

                if (!Readiness.isReady(response.getObject())) {
                    return false;
                }
            }
        }
        return true;
    }

    // Internal methods

    private Object createResource(Object resource) throws ApiException {
        if (resource instanceof KubernetesObject) {
            KubernetesObject k8sObj = (KubernetesObject) resource;
            DynamicKubernetesObject dynamicObj = toDynamicObject(k8sObj);
            DynamicKubernetesApi dynamicApi = getDynamicApi(dynamicObj);

            String ns = getEffectiveNamespace(dynamicObj);
            io.kubernetes.client.util.generic.options.CreateOptions createOpts = 
                    new io.kubernetes.client.util.generic.options.CreateOptions();

            KubernetesApiResponse<DynamicKubernetesObject> response;
            if (ns != null) {
                response = dynamicApi.create(ns, dynamicObj, createOpts);
            } else {
                response = dynamicApi.create(dynamicObj, createOpts);
            }

            return response.throwsApiException().getObject();
        }
        throw new IllegalArgumentException("Resource must be a KubernetesObject");
    }

    private Object createOrReplaceResource(Object resource) throws ApiException {
        if (resource instanceof KubernetesObject) {
            KubernetesObject k8sObj = (KubernetesObject) resource;
            DynamicKubernetesObject dynamicObj = toDynamicObject(k8sObj);
            DynamicKubernetesApi dynamicApi = getDynamicApi(dynamicObj);

            String ns = getEffectiveNamespace(dynamicObj);
            String name = dynamicObj.getMetadata().getName();
            io.kubernetes.client.util.generic.options.CreateOptions createOpts = 
                    new io.kubernetes.client.util.generic.options.CreateOptions();

            // Try to get existing
            KubernetesApiResponse<DynamicKubernetesObject> existing;
            if (ns != null) {
                existing = dynamicApi.get(ns, name);
            } else {
                existing = dynamicApi.get(name);
            }

            KubernetesApiResponse<DynamicKubernetesObject> response;
            if (existing.isSuccess()) {
                // Update existing
                dynamicObj.getMetadata().setResourceVersion(
                        existing.getObject().getMetadata().getResourceVersion());
                response = dynamicApi.update(dynamicObj);
            } else {
                // Create new
                if (ns != null) {
                    response = dynamicApi.create(ns, dynamicObj, createOpts);
                } else {
                    response = dynamicApi.create(dynamicObj, createOpts);
                }
            }

            return response.throwsApiException().getObject();
        }
        throw new IllegalArgumentException("Resource must be a KubernetesObject");
    }

    private void deleteResource(Object resource) throws ApiException {
        if (resource instanceof KubernetesObject) {
            KubernetesObject k8sObj = (KubernetesObject) resource;
            DynamicKubernetesObject dynamicObj = toDynamicObject(k8sObj);
            DynamicKubernetesApi dynamicApi = getDynamicApi(dynamicObj);

            String ns = getEffectiveNamespace(dynamicObj);
            String name = dynamicObj.getMetadata().getName();

            KubernetesApiResponse<DynamicKubernetesObject> response;
            if (ns != null) {
                response = dynamicApi.delete(ns, name);
            } else {
                response = dynamicApi.delete(name);
            }

            response.throwsApiException();
        }
    }

    private Object serverSideApplyResource(Object resource, String fieldManager, boolean forceConflicts)
            throws ApiException {
        if (resource instanceof KubernetesObject) {
            KubernetesObject k8sObj = (KubernetesObject) resource;
            DynamicKubernetesObject dynamicObj = toDynamicObject(k8sObj);
            DynamicKubernetesApi dynamicApi = getDynamicApi(dynamicObj);

            // Override namespace if specified
            if (namespace != null) {
                dynamicObj.getMetadata().setNamespace(namespace);
            }

            String ns = dynamicObj.getMetadata().getNamespace();
            String name = dynamicObj.getMetadata().getName();

            io.kubernetes.client.util.generic.options.PatchOptions patchOptions =
                    new io.kubernetes.client.util.generic.options.PatchOptions();
            patchOptions.setFieldManager(fieldManager);
            patchOptions.setForce(forceConflicts);

            String yaml = Yaml.dump(k8sObj);
            io.kubernetes.client.custom.V1Patch patch = new io.kubernetes.client.custom.V1Patch(yaml);

            KubernetesApiResponse<DynamicKubernetesObject> response;
            if (ns != null) {
                response = dynamicApi.patch(ns, name,
                        io.kubernetes.client.custom.V1Patch.PATCH_FORMAT_APPLY_YAML, patch, patchOptions);
            } else {
                response = dynamicApi.patch(name,
                        io.kubernetes.client.custom.V1Patch.PATCH_FORMAT_APPLY_YAML, patch, patchOptions);
            }

            return response.throwsApiException().getObject();
        }
        throw new IllegalArgumentException("Resource must be a KubernetesObject");
    }

    private void waitForResource(KubernetesObject resource, Duration timeout)
            throws ApiException, InterruptedException, TimeoutException {
        DynamicKubernetesObject dynamicObj = toDynamicObject(resource);
        DynamicKubernetesApi dynamicApi = getDynamicApi(dynamicObj);

        String ns = getEffectiveNamespace(dynamicObj);
        String name = dynamicObj.getMetadata().getName();

        WaitUtils.waitUntilCondition(
                () -> {
                    KubernetesApiResponse<DynamicKubernetesObject> response = ns != null 
                            ? dynamicApi.get(ns, name) 
                            : dynamicApi.get(name);
                    return response.isSuccess() ? response.getObject() : null;
                },
                obj -> Readiness.isReady(obj),
                timeout);
    }

    private CompletableFuture<Void> waitForResourceAsync(KubernetesObject resource, Duration timeout) {
        return CompletableFuture.runAsync(() -> {
            try {
                waitForResource(resource, timeout);
            } catch (ApiException | InterruptedException | TimeoutException e) {
                throw new CompletionException(e);
            }
        });
    }

    private void waitForDeletion(KubernetesObject resource, Duration timeout)
            throws ApiException, InterruptedException, TimeoutException {
        DynamicKubernetesObject dynamicObj = toDynamicObject(resource);
        DynamicKubernetesApi dynamicApi = getDynamicApi(dynamicObj);

        String ns = getEffectiveNamespace(dynamicObj);
        String name = dynamicObj.getMetadata().getName();

        WaitUtils.waitUntilDeleted(
                () -> {
                    KubernetesApiResponse<DynamicKubernetesObject> response = ns != null 
                            ? dynamicApi.get(ns, name) 
                            : dynamicApi.get(name);
                    return response.isSuccess() ? response.getObject() : null;
                },
                timeout);
    }

    private DynamicKubernetesObject toDynamicObject(KubernetesObject obj) {
        try {
            String yaml = Yaml.dump(obj);
            return Yaml.loadAs(yaml, DynamicKubernetesObject.class);
        } catch (Exception e) {
            throw new RuntimeException("Failed to convert to dynamic object", e);
        }
    }

    private DynamicKubernetesApi getDynamicApi(DynamicKubernetesObject obj) {
        String apiVersion = obj.getApiVersion();
        String kind = obj.getKind();

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

        String plural = pluralize(kind);

        return new DynamicKubernetesApi(group, version, plural, apiClient);
    }
    
    /**
     * Simple pluralization for Kubernetes resource kinds.
     */
    private String pluralize(String kind) {
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

    private String getEffectiveNamespace(DynamicKubernetesObject obj) {
        if (namespace != null) {
            return namespace;
        }
        return obj.getMetadata().getNamespace();
    }

    /**
     * Exception thrown when a batch operation has partial failures.
     */
    public static class BatchOperationException extends ApiException {
        private final List<ApiException> failures;
        private final List<Object> successfulResults;

        public BatchOperationException(String message, List<ApiException> failures, List<Object> successfulResults) {
            super(message);
            this.failures = Collections.unmodifiableList(failures);
            this.successfulResults = Collections.unmodifiableList(successfulResults);
        }

        /**
         * Get the list of failures.
         */
        public List<ApiException> getFailures() {
            return failures;
        }

        /**
         * Get the list of successful results.
         */
        public List<Object> getSuccessfulResults() {
            return successfulResults;
        }
    }
}
