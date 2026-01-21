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

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodCondition;
import io.kubernetes.client.openapi.models.V1PodStatus;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;

class WaitUtilsTest {

    @Test
    void waitUntilReady_alreadyReady_returnsImmediately() throws Exception {
        V1Pod readyPod = createReadyPod();
        Supplier<V1Pod> supplier = () -> readyPod;

        V1Pod result = WaitUtils.waitUntilReady(supplier, Duration.ofSeconds(5));

        assertThat(result).isEqualTo(readyPod);
    }

    @Test
    void waitUntilReady_becomesReady_returnsWhenReady() throws Exception {
        AtomicInteger callCount = new AtomicInteger(0);
        V1Pod readyPod = createReadyPod();
        V1Pod notReadyPod = createNotReadyPod();

        Supplier<V1Pod> supplier = () -> {
            if (callCount.incrementAndGet() >= 3) {
                return readyPod;
            }
            return notReadyPod;
        };

        V1Pod result = WaitUtils.waitUntilReady(supplier, Duration.ofSeconds(5), Duration.ofMillis(100));

        assertThat(result).isEqualTo(readyPod);
        assertThat(callCount.get()).isGreaterThanOrEqualTo(3);
    }

    @Test
    void waitUntilReady_timesOut_throwsTimeoutException() {
        V1Pod notReadyPod = createNotReadyPod();
        Supplier<V1Pod> supplier = () -> notReadyPod;

        assertThatThrownBy(() -> 
                WaitUtils.waitUntilReady(supplier, Duration.ofMillis(200), Duration.ofMillis(50)))
                .isInstanceOf(TimeoutException.class);
    }

    @Test
    void waitUntilCondition_conditionMet_returnsResource() throws Exception {
        V1Pod pod = new V1Pod()
                .metadata(new V1ObjectMeta().name("test"))
                .status(new V1PodStatus().phase("Running"));

        V1Pod result = WaitUtils.waitUntilCondition(
                () -> pod,
                p -> "Running".equals(p.getStatus().getPhase()),
                Duration.ofSeconds(5),
                Duration.ofMillis(100));

        assertThat(result).isEqualTo(pod);
    }

    @Test
    void waitUntilCondition_becomesTrue_returnsWhenConditionMet() throws Exception {
        AtomicInteger callCount = new AtomicInteger(0);

        Supplier<V1Pod> supplier = () -> {
            V1Pod pod = new V1Pod().metadata(new V1ObjectMeta().name("test"));
            if (callCount.incrementAndGet() >= 3) {
                pod.setStatus(new V1PodStatus().phase("Running"));
            } else {
                pod.setStatus(new V1PodStatus().phase("Pending"));
            }
            return pod;
        };

        V1Pod result = WaitUtils.waitUntilCondition(
                supplier,
                p -> "Running".equals(p.getStatus().getPhase()),
                Duration.ofSeconds(5),
                Duration.ofMillis(100));

        assertThat(result.getStatus().getPhase()).isEqualTo("Running");
    }

    @Test
    void waitUntilCondition_nullResource_keepsPolling() {
        AtomicInteger callCount = new AtomicInteger(0);
        Supplier<V1Pod> supplier = () -> {
            callCount.incrementAndGet();
            return null;
        };

        assertThatThrownBy(() -> 
                WaitUtils.waitUntilCondition(
                        supplier,
                        p -> true,
                        Duration.ofMillis(300),
                        Duration.ofMillis(50)))
                .isInstanceOf(TimeoutException.class);

        assertThat(callCount.get()).isGreaterThan(1);
    }

    @Test
    void waitUntilCondition_supplierThrows_keepsPolling() throws Exception {
        AtomicInteger callCount = new AtomicInteger(0);
        V1Pod readyPod = createReadyPod();

        Supplier<V1Pod> supplier = () -> {
            if (callCount.incrementAndGet() < 3) {
                throw new RuntimeException("Simulated error");
            }
            return readyPod;
        };

        V1Pod result = WaitUtils.waitUntilCondition(
                supplier,
                p -> true,
                Duration.ofSeconds(5),
                Duration.ofMillis(100));

        assertThat(result).isEqualTo(readyPod);
    }

    @Test
    void waitUntilDeleted_resourceGone_returns() throws Exception {
        AtomicInteger callCount = new AtomicInteger(0);

        Supplier<V1Pod> supplier = () -> {
            if (callCount.incrementAndGet() >= 3) {
                return null;
            }
            return createReadyPod();
        };

        WaitUtils.waitUntilDeleted(supplier, Duration.ofSeconds(5), Duration.ofMillis(100));

        assertThat(callCount.get()).isGreaterThanOrEqualTo(3);
    }

    @Test
    void waitUntilDeleted_supplierThrows_treatsAsDeleted() throws Exception {
        AtomicInteger callCount = new AtomicInteger(0);

        Supplier<V1Pod> supplier = () -> {
            if (callCount.incrementAndGet() >= 2) {
                throw new RuntimeException("Not found");
            }
            return createReadyPod();
        };

        WaitUtils.waitUntilDeleted(supplier, Duration.ofSeconds(5), Duration.ofMillis(100));

        assertThat(callCount.get()).isGreaterThanOrEqualTo(2);
    }

    @Test
    void waitUntilDeleted_notDeleted_timesOut() {
        Supplier<V1Pod> supplier = () -> createReadyPod();

        assertThatThrownBy(() -> 
                WaitUtils.waitUntilDeleted(supplier, Duration.ofMillis(200), Duration.ofMillis(50)))
                .isInstanceOf(TimeoutException.class);
    }

    @Test
    void waitUntilReadyAsync_returnsCompletableFuture() throws Exception {
        V1Pod readyPod = createReadyPod();
        Supplier<V1Pod> supplier = () -> readyPod;

        CompletableFuture<V1Pod> future = WaitUtils.waitUntilReadyAsync(
                supplier, Duration.ofSeconds(5), Duration.ofMillis(100));

        assertThat(future).isNotNull();
        assertThat(future.get()).isEqualTo(readyPod);
    }

    @Test
    void waitUntilConditionAsync_returnsCompletableFuture() throws Exception {
        V1Pod pod = new V1Pod()
                .metadata(new V1ObjectMeta().name("test"))
                .status(new V1PodStatus().phase("Running"));

        CompletableFuture<V1Pod> future = WaitUtils.waitUntilConditionAsync(
                () -> pod,
                p -> "Running".equals(p.getStatus().getPhase()),
                Duration.ofSeconds(5),
                Duration.ofMillis(100));

        assertThat(future).isNotNull();
        assertThat(future.get()).isEqualTo(pod);
    }

    @Test
    void waitUntilCondition_nullSupplier_throwsNullPointerException() {
        assertThatThrownBy(() -> 
                WaitUtils.waitUntilCondition(null, p -> true, Duration.ofSeconds(1), Duration.ofMillis(100)))
                .isInstanceOf(NullPointerException.class)
                .hasMessageContaining("resourceSupplier");
    }

    @Test
    void waitUntilCondition_nullCondition_throwsNullPointerException() {
        assertThatThrownBy(() -> 
                WaitUtils.waitUntilCondition(() -> createReadyPod(), null, Duration.ofSeconds(1), Duration.ofMillis(100)))
                .isInstanceOf(NullPointerException.class)
                .hasMessageContaining("condition");
    }

    @Test
    void waitUntilCondition_nullTimeout_throwsNullPointerException() {
        assertThatThrownBy(() -> 
                WaitUtils.waitUntilCondition(() -> createReadyPod(), p -> true, null, Duration.ofMillis(100)))
                .isInstanceOf(NullPointerException.class)
                .hasMessageContaining("timeout");
    }

    private V1Pod createReadyPod() {
        return new V1Pod()
                .metadata(new V1ObjectMeta().name("test-pod"))
                .status(new V1PodStatus()
                        .phase("Running")
                        .conditions(List.of(
                                new V1PodCondition()
                                        .type("Ready")
                                        .status("True"))));
    }

    private V1Pod createNotReadyPod() {
        return new V1Pod()
                .metadata(new V1ObjectMeta().name("test-pod"))
                .status(new V1PodStatus()
                        .phase("Pending")
                        .conditions(List.of(
                                new V1PodCondition()
                                        .type("Ready")
                                        .status("False"))));
    }
}
