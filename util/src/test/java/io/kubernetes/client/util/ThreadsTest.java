import org.junit.Test;

import java.util.concurrent.ThreadFactory;

import static org.junit.Assert.assertEquals;

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
