library(dplyr)
library(tidyr)


getwd()
setwd("C:/Users/Administrator/Documents/Today_I_Learned/R통계분석")
data=read.csv("test_data.csv",header=T)
View(data)
str(data)
names(data)=c("Time","Division","Particulates","Ultra_Particulates")
new_data=na.omit(data)
div_partuculates=new_data%>%group_by(Division)%>%summarise(mean_Particulates=mean(Particulates),mid_Particulates=median(Particulates),max_Particulates=max(Particulates))
div_Ultra=new_data%>%group_by(Division)%>%summarise(mean_Ultra=mean(Ultra_Particulates),mid_Ultra=median(Ultra_Particulates),max_Ultra=max(Ultra_Particulates))
div_partuculates
div_Ultra


div_partuculates%>%arrange(desc(mean_Particulates))%>%head(1)

#해석 : 우선 데이터에 NA값이 존재해서 NA값으 존재하는 행은 모두 계산에서 배제하기 위해 na.omit() 함수를 활용했다. 그 뒤 미세먼지와 초미세먼지에 대한 tibble을 따로 만들었다           먼저 group_by 함수를 이용해 각 구별로 구분짓고 summarise함수를 통해 각 구마다 최대값 중앙값 평균값을 구했다.
#       그 뒤 미세먼지 tibble에서 미세먼지 평균에 대한 row를 arrange함수를 통해 내림차순 정렬 한뒤 가장 앞의 값을 출력했다.
#정답 : 서초구가 미세먼지의 평균값이 가장 높다.

new_data%>%select(Time,Division,Particulates)%>%arrange(desc(Particulates))%>%head(1)
 
#해석 : 결측치를 제거한 new_data에서 초미세먼지에 대한 정보를 제외하고 일시와 장소 미세먼지에대한 정보만 select후 미세먼지가 높은순으로 정렬 한뒤 첫번째 값만 출력했다.
#정답 : 2021-05-08 1:00 중구
options(max.print=99999999)
new_data%>%select(Time,Division,Ultra_Particulates)%>%arrange(Ultra_Particulates)
#해석 : 결측치를 제거한 new_data에서 미세먼지에 대한 정보를 제외하고 일시와 장소 초미세먼지에 대한 정보만 select한 후 초미세먼지를 기준으로 오름차순 정렬을 했다. 
#결과 : 초미세먼지 측정값의 최저치가 "1"인 일시와 지역이 너무 많다. 출력제한을 해제한뒤 출력한 결과 3333번의 일시가 최저치로 측정되었다.

