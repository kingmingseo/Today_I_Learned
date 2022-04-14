ggplot(data=mpg,aes(x=displ,y=hwy))+geom_point()+xlim(3,6)+ylim(10,30)
 library(ggplot2)
library(dplyr)
boxplot(mpg$hwy)$stats
factor(mpg$cyl)
 
ggplot(data=economics,aes(x=date,y=unemploy))+geom_line(col="red")


qplot(age,circumference, data=Orange,geom="line",color=Tree,main="김민서서")

View(Orange)

