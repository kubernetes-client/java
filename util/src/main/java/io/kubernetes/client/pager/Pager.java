/*
Copyright 2019 The Kubernetes Authors.
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
package io.kubernetes.client.pager;

import com.squareup.okhttp.Call;
import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ApiException;
import io.kubernetes.client.models.V1ListMeta;
import io.kubernetes.client.util.Reflect;
import io.kubernetes.client.util.exception.ObjectMetaReflectException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.function.Function;

public class Pager<ApiType, ApiListType> {
  private String continueToken;
  private Integer limit;
  private ApiClient client;
  private Call call;
  private Type listType;
  private Function<PagerParams, Call> listFunc;

  /**
   * Pagination in kubernetes list call depends on continue and limit variable
   *
   * @param listFunc lambda of type: (PagerParams p)->{return
   *     list<*>[namespace[s|d]]*<*>Call(...p.getContinue(),...p.getLimit()...);}
   * @param client instance of {@link ApiClient}
   * @param limit size of list to be fetched
   * @param listType Type of list to be fetched
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
    if (continueToken == null && call != null) {
      return Boolean.FALSE;
    }
    return Boolean.TRUE;
  }

  /**
   * returns next chunk of List. size of list depends on limit set in constructor.
   *
   * @return Object
   */
  public <ApiType> ApiListType next() {
    return next(null);
  }

  /**
   * returns next chunk of list. size of list depends on limit set in constructor or nextLimit.
   *
   * @param nextLimit
   * @return
   */
  public <ApiType> ApiListType next(Integer nextLimit) {
    try {
      call = getNextCall(nextLimit);
      return executeRequest(call);
    } catch (Exception e) {
      if (e instanceof ApiException) {
        throw new RuntimeException(((ApiException) e).getResponseBody());
      }
      throw new RuntimeException(e);
    }
  }

  /** returns next list call by setting continue variable and limit */
  private Call getNextCall(Integer nextLimit) {
    PagerParams params = new PagerParams((nextLimit != null) ? nextLimit : limit);
    if (continueToken != null) {
      params.setContinue(continueToken);
    }
    return listFunc.apply(params);
  }

  /** executes the list call and sets the continue variable for next list call */
  private <ApiType> ApiListType executeRequest(Call call)
      throws IOException, ApiException, ObjectMetaReflectException {
    ApiListType data = client.handleResponse(call.execute(), listType);
    V1ListMeta listMetaData = Reflect.listMetadata(data);
    continueToken = listMetaData.getContinue();
    return data;
  }
}
