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
import java.util.Iterator;
import java.util.function.Function;

public class Pager<ApiType, ApiListType> implements Iterable<ApiType>, Iterator<ApiType> {
  private String continueToken;
  private Integer limit;
  private ApiClient client;
  private Call call;
  private Type listType;
  private Function<PagerParams, Call> listFunc;

  private ApiListType listObjectCurrentPage;
  private int offsetCurrentPage;
  private int currentPageSize;

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
  @Override
  public boolean hasNext() {
    if (call == null) {
      // the first time looping over the pager
      return Boolean.TRUE;
    }
    if (continueToken == null && offsetCurrentPage >= currentPageSize) {
      return Boolean.FALSE;
    }
    return Boolean.TRUE;
  }

  /**
   * returns next chunk of List. size of list depends on limit set in constructor.
   *
   * @return Object
   */
  @Override
  public ApiType next() {
    try {
      if (offsetCurrentPage >= currentPageSize) {
        call = getNextCall(limit);
        listObjectCurrentPage = executeRequest(call);

        offsetCurrentPage = 0;
        currentPageSize = Reflect.<ApiType>getItems(listObjectCurrentPage).size();
      }
      return Reflect.<ApiType>getItems(listObjectCurrentPage).get(offsetCurrentPage++);
    } catch (ApiException e) {
      throw new RuntimeException(e.getResponseBody());
    } catch (ObjectMetaReflectException | IOException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public Iterator<ApiType> iterator() {
    this.call = null;
    return this;
  }

  /** returns next list call by setting continue variable and limit */
  private Call getNextCall(Integer nextLimit) {
    PagerParams params = new PagerParams((nextLimit != null) ? nextLimit : limit);
    if (continueToken != null) {
      params.continueToken = continueToken;
    }
    return listFunc.apply(params);
  }

  /** executes the list call and sets the continue variable for next list call */
  private ApiListType executeRequest(Call call)
      throws IOException, ApiException, ObjectMetaReflectException {
    ApiListType data = client.handleResponse(call.execute(), listType);
    V1ListMeta listMetaData = Reflect.listMetadata(data);
    continueToken = listMetaData.getContinue();
    return data;
  }

  public static class PagerParams {
    private Integer limit;
    private String continueToken;

    public PagerParams(Integer limit) {
      this.limit = limit;
    }

    public PagerParams(Integer limit, String continueToken) {
      this.limit = limit;
      this.continueToken = continueToken;
    }

    public Integer getLimit() {
      return limit;
    }

    public String getContinueToken() {
      return continueToken;
    }
  }
}
