x= seq(1,10,0.1)
y=exp(x)
plot(x,y,type="l",col="blue",lty=2)
exp(3)
title("Exponential value")
dev.off()
data(ToothGrowth)
head(ToothGrowth)
dim(ToothGrowth)
plot(ToothGrowth)


dev.off()
B_QTY=c(110,300,150,280,310)
S_QTY=c(180,200,210,190,170)
P_QTY=c(210,150,260,210,70)
B_TYPE=matrix(c(B_QTY,S_QTY,P_QTY),5,3)
B_TYPE
barplot((B_TYPE), main="Ball TYPE별 시즌 판매량",xlab="Ball TYPE",ylab="판매량",beside=T,names.arg=c("BASEBALL","SOCCERBALL","PINGPONGBALL"),border="blue",col=rainbow(5),ylim=c(0,400))

legend(1,400,c("Season A","Season B","Season C","Season D","Season E"),cex=0.5, fill = rainbow(5))


barplot(t(B_TYPE), main="시즌별 시즌 판매량",xlab="SEASON",ylab="판매량",beside=F,names.arg=c("A","B","C","D","E"),border="black",col=rainbow(3),ylim=c(0,1000))

legend(4.5,1000,c("BaseBall","Soccer Ball","PingpongBall"),cex=0.8, fill = rainbow(3))

