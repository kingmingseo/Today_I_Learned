df=data.frame(sex=c("M","F",NA,"M","F"),
            score=c(5,4,3,4,NA))
df
is.na(df)
table(is.na(df))
table(is.na(df$score))
mean(df)
df %>% filter(!is.na(score)&!is.na(sex))

exam=read.csv("csv_exam.csv")
exam[c(3,8,15),"math"]=NA
exam

exam %>% summarise(mean_math=mean(math))
exam %>% summarise(mean_math=mean(math,na.rm=T))

mean(exam$math,na.rm=T)

exam$math=ifelse(is.na(exam$math),55,exam$math)
table(is.na(exam$math))



mpg_new=as.data.frame(mpg)
mpg_new[c(65,124,131,153,212),"hwy"]=NA

table(is.na(mpg_new$drv))
table(is.na(mpg_new$hwy))
mpg_new %>% group_by(drv) %>% summarise(hwy=mean(hwy,na.rm=T))

mpg_new %>% filter(!is.na(mpg_new$hwy)) %>%  group_by(drv) %>% summarise(hwy=mean(hwy))
