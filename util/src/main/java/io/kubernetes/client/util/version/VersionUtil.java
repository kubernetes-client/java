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
    try{
      response = call.execute();
    }catch (IOException ex){
      throw new ApiException("Version request failed");
    }

    if(!response.isSuccessful()){
      throw new ApiException(response.code(), "Version request failed: " + response.code());
    }
    Gson gson = new Gson();
    VersionInfo versionInfo = gson.fromJson(response.body().string(), VersionInfo.class);
    return versionInfo;
  }
}
