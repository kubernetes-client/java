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
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import io.kubernetes.client.util.generic.KubernetesApiResponse;
import io.kubernetes.client.util.generic.options.PatchOptions;

import java.util.Objects;

/**
 * Utility class for server-side apply operations on Kubernetes resources.
 * Server-side apply allows declarative configuration management where the server
 * determines the merge strategy based on field ownership.
 *
 * <p>This provides fabric8-style convenience methods for server-side apply operations.
 *
 * <p>Example usage:
 * <pre>{@code
 * // Simple server-side apply
 * V1Pod appliedPod = ServerSideApply.apply(
 *     apiClient,
 *     V1Pod.class,
 *     V1PodList.class,
 *     deployment,
 *     "my-field-manager"
 * );
 *
 * // Force conflicts (take ownership of fields)
 * V1Deployment deployment = ServerSideApply.builder(apiClient)
 *     .apiTypeClass(V1Deployment.class)
 *     .apiListTypeClass(V1DeploymentList.class)
 *     .resource(myDeployment)
 *     .fieldManager("my-controller")
 *     .forceConflicts(true)
 *     .apply();
 *
 * // Dry run
 * V1ConfigMap result = ServerSideApply.builder(apiClient)
 *     .apiTypeClass(V1ConfigMap.class)
 *     .apiListTypeClass(V1ConfigMapList.class)
 *     .resource(configMap)
 *     .fieldManager("my-app")
 *     .dryRun()
 *     .apply();
 * }</pre>
 */
public class ServerSideApply {

    public static final String DEFAULT_FIELD_MANAGER = "kubernetes-java-client";
    public static final String DRY_RUN_ALL = "All";

    private ServerSideApply() {
        // Utility class
    }

    /**
     * Apply a Kubernetes resource using server-side apply.
     *
     * @param <ApiType> the resource type
     * @param <ApiListType> the resource list type
     * @param apiClient the API client
     * @param apiTypeClass the class of the resource type
     * @param apiListTypeClass the class of the resource list type
     * @param resource the resource to apply
     * @param fieldManager the field manager name (identifies the actor making changes)
     * @return the applied resource
     * @throws ApiException if an API error occurs
     */
    public static <ApiType extends KubernetesObject, ApiListType extends KubernetesListObject>
            ApiType apply(
                    ApiClient apiClient,
                    Class<ApiType> apiTypeClass,
                    Class<ApiListType> apiListTypeClass,
                    ApiType resource,
                    String fieldManager)
            throws ApiException {
        Builder<ApiType, ApiListType> b = new Builder<>(apiClient);
        return b.apiTypeClass(apiTypeClass)
                .apiListTypeClass(apiListTypeClass)
                .resource(resource)
                .fieldManager(fieldManager)
                .apply();
    }

    /**
     * Apply a Kubernetes resource using server-side apply with force conflicts.
     *
     * @param <ApiType> the resource type
     * @param <ApiListType> the resource list type
     * @param apiClient the API client
     * @param apiTypeClass the class of the resource type
     * @param apiListTypeClass the class of the resource list type
     * @param resource the resource to apply
     * @param fieldManager the field manager name
     * @param forceConflicts whether to force ownership of conflicting fields
     * @return the applied resource
     * @throws ApiException if an API error occurs
     */
    public static <ApiType extends KubernetesObject, ApiListType extends KubernetesListObject>
            ApiType apply(
                    ApiClient apiClient,
                    Class<ApiType> apiTypeClass,
                    Class<ApiListType> apiListTypeClass,
                    ApiType resource,
                    String fieldManager,
                    boolean forceConflicts)
            throws ApiException {
        Builder<ApiType, ApiListType> b = new Builder<>(apiClient);
        return b.apiTypeClass(apiTypeClass)
                .apiListTypeClass(apiListTypeClass)
                .resource(resource)
                .fieldManager(fieldManager)
                .forceConflicts(forceConflicts)
                .apply();
    }

    /**
     * Apply a resource using an existing GenericKubernetesApi.
     *
     * @param <ApiType> the resource type
     * @param <ApiListType> the resource list type
     * @param genericApi the GenericKubernetesApi to use
     * @param resource the resource to apply
     * @param fieldManager the field manager name
     * @return the applied resource
     * @throws ApiException if an API error occurs
     */
    public static <ApiType extends KubernetesObject, ApiListType extends KubernetesListObject>
            ApiType apply(
                    GenericKubernetesApi<ApiType, ApiListType> genericApi,
                    ApiType resource,
                    String fieldManager)
            throws ApiException {
        return applyInternal(genericApi, resource, fieldManager, false, null);
    }

    /**
     * Apply a resource using an existing GenericKubernetesApi with force conflicts.
     *
     * @param <ApiType> the resource type
     * @param <ApiListType> the resource list type
     * @param genericApi the GenericKubernetesApi to use
     * @param resource the resource to apply
     * @param fieldManager the field manager name
     * @param forceConflicts whether to force ownership of conflicting fields
     * @return the applied resource
     * @throws ApiException if an API error occurs
     */
    public static <ApiType extends KubernetesObject, ApiListType extends KubernetesListObject>
            ApiType apply(
                    GenericKubernetesApi<ApiType, ApiListType> genericApi,
                    ApiType resource,
                    String fieldManager,
                    boolean forceConflicts)
            throws ApiException {
        return applyInternal(genericApi, resource, fieldManager, forceConflicts, null);
    }

    /**
     * Create a builder for server-side apply operations.
     *
     * @param <ApiType> the resource type
     * @param <ApiListType> the resource list type
     * @param apiClient the API client
     * @return a new builder
     */
    public static <ApiType extends KubernetesObject, ApiListType extends KubernetesListObject>
            Builder<ApiType, ApiListType> builder(ApiClient apiClient) {
        return new Builder<>(apiClient);
    }

    /**
     * Internal method to perform the server-side apply.
     */
    private static <ApiType extends KubernetesObject, ApiListType extends KubernetesListObject>
            ApiType applyInternal(
                    GenericKubernetesApi<ApiType, ApiListType> api,
                    ApiType resource,
                    String fieldManager,
                    boolean forceConflicts,
                    String dryRun)
            throws ApiException {

        Objects.requireNonNull(api, "GenericKubernetesApi must not be null");
        Objects.requireNonNull(resource, "Resource must not be null");
        Objects.requireNonNull(resource.getMetadata(), "Resource metadata must not be null");
        Objects.requireNonNull(resource.getMetadata().getName(), "Resource name must not be null");

        if (fieldManager == null || fieldManager.isEmpty()) {
            fieldManager = DEFAULT_FIELD_MANAGER;
        }

        PatchOptions patchOptions = new PatchOptions();
        patchOptions.setFieldManager(fieldManager);
        patchOptions.setForce(forceConflicts);
        if (dryRun != null) {
            patchOptions.setDryRun(dryRun);
        }

        // Serialize the resource to YAML for apply-patch+yaml content type
        String resourceYaml = Yaml.dump(resource);
        V1Patch patch = new V1Patch(resourceYaml);

        String namespace = resource.getMetadata().getNamespace();
        String name = resource.getMetadata().getName();

        KubernetesApiResponse<ApiType> response;
        if (namespace != null && !namespace.isEmpty()) {
            response = api.patch(namespace, name, V1Patch.PATCH_FORMAT_APPLY_YAML, patch, patchOptions);
        } else {
            response = api.patch(name, V1Patch.PATCH_FORMAT_APPLY_YAML, patch, patchOptions);
        }

        return response.throwsApiException().getObject();
    }

    /**
     * Builder for server-side apply operations providing a fluent API.
     *
     * @param <ApiType> the resource type
     * @param <ApiListType> the resource list type
     */
    public static class Builder<ApiType extends KubernetesObject, ApiListType extends KubernetesListObject> {

        private final ApiClient apiClient;
        private Class<ApiType> apiTypeClass;
        private Class<ApiListType> apiListTypeClass;
        private ApiType resource;
        private String fieldManager = DEFAULT_FIELD_MANAGER;
        private boolean forceConflicts = false;
        private String dryRun = null;

        private Builder(ApiClient apiClient) {
            this.apiClient = Objects.requireNonNull(apiClient, "ApiClient must not be null");
        }

        /**
         * Set the API type class.
         */
        public Builder<ApiType, ApiListType> apiTypeClass(Class<ApiType> apiTypeClass) {
            this.apiTypeClass = apiTypeClass;
            return this;
        }

        /**
         * Set the API list type class.
         */
        public Builder<ApiType, ApiListType> apiListTypeClass(Class<ApiListType> apiListTypeClass) {
            this.apiListTypeClass = apiListTypeClass;
            return this;
        }

        /**
         * Set the resource to apply.
         */
        public Builder<ApiType, ApiListType> resource(ApiType resource) {
            this.resource = resource;
            return this;
        }

        /**
         * Set the field manager name.
         * The field manager identifies the actor or entity making changes.
         */
        public Builder<ApiType, ApiListType> fieldManager(String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set whether to force ownership of conflicting fields.
         * When true, the apply operation will take ownership of fields
         * that were previously managed by other field managers.
         */
        public Builder<ApiType, ApiListType> forceConflicts(boolean forceConflicts) {
            this.forceConflicts = forceConflicts;
            return this;
        }

        /**
         * Enable dry run mode.
         * When enabled, the server processes the request without persisting changes.
         */
        public Builder<ApiType, ApiListType> dryRun() {
            this.dryRun = DRY_RUN_ALL;
            return this;
        }

        /**
         * Set dry run mode with a specific value.
         * @param dryRun the dry run value (typically "All" or null)
         */
        public Builder<ApiType, ApiListType> dryRun(String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Execute the server-side apply operation.
         *
         * @return the applied resource
         * @throws ApiException if an API error occurs
         */
        public ApiType apply() throws ApiException {
            Objects.requireNonNull(apiTypeClass, "apiTypeClass must be set");
            Objects.requireNonNull(apiListTypeClass, "apiListTypeClass must be set");
            Objects.requireNonNull(resource, "resource must be set");

            GenericKubernetesApi<ApiType, ApiListType> api =
                    new GenericKubernetesApi<>(
                            apiTypeClass,
                            apiListTypeClass,
                            getApiGroupFromResource(),
                            getApiVersionFromResource(),
                            getPluralFromResource(),
                            apiClient);

            return applyInternal(api, resource, fieldManager, forceConflicts, dryRun);
        }

        private String getApiGroupFromResource() {
            String apiVersion = resource.getApiVersion();
            if (apiVersion == null) {
                return "";
            }
            if (apiVersion.contains("/")) {
                return apiVersion.substring(0, apiVersion.indexOf('/'));
            }
            return "";
        }

        private String getApiVersionFromResource() {
            String apiVersion = resource.getApiVersion();
            if (apiVersion == null) {
                return "v1";
            }
            if (apiVersion.contains("/")) {
                return apiVersion.substring(apiVersion.indexOf('/') + 1);
            }
            return apiVersion;
        }

        private String getPluralFromResource() {
            String kind = resource.getKind();
            if (kind == null) {
                throw new IllegalStateException("Resource kind must not be null");
            }
            return pluralize(kind);
        }

        /**
         * Simple pluralization for Kubernetes resource kinds.
         */
        private String pluralize(String kind) {
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
    }
}
