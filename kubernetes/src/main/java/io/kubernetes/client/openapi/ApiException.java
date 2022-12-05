/*
Copyright 2022 The Kubernetes Authors.
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
package io.kubernetes.client.openapi;

import java.util.List;
import java.util.Map;

@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class ApiException extends Exception {
  private int code = 0;
  private Map<String, List<String>> responseHeaders = null;
  private String responseBody = null;

  public ApiException() {}

  public ApiException(Throwable throwable) {
    super(throwable);
  }

  public ApiException(String message) {
    super(message);
  }

  public ApiException(
      String message,
      Throwable throwable,
      int code,
      Map<String, List<String>> responseHeaders,
      String responseBody) {
    super(message, throwable);
    this.code = code;
    this.responseHeaders = responseHeaders;
    this.responseBody = responseBody;
  }

  public ApiException(
      String message, int code, Map<String, List<String>> responseHeaders, String responseBody) {
    this(message, (Throwable) null, code, responseHeaders, responseBody);
  }

  public ApiException(
      String message, Throwable throwable, int code, Map<String, List<String>> responseHeaders) {
    this(message, throwable, code, responseHeaders, null);
  }

  public ApiException(int code, Map<String, List<String>> responseHeaders, String responseBody) {
    this((String) null, (Throwable) null, code, responseHeaders, responseBody);
  }

  public ApiException(int code, String message) {
    super(message);
    this.code = code;
  }

  public ApiException(
      int code, String message, Map<String, List<String>> responseHeaders, String responseBody) {
    this(code, message);
    this.responseHeaders = responseHeaders;
    this.responseBody = responseBody;
  }

  /**
   * Get the HTTP status code.
   *
   * @return HTTP status code
   */
  public int getCode() {
    return code;
  }

  /**
   * Get the HTTP response headers.
   *
   * @return A map of list of string
   */
  public Map<String, List<String>> getResponseHeaders() {
    return responseHeaders;
  }

  /**
   * Get the HTTP response body.
   *
   * @return Response body in the form of string
   */
  public String getResponseBody() {
    return responseBody;
  }
}
