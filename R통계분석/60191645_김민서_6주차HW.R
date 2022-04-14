library(ggplot2)
library(dplyr)
factor(mpg$cyl)

df=boxplot(hwy~cyl,data=mpg,col=rainbow(4),xlab="cyl")
df$stats
df



df=ggplot(data=mpg,aes(x=as.factor(cyl),y=hwy,fill=as.factor(cyl)))+geom_boxplot()+xlab("cyl")+labs(fill="cyl")
df


df2=ggplot(data=mpg,aes(x=cty,y=hwy))+geom_point(alpha=0.2)
df2

mpg_temp=mpg %>% filter(class=="compact") %>% group_by(manufacturer) %>% summarise(mean_hwy=mean(hwy)) 

df3=ggplot(data=mpg_temp,aes(x=reorder(manufacturer,-mean_hwy),y=mean_hwy,fill=manufacturer))+geom_col()
df3


df=ggplot(data=mpg,aes(x=as.factor(cyl),y=cty,fill=as.factor(cyl)))+geom_boxplot()+xlab("cyl")
df
