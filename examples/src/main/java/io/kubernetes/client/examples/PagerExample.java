package io.kubernetes.client.examples;

import com.google.gson.reflect.TypeToken;
import com.squareup.okhttp.Call;
import io.kubernetes.client.ApiClient;
import io.kubernetes.client.Configuration;
import io.kubernetes.client.apis.CoreV1Api;
import io.kubernetes.client.models.V1Namespace;
import io.kubernetes.client.models.V1NamespaceList;
import io.kubernetes.client.pager.Pager;
import io.kubernetes.client.util.Config;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class PagerExample {
  public static void main(String[] args) {

    try {

      ApiClient client = Config.defaultClient();
      client.getHttpClient().setReadTimeout(60, TimeUnit.SECONDS);
      Configuration.setDefaultApiClient(client);
      CoreV1Api api = new CoreV1Api();
      Call call =
          api.listNamespaceCall(
              null, "pretty", null, null, null, null, null, null, null, null, null);

      Pager pager = new Pager(client, call, 1, new TypeToken<V1NamespaceList>() {}.getType());
      while (pager.hasNext()) {
        V1NamespaceList list = pager.next();
        List<V1Namespace> items = list.getItems();
        for (V1Namespace namespace : items) {
          System.out.println(namespace.getMetadata().getName());
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
