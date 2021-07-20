/*
Copyright 2021 The Kubernetes Authors.
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
package io.kubernetes.client.util;

import io.kubernetes.client.openapi.ApiException;
import java.net.HttpURLConnection;

public class RetryUtils {

  /**
   * Invokes kubernetes api and will retry upon CONFLICT(409) response.
   *
   * <p>Note that this helper method is mostly intended for update calls where CONFLICT can be
   * returned when updating resources with a stale resource version.
   *
   * @param <ApiType> the type parameter
   * @param apiTypeApiInvocation the api type api invocation lambda
   * @param maxRetry the max retry count
   * @return the returned api type
   * @throws ApiException the api exception
   */
  public static <ApiType> ApiType retryUponConflict(
      ApiInvocation<ApiType> apiTypeApiInvocation, int maxRetry) throws ApiException {
    int retries = 0;
    while (true) {
      try {
        return apiTypeApiInvocation.call();
      } catch (ApiException e) {
        if (HttpURLConnection.HTTP_CONFLICT != e.getCode() || ++retries >= maxRetry) {
          throw e;
        }
      }
    }
  }
}
