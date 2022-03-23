
library(dplyr)
attach(exam)
getwd()
setwd("C:/Users/Administrator/Documents/Today_I_Learned/R통계분석")
exam=read.csv("exam.csv", header = T)
exam=exam%>%mutate(total=math+english+science,mean=(math+science+english)/3,test= ifelse(science>=60,"pass","fail")
)
exam%>%arrange(desc(total)) %>% head(5)

exam%>%group_by(class)%>%summarise(mean_math=mean(math),sum_math=sum(math), median_math=median(math), n=n())
exam
        