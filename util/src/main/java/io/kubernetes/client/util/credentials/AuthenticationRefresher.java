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

import java.lang.ref.WeakReference;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.kubernetes.client.openapi.ApiClient;

/**
 * Wraps an existing {@link Authentication} and refreshes it every
 * expirationSeconds.
 *
 * Can be used with ClientBuilder as such:
 *
 * <pre> ClientBuilder.standard() .withAuthentication(new
 * AuthenticationRefresher(new KubeconfigAuthentication(), 60)) .build(); </pre>
 *
 * The AuthenticationRefresher maintains a {@link WeakReference} to the
 * ApiClient passed into provide. When the client instance goes out of scope,
 * the refresh timer will be cancelled and released.
 */
public class AuthenticationRefresher implements Authentication {

    private static final Logger log = LoggerFactory.getLogger(AuthenticationRefresher.class);

    private final Authentication delegateAuthentication;
    private final Long expirationSeconds;

    private final ScheduledExecutorService executor;

    public AuthenticationRefresher(Authentication delegateAuthentication, long expirationSeconds) {
        this.delegateAuthentication = delegateAuthentication;
        this.expirationSeconds = expirationSeconds;
        this.executor = Executors.newSingleThreadScheduledExecutor();
        log.debug("AuthenticationRefresher initialized with expirationSeconds: " + expirationSeconds);
    }

    /**
     * Calls delegateAuthentication every expirationSeconds
     */
    @Override
    public void provide(ApiClient client) {
        // Run it now, synchronously.
        log.debug("Invoking authentication");
        this.delegateAuthentication.provide(client);
        // Schedule the next run.
        scheduleRefresh(client);
    }

    private void scheduleRefresh(final ApiClient clientArg) {
        WeakReference<ApiClient> clientReference = new WeakReference<>(clientArg);

        executor.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                log.debug("Refreshing authentication");

                ApiClient client = clientReference.get();

                if (client == null) {
                    log.debug("ApiClient has been garbage collected, stopping refresh timer");
                    stop();
                    return;
                } else {
                    log.debug("Invoking authentication");
                    delegateAuthentication.provide(client);
                }

            }
        }, expirationSeconds, expirationSeconds, java.util.concurrent.TimeUnit.SECONDS);

    }

    public boolean isRunning() {
        return !executor.isShutdown();
    }

    public void stop() {
        executor.shutdownNow();
    }
}
