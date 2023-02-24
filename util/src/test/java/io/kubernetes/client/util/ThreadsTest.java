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

import static org.junit.Assert.assertEquals;

import java.util.concurrent.ThreadFactory;
import org.junit.Test;

public class ThreadsTest {
  @Test
  public void testThreadFactory() {
    ThreadFactory threadFactory = Threads.threadFactory("test-%d");
    Thread thread = threadFactory.newThread(() -> {});
    assertEquals("test-1", thread.getName());
  }

  @Test
  public void testSetDefaultThreadFactory() {
    ThreadFactory customThreadFactory = r -> new Thread(r, "custom-thread");
    Threads.setDefaultThreadFactory(customThreadFactory);
    ThreadFactory threadFactory = Threads.threadFactory("test-%d");
    Thread thread = threadFactory.newThread(() -> {});
    assertEquals("custom-thread", thread.getName());
  }
}
