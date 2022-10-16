package test;

import java.io.Serializable;

public class TestBean implements Serializable {
  private static final long serialVersionUID = 1L;

  private String testvalue1;

  private String testvalue2;

  public TestBean() {}

  public String getTestvalue1() {
    return testvalue1;
  }

  public void setTestvalue1(String testvalue1) {
    this.testvalue1 = testvalue1;
  }

  public String getTestvalue2() {
    return testvalue2;
  }

  public void setTestvalue2(String testvalue2) {
    this.testvalue2 = testvalue2;
  }



}
