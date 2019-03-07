package io.kubernetes.client.informer;

import com.google.gson.reflect.TypeToken;
import com.squareup.okhttp.Call;
import io.kubernetes.client.*;
import io.kubernetes.client.informer.impl.DefaultSharedIndexInformer;
import io.kubernetes.client.util.CallGeneratorParams;
import io.kubernetes.client.util.Watch;
import io.kubernetes.client.util.common.Collections;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Function;

/** SharedInformerFactory class constructs and caches informers for api types. */
public class SharedInformerFactory {

  private Map<Type, SharedIndexInformer> informers;

  private Map<Type, Future> startedInformers;

  private ExecutorService informerExecutor;

  /** Constructor w/ default thread pool. */
  public SharedInformerFactory() {
    this(Executors.newCachedThreadPool());
  }

  /**
   * Constructor w/ thread pool specified.
   *
   * @param threadPool specified thread pool
   */
  public SharedInformerFactory(ExecutorService threadPool) {
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
      Function<CallGeneratorParams, Call> callGenerator,
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
      Function<CallGeneratorParams, Call> callGenerator,
      Class<ApiType> apiTypeClass,
      Class<ApiListType> apiListTypeClass,
      long resyncPeriodInMillis) {
    ListerWatcher<ApiType, ApiListType> listerWatcher =
        listerWatcherFor(callGenerator, apiTypeClass, apiListTypeClass);
    SharedIndexInformer<ApiType> informer =
        new DefaultSharedIndexInformer<ApiType, ApiListType>(
            apiTypeClass, listerWatcher, resyncPeriodInMillis);
    this.informers.put(TypeToken.get(apiTypeClass).getType(), informer);
    return informer;
  }

  private <ApiType, ApiListType> ListerWatcher<ApiType, ApiListType> listerWatcherFor(
      Function<CallGeneratorParams, Call> callGenerator,
      Class<ApiType> apiTypeClass,
      Class<ApiListType> apiListTypeClass) {
    ApiClient apiClient = Configuration.getDefaultApiClient();
    return new ListerWatcher<ApiType, ApiListType>() {
      @Override
      public ApiListType list(CallGeneratorParams params) throws ApiException {
        Call call = callGenerator.apply(params);
        return (ApiListType) apiClient.execute(call, apiListTypeClass).getData();
      }

      @Override
      public Watch<ApiType> watch(CallGeneratorParams params) throws ApiException {
        Call call = callGenerator.apply(params);
        return Watch.createWatch(
            apiClient,
            call,
            TypeToken.getParameterized(Watch.Response.class, apiTypeClass).getType());
      }
    };
  }

  /** Start all registered informers. */
  public synchronized void startAllRegisteredInformers() {
    if (Collections.isEmptyMap(informers)) {
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
    if (Collections.isEmptyMap(informers)) {
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
