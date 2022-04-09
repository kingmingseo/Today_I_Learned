sepal.Stat2=boxplot(Sepal.Width~Species,data=iris,col=rainbow(3),xlab="Iris Species",notch=T)

boxplot_hist=layout(matrix(c(1,2,2),3,1,byrow=T))
layout.show(boxplot_hist)

boxplot(iris$Sepal.Length,horizontal = T,col="green1")
hist(iris$Sepal.Length,xlim=c(4,8),col="pink",freq=F)
lines(density(iris$Sepal.Length))
dev.off()
