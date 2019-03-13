package io.kubernetes.client.pager;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.function.Function;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ApiException;
import io.kubernetes.client.models.V1ListMeta;
import io.kubernetes.client.util.ResponseUtils;

public class Pager {
  private String _continue;
  private Integer limit;
  private ApiClient client;
  private Call call;
  private Type listType;
  private Function<PagerParams, Call> listFunc;

  public Pager(Function<PagerParams, Call> listFunc, ApiClient client, Integer limit, Type listType) {
    this.listFunc = listFunc;
    this.client = client;
    this.limit = limit;
    this.listType = listType;
  }

  public Boolean hasNext() {
    if (_continue == null && call != null) {
      return Boolean.FALSE;
    }
    return Boolean.TRUE;
  }

  public <T> T next()
      throws NoSuchFieldException, SecurityException, IllegalArgumentException,
          IllegalAccessException, IOException, ApiException {
    call = getNextCall();
    return executeRequest(client, call, listType);
  }

  private Call getNextCall() {
    PagerParams params = new PagerParams();
    if(_continue != null) {
    params.setContinue(_continue);
    }
    params.setLimit(limit);
    return listFunc.apply(params);
  }

  private <T> T executeRequest(ApiClient client, Call call, Type listType)
      throws IOException, ApiException {
    String line = ResponseUtils.getResponseString(call.execute());
    setNextContinue(line);
    return client.getJSON().deserialize(line, listType);
  }

  private void setNextContinue(String line) {
    JsonParser parser = new JsonParser();
    JsonObject json = (JsonObject) parser.parse(line);
    if (json.has("kind") && json.has("metadata")) {
      String kind = json.get("kind").getAsString();
      if (kind.contains("List")) {
        V1ListMeta metaList =
            client.getJSON().deserialize(json.get("metadata").toString(), V1ListMeta.class);
        _continue = metaList.getContinue();
      }else {
        throw new RuntimeException("Subsequent call failed " + line);
      }
    } else {
      throw new RuntimeException("Subsequent call failed " + line);
    }
  }
 
}
