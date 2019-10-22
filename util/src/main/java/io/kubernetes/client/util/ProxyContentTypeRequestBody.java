package io.kubernetes.client.util;

import com.google.common.base.Strings;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;

public class ProxyContentTypeRequestBody extends RequestBody {

  private String overridePatchFormat;
  private RequestBody delegateRequestBody;

  public ProxyContentTypeRequestBody(RequestBody delegateRequestBody) {
    this.delegateRequestBody = delegateRequestBody;
  }

  public ProxyContentTypeRequestBody(RequestBody delegateRequestBody, String patchFormat) {
    this(delegateRequestBody);
    this.overridePatchFormat = patchFormat;
  }

  @Override
  public MediaType contentType() {
    if (!Strings.isNullOrEmpty(overridePatchFormat)) {
      return MediaType.parse(overridePatchFormat);
    }
    return delegateRequestBody.contentType();
  }

  @Override
  public void writeTo(BufferedSink bufferedSink) throws IOException {
    delegateRequestBody.writeTo(bufferedSink);
  }
}
