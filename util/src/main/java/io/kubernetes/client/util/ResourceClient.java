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

import io.kubernetes.client.common.KubernetesListObject;
import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.models.V1DeleteOptions;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import io.kubernetes.client.util.generic.KubernetesApiResponse;
import io.kubernetes.client.util.generic.options.CreateOptions;
import io.kubernetes.client.util.generic.options.DeleteOptions;
import io.kubernetes.client.util.generic.options.GetOptions;
import io.kubernetes.client.util.generic.options.ListOptions;
import io.kubernetes.client.util.generic.options.PatchOptions;
import io.kubernetes.client.util.generic.options.UpdateOptions;

import java.time.Duration;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 * Fluent DSL for Kubernetes resource operations, similar to fabric8 Kubernetes client.
 * Provides a chainable, intuitive API for CRUD operations on Kubernetes resources.
 *
 * <p>Example usage:
 * <pre>{@code
 * // Create a client for pods
 * ResourceClient<V1Pod, V1PodList> pods = 
 *     ResourceClient.create(apiClient, V1Pod.class, V1PodList.class, "", "v1", "pods");
 * 
 * // Get a pod in a namespace
 * V1Pod pod = pods.inNamespace("default").withName("my-pod").get();
 * 
 * // List all pods with a label
 * V1PodList podList = pods.inNamespace("default")
 *     .withLabel("app", "myapp")
 *     .list();
 * 
 * // Create or replace a pod
 * V1Pod created = pods.inNamespace("default").createOrReplace(myPod);
 * 
 * // Delete a pod
 * pods.inNamespace("default").withName("my-pod").delete();
 * 
 * // Wait until ready
 * V1Pod ready = pods.inNamespace("default")
 *     .withName("my-pod")
 *     .waitUntilReady(Duration.ofMinutes(5));
 * 
 * // Edit a resource
 * V1Pod edited = pods.inNamespace("default")
 *     .withName("my-pod")
 *     .edit(pod -> {
 *         pod.getMetadata().getLabels().put("newlabel", "value");
 *         return pod;
 *     });
 * }</pre>
 *
 * @param <ApiType> the Kubernetes resource type
 * @param <ApiListType> the Kubernetes resource list type
 */
public class ResourceClient<ApiType extends KubernetesObject, ApiListType extends KubernetesListObject> {

    private final GenericKubernetesApi<ApiType, ApiListType> api;
    private final ApiClient apiClient;
    private final Class<ApiType> apiTypeClass;
    private String namespace;
    private String name;
    private String labelSelector;
    private String fieldSelector;

    private ResourceClient(
            ApiClient apiClient,
            GenericKubernetesApi<ApiType, ApiListType> api,
            Class<ApiType> apiTypeClass) {
        this.apiClient = Objects.requireNonNull(apiClient, "ApiClient must not be null");
        this.api = Objects.requireNonNull(api, "GenericKubernetesApi must not be null");
        this.apiTypeClass = Objects.requireNonNull(apiTypeClass, "apiTypeClass must not be null");
    }

    /**
     * Create a ResourceClient for a specific resource type.
     *
     * @param <ApiType> the resource type
     * @param <ApiListType> the resource list type
     * @param apiClient the API client
     * @param apiTypeClass the class of the resource type
     * @param apiListTypeClass the class of the resource list type
     * @param group the API group (empty string for core API)
     * @param version the API version
     * @param plural the plural resource name
     * @return a new ResourceClient
     */
    public static <ApiType extends KubernetesObject, ApiListType extends KubernetesListObject>
            ResourceClient<ApiType, ApiListType> create(
                    ApiClient apiClient,
                    Class<ApiType> apiTypeClass,
                    Class<ApiListType> apiListTypeClass,
                    String group,
                    String version,
                    String plural) {
        GenericKubernetesApi<ApiType, ApiListType> api =
                new GenericKubernetesApi<>(apiTypeClass, apiListTypeClass, group, version, plural, apiClient);
        return new ResourceClient<>(apiClient, api, apiTypeClass);
    }

    /**
     * Create a ResourceClient using an existing GenericKubernetesApi.
     *
     * @param <ApiType> the resource type
     * @param <ApiListType> the resource list type
     * @param apiClient the API client
     * @param api the GenericKubernetesApi
     * @param apiTypeClass the class of the resource type
     * @return a new ResourceClient
     */
    public static <ApiType extends KubernetesObject, ApiListType extends KubernetesListObject>
            ResourceClient<ApiType, ApiListType> create(
                    ApiClient apiClient,
                    GenericKubernetesApi<ApiType, ApiListType> api,
                    Class<ApiType> apiTypeClass) {
        return new ResourceClient<>(apiClient, api, apiTypeClass);
    }

    /**
     * Get the underlying GenericKubernetesApi.
     *
     * @return the GenericKubernetesApi
     */
    public GenericKubernetesApi<ApiType, ApiListType> getApi() {
        return api;
    }

    /**
     * Specify the namespace to operate in.
     *
     * @param namespace the namespace
     * @return this client for chaining
     */
    public ResourceClient<ApiType, ApiListType> inNamespace(String namespace) {
        ResourceClient<ApiType, ApiListType> copy = copy();
        copy.namespace = namespace;
        return copy;
    }

    /**
     * Specify the resource name to operate on.
     *
     * @param name the resource name
     * @return this client for chaining
     */
    public ResourceClient<ApiType, ApiListType> withName(String name) {
        ResourceClient<ApiType, ApiListType> copy = copy();
        copy.name = name;
        return copy;
    }

    /**
     * Add a label selector for list operations.
     *
     * @param key the label key
     * @param value the label value
     * @return this client for chaining
     */
    public ResourceClient<ApiType, ApiListType> withLabel(String key, String value) {
        ResourceClient<ApiType, ApiListType> copy = copy();
        String selector = key + "=" + value;
        copy.labelSelector = copy.labelSelector == null ? selector : copy.labelSelector + "," + selector;
        return copy;
    }

    /**
     * Add a label selector for list operations (label must exist).
     *
     * @param key the label key
     * @return this client for chaining
     */
    public ResourceClient<ApiType, ApiListType> withLabel(String key) {
        ResourceClient<ApiType, ApiListType> copy = copy();
        copy.labelSelector = copy.labelSelector == null ? key : copy.labelSelector + "," + key;
        return copy;
    }

    /**
     * Set the label selector for list operations.
     *
     * @param labelSelector the complete label selector string
     * @return this client for chaining
     */
    public ResourceClient<ApiType, ApiListType> withLabelSelector(String labelSelector) {
        ResourceClient<ApiType, ApiListType> copy = copy();
        copy.labelSelector = labelSelector;
        return copy;
    }

    /**
     * Set the field selector for list operations.
     *
     * @param fieldSelector the field selector string
     * @return this client for chaining
     */
    public ResourceClient<ApiType, ApiListType> withFieldSelector(String fieldSelector) {
        ResourceClient<ApiType, ApiListType> copy = copy();
        copy.fieldSelector = fieldSelector;
        return copy;
    }

    /**
     * Get a resource by name.
     *
     * @return the resource, or null if not found
     * @throws ApiException if an API error occurs
     */
    public ApiType get() throws ApiException {
        KubernetesApiResponse<ApiType> response;
        if (namespace != null) {
            response = api.get(namespace, name, new GetOptions());
        } else {
            response = api.get(name, new GetOptions());
        }
        if (!response.isSuccess() && response.getHttpStatusCode() == 404) {
            return null;
        }
        return response.throwsApiException().getObject();
    }

    /**
     * List resources.
     *
     * @return the list of resources
     * @throws ApiException if an API error occurs
     */
    public ApiListType list() throws ApiException {
        ListOptions options = new ListOptions();
        if (labelSelector != null) {
            options.setLabelSelector(labelSelector);
        }
        if (fieldSelector != null) {
            options.setFieldSelector(fieldSelector);
        }

        KubernetesApiResponse<ApiListType> response;
        if (namespace != null) {
            response = api.list(namespace, options);
        } else {
            response = api.list(options);
        }
        return response.throwsApiException().getObject();
    }

    /**
     * Create a new resource.
     *
     * @param resource the resource to create
     * @return the created resource
     * @throws ApiException if an API error occurs
     */
    public ApiType create(ApiType resource) throws ApiException {
        String ns = namespace != null ? namespace : getNamespaceFromResource(resource);
        KubernetesApiResponse<ApiType> response;
        if (ns != null) {
            response = api.create(ns, resource, new CreateOptions());
        } else {
            response = api.create(resource, new CreateOptions());
        }
        return response.throwsApiException().getObject();
    }

    /**
     * Update an existing resource.
     *
     * @param resource the resource to update
     * @return the updated resource
     * @throws ApiException if an API error occurs
     */
    public ApiType update(ApiType resource) throws ApiException {
        KubernetesApiResponse<ApiType> response = api.update(resource, new UpdateOptions());
        return response.throwsApiException().getObject();
    }

    /**
     * Create or replace a resource.
     * If the resource exists, it will be replaced; otherwise, it will be created.
     *
     * @param resource the resource to create or replace
     * @return the created or replaced resource
     * @throws ApiException if an API error occurs
     */
    public ApiType createOrReplace(ApiType resource) throws ApiException {
        String ns = namespace != null ? namespace : getNamespaceFromResource(resource);
        String resourceName = resource.getMetadata().getName();

        // Try to get existing resource
        KubernetesApiResponse<ApiType> existing;
        if (ns != null) {
            existing = api.get(ns, resourceName, new GetOptions());
        } else {
            existing = api.get(resourceName, new GetOptions());
        }

        if (existing.isSuccess()) {
            // Replace existing resource
            resource.getMetadata().setResourceVersion(existing.getObject().getMetadata().getResourceVersion());
            return update(resource);
        } else {
            // Create new resource
            return create(resource);
        }
    }

    /**
     * Delete a resource.
     *
     * @return true if deleted, false if not found
     * @throws ApiException if an API error occurs
     */
    public boolean delete() throws ApiException {
        Objects.requireNonNull(name, "Resource name must be specified");
        KubernetesApiResponse<ApiType> response;
        DeleteOptions options = new DeleteOptions();
        if (namespace != null) {
            response = api.delete(namespace, name, options);
        } else {
            response = api.delete(name, options);
        }
        if (response.getHttpStatusCode() == 404) {
            return false;
        }
        response.throwsApiException();
        return true;
    }

    /**
     * Delete a resource with options.
     *
     * @param deleteOptions the delete options
     * @return true if deleted, false if not found
     * @throws ApiException if an API error occurs
     */
    public boolean delete(V1DeleteOptions deleteOptions) throws ApiException {
        Objects.requireNonNull(name, "Resource name must be specified");
        DeleteOptions options = new DeleteOptions();
        if (deleteOptions.getGracePeriodSeconds() != null) {
            options.setGracePeriodSeconds(deleteOptions.getGracePeriodSeconds());
        }
        if (deleteOptions.getPropagationPolicy() != null) {
            options.setPropagationPolicy(deleteOptions.getPropagationPolicy());
        }
        KubernetesApiResponse<ApiType> response;
        if (namespace != null) {
            response = api.delete(namespace, name, options);
        } else {
            response = api.delete(name, options);
        }
        if (response.getHttpStatusCode() == 404) {
            return false;
        }
        response.throwsApiException();
        return true;
    }

    /**
     * Patch a resource using strategic merge patch.
     *
     * @param patchContent the patch content (JSON)
     * @return the patched resource
     * @throws ApiException if an API error occurs
     */
    public ApiType patch(String patchContent) throws ApiException {
        return patch(patchContent, V1Patch.PATCH_FORMAT_STRATEGIC_MERGE_PATCH);
    }

    /**
     * Patch a resource with a specific patch format.
     *
     * @param patchContent the patch content
     * @param patchFormat the patch format (e.g., application/strategic-merge-patch+json)
     * @return the patched resource
     * @throws ApiException if an API error occurs
     */
    public ApiType patch(String patchContent, String patchFormat) throws ApiException {
        Objects.requireNonNull(name, "Resource name must be specified");
        V1Patch patch = new V1Patch(patchContent);
        KubernetesApiResponse<ApiType> response;
        if (namespace != null) {
            response = api.patch(namespace, name, patchFormat, patch);
        } else {
            response = api.patch(name, patchFormat, patch);
        }
        return response.throwsApiException().getObject();
    }

    /**
     * Apply a resource using server-side apply.
     *
     * @param resource the resource to apply
     * @param fieldManager the field manager name
     * @return the applied resource
     * @throws ApiException if an API error occurs
     */
    public ApiType serverSideApply(ApiType resource, String fieldManager) throws ApiException {
        return serverSideApply(resource, fieldManager, false);
    }

    /**
     * Apply a resource using server-side apply.
     *
     * @param resource the resource to apply
     * @param fieldManager the field manager name
     * @param forceConflicts whether to force ownership of conflicting fields
     * @return the applied resource
     * @throws ApiException if an API error occurs
     */
    public ApiType serverSideApply(ApiType resource, String fieldManager, boolean forceConflicts)
            throws ApiException {
        String ns = namespace != null ? namespace : getNamespaceFromResource(resource);
        String resourceName = resource.getMetadata().getName();

        PatchOptions options = new PatchOptions();
        options.setFieldManager(fieldManager);
        options.setForce(forceConflicts);

        String yaml = Yaml.dump(resource);
        V1Patch patch = new V1Patch(yaml);

        KubernetesApiResponse<ApiType> response;
        if (ns != null) {
            response = api.patch(ns, resourceName, V1Patch.PATCH_FORMAT_APPLY_YAML, patch, options);
        } else {
            response = api.patch(resourceName, V1Patch.PATCH_FORMAT_APPLY_YAML, patch, options);
        }
        return response.throwsApiException().getObject();
    }

    /**
     * Edit a resource using a function.
     *
     * @param editor function that modifies the resource
     * @return the updated resource
     * @throws ApiException if an API error occurs
     */
    public ApiType edit(UnaryOperator<ApiType> editor) throws ApiException {
        ApiType current = get();
        if (current == null) {
            throw new ApiException(404, "Resource not found");
        }
        ApiType edited = editor.apply(current);
        return update(edited);
    }

    /**
     * Check if a resource exists.
     *
     * @return true if the resource exists
     * @throws ApiException if an API error occurs
     */
    public boolean exists() throws ApiException {
        return get() != null;
    }

    /**
     * Check if the resource is ready.
     *
     * @return true if the resource is ready
     * @throws ApiException if an API error occurs
     */
    public boolean isReady() throws ApiException {
        ApiType resource = get();
        if (resource == null) {
            return false;
        }
        return Readiness.isReady(resource);
    }

    /**
     * Wait until the resource is ready.
     *
     * @param timeout the maximum time to wait
     * @return the ready resource
     * @throws ApiException if an API error occurs
     * @throws InterruptedException if the wait is interrupted
     * @throws TimeoutException if the timeout is exceeded
     */
    public ApiType waitUntilReady(Duration timeout)
            throws ApiException, InterruptedException, TimeoutException {
        Objects.requireNonNull(name, "Resource name must be specified");
        return WaitUtils.waitUntilReady(api, namespace, name, timeout);
    }

    /**
     * Wait until the resource meets a condition.
     *
     * @param condition the condition to wait for
     * @param timeout the maximum time to wait
     * @return the resource meeting the condition
     * @throws ApiException if an API error occurs
     * @throws InterruptedException if the wait is interrupted
     * @throws TimeoutException if the timeout is exceeded
     */
    public ApiType waitUntilCondition(Predicate<ApiType> condition, Duration timeout)
            throws ApiException, InterruptedException, TimeoutException {
        Objects.requireNonNull(name, "Resource name must be specified");
        return WaitUtils.waitUntilCondition(api, namespace, name, condition, timeout);
    }

    /**
     * Wait until the resource is deleted.
     *
     * @param timeout the maximum time to wait
     * @throws ApiException if an API error occurs
     * @throws InterruptedException if the wait is interrupted
     * @throws TimeoutException if the timeout is exceeded
     */
    public void waitUntilDeleted(Duration timeout)
            throws ApiException, InterruptedException, TimeoutException {
        Objects.requireNonNull(name, "Resource name must be specified");
        final String ns = namespace;
        final String resourceName = name;
        WaitUtils.waitUntilDeleted(
                () -> {
                    KubernetesApiResponse<ApiType> response = ns != null 
                            ? api.get(ns, resourceName) 
                            : api.get(resourceName);
                    return response.isSuccess() ? response.getObject() : null;
                },
                timeout
        );
    }

    /**
     * Wait until the resource is ready, returning a CompletableFuture.
     *
     * @param timeout the maximum time to wait
     * @return a CompletableFuture that completes with the ready resource
     */
    public CompletableFuture<ApiType> waitUntilReadyAsync(Duration timeout) {
        Objects.requireNonNull(name, "Resource name must be specified");
        final String ns = namespace;
        final String resourceName = name;
        return WaitUtils.waitUntilReadyAsync(
                () -> {
                    KubernetesApiResponse<ApiType> response = ns != null 
                            ? api.get(ns, resourceName) 
                            : api.get(resourceName);
                    return response.isSuccess() ? response.getObject() : null;
                },
                timeout,
                Duration.ofSeconds(1)
        );
    }

    /**
     * Wait until the resource meets a condition, returning a CompletableFuture.
     *
     * @param condition the condition to wait for
     * @param timeout the maximum time to wait
     * @return a CompletableFuture that completes with the resource
     */
    public CompletableFuture<ApiType> waitUntilConditionAsync(Predicate<ApiType> condition, Duration timeout) {
        Objects.requireNonNull(name, "Resource name must be specified");
        final String ns = namespace;
        final String resourceName = name;
        return WaitUtils.waitUntilConditionAsync(
                () -> {
                    KubernetesApiResponse<ApiType> response = ns != null 
                            ? api.get(ns, resourceName) 
                            : api.get(resourceName);
                    return response.isSuccess() ? response.getObject() : null;
                },
                condition,
                timeout,
                Duration.ofSeconds(1)
        );
    }

    /**
     * Create a copy of this client with the current settings.
     */
    private ResourceClient<ApiType, ApiListType> copy() {
        ResourceClient<ApiType, ApiListType> copy = new ResourceClient<>(apiClient, api, apiTypeClass);
        copy.namespace = this.namespace;
        copy.name = this.name;
        copy.labelSelector = this.labelSelector;
        copy.fieldSelector = this.fieldSelector;
        return copy;
    }

    private String getNamespaceFromResource(ApiType resource) {
        if (resource.getMetadata() != null && resource.getMetadata().getNamespace() != null) {
            return resource.getMetadata().getNamespace();
        }
        return null;
    }
}
