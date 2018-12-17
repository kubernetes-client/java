package io.kubernetes.client.util;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.ResponseBody;
import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ApiException;
import io.kubernetes.client.models.V1ObjectMeta;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import java.util.function.Function;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cache<ApiType, ApiListType> implements Closeable {
  private Function<Boolean, Call> callGenerator;
  private ApiClient client;
  private Watch<ApiType> watch;
  private Type watchType;
  private ApiListType list;
  private Class<?> listClass;
  private Thread watchThread;

  private static final Logger log = LoggerFactory.getLogger(Cache.class);

  private Cache() {}

  public Cache(
      ApiClient client, Function<Boolean, Call> callGenerator, Class<?> listClass, Type watchType) {
    this.client = client;
    this.callGenerator = callGenerator;
    this.watch = null;
    this.watchType = watchType;
    this.listClass = listClass;
    this.list = null;
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

  public synchronized ApiType get(String namespace, String name) throws ApiException, IOException {
    if (list == null) {
      updateList();
    }
    if (watch == null) {
      startWatch();
    }
    return getItem(namespace, name);
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
    list =
        (ApiListType) client.getJSON().getGson().fromJson(response.body().charStream(), listClass);
  }

  private ApiType getItem(String namespace, String name) {
    try {
      Method itemsField = listClass.getDeclaredMethod("getItems");
      Object itemsObj = itemsField.invoke(list);
      List<ApiType> itemList = (List<ApiType>) itemsObj;
      for (ApiType obj : itemList) {
        V1ObjectMeta meta = Reflect.objectMetadata(obj);
        if (meta.getNamespace().equals(namespace) && meta.getName().equals(name)) {
          return obj;
        }
      }
    } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException ex) {
      log.error("Error adding item", ex);
      ex.printStackTrace();
    }
    return null;
  }

  private int findItem(List<ApiType> itemList, ApiType item)
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
    V1ObjectMeta meta = Reflect.objectMetadata(item);
    for (int i = 0; i < itemList.size(); i++) {
      ApiType listItem = itemList.get(i);
      V1ObjectMeta itemMeta = Reflect.objectMetadata(listItem);
      if (itemMeta.getName().equals(meta.getName())) {
        return i;
      }
    }
    return -1;
  }

  private List<ApiType> getItemList()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
    Method itemsField = listClass.getDeclaredMethod("getItems");
    Object itemsObj = itemsField.invoke(this.list);
    return (List<ApiType>) itemsObj;
  }

  private void addOrUpdateItem(ApiType item) {
    try {
      List<ApiType> itemList = getItemList();
      int ix = findItem(itemList, item);
      if (ix != -1) {
        itemList.set(ix, item);
      } else {
        itemList.add(item);
      }
    } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException ex) {
      log.error("Error adding item", ex);
      ex.printStackTrace();
    }
  }

  private void removeItem(ApiType item) {
    try {
      List<ApiType> itemList = getItemList();
      int ix = findItem(itemList, item);
      if (ix != -1) {
        itemList.remove(ix);
      }
    } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException ex) {
      log.error("Error adding item", ex);
      ex.printStackTrace();
    }
  }

  private void startWatch() throws ApiException {
    System.out.println("Starting watch.");
    Call call = callGenerator.apply(Boolean.TRUE);
    watch = Watch.createWatch(client, call, watchType);
    watchThread =
        new Thread(
            new Runnable() {
              public void run() {
                try {
                  for (Watch.Response<ApiType> item : watch) {
                    if (Watch.ERROR.equals(item.type)) {
                      continue;
                    }
                    if (Watch.ADDED.equals(item.type) || Watch.MODIFIED.equals(item.type)) {
                      addOrUpdateItem(item.object);
                      continue;
                    }
                    if (Watch.DELETED.equals(item.type)) {
                      removeItem(item.object);
                      continue;
                    }
                  }
                } catch (Exception ex) {
                  ex.printStackTrace();
                  log.error("Error watching!", ex);
                } finally {
                  System.out.println("Exiting watch...");
                  synchronized (this) {
                    watch = null;
                    list = null;
                  }
                }
              }
            });
    watchThread.start();
  }
}
