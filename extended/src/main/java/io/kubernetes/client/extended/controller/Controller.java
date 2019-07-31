package io.kubernetes.client.extended.controller;

/** The interface Controller defines the interface for operating a controller. */
public interface Controller extends Runnable {
  /** Shutdown the controller. */
  void shutdown();
}
