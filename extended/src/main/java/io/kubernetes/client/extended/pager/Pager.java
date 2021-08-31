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
package io.kubernetes.client.extended.pager;

import io.kubernetes.client.common.KubernetesListObject;
import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.function.Function;
import okhttp3.Call;

/*
 * Pager encapsulates kubernetes limit/continue-based list pagination into an iterator.
 * Note that pager is thread-safe.
 */
public class Pager<ApiType extends KubernetesObject, ApiListType extends KubernetesListObject>
    implements Iterable<ApiType> {
  private final Integer limit;
  private final ApiClient client;
  private final Type listType;
  private final Function<PagerParams, Call> listFunc;

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
    PagerIterator it = new PagerIterator();
    it.makeCall();
    return it;
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
    private int offsetCurrentPage;
    private int currentPageSize;
    private ApiListType listObjectCurrentPage;

    /**
     * returns false if kubernetes server has exhausted List.
     *
     * @return the boolean
     */
    @Override
    public boolean hasNext() {
      if (listObjectCurrentPage.getItems() == null
          || listObjectCurrentPage.getItems().size() == 0) {
        return false;
      }
      if (!started) {
        started = true;
        return Boolean.TRUE;
      }
      return !(continueToken == null && offsetCurrentPage >= currentPageSize);
    }

    protected void makeCall() {
      try {
        Call call = getNextCall(limit, continueToken);

        listObjectCurrentPage = executeRequest(call);
        continueToken = listObjectCurrentPage.getMetadata().getContinue();

        offsetCurrentPage = 0;
        currentPageSize = listObjectCurrentPage.getItems().size();
      } catch (ApiException e) {
        throw new RuntimeException(e.getResponseBody());
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    /**
     * returns next chunk of List. size of list depends on limit set in constructor.
     *
     * @return the next Object
     */
    @Override
    public ApiType next() {
      if (offsetCurrentPage >= currentPageSize) {
        makeCall();
      }
      return (ApiType) listObjectCurrentPage.getItems().get(offsetCurrentPage++);
    }
  }
}
