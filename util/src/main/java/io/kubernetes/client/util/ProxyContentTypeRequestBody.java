/** Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved. */
package io.kubernetes.client.util;

import com.google.common.base.Strings;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.RequestBody;
import java.io.IOException;
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
