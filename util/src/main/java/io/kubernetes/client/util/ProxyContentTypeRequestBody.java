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
