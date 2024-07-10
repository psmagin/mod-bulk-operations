package org.folio.bulkops.domain.bean;

public enum PreferredEmailCommunication {

  SUPPORT("Support"), PROGRAMS("Programs"), SERVICES("Services");

  private String value;

  PreferredEmailCommunication(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
