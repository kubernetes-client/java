package io.kubernetes.client.extended.generic.options;

public class CreateOptions {
  private String dryRun;
  private String fieldManager;

  public String getDryRun() {
    return dryRun;
  }

  public void setDryRun(String dryRun) {
    this.dryRun = dryRun;
  }

  public String getFieldManager() {
    return fieldManager;
  }

  public void setFieldManager(String fieldManager) {
    this.fieldManager = fieldManager;
  }
}
