/*
Copyright 2024 The Kubernetes Authors.
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

import java.util.Map;
import java.util.List;

import jakarta.ws.rs.core.GenericType;

/**
 * <p>ApiException class.</p>
 */
@SuppressWarnings("serial")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class ApiException extends Exception {
    private int code = 0;
    private Map<String, List<String>> responseHeaders = null;
    private String responseBody = null;

    /**
     * <p>Constructor for ApiException.</p>
     */
    public ApiException() {}

    /**
     * <p>Constructor for ApiException.</p>
     *
     * @param throwable a {@link java.lang.Throwable} object
     */
    public ApiException(Throwable throwable) {
        super(throwable);
    }

    /**
     * <p>Constructor for ApiException.</p>
     *
     * @param message the error message
     */
    public ApiException(String message) {
        super(message);
    }

    /**
     * <p>Constructor for ApiException.</p>
     *
     * @param message the error message
     * @param throwable a {@link java.lang.Throwable} object
     * @param code HTTP status code
     * @param responseHeaders a {@link java.util.Map} of HTTP response headers
     * @param responseBody the response body
     */
    public ApiException(String message, Throwable throwable, int code, Map<String, List<String>> responseHeaders, String responseBody) {
        super(message, throwable);
        this.code = code;
        this.responseHeaders = responseHeaders;
        this.responseBody = responseBody;
    }

    /**
     * <p>Constructor for ApiException.</p>
     *
     * @param message the error message
     * @param code HTTP status code
     * @param responseHeaders a {@link java.util.Map} of HTTP response headers
     * @param responseBody the response body
     */
    public ApiException(String message, int code, Map<String, List<String>> responseHeaders, String responseBody) {
        this(message, (Throwable) null, code, responseHeaders, responseBody);
    }

    /**
     * <p>Constructor for ApiException.</p>
     *
     * @param message the error message
     * @param throwable a {@link java.lang.Throwable} object
     * @param code HTTP status code
     * @param responseHeaders a {@link java.util.Map} of HTTP response headers
     */
    public ApiException(String message, Throwable throwable, int code, Map<String, List<String>> responseHeaders) {
        this(message, throwable, code, responseHeaders, null);
    }

    /**
     * <p>Constructor for ApiException.</p>
     *
     * @param code HTTP status code
     * @param responseHeaders a {@link java.util.Map} of HTTP response headers
     * @param responseBody the response body
     */
    public ApiException(int code, Map<String, List<String>> responseHeaders, String responseBody) {
        this("Response Code: " + code + " Response Body: " + responseBody, (Throwable) null, code, responseHeaders, responseBody);
    }

    /**
     * <p>Constructor for ApiException.</p>
     *
     * @param code HTTP status code
     * @param message a {@link java.lang.String} object
     */
    public ApiException(int code, String message) {
        super(message);
        this.code = code;
    }

    /**
     * <p>Constructor for ApiException.</p>
     *
     * @param code HTTP status code
     * @param message the error message
     * @param responseHeaders a {@link java.util.Map} of HTTP response headers
     * @param responseBody the response body
     */
    public ApiException(int code, String message, Map<String, List<String>> responseHeaders, String responseBody) {
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

    /**
     * Get the exception message including HTTP response data.
     *
     * @return The exception message
     */
    public String getMessage() {
        return String.format("Message: %s%nHTTP response code: %s%nHTTP response body: %s%nHTTP response headers: %s",
                super.getMessage(), this.getCode(), this.getResponseBody(), this.getResponseHeaders());
    }
}
