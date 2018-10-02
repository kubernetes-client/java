package io.kubernetes.client.util;

import com.google.gson.reflect.TypeToken;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.ResponseBody;
import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ApiException;
import io.kubernetes.client.models.V1ObjectMeta;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.List;
import java.util.function.Function;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cache<ApiType, ApiListType> implements Closeable {
  private Function<Boolean, Call> callGenerator;
  private ApiClient client;
  private Watch<ApiType> watch;
  private ApiListType list;
  protected Type listClass;
  private Thread watchThread;

  private static final Logger log = LoggerFactory.getLogger(Cache.class);

  private Cache() {}

  public Cache(ApiClient client, Function<Boolean, Call> callGenerator) {
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

  public ApiType get(String namespace, String name) throws ApiException, IOException {
    if (list == null) {
      updateList();
    }
    if (watch == null) {
      startWatch();
    }
    try {
      return getItem(namespace, name);
    } catch (NoSuchFieldException | IllegalAccessException ex) {
      log.error("Failed to get item", ex);
    }
    return null;
  }

  public void close() throws IOException {
    if (watch != null) {
      watch.close();
    }
  }

  private void updateList() throws ApiException, IOException {
    Call call = callGenerator.apply(Boolean.FALSE);
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

  private ApiType getItem(String namespace, String name)
      throws NoSuchFieldException, IllegalAccessException {
    try {
      Field itemsField = listClass.getClass().getDeclaredField("items");
      Object itemsObj = itemsField.get(list); 
      List<ApiType> list = (List<ApiType>) itemsObj;
      for (ApiType obj : list) {
        V1ObjectMeta meta = Reflect.objectMetadata(obj);
        if (meta.getNamespace().equals(namespace) && meta.getName().equals(name)) {
          return obj;
        }
      }
    } catch (NoSuchFieldException | IllegalAccessException ex) {
      log.error("Error adding item", ex);
    }
    return null;
  }

  private void addOrUpdateItem(ApiType item) throws NoSuchFieldException, IllegalAccessException {
    System.out.println("Adding: " + item);
    V1ObjectMeta meta = Reflect.objectMetadata(item);
    try {
      Field itemsField = listClass.getClass().getDeclaredField("items");
      Object itemsObj = itemsField.get(list);
      List<ApiType> list = (List<ApiType>) itemsObj;
      for (int i = 0; i < list.size(); i++) {
        ApiType listItem = list.get(i);
        V1ObjectMeta itemMeta = Reflect.objectMetadata(listItem);
        if (itemMeta.getName().equals(meta.getName())) {
          list.set(i, item);
          return;
        }
      }
    } catch (NoSuchFieldException | IllegalAccessException ex) {
      log.error("Error adding item", ex);
    }
  }

  private void startWatch() throws ApiException {
    System.out.println("Starting watch.");
    Call call = callGenerator.apply(Boolean.TRUE);
    watch = Watch.createWatch(client, call, new TypeToken<Watch.Response<ApiType>>() {}.getType());
    watchThread =
        new Thread(
            new Runnable() {
              public void run() {
                try {
                  for (Watch.Response<ApiType> item : watch) {
                    System.out.println(item);
                    if (Watch.ERROR.equals(item.type)) {
                      continue;
                    }
                    if (Watch.ADDED.equals(item.type) || Watch.MODIFIED.equals(item.type)) {
                      addOrUpdateItem(item.object);
                      continue;
                    }
                    list = null;
                  }
                } catch (Exception ex) {
                  log.error("Error watching!", ex);
                } finally {
                  watch = null;
                  synchronized (this) {
                    list = null;
                  }
                }
              }
            });
    watchThread.start();
  }
}
