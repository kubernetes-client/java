package io.kubernetes.client.informer;

import com.google.gson.reflect.TypeToken;
import com.squareup.okhttp.Call;
import io.kubernetes.client.*;
import io.kubernetes.client.informer.impl.DefaultSharedIndexInformer;
import io.kubernetes.client.util.*;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;
import org.apache.commons.collections4.MapUtils;

/** SharedInformerFactory class constructs and caches informers for api types. */
public class SharedInformerFactory {

  protected Map<Type, SharedIndexInformer> informers;

  private Map<Type, Future> startedInformers;

  private ExecutorService informerExecutor;

  private ApiClient apiClient;

  /** Constructor w/ default thread pool. */
  public SharedInformerFactory() {
    this(Configuration.getDefaultApiClient(), Executors.newCachedThreadPool());
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
    this(Configuration.getDefaultApiClient(), threadPool);
  }

  /**
   * Constructor w/ api client and thread pool specified.
   *
   * @param client specific api client
   * @param threadPool specified thread pool
   */
  public SharedInformerFactory(ApiClient client, ExecutorService threadPool) {
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
  public synchronized <ApiType, ApiListType> SharedIndexInformer<ApiType> sharedIndexInformerFor(
      CallGenerator callGenerator,
      Class<ApiType> apiTypeClass,
      Class<ApiListType> apiListTypeClass) {
    return sharedIndexInformerFor(callGenerator, apiTypeClass, apiListTypeClass, 0);
  }

  /**
   * Constructs and returns a shared index informer w/ resync period specified. And the informer
   * cache will be overwritten.
   *
   * @param <ApiType> the type parameter
   * @param <ApiListType> the type parameter
   * @param callGenerator the call generator
   * @param apiTypeClass the api type class
   * @param apiListTypeClass the api list type class
   * @param resyncPeriodInMillis the resync period in millis
   * @return the shared index informer
   */
  public synchronized <ApiType, ApiListType> SharedIndexInformer<ApiType> sharedIndexInformerFor(
      CallGenerator callGenerator,
      Class<ApiType> apiTypeClass,
      Class<ApiListType> apiListTypeClass,
      long resyncPeriodInMillis) {
    ListerWatcher<ApiType, ApiListType> listerWatcher =
        listerWatcherFor(callGenerator, apiTypeClass, apiListTypeClass);
    SharedIndexInformer<ApiType> informer =
        new DefaultSharedIndexInformer<ApiType, ApiListType>(
            apiTypeClass, listerWatcher, resyncPeriodInMillis);
    this.informers.putIfAbsent(TypeToken.get(apiTypeClass).getType(), informer);
    return informer;
  }

  private <ApiType, ApiListType> ListerWatcher<ApiType, ApiListType> listerWatcherFor(
      CallGenerator callGenerator,
      Class<ApiType> apiTypeClass,
      Class<ApiListType> apiListTypeClass) {
    // set read timeout zero to ensure client doesn't time out
    apiClient.getHttpClient().setReadTimeout(0, TimeUnit.MILLISECONDS);
    return new ListerWatcher<ApiType, ApiListType>() {
      @Override
      public ApiListType list(CallGeneratorParams params) throws ApiException {
        Call call = callGenerator.generate(params);
        return (ApiListType) apiClient.execute(call, apiListTypeClass).getData();
      }

      @Override
      public Watch<ApiType> watch(CallGeneratorParams params) throws ApiException {
        Call call = callGenerator.generate(params);
        return Watch.createWatch(
            apiClient,
            call,
            TypeToken.getParameterized(Watch.Response.class, apiTypeClass).getType());
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
  public synchronized <ApiType> SharedIndexInformer<ApiType> getExistingSharedIndexInformer(
      Class<ApiType> apiTypeClass) {
    return this.informers.get(TypeToken.get(apiTypeClass).getType());
  }

  /** Start all registered informers. */
  public synchronized void startAllRegisteredInformers() {
    if (MapUtils.isEmpty(informers)) {
      return;
    }
    informers.forEach(
        (informerType, informer) -> {
          if (!startedInformers.containsKey(informerType)) {
            startedInformers.put(informerType, informerExecutor.submit(informer::run));
          }
        });
  }

  /** Stop all registered informers. */
  public synchronized void stopAllRegisteredInformers() {
    if (MapUtils.isEmpty(informers)) {
      return;
    }
    informers.forEach(
        (informerType, informer) -> {
          if (startedInformers.containsKey(informerType)) {
            startedInformers.remove(informerType);
            informer.stop();
          }
        });
    informerExecutor.shutdown();
  }
}
