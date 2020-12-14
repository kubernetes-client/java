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
package io.kubernetes.client;

import io.kubernetes.client.util.Streams;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;

public class Resources {

  public static URL getResource(String name) {
    return Resources.class.getClassLoader().getResource(name);
  }

  public static String toString(URL url, Charset charset) {
    try {
      return Streams.toString(new InputStreamReader(url.openStream(), charset));
    } catch (IOException e) {
      throw new IllegalStateException(e);
    }
  }
}
