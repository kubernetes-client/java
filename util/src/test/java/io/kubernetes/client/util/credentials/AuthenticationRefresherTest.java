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
package io.kubernetes.client.util.credentials;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.util.ClientBuilder;

public class AuthenticationRefresherTest {

    @Test
    void credentialProviderWrapperInvoked() throws IOException {
        final Authentication provider = mock(Authentication.class);
        final Authentication wrapper = new AuthenticationRefresher(provider, 15);

        final ApiClient client = ClientBuilder.standard().setAuthentication(wrapper).build();

        //No latch here, just need to make sure it got called once.
        verify(provider).provide(client);
    }

    /**
     * CountdownLatch should be called 2 times in this teest. Once
     * synchronously, and once asynchronously.
     *
     * @throws Exception
     */
    @Test
    @Timeout(value = 4, unit = TimeUnit.SECONDS)
    void credentialProviderTimerInvoked() throws Exception {
    CountDownLatch latch = new CountDownLatch(2);

        final Authentication provider = new Authentication() {
            @Override
            public void provide(ApiClient client) {
                latch.countDown();
            }
        };
        final Authentication wrapper = new AuthenticationRefresher(provider, 2);

        ClientBuilder.standard().setAuthentication(wrapper).build();

        latch.await();
    }

    /**
     * CountdownLatch should be called 1 time in this teest. Once
     * synchronously, and then the timer should cancel.
     *
     * @throws Exception
     */
    @Test
    @Timeout(value = 4, unit = TimeUnit.SECONDS)
    void credentialProviderTimerInvokedOnce() throws Exception {
        Authentication mockProvider = mock(Authentication.class);
        AuthenticationRefresher wrapper = new AuthenticationRefresher(mockProvider, 2);

        ClientBuilder.standard().setAuthentication(wrapper).build();
        wrapper.stop();

        assertFalse(wrapper.isRunning(), "Wrapper should be stopped.");
        verify(mockProvider, times(1)).provide(any(ApiClient.class));
    }
}
