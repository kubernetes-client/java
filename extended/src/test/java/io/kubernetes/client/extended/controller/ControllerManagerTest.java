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
package io.kubernetes.client.extended.controller;

import static org.assertj.core.api.Assertions.assertThat;

import io.kubernetes.client.informer.SharedInformerFactory;
import org.junit.jupiter.api.Test;

class ControllerManagerTest {

  @Test
  void controllerStartShutdown() {
    DummyController dummy1 = new DummyController();
    DummyController dummy2 = new DummyController();

    ControllerManager cm = new ControllerManager(new SharedInformerFactory(), dummy1, dummy2);

    cm.run();
    assertThat(dummy1.started).isTrue();
    assertThat(dummy2.started).isTrue();

    cm.shutdown();
    assertThat(dummy1.stopped).isTrue();
    assertThat(dummy2.stopped).isTrue();
  }

  static class DummyController implements Controller {

    private boolean started;
    private boolean stopped;

    @Override
    public void shutdown() {
      this.stopped = true;
    }

    @Override
    public void run() {
      this.started = true;
    }
  }
}
