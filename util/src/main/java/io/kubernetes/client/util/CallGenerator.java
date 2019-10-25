package io.kubernetes.client.util;

import com.squareup.okhttp.Call;
import io.kubernetes.client.ApiException;

/**
 * The interface Call generator. It's for homogenizing client interface so that we can invoke a
 * generized adaptor interface elsewhere.
 *
 * <p>For example, we can adapt list-node interface from CoreV1Api package like:
 *
 * <p>(CallGeneratorParams params) -> { return coreV1Api.listNodeCall( null, null, null, null, null,
 * params.resourceVersion, params.timeoutSeconds, params.watch, null, null); },
 */
@FunctionalInterface
public interface CallGenerator<T extends CallGeneratorParams> {
  /**
   * Generate call.
   *
   * @param params the params
   * @return the call
   * @throws ApiException the api exception
   */
  Call generate(T params) throws ApiException;
}
