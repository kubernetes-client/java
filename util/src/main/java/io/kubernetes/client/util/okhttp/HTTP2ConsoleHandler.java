/*
Copyright 2021 The Kubernetes Authors.
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
package io.kubernetes.client.util.okhttp;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

class HTTP2ConsoleHandler extends ConsoleHandler {

  public HTTP2ConsoleHandler() {
    setLevel(Level.FINE);
    setFormatter(new Formatter());
  }

  public static class Formatter extends java.util.logging.Formatter {
    @Override
    public String format(LogRecord record) {
      return String.format("[%1$tF %1$tT] %2$s %n", record.getMillis(), record.getMessage());
    }
  }
}
