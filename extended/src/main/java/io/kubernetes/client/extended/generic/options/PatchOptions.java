package io.kubernetes.client.extended.generic.options;

public class PatchOptions {
  private String dryRun;
  private String fieldManager;
  private Boolean force;

  public String getDryRun() {
    return dryRun;
  }

  public void setDryRun(String dryRun) {
    this.dryRun = dryRun;
  }

  public Boolean getForce() {
    return force;
  }

  public void setForce(Boolean force) {
    this.force = force;
  }

  public String getFieldManager() {
    return fieldManager;
  }

  public void setFieldManager(String fieldManager) {
    this.fieldManager = fieldManager;
  }
}
