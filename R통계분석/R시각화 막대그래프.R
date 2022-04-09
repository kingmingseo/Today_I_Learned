B_QTY=c(110,300,150,280,130)
S_QTY=c(180,200,210,190,170)
P_QTY=c(210,150,260,270,70)
B_TYPE2=matrix(c(B_QTY,S_QTY,P_QTY),5,3)




barplot(B_TYPE2,main="Ball type별 시즌별 판매량",xlab="Ball type",ylab="판매량",beside=T,names.arg=c("BaseBall","SoccerBall","Pingpongball"),border="blue",col=rainbow(5),ylim=c(0,400))
legend(1,400,c("a","b","c","d","e"),cex = 0.5,fill=rainbow(5))



barplot(t(B_TYPE2),main="Season별 시즌별 판매량",xlab="Season",ylab="판매량",beside=T,names.arg=c("a","b","c","d","e"),border="blue",col=rainbow(3),ylim=c(0,400))
legend(16,400,c("Baseball","Soccerball","pingpongball"),cex = 0.8,fill=rainbow(3))





barplot(t(B_TYPE2),main="Season별 시즌별 판매량",xlab="Season",ylab="판매량",beside=F,names.arg=c("a","b","c","d","e"),border="blue",col=rainbow(3),ylim=c(0,1000))
legend(16,400,c("Baseball","Soccerball","pingpongball"),cex = 0.8,fill=rainbow(3))

boxplot(B_QTY,S_QTY,P_QTY)

