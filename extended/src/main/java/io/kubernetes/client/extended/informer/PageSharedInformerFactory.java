package io.kubernetes.client.extended.informer;

import com.google.common.collect.Lists;
import com.google.gson.reflect.TypeToken;
import com.squareup.okhttp.Call;
import io.kubernetes.client.ApiException;
import io.kubernetes.client.extended.pager.Pager;
import io.kubernetes.client.extended.pager.Pager.PagerParams;
import io.kubernetes.client.informer.ListerWatcher;
import io.kubernetes.client.informer.SharedInformerFactory;
import io.kubernetes.client.util.CallGenerator;
import io.kubernetes.client.util.CallGeneratorParams;
import io.kubernetes.client.util.Watch;
import io.kubernetes.client.util.exception.ObjectMetaReflectException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/**
 * Created by 烛坤 on 2019/10/18.
 *
 * @author 烛坤
 * @date 2019/10/18
 */
public class PageSharedInformerFactory extends SharedInformerFactory {

  protected <ApiType, ApiListType> ListerWatcher<ApiType, ApiListType> listerWatcherFor(
      final CallGenerator callGenerator,
      final Class<ApiType> apiTypeClass,
      final Class<ApiListType> apiListTypeClass) {

    apiClient.getHttpClient().setReadTimeout(0, TimeUnit.MILLISECONDS);

    return new ListerWatcher<ApiType, ApiListType>() {

      @Override
      public ApiListType list(CallGeneratorParams callGeneratorParams) {

        PagerCallGeneratorParams params = PagerCallGeneratorParams.to(callGeneratorParams);

        Function<PagerParams, Call> listFunc =
            pagerParams -> {
              PagerCallGeneratorParams copy = PagerCallGeneratorParams.copy(params, pagerParams);
              try {
                return callGenerator.generate(copy);
              } catch (ApiException e) {
                throw new RuntimeException(e);
              }
            };

        Type type = com.google.common.reflect.TypeToken.of(apiListTypeClass).getType();

        Pager<ApiType, ApiListType> pager =
            new Pager<>(listFunc, apiClient, params.getDefaultLimit(), type);

        List<ApiType> list = Lists.newArrayList(pager);

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
