package io.kubernetes.client.pager;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ApiException;
import io.kubernetes.client.models.V1ConfigMapList;
import io.kubernetes.client.models.V1ListMeta;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;

public class Pager {
  private Request originalRequest;
  private String _continue;
  private String resourceVersion;
  private int limit;
  private ApiClient client;
  private Call call;
  private Type listType;

  public Pager(ApiClient client, Call call, int limit, Type listType) {
    this.client = client;
    this.call = call;
    this.limit = limit;
    this.listType = listType;
  }

  public Boolean hasNext() {
    if (_continue == null && originalRequest != null) {
      return Boolean.FALSE;
    }
    return Boolean.TRUE;
  }

  public <T> T next()
      throws NoSuchFieldException, SecurityException, IllegalArgumentException,
          IllegalAccessException, IOException, ApiException {

    // first call;
    if (_continue == null && originalRequest == null) {
      Class cls = call.getClass();
      Field field = cls.getDeclaredField("originalRequest");
      field.setAccessible(true);
      originalRequest = (Request) field.get(call);
    } else if (_continue == null && originalRequest != null) {
      // list was exhausted at server
      V1ConfigMapList list =
          client.getJSON().deserialize("{}", new TypeToken<V1ConfigMapList>() {}.getType());
    } else {
      // subsequent calls
      Request nextRequest = transFormRequest();
      call = client.getHttpClient().newCall(nextRequest);
    }
    return executeRequest(client, call, listType);
  }

  private Request transFormRequest() {
    HttpUrl url =
        originalRequest
            .httpUrl()
            .newBuilder()
            .setQueryParameter("continue", _continue)
            .setQueryParameter("limit", String.valueOf(limit))
            // .addQueryParameter("resourceversion", resourceVersion)
            .build();
    Request request = new Request.Builder().headers(originalRequest.headers()).url(url).build();
    return request;
  }

  private <T> T executeRequest(ApiClient client, Call call, Type listType)
      throws IOException, ApiException {
    Response response = call.execute();

    String line = response.body().source().readUtf8Line();
    // TODO: handle all responses.
    JsonParser parser = new JsonParser();
    JsonObject json = (JsonObject) parser.parse(line);
    if (json.has("kind") && json.has("metadata")) {
      String kind = json.get("kind").getAsString();
      if (kind.contains("List")) {
        V1ListMeta metaList =
            client.getJSON().deserialize(json.get("metadata").toString(), V1ListMeta.class);
        _continue = metaList.getContinue();
        resourceVersion = metaList.getResourceVersion();
      }
    } else {
      throw new RuntimeException("Subsequent call failed " + line);
    }
    return client.getJSON().deserialize(line, listType);
  }
}
