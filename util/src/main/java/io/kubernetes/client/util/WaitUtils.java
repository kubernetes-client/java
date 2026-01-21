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
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import io.kubernetes.client.util.generic.KubernetesApiResponse;

import java.time.Duration;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Utilities for waiting on Kubernetes resources to reach desired conditions.
 * Provides fabric8-style waitUntilReady and waitUntilCondition functionality.
 *
 * <p>Example usage:
 * <pre>{@code
 * // Wait for a Pod to be ready
 * V1Pod pod = WaitUtils.waitUntilReady(
 *     () -> coreV1Api.readNamespacedPod("my-pod", "default").execute(),
 *     Duration.ofMinutes(5),
 *     Duration.ofSeconds(1)
 * );
 * 
 * // Wait for a custom condition
 * V1Pod runningPod = WaitUtils.waitUntilCondition(
 *     () -> coreV1Api.readNamespacedPod("my-pod", "default").execute(),
 *     pod -> "Running".equals(pod.getStatus().getPhase()),
 *     Duration.ofMinutes(5),
 *     Duration.ofSeconds(1)
 * );
 * 
 * // Using GenericKubernetesApi
 * V1Pod readyPod = WaitUtils.waitUntilReady(
 *     podApi, 
 *     "default", 
 *     "my-pod", 
 *     Duration.ofMinutes(5)
 * );
 * }</pre>
 */
public class WaitUtils {

    private static final Duration DEFAULT_POLL_INTERVAL = Duration.ofSeconds(1);

    private WaitUtils() {
        // Utility class
    }

    /**
     * Waits until the resource is ready using the Readiness utility.
     *
     * @param <T> the resource type
     * @param resourceSupplier supplier that fetches the current state of the resource
     * @param timeout maximum time to wait
     * @param pollInterval time between checks
     * @return the ready resource
     * @throws TimeoutException if the resource doesn't become ready within the timeout
     * @throws InterruptedException if the thread is interrupted
     */
    public static <T extends KubernetesObject> T waitUntilReady(
            Supplier<T> resourceSupplier,
            Duration timeout,
            Duration pollInterval) throws TimeoutException, InterruptedException {
        return waitUntilCondition(resourceSupplier, Readiness::isReady, timeout, pollInterval);
    }

    /**
     * Waits until the resource is ready using the Readiness utility with default poll interval.
     *
     * @param <T> the resource type
     * @param resourceSupplier supplier that fetches the current state of the resource
     * @param timeout maximum time to wait
     * @return the ready resource
     * @throws TimeoutException if the resource doesn't become ready within the timeout
     * @throws InterruptedException if the thread is interrupted
     */
    public static <T extends KubernetesObject> T waitUntilReady(
            Supplier<T> resourceSupplier,
            Duration timeout) throws TimeoutException, InterruptedException {
        return waitUntilReady(resourceSupplier, timeout, DEFAULT_POLL_INTERVAL);
    }

    /**
     * Waits until the resource satisfies the given condition.
     *
     * @param <T> the resource type
     * @param resourceSupplier supplier that fetches the current state of the resource
     * @param condition predicate that tests if the condition is met
     * @param timeout maximum time to wait
     * @param pollInterval time between checks
     * @return the resource that satisfies the condition
     * @throws TimeoutException if the condition is not met within the timeout
     * @throws InterruptedException if the thread is interrupted
     */
    public static <T extends KubernetesObject> T waitUntilCondition(
            Supplier<T> resourceSupplier,
            Predicate<T> condition,
            Duration timeout,
            Duration pollInterval) throws TimeoutException, InterruptedException {

        Objects.requireNonNull(resourceSupplier, "resourceSupplier must not be null");
        Objects.requireNonNull(condition, "condition must not be null");
        Objects.requireNonNull(timeout, "timeout must not be null");
        Objects.requireNonNull(pollInterval, "pollInterval must not be null");

        CompletableFuture<T> future = new CompletableFuture<>();
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

        try {
            ScheduledFuture<?> scheduledTask = executor.scheduleAtFixedRate(() -> {
                try {
                    T resource = resourceSupplier.get();
                    if (resource != null && condition.test(resource)) {
                        future.complete(resource);
                    }
                } catch (Exception e) {
                    // Log but don't fail - resource might not exist yet
                    // We'll keep polling until timeout
                }
            }, 0, pollInterval.toMillis(), TimeUnit.MILLISECONDS);

            try {
                return future.get(timeout.toMillis(), TimeUnit.MILLISECONDS);
            } finally {
                scheduledTask.cancel(true);
            }
        } catch (ExecutionException e) {
            throw new RuntimeException("Unexpected error while waiting", e.getCause());
        } finally {
            executor.shutdownNow();
        }
    }

    /**
     * Waits until the resource satisfies the given condition with default poll interval.
     *
     * @param <T> the resource type
     * @param resourceSupplier supplier that fetches the current state of the resource
     * @param condition predicate that tests if the condition is met
     * @param timeout maximum time to wait
     * @return the resource that satisfies the condition
     * @throws TimeoutException if the condition is not met within the timeout
     * @throws InterruptedException if the thread is interrupted
     */
    public static <T extends KubernetesObject> T waitUntilCondition(
            Supplier<T> resourceSupplier,
            Predicate<T> condition,
            Duration timeout) throws TimeoutException, InterruptedException {
        return waitUntilCondition(resourceSupplier, condition, timeout, DEFAULT_POLL_INTERVAL);
    }

    /**
     * Waits until the resource is deleted (returns null or throws 404).
     *
     * @param <T> the resource type
     * @param resourceSupplier supplier that fetches the current state of the resource
     * @param timeout maximum time to wait
     * @param pollInterval time between checks
     * @throws TimeoutException if the resource is not deleted within the timeout
     * @throws InterruptedException if the thread is interrupted
     */
    public static <T extends KubernetesObject> void waitUntilDeleted(
            Supplier<T> resourceSupplier,
            Duration timeout,
            Duration pollInterval) throws TimeoutException, InterruptedException {

        Objects.requireNonNull(resourceSupplier, "resourceSupplier must not be null");
        Objects.requireNonNull(timeout, "timeout must not be null");
        Objects.requireNonNull(pollInterval, "pollInterval must not be null");

        CompletableFuture<Void> future = new CompletableFuture<>();
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

        try {
            ScheduledFuture<?> scheduledTask = executor.scheduleAtFixedRate(() -> {
                try {
                    T resource = resourceSupplier.get();
                    if (resource == null) {
                        future.complete(null);
                    }
                } catch (Exception e) {
                    // Treat any exception as deleted (typically 404)
                    future.complete(null);
                }
            }, 0, pollInterval.toMillis(), TimeUnit.MILLISECONDS);

            try {
                future.get(timeout.toMillis(), TimeUnit.MILLISECONDS);
            } finally {
                scheduledTask.cancel(true);
            }
        } catch (ExecutionException e) {
            throw new RuntimeException("Unexpected error while waiting for deletion", e.getCause());
        } finally {
            executor.shutdownNow();
        }
    }

    /**
     * Waits until the resource is deleted with default poll interval.
     *
     * @param <T> the resource type
     * @param resourceSupplier supplier that fetches the current state of the resource
     * @param timeout maximum time to wait
     * @throws TimeoutException if the resource is not deleted within the timeout
     * @throws InterruptedException if the thread is interrupted
     */
    public static <T extends KubernetesObject> void waitUntilDeleted(
            Supplier<T> resourceSupplier,
            Duration timeout) throws TimeoutException, InterruptedException {
        waitUntilDeleted(resourceSupplier, timeout, DEFAULT_POLL_INTERVAL);
    }

    /**
     * Waits until a resource is ready using GenericKubernetesApi.
     *
     * @param <T> the resource type
     * @param <L> the list type
     * @param api the GenericKubernetesApi
     * @param namespace the namespace (null for cluster-scoped resources)
     * @param name the resource name
     * @param timeout maximum time to wait
     * @return the ready resource
     * @throws TimeoutException if the resource doesn't become ready within the timeout
     * @throws InterruptedException if the thread is interrupted
     */
    public static <T extends KubernetesObject, L extends io.kubernetes.client.common.KubernetesListObject> T waitUntilReady(
            GenericKubernetesApi<T, L> api,
            String namespace,
            String name,
            Duration timeout) throws TimeoutException, InterruptedException {

        return waitUntilCondition(
                () -> {
                    KubernetesApiResponse<T> response = namespace != null 
                            ? api.get(namespace, name) 
                            : api.get(name);
                    return response.isSuccess() ? response.getObject() : null;
                },
                Readiness::isReady,
                timeout,
                DEFAULT_POLL_INTERVAL
        );
    }

    /**
     * Waits until a resource satisfies the given condition using GenericKubernetesApi.
     *
     * @param <T> the resource type
     * @param <L> the list type
     * @param api the GenericKubernetesApi
     * @param namespace the namespace (null for cluster-scoped resources)
     * @param name the resource name
     * @param condition predicate that tests if the condition is met
     * @param timeout maximum time to wait
     * @return the resource that satisfies the condition
     * @throws TimeoutException if the condition is not met within the timeout
     * @throws InterruptedException if the thread is interrupted
     */
    public static <T extends KubernetesObject, L extends io.kubernetes.client.common.KubernetesListObject> T waitUntilCondition(
            GenericKubernetesApi<T, L> api,
            String namespace,
            String name,
            Predicate<T> condition,
            Duration timeout) throws TimeoutException, InterruptedException {

        return waitUntilCondition(
                () -> {
                    KubernetesApiResponse<T> response = namespace != null 
                            ? api.get(namespace, name) 
                            : api.get(name);
                    return response.isSuccess() ? response.getObject() : null;
                },
                condition,
                timeout,
                DEFAULT_POLL_INTERVAL
        );
    }

    /**
     * Waits until a cluster-scoped resource is ready.
     *
     * @param <T> the resource type
     * @param <L> the list type
     * @param api the GenericKubernetesApi
     * @param name the resource name
     * @param timeout maximum time to wait
     * @return the ready resource
     * @throws TimeoutException if the resource doesn't become ready within the timeout
     * @throws InterruptedException if the thread is interrupted
     */
    public static <T extends KubernetesObject, L extends io.kubernetes.client.common.KubernetesListObject> T waitUntilReady(
            GenericKubernetesApi<T, L> api,
            String name,
            Duration timeout) throws TimeoutException, InterruptedException {
        return waitUntilReady(api, null, name, timeout);
    }

    /**
     * Asynchronously waits until the resource is ready.
     *
     * @param <T> the resource type
     * @param resourceSupplier supplier that fetches the current state of the resource
     * @param timeout maximum time to wait
     * @param pollInterval time between checks
     * @return CompletableFuture that completes with the ready resource
     */
    public static <T extends KubernetesObject> CompletableFuture<T> waitUntilReadyAsync(
            Supplier<T> resourceSupplier,
            Duration timeout,
            Duration pollInterval) {
        return waitUntilConditionAsync(resourceSupplier, Readiness::isReady, timeout, pollInterval);
    }

    /**
     * Asynchronously waits until the resource satisfies the given condition.
     *
     * @param <T> the resource type
     * @param resourceSupplier supplier that fetches the current state of the resource
     * @param condition predicate that tests if the condition is met
     * @param timeout maximum time to wait
     * @param pollInterval time between checks
     * @return CompletableFuture that completes with the resource or exceptionally with TimeoutException
     */
    public static <T extends KubernetesObject> CompletableFuture<T> waitUntilConditionAsync(
            Supplier<T> resourceSupplier,
            Predicate<T> condition,
            Duration timeout,
            Duration pollInterval) {

        CompletableFuture<T> result = new CompletableFuture<>();
        
        CompletableFuture.runAsync(() -> {
            try {
                T resource = waitUntilCondition(resourceSupplier, condition, timeout, pollInterval);
                result.complete(resource);
            } catch (TimeoutException e) {
                result.completeExceptionally(e);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                result.completeExceptionally(e);
            }
        });

        return result;
    }
}
