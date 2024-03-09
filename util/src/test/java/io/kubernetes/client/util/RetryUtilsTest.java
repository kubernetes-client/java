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

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.when;

import io.kubernetes.client.openapi.ApiException;
import java.net.HttpURLConnection;
import java.util.concurrent.atomic.AtomicInteger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class RetryUtilsTest {

  @Mock private ApiInvocation apiInvocation;

  @Test
  void retryUponConflictShouldWorkWithinMaxRetry() throws ApiException {
    AtomicInteger conflictCount = new AtomicInteger(2);
    Object expectedReturn = new Object();
    when(apiInvocation.call())
        .thenAnswer(
            (stub) -> {
              if (conflictCount.get() > 0) {
                conflictCount.decrementAndGet();
                throw new ApiException(HttpURLConnection.HTTP_CONFLICT, "");
              }
              return expectedReturn;
            });

    Object actualReturn = RetryUtils.retryUponConflict(apiInvocation, 3);
    assertThat(actualReturn).isEqualTo(expectedReturn);
  }

  @Test
  void retryUponConflictShouldFailExceedingMaxRetry() throws ApiException {
    AtomicInteger conflictCount = new AtomicInteger(3);
    Object expectedReturn = new Object();
    when(apiInvocation.call())
        .thenAnswer(
            (stub) -> {
              if (conflictCount.get() > 0) {
                conflictCount.decrementAndGet();
                throw new ApiException(HttpURLConnection.HTTP_CONFLICT, "");
              }
              return expectedReturn;
            });

    assertThatThrownBy(() -> RetryUtils.retryUponConflict(apiInvocation, 3))
        .isInstanceOf(ApiException.class);
  }

  @Test
  void retryUponConflictShouldThrowNonConflictException() throws ApiException {
    when(apiInvocation.call()).thenThrow(IllegalArgumentException.class);
    assertThatThrownBy(() -> RetryUtils.retryUponConflict(apiInvocation, 3))
        .isInstanceOf(IllegalArgumentException.class);
  }
}
