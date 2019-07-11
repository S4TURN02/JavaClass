package org.dimigo.movieRank;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class movieAPI {
    public static void main(String[] args) {

        int menu;
        String Key = "c360cae7bd830a71de61ffa665285680";
        Scanner s = new Scanner(System.in);

        while (true) {
            mainMenu();

            System.out.printf("원하시는 기능의 번호를 입력해 주세요 : ");
            menu = s.nextInt();

            switch (menu) {
                case 1:
                    searchDailyBoxOffice(Key);
                    break;
                case 2:
                    searchMovieCode(Key);
                    searchMovieInformation(Key);
                    break;
                case 3:
                    searchPerson(Key);
                    searchPersonInformation(Key);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("올바른 번호를 입력해 주세요.");
            }
        }

    }

    private static void searchPersonInformation(String Key) {
        String peopleCode;
        Scanner s = new Scanner(System.in);
        System.out.printf("영화인 코드를 입력해 주세요 : ");
        peopleCode = s.nextLine();

        try {
            String apiURL = "http://www.kobis.or.kr/kobisopenapi/webservice/rest/people/searchPeopleInfo.json?key=" + Key + "&peopleCd=" + peopleCode;
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            int responseCode = con.getResponseCode();
            BufferedReader br;
            if (responseCode == 200) {
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine).append("\n");
            }
            br.close();
            parseNmInfo(response.toString());

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void searchPerson(String Key) {
        String requestName;
        Scanner s = new Scanner(System.in);

        System.out.printf("영화인 이름을 입력하세요 : ");
        requestName = s.nextLine();

        try {
            String apiURL = "http://www.kobis.or.kr/kobisopenapi/webservice/rest/people/searchPeopleList.json?key=" + Key + "&peopleNm=" + requestName;
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            int responseCode = con.getResponseCode();
            BufferedReader br;
            if (responseCode == 200) {
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine).append("\n");
            }
            br.close();
            parseNmCode(response.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void searchDailyBoxOffice(String Key) {
        int requestTime;
        int requestMonth;
        int requestDate;
        String requestNation;
        Scanner s = new Scanner(System.in);

        System.out.printf("해당 날짜를 입력해 주세요(YYYYMMDD) : ");
        requestTime = s.nextInt();

        requestMonth = requestTime % 10000 / 100;
        requestDate = requestTime % 100;

        if (requestMonth >= 1 && requestMonth <= 12) {
            if (getMaxDate(requestMonth) < requestDate) {
                System.out.println("올바른 날짜를 입력해 주세요.");
                return;
            }
        } else {
            System.out.println("올바른 날짜를 입력해 주세요.");
            return;
        }

        try {
            String apiURL = " http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=" + Key + "&targetDt=" + requestTime;
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            int responseCode = con.getResponseCode();
            BufferedReader br;
            if (responseCode == 200) {
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine).append("\n");
            }
            br.close();
            parseMovie(response.toString());

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void searchMovieCode(String Key) {

        String requestName;
        Scanner s = new Scanner(System.in);
        System.out.printf("영화 제목을 입력해 주세요 : ");
        requestName = s.nextLine();

        try {
            String requestText = URLEncoder.encode(requestName, "UTF-8");
            String apiURL = "http://www.kobis.or.kr/kobisopenapi/webservice/rest/movie/searchMovieList.json?key=" + Key + "&movieNm=" + requestText;
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            int responseCode = con.getResponseCode();
            BufferedReader br;
            if (responseCode == 200) {
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine).append("\n");
            }
            br.close();
            parseCode(response.toString());

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    private static void searchMovieInformation(String Key) {

        String movieCode;
        Scanner s = new Scanner(System.in);
        System.out.printf("영화 코드를 입력해 주세요 : ");
        movieCode = s.nextLine();

        try {
            String apiURL = "http://www.kobis.or.kr/kobisopenapi/webservice/rest/movie/searchMovieInfo.json?key=" + Key + "&movieCd=" + movieCode;
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            int responseCode = con.getResponseCode();
            BufferedReader br;
            if (responseCode == 200) {
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine).append("\n");
            }
            br.close();
            parseInfo(response.toString());

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void parseInfo(String json) throws Exception {
        Map < String, Object > map = new ObjectMapper().readValue(json, Map.class);

        Map < String, Object > list = (Map < String, Object > ) map.get("movieInfoResult");
        Map < String, Object > list2 = (Map < String, Object > ) list.get("movieInfo");
        System.out.printf("영화 제목 : %s, ", list2.get("movieNm"));
        System.out.printf("러닝타임 : %s, ", list2.get("showTm"));
        System.out.printf("개봉일 : %s\n", list2.get("openDt"));
    }

    private static void mainMenu() {
        System.out.println("<---------------------영화 정보 검색기--------------------->");
        System.out.println("                  1. 일별 박스오피스 검색                   ");
        System.out.println("                  2. 영화 정보 검색                         ");
        System.out.println("                  3. 영화인 대표작 검색                        ");
        System.out.println("                  4. 프로그램 종료                        ");
    }

    private static void parseMovie(String json) throws Exception {
        Map < String, Object > map = new ObjectMapper().readValue(json, Map.class);

        Map < String, Object > list = (Map < String, Object > ) map.get("boxOfficeResult");

        List < Map < String, String >> list2 = (List < Map < String, String >> ) list.get("dailyBoxOfficeList");

        for (Map < String, String > movie: list2) {
            String title = movie.get("movieNm");
            String Dt = movie.get("openDt");
            String rank = movie.get("rank");
            System.out.printf("%s위 => 제목:%s, 개봉일:%s\n", rank, title, Dt);
        }
    }

    private static void parseCode(String json) throws Exception {
        Map < String, Object > map = new ObjectMapper().readValue(json, Map.class);

        Map < String, Object > list = (Map < String, Object > ) map.get("movieListResult");

        List < Map < String, String >> list2 = (List < Map < String, String >> ) list.get("movieList");

        for (Map < String, String > movie: list2) {
            String mvCd = movie.get("movieCd");
            String mvNm = movie.get("movieNm");
            System.out.printf("영화 코드 : %s, 영화 제목 : %s\n", mvCd, mvNm);
        }
    }

    private static void parseNmCode(String json) throws Exception {
        Map < String, Object > map = new ObjectMapper().readValue(json, Map.class);

        Map < String, Object > list = (Map < String, Object > ) map.get("peopleListResult");

        List < Map < String, String >> list2 = (List < Map < String, String >> ) list.get("peopleList");

        for (Map < String, String > movie: list2) {
            String pCd = movie.get("peopleCd");
            System.out.printf("영화인 코드 : %s\n", pCd);
        }
    }

    private static void parseNmInfo(String json) throws Exception {
        Map < String, Object > map = new ObjectMapper().readValue(json, Map.class);
        Map < String, Object > map2 = (Map < String, Object > ) map.get("peopleInfoResult");
        Map < String, Object > list = (Map < String, Object > ) map2.get("peopleInfo");
        List < Map < String, String >> list2 = (List < Map < String, String >> ) list.get("filmos");

        System.out.println(list.get("peopleNm"));
        String movieNm1 = null;

        for (Map < String, String > movie: list2) {
            String movieNm = movie.get("movieNm");
            if ((!movieNm.equals(movieNm1)))
                System.out.printf("대표작 : %s\n", movieNm);
            movieNm1 = movieNm;

        }

    }

    private static int getMaxDate(int requestMonth) {
        if (requestMonth == 1 || requestMonth == 3 || requestMonth == 5 || requestMonth == 7 || requestMonth == 8 || requestMonth == 10 || requestMonth == 12) {
            return 31;
        } else if (requestMonth == 2) {
            return 28;
        } else
            return 30;
    }
}