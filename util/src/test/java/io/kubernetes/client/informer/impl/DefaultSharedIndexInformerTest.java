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

import io.kubernetes.client.informer.ListerWatcher;
import io.kubernetes.client.informer.cache.DeltaFIFO;
import io.kubernetes.client.informer.cache.Indexer;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodList;
import io.kubernetes.client.util.Threads;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.function.BiConsumer;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

public class DefaultSharedIndexInformerTest {

  private static final Class<V1Pod> anyApiType = V1Pod.class;
  private static final long anyResyncPeriod = 1000L;

  @Rule public MockitoRule mockitoRule = MockitoJUnit.rule();

  @Mock private ListerWatcher<V1Pod, V1PodList> listerWatcher;
  @Mock private DeltaFIFO deltaFIFOMock;
  @Mock private Indexer<V1Pod> indexerMock;
  @Mock private BiConsumer<Class<V1Pod>, Throwable> exceptionHandler;
  @Mock private ThreadFactory threadFactory;
  @Mock private Thread thread;

  @Test
  public void testConstructorUsesDefaultThreadFactory() {
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
  public void testConstructorWithExceptionHandlerExists() {

    new DefaultSharedIndexInformer<>(
        anyApiType, listerWatcher, anyResyncPeriod, deltaFIFOMock, indexerMock, exceptionHandler);
  }

  @Test
  public void testConstructorWithoutExceptionHandlerExists() {

    new DefaultSharedIndexInformer<>(
        anyApiType, listerWatcher, anyResyncPeriod, deltaFIFOMock, indexerMock);
  }

  @Test
  public void testMinimalConstructorExists() {

    new DefaultSharedIndexInformer<>(anyApiType, listerWatcher, anyResyncPeriod);
  }
}
