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
package io.kubernetes.client.util.credentials;

import io.kubernetes.client.openapi.ApiClient;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Instant;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

// TODO: prefer OpenAPI backed Auentication once it is available. see details in
// https://github.com/OpenAPITools/openapi-generator/pull/6036. currently, the
// workaround is to hijack the http request.
public class TokenFileAuthentication implements Authentication, Interceptor {
  private String file;
  private String token;
  private Instant expiry;

  public TokenFileAuthentication(String file) {
    this.expiry = Instant.MIN;
    this.file = file;
  }

  private String getToken() {
    if (Instant.now().isAfter(this.expiry)) {
      try {
        this.token =
            new String(Files.readAllBytes(Paths.get(this.file)), Charset.defaultCharset()).trim();
        expiry = Instant.now().plusSeconds(60);
      } catch (IOException ie) {
        throw new RuntimeException("Cannot read file: " + this.file);
      }
    }

    return this.token;
  }

  public void setExpiry(Instant expiry) {
    this.expiry = expiry;
  }

  public void setFile(String file) {
    this.file = file;
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
