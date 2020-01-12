package com.kbj.androxlsxparser.mxlsxparser.exceptions;

public class MissingSheetException extends RuntimeException {

  public MissingSheetException() {
    super();
  }

  public MissingSheetException(String msg) {
    super(msg);
  }

  public MissingSheetException(Exception e) {
    super(e);
  }

  public MissingSheetException(String msg, Exception e) {
    super(msg, e);
  }
}
