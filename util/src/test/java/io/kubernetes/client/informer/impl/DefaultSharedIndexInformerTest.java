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
package io.kubernetes.client.informer.impl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

import io.kubernetes.client.informer.ListerWatcher;
import io.kubernetes.client.informer.cache.Cache;
import io.kubernetes.client.informer.cache.Caches;
import io.kubernetes.client.informer.cache.DeltaFIFO;
import io.kubernetes.client.informer.cache.Indexer;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodList;
import io.kubernetes.client.util.Threads;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.function.BiConsumer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class DefaultSharedIndexInformerTest {

  private static final Class<V1Pod> anyApiType = V1Pod.class;
  private static final long anyResyncPeriod = 1000L;

  @Mock private ListerWatcher<V1Pod, V1PodList> listerWatcher;
  @Mock private DeltaFIFO deltaFIFOMock;
  @Mock private Indexer<V1Pod> indexerMock;
  @Mock private BiConsumer<Class<V1Pod>, Throwable> exceptionHandler;
  @Mock private ThreadFactory threadFactory;
  @Mock private Thread thread;

  @Test
  void constructorUsesDefaultThreadFactory() {
    when(threadFactory.newThread(any())).thenReturn(thread);

    try {
      Threads.setDefaultThreadFactory(threadFactory);
      new DefaultSharedIndexInformer<>(
          anyApiType, listerWatcher, anyResyncPeriod, deltaFIFOMock, indexerMock, exceptionHandler);
    } finally { // revert to default
      Threads.setDefaultThreadFactory(Executors.defaultThreadFactory());
    }

    verify(threadFactory).newThread(any());
    verify(thread).setName("informer-controller-V1Pod");
    verifyNoMoreInteractions(threadFactory, thread);
  }

  @Test
  void constructorWithExceptionHandlerExists() {

    new DefaultSharedIndexInformer<>(
        anyApiType, listerWatcher, anyResyncPeriod, deltaFIFOMock, indexerMock, exceptionHandler);
  }

  @Test
  void constructorWithoutExceptionHandlerExists() {

    new DefaultSharedIndexInformer<>(
        anyApiType, listerWatcher, anyResyncPeriod, deltaFIFOMock, indexerMock);
  }

  @Test
  void handleNullDeltas() {
    DefaultSharedIndexInformer<V1Pod, V1PodList> informer =
        new DefaultSharedIndexInformer<>(anyApiType, listerWatcher, anyResyncPeriod);

    informer.handleDeltas(null);
  }

  @Test
  void minimalConstructorExists() {

    new DefaultSharedIndexInformer<>(anyApiType, listerWatcher, anyResyncPeriod);
  }

  @ParameterizedTest
  @CsvSource({
    "true,false,false",
    "true,true,false",
    "false,true,false",
    "true,false,true",
    "true,true,true",
    "false,true,true"
  })
  void relistReconcilesPendingAndCachedObjects(boolean queued, boolean cached, boolean present)
      throws InterruptedException {
    V1Pod pod =
        new V1Pod()
            .metadata(new V1ObjectMeta().namespace("default").name("foo").resourceVersion("2"));
    V1Pod listedPod =
        new V1Pod()
            .metadata(new V1ObjectMeta().namespace("default").name("foo").resourceVersion("3"));
    Cache<V1Pod> cache = new Cache<>();
    DeltaFIFO fifo = new DeltaFIFO(Caches::deletionHandlingMetaNamespaceKeyFunc, cache);
    DefaultSharedIndexInformer<V1Pod, V1PodList> informer =
        new DefaultSharedIndexInformer<>(anyApiType, listerWatcher, 0, fifo, cache);
    fifo.replace(Collections.emptyList(), "1");
    if (cached) {
      cache.add(pod);
    }
    if (queued) {
      fifo.add(pod);
    }

    fifo.replace(present ? Collections.singletonList(listedPod) : Collections.emptyList(), "3");
    assertThat(fifo.listKeys()).containsExactly("default/foo");
    fifo.pop(informer::handleDeltas);

    if (present) {
      assertThat(cache.list()).containsExactly(listedPod);
      assertThat(cache.getByKey("default/foo")).isSameAs(listedPod);
    } else {
      assertThat(cache.list()).isEmpty();
      assertThat(cache.getByKey("default/foo")).isNull();
    }
    assertThat(fifo.listKeys()).isEmpty();
    assertThat(fifo.hasSynced()).isTrue();
  }
}
