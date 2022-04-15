library(ggplot2)
library(dplyr)
factor(mpg$cyl)




#1 박스플롯으로 각 실린더 별 차량의 전체적인 분포도를 확인한 결과 대체적으로 실린더가 적은 차량일수록 고속도로 연비가 높았다.

ggplot(data=mpg,aes(x=as.factor(cyl),y=hwy,fill=as.factor(cyl)))+geom_boxplot()+xlab("cyl")+labs(fill="cyl")


#2 도시연비가 높은 차량일수록 고속도로연비 또한 일반적으로 높아지는 것을 확인할 수 있다.
ggplot(data=mpg,aes(x=cty,y=hwy))+geom_point(alpha=0.2)

#3
mpg_temp=mpg %>% filter(class=="compact") %>% group_by(manufacturer) %>% summarise(mean_hwy=mean(hwy)) 

df3=ggplot(data=mpg_temp,aes(x=reorder(manufacturer,-mean_hwy),y=mean_hwy,fill=manufacturer))+geom_col()+xlab("manufacturer")


#4 상자그림의 분포 해석에는 ggplot사용보다는 내장함수 사용이 유리하다 판단했다. 
boxplot(cty~cyl,data=mpg)

#stats 를 통해  요약 통계량을 확인 할 수 있다. (lower whisker, lower hinge, 중앙값, upper hinge, upper whisker)  이 순서대로 각 실린더 마다 1행부터 5행까지 정리 된것을 볼 수있다. 
boxplot(cty~cyl,data=mpg)$stats
#4개의 실린더를 가진 차량의 극단치 를 출력해보자

mpg %>% filter(cyl==4) %>% arrange(desc(cty)) %>% head()
#극단치 값은 35 33 29 28 인것을 확인 할 수 있다.


