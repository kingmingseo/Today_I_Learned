library(dplyr)
library(ggplot2)
View(mpg)
# Q1
low_four=mpg%>%filter(displ<=4)
mean(low_four$hwy)
over_five=mpg%>%filter(displ>=5)
mean(over_five$hwy)

#해석: 배기량이 4이하인 차들과 배기량이 5이상인 차들을 각각의 데이터 프레임으로 또다른 변수에 할당해 각각의 hwy 평균을 구해서 비교했다.
#정답: 배기량이 4이하인 자동차의 고속도로 연비가 더 높다 

#Q2
America_car=mpg%>%filter(manufacturer%in%c("chevorlet","dodge","ford","lincoln"))
Japan_car=mpg%>%filter(manufacturer%in%c("honda","nissan","subaru","toyota"))
America_car$AVG=(America_car$cty+America_car$hwy)/2
Japan_car$AVG=(Japan_car$cty+Japan_car$hwy)/2
mean(America_car$AVG)
mean(Japan_car$AVG)

#해석: 일본차량만 들어있는 데이터프레임과 미국 차량만 든 데이터 프레임을 따로 생성, 각 데이터 프레임에 총합 연비를 파생변수로 추가한 뒤 mean()함수를 통해 각각의 연비를 비교했다.
#정답: 일본차량의 연비가 더 높다.

#Q3
mpg%>%group_by(manufacturer,model)%>%summarise(AVG=(hwy+cty)/2)%>%arrange(desc(AVG))%>%head(1)

#해석: 모든차량에서 제조사와 모델명만 group_by 시킨뒤 summarise를 통해 통합연비를 요약 그리고 그 연비를 내림차순 정렬하고 첫번째 행을 출력.
#정답: 그 결과 폭스바겐의 new beetle 차량이 39.5의 연비로 가장 높다는 것을 알 수 있었다. 
