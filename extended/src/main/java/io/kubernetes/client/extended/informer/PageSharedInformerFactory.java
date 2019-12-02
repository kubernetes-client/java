package io.kubernetes.client.extended.informer;

import com.google.common.collect.Lists;
import com.google.gson.reflect.TypeToken;
import io.kubernetes.client.extended.pager.Pager;
import io.kubernetes.client.extended.pager.Pager.PagerParams;
import io.kubernetes.client.informer.ListerWatcher;
import io.kubernetes.client.informer.SharedInformerFactory;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.util.CallGenerator;
import io.kubernetes.client.util.CallGeneratorParams;
import io.kubernetes.client.util.Watch;
import io.kubernetes.client.util.exception.ObjectMetaReflectException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** informer list request support pagination like client-go(default limit 500). */
public class PageSharedInformerFactory extends SharedInformerFactory {

  private static final Logger log = LoggerFactory.getLogger(PageSharedInformerFactory.class);

  public PageSharedInformerFactory() {
    super();
  }

  public PageSharedInformerFactory(ApiClient apiClient) {
    super(apiClient);
  }

  public PageSharedInformerFactory(ApiClient client, ExecutorService threadPool) {
    super(client, threadPool);
  }

  protected <ApiType, ApiListType> ListerWatcher<ApiType, ApiListType> listerWatcherFor(
      final CallGenerator callGenerator,
      final Class<ApiType> apiTypeClass,
      final Class<ApiListType> apiListTypeClass) {

    if (apiClient.getHttpClient().readTimeoutMillis() > 0) {
      // set read timeout zero to ensure client doesn't time out
      OkHttpClient httpClient =
          apiClient.getHttpClient().newBuilder().readTimeout(0, TimeUnit.MILLISECONDS).build();
      apiClient.setHttpClient(httpClient);
    }

    return new ListerWatcher<ApiType, ApiListType>() {

      @Override
      public ApiListType list(CallGeneratorParams callGeneratorParams) {

        PagerCallGeneratorParams params = PagerCallGeneratorParams.to(callGeneratorParams);

        Type type = com.google.common.reflect.TypeToken.of(apiListTypeClass).getType();

        Function<PagerParams, Call> listFunc =
            pagerParams -> {
              PagerCallGeneratorParams copy = PagerCallGeneratorParams.copy(params, pagerParams);
              log.info(
                  "list param:[type: {} , resourceVersion: {} , continue: {} , limit: {}] ",
                  type.getTypeName(),
                  copy.resourceVersion,
                  copy.getContinueToken(),
                  copy.getLimit());
              try {
                return callGenerator.generate(copy);
              } catch (ApiException e) {
                throw new RuntimeException(e);
              }
            };

        Pager<ApiType, ApiListType> pager =
            new Pager<>(listFunc, apiClient, params.getDefaultLimit(), type);

        List<ApiType> list = Lists.newArrayList(pager);

        log.info("list items: [type: {} , total count: {}]", type.getTypeName(), list.size());

        try {
          setItems(pager.getListObjectCurrentPage(), list);
        } catch (ObjectMetaReflectException e) {
          throw new RuntimeException(e);
        }

        return pager.getListObjectCurrentPage();
      }

      @Override
      public Watch<ApiType> watch(CallGeneratorParams callGeneratorParams) throws ApiException {

        Call call = callGenerator.generate(PagerCallGeneratorParams.to(callGeneratorParams));

        Type watchType = TypeToken.getParameterized(Watch.Response.class, apiTypeClass).getType();

        return Watch.createWatch(apiClient, call, watchType);
      }
    };
  }

  private static <ApiType, ApiListType> void setItems(ApiListType listObj, List<ApiType> list)
      throws ObjectMetaReflectException {
    try {
      Method setItemsMethod = listObj.getClass().getMethod("setItems", List.class);
      setItemsMethod.invoke(listObj, list);
    } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
      throw new ObjectMetaReflectException(e);
    }
  }
}
