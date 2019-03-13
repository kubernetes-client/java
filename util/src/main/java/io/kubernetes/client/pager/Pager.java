package io.kubernetes.client.pager;

import com.squareup.okhttp.Call;
import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ApiException;
import io.kubernetes.client.models.V1ListMeta;
import io.kubernetes.client.util.PagerParams;
import io.kubernetes.client.util.Reflect;
import io.kubernetes.client.util.exception.ObjectMetaReflectException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.function.Function;

public class Pager {
  private String _continue;
  private Integer limit;
  private ApiClient client;
  private Call call;
  private Type listType;
  private Function<PagerParams, Call> listFunc;

  /**
   * Pagination in kubernetes list call depends on continue and limit variable
   *
   * @param listFunc
   * @param client
   * @param limit
   * @param listType
   */
  public Pager(
      Function<PagerParams, Call> listFunc, ApiClient client, Integer limit, Type listType) {
    this.listFunc = listFunc;
    this.client = client;
    this.limit = limit;
    this.listType = listType;
  }

  /**
   * returns false if kubernetes server has exhausted List.
   *
   * @return
   */
  public Boolean hasNext() {
    if (_continue == null && call != null) {
      return Boolean.FALSE;
    }
    return Boolean.TRUE;
  }

  /**
   * returns next chunk of List. size of list depends on limit set in constructor.
   *
   * @return Object
   */
  public <T> T next() {
    return next(null);
  }

  /**
   * returns next chunk of List. size of list depends on limit set in constructor or nextLimit.
   *
   * @param nextLimit
   * @return
   */
  public <T> T next(Integer nextLimit) {
    try {
      call = getNextCall(nextLimit);
      return executeRequest(client, call, listType);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * returns next list call by setting continue variable and limit
   *
   * @param nextLimit
   * @return Object
   */
  private Call getNextCall(Integer nextLimit) {
    PagerParams params = new PagerParams();
    if (_continue != null) {
      params.setContinue(_continue);
    }
    params.setLimit((nextLimit != null) ? nextLimit : limit);
    return listFunc.apply(params);
  }

  /**
   * executes the list call and sets the continue variable for next list call
   *
   * @param client
   * @param call
   * @param listType
   * @return
   * @throws IOException
   * @throws ApiException
   * @throws ObjectMetaReflectException
   */
  private <T> T executeRequest(ApiClient client, Call call, Type listType)
      throws IOException, ApiException, ObjectMetaReflectException {
    T data = client.handleResponse(call.execute(), listType);
    V1ListMeta listMetaData = Reflect.listMetadata(data);
    _continue = listMetaData.getContinue();
    return data;
  }
}
