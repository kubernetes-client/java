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
package io.kubernetes.client.util.generic;

import io.kubernetes.client.common.KubernetesType;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.models.V1Status;
import java.net.HttpURLConnection;

public class KubernetesApiResponse<DataType extends KubernetesType> {

  private final DataType object;
  private final V1Status status;
  private final int httpStatusCode;

  public KubernetesApiResponse(DataType object) {
    this.object = object;
    this.status = null;
    this.httpStatusCode = HttpURLConnection.HTTP_OK; // 200
  }

  public KubernetesApiResponse(V1Status status, int httpStatusCode) {
    this.object = null;
    this.status = status;
    this.httpStatusCode = httpStatusCode;
  }

  public DataType getObject() {
    return object;
  }

  public V1Status getStatus() {
    return status;
  }

  public int getHttpStatusCode() {
    return httpStatusCode;
  }

  public boolean isSuccess() {
    return this.httpStatusCode < HttpURLConnection.HTTP_BAD_REQUEST; // 400
  }

  /**
   * Throws api exception kubernetes api response on failure. This is the recommended approach to
   * deal with errors returned from server.
   *
   * @return the kubernetes api response
   * @throws ApiException the api exception
   */
  public KubernetesApiResponse<DataType> throwsApiException() throws ApiException {
    return onFailure(
        (code, errorStatus) -> {
          throw new ApiException(code, errorStatus.toString());
        });
  }

  /**
   * Calling errorStatusHandler upon errors from server..
   *
   * @param errorStatusHandler the error status handler
   * @return the kubernetes api response
   * @throws ApiException the api exception
   */
  public KubernetesApiResponse<DataType> onFailure(ErrorStatusHandler errorStatusHandler)
      throws ApiException {
    if (!isSuccess()) {
      errorStatusHandler.handle(this.getHttpStatusCode(), this.status);
    }
    return this;
  }

  public interface ErrorStatusHandler {
    void handle(int code, V1Status errorStatus) throws ApiException;
  }
}
