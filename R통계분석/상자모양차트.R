A=c(110,300,150,280,310)
B=c(180,200,210,190,170)
C=c(210,150,260,210,70)
boxplot(A,B,C, col=c("yellow","cyan","green"),names=c("Baseball","Soccerball","Pingpongball"),horizontal=F)


dev.off()
data(iris)
plot(iris$Sepal.Width)
sepal.stat1=boxplot(iris$Sepal.Width)
sepal.stat1


sepal.stat2=boxplot(Sepal.Width ~ Species, data= iris, col=c("blue","green","red"),xlab="Iris Species")
 