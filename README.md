JDK 11.07

1. 본 프로젝트는 스켈레톤 프로젝트이다.

2. 핵심은 eureka와 zuul 이다.

3. 포트는 eureka:8761 / gateway:8080 / api 서비스:8090 로 설정되있다.

4. 부트는 eureka -> gateway -> 서비스 순으로 올린다.

5. local:8761 화면에서 현재 eureka가 가지고있는 인스턴스 정보를 확인할수있다. 

6. 동일한 서비스를 올리고싶다면 routes와 포트를 별도로 한개를 더 올리면 eureka에서 자동으로 잡아준다.



.gitignore 푸시까지해야 적용

참조
https://coe.gitbook.io/guide/service-discovery/eureka