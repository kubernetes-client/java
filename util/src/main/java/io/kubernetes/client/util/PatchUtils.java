package io.kubernetes.client.util;

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.Configuration;
import okhttp3.Call;
import okhttp3.Request;

/** Provides utility helper functions to send PATCH requests against kubernetes cluster. */
public class PatchUtils {

  /**
   * Patches the resource with the patch format specified.
   *
   * @param <ApiType> the type parameter
   * @param apiTypeClass the api type class
   * @param callFunc the call func returns a okhttp call object that wraps the http request
   * @param patchFormat the patch format
   * @return the api type
   * @throws ApiException the api exception
   */
  public static <ApiType> ApiType patch(
      Class<ApiType> apiTypeClass, PatchCallFunc callFunc, String patchFormat) throws ApiException {
    return patch(apiTypeClass, callFunc, patchFormat, Configuration.getDefaultApiClient());
  }

  /**
   * Patches the resource with the patch format and {@link io.kubernetes.client.openapi.ApiClient}
   * specified.
   *
   * @param <ApiType> the type parameter
   * @param apiTypeClass the api type class
   * @param callFunc the call func returns a okhttp call object that wraps the http request
   * @param patchFormat the patch format
   * @param apiClient the api client
   * @return the api type
   * @throws ApiException the api exception
   */
  public static <ApiType> ApiType patch(
      Class<ApiType> apiTypeClass, PatchCallFunc callFunc, String patchFormat, ApiClient apiClient)
      throws ApiException {
    Request request = callFunc.getCall().request();
    return apiClient
        .<ApiType>execute(
            apiClient
                .getHttpClient()
                .newCall(
                    callFunc
                        .getCall()
                        .request()
                        .newBuilder()
                        .patch(new ProxyContentTypeRequestBody(request.body(), patchFormat))
                        .build()),
            apiTypeClass)
        .getData();
  }

  /**
   * The Patch call func returns an okhttp call object. This interface is only used for adapting
   * generated openapi client interfaces. e.g. {@link
   * io.kubernetes.client.openapi.apis.CoreV1Api#patchNamespacedPodCall}
   */
  public interface PatchCallFunc {
    /**
     * Gets okhttp call object.
     *
     * @return the call
     * @throws ApiException the api exception
     */
    Call getCall() throws ApiException;
  }
}
