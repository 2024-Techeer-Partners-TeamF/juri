#### MVC패턴
- Model
  - 데이터를 관리하는 역할
- View
  - 웹 페이지를 화면에 보여주는 역할
  - 웹 페이지를 하나의 틀로 만들고, 여기에 변수를 삽입해 서로 다른 페이지를 보여줌(뷰 템플릿)
- Controller
  - 클라이언트의 요청에 따라 서버에서 이를 처리하는 역할
- 즉 MVC 패턴은 모델, 뷰, 컨트롤러의 역할을 나눈 기법
- - -   
#### 어노테이션(annotation)
  - 소스코드에 추가해 사용하는 메타 데이터의 일종
  - 메타데이터란? 컴파일 및 실행 과정에서 코드를 어떻게 처리할지 알려주는 추가 정보
- 자바에서는 '@'기호를 붙여 사용

  
#### 실행결과에서 한글 깨짐 현상
- 아래 코드를 src >  main > resources > application.properties 에 추가하면 됨
  ```server.servlet.encoding.force=true;```

#### 모델(Model) 객체
- 스프링이 지원하는 기능으로, HashMap 형태(key-valu)
- Model의 attribute를 통해 뷰에 전달할 데이터 저장 가능
  ``` @GetMapping("/bye")
    public String seeYouNext(Model model){
        model.addAttribute("nickname", "홍길동");
        return "goodbye";
    }
    ```