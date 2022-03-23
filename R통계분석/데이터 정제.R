test1=data.frame(Gender=c("M","F",NA,"M","F" ),Score=c(5,4,3,4,NA))
table(is.na(test1$Gender))
table(is.na(test1$Score))

new_test=test1%>%filter(!is.na(Gender))
new_test=test1%>%filter(!is.na(Score))
new_test=test1%>%filter(!is.na(Score)&!is.na(Gender))
new_test

new_test2=na.omit(new_test)
new_test2

mean(test1$Score,na.rm=T) #결측치 제거 평균산출
sum(test1$Score,na.rm=T)#결측치 제거 합계 산출
test1%>%summarise(mean_score=mean(Score,na.rm=T))

test1$Score
#결측치를 평균값으로 대체
test1$Score=ifelse(is.na(test1$Score),mean(test1$Score,na.rm=T),test1$Score)
test1$Score



#이상치 제거
outlier=data.frame(gender=c(1,1,2,3,1,2),score=c(90,80,70,60,50,600))
outlier
outlier$gender=ifelse(outlier$gender>=3,NA,outlier$gender)
outlier$score=ifelse(outlier$score>100,NA,outlier$score)
outlier%>%filter(!is.na(gender)&!is.na(score))%>%group_by(gender)%>%summarise(mean_score=mean(score))
