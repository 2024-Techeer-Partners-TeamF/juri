### 03-11 형 변환과 final
- 형변환
    - 정수 → 문자열 형변환
        ```java
            public class Sample {
                public static void main(String[] args) {
                    int n = 123;
                    String num1 = String.valueOf(n);
                    String num2 = Integer.toString(n);
                   System.out.println(num1);  // 123(문자열) 출력
                    System.out.println(num2);  // 123(문자열) 출력
                }
            }
        ```
        - `String.valueOf(정수)`
            - 모든 기본 자료형이나 객체를 문자열로 변환
            - null을 입력하면 null 문자열 반환
            - 내부적으로는 Integer.toString(정수)를 호출하여 정수 문자열을 변환하지만 null 처리가 가능함
        - `Integer.toString(정수)`  
          - 오직 int 타입만 처리 가능
          - null 값 처리 x
          - null 발생시 NullPointerException 발생함
    - final
        
        ```java
        import java.util.ArrayList;
        import java.util.Arrays;
        
        public class Sample {
            public static void main(String[] args) {
                final ArrayList<String> a = new ArrayList<>(Arrays.asList("a", "b"));
                System.out.println(a); // a,b 출력
                a = new ArrayList<>(Arrays.asList("c", "d"));  // 컴파일 에러 발생
                a.add("c");
                a.add("d");
                System.out.println(a); // a,b,c,d 출력
            }
        }
        
        ```
        
        - 자료형에 값을 단 한번만 설정할 수 있는 강제 키워드
        - 값을 한 번 설정하면 변경 불가
        - 리스트의 경우 final로 선언 후 값을 add, remove  가능
    - 수정 불가한 리스트 `List.of`
        
        ```java
        import java.util.List;
        
        public class Sample {
            public static void main(String[] args) {
                final List<String> a = List.of("a", "b");
                a.add("c");  // UnsupportedOperationException 발생
            }
        }
        ```
        
        - 리스트 내용 수정 불가함
        
