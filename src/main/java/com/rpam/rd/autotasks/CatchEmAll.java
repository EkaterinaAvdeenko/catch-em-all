package com.rpam.rd.autotasks;

import java.io.IOException;
import java.io.FileNotFoundException;
public class CatchEmAll {
  static Exception exception = null;

    private static void riskyMethod() throws Exception {
        if (exception != null) {
            throw exception;
        }
    }
    public static void main(String[] args) throws Exception {

       if (args.length >= 1) {
           if (args[0].equals("IOException")) {
             exception = new IOException("IO exception");
          } else if (args[0].equals("FileNotFoundException")) {
              exception = new FileNotFoundException("file not found exception");
           } else if (args[0].equals("ArithmeticException")) {
               exception = new ArithmeticException("arithmetic exception");
           } else if (args[0].equals("NumberFormatException")) {
                exception = new NumberFormatException("");
            } else if (args[0].equals("Exception")) {
                exception = new Exception("exception");
           } else {
               System.out.println("Используйте аргумент IOException, FileNotFoundException, ArithmeticException, NumberFormatException, Exception");
           }}

        try {
            riskyMethod();
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("Resource is missing", e);
        } catch (IOException e) {
            throw new IllegalArgumentException("Resource is error", e);
        } catch (ArithmeticException|NumberFormatException e) {
            System.err.print(e);
        }}}


