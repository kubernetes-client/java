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

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class Threads {
  private static ThreadFactory defaultFactory = Executors.defaultThreadFactory();
  // Users can inject their own thread
  public static void setDefaultThreadFactory(ThreadFactory factory) {
    defaultFactory = factory;
  }

  public static ThreadFactory threadFactory(String format) {
    final AtomicInteger threadNumber = new AtomicInteger(1);
    return r -> {
      Thread thread = defaultFactory.newThread(r);
      // Daemon status inherited from default
      thread.setName(String.format(format, threadNumber.getAndIncrement()));
      return thread;
    };
  }
}
