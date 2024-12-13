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

import io.kubernetes.client.openapi.ApiClient;

import java.io.IOException;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.util.function.Supplier;

import io.kubernetes.client.util.exception.TokenAquisitionException;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

// TODO: prefer OpenAPI backed Auentication once it is available. see details in
// https://github.com/OpenAPITools/openapi-generator/pull/6036. currently, the
// workaround is to hijack the http request.
public class RefreshAuthentication implements Authentication, Interceptor {
  private Instant expiry;
  private Duration refreshPeriod;
  private String token;
  private Supplier<String> tokenSupplier;
  private Clock clock;

  public RefreshAuthentication(Supplier<String> tokenSupplier, Duration refreshPeriod) {
    this(tokenSupplier, refreshPeriod, Clock.systemUTC());
  }

  public RefreshAuthentication(Supplier<String> tokenSupplier, Duration refreshPeriod, Clock clock) {
    this.expiry = Instant.MIN;
    this.refreshPeriod = refreshPeriod;
    try {
      this.token = tokenSupplier.get();
    } catch (RuntimeException e) {
      throw new TokenAquisitionException(e);
    }
    this.tokenSupplier = tokenSupplier;
    this.clock = clock;
  }

  private String getToken() {
    if (Instant.now(this.clock).isAfter(this.expiry)) {
      try {
        this.token = tokenSupplier.get();
      } catch (RuntimeException e) {
        throw new TokenAquisitionException(e);
      }
      expiry = Instant.now(this.clock).plusSeconds(refreshPeriod.toSeconds());
    }
    return this.token;
  }

  public Duration getRefreshPeriod() {
    return this.refreshPeriod;
  }

  public void setExpiry(Instant expiry) {
    this.expiry = expiry;
  }

  @Override
  public void provide(ApiClient client) {
    OkHttpClient withInterceptor = client.getHttpClient().newBuilder().addInterceptor(this).build();
    client.setHttpClient(withInterceptor);
  }

  @Override
  public Response intercept(Interceptor.Chain chain) throws IOException {
    Request request = chain.request();
    Request newRequest;
    newRequest = request.newBuilder().header("Authorization", "Bearer " + getToken()).build();
    return chain.proceed(newRequest);
  }
}
