package io.kubernetes.client.util;

import java.io.IOException;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import io.kubernetes.client.ApiException;

public class ResponseUtils {
  
  public static String getResponseString(Response response) throws ApiException {
    String respBody = null;
    if (response.isSuccessful()) {
      try (ResponseBody body = response.body()) {
        if (body != null) {
          respBody = response.body().source().readUtf8Line();
        }
      } catch (IOException e) {
        throw new ApiException(
            response.message(), e, response.code(), response.headers().toMultimap());
      }
      throw new ApiException(
          response.message(), response.code(), response.headers().toMultimap(), respBody);
    }
    
    return respBody;
  }

}
