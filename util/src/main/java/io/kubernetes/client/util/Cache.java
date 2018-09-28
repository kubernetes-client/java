package io.kubernetes.client.util;

import com.google.gson.reflect.TypeToken;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.ResponseBody;
import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ApiException;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.function.Supplier;

public class Cache<ApiType, ApiListType> implements Closeable {
  private Supplier<Call> callGenerator;
  private ApiClient client;
  private Watch<ApiType> watch;
  private ApiListType list;
  protected Type listClass;
  private Thread watchThread;

  private Cache() {}

  public Cache(ApiClient client, Supplier<Call> callGenerator) {
    this.client = client;
    this.callGenerator = callGenerator;
    this.watch = null;
    this.listClass = new TypeToken<ApiListType>() {}.getType();
  }

  public synchronized ApiListType list() throws ApiException, IOException {
    if (list == null) {
      updateList();
    }
    if (watch == null) {
      startWatch();
    }
    return list;
  }

  public ApiType get(String namespace, String name) {
    return null;
  }

  public void close() throws IOException {
    if (watch != null) {
      watch.close();
    }
  }

  private void updateList() throws ApiException, IOException {
    Call call = callGenerator.get();
    com.squareup.okhttp.Response response = call.execute();
    if (!response.isSuccessful()) {
      String respBody = null;
      try (ResponseBody body = response.body()) {
        if (body != null) {
          respBody = response.body().string();
        }
      } catch (IOException e) {
        throw new ApiException(
            response.message(), e, response.code(), response.headers().toMultimap());
      }
      throw new ApiException(
          response.message(), response.code(), response.headers().toMultimap(), respBody);
    }
    list = client.getJSON().getGson().fromJson(response.body().charStream(), listClass);
  }

  private void startWatch() throws ApiException {
    Call call = callGenerator.get();
    watch = Watch.createWatch(client, call, new TypeToken<Watch.Response<ApiType>>() {}.getType());
    watchThread =
        new Thread(
            new Runnable() {
              public void run() {
                try {
                  for (Watch.Response<ApiType> item : watch) {
                    // TODO: better invalidation here
                    synchronized (this) {
                      list = null;
                    }
                  }
                } finally {
                  watch = null;
                  synchronized (this) {
                    list = null;
                  }
                }
              }
            });
  }
}
