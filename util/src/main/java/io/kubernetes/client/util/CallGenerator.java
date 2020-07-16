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
package io.kubernetes.client.util;

import io.kubernetes.client.openapi.ApiException;
import okhttp3.Call;

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
public interface CallGenerator {
  /**
   * Generate call.
   *
   * @param params the params
   * @return the call
   * @throws ApiException the api exception
   */
  Call generate(CallGeneratorParams params) throws ApiException;
}
