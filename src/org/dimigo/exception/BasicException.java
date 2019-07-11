package org.dimigo.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BasicException {
    public static void main(String[] args) {
        try {
            uncheckedException(null);
            checkedException();
            String id = null;
            validate(id);
        } catch (Exception e) {
            System.out.println("오류 검출");
        }
    }

    //컴파일러가 강제적으로 예외처리를 요구하지 않음
    private static void uncheckedException(String s) {
        try {
            System.out.println(s.length());
            System.out.println(Integer.parseInt("123a"));
        } catch (NullPointerException npe) {
            System.out.println("문자열이 입력되지 않았습니다.");
            npe.printStackTrace();
        } catch (NumberFormatException nfe) {
            System.out.println("숫자가 아닙니다.");
        } catch (Exception e) {
            System.out.println("알 수 없는 에러가 발생했습니다.");
        }
    }

    //컴파일러가 예외처리를 요구함
    private static void checkedException() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (FileNotFoundException fne) {
            System.out.println("파일이 없습니다.");
        } catch (IOException ie) {
            System.out.println("..");
        }
    }


    private static void validate(String id) throws Exception {

        try {
            if (id == null || "".equals(id)) {
                Exception e = new Exception("ID를 입력하세요.");
                throw e;
            } else if (id.length() < 8) {
                throw new Exception("8자 이상 입력하세요.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
