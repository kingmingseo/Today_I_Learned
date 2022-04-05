install.packages("ggplot2")
library(ggplot2)
str5=c("Hell0","World","I","am","Minseo")
paste(str5, collapse =",")
paste(str5,collapse="")
x=c("a","b","c","d","e")
qplot(x)
qplot(data=mpg , x=hwy)
qplot(data=mpg , x=cty)
qplot(data=mpg , x=drv,y=hwy,geom="line")
qplot(data=mpg , x=drv,y=hwy,geom="boxplot")
qplot(data=mpg , x=drv,y=hwy,geom="boxplot",color=drv)
View(mpg)


score=c(80,60,70,50,90)
mean(score)
avg=mean(score)
avg
