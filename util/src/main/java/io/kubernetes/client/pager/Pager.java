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
import io.kubernetes.client.util.Reflect;
import io.kubernetes.client.util.exception.ObjectMetaReflectException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.function.Function;

/*
 * Pager encapsulates kubernetes limit/continue-based list pagination into an iterator.
 * Note that pager is thread-safe.
 */
public class Pager<ApiType, ApiListType> implements Iterable<ApiType> {
  private Integer limit;
  private ApiClient client;
  private Type listType;
  private Function<PagerParams, Call> listFunc;

  private ApiListType listObjectCurrentPage;

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
   * Iterator iterator.
   *
   * @return the iterator
   */
  @Override
  public Iterator<ApiType> iterator() {
    return new PagerIterator();
  }

  /** returns next list call by setting continue variable and limit */
  private Call getNextCall(Integer nextLimit, String continueToken) {
    PagerParams params = new PagerParams((nextLimit != null) ? nextLimit : limit, continueToken);
    return listFunc.apply(params);
  }

  /** executes the list call and sets the continue variable for next list call */
  private ApiListType executeRequest(Call call) throws IOException, ApiException {
    return client.handleResponse(call.execute(), listType);
  }

  public static class PagerParams {

    private String continueToken;
    private Integer limit;

    private PagerParams(Integer limit, String continueToken) {
      this.limit = limit;
      this.continueToken = continueToken;
    }

    /**
     * Gets get limit.
     *
     * @return the get limit
     */
    public Integer getLimit() {
      return limit;
    }

    /**
     * Gets get continue token.
     *
     * @return the get continue token
     */
    public String getContinueToken() {
      return continueToken;
    }
  }

  private class PagerIterator implements Iterator<ApiType> {

    private boolean started;
    private String continueToken;
    private Call call;
    private int offsetCurrentPage;
    private int currentPageSize;

    /**
     * returns false if kubernetes server has exhausted List.
     *
     * @return the boolean
     */
    @Override
    public boolean hasNext() {
      if (!started) {
        started = true;
        return Boolean.TRUE;
      }
      return !(continueToken == null && offsetCurrentPage >= currentPageSize);
    }

    /**
     * returns next chunk of List. size of list depends on limit set in constructor.
     *
     * @return the next Object
     */
    @Override
    public ApiType next() {
      try {
        if (offsetCurrentPage >= currentPageSize) {

          call = getNextCall(limit, continueToken);

          listObjectCurrentPage = executeRequest(call);
          continueToken = Reflect.listMetadata(listObjectCurrentPage).getContinue();

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
  }
}
