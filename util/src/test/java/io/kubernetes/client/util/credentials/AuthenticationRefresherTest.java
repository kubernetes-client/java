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

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.util.ClientBuilder;

public class AuthenticationRefresherTest {

    @Test
    void credentialProviderWrapperInvoked() throws IOException {
        final Authentication provider = mock(Authentication.class);
        final Authentication wrapper = new AuthenticationRefresher(provider, 15);

        final ApiClient client = ClientBuilder.standard().setAuthentication(wrapper).build();

        verify(provider).provide(client);
    }

    @Test
    void credentialProviderTimerInvoked() throws Exception {
        final Authentication provider = mock(Authentication.class);
        final Authentication wrapper = new AuthenticationRefresher(provider, 2);

        final ApiClient client = ClientBuilder.standard().setAuthentication(wrapper).build();

        Thread.sleep(3000);

        // verify provider mock called 2 times
        verify(provider, times(2)).provide(client);

    }

}
