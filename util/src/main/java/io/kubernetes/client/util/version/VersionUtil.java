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
package io.kubernetes.client.util.version;

import com.google.gson.Gson;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.apis.VersionApi;
import io.kubernetes.client.openapi.models.VersionInfo;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Response;

public class VersionUtil {

  private ApiClient apiClient;
  private VersionApi versionApi;

  public VersionUtil() {
    this(Configuration.getDefaultApiClient());
  }

  public VersionUtil(ApiClient apiClient) {
    this.apiClient = apiClient;
    this.versionApi = new VersionApi(apiClient);
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public VersionInfo getVersion() throws ApiException, IOException {
    Call call = versionApi.getCodeCall(null);
    Response response = null;
    try {
      response = call.execute();
    } catch (IOException ex) {
      throw new ApiException("Version request failed");
    }

    if (!response.isSuccessful()) {
      throw new ApiException(response.code(), "Version request failed: " + response.code());
    }
    Gson gson = new Gson();
    VersionInfo versionInfo = gson.fromJson(response.body().string(), VersionInfo.class);
    return versionInfo;
  }
}
