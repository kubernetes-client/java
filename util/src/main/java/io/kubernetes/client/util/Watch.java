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

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.JSON;
import io.kubernetes.client.openapi.models.V1Status;
import java.io.Closeable;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.Iterator;
import okhttp3.Call;
import okhttp3.ResponseBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Watch class implements watch mechansim of kubernetes. For every list API call with a watch
 * parameter you should be able to pass its call to this class and watch changes to that list. For
 * example CoreV1Api.listNamespace has watch parameter, so you can create a call using
 * CoreV1Api.listNamespaceCall and set watch to True and watch the changes to namespaces.
 */
public class Watch<T> implements Watchable<T>, Closeable {

  private static final Logger log = LoggerFactory.getLogger(Watch.class);

  /**
   * Response class holds a watch response that has a `type` that can be ADDED, MODIFIED, DELETED
   * and ERROR. It also hold the actual target object.
   */
  public static class Response<T> {
    @SerializedName("type")
    public String type;

    @SerializedName("object")
    public T object;

    public V1Status status;

    public Response() {}

    public Response(String type, T object) {
      this.type = type;
      this.object = object;
      this.status = null;
    }

    public Response(String type, V1Status status) {
      this.type = type;
      this.object = null;
      this.status = status;
    }
  }

  Type watchType;
  ResponseBody response;
  JSON json;
  Call call;

  /**
   * Creates a watch on a TYPENAME (T) using an API Client and a Call object.
   *
   * @param client the API client
   * @param call the call object returned by api.{ListOperation}Call(...) method. Make sure watch
   *     flag is set in the call.
   * @param watchType The type of the WatchResponse&lt;T&gt;. Use something like new
   *     TypeToken&lt;Watch.Response&lt;TYPENAME&gt;&gt;(){}.getType()
   * @param <T> TYPENAME.
   * @return Watch object on TYPENAME
   * @throws ApiException on IO exceptions.
   */
  public static <T> Watch<T> createWatch(ApiClient client, Call call, Type watchType)
      throws ApiException {
    if (client.isDebugging()) {
      log.warn(
          "Watch is (for now) incompatible with debugging mode active. Watches will not return data until the watch connection terminates");
      throw new ApiException("Watch is incompatible with debugging mode active.");
    }
    try {
      okhttp3.Response response = call.execute();
      if (!response.isSuccessful()) {
        String respBody = null;
        try (ResponseBody body = response.body()) {
          if (body != null) {
            respBody = body.string();
          }
        } catch (IOException e) {
          throw new ApiException(
              response.message(), e, response.code(), response.headers().toMultimap());
        }
        throw new ApiException(
            response.message(), response.code(), response.headers().toMultimap(), respBody);
      }
      return new Watch<>(client.getJSON(), response.body(), watchType, call);
    } catch (IOException e) {
      throw new ApiException(e);
    }
  }

  protected Watch(JSON json, ResponseBody body, Type watchType, Call call) {
    this.response = body;
    this.watchType = watchType;
    this.json = json;
    this.call = call;
  }

  public Response<T> next() {
    try {
      String line = response.source().readUtf8Line();
      if (line == null) {
        throw new RuntimeException("Null response from the server.");
      }
      return parseLine(line);
    } catch (IOException e) {
      throw new RuntimeException("IO Exception during next method.", e);
    }
  }

  protected boolean isStatus(String line) throws IOException {
    boolean found = false;
    JsonReader reader = new JsonReader(new StringReader(line));
    reader.beginObject();
    // extract object data.
    while (reader.hasNext()) {
      String name = reader.nextName();
      if (name.equals("object")) {
        found = true;
        break;
      }
      reader.skipValue();
    }
    if (!found) {
      return false;
    }

    String kind = null;
    String apiVersion = null;
    reader.beginObject();
    while (reader.hasNext()) {
      String name = reader.nextName();
      if (name.equals("kind")) {
        kind = reader.nextString();
      } else if (name.equals("apiVersion")) {
        apiVersion = reader.nextString();
      } else {
        reader.skipValue();
      }
      if (apiVersion != null && kind != null) {
        break;
      }
    }
    return "Status".equals(kind) && "v1".equals(apiVersion);
  }

  protected Response<T> parseLine(String line) throws IOException {
    if (!isStatus(line)) {
      return json.deserialize(line, watchType);
    }
    Type statusType = new TypeToken<Response<V1Status>>() {}.getType();
    Response<V1Status> status = json.deserialize(line, statusType);
    return new Response<T>(status.type, status.object);
  }

  public boolean hasNext() {
    try {
      return !response.source().exhausted();
    } catch (IOException e) {
      throw new RuntimeException("IO Exception during hasNext method.", e);
    }
  }

  public Iterator<Response<T>> iterator() {
    return this;
  }

  public void remove() {
    throw new UnsupportedOperationException("remove");
  }

  public void close() throws IOException {
    this.call.cancel();
    this.response.close();
  }
}
