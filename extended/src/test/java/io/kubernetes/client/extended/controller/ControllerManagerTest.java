package io.kubernetes.client.extended.controller;

import static org.junit.Assert.*;

import io.kubernetes.client.informer.SharedInformerFactory;
import org.junit.Test;

public class ControllerManagerTest {

  @Test
  public void testControllerStartShutdown() {
    DummyController dummy1 = new DummyController();
    DummyController dummy2 = new DummyController();

    ControllerManager cm = new ControllerManager(new SharedInformerFactory(), dummy1, dummy2);

    cm.run();
    assertTrue(dummy1.started);
    assertTrue(dummy2.started);

    cm.shutdown();
    assertTrue(dummy1.stopped);
    assertTrue(dummy2.stopped);
  }

  class DummyController implements Controller {

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
