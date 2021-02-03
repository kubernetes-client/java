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
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;

public class Streams {

  public static final int BUFFER_SIZE = 4096;

  public static void copy(InputStream in, OutputStream out) throws IOException {
    byte[] buffer = new byte[BUFFER_SIZE];
    int bytesRead;
    while ((bytesRead = in.read(buffer)) != -1) {
      out.write(buffer, 0, bytesRead);
    }
    out.flush();
  }

  public static String toString(Reader reader) throws IOException {
    StringBuilder out = new StringBuilder(BUFFER_SIZE);
    char[] buffer = new char[BUFFER_SIZE];
    int charsRead;
    while ((charsRead = reader.read(buffer)) != -1) {
      out.append(buffer, 0, charsRead);
    }
    return out.toString();
  }

  public static void readFully(InputStream in, byte[] bytes) throws IOException {
    int total = 0;
    int len = bytes.length;
    while (total < len) {
      int result = in.read(bytes, total, len - total);
      if (result == -1) {
        break;
      }
      total += result;
    }
  }
}
