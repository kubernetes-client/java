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

import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2;

public class HTTP2Logging {

  private static final HTTP2ConsoleHandler consoleHandler = new HTTP2ConsoleHandler();

  private static boolean debuggingHTTP2 = false;
  private static final Logger http2Logger = Logger.getLogger(Http2.class.getName());

  private static boolean debuggingTaskRunner = false;
  private static final Logger taskRunnerLogger = Logger.getLogger(TaskRunner.class.getName());

  public static void enableHTTP2Logging(boolean enable) {
    if (debuggingHTTP2 == enable) {
      return;
    }
    if (enable) {
      http2Logger.addHandler(consoleHandler);
      http2Logger.setLevel(Level.FINEST);
    } else {
      http2Logger.removeHandler(consoleHandler);
      http2Logger.setLevel(Level.INFO);
    }
    debuggingHTTP2 = enable;
  }

  public static void enableTaskRunnerLogging(boolean enable) {
    if (debuggingTaskRunner == enable) {
      return;
    }
    if (enable) {
      taskRunnerLogger.addHandler(consoleHandler);
      taskRunnerLogger.setLevel(Level.FINEST);
    } else {
      taskRunnerLogger.removeHandler(consoleHandler);
      taskRunnerLogger.setLevel(Level.INFO);
    }
    debuggingTaskRunner = enable;
  }
}
