## 요구사항

[입출금 목록이 담긴 csv 텍스트 파일](https://github.com/jisupark123/Real-World-Software-Development/blob/main/src/main/resources/bank-data-simple.csv)을 읽어서 다음 항목을 분석.

1. 은행 입출금 내역의 총 수입과 총 지출은 각각 얼마인가? 결과가 양수인가 음수인가?
2. 특정 달엔 몇 건의 입출금 내역이 발생했는가?
3. 지출이 가장 높은 상위 10건은 무엇인가?
4. 돈을 가장 많이 소비하는 항목은 무엇인가?

## 단일 책임 원칙 (Single Responsibility Principle)

- 클래스는 단 하나의 책임만 가져야 한다.
- 클래스가 변경되어야 하는 이유는 오직 하나여야 한다.

## 기능을 개별로 분리

1. 입력 읽기
2. 주어진 형식의 입력 파싱
3. 결과 처리
4. 결과 요약 리포트

(2장에서는 파싱과 관련된 기능에 집중)