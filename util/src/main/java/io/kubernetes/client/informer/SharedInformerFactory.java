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
package io.kubernetes.client.informer;

import com.google.gson.reflect.TypeToken;
import io.kubernetes.client.common.KubernetesListObject;
import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.informer.cache.Cache;
import io.kubernetes.client.informer.impl.DefaultSharedIndexInformer;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.util.CallGenerator;
import io.kubernetes.client.util.CallGeneratorParams;
import io.kubernetes.client.util.Namespaces;
import io.kubernetes.client.util.Watch;
import io.kubernetes.client.util.Watchable;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import io.kubernetes.client.util.generic.options.ListOptions;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.BiConsumer;
import okhttp3.Call;
import org.apache.commons.collections4.MapUtils;

/** SharedInformerFactory class constructs and caches informers for api types. */
public class SharedInformerFactory {

  protected Map<Type, SharedIndexInformer> informers;

  private Map<Type, Future> startedInformers;

  private ExecutorService informerExecutor;

  private ApiClient apiClient;

  /** Constructor w/ default thread pool. */
  /** DEPRECATE: In favor of explicit apiClient constructor to avoid misguiding */
  @Deprecated
  public SharedInformerFactory() {
    this(Configuration.getDefaultApiClient().setReadTimeout(0), Executors.newCachedThreadPool());
  }

  /** Constructor w/ api client specified and default thread pool. */
  public SharedInformerFactory(ApiClient apiClient) {
    this(apiClient, Executors.newCachedThreadPool());
  }

  /**
   * Constructor w/ thread pool specified.
   *
   * @param threadPool specified thread pool
   */
  public SharedInformerFactory(ExecutorService threadPool) {
    this(Configuration.getDefaultApiClient().setReadTimeout(0), threadPool);
  }

  /**
   * Constructor w/ api client and thread pool specified.
   *
   * @param client specific api client
   * @param threadPool specified thread pool
   */
  public SharedInformerFactory(ApiClient client, ExecutorService threadPool) {
    if (client.getReadTimeout() != 0) {
      throw new IllegalArgumentException("read timeout of ApiClient must be zero");
    }

    apiClient = client;
    informerExecutor = threadPool;
    informers = new HashMap<>();
    startedInformers = new HashMap<>();
  }

  /**
   * Shared index informer for shared index informer.
   *
   * @param <ApiType> the type parameter
   * @param <ApiListType> the type parameter
   * @param callGenerator the call generator
   * @param apiTypeClass the api type class
   * @param apiListTypeClass the api list type class
   * @return the shared index informer
   */
  public synchronized <ApiType extends KubernetesObject, ApiListType extends KubernetesListObject>
      SharedIndexInformer<ApiType> sharedIndexInformerFor(
          CallGenerator callGenerator,
          Class<ApiType> apiTypeClass,
          Class<ApiListType> apiListTypeClass) {
    return sharedIndexInformerFor(callGenerator, apiTypeClass, apiListTypeClass, 0);
  }

  /**
   * Constructs and returns a shared index informer w/ resync period specified. But the informer
   * cache will not be overwritten i.e. only the first registered informer will be kept.
   *
   * @param <ApiType> the type parameter
   * @param <ApiListType> the type parameter
   * @param callGenerator the call generator
   * @param apiTypeClass the api type class
   * @param apiListTypeClass the api list type class
   * @param resyncPeriodInMillis the resync period in millis
   * @return the shared index informer
   */
  public synchronized <ApiType extends KubernetesObject, ApiListType extends KubernetesListObject>
      SharedIndexInformer<ApiType> sharedIndexInformerFor(
          CallGenerator callGenerator,
          Class<ApiType> apiTypeClass,
          Class<ApiListType> apiListTypeClass,
          long resyncPeriodInMillis) {
    return sharedIndexInformerFor(
        callGenerator, apiTypeClass, apiListTypeClass, resyncPeriodInMillis, null);
  }

  /**
   * Shared index informer for shared index informer.
   *
   * @param <ApiType> the type parameter
   * @param <ApiListType> the type parameter
   * @param callGenerator the call generator
   * @param apiTypeClass the api type class
   * @param apiListTypeClass the api list type class
   * @param exceptionHandler the exception Handler
   * @return the shared index informer
   */
  public synchronized <ApiType extends KubernetesObject, ApiListType extends KubernetesListObject>
      SharedIndexInformer<ApiType> sharedIndexInformerFor(
          CallGenerator callGenerator,
          Class<ApiType> apiTypeClass,
          Class<ApiListType> apiListTypeClass,
          long resyncPeriodInMillis,
          BiConsumer<Class<ApiType>, Throwable> exceptionHandler) {
    ListerWatcher<ApiType, ApiListType> listerWatcher =
        listerWatcherFor(callGenerator, apiTypeClass, apiListTypeClass);
    return sharedIndexInformerFor(
        listerWatcher, apiTypeClass, resyncPeriodInMillis, exceptionHandler);
  }

  /**
   * Constructs and returns a shared index informer by specifying lister-watcher. But the informer
   * cache will not be overwritten on multiple call w/ the the same apiTypeClass i.e. only the first
   * registered informer will be kept.
   *
   * @param <ApiType> the type parameter
   * @param <ApiListType> the type parameter
   * @param listerWatcher the lister watcher
   * @param apiTypeClass the api type class
   * @param resyncPeriodInMillis the resync period in millis
   * @return the shared index informer
   */
  public synchronized <ApiType extends KubernetesObject, ApiListType extends KubernetesListObject>
      SharedIndexInformer<ApiType> sharedIndexInformerFor(
          ListerWatcher<ApiType, ApiListType> listerWatcher,
          Class<ApiType> apiTypeClass,
          long resyncPeriodInMillis) {
    return sharedIndexInformerFor(listerWatcher, apiTypeClass, resyncPeriodInMillis, null);
  }

  public synchronized <ApiType extends KubernetesObject, ApiListType extends KubernetesListObject>
      SharedIndexInformer<ApiType> sharedIndexInformerFor(
          ListerWatcher<ApiType, ApiListType> listerWatcher,
          Class<ApiType> apiTypeClass,
          long resyncPeriodInMillis,
          BiConsumer<Class<ApiType>, Throwable> exceptionHandler) {

    SharedIndexInformer<ApiType> informer =
        new DefaultSharedIndexInformer<>(
            apiTypeClass, listerWatcher, resyncPeriodInMillis, new Cache<>(), exceptionHandler);
    this.informers.putIfAbsent(TypeToken.get(apiTypeClass).getType(), informer);
    return informer;
  }

  /**
   * Constructs and returns a shared index informer by specifying a generic api instance. But the
   * informer cache will not be overwritten on multiple call w/ the the same apiTypeClass i.e. only
   * the first registered informer will be kept.
   *
   * @param <ApiType> the type parameter
   * @param <ApiListType> the type parameter
   * @param genericKubernetesApi the generic kubernetes api
   * @param apiTypeClass the api type class
   * @param resyncPeriodInMillis the resync period in millis
   * @return the shared index informer
   */
  public synchronized <ApiType extends KubernetesObject, ApiListType extends KubernetesListObject>
      SharedIndexInformer<ApiType> sharedIndexInformerFor(
          GenericKubernetesApi<ApiType, ApiListType> genericKubernetesApi,
          Class<ApiType> apiTypeClass,
          long resyncPeriodInMillis) {
    return sharedIndexInformerFor(
        genericKubernetesApi, apiTypeClass, resyncPeriodInMillis, Namespaces.NAMESPACE_ALL);
  }

  /**
   * Working the same as {@link SharedInformerFactory#sharedIndexInformerFor} above.
   *
   * <p>Constructs and returns a shared index informer for a specific namespace.
   *
   * @param <ApiType> the type parameter
   * @param <ApiListType> the type parameter
   * @param genericKubernetesApi the generic kubernetes api
   * @param apiTypeClass the api type class
   * @param resyncPeriodInMillis the resync period in millis
   * @param namespace the target namespace
   * @return the shared index informer
   */
  public synchronized <ApiType extends KubernetesObject, ApiListType extends KubernetesListObject>
      SharedIndexInformer<ApiType> sharedIndexInformerFor(
          GenericKubernetesApi<ApiType, ApiListType> genericKubernetesApi,
          Class<ApiType> apiTypeClass,
          long resyncPeriodInMillis,
          String namespace) {
    return sharedIndexInformerFor(
        genericKubernetesApi, apiTypeClass, resyncPeriodInMillis, namespace, null);
  }

  /**
   * Working the same as {@link SharedInformerFactory#sharedIndexInformerFor} above.
   *
   * <p>Constructs and returns a shared index informer for a specific namespace.
   *
   * @param <ApiType> the type parameter
   * @param <ApiListType> the type parameter
   * @param genericKubernetesApi the generic kubernetes api
   * @param apiTypeClass the api type class
   * @param resyncPeriodInMillis the resync period in millis
   * @param namespace the target namespace
   * @param exceptionHandler the exception Handler
   * @return the shared index informer
   */
  public synchronized <ApiType extends KubernetesObject, ApiListType extends KubernetesListObject>
      SharedIndexInformer<ApiType> sharedIndexInformerFor(
          GenericKubernetesApi<ApiType, ApiListType> genericKubernetesApi,
          Class<ApiType> apiTypeClass,
          long resyncPeriodInMillis,
          String namespace,
          BiConsumer<Class<ApiType>, Throwable> exceptionHandler) {
    ListerWatcher<ApiType, ApiListType> listerWatcher =
        listerWatcherFor(genericKubernetesApi, namespace);
    return sharedIndexInformerFor(
        listerWatcher, apiTypeClass, resyncPeriodInMillis, exceptionHandler);
  }

  private <ApiType extends KubernetesObject, ApiListType extends KubernetesListObject>
      ListerWatcher<ApiType, ApiListType> listerWatcherFor(
          CallGenerator callGenerator,
          Class<ApiType> apiTypeClass,
          Class<ApiListType> apiListTypeClass) {
    if (apiClient.getReadTimeout() > 0) {
      // set read timeout zero to ensure client doesn't time out
      apiClient.setReadTimeout(0);
    }
    return new ListerWatcher<ApiType, ApiListType>() {
      @Override
      public ApiListType list(CallGeneratorParams params) throws ApiException {
        Call call = callGenerator.generate(params);
        return (ApiListType) apiClient.execute(call, apiListTypeClass).getData();
      }

      @Override
      public Watch<ApiType> watch(CallGeneratorParams params) throws ApiException {
        Call call = callGenerator.generate(params);
        // bind call with private http client to make sure read timeout is zero.
        call = apiClient.getHttpClient().newCall(call.request());
        return Watch.createWatch(
            apiClient,
            call,
            TypeToken.getParameterized(Watch.Response.class, apiTypeClass).getType());
      }
    };
  }

  private <ApiType extends KubernetesObject, ApiListType extends KubernetesListObject>
      ListerWatcher<ApiType, ApiListType> listerWatcherFor(
          GenericKubernetesApi<ApiType, ApiListType> genericKubernetesApi, String namespace) {
    if (apiClient.getReadTimeout() > 0) {
      // set read timeout zero to ensure client doesn't time out
      apiClient.setReadTimeout(0);
    }
    // TODO: it seems read timeout is determined by genericKubernetesApi instead of above apiClient.
    return new ListerWatcher<ApiType, ApiListType>() {
      public ApiListType list(CallGeneratorParams params) throws ApiException {
        if (Namespaces.NAMESPACE_ALL.equals(namespace)) {
          return genericKubernetesApi
              .list(
                  new ListOptions() {
                    {
                      setResourceVersion(params.resourceVersion);
                      setTimeoutSeconds(params.timeoutSeconds);
                    }
                  })
              .throwsApiException()
              .getObject();
        } else {
          return genericKubernetesApi
              .list(
                  namespace,
                  new ListOptions() {
                    {
                      setResourceVersion(params.resourceVersion);
                      setTimeoutSeconds(params.timeoutSeconds);
                    }
                  })
              .throwsApiException()
              .getObject();
        }
      }

      public Watchable<ApiType> watch(CallGeneratorParams params) throws ApiException {
        if (Namespaces.NAMESPACE_ALL.equals(namespace)) {
          return genericKubernetesApi.watch(
              new ListOptions() {
                {
                  setResourceVersion(params.resourceVersion);
                  setTimeoutSeconds(params.timeoutSeconds);
                }
              });
        } else {
          return genericKubernetesApi.watch(
              namespace,
              new ListOptions() {
                {
                  setResourceVersion(params.resourceVersion);
                  setTimeoutSeconds(params.timeoutSeconds);
                }
              });
        }
      }
    };
  }

  /**
   * Gets existing shared index informer, return null if the requesting informer is never
   * constructed.
   *
   * @param <ApiType> the type parameter
   * @param apiTypeClass the api type class
   * @return the existing shared index informer
   */
  public synchronized <ApiType extends KubernetesObject>
      SharedIndexInformer<ApiType> getExistingSharedIndexInformer(Class<ApiType> apiTypeClass) {
    return this.informers.get(TypeToken.get(apiTypeClass).getType());
  }

  /** Start all registered informers. */
  public synchronized void startAllRegisteredInformers() {
    if (MapUtils.isEmpty(informers)) {
      return;
    }
    informers.forEach(
        (informerType, informer) ->
            startedInformers.computeIfAbsent(
                informerType, key -> informerExecutor.submit((Runnable) informer::run)));
  }

  /** Stop all registered informers and shut down the thread pool. */
  public synchronized void stopAllRegisteredInformers() {
    stopAllRegisteredInformers(true);
  }

  /**
   * Stop all registered informers.
   *
   * @param shutdownThreadPool whether or not to shut down the thread pool.
   */
  public synchronized void stopAllRegisteredInformers(boolean shutdownThreadPool) {
    if (MapUtils.isEmpty(informers)) {
      return;
    }
    informers.forEach(
        (informerType, informer) -> {
          if (startedInformers.remove(informerType) != null) {
            informer.stop();
          }
        });
    if (shutdownThreadPool) {
      informerExecutor.shutdown();
    }
  }
}
